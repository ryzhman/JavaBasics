package com.go2it.edu.classes;

/**
 * @author Alex Ryzhkov
 */
public class Boat {
	private double volume;
	private double speed;
	private boolean hasSail;
	private boolean hasEngine;
	private int numberOfRoom;
	private String title;
	private String country;

	public String getTitle(){
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isHasSail() {
		return this.hasSail;
	}

	public void setHasSail(boolean hasSail) {
		this.hasSail = hasSail;
	}

//	public Boat(String title){
//		this.title = title;
//	}
//
//	public Boat(){
//	}



}
