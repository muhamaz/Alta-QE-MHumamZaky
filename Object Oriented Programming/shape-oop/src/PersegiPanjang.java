public class PersegiPanjang extends Bentuk{

    float panjang;
    float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float hitungLuas(){
        float result;

        result = this.panjang * this.lebar;

        return result;
    }

    public float hitungKeliling(){
        float result;

        result = 2*(this.panjang + this.lebar);

        return result;
    }
}
