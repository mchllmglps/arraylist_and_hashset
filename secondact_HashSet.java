import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class secondact_HashSet{

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Character choice, clear;
    
        Set<Integer> hashset = new HashSet<Integer>();
        


        while(true){
            System.out.println("");
            System.out.println("SELECT YOUR PREFERENCE");
            System.out.println("");
            System.out.println("============================");
            System.out.println("A. Add number");
            System.out.println("B. Remove number");
            System.out.println("C. Display numbers");
            System.out.println("D. Clear number");
            System.out.println("E. Exit");
            System.out.println("============================");
            System.out.println("");
            System.out.print("YOUR CHOICE: ");
            choice = input.next().charAt(0);
            choice = Character.toLowerCase(choice);
            System.out.println("");


            switch(choice){
                case 'a':
                    System.out.print("Enter number you want to add: ");
                    int add = input.nextInt();
                    System.out.println("");
                

                    if(hashset.contains(add)){
                        System.out.println("Value already exists! Value not added!");

                    }
                    else{
                        hashset.add(add);
                        System.out.println("Number " + add + " is successfully added to the HashSet!");
                    }

                    break;
                    
                case 'b':
                    System.out.print("Enter number you want to remove: ");
                    int remove = input.nextInt();
                    System.out.println("");

                    if(hashset.contains(remove)){
                        hashset.remove(Integer.valueOf(remove));
                        System.out.println("Number " + remove + " is successfully removed!");
                        break;
                    }

                    break;

                case 'c':
                    
                    System.out.println("Displaying numbers in HashSet");
                    System.out.println("============================");

                    Iterator<Integer> it_set = hashset.iterator();
                    while(it_set.hasNext()){
                        System.out.println(it_set.next());
                    }
                    
                    System.out.println("============================");
                    break;

                case 'd':

                    System.out.print("Are you sure you want to clear contents?(y/n): ");
                    clear = input.next().charAt(0);
                    clear = Character.toLowerCase(clear);
                    switch(clear){
                        case 'y':
                            System.out.println("CLEARING!!!");
                            System.out.println("Clearing hashset...");
                            hashset.clear();
                            System.out.println("============================");
                            System.out.println("Contents all cleared!");
                            System.out.println("============================");
                            break;
                        case 'n':
                            System.out.println("HashSet not cleared!");
                            break;
                    }
                    break;
                case 'e':
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid! Please input the proper choice!");

            
            }

        }
    }
}