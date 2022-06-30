class LockableJewelBox extends JewelBox{ 
  protected Lock l = new Lock();
  public LockableJewelBox(boolean e){ 
    super(e);
  }
  public void printEmpty(){ 
    if(l.isLock== true) System.out.println("ロックされています."); 
    else super.printEmpty(); 
  }
}