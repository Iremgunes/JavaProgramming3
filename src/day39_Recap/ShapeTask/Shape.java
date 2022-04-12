package day39_Recap.ShapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("name cannot be null");
            System.exit(0);
        }

        if(name.isEmpty() || name.isBlank()){
            System.err.println("invalid name");
            System.exit(0);
        }

        this.name = name;
    }

    public Shape(String name){
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public String toString() {
        return "Shape { " +
                "name=' " + '\'' +
                ", area = '" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }

}
