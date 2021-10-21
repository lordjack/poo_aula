package SistemaEscolar.view;

import SistemaEscolar.database.ConexaoBD;
import SistemaEscolar.controller.AlunoController;
import SistemaEscolar.model.Aluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlunoFormList {
    private JButton btnSalvar;
    private JButton cancelarBtn;
    private JTextField nomeTxt;
    private JTextField matriculaTxt;
    private JTextField dt_nascimentoTxt;
    public JPanel panelMain;
    private final ConexaoBD conn = new ConexaoBD();

    public AlunoFormList() {
        this.conn.getConnection();

        btnSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                AlunoController alunoController = new AlunoController();
                Aluno aluno = new Aluno();
                aluno.setNome(nomeTxt.getText());
                aluno.setMatricula(matriculaTxt.getText());
                aluno.setDt_nascimento(dt_nascimentoTxt.getText());

                alunoController.salvar(aluno);
               // alunoController.listarTodos();
                JOptionPane.showMessageDialog(null, "Clicou");

            }
        });
        cancelarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
/*
    public void testarConexao() throws SQLException {
        try (this.conn.getConnection()) {
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso! ");
        }
    }
    */

    public void setData(Aluno data) {
        nomeTxt.setText(data.getNome());
        matriculaTxt.setText(data.getMatricula());
        dt_nascimentoTxt.setText(data.getDt_nascimento());
    }

    public void getData(Aluno data) {
        data.setNome(nomeTxt.getText());
        data.setMatricula(matriculaTxt.getText());
        data.setDt_nascimento(dt_nascimentoTxt.getText());
    }

  
}
