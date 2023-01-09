package methodoverriding23;

 class Bike2 extends Vehicle{      //Declare Class with extends Vehicle Class

     public void run(){
         System.out.println("Bike is running safely");
     }

     public static void main(String[] args) {   //Declare main method
         Bike2 obj = new Bike2();  //Creating Object
         obj.run();    //Calling method
     }

}
