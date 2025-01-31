public class Main {
    public static void main(String[] args) {
        // Create an Animal array to iterate over all classes
        Animal[] animals = {
            new Cow(),
            new Fish(),
            new Snake()
        };
        // enhanced for loop that executes every method for every class
        for (Animal x : animals) {
            x.speak();
            x.habitat();
            x.typesOf();
        }
    }
}