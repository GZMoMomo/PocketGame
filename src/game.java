import java.util.ArrayList;
import java.util.Collections;


public class game {
	private String[] Card= {"黑桃","红桃","方块","梅花"};
	private int[] point= {1,2,3,4,5,6,7,8,9,10,11,12,13};
	ArrayList<card> ary=new ArrayList<card>();
	card cad;
	String player1Name;
	int player1ID;
	String player2Name;
	int player2ID;
	
	public int cardSize(String card) {
		String cardSize;
		switch(card) {
		case "方块": cardSize="1";return 1;
		case "梅花":cardSize="2";return 2;
		case "红桃":cardSize="3";return 3;
		case "黑桃":cardSize="4";return 4;
		}
		return -1;
	}
	
	public game(){
		
		for(int i=0;i<13;i++) {
			card cd1=new card(Card[0],point[i]);
			card cd2=new card(Card[1],point[i]);
			card cd3=new card(Card[2],point[i]);
			card cd4=new card(Card[3],point[i]);
			
			ary.add(cd1);ary.add(cd2);ary.add(cd3);ary.add(cd4);
			
		}
	}
	 public void creatPlayer1(String name,int ID) {
		 player player1=new player(name,ID);
		 player1Name=player1.getName();
		 player1ID=player1.getID();
	 }
	 
	 public void creatPlayer2(String name,int ID) {
		 player player2=new player(name,ID);
		 player2Name=player2.getName();
		 player2ID=player2.getID();
	 }
	
	
	public void print() {
		for(int i=0;i<52;i++) {
			System.out.print(ary.get(i).getCard()+ary.get(i).CgetPoint()+" ");
			
		}
		System.out.println();
		
	}
	public void getPoker1() {
		System.out.print(ary.get(0).getCard()+ary.get(0).CgetPoint()+" ");
		System.out.print(ary.get(1).getCard()+ary.get(1).CgetPoint()+" ");
		System.out.println();
	}
	public void getPoker2() {
		System.out.print(ary.get(2).getCard()+ary.get(2).CgetPoint()+" ");
		System.out.print(ary.get(3).getCard()+ary.get(3).CgetPoint()+" ");
		System.out.println();
	}

	
	public void getMaxCard() {
		int maxpoint=0;
		String maxpointSTR;
		String maxcard=null;
		int temp1;int temp2;
		String pointSTR1;String pointSTR2;
		
		if(ary.get(0).getPoint()<ary.get(1).getPoint()) {
			temp1=ary.get(1).getPoint();
			pointSTR1=ary.get(1).getCard();
		}else {
			temp1=ary.get(0).getPoint();
			pointSTR1=ary.get(0).getCard();
		}
		
		if(ary.get(2).getPoint()<ary.get(3).getPoint()) {
			temp2=ary.get(3).getPoint();
			pointSTR2=ary.get(3).getCard();
		}else {
			temp2=ary.get(2).getPoint();
			pointSTR2=ary.get(2).getCard();
		}
		
		
		if(temp1<temp2) {
			maxpoint=temp2;
			maxcard=pointSTR2;
		}
		
		
		if(temp1==temp2) {
		  if(cardSize(pointSTR1)<cardSize(pointSTR2)) {
			maxpoint=temp2;
			maxcard=pointSTR2;
		  }
		}
		
		if(temp1>temp2){
		maxpoint=temp1;
		maxcard=pointSTR1;
	}
		
		maxpointSTR=String.valueOf(maxpoint);
		if(maxpoint>10) {
			
			if(maxpoint==1) {
				maxpointSTR= "A";
			}
			if(maxpoint==11) {
				maxpointSTR= "J";
			}
			if(maxpoint==12) {
				maxpointSTR= "Q";
			}
			if(maxpoint==13) {
				maxpointSTR= "K";
			}
			
		}
		
		
		System.out.println(maxcard+maxpointSTR+" 为最大");
		if(temp1<temp2) {
			System.out.println(player2Name+" 胜利！");
		}else {
			System.out.println(player1Name+" 胜利！");
		}
		
	}

	
	public void shuffle() {
		Collections.shuffle(ary);
		
	}

	
	
	
	
	

}
