public class InheritanceDemo_18 {
    static class Animal {
        void makeSound() { System.out.println("Some generic sound"); }
    }
    static class Dog extends Animal {
        @Override
        void makeSound() { System.out.println("Bark!"); }
    }
    static class Cat extends Animal {
        @Override
        void makeSound() { System.out.println("Meow!"); }
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}