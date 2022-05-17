import java.util.Arrays;

public class Person {
    protected String name, gender, occupation;
    protected Integer age;
    protected String[] occuplation_list = {"doctor", "nurse", "teacher", "police"};
    protected boolean frontliner = false;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        setFrontliner();
    }

    public Person(String name, Integer age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        setFrontliner();
    }

    public Person() {
        setFrontliner();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getOccuplation_list() {
        return occuplation_list;
    }

    public void setOccuplation_list(String[] occuplation_list) {
        this.occuplation_list = occuplation_list;
    }

    public boolean isFrontliner() {
        return frontliner;
    }

    public void setFrontliner() {
        if(Arrays.asList(occuplation_list).contains(this.occupation)){
            frontliner = true;
        }else {
            frontliner = false;
        }
    }
}
