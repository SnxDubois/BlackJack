import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

class BlackJack { 
	//Methode pour tirer une carte aléatoirement(random)//
	public static double getCard (double min , double max){
	
		double card = (int)(Math.random()*((max - min)+1))+min;
	
	
		return card;

	}
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);	
		String userName;
		System.out.println("Entrez votre prénom");	
		userName = myObj.nextLine();
		System.out.println("Bonjour " + userName + ", la partie commence");
		
		
		
		int firstCardPlayerHand = (int)(getCard(1,10));
		int secondCardPlayerHand = (int)(getCard(1,10));
		int startPlayerHand = (firstCardPlayerHand + secondCardPlayerHand);
		System.out.println("Votre premiére carte est " + firstCardPlayerHand);
		System.out.println("Votre seconde carte est " + secondCardPlayerHand);
		System.out.println("Votre main s'éléve à " + startPlayerHand);

		int firstCardBankHand = (int)(getCard(1,10));
		int secondCardBankHand = (int)(getCard(1,10));
		int startBankHand = (firstCardBankHand + secondCardBankHand);
		//System.out.println(firstCardBankHand);
		System.out.println("La banque a pioché sa premiére carte qui est un " + firstCardBankHand);
		System.out.println("La banque a pioché une deuxiéme carte que vous verrez une fois que les jeux sont faits");

		pickCard(startPlayerHand, startBankHand ); // on demande au joueur de piocher une premiére carte s'il le souhaite
				
		
		
	}

	public static void pickCard(int currentPlayerScore, int currentBankScore) {
	
		System.out.println(" décidez vous de prendre une carte? 1 : oui / 2 : non ");

		Scanner myObj = new Scanner(System.in);		
		int userInput = myObj.nextInt();
		
		if (userInput == 1) {				
			
			int nextCardPlayerHand = (int)(getCard(1,10));
			System.out.println(nextCardPlayerHand);
			int newPlayerHand = currentPlayerScore + nextCardPlayerHand;
			System.out.println("Votre main est desormais de " + newPlayerHand);
			//newPlayerHand = 21;
			if (newPlayerHand > 21) {
				System.out.println("Votre main est donc supérieure à 21, vous avez perdu");
			} else if (newPlayerHand == 21) {
				System.out.println("Black Jack! Vous avez gagné!!!$$$$$$$");

			} else {
				pickCard(newPlayerHand , currentBankScore);
			}

		} else {
			System.out.println("Votre main finale est de " + currentPlayerScore);
			pickAutoCardBank(currentBankScore , currentPlayerScore);
			
		}

	}


	public static void pickAutoCardBank(int currentBankScore , int currentPlayerScore){

		if (currentBankScore < 16 && currentBankScore < currentPlayerScore) {				
			
			int nextCardBankHand = (int)(getCard(1,10));
			System.out.println(nextCardBankHand);
			int newBankHand = currentBankScore + nextCardBankHand;
			System.out.println("La main de la banque est desormais de " + newBankHand);
			//newPlayerHand = 21;
			if (newBankHand > 21) {
				System.out.println("La main de la banque est donc supérieure à 21, vous avez gagné");
			} else if (newBankHand == 21) {
				System.out.println("Black Jack! pour la banque, vous avez perdu!");

			} else {
				pickAutoCardBank(newBankHand , currentPlayerScore);
			}

		} else {
			System.out.println("La main finale de la banque est de " + currentBankScore);
			compareScore(currentPlayerScore , currentBankScore);
		}

		


	}

	public static void compareScore(int finalPlayerScore, int finalBankScore) {

		if (finalBankScore >= finalPlayerScore){
			System.out.println("La banque gagne");
		} else {
			System.out.println("Bravo, vous avez gagné!!! $$$$ ");

		}
	}

	



}
	

	






