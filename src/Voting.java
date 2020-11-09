
import java.util.Scanner;

public class Voting {


        static String[] candidateNames = { "Robert", "Amy", "Albert", "Mary", "Henry" };
        static int[] candidates = { 0, 0, 0, 0, 0 };
        static int numberOfCandidates = 5;
        static Scanner sc;

        public static void main(String[] args) {

//		Challenge:
//		You are going to design a program to handle a pooling situation. When the program starts a menu is printed:
//		1)Vote
//		2)Show candidates
//		3)Show the result
//
//		You must have an array(you decide which type primitive or arraylist) with the names of 5 candidates.
//		The user votes by entering the number 1-5 and the votes are stored in another array. show candidates by
//		printing their names in column. show results by printing the name of the candidate and his votes in star format ex:
//		Bob: *******
//		Nick: ******************
//		Extra: show the candidates order by their votes(hint: sort the votes array and in the same time don`t forget to
//				sort the array of the names in order for the name to be synchronized with the votes)

//		need to swap both the number of votes and the name of the candidates...

            int menuSelection = -1;
            sc = new Scanner(System.in);
            while (true) {
                while (true) {

                    printMenu();
                    menuSelection = sc.nextInt();
                    if (menuSelection < 1 || menuSelection > 3) {
                        System.out.println("Invalid selection, try again");
                    } else {
                        break;
                    }
                }

                switch (menuSelection) {
                    case (1): {
                        vote();
                        break;
                    }
                    case (2): {
                        showCandidates();
                        break;
                    }
                    case (3): {
                        showResults();
                        break;
                    }
                }

            }
        }

        public static void printMenu() {
            System.out.println("Make a selection:\n" + "1) Vote\n" + "2) Show candidates\n" + "3) Show the result");
        }

        public static void vote() {
            System.out.println("Select your candidate by number: ");
            showCandidates();

            int number = sc.nextInt();

            candidates[number - 1]++;
            System.out.println("increment happened...");

        }

        public static void showCandidates() {
            for (int i = 0; i < numberOfCandidates; i++) {
                System.out.printf("%d) %s:\n", i + 1, candidateNames[i]);
            }
            System.out.println("************************************");
        }

        public static void showResults() {
//		for(int c:candidates) {
//		System.out.println(c);
//		}
            int stepThruArray = 0, stars = 0;
            for(String cn: candidateNames) {
                stars = 0;
                System.out.print(cn + ":");
                while(stars<candidates[stepThruArray]){
                    System.out.print("*");
                    stars++;
                }
                System.out.print("\n");
                stepThruArray++;
            }
            System.out.println();

        }
    }

