package com.ragu.learn.java;
import java.util.*;

public class InheritanceDemo {

	public static void main(String[] args) {
		DAO d = new MongoDataBase();
		d.connectDataBase();
		List l = new ArrayList();
	}
}

interface DAO {
	public abstract void connectDataBase();
}

class MSSQLDataBase implements DAO {
	public void connectDataBase() {
		System.out.println("using microsoft database...!");
	}
}

class MongoDataBase implements DAO {
	public void connectDataBase() {
		System.out.println("using mongo db --nosql");
	}
}