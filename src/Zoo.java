public  class Zoo {
    String name;

    public Zoo(String name){
        this.name=name;
    }

    public void feedAnimal(Animal animal, int foodAmount){
            int currenthealth = animal.getHealth();
            animal.setHealth(Math.min(animal.getHealth()+foodAmount,100 ));
            int foodfed = animal.getHealth()-currenthealth;
            System.out.println(animal.name +" Was fed "+ foodfed + " pieces of food" );
        }
    }
