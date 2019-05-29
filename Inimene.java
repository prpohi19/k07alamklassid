public class Inimene
{
    private String name;
    private int birthYear;

    public Inimene(String n, int byear)
    {
        name = n;
        birthYear = byear;
    }

    public String toString()
    {
        return "Inimene[name=" + name + ",birthYear=" + birthYear + "]";
    }
}