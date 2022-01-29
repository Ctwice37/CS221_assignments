/*<listing chapter="6" section="4">*/
package assignment_9;

/**
 * A class to represent a binary search tree.
 * @author Koffman and Wolfgang
 */

class Node<E> {
    // Data Fields

    /** The information stored in this node. */
    public E data;
    /** Reference to the left child. */
    public Node<E> left;
    /** Reference to the right child. */
    public Node<E> right;

    // Constructors
    /**
     * Construct a node with given data and no children.
     * @param data The data to store in this node
     */
    public Node(E data) {
        this.data = data;
        left = null;
        right = null;
    }

    // Methods
    /**
     * Returns a string representation of the node.
     * @return A string representation of the data fields
     */
    @Override
    public String toString() {
        return data.toString();
    }
}

/*</listing>*/
