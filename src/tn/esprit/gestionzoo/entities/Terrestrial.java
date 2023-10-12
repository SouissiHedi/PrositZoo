package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public Terrestrial(){
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs){
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }

    @Override
    public String toString() {
        return "*********\n    Animal : " +'\n' +
                "family=" + this.getFamily() + ',' + '\n' +
                "name=" + this.getName() + ',' + '\n' +
                "age=" + this.getAge() + ',' + '\n' +
                "isMammal=" + this.isMammal() + ',' + '\n' +
                "habitat=" + nbrLegs+ "\n*********\n";
    }

}
