public class Main{
  public static void main(String[] arg){
    SpanishTeacher t1 = new SpanishTeacher("Juan", "como estas?");
    MathTeacher t2 = new MathTeacher("Marek", "1 + 1 equals 2.");
    Teacher[] schoolTeachers = {new MathTeacher("Kalle", "ma ei oska matemaatikat..."), new SpanishTeacher("Barbara", "tengo la camisa negra.")};
    System.out.println(t2.Name());
    System.out.println(t2.Introduce());
    System.out.println("\n");
    System.out.println(t1.Name());
    System.out.println(t1.Introduce());
    System.out.println("\n");
    System.out.println("There are " + schoolTeachers.length + " more teachers in " + Teacher.school + "\n");

  }
}
