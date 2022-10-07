import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class firstact_ArrayList{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> favorites = new ArrayList<String>();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Your favorite color: ");
        String color = input.nextLine();
        favorites.add(color);

        System.out.print("Your favorite animal: ");
        String animal = input.nextLine();
        favorites.add(animal);

        System.out.print("Your favorite food: ");
        String food = input.nextLine();
        favorites.add(food);

        System.out.print("Your favorite sports: ");
        String sport = input.nextLine();
        favorites.add(sport);

        System.out.print("Your favorite movie: ");
        String movie = input.nextLine();
        favorites.add(movie);
        
        System.out.println("ARRAYLIST DISPLAY");
        System.out.println(name + "'s favorites are: ");

        Iterator<String> iterator_arraylist = favorites.iterator();
        while(iterator_arraylist.hasNext()){
            System.out.println(iterator_arraylist.next());
        } 


        input.close();

    }
}

