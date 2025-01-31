abstract class Animal { //creat abstract class so only subclasses can access

    public abstract void speak();//initialize abstract method for subclasses to use
    public abstract void habitat();//initialize abstract method for subclasses to use
    
    //initialize a string array to hold every type of different animal
    void typesOf() {
        String[] types = new String[3];
    }
}