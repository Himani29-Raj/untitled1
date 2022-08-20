package Dumps;

public class Lines {
    class Point{
        public int x,y;
    }
    public Point getPoint(){
        return new Point();
    }
}
class Triangles{
    public Triangles(){
        Lines.Point p = (new Lines()).getPoint();
    }
}