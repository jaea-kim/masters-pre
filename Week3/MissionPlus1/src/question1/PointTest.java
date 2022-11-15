package question1;

public class PointTest {
    public static void main(String[] args) {
        // 문제 1
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
        System.out.println();

        //문제 2
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint cp1 = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
        System.out.println();

        //문제 3
        Point3D p = new Point3D(1,2,3);
        System.out.println(p.toString() + "입니다.");

        p.moveUp();
        System.out.println(p.toString() + "입니다.");

        p.moveDown();
        p.move(10,10);
        System.out.println(p.toString() + "입니다.");

        p.move(100,200,300);
        System.out.println(p.toString() + "입니다");
        System.out.println();

        //문제 4
        PositivePoint p1 = new PositivePoint();

        p1.move(10,10);
        System.out.println(p1.toString() + "입니다.");

        p1.move(-5,5);
        System.out.println(p1.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10,-10);
        System.out.println(p2.toString() + "입니다.");

    }
}
