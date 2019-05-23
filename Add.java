import java.util.*;

class Add{

    public static void main(String[] args) {  
        System.out.println("Enter the value to add");
        Scanner myObj = new Scanner(System.in);
        int value = myObj.nextInt();
        Node nodeobj1=new Node(6);
        nodeobj1.add(value);
        nodeobj1.showNodes();
        nodeobj1.add(5);
        nodeobj1.add(9);
        nodeobj1.search(4);

        
    }

}

