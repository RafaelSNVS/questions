package br.com.question;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                _Gerenciador do banco:_
                1-Cadastrar questões
                2-Editar questões
                3-Excluir questões
                """);
        Scanner read= new Scanner(System.in);
        int opc= read.nextInt();
        switch (opc){
            case 1:
                System.out.println("_Cadastro de questões_");
                Question question1= new Question();
                System.out.println("Origem da questão:");
                String origin = read.nextLine();
                question1.setOrigin(origin);
                System.out.println("Ano da questão");
                int year = read.nextInt();
                question1.setYear(year);
                System.out.println("Questão:");
                String question = read.nextLine();
            break;
        }
    }
}
