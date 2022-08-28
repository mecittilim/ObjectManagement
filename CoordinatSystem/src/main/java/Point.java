public class Point {
    int x;
    int y;

    String point;

    public int getX(){
        return x;
    }

    public void setX(int newX){
        x = newX;
    }

    public int getY (){
        return y;
    }

    public void setY(int newY){
        y = newY;
    }

    public double calculateDistanceOrigin(int x, int y){
        double distanece = Math.sqrt((x*x) + (y*y));
        return distanece;
    }

    public double calculeteDistanceOtherPoint(int x, int y){
        int getX = getX();
        int getY = getY();
        double distance = Math.sqrt(Math.pow((x-getX),2)+Math.pow((y-getY),2));
        return distance;
    }

    public String clonePoint(){
        int cloneX = getX();
        int cloneY = getY();


        String result = "X:"+cloneX+" Y:"+cloneY;
        return result;

    }

    public void move(int mX, int mY){
        setX(x+mX);
        setY(y+mY);

    }

}
