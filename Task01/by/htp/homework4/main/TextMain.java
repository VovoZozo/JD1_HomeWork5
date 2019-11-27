package by.htp.homework4.main;

import by.htp.homework4.entity.Phrase;
import by.htp.homework4.entity.Text;
import by.htp.homework4.entity.Word;
import by.htp.homework4.view.TextPrinter;

public class TextMain {

	public static void main(String[] args) {

		Word word = new Word("Title. ");

		Text text = new Text();
		text.setTitle(word);

		word.setWord("Body. ");
		text.setBody(word);

		Phrase phrase = new Phrase("This title set by Phrase! ");
		text.addTitle(phrase);

		phrase.setPhrase("This body set by Phrase! ");
		text.addBody(phrase);

		TextPrinter print = new TextPrinter();

		print.printTitle(text);
		print.printBody(text);

	}

}
