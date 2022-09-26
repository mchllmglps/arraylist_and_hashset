import java.util.Scanner;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> favorites = new ArrayList<String>();
        Set<String> faves = new HashSet<String>();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Your favorite color: ");
        String color = input.nextLine();
        favorites.add(color);
        faves.add(color);

        System.out.print("Your favorite animal: ");
        String animal = input.nextLine();
        favorites.add(animal);
        faves.add(animal);

        System.out.print("Your favorite food: ");
        String food = input.nextLine();
        favorites.add(food);
        faves.add(food);

        System.out.print("Your favorite sports: ");
        String sport = input.nextLine();
        favorites.add(sport);
        faves.add(sport);

        System.out.print("Your favorite movie: ");
        String movie = input.nextLine();
        favorites.add(movie);
        faves.add(movie);
        
        System.out.println("ARRAYLIST DISPLAY");
        System.out.println(name + "'s favorites are: ");

        Iterator<String> iterator_arraylist = favorites.iterator();
        while(iterator_arraylist.hasNext()){
            System.out.println(iterator_arraylist.next());
        } 


        System.out.println("HASHSET DISPLAY");
        System.out.println(name + "'s favorites are: ");

        Iterator<String> iterator_hashset = faves.iterator();
        while(iterator_hashset.hasNext()){
            System.out.println(iterator_hashset.next());
        } 

        input.close();

    }
}

