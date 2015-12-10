package byui.cit260.youGotNoCake.view;

import java.io.PrintWriter;
import yougotnocake.YouGotNoCake;

public class ErrorView {
    private static final PrintWriter logFile = YouGotNoCake.getOutFile();
    public static void display (String className, String errorMessage){
        logFile.println(
        "________________________________________________"
        + "\n- ERROR - " + errorMessage + " occurred in " + className
        + "\n _____________________________________________");
    }
}
