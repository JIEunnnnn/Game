import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame {
	
	int frameWidth;		//프레임 폭
	int frameHeight;	//프레임 높이
	
	public void setFrameSize(int frameWidth, int frameHeight) {
		this.frameWidth=frameWidth;
		this.frameHeight=frameHeight;
	}
	public Frame() {
		JPanel namePanel=new JPanel();
		add(namePanel);
		
		
		JLabel nameLabel=new JLabel("이름");
		JTextField nameField=new JTextField(15);
		JButton nameButton=new JButton("완료");
		
		//---------------여기까지 이름 입력 창----------------//
		
		nameButton.addActionListener(e->{	//nameButton 클릭 시 namePanel 비가시
			namePanel.setVisible(false);
			this.setFrameSize(800, 500);
			});
		
		//---------------여기까지 총 이벤트 구역---------------//
		
		namePanel.add(nameLabel);
		namePanel.add(nameField);
		namePanel.add(nameButton);
		
		//---------------여기까지 요소 추가 구역---------------//
		
		Toolkit kit=Toolkit.getDefaultToolkit();	//도구 모음
		Dimension screenSize=kit.getScreenSize();	//화면 크기 추출 객체
		
		setFrameSize(350, 125);
		
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
		
		Frame testFrame=new Frame();

	}

}
