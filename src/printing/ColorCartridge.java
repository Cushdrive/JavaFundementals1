package printing;

/**
 * Created by jayson on 8/7/16.
 */
public class ColorCartridge implements ICartridge {
    @Override
    public String toString() {
        return "Color!";
    }

    @Override
    public String getFillPercentage() {
        return "50%";
    }
}
