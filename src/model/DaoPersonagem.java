package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoPersonagem {
    private Connection conexao;
    
    public DaoPersonagem() {
        String url = "jdbc:mysql://localhost/jogoLuta";
        String usuario = "root";
        String senha = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            conexao.setAutoCommit(false);
        }
        catch(ClassNotFoundException e) {
            System.out.println("Classe não encontrada");
        }
        catch(SQLException e) {
            System.out.println("Erro de conexão ao BD");
        }
    }
    
    public void cadastrar(Personagem perso, Magia mag, Golpe golpe) {
        String operacao = "INSERT INTO personagem(nome_magia, descricao, potencia, nome_perso, sexo, pais, chute_forte, chute_fraco, soco_forte, soco_fraco) VALUE(?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement comando = conexao.prepareStatement(operacao);
            
            comando.setString(1, mag.getNome());
            comando.setString(2, mag.getDescricao());
            comando.setInt(3, mag.getPotencia());
            comando.setString(4, perso.getNome());
            comando.setString(5, String.valueOf(perso.getSexo()));
            comando.setString(6, perso.getPais());
            comando.setInt(7, golpe.getChuteForte());
            comando.setInt(8, golpe.getChuteFraco());
            comando.setInt(9, golpe.getSocoForte());
            comando.setInt(10, golpe.getSocoFraco());
            
            comando.executeUpdate();
            
            conexao.commit();
            conexao.close();
        }
        catch(SQLException e) {
            System.out.println("Não foi possível inserir no BD!");
        }
       }
        
}
