package probation_1;

public class Method_1 {
    static void myMethod1(String cardName,int number){
        System.out.println(cardName+"\n"+number);
    }

    public static void main(String[] args) {
        myMethod1("visa",112);
        myMethod1("master",113);
        myMethod1("arca",111);
    }
}
