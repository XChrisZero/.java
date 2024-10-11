import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankApp {
    private float saldo = 0.0f;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BankApp::new);
    }

    public BankApp() {
        JFrame frame = new JFrame("Banco Digital");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

        JLabel saldoLabel = new JLabel("Seu Saldo: R$ 0.00");
        JTextField valorField = new JTextField();
        JButton consultaButton = new JButton("Consultar Saldo");
        JButton saqueButton = new JButton("Sacar");
        JButton depositoButton = new JButton("Depositar");
        JButton sairButton = new JButton("Encerrar");

        consultaButton.addActionListener(e -> {
            saldoLabel.setText(String.format("Seu Saldo: R$ %.2f", saldo));
        });

        saqueButton.addActionListener(e -> {
            try {
                float valorSaque = Float.parseFloat(valorField.getText());
                if (valorSaque <= saldo) {
                    saldo -= valorSaque;
                    JOptionPane.showMessageDialog(frame, "Saque feito com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Quantidade insuficiente para saque!");
                }
                saldoLabel.setText(String.format("Seu Saldo: R$ %.2f", saldo));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Digite um valor válido para o saque.");
            }
        });

        depositoButton.addActionListener(e -> {
            try {
                float valorDeposito = Float.parseFloat(valorField.getText());
                saldo += valorDeposito;
                JOptionPane.showMessageDialog(frame, "Depósito realizado com sucesso!");
                saldoLabel.setText(String.format("Seu Saldo: R$ %.2f", saldo));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Digite um valor válido para o depósito.");
            }
        });

        sairButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Volte Sempre!");
            System.exit(0);
        });

        frame.add(saldoLabel);
        frame.add(new JLabel("Valor:"));
        frame.add(valorField);
        frame.add(consultaButton);
        frame.add(saqueButton);
        frame.add(depositoButton);
        frame.add(sairButton);

        frame.setVisible(true);
    }
}
