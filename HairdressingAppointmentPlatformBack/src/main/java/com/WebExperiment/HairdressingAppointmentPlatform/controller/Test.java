package com.WebExperiment.HairdressingAppointmentPlatform.controller;

import java.util.Date;
import java.util.UUID;

public class Test {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(UUID.randomUUID());
	}

}
class Rabbit{
	public String height;
	public void eat() {
		System.out.println("我在想吃");
	}
	public Rabbit(String height) {
		super();
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rabbit [height=" + height + "]";
	}
	
}