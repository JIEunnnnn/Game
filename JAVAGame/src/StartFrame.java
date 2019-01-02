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

public class StartFrame extends JFrame {
	
	int frameWidth;		//������ ��
	int frameHeight;	//������ ����
	boolean ing=true;	//�ش� ������ �����
	
	public void setFrameSize(int frameWidth, int frameHeight) {
		this.frameWidth=frameWidth;
		this.frameHeight=frameHeight;
	}
	public StartFrame(Player player) {
		JPanel namePanel=new JPanel();
		add(namePanel);
		
		
		JLabel nameLabel=new JLabel("�̸�");
		JTextField nameField=new JTextField(15);
		JButton nameButton=new JButton("�Ϸ�");
		
		//---------------������� �̸� �Է� â----------------//
		
		nameButton.addActionListener(new StartListener());
		
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
	
	private class StartListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			player.name=getText(nameText);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Player player=new Player();
		//StartFrame startFrame=new StartFrame(player);

	}

}
