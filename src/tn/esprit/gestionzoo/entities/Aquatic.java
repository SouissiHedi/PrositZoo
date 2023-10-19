package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {
    protected String habitat;

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


    public boolean equals(Aquatic anotherObject){
        return this.name == anotherObject.name && this.age == anotherObject.age && this.habitat == anotherObject.habitat;
    }

    @Override
    public String toString() {
        return super.toString() +  ',' + '\n' +"habitat=" + habitat;
    }
}
