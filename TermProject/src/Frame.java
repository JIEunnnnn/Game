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
		
		//---------------������� �̸� �Է� â----------------//
		
		nameButton.addActionListener(e->{	//nameButton Ŭ�� �� namePanel �񰡽�
			namePanel.setVisible(false);
			this.setFrameSize(800, 500);
			});
		
		//---------------������� �� �̺�Ʈ ����---------------//
		
		namePanel.add(nameLabel);
		namePanel.add(nameField);
		namePanel.add(nameButton);
		
		//---------------������� ��� �߰� ����---------------//
		
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
		
		Frame testFrame=new Frame();

	}

}
