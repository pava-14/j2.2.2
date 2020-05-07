public class BodyMassIndexService {
    public float calculate (float mass, float height) {
        float bmiResult = mass /(height * height);
        return bmiResult;
    }
}
