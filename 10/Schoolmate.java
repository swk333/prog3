class Person{ 
    String name;  //人の名前 
    public Person(String n){ 
      this.name = n; 
    } 
    public String getName(){ 
      return this.name; 
    } 
} 
interface Friends{ 
    void setNickname(String name); 
    String getNickname(); 
}

class Schoolmate extends Person implements Friends{
  String nickname;  //ニックネーム
  void setNickname(String name){
    this.nickname = name;
  }
  String getNickname(){
    return nickname;
  }
}