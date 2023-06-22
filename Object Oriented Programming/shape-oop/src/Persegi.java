public class Persegi extends Bentuk {
    float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }


    public float hitungLuas() {
        float result;

        result = this.sisi * this.sisi;

        return result;
    }

    public float hitungKeliling() {
        float result;

        result = 4 * this.sisi;

        return result;
    }
}
