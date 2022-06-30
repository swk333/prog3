class ArgsMain{
  public static void main(String[] args){
    if(args.length != 2){
      System.out.println("usage: java ArgsMain 姓 名 ");
    } else {
      System.out.println("こんにちは, " + args[0] + " " + args[1]);
    }
  }
}