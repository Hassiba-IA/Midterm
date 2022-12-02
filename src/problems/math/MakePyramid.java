package problems.math;

public class MakePyramid {

    /*

    Implement a large Pyramid of stars in the screen with java.

          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *

     */

    public static void buildPyramid(int nbrLignes){

        for (int nomLigne = 1; nomLigne <= nbrLignes; nomLigne++) {

            // il faut afficher (nbLignes - noLigne) espaces pour la ligne noLigne
            for (int i = nbrLignes - nomLigne; i > 0; i--)
                System.out.print(" ");
            // il faut afficher (2 * noLigne - 1) '*' pour la ligne noLigne
            for (int i = 0; i < 2 * nomLigne - 1; i++)
                System.out.print("*");
            // retour à la ligne suivante
            System.out.println();
        }
    }
    public static void main(String[] args) {
        buildPyramid(8);


    }

}
