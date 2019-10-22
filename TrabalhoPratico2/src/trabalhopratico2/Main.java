/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        //nome, endereco, email, telefone, nomeUsuario, senha
        Administradores adm;
        adm = new Administradores("Eduardo","AV.amazonas","email@gmail.com","031 940028922","Edu@","usu@du");
        
        ArrayList<Usuario> lista = new ArrayList<>(); 
        
        Scanner input = new Scanner(System.in);
        int opcao;
        String admin,senha;
        
        System.out.println("Escolha uma opção: ");
        System.out.println("(0) Sair");
        System.out.println("(1) Cadastrar um novo Administrador");
        System.out.println("(2) Cadastrar um novo Profissional");
        System.out.println("(3) Cadastrar um novo Cliente");
        
        opcao = input.nextInt();
        
        switch(opcao){
        
            case 0: System.exit(1);
            
            case 1: 
                    System.out.println("Digite um usuario (Administrador) valido: ");
                        admin = input.next();
                    System.out.println("Digite a senha: ");
                        senha = input.next();
                    
                    if(adm.getNomeUsuario().equals(admin) && adm.getSenha().equals(senha)){
                       Administradores novoAdm = new Administradores();
                        preencheStg(novoAdm);
                    }else{
                        System.out.println("Você não tem permissão para criar um novo administrador!");
                    }
                        
                    break;
            
            case 2: 
            
        
        
        }
    }
    
    public static Usuario preencheStg(Usuario user){
        Scanner input = new Scanner(System.in);
        String  nome,endereco,email,telefone,nomeUsuario,senha;
        
        System.out.println("Digite o seu nome: ");
        nome = input.next();
        System.out.println("Digite seu endereço: ");
        endereco = input.next();
        System.out.println("Digite seu email: ");
        email = input.next();
        System.out.println("Digite seu telefone: ");
        telefone = input.next();
        System.out.println("Digite seu nome de usuario: ");
        nomeUsuario = input.next();
        System.out.println("Digite seu senha: ");
        senha = input.next();
        
        if(user instanceof Administradores){
            return new Administradores(nome, endereco, email, telefone, nomeUsuario, senha);
        }else if(user instanceof Cliente){
            return new Cliente(nome, endereco, email, telefone, nomeUsuario, senha);
        }else if(user instanceof Profissionais){
            return new Profissionais(nome, endereco, email, telefone, nomeUsuario, senha);
        }
        
        return null;
    }
}
