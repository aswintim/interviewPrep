import java.util.*;

public class Graph{ //adjacency list graph implementation

   private LinkedList<Integer> adj[]; 

   public Graph(int v){
      adj = new LinkedList[v];
      for(int i=0; i<v; i++){
         adj[i] = new LinkedList<Integer>();
      }
   }
   
   public void addEdge(int source, int destination){
      adj[source].add(destination);
      adj[destination].add(source);
   }
   
   public int bfsImplement(int source, int destination){
      Queue<Integer> q = new LinkedList<>();
      int[] parent = new int[adj.length];
      boolean[] visited = new boolean[adj.length];
   
      q.add(source);
      visited[source] = true;
      parent[source] = -1;
   
      while(!q.isEmpty()){
         int current = q.poll();
         if(current == destination) 
            break;
      
         for(int child : adj[current]){
            if(!visited[child]){
               visited[child]=true;
               parent[child]=current;
               q.add(child);
            }
         }
      }
   
      int cur = destination;
      int distance = 0;
      while(cur!=-1){
         System.out.print(cur+"--> ");
         cur = parent[cur];
         distance++;
      }
      return distance-1;
   }
   
   public boolean dfsRecur(int source, int destination){
      boolean[] vis = new boolean[adj.length];
      vis[source] = true;
      return dfsRecurImp(source, destination, vis);
   }
   
   public boolean dfsRecurImp(int source, int destination, boolean[] vis){
      if(source==destination) 
         return true;
      for(int child:adj[source]){
          if(!vis[child]){
            vis[child]=true;
            boolean path = dfsRecurImp(child, destination, vis);
            if(path) 
               return true;
          }
      }
      return false;
   }
   
   public boolean dfsStack(int source, int destination){
      Stack<Integer> stack = new Stack<>();
      boolean[] visited = new boolean[adj.length];
      visited[source] = true;
      
      stack.push(source);
      
      while(!stack.isEmpty()){
         int cur = stack.pop();
         
         if(cur == destination) return true;
         
         for(int child:adj[cur]){
            if(!visited[child]){
               visited[child] = true;
               stack.push(child);}
         }
      }
      return false;
   }

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of vertices and edges: ");
      int v = sc.nextInt();
      int e = sc.nextInt();
   
      Graph graph = new Graph(v);
      System.out.println("Enter "+e+" edges");
      for(int i=0; i<e;i++){
         int source = sc.nextInt();
         int destination = sc.nextInt();
      
         graph.addEdge(source, destination);
      }
      
      System.out.println(" Min Distance is: "+ graph.bfsImplement(0, 3));
      
      System.out.println("Is there a path between 2 and 0: "+ graph.dfsRecur(2, 0));
      
      System.out.println("Is there a path between 2 and 0: "+ graph.dfsStack(2, 0));
   
   }
}