package AnimalRescue;

public abstract class AnimalRescuer {

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



    public abstract void houseType ();

    public abstract void anotherPets ();
    }





