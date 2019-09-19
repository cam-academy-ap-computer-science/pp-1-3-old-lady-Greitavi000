
public class OldLady {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		System.out.println("");
		oldlady();
		System.out.println(" fly");
		swallowed();
		System.out.println("");
		oldlady();
		System.out.println(" spider,");
		System.out.println("That wiggled and iggled and jiggleg inside her;");
		spiderToFly();
		swallowed();
		System.out.println("");
		oldlady();
		System.out.println(" bird;");
		System.out.println("How absurd to swallow a bird.");
		birdToSpider();
		spiderToFly();
		swallowed();
		System.out.println("");
		oldlady();
		System.out.println(" cat;");
		System.out.println("Fancy that to swallow a cat!");
		catToBird();
		birdToSpider();
		spiderToFly();
		swallowed();
		System.out.println("");
		oldlady();
		System.out.println(" dog;");
		System.out.println("What a hog, to swallow a dog;");
		System.out.println("She swallowed the dog to catch the cat,");
		catToBird();
		birdToSpider();
		spiderToFly();
		swallowed();
		System.out.println("");
		System.out.println("There was an old lady who swallowed a horse...");
		System.out.println("She's dead, of course!");
		
	}
		
		public static void swallowed() {
		System.out.println("I don't know why she swallowed a fly - ");
		System.out.println("Perhaps she'll die!");
		
		}
		
		public static void fly() {
		System.out.println(" fly");
		
		}
		
		public static void oldlady() {
		System.out.print("There was an old lady who swallowed a");
		}
	
		public static void spiderToFly() {
			System.out.print("She swallowed the spider to catch the");
			fly();
		}
		public static void birdToSpider() {
		System.out.println("She swallowed the bird to catch the spider,");
		}
		public static void catToBird() {
		System.out.println("She swallowed the cat to catch the bird,");
	
		}
		

}



