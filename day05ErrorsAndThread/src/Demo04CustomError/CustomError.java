package Demo04CustomError;

public class CustomError extends Exception  {
    public CustomError(){
        super();
    }
    public CustomError(String message){
        super(message);
    }
}
