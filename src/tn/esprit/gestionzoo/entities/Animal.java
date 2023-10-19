package tn.esprit.gestionzoo.entities;
public sealed class Animal permits Aquatic, Terrestrial {

    protected String family, name;
    protected int age;
    protected boolean isMammal;


    public Animal() {

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setFamily(String family) {
        this.family = family;
    }
    public String getFamily(){
        return this.family;
    }

    public void setIsMammal(Boolean isMammal) {
        this.isMammal = isMammal;

    }

    public boolean isMammal() {
        return this.isMammal;

    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        if (age < 0)
            System.out.println("An animal can't have a negative age");
        else
            this.age = age;
    }


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }



    @Override
    public String toString() {
        return "*********\n    Animal : " +'\n' +
                "family=" + this.getFamily() + ',' + '\n' +
                "name=" + this.getName() + ',' + '\n' +
                "age=" + this.getAge() + ',' + '\n' +
                "isMammal=" + this.isMammal() ;
    }
}