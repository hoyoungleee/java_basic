package etc.stream;

public class DishDetail {
    private String name;
    private String type;

    public DishDetail(Dish dish) {
        this.name = dish.getName();
        this.type = dish.getType().getDesc();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
