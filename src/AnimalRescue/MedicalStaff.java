package AnimalRescue;

public class MedicalStaff {
    private String name ;
    private String specialization ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void medicalOperation () {
        System.out.println ("opereaza animalele");
    }

    public void consult () {
        System.out.println ("consulta animalele");
    }

    public void tips () {
        System.out.println ("sfaturi de crestere a animalelor");
    }

    public void animalsVaccination () {
        System.out.println ("vaccinarea animalelor");
    }

}
