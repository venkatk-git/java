package Polymorphism.DynamicPolymorphism.Overriding.Animal;

interface  Animal{
    public void eat();
}

class Tiger implements Animal{
    public void eat(){
        System.out.println("Tiger eats meat");
    }    
}

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
    }
}
