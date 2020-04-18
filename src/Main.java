public class Main {

    public static void main(String[] args) {
        List list = new List();

        list.addNewElement("I am the second in the list");
        list.addNewElement("I am the third in the list");
        list.addNewElement("I am the fourth in the list");
        list.addNewElement("I am the fifth in the list");

        list.wirteList();

        System.out.println("-------");

        list.addNewElement("Peterr");
        list.find("Peter");

        System.out.println("-------");

        list.wirteList();

        list.delete("Peterr");
        list.wirteList();

        System.out.println("-------");
        list.delete("I'm third in the list");
        list.wirteList();
    }

}
