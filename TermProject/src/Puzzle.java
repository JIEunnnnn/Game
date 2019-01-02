import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class PuzzleButton extends JButton{
	static int count=0;
	int index;
	public PuzzleButton(String s) {
		super(s);
		index=count++;
	}
}

public class Puzzle extends JFrame implements ActionListener {
	
	int frameWidth;		//프레임 폭
	int frameHeight;	//프레임 높이
	
	PuzzleButton[] buttons;
	PuzzleButton exit;
	
	public Puzzle() {
		super("puzzle");
		JPanel puzzlePanel=new JPanel();
		puzzlePanel.setLayout(new GridLayout(0, 3, 2, 2));
		buttons=new PuzzleButton[9];
		for(int i=0; i<8; i++)
			buttons[i]=new PuzzleButton(""+(i+1));
		buttons[8]=new PuzzleButton(" ");
		for(int i=0; i<9; i++)
			puzzlePanel.add(buttons[i]);
		for(int i=0; i<9; i++) {
			buttons[i].addActionListener(this);
		add(puzzlePanel, BorderLayout.CENTER);
		exit=new PuzzleButton("exit");
		exit.setBackground(Color.red);
		exit.setForeground(Color.yellow);
		add(exit,BorderLayout.SOUTH);
		exit.addActionListener(this);
		
		//-------------------------------------//
		/*
		exit=new JButton("exit");
		add(exit, BorderLayout.SOUTH);
		exit.setBackground(Color.red);
		exit.setForeground(Color.yellow);
		*/
		//-------------------------------------//
		
		Toolkit kit=Toolkit.getDefaultToolkit();	//도구 모음
		Dimension screenSize=kit.getScreenSize();	//화면 크기 추출 객체
		
		setFrameSize(300, 300);
		
		setSize(frameWidth, frameHeight);
		setLocation((screenSize.width-frameWidth)/2, (screenSize.height-frameHeight)/2);	//위치
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	
	public void setFrameSize(int frameWidth, int frameHeight) {
		this.frameWidth=frameWidth;
		this.frameHeight=frameHeight;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		PuzzleButton b=(PuzzleButton)e.getSource();
		if(b.getText().equals("exit")==true) dispose();
		if(b.getText().equals(" ")==true) return;
		if(b.index==0) {
			if(buttons[1].getText().equals(" ")) {
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[3].getText().equals(" ")) {
				buttons[3].setText(b.getText());
				b.setText(" ");
			}
		}
		if(b.index==1) {
			if(buttons[0].getText().equals(" ")) {
				buttons[0].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[2].getText().equals(" ")) {
				buttons[2].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[4].getText().equals(" ")) {
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
		}
		if(b.index==2) {
			if(buttons[1].getText().equals(" ")) {
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[5].getText().equals(" ")) {
				buttons[5].setText(b.getText());
				b.setText(" ");
			}
		}
		if(b.index==3) {
			if(buttons[0].getText().equals(" ")) {
				buttons[0].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[4].getText().equals(" ")) {
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[6].getText().equals(" ")) {
				buttons[6].setText(b.getText());
				b.setText(" ");
			}
		}
		if(b.index==4) {
			if(buttons[1].getText().equals(" ")) {
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[3].getText().equals(" ")) {
				buttons[3].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[5].getText().equals(" ")) {
				buttons[5].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[7].getText().equals(" ")) {
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
		}
		if(b.index==5) {
			if(buttons[2].getText().equals(" ")) {
				buttons[2].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[4].getText().equals(" ")) {
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[8].getText().equals(" ")) {
				buttons[8].setText(b.getText());
				b.setText(" ");
			}
		}
		if(b.index==6) {
			if(buttons[3].getText().equals(" ")) {
				buttons[3].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[7].getText().equals(" ")) {
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
		}
		if(b.index==7) {
			if(buttons[4].getText().equals(" ")) {
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[6].getText().equals(" ")) {
				buttons[6].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[8].getText().equals(" ")) {
				buttons[8].setText(b.getText());
				b.setText(" ");
			}
		}
		if(b.index==8) {
			if(buttons[5].getText().equals(" ")) {
				buttons[5].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[7].getText().equals(" ")) {
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
		}
	}
	
	public static void main(String[] args) {
		new Puzzle();
	}

}
