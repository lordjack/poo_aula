package SistemaEscolar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private Connection conn;

    public ConexaoBD() {
        try {
            System.out.println("Conectado!");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/db_aula_2021", "root", "");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }

    public Connection getConnection() {
        return this.conn;
    }
}
