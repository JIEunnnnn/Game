import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockPaperScissor extends JFrame implements ActionListener {
static final int ROCK =0;
static final int PAPER =1;
static final int SCISSOR =2;

private JPanel panel;
private JPanel panel2;
private JTextField output;
private JTextField information;
private JButton rock;
private JButton paper;
private JButton scissor;
private JButton exit;

int frameWidth;		//프레임 폭
int frameHeight;	//프레임 높이

public void setFrameSize(int frameWidth, int frameHeight) {
	this.frameWidth=frameWidth;
	this.frameHeight=frameHeight;
}

public RockPaperScissor() {
	setTitle("가위, 바위,보");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	panel = new JPanel();
	panel.setLayout(new GridLayout(0,3));
	panel2 = new JPanel();
	panel2.setLayout(new GridLayout(0,2));
    
	information = new JTextField("아래의 버튼 중에서 하나를 클릭하시오!");
	output = new JTextField(20);
	
	
	rock = new JButton("ROCK");
	paper = new JButton("PAPER");
	scissor = new JButton("SCISSOR");
	exit = new JButton("종료");
	
	rock.addActionListener(this);
	paper.addActionListener(this);
	scissor.addActionListener(this);
	exit.addActionListener(this);
	
	panel.add(rock);
	panel.add(paper);
	panel.add(scissor);
	
	panel2.add(output);
	panel2.add(exit);
	
	add(information, BorderLayout.NORTH);
	add(panel, BorderLayout.CENTER);
	
	add(panel2, BorderLayout.SOUTH);
	
	Toolkit kit=Toolkit.getDefaultToolkit();	//도구 모음
	Dimension screenSize=kit.getScreenSize();	//화면 크기 추출 객체
	
	setFrameSize(400, 300);
	
	setSize(frameWidth, frameHeight);
	setLocation((screenSize.width-frameWidth)/2, (screenSize.height-frameHeight)/2);	//위치
	
	setVisible(true);
}

public static void main(String[] args) {
	RockPaperScissor gui = new RockPaperScissor();
	
}

@Override
public void actionPerformed(ActionEvent e) { 
	
	if(e.getSource()== exit) {
		dispose();
	}
	// TODO Auto-generated method stub
	Random random = new Random();
	int computer = random.nextInt(3);
	if(e.getSource()== rock) {
		if(computer == SCISSOR) {
			output.setText("사용자 승리");
			
		}
		else if(computer ==ROCK) {
			output.setText("비겼음");
			 
		}
		else {
			output.setText("컴퓨터 승리");
			
		}
	}
	else if(e.getSource()== paper) {
		if(computer == ROCK)
			output.setText("사용자 승리");
		else if(computer ==PAPER)
			output.setText("비겼음");
		else
			output.setText("컴퓨터 승리");
	}
	else if(e.getSource()== scissor ) {
		if(computer == PAPER)
			output.setText("사용자 승리");
		else if(computer ==SCISSOR)
			output.setText("비겼음");
		else
			output.setText("컴퓨터 승리");
	}
	
	

	
}
	

}
