package throwableExceptionError;

public class NameException extends RuntimeException{
//    public NameException(){
//        super("Invalid name \n please enter valid name");
//    }

    //OR toString
    @Override
    public String toString() {
        return "INVALID NAME ";
    }
}
