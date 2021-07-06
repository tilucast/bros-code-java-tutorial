public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Vodka", "Penis", "Covert"};
        cars[cars.length - 1] = "Mustang";
        System.out.println(cars[cars.length - 1]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        String[] penises = new String[2];
        penises[0] = "Black";
        penises[1] = "White";

        for (int i = 0; i < penises.length; i++) {
            System.out.println(penises[i]);
        }
    }
}
