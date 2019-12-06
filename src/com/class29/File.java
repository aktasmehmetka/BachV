package com.class29;

public abstract class File {

	/*
	 * Create a class File that will have the following behaviors: open, edit,
	 * close. Edit and close are implemented method while open is an abstract.
	 * Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific
	 * implementation of open behaviour: Example: to open .java file we need
	 * notepad++ or sublime text, to open .doc file we need Microsoft word to be
	 * installed etc
	 * 
	 */

	public void open() {
		System.out.println("open files");

	}

	public void edit() {

		System.out.println("edit files");
	}

	public abstract void close();
}

class JavaFile extends File {

	@Override
	public void close() {
		System.out.println("We need notepad++ ");

	}

}

class WordFile extends File {

	@Override
	public void close() {
		System.out.println("we need Microsoft office");

	}

}

class PDFFile extends File {

	@Override
	public void close() {
		System.out.println("we need adobe reader");

	}

}