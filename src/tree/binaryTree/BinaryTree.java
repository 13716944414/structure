package tree.binaryTree;

/**
 * @author jiangjiaxin
 * @date 2018-02-26 15:24
 */
public class BinaryTree {

    /**
     *    根节点
     *
     * @author jiangjiaxin
     * @date 2018-02-27 14:27
     * @param
     * @return
     */
    private Node root;

    /**
     *    插入节点
     *
     * @author jiangjiaxin
     * @date 2018-02-26 15:56
     * @param
     * @return
     */
    public void insert(int number, String name){
        //构造新节点
        Node newNode = new Node(number, name);
        //当前节点
        Node currentNode = root;
        //当前节点的父节点
        Node parentNode;
        if(root == null){
            root = newNode;
        }else{
            while(true){
                parentNode = currentNode;
                if(currentNode.getNumber() > number){
                    currentNode = currentNode.getLeftChild();
                    if(currentNode == null){
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                }else{
                    currentNode = currentNode.getRightChild();
                    if(currentNode == null){
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }

        }
    }

    /**
     *    删除节点
     *
     * @author jiangjiaxin
     * @date 2018-02-27 14:29
     * @param
     * @return
     */
    public void delete(int number){
        Node currentNode = root;//要删除的节点
        Node parentNode = currentNode;//要删除节点的父节点
        boolean isLeftChild = true;//要删除的节点是左子节点或右子节点
        if(root == null){
            System.out.println("这是一棵空树");
        }else{
            //找到要删除的节点
            while(currentNode != null && currentNode.getNumber() != number){
                parentNode = currentNode;
                if(currentNode.getNumber() > number){
                    currentNode = currentNode.getLeftChild();
                    isLeftChild = true;
                }else{
                    currentNode = currentNode.getRightChild();
                    isLeftChild = false;
                }
            }
            if(currentNode == null){
                System.out.println("未找到该数据");
                return;
            }
            //要删除的节点是叶子节点
            else if(currentNode.getLeftChild() == null && currentNode.getRightChild() == null){
                if(currentNode == root){
                    root = null;
                    return;
                }
                if(isLeftChild){
                    parentNode.setLeftChild(null);
                }else{
                    parentNode.setRightChild(null);
                }
            }
            //要删除的节点有两个子节点
            else if(currentNode.getLeftChild() != null && currentNode.getRightChild() != null){
                //中序后继节点
                Node inheritNode = this.getInheritNode(currentNode);

                //要删除的节点是根节点
                if(currentNode == root){
                    inheritNode.setLeftChild(root.getLeftChild());
                    inheritNode.setRightChild(root.getRightChild());
                    root = inheritNode;
                    return;
                }

                inheritNode.setLeftChild(currentNode.getLeftChild());
                inheritNode.setRightChild(currentNode.getRightChild());
                currentNode.setLeftChild(null);
                currentNode.setRightChild(null);
                if(isLeftChild){
                    parentNode.setLeftChild(inheritNode);
                }else{
                    parentNode.setRightChild(inheritNode);
                }
            }
            //要删除的节点有一个子节点，左子节点
            else if(currentNode.getLeftChild() != null){
                //要删除的节点是根节点
                if(currentNode == root){
                    root = root.getLeftChild();
                    return;
                }
                if(isLeftChild){
                    parentNode.setLeftChild(currentNode.getLeftChild());
                }else{
                    parentNode.setRightChild(currentNode.getLeftChild());
                }
                currentNode.setLeftChild(null);
            }
            //要删除的节点有一个子节点，右子节点
            else if(currentNode.getRightChild() != null){
                //要删除的节点是根节点
                if(currentNode == root){
                    root = root.getRightChild();
                    return;
                }
                if(isLeftChild){
                    parentNode.setLeftChild(currentNode.getRightChild());
                }else{
                    parentNode.setRightChild(currentNode.getRightChild());
                }
                currentNode.setRightChild(null);
            }
        }
    }

    /**
     *    获得中序后继节点
     *
     * @author jiangjiaxin
     * @date 2018-02-27 14:33
     * @param
     * @return 中序后继节点
     */
    private Node getInheritNode(Node deleteNode){
        //当前遍历的节点
        Node currentNode = deleteNode.getRightChild();
        //当前节点的父节点
        Node parentNode = currentNode;
        while(true){
            if(currentNode.getLeftChild() != null){
                parentNode = currentNode;
                currentNode = currentNode.getLeftChild();
            }else{
                break;
            }
        }
        //中序后继节点等于要删除节点的右子节点
        if(currentNode == deleteNode.getRightChild()){
            if(currentNode.getRightChild() != null){
                deleteNode.setRightChild(currentNode.getRightChild());
                currentNode.setRightChild(null);
            }else{
                deleteNode.setRightChild(null);
            }
            return currentNode;
        }
        //中序后继节点有右子节点时，将后继节点父节点的左子节点指向后继节点的右子节点
        if(currentNode.getRightChild() != null){
            parentNode.setLeftChild(currentNode.getRightChild());
            currentNode.setRightChild(null);
        }else{
            parentNode.setLeftChild(null);
        }
        return currentNode;
    }

    /**
     *    中序遍历
     *
     * @author jiangjiaxin
     * @date 2018-02-26 15:56
     * @param
     * @return
     */
    public void inOrderTraversal(Node localNode){
        if(localNode != null){
            inOrderTraversal(localNode.getLeftChild());
            System.out.println(localNode.getNumber() + ": " + localNode.getName());
            inOrderTraversal(localNode.getRightChild());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
