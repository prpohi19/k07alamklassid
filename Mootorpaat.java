public class Mootorpaat extends Veesõiduk{
  private String KapteniNimi = "Svensson";
  private String KapteniKogemus = "Kogenud";
  public Mootorpaat(String Müratase, String Kütusekulu, String Kiirus, String Mugavus){
    super(Müratase, Kütusekulu, Kiirus, Mugavus);
  }
  public String KuiKogenudOnKapten(){
    return this.KapteniKogemus;
  }
  public String KapteniNimi(){
    return this.KapteniNimi;
  }

}
