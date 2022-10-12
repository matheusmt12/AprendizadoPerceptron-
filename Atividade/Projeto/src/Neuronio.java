public class Neuronio {
    private float w0 = 0.5f;
    private int x0 = 1;
    private float[][] w = new float[4][4];
    private int dT = 1;
    private int dH = -1; 
    private float n = 0.4f;
    private int[][] matrizT = { { 1, 1, 1 },
                                { 0, 1, 0 },
                                { 0, 1, 0 } };
    public int getX0() {
        return x0;
    }
    public void setX0(int x0) {
        this.x0 = x0;
    }
    private int[][] matrizH = { { 1, 0, 1 },
                                { 1, 1, 1 },
                                { 1, 0, 1 } };



    // get and set
    public float getW0() {
        return w0;
    }
    public void setW0(float w0) {
        this.w0 = w0;
    }
    public float[][] getW() {
        return w;
    }
    public void setW(float[][] w) {
        this.w = w;
    }
    public int getdT() {
        return dT;
    }
    public void setdT(int dT) {
        this.dT = dT;
    }
    public int getdH() {
        return dH;
    }
    public void setdH(int dH) {
        this.dH = dH;
    }
    public int[][] getMatrizT() {
        return matrizT;
    }
    public void setMatrizT(int[][] matrizT) {
        this.matrizT = matrizT;
    }
    public int[][] getMatrizH() {
        return matrizH;
    }
    public void setMatrizH(int[][] matrizH) {
        this.matrizH = matrizH;
    }
    public float getN() {
        return n;
    }
    public void setN(float n) {
        this.n = n;
    }

    //***** */
    
}
