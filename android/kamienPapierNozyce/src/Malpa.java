import java.util.Random;

public class Malpa implements Player{
    @Override
    public String play(){
        Random generator = new Random();
        double rand = generator.nextDouble() * 3;
        if(rand <= 1){
            System.out.println("Małpa: Papier");
            return "Papier";
        } else if (rand <= 2) {
            System.out.println("Małpa: Nożyce");
            return "Nożyce";
        }
        else{
            System.out.println("Małpa: Kamień");
            return "Kamień";
        }
    }
    @Override
    public void show(){
        System.out.println("Malpa");
    }
}
