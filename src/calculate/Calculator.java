package calculate;

public class Calculator {    //Declare Class


    public void addition(int a,int b){    //Declare Instance Method
        System.out.println(a+b);
    }

    public void subtraction(int a ,int b){      //Declare Instance Method
        System.out.println(a-b);
    }
    public void division(int a,int b){          //Declare Instance Method
        System.out.println(a/b);
    }

    public void multiplication(int a,int b){         //Declare Instance Method
        System.out.println(a*b);
    }

    public static int calculateResult(int a,int b,char op ){
        int ans=0;
        if(op == '+'){          //Using if else conditional statement
            ans = a+b;
        }
        else if(op =='-'){
            ans = a-b;
        }else if(op =='*'){
            ans = a*b;
        }else if(op =='%'){
            ans = a%b;
        }else if(op == '/'){
            ans = a/b;
        }
        System.out.println("Your answer is -"+ ans);
          return ans;

    }

}
