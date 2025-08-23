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
}
