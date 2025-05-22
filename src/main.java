public class main {
    public static void main(String[] args) {


        Zoo zoo = new Zoo("Wereby zoo");
        Lion lion = new Lion("Lippy");

        zoo.feedAnimal(lion,60);
        System.out.println(lion.getHealth());
    }
}
