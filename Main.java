public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Cow(),
            new Fish(),
            new Snake()
        };
        for (Animal x : animals) {
            x.speak();
            x.habitat();
            x.typesOf();
        }
    }
}