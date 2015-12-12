package w3l10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * @author 984881
 * 
 * result
 * 
1,2,3,9,12,15,16,19,22,25,56,100,
Pre order:
15,1,2,3,9,12,16,19,22,25,56,100,
Post order:
1,2,3,9,12,16,19,22,25,56,100,15,
Contains 1?:True

Contains 101?:False

Contains 12?:True
 */




public class MyBST {
			
			boolean re = false;
		
			private void preOrder(BinaryNode t){
				if( t != null ){
				    System.out.print(t.element+",");
				    printTree( t.left );
				    printTree( t.right );
				} 
			}
			private void postOrder(BinaryNode t){
				if(t!=null) {
				    printTree( t.left );
				    printTree( t.right );
				    System.out.print(t.element+",");
				}
			}
			
			private boolean Search(BinaryNode t,int key) {
				int tmp = 0;
				
				if(t!=null) {
					Search( t.left,key );
				    tmp = t.element;
				    if(tmp==key)
				    {
				    	re = re || true;
				    }
				   
				    Search( t.right,key );
				}

				return re;
				
			}
			public boolean contains(int key){
				re = false;
				return Search(root,key);
			}
			public BinaryNode getRoot(){
				return root;
			}
			public int leafNodes(BinaryNode t){
				int count = 0;
				if(t!=null) {
				    printTree( t.left );
				    printTree( t.right );
				   if(t.left==null&t.right==null)
					   count++;
				}
				return count;
			}
			public int size(){
				return size;
			}
			public boolean isLeaf(){
				return (root.left==null&root.right==null)?true:false;
			} // check the tree is leaf 
			
			/** The tree root. */
			
			private BinaryNode root;
			private int size;

			public MyBST() {
				root = null;
				size = 0;
			}
			
			/**
			* Prints the values in the nodes of the tree
			* in sorted order. Inorder Traversal
			*/
			public void printTree() {
				if( root == null )
					System.out.println( "Empty tree" );
				else
					printTree(root);
			}
			// Inorder Traversal to print the nodes in Ascending order
			private void printTree( BinaryNode t ){
				if( t != null ){
					printTree( t.left );
				    System.out.print(t.element+",");
				    printTree( t.right );
				} 
			}
				 
			//Assume the data in the Node is an Integer.	

			public void insert(Integer x) {
				if (root == null) {
					root = new BinaryNode(x);
					return;
				}
				else { 
					BinaryNode n = root;
					boolean inserted = false;

					while(!inserted)//true
						{
						if(x.compareTo(n.element)<0) {
							//space found on the left
							if(n.left == null){
								n.left = new BinaryNode(x,null,null);
								inserted = true;
							}
							//keep looking for a place to insert (a null)
							else {
								n = n.left;
							}
						}				
						else if(x.compareTo(n.element)>0){ 
							//space found on the right					
							if(n.right==null){
							n.right = new BinaryNode(x,null,null);
							inserted = true;
							}
								//keep looking for a place to insert (a null)
							else {
									n = n.right;
							}
												
						}
						// if a node already exists
						else {
							inserted = true;
							size--;
						}

					}

				}
				size++;
			}
			private class BinaryNode {

				private Integer element;// The data in the node
				private BinaryNode left;      // Left child
				private BinaryNode right;     // Right child	  
				// Constructors 
				
				BinaryNode( Integer theElement ){
					this( theElement, null, null );
				}	

				BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
					this.element = element;
					this.left = left;
					this.right = right;
				}
				
			}
				

			public static void main(String[] args) {
				
				MyBST mybst = new MyBST();
				
				int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
			
				for (int j = 0; j < a.length; j++ ) {
					mybst.insert(a[j]);
							
				}
				mybst.insert(12);
				mybst.printTree();
				System.out.println("\nPre order:");
				mybst.preOrder(mybst.getRoot());
				System.out.println("\nPost order:");
				mybst.postOrder(mybst.getRoot());
				//boolean test = mybst.contains(1);
				System.out.println("\nContains 1?:"+(mybst.contains(1)?"True":"False"));
				System.out.println("\nContains 101?:"+(mybst.contains(101)?"True":"False"));
				System.out.println("\nContains 12?:"+(mybst.contains(12)?"True":"False"));
				/*
				TreeSet<Integer> ts = new TreeSet<Integer>();
				
				for (int j = 0; j < a.length; j++ ) {
					ts.add(a[j]);
					System.out.println("\nAfter inserting " + j + "th item " + a[j]);
					Iterator<Integer> it = ts.iterator();		
					Integer nextItem = null;
					while(it.hasNext()) {
						nextItem = it.next();
						System.out.print(nextItem + " ");
					} 
					System.out.println();
				}
				
				TreeMap<Integer, String> map = new TreeMap<Integer, String>();
				map.put(8, "Hello");
				map.put(10, "World!");
				map.put(11, "Welcome");
				map.remove(8);
				String str = map.get(11)+", "+ map.get(10);
				System.out.println(str);
					*/
			}
		}



