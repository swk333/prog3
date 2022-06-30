

class Super{ 
  private int x; 
  protected int y; 
  public int z; 
  public Super(){ 
    x = 0; 
    y = 0; 
    z = 0; 
  } 
  public Super(int x, int y, int z){ 
    this.x = x; 
    this.y = y; 
    this.z = z; 
  } 
  public int getX(){ 
    return x; 
  } 
  protected int getY(){ 
    return y; 
  } 
  public int getZ(){ 
    return z; 
  } 
}

public class Sub extends Super{ 
  public Sub(){ 
    super(); 
  } 
  public Sub(int x, int y, int z){ 
    super(x, y, z); 
  } 
  public static void main(String[] args){ 
    Super s = new Super(); 
    System.out.println("x = " + s.getX());//(1) 
    System.out.println("y = " + s.getY());//(2) 
    System.out.println("z = " + s.getZ());//(3) 
    s = new Sub(1, 2, 3); 
    System.out.println("x = " + s.getX());//(4) 
    System.out.println("y = " + s.getY());//(5) 
    System.out.println("z = " + s.getZ());//(6) 
  } 
}
