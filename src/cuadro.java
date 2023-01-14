// Programa de Tic Tac Toe / Gato / Triqui / Tres en Raya

import java.util.Scanner;

public class cuadro {
    // Variables

    // para saber si el cuadro está vacío o no
    boolean lleno = false;

    char letra = ' '; // para saber si es X o O

    public static void main(String[] args) {
        // Todos los cuadros del tablero
        cuadro c1 = new cuadro();
        cuadro c2 = new cuadro();
        cuadro c3 = new cuadro();
        cuadro c4 = new cuadro();
        cuadro c5 = new cuadro();
        cuadro c6 = new cuadro();
        cuadro c7 = new cuadro();
        cuadro c8 = new cuadro();
        cuadro c9 = new cuadro();
        boolean ganador = false; // para saber si hay un ganador
        int turno = 1; // para saber si es el turno del jugador 1 o 2
        while (ganador != true) {
            // Planteamos los turnos
            if (turno == 1){
                do {
                    System.out.println("\n\t ========= Turno de X ===========");
                    System.out.print("Ingrese el numero del cuadro: ");
                    Scanner sc = new Scanner(System.in);
                    int cuadro = sc.nextInt(); // para saber en que cuadro se va a poner la X
                    switch (cuadro){
                        case 1:
                            if (c1.lleno == false) { // si el cuadro está vacío
                                c1.letra = 'X';      // se pone la X
                                c1.lleno = true;     // y se marca como lleno
                                turno = 2;           // y se cambia el turno
                            }else{
                                System.out.println("Error, el cuadro ya esta lleno"); // si no está vacío, se vuelve a pedir el cuadro
                            }
                            break;
                        case 2:
                            if (c2.lleno == false) {
                                c2.letra = 'X';
                                c2.lleno = true;
                                turno = 2;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 3:
                            if (c3.lleno == false) {
                                c3.letra = 'X';
                                c3.lleno = true;
                                turno = 2;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 4:
                            if (c4.lleno == false) {
                                c4.letra = 'X';
                                c4.lleno = true;
                                turno = 2;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 5:
                            if (c5.lleno == false) {
                                c5.letra = 'X';
                                c5.lleno = true;
                                turno = 2;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 6:
                            if (c6.lleno == false) {
                                c6.letra = 'X';
                                c6.lleno = true;
                                turno = 2;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 7:
                            if (c7.lleno == false) {
                                c7.letra = 'X';
                                c7.lleno = true;
                                turno = 2;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 8:
                            if (c8.lleno == false) {
                                c8.letra = 'X';
                                c8.lleno = true;
                                turno = 2;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 9:
                            if (c9.lleno == false) {
                                c9.letra = 'X';
                                c9.lleno = true;
                                turno = 2;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        default:
                            System.out.println("Error, ingrese un numero valido");
                            break;
                    }

                }while (turno == 1);

            }else
            if (turno == 2) {
                do {
                    System.out.println("\n\t ========= Turno de O ===========");
                    System.out.print("Ingrese el numero del cuadro: ");
                    Scanner sc = new Scanner(System.in);
                    int cuadro = sc.nextInt();
                    switch (cuadro) {
                        case 1:
                            if (c1.lleno == false) {
                                c1.letra = 'O';
                                c1.lleno = true;
                                turno = 1;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 2:
                            if (c2.lleno == false) {
                                c2.letra = 'O';
                                c2.lleno = true;
                                turno = 1;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 3:
                            if (c3.lleno == false) {
                                c3.letra = 'O';
                                c3.lleno = true;
                                turno = 1;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 4:
                            if (c4.lleno == false) {
                                c4.letra = 'O';
                                c4.lleno = true;
                                turno = 1;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 5:
                            if (c5.lleno == false) {
                                c5.letra = 'O';
                                c5.lleno = true;
                                turno = 1;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 6:
                            if (c6.lleno == false) {
                                c6.letra = 'O';
                                c6.lleno = true;
                                turno = 1;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 7:
                            if (c7.lleno == false) {
                                c7.letra = 'O';
                                c7.lleno = true;
                                turno = 1;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 8:
                            if (c8.lleno == false) {
                                c8.letra = 'O';
                                c8.lleno = true;
                                turno = 1;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        case 9:
                            if (c9.lleno == false) {
                                c9.letra = 'O';
                                c9.lleno = true;
                                turno = 1;
                            } else {
                                System.out.println("Error, el cuadro ya esta lleno");
                            }
                            break;
                        default:
                            System.out.println("Error, ingrese un numero valido");
                            break;
                    }

                }while (turno == 2);
            }
            ganador = gana(ganador, c1, c2, c3, c4, c5, c6, c7, c8, c9, turno); //verifica si hay ganador
        }
    }

    static boolean gana(boolean ganador, cuadro c1, cuadro c2, cuadro c3, cuadro c4, cuadro c5, cuadro c6, cuadro c7, cuadro c8, cuadro c9, int turno){
        char campeon = ' ';
        if(turno == 2){ //si el turno es de O, entonces el campeon es X y viceversa esto se hace por que el turno cambia antes de verificar si hay ganador
            campeon = 'X';
        }else if(turno == 1){
            campeon = 'O';
        }

        //verifica si hay ganador en las filas y columnas y en las diagonales
        if(c1.letra == c2.letra && c3.letra == c1.letra && c1.lleno){
            System.out.println("\n\t --- FELICIDADES GANASTE JUGADOR "+campeon+" ---");
            System.out.println("Linea ganadora: 1, 2, 3");
            ganador = true;
        }else if(c2.letra == c5.letra && c5.letra == c8.letra && c2.lleno){
            System.out.println("\n\t --- FELICIDADES GANASTE JUGADOR "+campeon+" ---");
            System.out.println("Linea ganadora: 2, 5, 8");
            ganador = true;
        }else if(c3.letra == c6.letra && c6.letra == c9.letra && c3.lleno){
            System.out.println("\n\t --- FELICIDADES GANASTE JUGADOR "+campeon+" ---");
            System.out.println("Linea ganadora: 3, 6, 9");
            ganador = true;
        }else if(c1.letra == c4.letra && c4.letra == c7.letra && c1.lleno){
            System.out.println("\n\t --- FELICIDADES GANASTE JUGADOR "+campeon+" ---");
            System.out.println("Linea ganadora: 1, 4, 7");
            ganador = true;
        }else if(c3.letra == c5.letra && c5.letra == c7.letra && c3.lleno){
            System.out.println("\n\t --- FELICIDADES GANASTE JUGADOR "+campeon+" ---");
            System.out.println("Linea ganadora: 3, 5, 7");
            ganador = true;
        }else if(c4.letra == c5.letra && c5.letra == c6.letra && c4.lleno){
            System.out.println("\n\t --- FELICIDADES GANASTE JUGADOR "+campeon+" ---");
            System.out.println("Linea ganadora: 4, 5, 6");
            ganador = true;
        }else if(c7.letra == c8.letra && c8.letra == c9.letra && c7.lleno){
            System.out.println("\n\t --- FELICIDADES GANASTE JUGADOR "+campeon+" ---");
            System.out.println("Linea ganadora: 7, 8, 9");
            ganador = true;
        }else if(c1.letra == c5.letra && c5.letra == c9.letra && c1.lleno){
            System.out.println("\n\t --- FELICIDADES GANASTE JUGADOR "+campeon+" ---");
            System.out.println("Linea ganadora: 1, 5, 9");
            ganador = true;
        }else if(c1.lleno && c2.lleno && c3.lleno && c4.lleno && c5.lleno && c6.lleno && c7.lleno && c8.lleno && c9.lleno){
            System.out.println("\n\t --- GAME OVER ---");
            System.out.println("Empate");
            ganador = true;
        }

        return ganador;
    }}