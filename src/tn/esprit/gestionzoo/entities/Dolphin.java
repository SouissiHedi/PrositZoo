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
        String a =super.toString();
        return a + ',' + '\n' + "swimming speed=" + swimmingSpeed ;
    }
}
