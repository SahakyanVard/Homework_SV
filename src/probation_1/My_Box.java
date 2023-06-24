package probation_1;

import myMap.Worker;

public class My_Box <T>{
    private T type;
    public T getType() {
        return type;
    }
    public void setType(T type) {
        this.type = type;
    }

    public static void main(String[] args) {
        My_Box<Integer> integerMyBox=new My_Box<>();
        integerMyBox.setType(45555);
        System.out.println(integerMyBox.getType());

        My_Box<String> stringMyBox=new My_Box<>();
        stringMyBox.setType("VVVFFFGGG");
        System.out.println(stringMyBox.getType());

        My_Box<Bank_1> bMyBox=new My_Box<>();
        bMyBox.setType(new Bank_1());
        System.out.println(bMyBox.getType().getCardNumber());

    }
}
