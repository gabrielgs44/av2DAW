package model;

public class Personagem {
    private String nome, pais;
    private char sexo;

    public Personagem(String nome, String pais, char sexo) {
        this.nome = nome;
        this.pais = pais;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
