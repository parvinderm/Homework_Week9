package week9;

public class SimpleCalculator {   //Declare Class
    public static void main(String[] args) {    //Declare main method or Predefined method
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
     private double firstNumber;   //Declare Instance Variable
     private double secondNumber;  //Declare Instance Variable

    public double getFirstNumber() {  //Declare Instance Method
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {   //Declare Instance Method
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){   //Declare Instance Method
      this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){      //Declare Instance Method
        return firstNumber +secondNumber;
    }
    public double getSubtractionResult(){    //Declare Instance Method
        return firstNumber - secondNumber;

    }
    public double getMultiplicationResult(){    //Declare Instance Method
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {    //Declare Instance Method
        if (secondNumber == 0) {
            return this.secondNumber = 0;
        } else {

            return firstNumber / secondNumber;

        }


    }
}
