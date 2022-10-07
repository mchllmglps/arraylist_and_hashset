public class Music {
    public String genre;
    public String title;
    
    Music(String genre, String title){
        this.genre = genre;
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return "Music{" + "Genre: " + genre + "Title: " + title;
    }
}
