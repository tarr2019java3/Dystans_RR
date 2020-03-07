package pl.sda.dystans;

public class Point {

    private int x;
    private int y;


    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }


    public void distance(Point point){
        System.out.println(Math.sqrt((Math.pow((x - point.getX()), 2) + Math.pow((y - point.getY()), 2))));
    }


}