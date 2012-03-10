package MainServer;

public class GenericFile implements Comparable {
	private String type;
	private String name;
	private String location;
	private long size;
	
	
	public GenericFile(String type, String name, String location,long size){
		this.type=type;
		this.name=name;
		this.location=location;
		this.size=size;
	}


	public String getType() {
		return type;
	}


	public String getName() {
		return name;
	}


	public String getLocation() {
		return location;
	}


	public float getSize() {
		return size;
	}
	
	public String toString(){
		String str="";
		return name;
	}


	@Override
	public int compareTo(Object arg0) {
		GenericFile gf= (GenericFile)arg0;
		return this.getName().compareTo(gf.getName());
	}
	
	
}
