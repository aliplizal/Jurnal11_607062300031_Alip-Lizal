/* Class BTNode */
class BTNode2<E> {
    private BTNode2<E> left; // Variabel untuk node kiri.
    private BTNode2<E> right; // Variabel untuk node kanan.
    private E data; // Variabel untuk data pada node.

    /* Default Constructor */
    // Konstruktor default yang menginisialisasi node kiri, node kanan, dan data sebagai null.
    public BTNode2() {
        this.left = null;
        this.right = null;
        this.data = null;
    }

    /* Constructor with data */
    // Konstruktor dengan parameter data yang menginisialisasi node kiri dan kanan sebagai null dan data sesuai dengan parameter.
    public BTNode2(E item) {
        this.left = null;
        this.right = null;
        this.data = item;
    }

    /* Setters for left and right nodes */
    // Setter untuk node kiri.
    public void setLeft(BTNode2<E> left) {
        this.left = left;
    }

    // Setter untuk node kanan.
    public void setRight(BTNode2<E> right) {
        this.right = right;
    }

    /* Getters for left and right nodes */
    // Getter untuk node kiri.
    public BTNode2<E> getLeft() {
        return left;
    }

    // Getter untuk node kanan.
    public BTNode2<E> getRight() {
        return right;
    }

    /* Setters and getters for node data */
    // Setter untuk data pada node.
    public void setData(E data) {
        this.data = data;
    }

    // Getter untuk data pada node.
    public E getData() {
        return data;
    }
}
