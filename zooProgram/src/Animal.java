public abstract class Animal {
   private int health;
   String name;

    public Animal(String name,int health){
       this.health=health;
       this.name=name;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health=health;
    }


    public abstract void makeSound();

}
