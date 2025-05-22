public class Elephant extends Animal {
    int age;


    public Elephant(String name, int age){
        super(name,80);
        this.name=name;
        this.age = age;
    }

    @Override
    public void makeSound(){
        System.out.println("Lion goes roar");
    }
}
