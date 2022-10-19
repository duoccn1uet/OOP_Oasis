
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /**
     * .
     */
    public Person() {
    }

    /**
     * .
     *
     * @param name    .
     * @param age     .
     * @param address .
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * .
     *
     * @param person .
     * @return .
     */
    @Override
    public int compareTo(Person person) {
        if (name.equals(person.getName())) {
            return Integer.compare(age, person.getAge());
        }
        return name.compareTo(person.getName());
    }
}