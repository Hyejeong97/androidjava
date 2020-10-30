package com.mega.mvc05;

public class BbsVO {
	private String title;
	private String content;
	private String writer;
	
	@Override
	public String toString() {
		return "BbsVO [title=" + title + ", content=" + content + ", writer=" + writer + ", getTitle()=" + getTitle()
				+ ", getContent()=" + getContent() + ", getWriter()=" + getWriter() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
