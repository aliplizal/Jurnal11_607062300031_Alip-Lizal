// Import Scanner class for user input.
import java.util.Scanner;

/**
 * The entire program is taken from Java Program to Implement Binary Tree
 * https://www.sanfoundry.com/java-program-implement-binary-tree/
 * with slight modifications
 */
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input.
        Scanner scan = new Scanner(System.in);

        // Membuat objek BinaryTree2.
        BinaryTree2 bt = new BinaryTree2();

        // Menampilkan judul tes pohon biner.
        System.out.println("Binary Tree Test\n");

        char ch;
        do {
            // Menampilkan judul operasi pohon biner.
            System.out.println("\nBinary Tree Operations\n");

            // Menampilkan pilihan untuk operasi penyisipan.
            System.out.println("1. insert ");

            // Menampilkan pilihan untuk operasi pencarian.
            System.out.println("2. search");

            // Menampilkan pilihan untuk menghitung jumlah node.
            System.out.println("3. count nodes");

            // Menampilkan pilihan untuk memeriksa apakah pohon kosong.
            System.out.println("4. check empty");

            // Membaca pilihan operasi dari pengguna.
            int choice = scan.nextInt();

            // Membersihkan buffer setelah membaca input integer.
            scan.nextLine();

            // Memulai pemilihan berdasarkan pilihan pengguna.
            switch (choice) {
                // Meminta pengguna memasukkan elemen integer untuk disisipkan.
                case 1:
                    System.out.println("Enter integer element to insert");
                    // Memanggil metode insert pada objek BinaryTree2.
                    bt.insert(scan.nextLine());
                    break;

                // Meminta pengguna memasukkan elemen integer untuk dicari.
                case 2:
                    System.out.println("Enter integer element to search");
                    // Menampilkan hasil pencarian.
                    System.out.println("Search result : " + bt.search(scan.nextLine()));
                    break;

                // Menampilkan jumlah node dalam pohon.
                case 3:
                    System.out.println("Nodes = " + bt.countNodes());
                    break;

                // Menampilkan status kosong atau tidaknya pohon.
                case 4:
                    System.out.println("Empty status = " + bt.isEmpty());
                    break;

                // Pesan kesalahan jika input tidak valid.
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            // Menampilkan traversal post-order.
            System.out.print("\nPost order : ");
            // Memanggil metode postorder traversal pada objek BinaryTree2.
            bt.postorder();

            // Menampilkan traversal pre-order.
            System.out.print("\nPre order : ");
            // Memanggil metode preorder traversal pada objek BinaryTree2.
            bt.preorder();

            // Menampilkan traversal in-order.
            System.out.print("\nIn order : ");
            // Memanggil metode inorder traversal pada objek BinaryTree2.
            bt.inorder();

            // Meminta pengguna untuk melanjutkan atau tidak.
            System.out.println("\n\nDo you want to continue (Type y or n)\n");

            // Membaca input karakter untuk melanjutkan atau tidak.
            ch = scan.next().charAt(0);

        // Melanjutkan loop jika pengguna ingin melanjutkan.
        } while (ch == 'Y' || ch == 'y');
    }
}
