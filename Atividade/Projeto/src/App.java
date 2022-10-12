import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Neuronio W = new Neuronio();

        int [][] padraoH = W.getMatrizH();
        int [][] padraoT = W.getMatrizT();

        boolean t1 = false;
        boolean t2 = false;

        float [][] pesos = new float [4][4];
        
        pesos[0][0] = 0.5f;
        pesos[0][1] = 0.3f;
        pesos[0][2] = -0.5f;
        pesos[1][0] = -0.8f;
        pesos[1][1] = 0.9f;
        pesos[1][2] = -0.1f;
        pesos[2][0] = 0.7f;
        pesos[2][1] = -0.6f;
        pesos[2][1] = 0.4f;

        System.out.println("Pesos antes");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(pesos[i][j] + " ");
            }
            System.out.println();
        }



        while (!t1 || !t2) {
            
            if(Validar(pesos, padraoH) == W.getdH()){
                t1 = true;
            }else{
                int y = Validar(pesos, padraoH);
                ReajustePeso(pesos, padraoH, W.getdH(), y);
                t1 = false;
            }

            if (Validar(pesos, padraoT) == W.getdT()) {
                t2 = true;
            }else{
                int y = Validar(pesos, padraoT);
                ReajustePeso(pesos, padraoT, W.getdT(), y);
                t2 = false;
            }


        }

      
        System.out.println("Pesos depois");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(" " + pesos[i][j] + " ");
            }
            System.out.println();
        }
   

    }

    public static int Validar (float[][] w, int[][] padrao){
        Neuronio aux = new Neuronio();
        float x0 = aux.getW0() * aux.getX0();
        float x1 = w[0][0] * padrao[0][0];
        float x2 = w[0][1] * padrao[0][1];
        float x3 = w[0][2] * padrao[0][2];
        float x4 = w[1][0] * padrao[1][0];
        float x5 = w[1][1] * padrao[1][1];
        float x6 = w[1][2] * padrao[1][2];
        float x7 = w[2][0] * padrao[2][0];
        float x8 = w[2][1] * padrao[2][1];
        float x9 = w[2][2] * padrao[2][2];

        if (x0 + x1 + x2 + x3 + x4 + x5 + x6 +x7 +x8 +x9 >= 0 ){
            return 1;
        }
        else{
            return -1;
        }
    }

    public static float [][] ReajustePeso (float[][] w, int[][] padrao, int d, int y){
        
        Neuronio aux = new Neuronio();

        aux.setW0(aux.getW0() + (aux.getN() * aux.getX0() * (d - (y))));
        w[0][0] = w[0][0] + (aux.getN() * padrao[0][0]*(d - (y)));
        w[0][1] = w[0][1] + (aux.getN() * padrao[0][1]*(d - (y)));
        w[0][2] = w[0][2] + (aux.getN() * padrao[0][2]*(d - (y)));
        w[1][0] = w[0][0] + (aux.getN() * padrao[1][0]*(d - (y)));
        w[1][1] = w[1][1] + (aux.getN() * padrao[1][1]*(d - (y)));
        w[1][2] = w[1][2] + (aux.getN() * padrao[1][2]*(d - (y)));
        w[2][0] = w[2][0] + (aux.getN() * padrao[2][0]*(d - (y)));
        w[2][1] = w[2][1] + (aux.getN() * padrao[2][1]*(d - (y)));
        w[2][2] = w[2][2] + (aux.getN() * padrao[2][2]*(d - (y)));
        return w;
    }

}
