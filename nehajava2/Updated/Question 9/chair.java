
public class chair extends furniture{
    boolean fire;
    boolean stress;


  
    public chair(String t, boolean f, boolean s)
    {
        this.fire=f;
        this.stress=s;
    }
    public boolean isFire() {
        return fire;
    }

    public boolean isStress() {
        return stress;
    }
    @Override
    public boolean checkStress()
    {
        return stress;
    }

    @Override
    public boolean checkfire() {
        return fire;
    }
}
