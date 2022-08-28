public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(2);
        point1.setY(7);
        int x = point1.getX();
        int y = point1.getY();
        System.out.println("points: "+x+","+y);

        System.out.println(point1.calculateDistanceOrigin(x, y));
        System.out.println(point1.calculeteDistanceOtherPoint(5, 9));

        System.out.println(point1.clonePoint());
        System.out.println(point1.clonePoint());
        System.out.println(point1.clonePoint());
        System.out.println(point1.clonePoint());
        point1.move(10,10);


        System.out.println(point1.calculateDistanceOrigin(point1.getX(), point1.getY()));
        point1.move(10,10);
        System.out.println(point1.calculateDistanceOrigin(point1.getX(), point1.getY()));

        Point point2 = new Point();
        point2.point = point1.clonePoint();

    }
}
