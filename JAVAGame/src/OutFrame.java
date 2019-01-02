import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class OutFrame extends JFrame {
	
	int frameWidth;		//������ ��
	int frameHeight;	//������ ����
	
	public void setFrameSize(int frameWidth, int frameHeight) {
		this.frameWidth=frameWidth;
		this.frameHeight=frameHeight;
	}
	
	public OutFrame(Player player) {
		
		JPanel OutPanel=new JPanel(new GridLayout(0, 1, 0, 25));
		
		JLabel spaceLabel1=new JLabel(" ");
		JLabel playerNameLabel=new JLabel(player.name+"��(��) ");
		JLabel playerTitleLabel1=new JLabel(player.title[0]);
		JLabel playerTitleLabel2=new JLabel(player.title[1]);
		JLabel playerTitleLabel3=new JLabel(player.title[2]);
		JLabel spaceLabel2=new JLabel(" ");
		
		Font f=new Font("Serif", Font.BOLD, 24);
		//spaceLabel1.setFont(f);
		playerNameLabel.setFont(f);
		playerTitleLabel1.setFont(f);
		playerTitleLabel2.setFont(f);
		playerTitleLabel3.setFont(f);
		//spaceLabel2.setFont(f);
		
		playerNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabel.setVerticalAlignment(SwingConstants.CENTER);
		playerTitleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		playerTitleLabel1.setVerticalAlignment(SwingConstants.CENTER);
		playerTitleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		playerTitleLabel2.setVerticalAlignment(SwingConstants.CENTER);
		playerTitleLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		playerTitleLabel3.setVerticalAlignment(SwingConstants.CENTER);
		
		//---------------������� �ƿ�ǲ ����-----------------//
		
		add(OutPanel);
		OutPanel.add(spaceLabel1);
		OutPanel.add(playerNameLabel);
		OutPanel.add(playerTitleLabel1);
		OutPanel.add(playerTitleLabel2);
		OutPanel.add(playerTitleLabel3);
		OutPanel.add(spaceLabel2);
		
		//---------------������� �ƿ�ǲ ����-----------------//

		Toolkit kit=Toolkit.getDefaultToolkit();	//���� ����
		Dimension screenSize=kit.getScreenSize();	//ȭ�� ũ�� ���� ��ü
		
		setFrameSize(600, 400);
		
		setSize(frameWidth, frameHeight);
		setLocation((screenSize.width-frameWidth)/2, (screenSize.height-frameHeight)/2);	//��ġ
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("�Ͻ���");
		setVisible(true);
		
		setLayout(new FlowLayout());	//��ġ ������ ����
		
		//---------------������� ������ ����-----------------//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Player player=new Player();
		//OutFrame outFrame=new OutFrame(player);

	}

}
