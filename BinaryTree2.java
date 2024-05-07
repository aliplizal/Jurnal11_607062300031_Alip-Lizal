class BinaryTree2<E> {
    // Mendefinisikan variabel root untuk menunjukkan akar pohon.
    private BTNode2<E> root;

    /* Constructor */
    // Menginisialisasi root menjadi null saat objek BinaryTree2 dibuat.
    public BinaryTree2() {
        root = null;
    }

    /* Function to check if the tree is empty */
    // Mengembalikan true jika root null, menandakan pohon kosong.
    public boolean isEmpty() {
        return root == null;
    }

    /* Function to insert data */
    // Memanggil metode insert rekursif untuk menambahkan data ke pohon.
    public void insert(E data) {
        root = insert(root, data);
    }

    /* Recursive function to insert data */
    // Jika node kosong, buat node baru dengan data yang diberikan.
    private BTNode2<E> insert(BTNode2<E> node, E data) {
        if (node == null) {
            return new BTNode2<>(data);
        } else {
            if (node.getLeft() == null) {
                node.setLeft(insert(node.getLeft(), data));
            } else {
                node.setRight(insert(node.getRight(), data));
            }
            return node;
        }
    }

    /* Function to count the number of nodes */
    // Menghitung jumlah node dalam pohon dimulai dari root.
    public int countNodes() {
        return countNodes(root);
    }

    /* Recursive function to count the number of nodes */
    // Mengembalikan 0 jika node kosong.
    private int countNodes(BTNode2<E> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
        }
    }

    /* Function to search for an element */
    // Memulai pencarian elemen dimulai dari root.
    public boolean search(E val) {
        return search(root, val);
    }

    /* Recursive function to search for an element */
    // Mengembalikan false jika node kosong, artinya elemen tidak ditemukan.
    private boolean search(BTNode2<E> node, E val) {
        if (node == null) {
            return false;
        }
        if (node.getData().equals(val)) {
            return true;
        }
        return search(node.getLeft(), val) || search(node.getRight(), val);
    }

    /* Function for inorder traversal */
    // Memulai traversal inorder dimulai dari root.
    public void inorder() {
        inorder(root);
    }

    private void inorder(BTNode2<E> node) {
        if (node != null) {
            inorder(node.getLeft()); // Traversal kiri.
            System.out.print(node.getData() + " "); // Cetak data saat traversal.
            inorder(node.getRight()); // Traversal kanan.
        }
    }

    /* Function for preorder traversal */
    // Memulai traversal preorder dimulai dari root.
    public void preorder() {
        preorder(root);
    }

    private void preorder(BTNode2<E> node) {
        if (node != null) {
            System.out.print(node.getData() + " "); // Cetak data sebelum traversal kiri dan kanan.
            preorder(node.getLeft()); // Traversal kiri.
            preorder(node.getRight()); // Traversal kanan.
        }
    }

    /* Function for postorder traversal */
    // Memulai traversal postorder dimulai dari root.
    public void postorder() {
        postorder(root);
    }

    private void postorder(BTNode2<E> node) {
        if (node != null) {
            postorder(node.getLeft()); // Traversal kiri.
            postorder(node.getRight()); // Traversal kanan.
            System.out.print(node.getData() + " "); // Cetak data setelah traversal kiri dan kanan.
        }
    }
}
