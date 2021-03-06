package bataille;

import java.util.Arrays;
import java.util.Scanner;

public final class InputHelper {

    /* **
     * Constructeur
     */
    private InputHelper() {}

    /* **
     * Classe ShipInput, interne � InputHelper
     */
    public static class ShipInput {
        public String orientation;
        public int x;
        public int y;
    }

    /* **
     * Classe CoordInput, interne � InputHelper
     */
    public static class CoordInput {
        public int x;
        public int y;
    }

    /* **
     * M�thodes de la classe InputHelper
     */
    public static ShipInput readShipInput(Scanner sc) {
        ShipInput res = new ShipInput();
        String[] validOrientations = {"n", "s", "e", "w"}; // North, South, East, West
        boolean done = false;

        do {
            try {
                String[] in = sc.nextLine().toLowerCase().split(" ");
                if (in.length == 2) {
                    String coord = in[0];
                    if (Arrays.asList(validOrientations).contains(in[1])) {
                        res.orientation = in[1];
                        res.x = coord.charAt(0) - 'a';
                        res.y = Integer.parseInt(coord.substring(1, coord.length())) - 1;
                        done = true;
                    }
                }
            } catch (Exception e) {
            	// nop
            }

            if (!done) {
                System.err.println("Format incorrect! Entrez la position sous forme 'A0 n'");
            }
        } while (!done && sc.hasNextLine());

        return res;
    }

    public static CoordInput readCoordInput(Scanner sc) {
        CoordInput res = new CoordInput();
        boolean done = false;

        do {
            try {
                String coord = sc.nextLine().toLowerCase();
                res.x = coord.charAt(0) - 'a';
                res.y = Integer.parseInt(coord.substring(1, coord.length())) - 1;
                done = true;
            } catch (Exception e) {
            	// nop
            }

            if (!done) {
                System.err.println("Format incorrect! Entrez la position sous forme 'A0'");
            }
        } while (!done && sc.hasNextLine());

        return res;
    }
}
