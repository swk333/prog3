class Box{ 
  boolean isEmpty=true; 
  public Box(boolean e){ 
    isEmpty= e; 
  } 
  public void printEmpty(){ 
    if(isEmpty== true)System.out.println("中身は空です．"); 
    else System.out.println("中に何か入っています．"); 
  } 
}