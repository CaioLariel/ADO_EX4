/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Funcionario f1 = new Funcionario();
        Scanner text = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        Scanner ender = new Scanner(System.in);

        System.out.println("\t Bem vindo ao cadastro! \n");
        System.out.println("digite uma opção:\n[0]- aluno\n[1]- professor\n[2]- funcionario \n");
        int valorEscolha = number.nextInt();

//        System.out.println("digite quantos cadastros voce irá fazer :");;
//        int valorCadastro = number.nextInt();

        switch (valorEscolha) {
            case 0:
                //aluno
                System.out.println("digite o nome do aluno :\n");
                a1.setNome(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o rg do aluno :\n");
                a1.setRg(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o cpf do aluno :\n");
                a1.setCpf(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o registro do aluno do aluno :\n");
                a1.setRegistroAluno(number.nextInt());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a nota do vestibular do aluno :\n");
                a1.setNotaVestibular(number.nextFloat());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o curso do aluno :\n");
                a1.setCurso(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a data matricula do aluno :\n");
                a1.setDataMatricula(text.nextLine());

                System.out.println("-----------------------------------------------------");

                System.out.println("digite o endereço do aluno :\n");
                a1.setEndereco(ender.nextLine());

                System.out.println("-----------------------------------------------------");

                System.out.println("\t - Dados do Aluno RA nº: " + a1.getRegistroAluno() + "-\n");
                System.out.println(a1.retornaDadosAluno());

                break;

            case 1:
                System.out.println("digite o nome do professor :\n");
                p1.setNome(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o rg do professor :\n");
                p1.setRg(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o cpf do professor :\n");
                p1.setCpf(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a matricula do professor :\n");
                p1.setMatriculaProfessor(number.nextInt());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a data admissao do professor :\n");
                p1.setDataAdmissao(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o salario horista do professor :\n");
                p1.setSalarioHorista(number.nextDouble());

                System.out.println("-----------------------------------------------------");
                System.out.println("digite o endereço do professor :\n");
                p1.setEndereco(ender.nextLine());

                System.out.println("-----------------------------------------------------");
                System.out.println("\t - Dados do Professor matricula nº: " + p1.getMatriculaProfessor() + "-\n");
                System.out.println(p1.retornaDadosProfessor());
                break;

            case 2:
                System.out.println("digite o nome do funcionario :\n");
                f1.setNome(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o rg do funcionario :\n");
                f1.setRg(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o cpf do funcionario :\n");
                f1.setCpf(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o endereço do funcionario :\n");
                f1.setEndereco(ender.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a data da admissão do funcionario :\n");
                f1.setDataAdmissao(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a matricula do funcionario do funcionario :\n");
                f1.setMatriculaFuncionario(text.nextInt());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o salario mensal do funcionario :\n");
                f1.setSalarioMensal(ender.nextDouble());
                System.out.println("-----------------------------------------------------");

                System.out.println("\t - Dados do Aluno RA nº: " + f1.getMatriculaFuncionario() + "-\n");
                System.out.println(f1.retornaDadosFuncionario());

                break;

            default:
                System.out.println("valor nao existente!");
            //tratativa de erro

        }

        text.close();
        number.close();
        ender.close();
    }
;
}
