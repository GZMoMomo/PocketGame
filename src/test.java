import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           game gam=new game();
           System.out.println("--------创建卡牌---------");
           gam.print();
           System.out.println("--------开始洗牌---------");
           gam.shuffle();
           System.out.println("'''''''''''''''''''''''");
           System.out.println("'''''''''''''''''''''''");
           System.out.println("--------洗牌完毕---------");
           System.out.println("--------创建玩家---------");
           System.out.println("创建玩家1，输入姓名和ID");
           Scanner scan=new Scanner(System.in);
           String name=scan.next();
           System.out.println("输入ID");
           int ID=scan.nextInt();
           gam.creatPlayer1(name, ID);
           System.out.println("创建玩家2，输入姓名");
           String name2=scan.next();
           System.out.println("输入ID");
           int ID2=scan.nextInt();
           gam.creatPlayer2(name2, ID2);
           System.out.print(gam.player1Name+"的手牌为：");
           gam.getPoker1();
           System.out.print(gam.player2Name+"的手牌为：");
           gam.getPoker2();  
           System.out.println("-------卡牌对比ing------------------");
           gam.getMaxCard();
           
           
	}

}
