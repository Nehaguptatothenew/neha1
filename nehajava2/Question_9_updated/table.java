public class table extends furniture{
    choices type;
    boolean fire;
    boolean stress;

    public choices getType() {
        return type;
    }

    public void setType(choices type) {
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

    public table(choices type, boolean fire, boolean stress) {
        this.type = type;
        this.fire = fire;
        this.stress = stress;
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
