package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Note;
import com.example.demo.services.NoteServices;


@Controller
public class NoteController {
	@Autowired
    private NoteServices noteservice;

    @RequestMapping("/")
    public ModelAndView returnUserForm(Model model) {
    	List<Note> notes = noteservice.listAll();
        ModelAndView mv=  new ModelAndView("index.jsp");
        mv.getModelMap().addAttribute("notes", notes);
        return mv;
    }

    @RequestMapping("/newNote")
    public String NewNote(Model model) {
        model.addAttribute("note",new Note());
        return "newNote.jsp";
    }

    @RequestMapping({"/saveNote","/edit/saveNote"})
    public String saveNote(Note note) {
    	Date d=new Date();
    	SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy hh:mm");
    	String str[]=(sdf.format(d)).split(" ");
    	note.setCdate(str[0]);
    	note.setCtime(str[1]);
    	noteservice.save(note);
        return "redirect:/";
    }
    
    @RequestMapping("/edit/{noteid}")
    public ModelAndView EditNote(@PathVariable(name="noteid") long noteid) {
        ModelAndView mv=new ModelAndView("/newNote.jsp");
        Note note=noteservice.get(noteid);
        mv.getModelMap().addAttribute("note", note);
        return mv;
    }
    
    @RequestMapping("/delete/{noteid}")
    public String deleteNote(@PathVariable(name="noteid") long noteid) {
    	noteservice.delete(noteid);
        return "redirect:/";
    }
}