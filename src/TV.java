public class TV extends HouseholdAppliance{//Телевізор
    private int channel;

    public TV(){
        channel = 1;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (isEnabled()){
            this.channel = channel;
            System.out.println("Канал змінений!");
            return;
        }
        System.out.println("Телевізор вимкнутий!!!");
    }

    @Override
    public void switching(){
        if (isEnabled()){
            System.out.println("Телевізор перемикнутий на канал №" + channel);
            return;
        }
        enable();
        System.out.println("Телевізор перемикнутий на канал №" + channel);
    }
}
