public class SpanishTeacher extends Teacher {
  String subject = "español";
  int studentsInCourse = 30;
  String name;
  String quote;
  public SpanishTeacher(String name, String quote){
    super(name);
    this.quote = quote;
  }
  @Override
  public String Introduce(){
    return "Soy profesora de " + subject + " en la " + school + ", tengo " + studentsInCourse + " estudiantes, " + quote;
   }
}
