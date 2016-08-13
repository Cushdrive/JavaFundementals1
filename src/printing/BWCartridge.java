package printing;

/**
 * Created by jayson on 8/7/16.
 */
public class BWCartridge implements ICartridge {
    @Override
    public String toString() {
        return "Black and White!";
    }

    @Override
    public String getFillPercentage() {
        return "50%";
    }

    @Override
    public String printColor() {
        return null;
    }
}
