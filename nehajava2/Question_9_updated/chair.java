
public class chair extends furniture{
    boolean fire;
    boolean stress;
    choices type;


    public chair( choices type,boolean fire, boolean stress) {
        this.fire = fire;
        this.stress = stress;
        this.type = type;
    }

    public boolean isFire() {
        return fire;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public boolean isStress() {
        return stress;
    }


    public void setStress(boolean stress) {
        this.stress = stress;
    }

    public choices getType() {
        return type;
    }

    public void setType(choices type) {
        this.type = type;
    }

    @Override
    public boolean checkStress() {
        return false;
    }

    @Override
    public boolean checkfire() {
        return false;
    }
}
