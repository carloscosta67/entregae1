import javax.swing.JOptionPane;

class Fracao { // classe
    public int numerador;
    public int denominador;

    public Fracao(int num, int den) { // Construtor
        numerador = num;
        denominador = den;
    }

    public void multiplicacao(int x, int y) { // metodos
        numerador = numerador * x;
        denominador = denominador * y;
        JOptionPane.showMessageDialog(null, numerador + "/" + denominador);
    }

    public void divisao(int x, int y) {
		numerador = numerador * y;
		denominador = denominador * x;
		JOptionPane.showMessageDialog(null, numerador + "/" + denominador);
	}
    

    public void adicao(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        this.numerador = novoNumerador;
        this.denominador = novoDenominador;
        JOptionPane.showMessageDialog(null, this.numerador + "/" + this.denominador);
    }

    public void subtracao(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        this.numerador = novoNumerador;
        this.denominador = novoDenominador;
        JOptionPane.showMessageDialog(null, this.numerador + "/" + this.denominador);
    }
}

public class CalculoFracao {
    public static void main(String args[]) {
        int num, den;
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe o numerador:"));
        den = Integer.parseInt(JOptionPane.showInputDialog("Informe o denominador:"));

        Fracao dados = new Fracao(num, den);

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1-Multiplicação \n 2-Divisão \n 3-Adição \n 4- Subtração \n 5- Sair"));

            if (op == 1) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o numerador:"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("Informe o denominador:"));
                dados.multiplicacao(x, y);
            }

            if (op == 2) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o numerador:"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("Informe o denominador:"));
                dados.divisao(x, y);
            }

            if (op == 3) {
				int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o numerador:"));
				int y = Integer.parseInt(JOptionPane.showInputDialog("Informe o denominador:"));
				Fracao outra = new Fracao(x, y);
				dados.adicao(outra);
			}
			
			if (op == 4) {
				int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o numerador:"));
				int y = Integer.parseInt(JOptionPane.showInputDialog("Informe o denominador:"));
				Fracao outra = new Fracao(x, y);
				dados.subtracao(outra);
				JOptionPane.showMessageDialog(null, dados.numerador + "/" + dados.denominador);
        }
        
    } while (op != 5);

    System.exit(0);
}
			
}
