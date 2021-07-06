public class MultiDimensionArrays {
    public static void main(String[] args) {
        String[][] cars = new String[2][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Penis";
        cars[0][2] = "Corvet";

        cars[1][0] = "Honda";
        cars[1][1] = "Ferrari";
        cars[1][2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j <  cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
