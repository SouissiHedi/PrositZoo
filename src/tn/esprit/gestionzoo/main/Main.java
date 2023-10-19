package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setIsMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));


        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println("\n--------------------------------------------------------------\n");

        Aquatic animalAqua = new Aquatic("balaine", "dory", 2, true,"b7ar");
        Terrestrial animalTerr = new Terrestrial("3asafir", "batta", 1, false,2);
        Dolphin dolphino = new Dolphin("dolphin","zouhayer",3,true,"b7ar", 55.66F);
        Penguin batta = new Penguin("penguin","mkastem",1,false,"b7ar",700.54F);
        System.out.println(animalAqua);
        System.out.println(animalTerr);
        System.out.println(dolphino);
        System.out.println(batta);

        System.out.println("\n--------------------------------------------------------------\n");

        animalAqua.swim();
        dolphino.swim();
        batta.swim();

        System.out.println("\n--------------------------------------------------------------\n");

        myZoo.addAquaticAnimal(animalAqua);
        myZoo.addAquaticAnimal(dolphino);
        myZoo.addAquaticAnimal(batta);

        Aquatic[] a= myZoo.getAquaticAnimals();
        for(int i=0;i< myZoo.getNbrAquaticAnimals();i++){
            a[i].swim();
        }


        Penguin batta2 = new Penguin("penguin","kahla",4,false,"b7ar",100.54F);
        Penguin batta3 = new Penguin("penguin","kahla",3,false,"b7ar",300.54F);

        myZoo.addAquaticAnimal(batta2);
        myZoo.addAquaticAnimal(batta3);

        System.out.println(myZoo.maxPenguinSwimmingDepth());

        myZoo.displayNumberOfAquaticsByType();

        System.out.println(batta2.equals(batta3));
    }
}