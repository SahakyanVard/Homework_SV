package memoryModel;

import java.util.HashSet;

public class Equals_HashCode {
    public static void main(String[] args) {
//        BankCard bankCard_1 = new BankCard("VISA", "4355392415181177", 118);
//        BankCard bankCard_2 = new BankCard("VISA", "4355392415181177", 118);
////        BankCard bankCard_2 = new BankCard("MASTER", "5181003902014578", 169);
//
//        System.out.println(bankCard_1 == bankCard_2);
//        System.out.println(bankCard_1.equals(bankCard_2));
//        System.out.println(bankCard_1.hashCode());
//        System.out.println(bankCard_2.hashCode());
//
//        HashSet<BankCard> bankCardHashSet = new HashSet<>();
//        bankCardHashSet.add(bankCard_1);
//        System.out.println(bankCardHashSet.contains(bankCard_2));

//        String x="OOP";
////        String y="OOP";
//        String y=new String("OOP");
//        System.out.println(x==y);
//        System.out.println(x.equals(y));
        // String is immutable

        //String +
//        String a="Sahak";
//        String b=" Sahakyan";
//        String rezult="Hello "+a+b+" 2023";
//        System.out.println(rezult);
//        System.out.println("Hello ".concat(a).concat(b).concat(" 2023"));

//        StringBuilder stringBuilder=new StringBuilder();
//        stringBuilder.append("Hello ")
//                .append(a)
//                .append(b)
//                .append(" 2023");
//        String toString = stringBuilder.toString();
//        System.out.println(toString);

        //Integer from byt rang-127
        Integer i1=127;
        Integer i2=127;
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
        Integer a=128;
        Integer b=128;
        System.out.println(a==b);
        System.out.println(a.equals(b));


    }
}
