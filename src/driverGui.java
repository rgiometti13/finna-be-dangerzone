import java.awt.EventQueue;
import java.awt.*;
import core.Board;
import core.LetterBag;
import core.ScrabbleGUI;
import core.Word;
import java.util.*;
public class driverGui {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrabbleGUI window = new ScrabbleGUI();
					window.getFrame().setVisible(true);
					window.getFrame().setTitle("Scarble");
					cont(window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	
	private static void cont(ScrabbleGUI w) {
		Scanner g=new Scanner(System.in);
		Board b = new Board();
		
		YoloAI s = new YoloAI(new LetterBag());
		Word word1 = s.makeMove(b);
		b.addWord(word1);
		w.showBoard(b);
		//if(g.nextLine()=="a"){
		Word word2 = s.makeMove(b);
		b.addWord(word2);
		w.showBoard(b);
		//}
	}
	
}
