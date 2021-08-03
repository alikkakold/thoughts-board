package ru.alikka.posts.models;

import javax.persistence.*;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nickname;
	private String text;

	@ManyToOne
	@JoinColumn(name="record_id", nullable=false)
	private Record record;

	public Comment () {};

	public Comment(Record record, String nickname, String text) {
		this.record = record;
		this.nickname = nickname;
		this.text = text;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
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
