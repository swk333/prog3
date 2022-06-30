package teikyo.ics.csp1lec14;

public class Lec14Main2{

    static void recursionFunc(Class c){
      Class s = c.getSuperclass();
      if(s == null) return;
      else{
        System.out.println("Super class is " + s.getCanonicalName());
        recursionFunc(s);
      }
    }
    public static void main(String[] args){
        try{
            Class c = Class.forName(args[0]);
            Class s = c.getSuperclass();

            System.out.println("Target class is " + c.getCanonicalName());
            recursionFunc(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}