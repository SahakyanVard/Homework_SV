package collections;
public enum MyEnum {
    NORTH("N"),
    SOUTH("S"),
    WEST("W"),
    EAST("E");


    public final String value;
    MyEnum(String valueE){
        value=valueE;
    }

    public static void main(String[] args) {
        navigate(MyEnum.EAST);
        navigate(MyEnum.NORTH);
        navigate(MyEnum.WEST);
        navigate(MyEnum.SOUTH);
    }

    static void navigate(MyEnum compass) {
        switch (compass) {
            case EAST:
                System.out.println("Go to the East -"+MyEnum.EAST.value);
                break;
            case WEST:
                System.out.println("Go to the West -"+MyEnum.WEST.value);
                break;
            case NORTH:
                System.out.println("Go to the North -"+MyEnum.NORTH.value);
                break;
            case SOUTH:
                System.out.println("Go to the South -"+MyEnum.SOUTH.value);
                break;
        }
    }
}
