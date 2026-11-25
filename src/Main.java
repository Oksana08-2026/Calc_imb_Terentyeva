public class Main {
    public static void main(String[] args) {
      BmiService service = new BmiService();
      int bodyMass = 98;
      double height = 1.87;
      int index = service.calculate(bodyMass, height);
      System.out.println(index);
    }
}
