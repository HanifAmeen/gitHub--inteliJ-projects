public class Lion extends Animal {
    int age;

    public Lion(String name){
        super(name,60);


    }

    @Override
    public void makeSound(){
        System.out.println("Lion goes roar");
    }
}
