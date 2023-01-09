package constructoroverloading;

 class Student5 {    //Declare Class

         int id;     //Declare Instance Variable
         String name;    //Declare Instance Variable
         int age;     //Declare Instance Variable
         Student5(int i,String n){    //Declare two argument Constructor
             id = i;
             name = n;
         }
         Student5(int i,String n,int a){    //Declare three argument constructor
             id = i;
             name = n;
             age=a;
         }
         public void display() {      //Declare Instance method
             System.out.println(id + " " + name + " " + age);
         }

         public static void main(String args[]) {    //Declare main method or Predefined method
             Student5 s1 = new Student5(111, "Karan");
             Student5 s2 = new Student5(222, "Aryan", 25);
             s1.display();
             s2.display();
         }
}
