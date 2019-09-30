package com.go2it.edu.exceptions;

import java.io.FileNotFoundException;

/**
 * @author Alex Ryzhkov
 */
public class ClassToThrowException {
	private String title;

	public ClassToThrowException(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws FileNotFoundException {
		if (title == null || title.isEmpty()) {
//			throw new IllegalArgumentException("The title was empty, couldn't set it up");
			throw new FileNotFoundException("Some random exception");
		}
		this.title = title;
	}
}
