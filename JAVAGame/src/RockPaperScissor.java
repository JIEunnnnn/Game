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

int frameWidth;		//������ ��
int frameHeight;	//������ ����

public void setFrameSize(int frameWidth, int frameHeight) {
	this.frameWidth=frameWidth;
	this.frameHeight=frameHeight;
}

public RockPaperScissor() {
	setTitle("����, ����,��");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	panel = new JPanel();
	panel.setLayout(new GridLayout(0,3));
	panel2 = new JPanel();
	panel2.setLayout(new GridLayout(0,2));
    
	information = new JTextField("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�!");
	output = new JTextField(20);
	
	
	rock = new JButton("ROCK");
	paper = new JButton("PAPER");
	scissor = new JButton("SCISSOR");
	exit = new JButton("����");
	
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
	
	Toolkit kit=Toolkit.getDefaultToolkit();	//���� ����
	Dimension screenSize=kit.getScreenSize();	//ȭ�� ũ�� ���� ��ü
	
	setFrameSize(400, 300);
	
	setSize(frameWidth, frameHeight);
	setLocation((screenSize.width-frameWidth)/2, (screenSize.height-frameHeight)/2);	//��ġ
	
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
			output.setText("����� �¸�");
			
		}
		else if(computer ==ROCK) {
			output.setText("�����");
			 
		}
		else {
			output.setText("��ǻ�� �¸�");
			
		}
	}
	else if(e.getSource()== paper) {
		if(computer == ROCK)
			output.setText("����� �¸�");
		else if(computer ==PAPER)
			output.setText("�����");
		else
			output.setText("��ǻ�� �¸�");
	}
	else if(e.getSource()== scissor ) {
		if(computer == PAPER)
			output.setText("����� �¸�");
		else if(computer ==SCISSOR)
			output.setText("�����");
		else
			output.setText("��ǻ�� �¸�");
	}
	
	

	
}
	

}
