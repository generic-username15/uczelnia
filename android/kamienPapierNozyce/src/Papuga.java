import java.util.Random;

public class Papuga implements Player{
    @Override
    public String play(){
        Random generator = new Random();
        double rand = generator.nextDouble() * 2;
        if(rand <= 1){
            System.out.println("Papuga: Papier");
            return "Papier";
        }
        else{
            System.out.println("Papuga: Kamień");
            return "Kamień";
        }
    }
    @Override
    public void show(){
        System.out.println("Malpa");
    }
}
