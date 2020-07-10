package com.observerDesignPattern;

public class GamePiece implements IObserver {
		
	private static int seed = 0;
	private final int id;
	
	public GamePiece() {
		id = seed++;
	}
	
	public void update() {
//		System.out.println("I am jumping");
		System.out.println("Character " + id + " jumped!");
	}

//	@Override
//	public void update(String input) {
//		System.out.println("Character" + id + " jumped!");
//		
//	}

}
