abstract class Person{ 
    String name;   //人の名前 
     
    //コンストラクタ(引数に人の名前を指定） 
    public Person(String n){ 
       this.name = n; 
    } 
    public String getName(){ 
      return this.name; 
    } 
    public void printInfo(){ 
       String s = getName()+"="+getJob() ; 
       System.out.println(s); 
    } 
 
    public abstract String getJob(); 
} 
 
interface Teacher{ 
    //教えている授業科目科目を返すメソッド 
    String getTeaching(); 
} 
 
interface Learner{ 
    //学習中の科目を返すメソッド 
    String getLearning(); 
}

class Professor extends Person 
                  implements Teacher{ 
    public Professor(String n){ 
        super(n); 
    } 
    public String getTeaching(){ 
 return "プログラミング 1"; 
    } 
    public String getJob(){ 
        return "教授"; 
    } 
} 
 
class Student extends Person implements 
Learner{ 
    public Student(String n){ 
        super(n); 
    } 
    public String getLearning(){ 
 return "情報科学プログラミング 1"; 
    } 
     
    public String getJob(){ 
        return "学生"; 
    } 
}

class University{ 
    public static void main(String[] args){ 
        Person[] person= {new Professor("太郎"), new Student("次郎"), 
                            new Student("花子")}; 
        for(int i=0; i < person.length; i++) person[i].printInfo(); 
    } 
}
