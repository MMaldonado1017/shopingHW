public class Student extends Customer{

    private final long id;
    private static long uniqueID;
    private final double STUDENT_DISCOUNT = .05;

    public Student(String name, Product[] products, Size size) {
        super(name, products, size);
        id = ++uniqueID;
    }

    public long getId() {
        return id;
    }

    @Override
    public double calculateDiscount(Product product) {
        return STUDENT_DISCOUNT * product.getPrice();
    }
}
