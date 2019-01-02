import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGame extends JFrame implements ActionListener {
   
   private JPanel pn;
   private JTextField information;
   private JTextField output;
   private JButton exit;
   private JButton answer;
  
   
   
   public NumberGame() {
	  setTitle("���� ���� ����");
      setSize(400,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pn = new JPanel();
      pn.setLayout(new GridLayout(0,2));
      
      information = new JTextField("������ �����Ͽ� �Է��Ͻÿ�!");
      output = new JTextField(10);
      
      Font f=new Font("Serif", Font.BOLD, 20);

      information.setFont(f);
      Font fon=new Font("Serif", Font.BOLD, 50);
      output.setFont(fon);
      
      answer = new JButton("Ȯ��");
      answer.addActionListener(this);
      
      exit = new JButton("����");
      exit.addActionListener(this);
      
      pn.add(answer);
      pn.add(exit);
      
      add(information, BorderLayout.NORTH);
      add(output, BorderLayout.CENTER);
   
      add(pn, BorderLayout.SOUTH);
      
      Toolkit kit=Toolkit.getDefaultToolkit();	//���� ����
      Dimension screenSize=kit.getScreenSize();	//ȭ�� ũ�� ���� ��ü
		
      setLocation((screenSize.width-400)/2, (screenSize.height-300)/2);	//��ġ

      setVisible(true);
            
   }
   
   public static void main(String[] args) {
      NumberGame numG = new NumberGame();

      
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
        int x = Integer.parseInt(output.getText());
        int computer = 33 ;
        
         if(e.getSource() != null ) {
            
        	 if(e.getSource()==exit) {
            	 dispose();
             }
        	 else if(x>computer) {
                
                JOptionPane.showMessageDialog(null, "�Է°��� �ʹ� Ů�ϴ�");
                
             }else if(x<computer) {
                
                JOptionPane.showMessageDialog(null, "�Է°��� �ʹ� �۽��ϴ�");
             }
             else if(x==computer){
                JOptionPane.showMessageDialog(null, "�����Դϴ�!");
             }
             
         }
             
   
         
         
   
      
         
      }
   
}
      

   