package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Phrase {

	private List<Word> phrase;
	
	public Phrase() {
		
	}
	
	public Phrase(List<Word> phrase) {
		this.phrase = phrase;
	}

	public List<Word> getPhrase() {
		return phrase;
	}

	public void setPhrase(List<Word> phrase) {
		this.phrase = phrase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(phrase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phrase other = (Phrase) obj;
		return Objects.equals(phrase, other.phrase);
	}

	@Override
	public String toString() {
		return "Phrase [phrase=" + phrase + "]";
	}
	
}
