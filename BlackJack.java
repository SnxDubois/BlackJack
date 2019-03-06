import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

class BlackJack {

	public static double getCard (double min , double max){
	
	double card = (int)(Math.random()*((10 - 1)+1))+1;

	
	
	return card;

	}

	public static void main(String[] args) {
		int firstCard = (int)(getCard(1,10));
		System.out.println(firstCard);
			
		
	
	}






}
