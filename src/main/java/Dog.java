public class Dog extends Pet{
    private String breed;

    public Dog(int age, boolean isRescue, String name, String breed) {
        super(age, isRescue, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
