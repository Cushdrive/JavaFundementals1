package printing;

/**
 * Created by jayson on 7/23/16.
 */
public class Machine {
    protected boolean isOn;

    public Machine (boolean isOn) {
        this.isOn = isOn;
    }

    public void TurnOn() {
        System.out.println("Machine is on");
        isOn = true;
    }

    public void TurnOff() {
        isOn = false;
    }
}
