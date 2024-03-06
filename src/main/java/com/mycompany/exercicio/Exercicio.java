package com.mycompany.exercicio;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nm2;
        String estacao;
        
        System.out.println("ATIVIDADE 1 \n");

        System.out.println("digite um numero para uma estaçao\n 1 para verao \n 2 para primavera \n 3 para inverno \n 4 para outono");
        nm2 = teclado.nextInt();

        switch (nm2) {
            case 1:

                System.out.printf("a estaçao do ano correspondente é: verao ");
                break;

            case 2:

                System.out.printf("a estaçao do ano correspondente é: primavera");
                break;
            case 3:

                System.out.printf("a estaçao do ano correspondente é: inverno");
                break;
            case 4:

                System.out.printf("a estaçao do ano correspondente é: outono");
                break;
            default:
                System.out.println("valor invalido");
                break;
        }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
                // Scanner teclado = new Scanner (System.in);
                int nm3;
                System.out.println("ATIVIDADE 2 \n");
               
                System.out.println("digite um numero correspondente ao mes :");
                nm3 = teclado.nextInt();

                switch (nm3) {
                    case 1:
                        System.out.println("janeiro");
                        break;
                    case 2:
                        System.out.println("fevereiro");
                        break;
                    case 3:
                        System.out.println("março");
                        break;
                    case 4:
                        System.out.println("abril");
                        break;
                    case 5:
                        System.out.println("maio");
                        break;
                    case 6:
                        System.out.println("junho");
                        break;
                    case 7:
                        System.out.println("julho");
                        break;
                    case 8:
                        System.out.println("agosto");
                        break;
                    case 9:
                        System.out.println("setembro");
                        break;
                    case 10:
                        System.out.println("outubro");
                        break;
                    case 11:
                        System.out.println("novembro");
                        break;
                    case 12:
                        System.out.println("dezembro");
                        break;
                    default:
                        System.out.println("numero invalido");
                        break;

                }

        

        // Scanner teclado = new Scanner(System.in);/////////////////////////////////////////////////////////////////////////////////////////////////////////////
        char letra;
        System.out.println("\n\nATIVIDADE 3 \n ");
        System.out.println("digite uma letra");

        letra = teclado.next().charAt(0);

        switch (letra) {
            case 'A':
                System.out.println("vogal ");
                break;
            case 'a':
                System.out.println("vogal ");
                break;
            case 'E':
                System.out.println("vogal ");
                break;
            case 'e':
                System.out.println("vogal ");
                break;
            case 'I':
                System.out.println("vogal ");
            case 'i':
                System.out.println("vogal ");
                break;
            case 'O':
                System.out.println("vogal ");
                break;
            case 'o':
                System.out.println("vogal ");
                break;
            case 'U':
                System.out.println("vogal ");
            case 'u':
                System.out.println("vogal");
                break;
            default:
                System.out.println("consuante");
                break;

        }

        //Scanner teclado = new Scanner (System.in);/////////////////////////////////////////////////////////////////////////////////////////////////////////
        int nm1;
        System.out.println(" \n\nATIVIDADE 4 \n");
        System.out.println("digite um numero inteiro entre 1,2,3:");
        nm1 = teclado.nextInt();

        switch (nm1) {
            case 1:
                System.out.println("numero é 1");
                System.out.println("menor que 2");
                break;
            case 2:
                System.out.println("numero é 2");
                System.out.println("menor que 3 e maior que 1");
                break;
            case 3:
                System.out.println("numero é 3");
                System.out.println("maior que 2 e 1");
                break;
            default:
                System.out.println("o numero nao é 1,2,3");
                

               
        }}
    }

