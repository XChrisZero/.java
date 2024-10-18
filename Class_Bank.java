// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BankApp {
   private float saldo = 0.0F;

   public static void main(String[] var0) {
      SwingUtilities.invokeLater(BankApp::new);
   }

   public BankApp() {
      JFrame var1 = new JFrame("Banco Digital");
      var1.setDefaultCloseOperation(3);
      var1.setSize(400, 300);
      var1.setLayout(new GridLayout(5, 2));
      JLabel var2 = new JLabel("Seu Saldo: R$ 0.00");
      JTextField var3 = new JTextField();
      JButton var4 = new JButton("Sacar");
      JButton var5 = new JButton("Depositar");
      JButton var6 = new JButton("Encerrar");
      var4.addActionListener((var4x) -> {
         try {
            float var5 = Float.parseFloat(var3.getText());
            if (var5 <= this.saldo) {
               this.saldo -= var5;
               JOptionPane.showMessageDialog(var1, "Saque feito com sucesso!");
            } else {
               JOptionPane.showMessageDialog(var1, "Quantidade insuficiente para saque!");
            }

            var2.setText(String.format("Seu Saldo: R$ %.2f", this.saldo));
         } catch (NumberFormatException var6) {
            JOptionPane.showMessageDialog(var1, "Digite um valor v\u00e1lido para o saque.");
         }

      });
      var5.addActionListener((var4x) -> {
         try {
            float var5 = Float.parseFloat(var3.getText());
            this.saldo += var5;
            JOptionPane.showMessageDialog(var1, "Dep\u00f3sito realizado com sucesso!");
            var2.setText(String.format("Seu Saldo: R$ %.2f", this.saldo));
         } catch (NumberFormatException var6) {
            JOptionPane.showMessageDialog(var1, "Digite um valor v\u00e1lido para o dep\u00f3sito.");
         }

      });
      var6.addActionListener((var1x) -> {
         JOptionPane.showMessageDialog(var1, "Volte Sempre!");
         System.exit(0);
      });
      var1.add(var2);
      var1.add(new JLabel("Valor:"));
      var1.add(var3);
      var1.add(var4);
      var1.add(var5);
      var1.add(var6);
      var1.setVisible(true);
   }
}
