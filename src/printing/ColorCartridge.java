package printing;

/**
 * Created by jayson on 8/7/16.
 */
public enum ColorCartridge implements ICartridge {

    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    YELLOW("Yellow");

    private final String colorText;

    private ColorCartridge(String colorText) {
        this.colorText = colorText;
    }

    @Override
    public String toString() {
        return "Color!";
    }

    @Override
    public String notOverride() {
        return "blah";
    }

    @Override
    public String getFillPercentage() {
        return "50%";
    }

    @Override
    public String printColor() {
        return colorText;
    }
}
