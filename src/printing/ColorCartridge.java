package printing;

/**
 * Created by jayson on 8/7/16.
 */
public enum ColorCartridge implements ICartridge {

    RED,
    BLUE,
    GREEN,
    YELLOW;

    @Override
    public String toString() {
        return "Color!";
    }

    @Override
    public String getFillPercentage() {
        return "50%";
    }
}
