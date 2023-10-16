public class Osiol implements Player{
    @Override
    public String play(){
        System.out.println("Osioł: Kamień");
        return "Kamień";
    }
    @Override
    public void show(){
        System.out.println("Malpa");
    }
}
