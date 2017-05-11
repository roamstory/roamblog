package net.helloworld.posts;

public class Post {
	private int index;
	private String title;
	private String posts;
	private String regdate;
	private String regwriter;
	private String strapline;
	
	public Post(int index, String title, String posts) {
		super();
		this.index = index;
		this.title = title;
		this.posts = posts;
	}
	
	public Post(int index, String title, String posts, String regdate, String regwriter, String strapline) {
		super();
		this.index = index;
		this.title = title;
		this.posts = posts;
		this.regdate = regdate;
		this.regwriter = regwriter;
		this.strapline = strapline;
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

	public String getPosts() {
		return posts;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getRegwriter() {
		return regwriter;
	}

	public void setRegwriter(String regwriter) {
		this.regwriter = regwriter;
	}

	public String getStrapline() {
		return strapline;
	}

	public void setStrapline(String strapline) {
		this.strapline = strapline;
	}

	@Override
	public String toString() {
		return "Post [index=" + index + ", title=" + title + ", posts=" + posts + ", regdate=" + regdate
				+ ", regwriter=" + regwriter + ", strapline=" + strapline + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + index;
		result = prime * result + ((posts == null) ? 0 : posts.hashCode());
		result = prime * result + ((regdate == null) ? 0 : regdate.hashCode());
		result = prime * result + ((regwriter == null) ? 0 : regwriter.hashCode());
		result = prime * result + ((strapline == null) ? 0 : strapline.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (index != other.index)
			return false;
		if (posts == null) {
			if (other.posts != null)
				return false;
		} else if (!posts.equals(other.posts))
			return false;
		if (regdate == null) {
			if (other.regdate != null)
				return false;
		} else if (!regdate.equals(other.regdate))
			return false;
		if (regwriter == null) {
			if (other.regwriter != null)
				return false;
		} else if (!regwriter.equals(other.regwriter))
			return false;
		if (strapline == null) {
			if (other.strapline != null)
				return false;
		} else if (!strapline.equals(other.strapline))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	


}
