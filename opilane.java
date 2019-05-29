public class opilane extends Inimene
{
    private String aine;

    public opilane(String n, int byear, String a)
    {
        super(n, byear);
        aine = a;
    }

    public String toString()
    {
        return "opilane[super=" + super.toString() + ",aine=" + aine + "]";
    }
}