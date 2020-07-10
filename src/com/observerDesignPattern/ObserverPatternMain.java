package com.observerDesignPattern; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ObserverPatternMain {
	
	public static void main(String[] args) throws Exception {
		
		SpaceBarHandler handler = new SpaceBarHandler();
		List<GamePiece> pieces = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
//			System.out.println("I am inside for loop! ");
			GamePiece piece = new GamePiece();
			if(i % 2 == 0) {
//				System.out.println("I am inside if condition ");
				handler.registerObserver(piece);
			}
		}
		
		
//		 KeyboardCommandHandler keyboardHandler = new KeyboardCommandHandler();	 
//		 keyboardHandler.registerObserver(handler);
		
		//TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		
		
		while(!(input = br.readLine()).toLowerCase().equals("exit")) {
//			System.out.println("Space entered: " + br);
			handler.readInput(input);
//			keyboardHandler.readInput(input);
		}
	}
}
