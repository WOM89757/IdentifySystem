package com.xajzdx.pojo;

import java.util.Date;

public class Blog {
	private int id;
	private int kid;
	private int uid;
	private String title;
	private String schema;
	private String content;
	private int clicks;
	private Date datatime;
	
	
	
	public Blog() {
		super();
	}
	
	
	public Blog(int uid, String title, int clicks, Date datatime) {
		super();
		this.uid = uid;
		this.title = title;
		this.clicks = clicks;
		this.datatime = datatime;
	}


	public Blog(int id, int kid, int uid, String title, String schema, String content, int clicks, Date datatime) {
		super();
		this.id = id;
		this.kid = kid;
		this.uid = uid;
		this.title = title;
		this.schema = schema;
		this.content = content;
		this.clicks = clicks;
		this.datatime = datatime;
	}





	public Blog(int uid, String title, String schema, String content, Date datatime) {
		super();
		this.uid = uid;
		this.title = title;
		this.schema = schema;
		this.content = content;
		this.datatime = datatime;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getClicks() {
		return clicks;
	}
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	public Date getDatatime() {
		return datatime;
	}
	public void setDatatime(Date datatime) {
		this.datatime = datatime;
	}
	
	
	

}
