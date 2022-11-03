package studio7;

public class Die {

		private int n;
		
		public Die(int initN) {
			n=initN;
		}
		
		public int rollDie() {
			return (int)(Math.random()*n)+1;
		}
}
