package mytool;
import myreport.ExamReport;

public class MyPaper{ 
  public String getName(){ 
    ExamReport report = new ExamReport(); 
    return report.toString(); 
  }
  public static void main(String[] args){
    
    System.out.println("test");
  }
}
