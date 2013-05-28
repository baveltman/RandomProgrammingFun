//prints all nodes at the kth level of a BST
//the 0th level is the first level where the root is found
//runtime is O(n) where n is the number of nodes in the BST
public void printAllNodesAtLevel (BinaryTreeNode<E> root, int k){
	if (k == 0){
		System.out.println(root.getData());
	} else {
		//obtain nodes at a chosen level
		List<BinaryTreeNode<E>> level = new ArrayList<BinaryTreeNode<E>>();
		level.add(root);
		for (int i = 0; i < k; ++i){
			level =	printAllNodesAtLevelHelper(level);
		}

		if (level.isEmpty()){
			//no nodes at specified level
			System.out.println("no nodes at specified level");
		} else {
			//print the nodes at level k
			for (int j = 0; j < level.size(); ++j){
				System.out.print(level.get(j).getData() + " ");
			}
		}
	}
}

//obtains the nodes at a given level and stores them in a list that is returned 
private List<BinaryTreeNode<E>> printAllNodesAtLevelHelper (List<BinaryTreeNode<E>> level){
	//create new list to store results of the next level traversal
	List<BinaryTreeNode<E>> newLevel = new ArrayList<BinaryTreeNode<E>>();

	//traverse current level and retrieve all the nodes in the next level
	//do this by looking at the children of each node at this level
	//store nodes of nextLevel in newLevel
	for (int i = 0; i < level.size(); ++i){
		if (level.get(i).getLeft() != null){
			newLevel.add(level.get(i).getLeft());
		}
		if (level.get(i).getRight() != null){
			newLevel.add(level.get(i).getRight());
		}
	}
	return newLevel;
}