package dk.petlatkea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // repeat always - until system.exit
        while(true) {
            System.out.println("Velkommen til Enigma-projektet!");
            System.out.println("Vælg mellem følgende former for kryptering:");
            System.out.println(" 1) Number cipher");
            System.out.println(" 2) Caesar cipher");
            System.out.println(" 3) Vigenère cipher");
            System.out.println(" 0) afslut program");
            System.out.print("vælg (0-3): ");
            int type = scanner.nextInt();
            scanner.nextLine(); // FIX: Scanner Bug to ignore empty line
            if (type == 1) {
                System.out.println("Number cipher");
                System.out.println("-------------");
            } else if (type == 2) {
                System.out.println("Caesar cipher");
                System.out.println("-------------");
            } else if (type == 3) {
                System.out.println("Vigenère cipher");
                System.out.println("---------------");
            } else if (type == 0) {
                System.out.println("Du har afsluttet programmet");
                System.exit(0);
            }

            System.out.println("Vælg (e)ncrypt eller (d)ecrypt");
            char mode = scanner.nextLine().charAt(0);

            if (type == 1 && mode == 'e') {
                numberCipherEncryptMenu();
            } else if (type == 1 && mode == 'd') {
                numberCipherDecryptMenu();
            } else if (type == 2 && mode == 'e') {
                caesarCipherEncryptMenu();
            } else if (type == 2 && mode == 'd') {
                caesarCipherDecryptMenu();
            } else if (type == 3 && mode == 'e') {
                vigenereCipherEncryptMenu();
            } else if (type == 3 && mode == 'd') {
                vigenereCipherDecryptMenu();
            }
        }
    }


    // **************************
    // *
    // * NUMBER CIPHER
    // *
    // **************************


    private static void numberCipherEncryptMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number cipher encrypt");
        System.out.println("Indtast klartekst:");
        String plaintext = scanner.nextLine();

        int[] cipher = encryptNumberCipher(plaintext);

        String ciphertext = getStringFromIntArray(cipher);
        System.out.println("Kodeteksten er:");
        System.out.println(ciphertext);
    }

    // hjælpemetode til at vise et int-array som en streng
    private static String getStringFromIntArray(int[] cipher) {
        return "";
    }

    // number cipher encryption: konverterer en tekst til array af tal
    private static int[] encryptNumberCipher(String plaintext) {
        return new int[0];
    }

    private static void numberCipherDecryptMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Cipher decrypt");
        System.out.println("Indtast kodetekst");
        String ciphertext = scanner.nextLine();
        int[] cipher = getIntArrayFromString(ciphertext);

        String plaintext = decryptNumberCipher(cipher);

        System.out.println("Klarteksten er:");
        System.out.println(plaintext);
    }

    private static String decryptNumberCipher(int[] cipher) {
        return "";
    }

    // hjælpemetode til at "parse" en streng af tal til et array af int
    private static int[] getIntArrayFromString(String ciphertext) {
        return new int[0];
    }

    // **************************
    // *
    // * CAESAR CIPHER
    // *
    // **************************

    private static void caesarCipherEncryptMenu() {
    }

    private static void caesarCipherDecryptMenu() {
    }


    // **************************
    // *
    // * VIGENÈRE CIPHER
    // *
    // **************************


    private static void vigenereCipherEncryptMenu() {
    }

    private static void vigenereCipherDecryptMenu() {
    }
}
