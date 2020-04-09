
// SubSystem 1
class PointCartesian{
    private double x, y;

    public PointCartesian(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")"; 
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}


// SubSystem
class PointPolar{
    private double radius, angle;
    public PointPolar(double radius, double angle){
        this.radius = radius;
        this.angle = angle;
    }
    
    public void rotate(int angle){
        this.angle += angle % 360;
    }
    
    public String toString(){
        return "[" + radius+ "@" +angle+ "]";
    }

}






class Application{


    public static void main(String[] args){
        
    }




}
