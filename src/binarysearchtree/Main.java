package binarysearchtree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        /*

            myBST.insert(47);
            myBST.insert(21);
            myBST.insert(76);
            myBST.insert(18);
            myBST.insert(27);
            myBST.insert(52);
            myBST.insert(82);


            System.out.println("BST Contains 27:");
            System.out.println(myBST.rContains(27));

            System.out.println("\nBST Contains 17:");
            System.out.println(myBST.rContains(17));

         */


        /*
            myBST.rInsert(2);
            myBST.rInsert(1);
            myBST.rInsert(3);


            System.out.println("\nRoot: " + myBST.root.value);
            System.out.println("\nLeft: " + myBST.root.left.value);
            System.out.println("\nRight: " + myBST.root.right.value);

            myBST.deleteNode(2);

            System.out.println("\nRoot: " + myBST.root.value);
            System.out.println("\nLeft: " + myBST.root.left.value);
            System.out.println("\nRight: " + myBST.root.right);

         */

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("\nBreadth First Search:");
        System.out.println( myBST.BFS() );

        /*
            EXPECTED OUTPUT:
            ----------------
            Breadth First Search:
            [47, 21, 76, 18, 27, 52, 82]

        */

        System.out.println("\nDFS PreOrder:");
        System.out.println( myBST.DFSPreOrder() );

        /*
            EXPECTED OUTPUT:
            ----------------
            DFS PreOrder:
            [47, 21, 18, 27, 76, 52, 82]

        */

        System.out.println("\nDFS PostOrder:");
        System.out.println( myBST.DFSPostOrder() );

        /*
            EXPECTED OUTPUT:
            ----------------
            DFS PostOrder:
            [18, 27, 21, 52, 82, 76, 47]

        */

        System.out.println("\nDFS InOrder:");
        System.out.println( myBST.DFSInOrder() );

        /*
            EXPECTED OUTPUT:
            ----------------
            DFS InOrder:
            [18, 21, 27, 47, 52, 76, 82]

        */




    }

}
