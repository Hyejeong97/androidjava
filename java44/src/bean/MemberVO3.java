package bean;

public class MemberVO3 {
	//private라고 쓰면, 이 클래스내에서만 변수에 접근해서 쓸 수 있음.
	private String title; 
	private String pubDate;
	private String link;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	
	}
