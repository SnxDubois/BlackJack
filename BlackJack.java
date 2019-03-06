import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

class BlackJack { 
	//Methode pour tirer une carte aléatoirement(random)//
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

		System.out.println("Joueur1 décidez vous de prendre une carte? 1 : oui / 2 : non ");

		Scanner myObj = new Scanner(System.in);		
		int userInput = myObj.nextInt();
		
		

		
		if (userInput == 1) {
			int thirdCardPlayerHand = (int)(getCard(1,10));
			System.out.println(thirdCardPlayerHand);
			int instantHand = (startPlayerHand + thirdCardPlayerHand);
			System.out.println("Votre main est de " + instantHand + " points.");
		

		} else {
			System.out.println("Pas de nouvelle carte");
		}
		
		
	}

	



}
	

	






