package exercises;

import java.util.Locale;

public class StringmethodMikeDane {
    public static void main(String[] args) {
        String phase="Renas Tech";

        System.out.println(phase);

        System.out.println(phase.contains("tech"));
        System.out.println(phase.contains("Renas"));

        System.out.println(phase.toUpperCase());
        String uc=phase.toUpperCase(Locale.ROOT);

        System.out.println(phase.toLowerCase());

        System.out.println(phase.length());

        System.out.println(phase.charAt(0));
        System.out.println(phase.charAt(2));

        System.out.println(phase.indexOf("a"));
        System.out.println(phase.indexOf("ch"));

        System.out.println(phase.lastIndexOf("e"));

        System.out.println(phase.substring(0,7));
        System.out.println(phase.substring(0,phase.indexOf(" ")));


    }
}
