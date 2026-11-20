public class BmiService {
    public int calculate(int bodyMass) {
        double height = 1.87;
        int index = (int) (bodyMass / (height * height));
        return index;
    }
}
