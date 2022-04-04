package Utils;

import java.util.concurrent.TimeUnit;

public class Pause {

    public static void pause(Integer seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
