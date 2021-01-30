import java.util.Scanner;

public class Assignment2 {
    public static void main(String[]args){
        Caesar caesarmain = new Caesar();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1 Encrypt a message ");
            System.out.println("2 Decrypt a message ");
            System.out.println("3 Quit ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("What is the message to encrypt? ");
                    String encryptmsg = sc.nextLine();
                    System.out.println("Encrypted: "+ caesarmain.encrypt(encryptmsg.toLowerCase()));
                    break;
                case 2:
                    System.out.println("What is the encrypted message? ");
                    String encrypedmsg = sc.nextLine();
                    System.out.println("Plaintext: "+caesarmain.decrypt(encrypedmsg.toLowerCase()));
                    break;

            }

        }while (choice != 3);
    }
}
