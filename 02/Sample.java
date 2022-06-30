class Sample{
  public static void main(String[] args){
    int N = 100000;
    int count = 0;
    int i = 1;
    while(count <= N){
      double startTime = System.nanoTime();
      boolean flg = false;
      for(int j = 2; j < i; j++){
        if(i % j == 0){
          flg = true;
          break;
        }
      }
      double endTime = System.nanoTime();
      if(!flg){
        double calc = (endTime - startTime)/1000000;
        String time = String.format("%.2f", calc);
        System.out.println(count + " " + i + " " + time + "ms");
        count++;
      }
      i++;
    }
  }
}