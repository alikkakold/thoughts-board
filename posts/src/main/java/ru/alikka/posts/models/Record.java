package ru.alikka.posts.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Record {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nickname;
	private String text;
	private Integer likes;

	@OneToMany(mappedBy = "record")
	private Set<Comment> comments;

	public Record() {
	}

	public Record(String nickname, String text) {
		this.nickname = nickname;
		this.text = text;
		this.likes = 0;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
