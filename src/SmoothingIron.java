public class SmoothingIron extends HouseholdAppliance{//Праска
    private int temperature;

    public SmoothingIron(){
        temperature = 0;
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
        System.out.println("Праска вимкнута!!!");
    }

    @Override
    public void switching(){
        if (isEnabled()){
            System.out.println("Праска перемикнута. Температура: " + temperature);
            return;
        }
        enable();
        System.out.println("Праска перемикнута. Температура: " + temperature);
    }
}
