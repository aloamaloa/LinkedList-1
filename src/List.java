public class List {

    // Start node of the list
    Node startElem = new Node("Top of the list");

    // Constructor of the list
    public List() {

    }

    // Add a node to the list
    public void addNewElement(String string) {
        Node newElem = new Node(string);
        Node lastElem = getLastElem();
        lastElem.setNextElem(newElem);
    }

    // Get the last element of a list
    public Node getLastElem() {
        Node le = startElem;
        while (le.getNextElem() != null) {
            le = le.getNextElem();
        }
        return le;
    }

    // Outputting data from the list
    public void wirteList() {
        Node le = startElem;
        while (le != null) {
            System.out.println(le.getString());
            le = le.getNextElem();
        }
    }

    // Search a node
    public void find(String string) {
        Node le = startElem;
        while (le != null) {
            if (le.getString().equals(string)) {
                System.out.println("Object found: " + le.getString());
                break;
            } else {
                le = le.nextElement;
                System.out.println("Object: " + string + " not found");
            }
        }
    }

    // Deleting a Node
    public void delete(String string) {
        Node le = startElem;
        while (le.getNextElem() != null && !le.getString().equals(string)) {
            if (le.getNextElem().getString().equals(string)) {
                if (le.getNextElem().getNextElem() != null) {
                    le.setNextElem(le.getNextElem().getNextElem());
                } else {
                    le.setNextElem(null);
                    break;
                }
            }

            le = le.getNextElem();
        }
    }


}
