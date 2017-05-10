package net.helloworld.posts;

public class Post {
	private int index;
	private String title;
	private String post;
	
	public Post(int index, String title, String post) {
		super();
		this.index = index;
		this.title = title;
		this.post = post;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Post [index=" + index + ", title=" + title + ", post=" + post + "]";
	}
	
	
	
	

}
