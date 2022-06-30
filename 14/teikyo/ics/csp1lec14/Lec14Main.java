package teikyo.ics.csp1lec14;
import teikyo.ics.csp1lec14.staff.*;
import teikyo.ics.csp1lec14.student.*;
import java.util.ArrayList;


public class Lec14Main{

    static Study setSubject(String str)throws Exception{
        try{
            if(str.equals("Programming")) return new Programming();
            else if(str.equals("English")) return new English();
            else if(str.equals("Science")) return new Science();
            else throw new Exception();
        }catch(Exception e){
            throw e;
        }
    }

    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<>();

        try{
            for(int i=0; i < args.length; i++){
                if(args[i].equals("Student")){
                    Student s = new Student();
                    int a = i + 1;
                    int b = i + 2;
                    int c = i + 3;
                    String name = args[a];
                    int age = Integer.parseInt(args[b]);
                    try{
                        Study subject = setSubject(args[c]);
                        s.setValues(name, age, subject);
                        persons.add(s);
                    }catch(Exception e){
                        System.out.println("プログラム引数を見直してください");
                        return;
                    }
                }else if(args[i].equals("Teacher")){
                    Teacher t = new Teacher();
                    int a = i + 1;
                    int b = i + 2;
                    String name = args[a];
                    int age = Integer.parseInt(args[b]);
                    t.setValues(name, age);
                    persons.add(t);
                }
            }
        }catch(NumberFormatException e){
            System.out.println("年齢が正しく入力されていません");
            return;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("プログラム引数を見直してください");
            return;
        }catch(NullPointerException e){
            System.out.println("プログラム引数を見直してください");
            return;
        }

        for(int i=0; i < persons.size(); i++){
            persons.get(i).printInfo();
        } 

    }
}