class Snake extends Animal {
    public void speak() {
        System.out.println("Ssssssssss");
    }
    public void habitat() {
        System.out.println("Snakes live in the jungle");
    }
    public void typesOf() {
        String[] types = {"Rattlesnake", "Cobra", "Mamba"};
        System.out.print("This is a type of snake: ");
        for (String x : types) {
            System.out.print(x + ", ");
        }
        System.out.print("\n");
    }    
}