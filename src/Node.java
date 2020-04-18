
public class Node {

	// Information of the node
	String string;
	
	// The reference (address) of the neighbour
	Node nextElement;
	
	// constructor
	public Node(String string) {
		this.string = string;
		nextElement = null;
	}
	
	// Set a neighbor
    public void setNextElem(Node nextElem) {
        this.nextElement = nextElem;
    }

    // Get the neighbour
    public Node getNextElem() {
        return nextElement;
    }
    
    // Get the information of the node
    public String getString() {
        return string;
    } 
}
