package com.lionbridge.training.assignment.inheritance.file;

public class Text extends File{
    public void textFile() {
    	System.out.println("Text File is a child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text text=new Text();
		text.fileType();
		text.textFile();
		System.out.println("----------------------------------------");
		Binary binary=new Binary();
		binary.binaryFileType();

	}

}
