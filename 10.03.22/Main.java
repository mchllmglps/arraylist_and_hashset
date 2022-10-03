import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List<String> books = new ArrayList<String>();
        
        Author<String> book1 = new Author<String>();
        book1.setAuthorname("Rupi Kaur");
        book1.setBookname("Milk and Honey");
        book1.setBookquote("the idea that we are so capable of love but still choose to be toxic");
        books.add("\""+ book1.getBookquote() + "\"" + " from "+ book1.getBookname() + " by: " + book1.getAuthorname());

        Author<String> book2 = new Author<String>();
        book2.setAuthorname("Louisa May Alcott");
        book2.setBookname("Little Women");
        book2.setBookquote("I am not afraid of storms, for I am learning how to sail my ship.");
        books.add("\""+ book2.getBookquote() + "\"" + " from "+ book2.getBookname() + " by: " + book2.getAuthorname());

        Author<String> book3 = new Author<String>();
        book3.setAuthorname("Joseph Heller");
        book3.setBookname("Catch-22");
        book3.setBookquote("Anything worth dying for is certainly worth living for.");
        books.add("\""+ book3.getBookquote() + "\"" + " from "+ book3.getBookname() + " by: " + book3.getAuthorname());

        Author<String> book4 = new Author<String>();
        book4.setAuthorname("Gabriel Garcia Marquez");
        book4.setBookname("One Hundred Years of Solitude");
        book4.setBookquote("There is always something left to love.");
        books.add("\""+ book4.getBookquote() + "\"" + " from "+ book4.getBookname() + " by: " + book4.getAuthorname());
        
        Author<String> book5 = new Author<String>();
        book5.setAuthorname("Paulo Coelho");
        book5.setBookname("The Alchemist");
        book5.setBookquote("It's the possibility of having a dream come true that makes life interesting.");
        books.add("\""+ book5.getBookquote() + "\"" + " from "+ book5.getBookname() + " by: " + book5.getAuthorname());



        System.out.print("Enter Book index: ");
        Integer user = input.nextInt();

        try{
            if(user < 0){
                input.close();
                throw new BooksException("Your input in negative. Please input positive index.");
            }
            if(user > 5){
                input.close();
                throw new BooksException("Your input exceeds the size of array.");
            }

            System.out.println("Book Index: " + user);
            System.out.println(books.get(user));

        }
        catch(BooksException e){
            System.out.println(e.getMessage());
        }

        input.close();

    }
}