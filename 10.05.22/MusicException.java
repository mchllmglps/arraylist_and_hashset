public class MusicException extends Exception {

    public MusicException(String message){
        super(message);
    }
    
    public String notNumber(){
        return "Your input is not a number.";
    }

}
