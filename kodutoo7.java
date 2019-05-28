public class kodutoo7{
    public static void main(String[] args) {
        intel intelprose = new intel("9900k", 3.6, 8);
        amd amdprose = new amd("2200g", 3.5, 4);
        /*protsessor[] prosed = new protsessor[2];
        prosed[0] = intelprose;
        prosed[1] = amdprose;
        int i = 0;
        for(protsessor m: prosed){
            System.out.println(i+". Protsessor");
            System.out.println("Tegemist on "+m.getTootja()+" Protsessoriga");
            System.out.println("Protsessori mudel on "+m.mudel);
            System.out.println("Protsessor jookseb "+m.tuumad+" peal ja töösagedus on "+m.sagedus+" GHz");
            i++;
        }*/
        intelprose.specs();
        amdprose.specs();

    }
}