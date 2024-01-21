abstract class HouseholdAppliance {
    private boolean enabled;

    public HouseholdAppliance(){
        this.enabled = false;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void enable(){
        enabled = true;
        System.out.println(this.getClass().getSimpleName() + " увімкнено.");
    }
    public void turnOff(){
        enabled = false;
        System.out.println(this.getClass().getSimpleName() + " вимкнено.");
    }

    public abstract void switching();
}
