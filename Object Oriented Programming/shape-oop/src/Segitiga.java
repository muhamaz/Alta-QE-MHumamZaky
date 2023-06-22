public class Segitiga extends Bentuk{
    float alas;
    float tinggi;
    float sisi1, sisi2, sisi3;

    public float hitungLuas() {

        float result = alas * tinggi / 2;

        return result;
    }

    public float hitungKeliling() {

        float result = sisi1 + sisi2 + sisi3;

        return result;
    }
}

