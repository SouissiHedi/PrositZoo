package tn.esprit.gestionzoo.entities;

public class Dolphin  extends Aquatic {
    private float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(){
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed){
        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    public void swim(){
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "*********\n    Animal : " +'\n' +
                "family=" + this.getFamily() + ',' + '\n' +
                "name=" + this.getName() + ',' + '\n' +
                "age=" + this.getAge() + ',' + '\n' +
                "isMammal=" + this.isMammal() + ',' + '\n' +
                "habitat=" + this.getHabitat()+ ',' + '\n' +
                "swimming speed=" + swimmingSpeed +"\n*********\n";
    }
}
