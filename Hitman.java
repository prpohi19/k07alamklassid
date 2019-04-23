public class Hitman extends Tegelane{
    String name ="Agent 47";
    String lause = "Tehtud Kiirelt ja märkamatult";

    public Hitman(Integer Moneyneeded, Integer Successrate, Integer TimetillDone){
        super(Moneyneeded, Successrate, TimetillDone);

    }

    public String getName(){
        return this.name;
    }
    public String getPhrase(){
        return this.lause;
    }
}