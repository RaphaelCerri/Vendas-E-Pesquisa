
import javax.swing.JOptionPane;

public class desafio1H {

    public static void main(String[] args) {
        String nom1, nom2, nom3, nom4, nom5;
        nom1 = JOptionPane.showInputDialog(null, "Digite o nome 1:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE);
        nom2 = JOptionPane.showInputDialog(null, "Digite o nome 2:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE);
        nom3 = JOptionPane.showInputDialog(null, "Digite o nome 3:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE);
        nom4 = JOptionPane.showInputDialog(null, "Digite o nome 4:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE);
        nom5 = JOptionPane.showInputDialog(null, "Digite o nome 5:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE);

        String Nom[] = {nom1, nom2, nom3, nom4, nom5};
        
        
        int vend1, vend2, vend3, vend4, vend5;
        vend1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as vendas do 1:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE));
        vend2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as vendas do 2:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE));
        vend3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as vendas do 3:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE));
        vend4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as vendas do 4:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE));
        vend5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as vendas do 5:",
                "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE));

        int Vend[] = {vend1, vend2, vend3, vend4, vend5};

  int pmaior = 0;
        int pmenor = 0;
        int maior = 0;
        int menor = 0;
        int media = 0;
        int sup = 0;
        
        for (int i = 0; i < Vend.length; i++) {
            media = media + Vend[i];
            if (i == 0) {
                pmaior = i;
                maior = Vend[i];

                pmenor = i;
                menor = Vend[i];
            } else {

                if (Vend[i] > maior) {
                    maior = Vend[i];
                    pmaior = i;
                    if (pmaior > 0) {
                        sup = sup + 1;
                    }
                }

                if (Vend[i] < menor) {
                    menor = Vend[i];
                    pmenor = i;
                }

            }

        }

        System.out.println("Menor venda " + Nom[pmenor]);
        System.out.println("Maior venda " + Nom[pmaior]);
        System.out.println("Média " + media / 5);
        System.out.println("Quantas vezes foi superada " + sup);
      
    }
}
