package throwableExceptionError;

public class YearException extends java.lang.Exception {
    public YearException(int year){
        super("Rang 1905-2022 : "+ year);
    }


}
