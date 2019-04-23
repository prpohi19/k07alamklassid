public class Main{
    public static void main(String[] arg){
        
        Hitman hitman = new Hitman(20000, 90, 60);
        Soldier soldier = new Soldier(10000, 60, 180);
        Mehike mehike = new Mehike(4000, 20, 100);
        Tegelane[] tegelane = new Tegelane[3];
        tegelane[0] = hitman;
        tegelane[1] = soldier;
        tegelane[2] = mehike;
        
        for(Tegelane c:tegelane){
            System.out.println(c.getPhrase());
        }
        System.out.println();

        for(Tegelane t: tegelane){
            System.out.println("Tegelane:"+t.getName()+", Raha vaja: "+t.money+" Õnnestumise %: "+t.srate+", aega kulub: "+t.time+"min");
        }
    }
}

/*Tehtud Kiirelt ja märkamatult
Alati valmis.
Odav

Tegelane:Agent 47, Raha vaja: 20000 Õnnestumise %: 90, aega kulub: 60min
Tegelane:Mason, Raha vaja: 10000 Õnnestumise %: 60, aega kulub: 180min
Tegelane:Bob, Raha vaja: 4000 Õnnestumise %: 20, aega kulub: 100min*/
