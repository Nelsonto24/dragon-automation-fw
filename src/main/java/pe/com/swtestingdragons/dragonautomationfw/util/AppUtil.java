package pe.com.swtestingdragons.dragonautomationfw.util;

import java.util.Random;

public class AppUtil {

    public static String generateRandomNumber() {

        Integer randomNumber = (new Random()).nextInt(900000) + 100000;
        return "" + randomNumber;
    }
}