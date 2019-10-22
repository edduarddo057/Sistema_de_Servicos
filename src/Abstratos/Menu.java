package Abstratos;

import java.util.Scanner;

public abstract class Menu {
    private Scanner teclado;
    public Menu(){
        teclado = new Scanner(System.in);
    }
    public static void menuPrincipal(){

        System.out.println("======= MENU PRINCIPAL =======");
        System.out.println("[1] Cadastros");
        System.out.println("[2] Login");
        System.out.println("[0] Sair");
        System.out.println("===============================");

    }
}
