package soft1841.day10;

public class Computer implements Comparable<Computer> {
    private String name;
    private Integer id;

    public Computer(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Computer computer) {
        return this.getId() - computer.getId();
    }
}
