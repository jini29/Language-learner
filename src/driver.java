import java.util.Scanner;
public class driver {

	public static void main(String[] args) {
			System.out.println("Are you ready to learn?");
			System.out.println("Yes[1], No[0]");
			Scanner scanner = new Scanner(System.in);
			while (scanner.nextInt() != 1) {
				System.out.println("Are you ready to learn?");
				System.out.println("Yes[1], No[2]");
			}
			
			int learn = 0;
			while (learn != 5) {
			System.out.println("Which language you want to learn?");
			System.out.println("Igbo[1], Yoruba[2], Ijaw[3], English[4], Spanish[5]");
			int i = scanner.nextInt();
			if(i ==1){
				System.out.println("Igbo is the principal native language of the Igbo people, an ethnic group from eastern Nigeria.");
				System.out.println("These are it's letters: A a, B b, Ch ch, D d, E e, F f, G g, Gb gb, Gh gh, Gw gw, H h, l i,"
						+"\n"+ "Ị ị, J j, K k, Kp kp, Kw kw, L l, M m, N n, Ṅ ṅ, Nw nw, Ny ny, O o, "
						+"\n"+"Ọ ọ,P p, R r, S s, Sh sh, T t, U u, Ụ ụ, V v, W w, Y y, Z z");
			}else if(i == 2) {
				System.out.println("Yoruba is a language spoken in West Africa, most prominently Southwestern Nigeria.");
				System.out.println("These are it's letters:A a a, B b b, D d d, Ẹ ẹ ɛ, F f f, G g g, GB gb ɡ͡b, H h h, I i i, "
						+"\n"+"J j d͡ʒ, K k k, L l l, M m m, N n n,ŋ̍, O o o, P p k͜p, R r"
						+"\n"+ " r, S s s, Ṣ ṣ ʃ, T t t, U u u, W w w, Y y y");
			}
			else if(i==3) {
				System.out.println("Ijaw is a language spoken in Southern Nigeria.");
				System.out.println("These are it's letter: a, b ,c ,d, e, é, f, g(h), i, "
						+ "\n"+"k, l, m, n, o, ó, p, r, s, t, u, ù, v, w, y, z");
				}
			else if(i==4) {	
				System.out.println("English is a West Germanic language of the Indo-European language family, originally spoken by the inhabitants of early medieval England");
				System.out.println("These are it's letter:A a, B b, C c, D d, E e, F f, H h, I i, J j, "
						+ "\n"+"K k, L l, M m, N n, O o, P p, Q q, R r, S s, "
						+ "\n"+"O o, P p, Q q, R r, S s, T t, U u, V v, W w, X x, Y y, Z z");
				}
				else if(i==5) {
				System.out.println("Spanish is a Romance language that originated in the Iberian Peninsula of Europe");
				System.out.println("Thesse are it's letters: A a, B b, C c, D d, E e, F f, G g, "
						+ "\n"+"H h, I i, J j, K k, L l, LL ll,"
						+ "\n"+"M m, N n(ñ), O o, P p, Q q, R r, RR rr, S s, T t, U u, V v, W w, X x, Y y, Z z");
				}
			learn++;
			}
			
			System.out.println("Great, you have went through all of the langague, now let's play a game to test you knowlege");
			System.out.println("Yes[1], No[2]");
			if(scanner.nextInt() == 1) {
				System.out.println("The letter A appears in which of the following langague? (selection all apply with no space)");
				System.out.println("Igbo[1], Yoruba[2], Ijaw[3], English[4], Spanish[5]");
				String answer;
				answer = scanner.next();
				if(answer.equals("12345")) {
					System.out.println("great job, you got it right!");
				}
				else {
					System.out.println("Nice try, but the answer is 12345");
				}
				
				System.out.println("The letter RR appears in which of the following langague? (selection all apply with no space)");
				System.out.println("Igbo[1], Yoruba[2], Ijaw[3], English[4], Spanish[5]");
				answer = scanner.next();
				if(answer.equals("5")) {
					System.out.println("great job, you got it right!");
				}
				else {
					System.out.println("Nice try, but the answer is 5");
				}
				
				System.out.println("The letter Z appears in which of the following langague? (selection all apply with no space)");
				System.out.println("Igbo[1], Yoruba[2], Ijaw[3], English[4], Spanish[5]");
				answer = scanner.next();
				if(answer.equals("1345")) {
					System.out.println("great job, you got it right!");
				}
				else {
					System.out.println("Nice try, but the answer is 1345");
				}
				
				
			}
			
			scanner.close();
	}
	
}
