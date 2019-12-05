package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Sentence {

	private List<Word> sentence;
	
	public Sentence() {
		
	}
	
	public Sentence (List<Word> sentence) {
		this.sentence = sentence;
	}
	
	public void addWord(Word word) {
		this.sentence.add(word);
	}
	
	public void addWord(int index, Word word) {
		this.sentence.add(index, word);
	}
	
	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> phrase) {
		this.sentence = phrase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sentence);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		return Objects.equals(sentence, other.sentence);
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}
	
}
