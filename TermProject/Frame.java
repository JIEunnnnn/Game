import java.awt.BorderLayout;
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

public class Frame extends JFrame implements ActionListener {
	
	private static final String nameField = null;
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
	    
		
		//플레이어 클래스의 네임에 저장하고 메인프레임창 키는 것 ㅇㅋㅇㅋ... 어렵당... 

		namePanel.add(nameLabel);
		namePanel.add(nameField);
		namePanel.add(nameButton);
		
        nameButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(e.getSource()== nameButton) {
        			
        			add(nameLabel, BorderLayout.CENTER);
        			nameLabel.setText("캐릭터 이름이 입력되었습니다. ");
        			nameField.setVisible(false);

        			nameButton.setVisible(false);
        			
        		
        		}
        		
        	}
        	
        	
        	
        });
     
		
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
		 
		Player player = new Player();
		Frame testFrame=new Frame();
		player.name =testFrame.nameField;
          
	}

}
