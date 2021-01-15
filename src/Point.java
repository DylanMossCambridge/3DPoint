public class Point implements Comparable<Point>{

    final float x;
    final float y;
    final float z;

    public static void main(String[] args) {
        Point point = new Point(1,2,3);
        Point point2 = new Point(3,2,1);
        Point point3 = new Point(5,2,3);
        Point point4 = new Point(1,2,3);

        System.out.println(point.compareTo(point2));
        System.out.println(point.compareTo(point3));
        System.out.println(point.compareTo(point4));
    }

    Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int compareTo(Point p) {
        if(z > p.z){
            return 1;
        } else if(z < p.z){
            return -1;
        } else {
            if(y > p.y){
                return 1;
            } else if(y < p.y){
                return -1;
            } else {
                if(x > p.x){
                    return 1;
                } else if(x < p.x){
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
