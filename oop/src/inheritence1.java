class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name; this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    } public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
class Cat extends Animal {
    private boolean isIndoor;
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age); this.isIndoor = isIndoor;
    }
    public boolean getIsIndoor() {
        return isIndoor;
    }
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
/*

1
The current code is the far most the easiest example of inheritance.
Here we can see that there are two sub classes of the Animal class ->Cat and Dog.
The subclasses Cat and Dog gets Most of the features of their parent class while still having
their own features such as they keep name and age common and overrides the make sound class as
both animals sound different.

2
Using the inheritance method the code has got some advantages that have made the code
easier to change, reusable and short.Inheritance keeps all the common features in a
single class and lets other classes use that piece of code over and over again.
As a result of that we can do adjustments that can be applied all over the child classes
And using the parent class we can easily write any code that uses the common features very quickly
*/