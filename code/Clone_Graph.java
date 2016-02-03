import java.util.*;

class UndirectedGraphNode {
     int label;
     List<UndirectedGraphNode> neighbors;
     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 };
 
public class Clone_Graph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Queue<UndirectedGraphNode> a=new LinkedList<UndirectedGraphNode>();
        Map<UndirectedGraphNode,UndirectedGraphNode> store=new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        if(node==null) return null;
        UndirectedGraphNode clone=new UndirectedGraphNode(node.label);
        store.put(node,clone);
        a.offer(node);
        while(!a.isEmpty()){
            Queue<UndirectedGraphNode> b=new LinkedList<UndirectedGraphNode>();
            while(!a.isEmpty()){
                UndirectedGraphNode newNode=a.poll();
                UndirectedGraphNode newClone=store.get(newNode);
                for(UndirectedGraphNode temp:newNode.neighbors){
                    if(!store.containsKey(temp)){
                        if(temp==newNode) newClone.neighbors.add(newClone);
                        else{
                            UndirectedGraphNode temp1=new UndirectedGraphNode(temp.label);
                            store.put(temp,temp1);b.offer(temp);newClone.neighbors.add(temp1);
                        }
                    }
                    else newClone.neighbors.add(store.get(temp));
                }
            }
            a=b;
        }
        return clone;
    }
}
