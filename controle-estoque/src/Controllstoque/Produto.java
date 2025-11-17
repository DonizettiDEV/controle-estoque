package Controllstoque;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.UUID;

public class Produto {
    public int id;
    public String nome;
    public int quantidade;
    public double preco;

    public Produto(int id, String nome, int quantidade, double preco) {
        ValidateNome(nome);
        ValidateQuantidade(quantidade);

        this.id = UUID .randomUUID().hashCode();
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    private void ValidateNome(String nome){
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("nome nao pode ser nulo ou vazio");
        }
    }

    private void ValidateQuantidade(int quantidade){
        if (quantidade < 0) {
            throw new IllegalArgumentException("quantidade nao pode ser negativa");
        }
    }
    public int getId(){
        return id;
    }
    public String getnome(){
        return nome;
    }


    }