import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int qtde = 4;
        int num[] = new int[qtde];
        
        for (int i =0; i<qtde; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor ("+i+") :"));
        }
        
        for(int i=0; i<qtde - 1; i++){
            for(int j=i+1;j<qtde;j++){
                if(num[i]>num[j]){
                    int aux = num[j];
                    num[j] = num[i];
                    num[i] = aux;
                }
            }
        }
        
        for(int i= 0; i<qtde;i++){
            JOptionPane.showMessageDialog(null,"valor(" + i +") : "+ num[i]);
        }
    }
}
