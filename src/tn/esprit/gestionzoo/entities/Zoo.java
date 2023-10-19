package tn.esprit.gestionzoo.entities;
public class Zoo {

    private static final int NUMBER_OF_CAGES = 25;
    private static final int NUMBER_OF_AQUATIC_ANIMALS = 10;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private int nbrAnimals;
    private int nbrAquaticAnimals;

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAquaticAnimals(int nbrAquaticAnimals) {
        this.nbrAquaticAnimals = nbrAquaticAnimals;
    }

    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }

    public static int getNumberOfCages() {
        return NUMBER_OF_CAGES;
    }

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Aquatic[NUMBER_OF_AQUATIC_ANIMALS];
        if (name.isBlank()){
            System.out.println("A zoo must have a name");
        }else {
            this.name = name;
        }
        this.city = city;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (this.isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        aquaticAnimals[nbrAquaticAnimals] = aquatic;
        nbrAquaticAnimals++;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;

        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public float maxPenguinSwimmingDepth(){
        float max=0f;
        for(int i=0;i< nbrAquaticAnimals;i++){
            if(aquaticAnimals[i].getClass() == Penguin.class) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > max) {
                    max = p.getSwimmingDepth();
                }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int d=0,p=0;
        for(int i=0;i< nbrAquaticAnimals;i++){
            if(aquaticAnimals[i].getClass() == Penguin.class) {
                p++;
            } else if (aquaticAnimals[i].getClass() == Dolphin.class) {
                d++;
            }
        }
        System.out.println("Number of Dolphins : "+d+"\nNumber of Penguins : " +p);
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}