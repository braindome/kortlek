import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Git user... test? different users on powershell and git CLI?

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<>();
        ArrayList<Card> anotherDeck = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        // Creates card deck sorted in rising order.
        for (int i = 2; i <= 14; i++) {
            Card spades = new Card(i, "spades");
            Card clubs = new Card(i, "clubs");
            Card diamonds = new Card(i, "diamonds");
            Card hearts = new Card(i, "hearts");

            deck.add(spades);
            deck.add(clubs);
            deck.add(diamonds);
            deck.add(hearts);
        }

        // Creates another deck.
        for (int i = 2; i <= 14; i++) {
            Card spades = new Card(i, "spades");
            Card clubs = new Card(i, "clubs");
            Card diamonds = new Card(i, "diamonds");
            Card hearts = new Card(i, "hearts");

            anotherDeck.add(spades);
            anotherDeck.add(clubs);
            anotherDeck.add(diamonds);
            anotherDeck.add(hearts);
        }

        // Shuffles both decks.
        Collections.shuffle(deck);
        Collections.shuffle(anotherDeck);

        // Prints entire deck.
        System.out.println(deck.toString());
        System.out.println("Deck size: " + deck.size());

        System.out.println("Who is this");


        System.out.println("Compare card values");
        System.out.println("Input two integers between 0 and 51");
        int first = scan.nextInt();
        int second = scan.nextInt();

        //Compare two cards.
        System.out.println("Are the cards the same?");
        System.out.println(deck.get(first).equals(anotherDeck.get(second)));

        System.out.println("Is the first card higher than the second?");
        System.out.println("First card: " + deck.get(first).toString());
        System.out.println("Second card: " + anotherDeck.get(second).toString());

        if (deck.get(first).value > anotherDeck.get(second).value) {
            System.out.println("First card is higher");
        } else if (deck.get(first).value < anotherDeck.get(second).value) {
            System.out.println("First card is lower");
        } else {
            System.out.println("Both cards have the same value");
        }


    }
}