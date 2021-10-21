package SistemaEscolar.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal {
    private JPanel panelMain;
    private JButton alunoButton;

    public TelaPrincipal() {
        alunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameAlunoFormList = new JFrame("UsuarioFormList");
                frameAlunoFormList.setContentPane(new AlunoFormList().panelMain);
                frameAlunoFormList.pack(); // carregar a tela sem que fique pequena
                frameAlunoFormList.setLocationRelativeTo(null);
                frameAlunoFormList.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaPrincipal");
        frame.setContentPane(new TelaPrincipal().panelMain);
        //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // carregar a tela sem que fique pequena
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
