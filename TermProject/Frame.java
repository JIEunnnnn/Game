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
	int frameWidth;		//������ ��
	int frameHeight;	//������ ����
	
	public void setFrameSize(int frameWidth, int frameHeight) {
		this.frameWidth=frameWidth;
		this.frameHeight=frameHeight;
	}
	public Frame() {
		JPanel namePanel=new JPanel();
		add(namePanel);
		
		
		JLabel nameLabel=new JLabel("�̸�");
		JTextField nameField=new JTextField(15);
		JButton nameButton=new JButton("�Ϸ�");
	    
		
		//�÷��̾� Ŭ������ ���ӿ� �����ϰ� ����������â Ű�� �� ��������... ��ƴ�... 

		namePanel.add(nameLabel);
		namePanel.add(nameField);
		namePanel.add(nameButton);
		
        nameButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(e.getSource()== nameButton) {
        			
        			add(nameLabel, BorderLayout.CENTER);
        			nameLabel.setText("ĳ���� �̸��� �ԷµǾ����ϴ�. ");
        			nameField.setVisible(false);

        			nameButton.setVisible(false);
        			
        		
        		}
        		
        	}
        	
        	
        	
        });
     
		
		Toolkit kit=Toolkit.getDefaultToolkit();	//���� ����
		Dimension screenSize=kit.getScreenSize();	//ȭ�� ũ�� ���� ��ü
		
		setFrameSize(350, 125);
		
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
		 
		Player player = new Player();
		Frame testFrame=new Frame();
		player.name =testFrame.nameField;
          
	}

}
