public class BmiService {
    int calculate(double height, int weight) {
        int bmiIndex = (int) (weight / (height * height));
        return bmiIndex;
    }

}
