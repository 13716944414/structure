package hashTable;

/**
 * @author jiangjiaxin
 * @date 2018-02-27 15:18
 */
public class Info {

    private String id;

    private String name;

    private int age;

    public Info(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Info(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
