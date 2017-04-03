import java.util.Deque;
import java.util.*;

class Graph
{
	static int [] visited;
	static Stack<Integer> sorted=new Stack<Integer>();
	private static void topologicalsort(int[][] graph, int source,int n) {
		// TODO Auto-generated method stub
		
		visited[source]=1;
		for(int i=0;i<n;i++)
		{
			
			if(graph[source][i]==1 && visited[i]==0)
			{
				topologicalsort(graph,i,n);
			}
			
			
		}
		
		sorted.push(new Integer(source));
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		visited=new int[n];
		int [][] graph=new int[8][8];
		graph[0][1]=1;
		graph[0][3]=1;
		graph[0][2]=1;
		graph[1][3]=1;
		graph[1][4]=1;
		graph[3][4]=1;
		graph[3][2]=1;


		
		for(int i=0;i<n;i++)
		{
		if(visited[i]==0)
		{
			Graph.topologicalsort(graph,i,n);

		}
		}
		int i = sorted.size()-1;
		
		for (; i >= 0; i--) {
			
		
		System.out.println(sorted.elementAt(i));
		}
		
		

		
	}


}
