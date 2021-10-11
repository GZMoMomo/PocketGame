import java.util.Comparator;

public class card  {
	    private String card;
	    private String cardSize;
		private int point;
		
		public int cardSize(String card) {
			switch(card) {
			case "·½¿é": cardSize="1";return 1;
			case "Ã·»¨":cardSize="2";return 2;
			case "ºìÌÒ":cardSize="3";return 3;
			case "ºÚÌÒ":cardSize="4";return 4;
			}
			return -1;
		}
		public card(String str, int t) {
			this.card=str;
			this.point=t;
		}

		public String getCard() {
			return card;
		}

		public void setCard(String card) {
			this.card = card;
		}
		
		public String CgetPoint() {
			switch(point) {
			case 1:return "A";
			case 11:return "J";
			case 12:return "Q";
			case 13:return "K";
			}
			return String.valueOf(point);
		}

		public int getPoint() {
			
			return point;
		}

		public void setPoint(int point) {
			this.point = point;
		}
		
		
		

	
        
		
		
}
