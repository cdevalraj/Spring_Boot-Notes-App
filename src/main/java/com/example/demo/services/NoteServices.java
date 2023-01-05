package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Note;
import com.example.demo.repository.NoteRepo;

@Service
public class NoteServices {
	
	@Autowired
	private NoteRepo nr;
	public List<Note> listAll()
	{
	    return nr.findAll();
	}
	
	public void save(Note std)
	{
	    nr.save(std);
	}
	
	public Note get(long id)
	{
	    return nr.findById(id).get();
	}
	
	public void delete(long id)
	{
	    nr.deleteById(id);
	}
}