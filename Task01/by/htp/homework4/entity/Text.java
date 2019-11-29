package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Text {

	private Phrase title;
	private List<Word> body;

	public Text() {
	}

	public Text(Phrase title, List<Word> body) {
		this.title = title;
		this.body = body;
	}

	public Phrase getTitle() {
		return title;
	}

	public void addBody(List<Word> words) {
		this.body.addAll(words);
	}

	public void addBody(Word word) {
		this.body.add(word);
	}

	public void setTitle(Phrase title) {
		this.title = title;
	}

	public List<Word> getBody() {
		return body;
	}

	public void setBody(List<Word> body) {
		this.body = body;
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
