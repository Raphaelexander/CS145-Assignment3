class Cow extends Animal {
    
    public void speak() {
        System.out.println("MOOOOOOOOOO");
        }
    void habitat() {
        System.out.println("Cow lives on a farm.");
        }
    void typesOf() {
        String[] types = {"Holstein", "Hereford", "Jersey"};
        System.out.print("This is a type of cow: ");
        for (String x : types) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }
}