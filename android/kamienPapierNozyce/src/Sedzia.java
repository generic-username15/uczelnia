public class Sedzia {
    public void gra(Player a, Player b){
        String shape_a;
        String shape_b;
        do{
            shape_a = a.play();
            shape_b = b.play();
        }
        while(shape_a.equals(shape_b));

        if (shape_a.equals("Nożyce") && shape_b.equals("Papier") ){
            zwyciezca(a);
        } else if (shape_a.equals("Nożyce") && shape_b.equals("Kamień")) {
            zwyciezca(b);
        } else if (shape_a.equals("Papier") && shape_b.equals("Kamień")) {
            zwyciezca(a);
        } else if (shape_a.equals("Papier") && shape_b.equals("Nożyce")) {
            zwyciezca(b);
        } else if (shape_a.equals("Kamień") && shape_b.equals("Nożyce")) {
            zwyciezca(a);
        } else if (shape_a.equals("Kamień") && shape_b.equals("Papier")) {
            zwyciezca(b);
        }
    }

    public void zwyciezca(Player a){
        System.out.print("Zwycięzca: ");
        a.show();
    }
}
