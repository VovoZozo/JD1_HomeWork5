package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Text {

	private Sentence title;
	private List<Sentence> body;

	public Text() {
	}

	public Text(Sentence title, List<Sentence> body) {
		this.title = title;
		this.body = body;
	}

	public void addBody(List<Sentence> sentences) {
		this.body.addAll(sentences);
	}

	public void addBody(Sentence sentence) {
		this.body.add(sentence);
	}

	public void setTitle(Sentence title) {
		this.title = title;
	}

	public Sentence getTitle() {
		return title;
	}

	public void setBody(List<Sentence> body) {
		this.body = body;
	}

	public List<Sentence> getBody() {
		return body;
	}

	@Override
	public int hashCode() {
		return Objects.hash(body, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		return Objects.equals(body, other.body) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", body=" + body + "]";
	}

}
