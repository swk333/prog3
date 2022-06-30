interface Calc{
  public String getOperator();

  public int calc(int a, int b);
}

class Calculation implements Calc{
  String operator;
  Calculation(String operator){
    this.operator = operator;
  }
  public String getOperator(){
    return operator;
  }     
  public int calc(int a, int b){
    if(operator.equals("+")) return a + b;
    else if(operator.equals("-")) return a - b;
    else if(operator.equals("/")) return a / b;
    else if(operator.equals("x")) return a * b;
    else if(operator.equals("%")) return a % b;
    else throw new IllegalArgumentException();
  }
}  

class SimpleCalc{
   public static void main(String[] args){
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[2]);
     Calculation c = new Calculation(args[1]);
     try{
      int result = c.calc(a, b);
      System.out.println(a + c.getOperator()+b+"="+ result);
     }catch(Exception e){
      System.out.println(e);
     }
  }
}  