public class Purjekas extends Veesõiduk{
  private String KapteniNimi = "Tuudur";
  private String KapteniKogemus = "Algaja";
  public Purjekas(String Müratase, String Kütusekulu, String Kiirus, String Mugavus){
    super(Müratase, Kütusekulu, Kiirus, Mugavus);
  }
  public String KuiKogenudOnKapten(){
    return this.KapteniKogemus;
  }
  public String KapteniNimi(){
    return this.KapteniNimi;
  }

}
