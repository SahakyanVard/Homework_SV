package probation_1;

public class Method_2 {
    public static void main(String[] args) {

//        IceCream iceCream = new IceCream();
//        iceCream.abstract1();
//        iceCream.abstract2();
//        iceCream.f();
//        System.out.println("-------");
//        Coffe coffe = new Coffe();
//        coffe.abstract1();
//        coffe.abstract2();
//
//        Chocolate ch = new Coffe();
//        ch.abstract1();
//        ch.abstract2();
//        MyAbstract myAbstract = new IceCream();
//        System.out.println("-----");
//        myAbstract.abstract1();
//
//        myAbstract = new Coffe();
//        myAbstract.abstract1();

//        x(new Coffe());
//        x(new IceCream());
        System.out.println("-----");
        array(new MyAbstract[]{ new Coffe(), new  IceCream()});
    }

//    public static void x(MyAbstract a) {
//        a.abstract2();
//    }

    public static void array(MyAbstract[] myAbstracts) {
        for (MyAbstract my : myAbstracts) {
            my.abstract2();
            if(my instanceof Coffe ){
                (( Coffe) my).f();
            }
        }
    }
}
