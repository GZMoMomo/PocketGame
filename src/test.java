import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           game gam=new game();
           System.out.println("--------��������---------");
           gam.print();
           System.out.println("--------��ʼϴ��---------");
           gam.shuffle();
           System.out.println("'''''''''''''''''''''''");
           System.out.println("'''''''''''''''''''''''");
           System.out.println("--------ϴ�����---------");
           System.out.println("--------�������---------");
           System.out.println("�������1������������ID");
           Scanner scan=new Scanner(System.in);
           String name=scan.next();
           System.out.println("����ID");
           int ID=scan.nextInt();
           gam.creatPlayer1(name, ID);
           System.out.println("�������2����������");
           String name2=scan.next();
           System.out.println("����ID");
           int ID2=scan.nextInt();
           gam.creatPlayer2(name2, ID2);
           System.out.print(gam.player1Name+"������Ϊ��");
           gam.getPoker1();
           System.out.print(gam.player2Name+"������Ϊ��");
           gam.getPoker2();  
           System.out.println("-------���ƶԱ�ing------------------");
           gam.getMaxCard();
           
           
	}

}
