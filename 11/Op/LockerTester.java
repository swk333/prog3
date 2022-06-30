class LockerTester{ 
    public static void main(String[] args){ 
      //預金 1000円で金庫を生成して状態を表示 
      Kinko k = new Kinko(1000);  
      //中身を入れた（空でない）状態でロック付き宝石箱を生成して状態を表示 
      LockableJewelBox j = new LockableJewelBox(false); 
      //2 つのキーを生成して k,j をロック． 
      k.l.lock(new KeyWord1()); 
      j.l.lock(new KeyWord2()); 
      //あえて KeyWord1 で k, j をアンロック 
      k.l.unlock(new KeyWord1()); 
      j.l.unlock(new KeyWord1()); 
      //それぞれの状態を表示する． 
      PrintState[] state = {k, j}; 
      for(PrintState s: state)s.print(); 
  } 
}