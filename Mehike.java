public class Mehike extends Tegelane{
    String name ="Bob";
    String lause="Odav";

    public Mehike(Integer Moneyneeded, Integer Successrate, Integer TimetillDone){
        super(Moneyneeded, Successrate, TimetillDone);
    }
    public String getName(){
        return this.name;
    }
    public String getPhrase(){
        return this.lause;
    }
}