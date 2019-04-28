
/**
 * @author Andrew Buxton
 * CISC 231
 * Dr. Sawin
 * 2.15.2016
 * 
 * This class counts the number of instances for each letter of the 
 * alphabet for a given text as well as the total number of characters. 
 * It then displays a histogram of letter occurances.
 */
public class LetterCounter {
	
	private static int[] 	letterCount 		=  	new int[26];
	private static final 	String alphabet 	= 	"abcdefghijklmnopqrstuvwxyz";
	private static int 		totalLetterCount 	= 	0;
	
	public static void main(String[] args) {
		LetterCounter counter = new LetterCounter();
		for(String s : text) {
			counter.countLetters(s);
			totalLetterCount = totalLetterCount + counter.getTotalCount(s);
			System.out.println(counter.toString());
		}		
		//counter.reset();
	}
	/**
	 * Counts each instance of every letter in the alphabet within the passed text
	 * @param text a string that is to have its letters counted
	 */
	public void countLetters(String text) {
		text = text.toLowerCase();
		String newString = new String(text);
		newString.replaceAll("//W", "");
		newString.replaceAll(" ", "");
		for(int i = 0; i < newString.length(); i++){
			for(int j = 0; j < alphabet.length(); j++){
				if(newString.charAt(i) == alphabet.charAt(j)){
					letterCount[j]++;
				}
			}	
		}
	}

	/**
	 * 
	 * @param text a string that you want the total number of alphabet letters of
	 * @return validCharacterCount an int that holds the number of valid characters
	 *  found in the passed text
	 */
	public int getTotalCount(String text) {
		int validCharacterCount = 0;
		text = text.toLowerCase();
		text = text.replaceAll(" ", "");
		text = text.replaceAll("[^a-z]", "");
		text = text.replaceAll("\n", "");
		validCharacterCount = validCharacterCount + text.length();
		return validCharacterCount;
	}
	
	/**
	 * Used to access the letterCount global variable
	 * @return int[] this.letterCount an int array that holds the counted letters
	 *  continuously over multiple method calls
	 */
	public int[] getLetterCounts(){
		return this.letterCount;
	}
	
	/**
	 * resets both the global variables, letterCount and totalLetterCount, back to 0
	 */
	public void reset() {
		for(int i = 0; i < letterCount.length; i++){
			letterCount[i] = 0;
		}
		totalLetterCount = 0;
	}
	
	/**
	 * @return String histogram a string that when printed displays a histogram
	 *  of the letterCounts for each text passed
	 */
	public String toString() {
		String histogram = "";
		histogram = histogram + "Frequencies after " + totalLetterCount + " characters:\n";
		for(int i = 0; i < letterCount.length; i++){
			double percentage = (letterCount[i]*100.00) / totalLetterCount;
			percentage = Math.round(percentage *100.00);
			percentage = percentage/100;
			histogram = histogram + alphabet.charAt(i) + ":   " + letterCount[i] + "      ";
			histogram =  histogram + "(" + percentage + ")";
			histogram = histogram + "\n";
		}
		return histogram;
	}
	
	 public static String[] text = {
	      
	      "General Background",
	      
	      "The University of St. Thomas, founded in 1885 by Archbishop John Ireland," +
	      " is a Catholic, independent, liberal arts, archdiocesan university that emphasizes" +
	      " values-centered, career-oriented education.",

	      

	      "St. Thomas has been coeducational at the undergraduate level since 1977 and welcomes" +
	      " students of all ages and nationalities and from all religious, racial, ethnic and" +
	      " financial backgrounds.",
	      
	      "Overall, 51 percent of students are women (50 percent at undergraduate level and 52" +
	      " percent at graduate level).",

	      "Overall, about 10 percent are U.S. students of color (10.4 percent at undergraduate" +
	      " level and 10.1 percent at graduate level).",

	      "Overall, 3 percent are international students (2 percent at the undergraduate level" +
	      " and 4.3 percent at the graduate level).",

	      "Overall, 44 percent of students who report their religion are Roman Catholic (53 percent" +
	      " at undergraduate level and 33 percent at graduate level).",

	      "St. Thomas is governed by a 48-member board of trustees. The university is not owned or" +
	      " governed by the Archdiocese of St. Paul and Minneapolis, but the elected chairman of the" +
	      " university's board is the Most Rev. Harry Flynn, archbishop emeritus of St. Paul and Minneapolis." +
	      " He has served as chairman since 1995.",

	      "St. Thomas is a member of the Associated Colleges of the Twin Cities, a consortium of five" +
	      " private liberal arts colleges. Other members are Augsburg, St. Catherine, Hamline and Macalester.",

	      "U.S. News & World Report's \"Best Colleges\" survey in 2005 placed St. Thomas in the national " +
	      "universities-doctoral category where it was listed in the third of four tiers. Prior to 2001, St. Thomas " +
	      "was ranked in the magazine's regional universities category, where St. Thomas placed in the top 10 of 125 " +
	      "Midwest colleges and universities.",

	      "Recent History",
	      
	      "St. Thomas experienced a decade and a half of significant growth from the mid-1970s to the early " +
	      "1990s. Enrollment during that time grew from about 2,500 mostly male undergraduate students to more " +
	      "than 10,000 undergraduate and graduate women and men. St. Thomas' 46 graduate programs (all but one " +
	      "established over the past quarter century) account for more than half of the university's enrollment.",

	      "The first graduate program, in education, began in 1950; the second, in business, began with 76 students " +
	      "in 1974.",

	      "Over the past two decades, St. Thomas has added three new campuses, in Owatonna, downtown Minneapolis, " +
	      "and Rome, Italy.",

	      "When it established a new academic structure in 1990 with an undergraduate college and graduate schools," +
	      " St. Thomas changed its name from college to university. It refined its academic structure in 2001 when " +
	      "it established academic divisions that brought together related graduate and undergraduate programs into" +
	      " common schools and colleges.",

	      "Father Dennis Dease began the 14th presidency of St. Thomas in July 1991. He succeeded Monsignor Terrence Murphy," +
	      " who was president from 1966 to 1991 and subsequently served as chancellor until his death in 2004.",

	      "Little-known facts",
	      "Bill \"the Barber\" Weston has given approximately 305,236 haircuts since becoming the campus barber in 1971.",

	      "Steve \"Greenhouse Steve\" Trost, the university's greenhouse manager, grows between 12,000 and" +
	      " 15,000 annuals in campus greenhouses each year. The plants are used in more than 30 garden spots on " +
	      "the St. Paul and Minneapolis campuses.",

	      "The Chapel of St. Thomas Aquinas is the site of more than 100 student and alumni weddings a year." +
	      " Two weddings are held in the chapel each Saturday, and a Friday evening wedding is held during the" +
	      " summer months."
	   };
}
