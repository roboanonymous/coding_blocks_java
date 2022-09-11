package Graphs;

import java.util.*;
public class Graph {

	private class Vertex
	{
		HashMap <String, Integer> nbrs = new HashMap<>();
	}
	
	HashMap <String , Vertex> vtces ;
	
	public Graph()
	{
		vtces = new HashMap<>();
	}
	
	public int numVertex(){
		
		return vtces.size();
	}
	
	
    public boolean ContainVertex(String vname){
		return vtces.containsKey(vname);
	}
	
    public void addVertex(String vname){
		Vertex vcs = new Vertex();
		vtces.put(vname, vcs);
		
	}

    public void removeVertex(String vname){
    	
    	Vertex vtx = vtces.get(vname);
    	ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
    	
    	for(String key: keys)
    	{
    		Vertex nbrvtx = vtces.get(key);
    		nbrvtx.nbrs.remove(vname);
    	}
    	
    	vtces.remove(vname);
    	
     }
    
    public int numEdge()
    { 
    	int count = 0;
    	ArrayList<String> keys = new ArrayList <>(vtces.keySet());
    	for(String key : keys)
    	{
    		Vertex vtx = vtces.get(key);
    		count = count + vtx.nbrs.size();
    	}
    	
    	return count/2;
    	
    }
    
    public boolean containEdge(String vname1 , String vname2)
    {
    	Vertex vtx1 = vtces.get(vname1);
    	Vertex vtx2 = vtces.get(vname2);
    	
    	if(vtx1 == null || vtx2 == null ||  !vtx1.nbrs.containsKey(vname2))
    	{
    		return false;
    	}
    	
    	return true;
    }
    
    public void AddEdge(String vname1, String vname2, int cost)
    {
    	Vertex vtx1 = vtces.get(vname1);
    	Vertex vtx2 = vtces.get(vname2);
    	
    	if(vtx1 == null || vtx2 == null ||  vtx1.nbrs.containsKey(vname2))
    	{
    		return ;
    	}
    	
    	vtx1.nbrs.put(vname2, cost);
    	vtx2.nbrs.put(vname1, cost);
    	
    }    
    
    public void RemoveEdge(String vname1, String vname2)
    {
    	Vertex vtx1 = vtces.get(vname1);
    	Vertex vtx2 = vtces.get(vname2);
    	
    	if(vtx1 == null || vtx2 == null ||  !vtx1.nbrs.containsKey(vname2))
    	{
    		return ;
    	}
    	
    	vtx1.nbrs.remove(vname2);
    	vtx1.nbrs.remove(vname1);
    	
    }

    public void display() {
    	
    	System.out.println("---------------------------");
    	
    	ArrayList<String> keys = new ArrayList <>(vtces.keySet());
    	for(String key : keys)
    	{
    		Vertex vtx = vtces.get(key);
    		System.out.println(key + " : " + vtx.nbrs);
    	}
    	
    	System.out.println("---------------------------");
    }
    
    public boolean haspath(String vname1, String vname2 , HashMap <String , Boolean> process)
    {
    	process.put(vname1, true);
    	
    	if(containEdge(vname1 , vname2))
    	{
    		return true;
    	}
    	
    	Vertex vtx = vtces.get(vname1);
    	
    	ArrayList<String> keys = new ArrayList <>(vtx.nbrs.keySet());
    	
    	for(String key: keys)
    	{
    		if( !process.containsKey(key) && haspath(key , vname2, process))
    		{
    			return true;
    		}
    	}
    	
    	
    	return false;
    	
    }
    
    private class pair
    {
    	String vname;
    	String psf;
    }
    
    public boolean bfs (String src, String dest)
    {
    	HashMap <String , Boolean> process = new HashMap<>();
    	LinkedList <pair> queue = new LinkedList <>();
    	
    	pair sp = new pair();
    	sp.vname = src;
    	sp.psf = src;
    	
    	queue.addLast(sp);
    	
    	while(!queue.isEmpty()) {
    		
    		pair rp = queue.removeFirst(); 
    		
    		if(process.containsKey(rp.vname)){
    			continue;
    		}
    		
    		process.put(rp.vname, true);
    		
    		if(containEdge(rp.vname, dest))
    		{
    			System.out.println(rp.psf + dest);
    			return true;
    		}
    		
    		Vertex rpvtx = vtces.get(rp.vname);
    		ArrayList <String> nbrs = new ArrayList <> (rpvtx.nbrs.keySet());
    		
    		for(String nbr: nbrs )
    		{
    			if(!process.containsKey(nbrs))
    			{
    				pair np = new pair ();
        			np.vname = nbr;
        			np.psf = rp.psf + nbr;
        			
        			queue.addLast(np);
    				
    			}
    			
    		}
    		
    		
    	}
    	
    	return false;
    }
}

