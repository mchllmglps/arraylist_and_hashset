import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class firstact_HashSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<String> faves = new HashSet<String>();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Your favorite color: ");
        String color = input.nextLine();
        faves.add(color);

        System.out.print("Your favorite animal: ");
        String animal = input.nextLine();
        faves.add(animal);

        System.out.print("Your favorite food: ");
        String food = input.nextLine();
        faves.add(food);

        System.out.print("Your favorite sports: ");
        String sport = input.nextLine();
        faves.add(sport);

        System.out.print("Your favorite movie: ");
        String movie = input.nextLine();
        faves.add(movie);

        System.out.println("HASHSET DISPLAY");
        System.out.println(name + "'s favorites are: ");

        Iterator<String> iterator_hashset = faves.iterator();
        while(iterator_hashset.hasNext()){
            System.out.println(iterator_hashset.next());
        } 

        input.close();

    }
}
