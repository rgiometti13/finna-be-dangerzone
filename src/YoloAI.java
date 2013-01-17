import core.LetterBag;
import core.Player;
import core.Word;
import core.Board;
import core.Letter;
import core.Dictionary;
import core.Space;
import core.TestDriver;

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
