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
	
	public ArrayList<Word> compileWords(ArrayList<Letter> playerLetters){
	Dictionary d = new Dictionary(); 
	ArrayList<Letter> availableLetters = playerLetters;
	for (int i = 0; i<availableLetters.size(); i++){
		Letter firstChar = availableLetters.get(i);
		availableLetters.remove(i);
		for(int x = 0; x <availableLetters.size(); x++){
			
		}
			
	}
	
	
	ArrayList<Word> wordsPossible = new ArrayList<Word>();
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
}
