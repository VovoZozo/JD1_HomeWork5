package by.htp.homework4.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework4.entity.Phrase;
import by.htp.homework4.entity.Text;
import by.htp.homework4.entity.Word;
import by.htp.homework4.view.TextPrinter;

public class TextMain {

	public static void main(String[] args) {

		List<Word> wordsPhrase = new ArrayList<Word>();
		wordsPhrase.add(new Word("Title. "));
		wordsPhrase.add(new Word("phrase"));

		Phrase phrase = new Phrase(wordsPhrase);

		List<Word> wordsBody = new ArrayList<Word>();
		wordsBody.add(new Word("Body. "));
		wordsBody.add(new Word("List<Word>"));

		Text text = new Text(phrase, wordsBody);
		TextPrinter print = new TextPrinter();

		print.printTitle(text);
		print.printBody(text);

		text.addBody(new Word(" add"));
		print.printBody(text);

	}

}
