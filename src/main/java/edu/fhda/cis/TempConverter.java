package edu.fhda.cis;

public class TempConverter {
    float far, cel;

    public static void main() {
    }

    public float convertFtoC(float far) {
        this.far = far;
        cel = (far - 32) / 180 * 100;
        return cel;

    }

    public void convertCtoF() {
        far = 32 + cel * (180 / 100);
    }
}
