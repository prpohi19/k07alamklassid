public class MathTeacher extends Teacher {
  String subject = "Mathematics";
  int studentsInCourse = 100;
  String name;
  String quote;
  public MathTeacher(String name, String quote){
    super(name);
    this.quote = quote;
  }
  @Override
  public String Introduce(){
    return "I am " + subject + " teacher in " + school + ", I have " + studentsInCourse + " students in my course, " + quote ;
  }
}
