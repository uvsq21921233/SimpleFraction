package SimpleFraction;
public class Fraction
{
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);
    private int num;
    private int den;

    public Fraction(int numerateur, int denominateur)
    {
        num = numerateur;
        den = denominateur;
    }
    
    public Fraction(int numerateur)
    {
        num = numerateur;
        den = 1;
    }
    
    public int numerateur()
    {
        return num;
    }
    
    public int denominateur()
    {
        return den;
    }
    

    public String toString()
    {
        return num + "/" + den;
    }
    
}