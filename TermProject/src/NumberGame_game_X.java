import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class NumberGame_game_X extends JFrame implements ActionListener {
	

	private JTextField information;
	private JTextField output;
	private JButton exit;

	
	
	public NumberGame_game_X() {
		setTitle("숫자 추측 게임");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		information = new JTextField("정답을 추측하여 입력하시오!");
		output = new JTextField(10);
		
		Font f=new Font("Serif", Font.BOLD, 20);

		information.setFont(f);
		Font fon=new Font("Serif", Font.BOLD, 50);
		output.setFont(fon);
		
		exit = new JButton("종료");
		exit.addActionListener(this);
		
		add(information, BorderLayout.NORTH);
		add(output, BorderLayout.CENTER);
		
		add(exit, BorderLayout.SOUTH);
		
		Toolkit kit=Toolkit.getDefaultToolkit();	//도구 모음
		Dimension screenSize=kit.getScreenSize();	//화면 크기 추출 객체
		
		setLocation((screenSize.width-400)/2, (screenSize.height-300)/2);	//위치
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		NumberGame_game_X numG = new NumberGame_game_X();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
