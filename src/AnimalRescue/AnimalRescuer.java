package AnimalRescue;

public class AnimalRescuer {

    public String name;
    public int moneyAvailable ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(int moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public void houseType () {
        System.out.println ("casa sau apartamnet");
    }

    public void anotherPets () {
        System.out.println ("da sau nu");
    }

}




