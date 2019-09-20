/***
 * Grading comments:
 *  Nice job... but wow you did alot of typing!
 *  The main concept with this lab was to reduce 
 *  duplication of typing by using methods, and you
 *  did that - but you could have done more.
 *  Compiles/Runs 15/15 
 *  Desired Output: 6/6
 *  Consistency: 1/2:  It's important to keep your indentation and
 *     naming conventions 'oldlady' vs 'oldLady' if 'spiderToFly'?
 *  Efficiency:   1/2:  Good job - but you could have used some
 *   nesting of methods and maybe cleaned up main with some more
 *   verses methods that called your other methods.
 */
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
		
	// GC: Your methods shouldn't be so indented - they should line up with main.	
		public static void swallowed() {
		// GRADING: Indent me! --->
		System.out.println("I don't know why she swallowed a fly - ");
		System.out.println("Perhaps she'll die!");
		
		}
		
		public static void fly() {
		System.out.println(" fly");
		
		}
		
		public static void oldlady() {
		System.out.print("There was an old lady who swallowed a");
		}
	
		// GC: This is good indentation!	
		public static void spiderToFly() {
			System.out.print("She swallowed the spider to catch the");
			fly();
		} // GC: but you didn't leave a space between methods here...
		public static void birdToSpider() {
		System.out.println("She swallowed the bird to catch the spider,");
		}
		public static void catToBird() {
		System.out.println("She swallowed the cat to catch the bird,");
	
		}
		

}



