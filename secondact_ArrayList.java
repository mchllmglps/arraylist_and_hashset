import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class secondact_ArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Character choice, clear;
    
        List<Integer> arraylist = new ArrayList<Integer>();

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
                    
                    if(add > 0){

                        arraylist.add(add);
                        
                        System.out.println("Number " + add + " is successfully added to the ArrayList!");
                        break;

                    }
                    else{
                        System.out.println("Invalid! Your input is a negative integer.");
                        break;
                    }

                    
                case 'b':
                    System.out.print("Enter number you want to remove: ");
                    int remove = input.nextInt();
                    System.out.println("");

                    if(arraylist.contains(remove)){
                        arraylist.remove(Integer.valueOf(remove));
                        System.out.println("Number " + remove + " is successfully removed!");
                        break;
                    }
                    
                case 'c':
                    System.out.println("Displaying numbers in ArrayList");
                    System.out.println("============================");
                    for (Integer number : arraylist){
                        System.out.println(number);
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
                            System.out.println("Clearing arraylist...");
                            arraylist.clear();
                            System.out.println("============================");
                            System.out.println("Contents all cleared!");
                            System.out.println("============================");
                            break;
                        case 'n':
                            System.out.println("ArrayList not cleared!");
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
