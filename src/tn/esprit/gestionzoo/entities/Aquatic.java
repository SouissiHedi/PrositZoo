package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public Aquatic(){
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }


    @Override
    public String toString() {
        return "*********\n    Animal : " +'\n' +
                "family=" + this.getFamily() + ',' + '\n' +
                "name=" + this.getName() + ',' + '\n' +
                "age=" + this.getAge() + ',' + '\n' +
                "isMammal=" + this.isMammal() + ',' + '\n' +
                "habitat=" + habitat+ "\n*********\n";
    }
}
