package creature;

public class FarmAnimal extends Animal implements Edbile{

    boolean beEaten = false;

    public FarmAnimal(String species) {
        super(species);
    }

    void setBeEaten(){
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println(this.species + "was eaten");
    }

    @Override
    public void beEaten(Animal animal) {
        if(beEaten == false){
            System.out.println("NIE JADALNE");
        }else {
            System.out.println("JADALNE");
        }
    }
}
