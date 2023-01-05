package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="note")
public class Note {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long noteid;
	@Column(name="ntitle")
	private String ntitle;
	@Column(name="ncon", columnDefinition="LONGTEXT" )
	private String ncon;
	@Column(name="ctime", nullable=false)
	private String ctime;
	@Column(name="cdate", nullable=false)
	private String cdate;

	public Note()
	{
		
	}
	
	
	public Note(Long noteid, String ntitle, String ncon, String ctime, String cdate) {
		super();
		this.noteid = noteid;
		this.ntitle = ntitle;
		this.ncon = ncon;
		this.ctime = ctime;
		this.cdate = cdate;
	}


	public String getCdate() {
		return cdate;
	}


	public void setCdate(String cdate) {
		this.cdate = cdate;
	}


	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public Long getNoteid() {
		return noteid;
	}
	public void setNoteid(Long noteid) {
		this.noteid = noteid;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNcon() {
		return ncon;
	}
	public void setNcon(String ncon) {
		this.ncon = ncon;
	}
}