package Interface;

public class Bear implements Herbivorous,Carnivourous {
    @Override
    public void eat() {
        System.out.println("I eat both ");
    }
}
