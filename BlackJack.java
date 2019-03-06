import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

class BlackJack {

	public static double getCard (double min , double max){
	
	double card = (int)(Math.random()*((10 - 1)+1))+1;
	
	
	return card;

	}

	public static void main(String[] args) {
		int firstCardPlayerHand = (int)(getCard(1,10));
		int secondCardPlayerHand = (int)(getCard(1,10));
		int startPlayerHand = (firstCardPlayerHand + secondCardPlayerHand);
		System.out.println(firstCardPlayerHand);
		System.out.println(secondCardPlayerHand);
		System.out.println(startPlayerHand);

		int firstCardBankHand = (int)(getCard(1,10));
		int secondCardBankHand = (int)(getCard(1,10));
		int startBankHand = (firstCardBankHand + secondCardBankHand);
		System.out.println(firstCardBankHand);
		System.out.println(secondCardBankHand);
		System.out.println(startBankHand);
		
	}






}
