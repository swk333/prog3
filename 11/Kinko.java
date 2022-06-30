public class Kinko implements Lockable, PrintState{ 
  boolean isLock = false; 
  String key = "";
  int deposit = 0; 
  public Kinko(int d){ 
    deposit = d; 
  } 
  public boolean lock(MyKey k){
    key = k.getKeyToken();
    isLock = true; 
    return isLock; 
  } 
  public boolean unlock(MyKey k){
    if(key == k.getKeyToken()){
      isLock = false; 
    };
    return isLock; 
  }
  public void print(){
    printDeposit();
  }
  void printDeposit (){ 
    if(isLock == true)System.out.println("ロックされています"); 
    else System.out.println("預金額は"+deposit+"です"); 
  } 
  
}