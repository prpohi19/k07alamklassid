public abstract class Veesõiduk{
  String müra;
  String kulu;
  String kiirus;
  String mugavus;

  public abstract String KapteniNimi();
  public abstract String KuiKogenudOnKapten();

  public Veesõiduk(String Müratase, String Kütusekulu, String Kiirus, String Mugavus){
    müra = Müratase;
    kulu=Kütusekulu;
    kiirus=Kiirus;
    mugavus=Mugavus;
  }


  public String KuiValjuSaOled(){
    return müra;
  }


}
