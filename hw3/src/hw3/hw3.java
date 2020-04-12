package hw3;


import java.lang.StringBuilder;
import java.util.*;



public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SentenceProcessor sp = new SentenceProcessor();

		System.out.println(sp.removeDuplicatedWords("Hello hello World I love love the World I lovelove the World"));
		System.out.println(sp.removeDuplicatedWords("Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo"));
		System.out.println(sp.removeDuplicatedWords("a a la a la carte A la La carte Carte A a la la"));
		System.out.println(sp.replaceWord("major", "minor", "The major problem is how to sing in A major"));
		System.out.println(sp.replaceWord("on", "off", "Turn on the television I want to keep the television on"));
		System.out.println(sp.replaceWord("love", "hate", "I love the World I love love the Love"));
		
	}

}
