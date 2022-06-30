class LockerTester{ 
     public static void main(String[] args){ 
    //預金 1000円で金庫を生成して状態を表示 
      Kinko k = new Kinko(1000); 
      //中身を入れた（空でない）状態でロック付き宝石箱を生成して状態を表示 
      LockableJewelBox j=new LockableJewelBox(false); 
    //2つのキーを生成して k,j をロック． 
      k.lock(new KeyWord1()); 
      j.lock(new KeyWord1()); 
    //あえて KeyWord1 で k, j をアンロック 
      k.unlock(new KeyWord1()); 
      j.unlock(new KeyWord2()); 
    //それぞれの状態を表示する． 
      k.printDeposit(); 
      j.printEmpty(); 
   } 

}