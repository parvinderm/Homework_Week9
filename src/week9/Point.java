package week9;

public class Point {    //Declare Class

   private  int x;        //Declare Instance Variable
   private int y;        //Declare Instance Variable

    public Point(){
        System.out.println("No argument constructor");
    }

    public Point(int x,int y){    //Declared Parameterised Constructor
      this.x=x;
       this.y=y;
    }

    public int getX(){     //Declared Instance method without parameter
        return x;
    }

    public int getY(){    //Declared Instance Method without parameter
        return y;
    }

    public void setX(int x){  //Declared Instance Method with parameter
        this.x=x;
    }
     public void setY(int y){   //Declared Instance Method with parameter
        this.y=y;
     }

     public double distance(){    //Declare Instance Method without parameter
        return distance(0,0);

     }
     public double distance(int x,int y){       //Declare Instance Method with Parameter
       return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
     }
     public double distance(Point secondPoint){   //Declare Instance Method with Parameter
        return distance(secondPoint.x,secondPoint.y);
     }

    public static void main(String[] args) {   //Declare Main Method or Predefined method
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

}
