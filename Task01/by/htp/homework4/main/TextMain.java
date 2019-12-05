package by.htp.homework4.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework4.entity.Sentence;
import by.htp.homework4.entity.Text;
import by.htp.homework4.entity.Word;
import by.htp.homework4.view.TextPrinter;

public class TextMain {

	public static void main(String[] args) {

		List<Word> wordsPhrase = new ArrayList<Word>();
		wordsPhrase.add(new Word("Title. "));
		wordsPhrase.add(new Word("phrase"));

		Sentence phrase = new Sentence(wordsPhrase);

		List<Sentence> wordsBody = new ArrayList<Sentence>();
		wordsBody.add(phrase);
		wordsBody.add(phrase);

		Text text = new Text(phrase, wordsBody);
		TextPrinter print = new TextPrinter();

		print.printTitle(text);
		print.printBody(text);

		text.addBody(phrase);
		print.printBody(text);

	}

}
