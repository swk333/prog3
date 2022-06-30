public class Kinko implements PrintState{ 
  protected Lock l = new Lock();
  int deposit = 0; 
  public Kinko(int d){ 
    deposit = d; 
  } 
  public void print(){
    printDeposit();
  }
  void printDeposit (){ 
    if(l.isLock == true)System.out.println("ロックされています"); 
    else System.out.println("預金額は"+deposit+"です"); 
  } 
}