package ai.jobiak.source;

public class players {

	private String name;
	private int rank;
	public players() {
		
		// TODO Auto-generated constructor stub
	}
	public players(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", rank=" + rank + "]";
	}
	
}
