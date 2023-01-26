package binarysearchtree;

public class BinarySearchTree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) { //worse case: O(n)
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) { //worse case: O(n)
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean rContains(Node currentNode, int value){
        if(currentNode == null) return false;
        if(currentNode.value == value) return true;

        if(value < currentNode.value){
            return rContains(currentNode.left, value);
        }else {
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value){
        return rContains(root, value);
    }

    private Node rInsert(Node currentNode, int value){
        if(currentNode == null) return new Node(value);

        if(value < currentNode.value){
            currentNode.left = rInsert(currentNode.left, value);
        }else if(value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value){
        if(root == null) root = new Node(value);
        rInsert(root, value);
    }

    private Node deleteNode(Node currentNode, int value){
        if(currentNode == null) return null; //if the value is not in the tree

        if(value < currentNode.value){
            currentNode.left = deleteNode(currentNode.left, value);
        }else if(value > currentNode.value){
            currentNode.right = deleteNode(currentNode.right, value);

            //To here, it's going to traverse left and right and either determinate if the value we are looking for it's or not in the tree
            //it will go here until it doesn't and then next loop we go to the else and the possibilities
        }else { // if we trigger this else, it means there are 4 possibilities
            if (currentNode.left == null && currentNode.right == null) { //this is a leaf node
                return null;
            } else if (currentNode.left == null) { // a node that is open on the left and has a node on the right
                currentNode = currentNode.right;
            } else if (currentNode.right == null) { //a node that is open on the right an has a node on the left
                currentNode = currentNode.left;
            } else { //or a node on the left and the right
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);

            }

        }

        return currentNode;
    }

    public void deleteNode(int value){
        deleteNode(root, value);
    }

    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

}
