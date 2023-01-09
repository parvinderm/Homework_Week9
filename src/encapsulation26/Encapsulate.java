package encapsulation26;

public class Encapsulate {    //Declare Class

    private String name;  //Declare Private Variable
    private int rollNo;   //Declare Private Variable
    private int age;     //Declare Private Variable

    public String getName() {  //get method for name to access private variable
        return name;
    }

    public void setName(String name) {    //set method for name to access private variable
        this.name = name;
    }

    public int getRollNo() {  //get method for name to access private variable
        return rollNo;
    }

    public void setRollNo(int rollNo) {    //set method for name to access private variable
        this.rollNo = rollNo;
    }

    public int getAge(){      //get method for age to access private variable age
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public class TestEncapsulation {

    }
        public static void main(String[] args) {
            Encapsulate obj = new Encapsulate();

            obj.setName("Bhavesh");
            obj.setAge(19);
            obj.setRollNo(51);


            System.out.println("Codebuster name:"+obj.getName());
            System.out.println("Codebuster age:"+obj.getAge());
            System.out.println("Codebuster rollNo:"+obj.getRollNo());
        }



}
