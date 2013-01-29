import core.*;
import core.Dictionary;

import java.util.*;

public class YoloAI extends Player {
	public Board board;
	
	
	public YoloAI(LetterBag ls) {
		super(ls);
		// TODO Auto-generated constructor stub
	}

	
	
	public void readBoard(Board b){
		board=b;
	}
	
	public Word makeMove(Board b){
		Board board = b; 
		Word word = new Word("Default");
		return word; 
	}
	
	public int scoreWord(Word w){
		int score = 0; 
		
		return score; 
	}
	
	public Word wordOptimizer(ArrayList<Word> wa){
	Word bestWord; 		
	bestWord = new Word("Nothing");
	for (int i = 0; i< wa.size(); i++){
		if (i == 0) bestWord = wa.get(i);
		else {
			if (wa.get(i).getVal()>bestWord.getVal()) bestWord = wa.get(i);
		}	
	}
	return bestWord; 
	}
	
	//Returns an ArrayList of Words that contain an argument ArrayList of letters
	public ArrayList<Word> compileWords(ArrayList<Letter> playerLetters){
	Dictionary d = new Dictionary(); 
	ArrayList<Letter> availableLetters = playerLetters;
	ArrayList<Character> availableCharacters = new ArrayList<Character>();
	for (int i = 0; i < availableLetters.size(); i++){
	availableCharacters.add(i, availableLetters.get(i).getCharacter());
	}
	ArrayList<String> stringWords = d.allStringsWithLetters(availableCharacters);	
	for (int i = 0; i<stringWords.size(); i++){
		boolean remove = true;
		for (int x = 0; x<stringWords.get(i).length(); x++){ 
		remove = true; 
			for (int l = 0; l < availableCharacters.size(); l++){
				if ((stringWords.get(i).charAt(x)==(availableCharacters.get(l))))
				{
					remove = false;
					availableCharacters.remove(l);
					
				}
				if(remove==true){
					x=stringWords.get(i).length()+1;
				}
			}
		}
		if (remove == true) stringWords.remove(i);
	}
	
	ArrayList<Word> wordsPossible = new ArrayList<Word>();
	for (int i = 0; i < stringWords.size(); i++){
		wordsPossible.set(i, new Word(stringWords.get(i)));
	}
	return wordsPossible; 
	}
	
	//wins the game
	public void winGame()
	{
		for(int x=0;x<15;x++){
			for(int y=0;y<15;y++){
				
			}
		}
		

		
	}
	//finds all words off of a given letter on the board
	public ArrayList<Word> findWords(Letter a,ArrayList<Letter> g){
		Dictionary d=new Dictionary();
		ArrayList<Letter> letters=g;
		ArrayList<String> hand=new ArrayList();
		ArrayList<Word> words=new ArrayList();
		for(int i=0;i<letters.size();i++){
			Character q=letters.get(i).getCharacter();
			hand.add(q.toString());
		}
		Character c=a.getCharacter();
		String s=c.toString();
		for(int i=0;i<letters.size();i++)
			{
			s=s+hand.get(i);
			words.add(new Word(s));
			letters.remove(i);
			findWords(a,letters);
		
			}
		return words;
		}	

	//returns a random String to intimidate opponents
	public String trashTalk(){
		String trash; 
		Random r = new Random();
		int rvalue = r.nextInt(10);
		
		if (rvalue == 0){
			trash = "WE RIDE!!!";	
		}
		
		else if (rvalue == 1){
			trash = "FEEL MY WRATH!!!";
		}
		
		else if (rvalue == 2){
			trash = "DEATH TO THE HEATHEN!!!";
		}
		
		else if (rvalue == 3){
			trash = "IMA FIRIN' MAH LAZER!!!";
		}
		
		else if (rvalue == 4){
			trash = "VAE VICTUS, B*TCH!!!";
		}
		
		else if (rvalue == 5){
			trash = "INFIDEL!!!";
		}
		
		else if (rvalue == 6){
			trash = "YOUR HERALDRY WILL ADORN MY GALLOWS!!!";
		}
		
		else if (rvalue == 7){
			trash = "SEND THEM BACK TO THE DIGITAL SEA!!!";
		}
		
		else if (rvalue == 8){
			trash = "TIME 2 DIE, PUNY HUMAN!!!";
		}
		
		else trash = "FOR BUDDHA!!!";
		
		return trash; 
	}

	
public static void main(String[] Args){
	LetterBag q=new LetterBag();
	YoloAI yolo=new YoloAI(q);
	ArrayList<Letter> letters=yolo.getLetters();
	for(int i=0;i<letters.size();i++){
		System.out.println(letters.get(i).toString());
	}
	System.out.println();
	ArrayList<Word> words=yolo.compileWords(yolo.letters);
	for(int a=0;a<words.size();a++){
		System.out.println(words.get(a).toString());
	}
}

}
