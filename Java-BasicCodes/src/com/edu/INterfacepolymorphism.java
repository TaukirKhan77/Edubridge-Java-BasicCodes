package com.edu;
interface Playable{
	void play();
}
class Guitar implements Playable{
	

public void play() {
	System.out.println("Playing Guitar");
}
}
class Piano implements Playable{
	
	public void play(){
		System.out.println("Playing Piano");
		}
	}
public class INterfacepolymorphism {
	public static void main(String[] args) {
		Playable myGuitar =new Guitar();
		Playable myPiano =new Piano();
		
		myGuitar.play();
		myPiano.play();
	}

}
