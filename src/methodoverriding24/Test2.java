package methodoverriding24;

 class Test2 {     //Declare Class

     public static void main(String[] args) {   //Declare main method or Predefined method
         SBI s = new SBI();
         ICICI i = new ICICI();
         AXIS a = new AXIS();
         System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
         System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
         System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
     }
}
