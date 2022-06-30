public class Lock implements Lockable{
  boolean isLock = false; 
  String key = "";
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
}