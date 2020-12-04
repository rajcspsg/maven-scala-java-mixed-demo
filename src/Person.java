
import java.io.*;
import java.util.Objects;

class Person implements Serializable {

    private Integer i;
    private String desc;

    public Person(Integer i, String desc) {
        this.i = i;
        this.desc = desc;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person)) return false;
        if (!super.equals(object)) return false;
        Person person = (Person) object;
        return java.util.Objects.equals(i, person.i) &&
                java.util.Objects.equals(desc, person.desc);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), i, desc);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "i=" + i +
                ", desc='" + desc + '\'' +
                '}';
    }

    public User toUser() {
        return new User(i, desc);
    }
}