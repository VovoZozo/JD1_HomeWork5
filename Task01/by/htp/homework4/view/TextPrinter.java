package by.htp.homework4.view;

import by.htp.homework4.entity.Text;

public class TextPrinter {

	public void printTitle(Text text) {
		text.getTitle().getPhrase().forEach(arg -> System.out.print(arg.getWord()));
		System.out.println();
	}

	public void printBody(Text text) {
		text.getBody().forEach(arg -> System.out.print(arg.getWord()));
		System.out.println();
	}

}
