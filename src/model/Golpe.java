package model;

public class Golpe {
    private int chuteForte, chuteFraco, socoForte, socoFraco;

    public Golpe(int chuteForte, int chuteFraco, int socoForte, int socoFraco) {
        this.chuteForte = chuteForte;
        this.chuteFraco = chuteFraco;
        this.socoForte = socoForte;
        this.socoFraco = socoFraco;
    }

    public int getChuteForte() {
        return chuteForte;
    }

    public void setChuteForte(int chuteForte) {
        this.chuteForte = chuteForte;
    }

    public int getChuteFraco() {
        return chuteFraco;
    }

    public void setChuteFraco(int chuteFraco) {
        this.chuteFraco = chuteFraco;
    }

    public int getSocoForte() {
        return socoForte;
    }

    public void setSocoForte(int socoForte) {
        this.socoForte = socoForte;
    }

    public int getSocoFraco() {
        return socoFraco;
    }

    public void setSocoFraco(int socoFraco) {
        this.socoFraco = socoFraco;
    }

}
