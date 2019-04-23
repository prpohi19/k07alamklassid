public class Soldier extends Tegelane{
    String name="Mason";
    String lause = "Alati valmis.";

    public Soldier(Integer Moneyneeded, Integer Successrate, Integer TimetillDone){
        super(Moneyneeded, Successrate, TimetillDone);
    }

    public String getName(){
        return this.name;
    }
    public String getPhrase(){
        return this.lause;
    }
}