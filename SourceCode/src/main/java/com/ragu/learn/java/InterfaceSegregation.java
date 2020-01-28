package com.ragu.learn.java;

public class InterfaceSegregation {

	public static void main(String[] args) {
		Developer ragu = new Developer();
		ragu.readData();
		ragu.writeData();
	}
}

interface Data {
	void readData();
	void writeData();
}

interface Read {
	void readData();
}

interface Write {
	void writeData();
}

class Reporter implements Read {
	public void readData() {

	}
	public void writeData() {

	}
}

class Developer implements Read, Write {
	public void readData() {
	}
	public void writeData() {
	}
}