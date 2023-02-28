class Animal {
    private int age;
    private String name;
}

class Dog extends Animal {

    public void bark() {
        System.out.println("woof woof!");
    }
}

class JindoDog extends Dog {

    private String origin;
}
