package com.lu;

import javax.swing.text.StyledEditorKit.StyledTextAction;

public class SingleObject {
	private static SingleObject instanceObject = new SingleObject();

	private SingleObject() {
	}

	public static SingleObject getInstance() {
		return instanceObject;

	}

	public void showMessage() {
		System.out.println("hello world");
	}

}
