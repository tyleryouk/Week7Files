/**
 * A class to represent a linked list of nodes.  The list is Iterable to indicate that we can iterate over the data in the list.
 */
public class LinkedList<T> implements Iterable<T> {
  /** the first node of the list, or null if the list is empty */
  private LLNode<T> firstNode;
  
  /**
   * Creates an initially empty linked list
   */
  public LinkedList() {
    firstNode = null;
  }
  
  /**
   * Returns the first node.
   */
  protected LLNode<T> getFirstNode() {
    return firstNode;
  }

  /**
   * Changes the front node.
   * @param node  the node that will be the first node of the new linked list
   */
  protected void setFirstNode(LLNode<T> node) {
    this.firstNode = node;
  }

  /**
   * Add an element to the front of the linked list
   */
  public void addToFront(T element) {
    setFirstNode(new LLNode<T>(element, getFirstNode()));
  }
  
  /**
   * Return whether the list is empty
   * @return true if the list is empty
   */
  public boolean isEmpty() {
    return (getFirstNode() == null);
  }
  
  /**
   * Returns the length of the linked list
   * @return the number of nodes in the list
   */
  public int length() {
    int lengthSoFar = 0;
    LLNode<T> nodeptr = getFirstNode();
    while (nodeptr != null) {
      lengthSoFar++;
      nodeptr = nodeptr.getNext();
    }
    return lengthSoFar;
  }
  
  /**
   * Determines whether an element is stored in the list
   * @param element  the element to search for in the list
   * @return true if and only if the parameter element is in the list
   */
  public boolean contains(T element) {
    LLNode<T> nodeptr = getFirstNode();
    while (nodeptr != null) {
      if (nodeptr.getElement().equals(element))
        return true;
      nodeptr = nodeptr.getNext();
    }
    return false;
  }
  
  /**
   * Returns an iterator that iterates, or loops, over the data of the list
   * @return an iterator for the linked list
   */
  public LinkedListIterator<T> iterator() {
    return new LinkedListIterator<>(getFirstNode());
  }

}
