package ai.jobiak.source;

public class Misllaneous {

	public static void main(String[] args) {
		
		players p1=new players("Rohith sharma",1);
		players p2=new players("Virak Kohil",2);
		players p3=new players("Rahul",3);
		players p4=new players("Shekar Dhavan",4);
		players p5=new players("Hardik Pandey",5);
		players p6=new players("Shreya pndey",6);
		players p7=new players("Ravindera jadeja",7);
		players p8=new players("Bumra",8);

		int numbers[]=new int[8];
		String names[]=new String[8];
		players players[]=new players[8];
		
		for(players player:players) {
			System.out.println(players);
		}
		
		players[0]=p4;
		players[1]=p1;
		players[2]=p3;
		players[3]=p7;
		players[4]=p2;
		players[5]=p8;
		players[6]=p5;
		players[7]=p6;
		
		for(players player:players) {
			System.out.println(player.getName()+ "\n"+"Ranking"+player.getRank());
		}
	}
}
