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
	
	int frameWidth;		//프레임 폭
	int frameHeight;	//프레임 높이
	
	public void setFrameSize(int frameWidth, int frameHeight) {
		this.frameWidth=frameWidth;
		this.frameHeight=frameHeight;
	}
	
	public OutFrame(Player player) {
		
		JPanel OutPanel=new JPanel(new GridLayout(0, 1, 0, 25));
		
		JLabel spaceLabel1=new JLabel(" ");
		JLabel playerNameLabel=new JLabel(player.name+"은(는) ");
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
		
		//---------------여기까지 아웃풋 설정-----------------//
		
		add(OutPanel);
		OutPanel.add(spaceLabel1);
		OutPanel.add(playerNameLabel);
		OutPanel.add(playerTitleLabel1);
		OutPanel.add(playerTitleLabel2);
		OutPanel.add(playerTitleLabel3);
		OutPanel.add(spaceLabel2);
		
		//---------------여기까지 아웃풋 설정-----------------//

		Toolkit kit=Toolkit.getDefaultToolkit();	//도구 모음
		Dimension screenSize=kit.getScreenSize();	//화면 크기 추출 객체
		
		setFrameSize(600, 400);
		
		setSize(frameWidth, frameHeight);
		setLocation((screenSize.width-frameWidth)/2, (screenSize.height-frameHeight)/2);	//위치
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("일식이");
		setVisible(true);
		
		setLayout(new FlowLayout());	//배치 관리자 설정
		
		//---------------여기까지 프레임 설정-----------------//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Player player=new Player();
		//OutFrame outFrame=new OutFrame(player);

	}

}
