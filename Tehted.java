public class Tehted {
    static double keskmineBrutoPalk(Palk[] palgad){
        int brutoKokku = 0;
        int tootajaidKokku = 0;
        for (Palk palk:palgad) {
            if (palk instanceof Tootaja) {
                brutoKokku += palk.bruto;
                tootajaidKokku++;
            }
        }
        return brutoKokku / tootajaidKokku *1.0;
    }

    static double keskmineNetoPalk(Palk[] palgad){
        int netoKokku = 0;
        int tootajaidKokku = 0;
        for (Palk palk:palgad) {
            if (palk instanceof Tootaja) {
                netoKokku += palk.arvestaMaksud();
                tootajaidKokku++;
            }
        }
        return netoKokku / tootajaidKokku *1.0;
    }
}
