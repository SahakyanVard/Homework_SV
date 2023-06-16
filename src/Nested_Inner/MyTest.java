package Nested_Inner;

public class MyTest {
    public static void main(String[] args) {
//        MyInner myInner = new MyInner("T1", 1, 1, 1, 5, 4, 1);
//        myInner.print_P();
//
//        MyInner.MyTrianglePoint myTrianglePoint=myInner.new MyTrianglePoint(1,1);

//        Geograf geograf = new Geograf();
//        geograf.trianglePerimeter(1, 1, 1, 5, 4, 1);

//        StudentAnonymous studentAnonymous=new StudentAnonymous();
//        studentAnonymous.write();

//        AnonymousInner a=new AnonymousInner() {
//            @Override
//            public void write() {
//                System.out.println("Anonymous is write ok");
//            }
//        };
//        a.write();
//        AnonymousInner aa=new AnonymousInner() {
//            @Override
//            public void write() {
//                System.out.println("Anonymous is write ok111");
//            }
//        };
//        aa.write();

        Message message=new Message() {
            @Override
            public void sendMessage(String text) {
                System.out.println("Hello from Armenia "+text);
            }
        };
        message.sendMessage("\nSMS for YOU");

        Geograf g=new Geograf(){
            @Override
            public void trianglePerimeter(int x1, int y1, int x2, int y2, int x3, int y3) {
                super.trianglePerimeter(x1, y1, x2, y2, x3, y3);
            }
        };



    }
}
