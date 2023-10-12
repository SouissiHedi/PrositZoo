package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(){
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }

    @Override
    public String toString() {
        return "*********\n    Animal : " +'\n' +
                "family=" + this.getFamily() + ',' + '\n' +
                "name=" + this.getName() + ',' + '\n' +
                "age=" + this.getAge() + ',' + '\n' +
                "isMammal=" + this.isMammal() + ',' + '\n' +
                "habitat=" + this.getHabitat()+ ',' + '\n' +
                "swimming depth=" + swimmingDepth +"\n*********\n";
    }

}
