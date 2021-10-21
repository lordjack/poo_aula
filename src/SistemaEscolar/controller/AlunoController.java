package SistemaEscolar.controller;

import SistemaEscolar.database.ConexaoBD;
import SistemaEscolar.model.Aluno;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoController {
    private ConexaoBD bd;

    public AlunoController() {
        this.bd = new ConexaoBD();
    }

    public void salvar(Aluno aluno) {
        try {
            String sql;
            sql = "INSERT INTO aluno (nome, matricula, dt_nascimento) VALUES(?,?,?)";
            PreparedStatement stmt = this.bd.getConnection().prepareStatement(sql);

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getMatricula());
            stmt.setString(3, aluno.getDt_nascimento());
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void listarTodos() {
        try {

            //ArrayList dados = new ArrayList();

            PreparedStatement ps = bd.getConnection().prepareStatement("SELECT * FROM aluno");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("matricula"));
                System.out.println(rs.getString("dt_nascimento"));
            }
            // System.out.println(dados);
            ps.close();
            rs.close();
            this.bd.getConnection().close();

            // return dados;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            // return null;
        }
    }
}
