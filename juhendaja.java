public class juhendaja extends Inimene
{
    private double palk;

    public juhendaja(String n, int byear, double s)
    {
        super(n, byear);
        palk = s;
    }

    public String toString()
    {
        return "Töötaja[super=" + super.toString() + ",palk=" + palk + "]";
    }
}