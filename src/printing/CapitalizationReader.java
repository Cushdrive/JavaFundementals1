package printing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by jayson on 8/13/16.
 */
public class CapitalizationReader extends BufferedReader {


    public CapitalizationReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String line = super.readLine();
        if (line != null){
            line = line.toUpperCase();
        } else {
            line = null;
        }
        return line;
    }
}
