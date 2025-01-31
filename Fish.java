class Fish extends Animal {
    public void speak() {
        System.out.println("Blub blub");
    }
    public void habitat() {
        System.out.println("Fish live in the water");
    }
    public void typesOf() {
        String[] types = {"Salmon", "Barracuda", "Clownfish"};
        System.out.print("This is a type of fish: ");
        for (String x : types) {
            System.out.print(x + ", ");
        }
        System.out.print("\n");
    }
}    