package AnimalRescue;

public abstract class Dog extends Animal {

    public void eat () {
        System.out.println ("eating meat");
    }

    public  abstract void run ();

    public void sleep () {
        System.out.println ("sleeping 7 hours per day");
    }
}
