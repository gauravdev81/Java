class Calculator{
    public int add(int n1, int n2){
        int result = n1+n2;
        return result;
    }
}

class Demo{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        
        //creating an object "c" of class Calculator
        Calculator c = new Calculator();
        int result = c.add(num1,num2);
        System.out.println("The sum of "+ num1+ " and "+num2+ " is "+result);
    }
}