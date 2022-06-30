class Args {
  public static void main(String[] args){
    if(args.length >= 1) {
      for(String arg: args) {
        System.out.println(arg);
      }
    } else {
      System.out.println("コマンドライン引数はありません");
    }
  }
}