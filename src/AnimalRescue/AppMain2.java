package AnimalRescue;

public class AppMain2 {
    public static void main(String[] args) {
        Animal tigru = new Animal();
        tigru.setName("tigru");
        System.out.println(tigru.getName());

        tigru.setAge(5);
        System.out.println("Varsta animalului este de: " +tigru.getAge() + " ani");

        tigru.setHealth(10);
        System.out.println("Starea de sanatate a animalului este: " +tigru.getHealth());

        tigru.setHungerLevel(1);
        System.out.println("Gradul de foame este de: " +tigru.getHungerLevel());

        tigru.setMoodLevel(4);
        System.out.println("Starea de spirit: " +tigru.getMoodLevel());

        tigru.setFavouriteFood("carne");
        System.out.println("Mancarea favorita este: " +tigru.getFavouriteFood());

        tigru.setFavouriteRecreationalActivities("plimbare");
        System.out.println("Activitatea de recreatie este: " +tigru.getFavouriteRecreationalActivities());


        AnimalFood food = new AnimalFood();
        food.setName("carne");
        System.out.println("Mancarea preferata a animalului este: " + food.getName());

        food.setPrice(40);
        System.out.println("Pretul este: " + food.getPrice());

        food.setQuantity(25);
        System.out.println("Cantitatea este : " + food.getQuantity());

        food.setStockAvailability(70);
        System.out.println("Stocul este : " + food.getStockAvailability());


        RecreationActivity activity = new RecreationActivity();
        activity.setName("plimbare");
        System.out.println("Activitatea recreationala este: " + activity.getName());

        AnimalRescuer rescuer = new AnimalRescuer();
        rescuer.setName("Alexandru");
        System.out.println("Numele persoanei care adopta este: " + rescuer.getName());

        rescuer.setMoneyAvailable(200);
        System.out.println("Banii disponibili : " + rescuer.getMoneyAvailable() + " lei");

        MedicalStaff medical = new MedicalStaff();
        medical.setName("Ionut");
        System.out.println("Numele medicului este: " + medical.getName());

        medical.setSpecialization("veterinar");
        System.out.println("Specializarea medicului este: " + medical.getSpecialization());


        Cat pixel = new Cat();
        pixel.setName("Pixel");
        System.out.println(pixel.getName());
        pixel.eat();
        pixel.run();

        Dog catel=new Dog();
        catel.setName("Fred");
        System.out.println(catel.getName());
        catel.eat();
        catel.run();
        catel.sleep();


        CatFood foodc = new CatFood();
        foodc.dryFood();
        foodc.wetFood();

        DogFood foodd = new DogFood();
        foodd.dryFood();
        foodd.wetFood();

        Girl casa = new Girl();
        casa.houseType();
        casa.anotherPets();

        Boy apart = new Boy();
        apart.tipDeLocuinta();
        apart.anotherPets();

        System.out.println("\nDoctorul are urmatorele atributii: ");
        Doctor doc = new Doctor();
        doc.consult();
        doc.medicalOperation();
        doc.tips();
        doc.animalsVaccination();

        System.out.println("\nAsistenta are urmatorele atributii: ");
        Nurse nur = new Nurse();
        nur.consult();
        nur.medicalOperation();
        nur.tips();
        nur.animalsVaccination();




    }

}
