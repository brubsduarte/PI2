package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruna.duarte
 */
public class DB {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "jdbc:mysql://localhost:3306/";
    private static final String BASEDADOS = "la_casa_del_livro";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static String url = "";
    private static Connection conexao;

    /**
     * Executa as alterações (inserir, excluir e atualizar) no banco de dados.
     *
     * @param sql código a ser executado no banco de dados.
     * @return TRUE se executar com sucesso e FALSE se houver alguma falha.
     */
    public static boolean executarAlteracao(String sql) {
        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = SERVIDOR + BASEDADOS;
            conexao = DriverManager.getConnection(url, LOGIN, SENHA);
            Statement comando = conexao.createStatement();
            int linhasAfetadas = comando.executeUpdate(sql);

            retorno = linhasAfetadas > 0;

        } catch (ClassNotFoundException | SQLException ex) {
            retorno = false;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
        }

        return retorno;
    }

    /**
     * Executa consultas no banco de dados.
     *
     * @param sql código a ser executado no banco de dados.
     * @return ResultSet com o resultado da consulta.
     */
    public static ResultSet executarConsulta(String sql) {
        ResultSet rs;

        try {
            Class.forName(DRIVER);
            url = SERVIDOR + BASEDADOS;
            conexao = DriverManager.getConnection(url, LOGIN, SENHA);
            Statement comando = conexao.createStatement();
            rs = comando.executeQuery(sql);

        } catch (ClassNotFoundException | SQLException ex) {
            rs = null;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                rs = null;
            }
        }

        return rs;
    }
}
