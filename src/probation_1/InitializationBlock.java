package probation_1;

public class InitializationBlock implements Cloneable {
private String init;
private char init_1;
private double value=f();

    private final double f(){
        return 100.4789;
    }


private boolean isTrue;

    public InitializationBlock(String init, char init_1, double value) {
        this.init = init;
        this.init_1 = init_1;
        this.value = value;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public char getInit_1() {
        return init_1;
    }

    public void setInit_1(char init_1) {
        this.init_1 = init_1;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    //    {
//        init="Hi";
//        init_1='$';
//        value=789.524;
//        System.out.println("Java Core");
//    }
//    {
//        isTrue=true;
//    }
//
//    public InitializationBlock() {
//        System.out.println("Print constructor");
//        value = 111.222;
//    }

    public static void main(String[] args) {
//        InitializationBlock iBlock=new InitializationBlock();
//        System.out.println(iBlock.isTrue);
//        System.out.println(iBlock.value);

        InitializationBlock ib_1=new InitializationBlock("Aaa",'a',11.1);
        try {
            InitializationBlock ib_2=(InitializationBlock) ib_1.clone();
            System.out.println(ib_2.value);
            System.out.println(ib_2.init_1);
            System.out.println(ib_2.init);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
