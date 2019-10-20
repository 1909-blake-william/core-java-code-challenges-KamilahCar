package com.revature.eval.java.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j = 0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		// Break down a word by its first letter
		// Each space starts a new word
		// Search for a space
		// String builder
		String capitalPhrase = "";// phrase.toUpperCase();
		StringBuilder stringBuilder = new StringBuilder(capitalPhrase);
		// int i = 0;
		// int count = 0;
		// List<String> separateWords = new ArrayList<String>();
		// phrase.split(" ");
		/*
		 * if (i == 0) { //char addChar = capitalPhrase.charAt(i);
		 * stringBuilder.append(capitalPhrase.charAt(i)); }
		 */
		String[] newStrings = phrase.split(" ");
		for (int j = 0; j < phrase.length(); j++) {

			stringBuilder.append(newStrings[0]);
			/*
			 * char letter = capitalPhrase.charAt(j); if (' ' == letter) { //char
			 * genericAddChar = capitalPhrase.charAt(j + 1);
			 * stringBuilder.append(capitalPhrase.charAt(j + 1)); j+=1; }
			 */
		}
		System.out.println(capitalPhrase.toString());
		return capitalPhrase.toString();// stringBuilder.toString().trim();
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
		static class Triangle {
			private double sideOne;
			private double sideTwo;
			private double sideThree;

			public Triangle() {
				super();
			}

			public Triangle(double sideOne, double sideTwo, double sideThree) {
				this();
				this.sideOne = sideOne;
				this.sideTwo = sideTwo;
				this.sideThree = sideThree;
			}

			public double getSideOne() {
				return sideOne;
			}

			public void setSideOne(double sideOne) {
				this.sideOne = sideOne;
			}

			public double getSideTwo() {
				return sideTwo;
			}

			public void setSideTwo(double sideTwo) {
				this.sideTwo = sideTwo;
			}

			public double getSideThree() {
				return sideThree;
			}

			public void setSideThree(double sideThree) {
				this.sideThree = sideThree;
			}

			public boolean isEquilateral() {
				if (sideOne == sideTwo) {
					if (sideOne == sideThree) {
						if (sideTwo == sideThree) {
							return true;
						}
					}
				}
				return false;

			}

			public boolean isIsosceles() {
				// TODO Write an implementation for this method declaration
				if (sideOne == sideTwo || sideTwo == sideThree) {
						return true;
				} else if (sideOne == sideThree || sideTwo == sideThree) {
							return true;
				} else {
					return false;
				}
			}

			public boolean isScalene() {
				// TODO Write an implementation for this method declaration
				if (sideOne != sideTwo) {
					if (sideOne != sideThree) {
						if (sideTwo != sideThree) {
							return true;
						}
					}
				}
				return false;
			}

		}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	//Works
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		// Since more than one letter equals a certain score store in
		// HashMap
		int count = 0;
		int sum = 0;
		Map<Character, Integer> scrabbleHash = new HashMap<Character, Integer>();
		scrabbleHash.put('A', 1);
		scrabbleHash.put('E', 1);
		scrabbleHash.put('O', 1);
		scrabbleHash.put('U', 1);
		scrabbleHash.put('L', 1);
		scrabbleHash.put('N', 1);
		scrabbleHash.put('R', 1);
		scrabbleHash.put('S', 1);
		scrabbleHash.put('T', 1);
		scrabbleHash.put('D', 2);
		scrabbleHash.put('G', 2);
		scrabbleHash.put('B', 3);
		scrabbleHash.put('C', 3);
		scrabbleHash.put('M', 3);
		scrabbleHash.put('P', 3);
		scrabbleHash.put('F', 4);
		scrabbleHash.put('H', 4);
		scrabbleHash.put('V', 4);
		scrabbleHash.put('W', 4);
		scrabbleHash.put('Y', 4);
		scrabbleHash.put('K', 5);
		scrabbleHash.put('J', 8);
		scrabbleHash.put('X', 8);
		scrabbleHash.put('Q', 10);
		scrabbleHash.put('Z', 10);

		scrabbleHash.put('a', 1);
		scrabbleHash.put('e', 1);
		scrabbleHash.put('o', 1);
		scrabbleHash.put('u', 1);
		scrabbleHash.put('l', 1);
		scrabbleHash.put('n', 1);
		scrabbleHash.put('r', 1);
		scrabbleHash.put('s', 1);
		scrabbleHash.put('t', 1);
		scrabbleHash.put('d', 2);
		scrabbleHash.put('g', 2);
		scrabbleHash.put('b', 3);
		scrabbleHash.put('c', 3);
		scrabbleHash.put('m', 3);
		scrabbleHash.put('p', 3);
		scrabbleHash.put('f', 4);
		scrabbleHash.put('h', 4);
		scrabbleHash.put('v', 4);
		scrabbleHash.put('w', 4);
		scrabbleHash.put('y', 4);
		scrabbleHash.put('k', 5);
		scrabbleHash.put('j', 8);
		scrabbleHash.put('x', 8);
		scrabbleHash.put('q', 10);
		scrabbleHash.put('z', 10);
		if (count == 0) {
			sum = scrabbleHash.get(string.charAt(0));
		}
		for (int i = 1; i < string.length(); i++) {
			// Getting value of character and adding it to sum
			sum = sum + scrabbleHash.get(string.charAt(i));
		}
		return sum;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	//Works
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		// String newPhone = string.replaceAll("\\s+","");
		// StringBuilder phoneNumber = new StringBuilder(string);
		// Pattern regexCharacters = Pattern.compile("[.!?\\-]");

		String newString = string.replaceAll("[^0-9]", "");
		String finalString = newString.replaceFirst("1", "");
		if (newString.charAt(0) == '1') {
			// remove character from string
			newString = finalString.trim();
		} else {
			newString = newString.trim();
		}

		return newString;

	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	//Works
	public Map<String, Integer> wordCount(String string) {
		// TODOWrite an implementation for this method declaration
		Map<String, Integer> outputWords = new HashMap<String, Integer>();
		
		
		// create substring based on spaces
		String[] substringInput = string.split(" ");
		//System.out.println(Arrays.toString(substringInput));
	
		for(int i = 0; i < substringInput.length; i++) {
			
			if(outputWords.containsKey(substringInput[i])){
				outputWords.replace(substringInput[i], outputWords.get(substringInput[i]) + 1);

			} else {
				outputWords.putIfAbsent(substringInput[i], 1);
			}
		}
		return outputWords;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> implements Comparable{
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	//works
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
		//instance variables
		StringBuilder stringBuilder = new StringBuilder(string);
		String subString = "";
		int count = 0;
		String vowels = "a|e|i|o|u";
		
		//Looping through word given by parameter
		for (int i = 0; i < string.length(); i++) {
			//If the first letter of the word is a vowel then 
			//add ay to the end
			if (i == 0) {
				if ((string.charAt(i) + "").matches(vowels)) {
					// add ay to end and do not check any other letters
					//in the word
					stringBuilder.append("ay");
					break;
				}

			} else {
				//If the first letter of the word is not a vowel then keep checking
				//For a vowel
				if ((string.charAt(i) + "").matches(vowels)) {
					count++;
					//Do not check for another vowel after one has already been found
					if (count > 1) {
						break;
					}
					//A word fragment is created
					//If two vowels are beside each other then delete and add to the end
					//of the word
					if ((string.charAt(i + 1) + "").matches(vowels)) {
						subString = string.substring(0, string.indexOf(string.charAt(i + 1)));
						stringBuilder.delete(0, string.indexOf(string.charAt(i + 1)));
						stringBuilder.append(subString);
						stringBuilder.append("ay");
					//A word fragment is created
					//Delete and add the fragment to the end of the word
					} else {
						subString = string.substring(0, string.indexOf(string.charAt(i)));
						stringBuilder.delete(0, string.indexOf(string.charAt(i)));
						stringBuilder.append(subString);
						stringBuilder.append("ay");
					}

				}
			}
		}
		//Return the results
		return stringBuilder.toString().trim();
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	//works
		public boolean isArmstrongNumber(int input) {
			// TODO Write an implementation for this method declaration
			//instance variables
			//int count = 0;
			
			String newInput = String.valueOf(input);
			int power = newInput.length();
			int summation = 0;
			//int number;
			
			String [] numbers = newInput.split("");
			for (int i = 0; i < numbers.length; i++) {
				//count++;
				summation = (int) (summation + Math.pow(Integer.parseInt
						(numbers[i]), power));
			}
					
			if (summation == Integer.parseInt(newInput)) {
				return true;
			} else {
				return false;
			}
			
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
		public List<Long> calculatePrimeFactorsOf(long l) {
			// TODO Write an implementation for this method declaration
			//List<Long> possibleFactors = new ArrayList<Long>();
			List<Long> factors = new ArrayList<Long>();
			//long notPrime
			//possibleFactors.add(1L);
			long division = l;
			
			
			for (long i = 2; i <= division; i++) {
				if (division % i == 0) {
					factors.add(i);
					division = division / i;
					i--;
				}
				
			}
			return factors;
		}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	//works
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			// TODO Write an implementation for this method declaration
			//end result char array
			char [] charArray = string.toCharArray();
			int newASCIIValue;
			int oldASCIIValue = 0;
			char newChar;
			//String regex = "\\W(\\.d+)";
			String result = "";
			//iterate through the string
			for (int i = 0; i < charArray.length; i++) {
					
					if ((string.charAt(i)+ "").matches("[^a-zA-Z]")) {
						newASCIIValue = charArray[i];
						newChar = (char)newASCIIValue;
						charArray[i] = newChar;
					} else {
					oldASCIIValue = string.charAt(i);
					newASCIIValue = charArray[i] + key;
					//ascii value of z is 122
					if (oldASCIIValue > 97 && oldASCIIValue < 122) {
						if(newASCIIValue > 122) {
							newASCIIValue = 97 + (newASCIIValue - 122);
						} else {
							
						}
						//ascii value of a is 97
						
						//System.out.println("Old ASCII: " + string.codePoint(i));
						//System.out.println("New ASCII: " + newASCIIValue);
						//System.out.println("New char: " + newChar);
					} else if (oldASCIIValue > 65 && oldASCIIValue < 90) {
						if (newASCIIValue > 90) {
							newASCIIValue = 65 + (newASCIIValue - 90);
						}
					}
						
					newChar = (char)newASCIIValue;
					//string.charAt(i) = newChar;
					charArray[i] = newChar;
					}
			}
			//return string
			result = Arrays.toString(charArray);
			//result.replaceAll(regex, replacement);
			
			return result;
		}
	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
		//a prime number is something that is only divisible by itself and 1
		int numberChecked = 2;
		int primes = 0;
		int count = 2;
		//i = 1
		while (primes <= i) {
			//if number is even, it is not prime except for 2
			//if an even number is found, skip and keep checking
				if (numberChecked == count) {
					primes++;
				}
				if (numberChecked % count == 0) {
					numberChecked++;
					count++;	
				}
		}
		
		return primes;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			int key = 0;
			int count = -1;
			int newASCIIValue = 0;
			int oldASCIIValue = 0;
			String newString = string.toLowerCase().replaceAll("\\W", "");
			String blank = "";
			String otherNewString = "";
			//char [] letters = new char[newString.length()];
			StringBuilder builder = new StringBuilder(blank);
			
			// values for a and z
			// 97 and 122 respectively
			

			//List <Character> letters = new ArrayList<Character>();
			
			
				for (int j = 0; j < newString.length(); j++) {
					oldASCIIValue = newString.charAt(j);
					if (string.length() > 5) {
						count++;
						if (count % 5 == 0) {
							builder.append(" ");
						}
						
						if(oldASCIIValue - 97 < 122 - oldASCIIValue) {
								key = oldASCIIValue - 97;
								newASCIIValue = 122 - key;
								if(newASCIIValue < 97) {
									newASCIIValue = 122 - (122 -  oldASCIIValue);
								}
							
						} else {
							key = 122 - oldASCIIValue;	
							newASCIIValue = 97 + key;
							if(newASCIIValue > 122) {
								newASCIIValue = 97 + (newASCIIValue - 122);
							}
							
						}
						if ((newString.charAt(j)+"").matches("[^a-zA-Z]")) {
							newASCIIValue = oldASCIIValue;
						}
						builder.append((char) newASCIIValue);
					} else {
						if(oldASCIIValue - 97 < 122 - oldASCIIValue) {
							key = oldASCIIValue - 97;
							newASCIIValue = 122 - key;
							if(newASCIIValue < 97) {
								newASCIIValue = 122 - (122 -  oldASCIIValue);
							}
						} else {
							key = 122 - oldASCIIValue;	
							newASCIIValue = 97 + key;
							if(newASCIIValue > 122) {
								newASCIIValue = 97 + (newASCIIValue - 122);
							}
						}
						builder.append((char) newASCIIValue);
					}
				
					otherNewString = builder.toString();
				}
			return otherNewString;
			
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			int key = 0;
			int newASCIIValue = 0;
			int oldASCIIValue = 0;
			String newString = string.toLowerCase().replaceAll("\\W", "");
			String blank = "";
			String otherNewString = "";
			//char [] letters = new char[newString.length()];
			StringBuilder builder = new StringBuilder(blank);
			
			// values for a and z
			// 97 and 122 respectively
			

			//List <Character> letters = new ArrayList<Character>();
			
			
				for (int j = 0; j < newString.length(); j++) {
					oldASCIIValue = newString.charAt(j);
						
						if(oldASCIIValue - 97 < 122 - oldASCIIValue) {
								key = oldASCIIValue - 97;
								newASCIIValue = 122 - key;
								if(newASCIIValue < 97) {
									newASCIIValue = 122 - (122 -  oldASCIIValue);
								}
							
						} else {
							key = 122 - oldASCIIValue;	
							newASCIIValue = 97 + key;
							if(newASCIIValue > 122) {
								newASCIIValue = 97 + (newASCIIValue - 122);
							}
							
						}
						if ((newString.charAt(j)+"").matches("[^a-zA-Z]")) {
							newASCIIValue = oldASCIIValue;
						}
						builder.append((char) newASCIIValue);
				}
				
			otherNewString = builder.toString();
			return otherNewString;
			
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	//works
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		//ISBN-10 will have 13 characters including dashes

			// instance variables
			int otherMultiple;
			int checkNumber = 0;
			int multiple = 10;
			boolean isbn = true;
			String isbnRegex = "[0-9]";
			// char [] characterArray = string.toCharArray();

			// Getting the total numeric value of the string
			try {
				for (int i = 0; i < string.length(); i++) {
					//All Isbn-10 numbers will have 13 characters including hyphens
					//If not, return false
					if(string.length() != 13){
						
						isbn = false;
						break;
					}
					// Checking if character in string is a digit or a hyphen
					if ((string.charAt(i) + "").matches(isbnRegex) || string.charAt(i) == '-') {
						// If it is not a hyphen perform the get value function on
						// The character at the index
						if (string.charAt(i) != '-') {
							otherMultiple = Character.getNumericValue(string.charAt(i));
							checkNumber = checkNumber + multiple * otherMultiple;
							multiple--;
						} // end of hyphen checking

					} else if (string.charAt(i) == 'X') {
						// X has a value of 10 as defined by the problem statement
						otherMultiple = 10;

						// Getting String's numeric value that will be checked later
						checkNumber = checkNumber + multiple * otherMultiple;
						multiple--;
					} else {
						// if there is any letter other than X found, the
						// string is not an isbn number
						isbn = false;
						break;
					}
				}
				// Checking isbn total found above

				// Since any character other than X automatically means the string is not an
				// isbn-10 number, if any character other than X is detected this if statement
				// will not be checked
				if (isbn == true && checkNumber % 11 == 0) {
					isbn = true;
				} else {
					// If the string's total numeric value isn't divisible by 11, the string
					// is not an isbn number
					isbn = false;
				}
			} catch (NumberFormatException notNumber) {
				notNumber.getStackTrace();
			}
			return isbn;
		
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	//works
	public boolean isPangram(String string) {
		//ascii value of a
		int newASCIIValue = 97;
		Set<Character> letters = new HashSet<Character>();
		char currentLetter, checkChar;
		
		
		//checking list of letters to see if string contains a letter
		for(int i = 0; i < string.length(); i++) {
			//getting character associated with ascii value
			
			//assigning a character to use as i iterate through the loop
			currentLetter = string.charAt(i);
				//adding letter to set which only contains unique values
				//so no two of the same letters will exist
				letters.add(currentLetter);
				//comparing letters in Set to the checkpoint ASCII = 97 or a
				//if letters contains an a, move on to b and so forth until
				//z is reached
		}
		for(int i = 0; i < letters.size(); i++) {
			checkChar = (char)newASCIIValue;
			if(letters.contains(checkChar) && newASCIIValue < 122) {
				newASCIIValue++;
			} if (newASCIIValue > 122) {
				break;
			}
		}
		//ascii value of z
		//if z is ever reached that means all alphabet letters have 
		//been used
		if (newASCIIValue == 122) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		//LocalDate actualMoment = new LocalDate(given);
		LocalDateTime presentMoment = null;
		//actualMoment.isSupported(given);
		//Given the date passed, calculate the date and time when 10^9 seconds has passed
		if (given instanceof LocalDate) {
			presentMoment = LocalDateTime.of((LocalDate) given, 
					LocalTime.of(0, 0, 0));
			presentMoment = presentMoment.plusSeconds(1000000000);
			
		} else if (given instanceof LocalDateTime){
			presentMoment = (LocalDateTime) given;
			presentMoment = presentMoment.plusSeconds(1000000000);
		}
		return presentMoment;
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration
		//int otherMultiple = 1;
		int product = 1;
		Integer sum;
		int nextProduct;
		Set<Integer> products = new HashSet<Integer>();
		//int j = 0;
		for (int j = 0; j < set.length; j++) {
			int multiple = set[j];
			for(int otherMultiple = 1; product < i; otherMultiple++) {
				product = multiple * otherMultiple;
				nextProduct = product + multiple;
				//sum = sum + product;
				products.add(product);
				if(nextProduct >= i) {
					otherMultiple = 1;
					break;
				}
			}
			product = 1;
		}
		sum = products.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		// Strings of length 1 or less or invalid
		// All nondigit numbers are disallowed
		// Whitespace must be stripped

		// instance variables
		String unacceptableValues = "[^0-9]";
		// String isDigit = "[0-9]";
		String newLuhnNumber;
		// String finalLuhnNumber;
		int digit = 0;
		int doubleDigit = 0;
		int sum = 0;
		//int [] numbersToBeAdded;
		//int numbers;

		// char newDigit;
		// StringBuilder stringbuilder = new StringBuilder();
		// stringbuilder.delete(0, string.length());

		// stringbuilder.replace(0, 0, "");
		// Checking String length
		// Strings of length 1 or less or invalid
		if (string.length() <= 1) {
			return false;
		}
		newLuhnNumber = string.replace(" ", "");
		//numbersToBeAdded = new int[newLuhnNumber.length()];
		// All nondigit numbers are disallowed
		// Checking if character in String is a nondigit
		// newLuhnNumber = string.split(" ");
		// finalLuhnNumber = newLuhnNumber.toString();
		for (int i = 0; i < newLuhnNumber.length(); i++) {
			
				if ((string.charAt(i) + "").matches(unacceptableValues)) {
					return false;
				}
		}
		for (int j = newLuhnNumber.length() - 1; j > 0; j--) {
			//numbersToBeAdded[i] = Integer.parseInt(newLuhnNumber);
			digit = Character.getNumericValue(newLuhnNumber.charAt(j));
			// every 2nd character from the right is doubled
			sum = sum + digit;
			j--;
			doubleDigit = Character.getNumericValue(newLuhnNumber.charAt(j)) * 2;
			if (doubleDigit > 9) {
				doubleDigit = doubleDigit - 9;
				sum = sum + doubleDigit;
			} else {
				sum = sum + doubleDigit;
			}
		}
		if (sum % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		//instance variables
				String subtract = "minus";
				String multiply = "multiplied";
				String divide = "divided";
				String add = "plus";
				String noQuestionMark = string.replaceAll("[?$]", "");
				String [] noSpaces = noQuestionMark.split("\\s");
				String [] onlyDigits = new String[noSpaces.length];
				
				
				int result = 0;
				
				
					for(int i = 0; i < noSpaces.length; i++) {
						if (noSpaces[i].matches("-?[0-9]+")) {
							onlyDigits[i] = noSpaces[i];
						}
						
					}
					for(int cycleAgain = 0; cycleAgain < noSpaces.length; cycleAgain++) {
						
						if (noSpaces[cycleAgain].equalsIgnoreCase(subtract)) {
								try {
									int firstNumberSubtracted = Integer.parseInt(onlyDigits[2]);
									int	secondNumberSubtracted = Integer.parseInt(onlyDigits[4]);
									
									result = firstNumberSubtracted
											- secondNumberSubtracted;
								} catch (NumberFormatException e) {
								
								}
							
							
						} else if(noSpaces[cycleAgain].equalsIgnoreCase(add)) {
								try {
									int firstnumberAdded = Integer.parseInt(onlyDigits[2]);
									int secondNumberAdded = Integer.parseInt(onlyDigits[4]);
									result = firstnumberAdded + secondNumberAdded;
								} catch (NumberFormatException e) {
									
								}
							
						} else if (noSpaces[cycleAgain].equalsIgnoreCase(divide)) {
								try {
									
									int dividend = Integer.parseInt(onlyDigits[2]);
									int divisor = Integer.parseInt(onlyDigits[5]);
									result = dividend / divisor;
								} catch (NumberFormatException e) {
								
								}
							
						} else if (noSpaces[cycleAgain].equals(multiply)) {
								try {
									int firstMultiple = Integer.parseInt(onlyDigits[2]);
									
										int secondMultiple = Integer.parseInt(onlyDigits[5]);
									result = firstMultiple * secondMultiple;
								} catch (NumberFormatException e) {
								
								}
						}
						//temp = Character.getNumericValue(string.charAt(i));
					}
				return result;
				}

}
