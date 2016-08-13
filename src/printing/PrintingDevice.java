package printing;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by jayson on 8/13/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintingDevice {

    String defaultPrintMethod();
    int defaultNumberOfCopies();
}
