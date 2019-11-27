package by.htp.homework4.entity;

import java.util.Objects;

public class Text {

	private String title;
	private String body;

	public Text() {
		this.title = "Empty";
		this.body = "Empty";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(Word word) {
		this.title = word.getWord();
	}

	public void setTitle(Phrase phrase) {
		this.title = phrase.getPhrase();
	}

	public String getBody() {
		return body;
	}

	public void setBody(Word word) {
		this.body = word.getWord();
	}

	public void setBody(Phrase phrase) {
		this.body = phrase.getPhrase();
	}

	public void addTitle(Word word) {
		this.title += word.getWord();
	}

	public void addTitle(Phrase phrase) {
		this.title += phrase.getPhrase();
	}

	public void addBody(Word word) {
		this.body += word.getWord();
	}

	public void addBody(Phrase phrase) {
		this.body += phrase.getPhrase();
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

}
