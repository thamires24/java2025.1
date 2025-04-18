package org.serratec.exercicios;

public class Cliente {
    private int idcliente;
    private String nome;
    private int idade;
    private String telefone;



    @Override
    public String toString() {
        return "Cliente [idcliente=" + idcliente + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone
                + "]";
    }


    public int getIdcliente() {
        return idcliente;
    }


    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public String getTelefone() {
        return telefone;
    }


    public Cliente(int idcliente, String nome, int idade, String telefone) {
        super();
        this.idcliente = idcliente;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }



}
