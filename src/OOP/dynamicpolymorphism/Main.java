package OOP.dynamicpolymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal animal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of animal do you want?");
        System.out.println("1: Dog. 2: Cat ");
        int chosen = scanner.nextInt();

        ArrayList<Animal> animals = new ArrayList();
        animals.add(new Dog());
        animals.add(new Cat());

        animal = animals.get(chosen-1);
        animal.speak();

//        if(chosen == 1){
//            animal = new Dog();
//            animal.speak();
//        } else if(chosen == 2){
//            animal = new Cat();
//            animal.speak();
//        } else{
//            animal = new Animal();
//            animal.speak();
//        }

//        switch (chosen){
//            case 1: {
//                animal = new Dog();
//                animal.speak();
//            }
//            break;
//            case 2: {
//                animal = new Cat();
//                animal.speak();
//            }
//            break;
//            default:{
//                animal = new Animal();
//                animal.speak();
//            }
//        }

    }
}
