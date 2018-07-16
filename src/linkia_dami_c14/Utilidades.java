package linkia_dami_c14;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utilidades {

    public static int pideEntero(String pregunta) {
        System.out.println(pregunta);
        int num = 0;
        boolean repite = true;
        while (repite) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String op = br.readLine();
                num = Integer.parseInt(op);
                repite = false;
            } catch (Exception a) {
                System.out.println("Numero incorrecto, try again");
            }
        }

        return num;
    }

    public static double pideDouble(String pregunta) {

        System.out.println(pregunta);
        double num = 0;
        boolean repite = true;
        while (repite) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String op = br.readLine();
                num = Double.parseDouble(op);
                repite = false;
            } catch (Exception e) {
                System.out.println("Numero incorrecto, try again");
            }
        }

        return num;
    }
    
}
