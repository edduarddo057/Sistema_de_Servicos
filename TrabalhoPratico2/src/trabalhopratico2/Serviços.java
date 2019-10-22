/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2;

/**
 *
 * @author aluno
 */
public class Serviços {
    
        String nome, descricao;

    public Serviços(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Serviços() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
        
        
    
}
