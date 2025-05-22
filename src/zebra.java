public class zebra extends Animal {

    int age;


    public zebra(String name, int age, int health){
        super(name,50);
        this.age = age;
    }

    @Override
    public void makeSound(){
        System.out.println("Lion goes roar");
    }
}
