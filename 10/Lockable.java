public interface Lockable{ 
  boolean lock(MyKey k);
  boolean unlock(MyKey k);
}