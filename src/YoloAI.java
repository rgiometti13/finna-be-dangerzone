import core.*;
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
	
	public Word makeMove() {
		// TODO Auto-generated method stub
		return null;
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
	ArrayList<Letter> availableLetters = playerLetters;
	
	ArrayList<Word> wordsPossible = new ArrayList<Word>();
	return wordsPossible; 
	}
	
	//wins the game
	public void winGame(){
		for(int x=0;x<15;x++){
			for(int y=0;y<15;y++){
				
			}
		}
		
		
		
	}
	//finds all words off of a given letter on the board
	public Word[] findWords(Letter a){
		Dictionary d=new Dictionary();
		for(int i=2;i<)
	}
}
