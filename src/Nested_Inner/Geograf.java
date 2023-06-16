package Nested_Inner;

public class Geograf {
    public void trianglePerimeter(int x1, int y1, int x2, int y2, int x3, int y3){
        String s="Hello triangle";
        class MyTrianglePoint {
            public int x, y;
            public MyTrianglePoint(int x, int y) {
                this.x = x;
                this.y = y;
            }
            public void f(){
                System.out.println(s);
            }
        }

        MyTrianglePoint p1=new MyTrianglePoint(x1,y1);
        MyTrianglePoint p2=new MyTrianglePoint(x2,y2);
        MyTrianglePoint p3=new MyTrianglePoint(x3,y3);

        double size1_2 = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double size1_3 = Math.sqrt(Math.pow(p1.x - p3.x, 2) + Math.pow(p1.y - p3.y, 2));
        double size2_3 = Math.sqrt(Math.pow(p2.x - p3.x, 2) + Math.pow(p2.y - p3.y, 2));
        System.out.println(size1_2 + size1_3 + size2_3);
    }

}
