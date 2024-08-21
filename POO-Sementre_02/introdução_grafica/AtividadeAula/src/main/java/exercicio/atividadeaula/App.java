/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package exercicio.atividadeaula;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class App {

    static ContaBancaria[] contas = new ContaBancaria[10];
    static int qntContas = 0;

    public static void main(String[] args) {

        int comando = 0;
        boolean executar = true;
        do {
            comando = Integer.parseInt(JOptionPane.showInputDialog(null, "Ecolha uma opção:\n 1-Cadastar\n2-Sacar\n3-Depositar\n4-Sair"));
            switch (comando) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    executar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "comando invalido");
            }
        } while (executar);
    }

    public static ContaBancaria buscar(String numero) {
        if (qntContas == 0) {
            return null;
        }
        for (ContaBancaria cb: contas) {
            if (cb.getNumero().equals(numero)) {
                return cb;
            }
        }
        return null;
    }

    public static void criarConta() {
        String titular = JOptionPane.showInputDialog(null, "Informe o nome do titular");
        String numero = JOptionPane.showInputDialog(null, "Informe o nomero do titular");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada != null) {
            JOptionPane.showMessageDialog(null, "Conta ja cadastrada");
            return;
        }
        selecionada = new ContaBancaria();
        selecionada.setNumero(numero);
        selecionada.setTitular(titular);
        contas[qntContas] = selecionada;
        qntContas++;
    }

    public static void sacar() {
        String numero = JOptionPane.showInputDialog(null, "Informe o nomero do titular");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada == null) {
            JOptionPane.showMessageDialog(null, "Conta não existe");
            return;
        }

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor para sacar"));

        selecionada.sacar(valor);
        JOptionPane.showMessageDialog(null, "O saldo atual é " + selecionada.getSaldo());        
    }

    public static void depositar() {
        String numero = JOptionPane.showInputDialog(null, "Informe o nomero do titular");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada == null) {
            JOptionPane.showMessageDialog(null, "Conta não existe");
            return;
        }

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor para depositar"));
        
        selecionada.depositar(valor);
        JOptionPane.showMessageDialog(null, "O saldo atual é " + selecionada.getSaldo());
    }
}
