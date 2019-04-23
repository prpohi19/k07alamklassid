public abstract class Tegelane{
    int money;
    int srate;
    int time;

    public Tegelane(Integer Moneyneeded, Integer Successrate, Integer TimetillDone){
      money = Moneyneeded;
      srate = Successrate;
      time = TimetillDone;
    }
    public abstract String getName();
    public abstract String getPhrase();
    
}

