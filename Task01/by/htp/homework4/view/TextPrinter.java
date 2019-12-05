package by.htp.homework4.view;

import by.htp.homework4.entity.Text;

public class TextPrinter {

	public void printTitle(Text text) {
		text.getTitle().getSentence().forEach(arg -> System.out.print(arg.getWord()));
		System.out.println();
	}

	public void printBody(Text text) {
		text.getBody().forEach(arg -> arg.getSentence().forEach(args -> System.out.println(args.getWord())));
		System.out.println();
	}

}
