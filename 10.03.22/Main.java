import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        
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


        Iterator<String> it = books.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}