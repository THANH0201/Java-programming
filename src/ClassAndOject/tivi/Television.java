package ClassAndOject.tivi;

public class Television {
    private boolean isOn = false;
    private int channel = 0;
    public boolean isOn() {
        return isOn;
    }
    public void pressOnOff() {
        if (isOn) {
            isOn = true;
        }
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {

        if (channel > 10) {
            this.channel = 1;
        }else {
            this.channel = channel;
        }
    }
//public class TelevisionViewer {
    public static void main(String[] args) {
        Television myTV = new Television();
        myTV.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            if (!myTV.isOn())
                myTV.pressOnOff();

            while (!tired) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.setChannel(myTV.getChannel() + 1);
                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }

            myTV.pressOnOff();

            System.out.println("Falling asleep");
        }
    }
}