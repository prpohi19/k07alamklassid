import java.util.*;

public class Main {
    public static void main(String[] arg){
        Opilane op1 = new Opilane("Juhan", "käin 2. kursusel", Haridus.KESKKOOL, Instituut.IT);
        Opilane op2 = new Opilane("Markus", "käin 5. kursusel", Haridus.KESKKOOL, Instituut.LOODUS);
        Opilane op3 = new Opilane("Liisa", "käin 6. kursusel", Haridus.KESKKOOL, Instituut.MEEDIA);

        Oppejoud oj1 = new Oppejoud("Artur", "õpetan ajakirjandust", Haridus.BAKALAUREUS, Instituut.MEEDIA);
        Oppejoud oj2 = new Oppejoud("Sirje", "õpetan bioloogiat", Haridus.DOKTOR, Instituut.LOODUS);
        Oppejoud oj3 = new Oppejoud("Tiiu", "õpetan Rubyt", Haridus.MAGISTER, Instituut.IT);

        MuuIsik mu1 = new MuuIsik("Priit", "koristan ruume", Haridus.BAKALAUREUS);
        MuuIsik mu2 = new MuuIsik("Rein", "valvan kooli");
        MuuIsik mu3 = new MuuIsik("Anu", "käin lapsel külas", Instituut.IT);

        Kooliskaija[] inimhulk = { op1, op2, op3, oj1, oj2, oj3, mu1, mu2, mu3 };

        List<Kooliskaija> ithulk = FiltreeriInstituudiJargi(inimhulk, Instituut.IT);
        List<Kooliskaija> oppejoududeHulk = FiltreeriOppejoud(inimhulk);

        for (Kooliskaija isik : ithulk){
            isik.tutvustaEnd();
            isik.tutvustaHaridust();
        }

        System.out.println();

        for (Kooliskaija isik : oppejoududeHulk){
            isik.tutvustaEnd();
            isik.tutvustaHaridust();
        }

        System.out.println();

        oj2.hindeSeos(Hinne.C);
        op2.hindeSeos(Hinne.C);
        mu2.hindeSeos(Hinne.C);

    }

    static List<Kooliskaija> FiltreeriInstituudiJargi (Kooliskaija[] inimesed, Instituut instituut){
        List<Kooliskaija> vastus = new ArrayList<Kooliskaija>();
        for(Kooliskaija k: inimesed){
            if(k.instituut == instituut){
                vastus.add(k);
            }
        }
        return vastus;
    }

    static List<Kooliskaija> FiltreeriOppejoud(Kooliskaija[] inimesed){
        List<Kooliskaija> vastus = new ArrayList<Kooliskaija>();
        for(Kooliskaija k: inimesed){
            if(k instanceof Oppejoud){
                vastus.add(k);
            }
        }
        return vastus;
    }
}
