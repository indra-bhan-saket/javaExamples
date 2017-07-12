package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonWithSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SingletonSerialization instance = SingletonSerialization.getInstance();
		FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(instance);
		objectOutputStream.flush();
		objectOutputStream.close();
		System.out.println("Serialisation done");
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Test.txt"));
		SingletonSerialization newInstance = (SingletonSerialization) objectInputStream.readObject();
		//newInstance = (SingletonSerialization) objectInputStream.readObject();

	}

}

class SingletonSerialization implements Serializable{
	
	private static SingletonSerialization instance = new SingletonSerialization();
	
	private SingletonSerialization() {
		System.out.println("constructur called");
	}
	
	
	public static SingletonSerialization getInstance() {
		return instance;
	}
	
}
