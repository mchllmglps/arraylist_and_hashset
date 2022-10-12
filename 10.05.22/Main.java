import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Music> listOfSongs = new ArrayList<Music>();

        System.out.println("Welcome to your playlist!");
        System.out.println("Note: You can only input an integer.");

        try{
            System.out.print("Number of Musics you want to add to the playlist: ");
            Integer objects = input.nextInt();
            
            if(objects < 0){
                input.close();
                sc.close();
                throw new MusicException("Your input is negative. Please input positive index.");
            }

            for(int i = 0; i < objects; i++){
                
                System.out.println("");
                System.out.print("Title: ");
                String musc_title = sc.nextLine();

                System.out.print("Genre: ");
                String musc_genre = sc.nextLine();
    
                listOfSongs.add(new Music(musc_genre, musc_title));
            }

            System.out.println("");
            System.out.println("Here's Your Playlist!");
            System.out.println("=====================================");
            for(Music list : listOfSongs){
                System.out.println("Title: " + list.getTitle() + " || " + "Genre: " + list.getGenre());    
            }
            System.out.println("=====================================");
            System.out.println("");

            input.close();
            sc.close();

        }
        catch(MusicException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Your input is not a number.");
        }

    }
}