import java.util.Arrays;

public class Customer extends Person {

    private String Product[];
    private Size size;

    public Customer(String Name) {
        super(Name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Product=" + Arrays.toString(Product) +
                ", Size='" + Size + '\'' +
                '}';
    }
}
