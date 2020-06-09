package AnimalRescue;

public abstract class Animal {

    private String name;
    private int age;
    private int health;
    private int hungerLevel;
    private int moodLevel;
    private String favouriteFood;
    private String favouriteRecreationalActivities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteRecreationalActivities() {
        return favouriteRecreationalActivities;
    }

    public void setFavouriteRecreationalActivities(String favouriteRecreationalActivities) {
        this.favouriteRecreationalActivities = favouriteRecreationalActivities;
    }

    public abstract void eat ();

    public abstract void run ();

    public abstract void sleep ();

}
