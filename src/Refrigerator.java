public class Refrigerator extends HouseholdAppliance{//Холодильник
    private int temperature;

    public Refrigerator(){
        temperature = 5;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (isEnabled()){
            this.temperature = temperature;
            System.out.println("Температура змінена!");
            return;
        }
        System.out.println("Холодильник вимкнутий!!!");
    }
    @Override
    public void switching(){
        if (isEnabled()){
            System.out.println("Холодильник перемикнутий. Температура: " + temperature);
            return;
        }
        System.out.println("Холодильник вимкнутий!!!");
    }
}
