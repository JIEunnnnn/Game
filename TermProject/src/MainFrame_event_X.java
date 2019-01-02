import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainFrame_event_X extends JFrame {
	
	int frameWidth;		//프레임 폭
	int frameHeight;	//프레임 높이
	int day=30;
	
	BufferedImage image;	//사람 이미지
	int width;
	int height;
	
	//텍스트필드(좌)
	private JTextField fatText;
	private JTextField muscleText;
	private JTextField satietyText;
	private JTextField fatigueText;
	private JTextField pleasureText;
	private JTextField dayText;
	
	//버튼(우)
	private JButton healthPTButton;
	private JButton sportsButton;
	private JButton militaryArtsButton;
	private JButton physicsButton;
	private JButton foodNutritionButton;
	private JButton healthCareButton;
	private JButton eatingButton;
	private JButton yoloButton;
	private JButton doingNothingButton;
	
	private JPanel rightPanel;
	
	public void setFrameSize(int frameWidth, int frameHeight) {
		this.frameWidth=frameWidth;
		this.frameHeight=frameHeight;
	}
	
	public void dayDown() {
		day--;
	}
	public MainFrame_event_X(Status status/*, Player player*/) {
		setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel leftPanel=new JPanel();
		
		JPanel statusPanel=new JPanel();
		statusPanel.setLayout(new GridLayout(0, 2, 10, 15));
		
//		JLabel playerNameLabel=new JLabel("PLAYER NAME	 | "+player.name);
		JLabel fatLabel=new JLabel("FAT");
		JLabel muscleLabel=new JLabel("MUSCLE");
		JLabel satietyLabel=new JLabel("SATIETY");
		JLabel fatigueLabel=new JLabel("FATIGUE");
		JLabel pleasureLabel=new JLabel("PLEASURE");
		JLabel dayLabel=new JLabel("D-DAY");
		
		fatText=new JTextField(3);
		muscleText=new JTextField(3);
		satietyText=new JTextField(3);
		fatigueText=new JTextField(3);
		pleasureText=new JTextField(3);
		dayText=new JTextField(3);
		
		fatText.setText(status.iFat+"");
		muscleText.setText(status.iMuscle+"");
		satietyText.setText(status.iSatiety+"");
		fatigueText.setText(status.iFatigue+"");
		pleasureText.setText(status.iPleasure+"");
		dayText.setText(day+"");
		
		fatText.setEditable(false);
		muscleText.setEditable(false);
		satietyText.setEditable(false);
		fatigueText.setEditable(false);
		pleasureText.setEditable(false);
		dayText.setEditable(false);
		
		fatLabel.setHorizontalAlignment(SwingConstants.LEFT);
		muscleLabel.setHorizontalAlignment(SwingConstants.LEFT);
		satietyLabel.setHorizontalAlignment(SwingConstants.LEFT);
		fatigueLabel.setHorizontalAlignment(SwingConstants.LEFT);
		pleasureLabel.setHorizontalAlignment(SwingConstants.LEFT);
		dayLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		//---------------- status (좌) -----------------//
		
		JPanel centerPanel=new JPanel();

		JLabel imageLabel = new JLabel(new ImageIcon("people-W.jpg"));
		imageLabel.setHorizontalAlignment(JLabel.CENTER);
		centerPanel.add(imageLabel);
		
		//---------------- 그림 (중간) --------------------//
		
		JPanel rightPanel=new JPanel();
		
		JPanel activityPanel=new JPanel();
		activityPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		JPanel exercisePanel=new JPanel();
		exercisePanel.setLayout(new GridLayout(0, 3, 10, 10));
		healthPTButton=new JButton("HealthPT");
		sportsButton=new JButton("Sports");
		militaryArtsButton=new JButton("MilitaryArts");
		
		JPanel studyPanel=new JPanel();
		studyPanel.setLayout(new GridLayout(0, 3, 10, 10));
		physicsButton=new JButton("Physics");
		foodNutritionButton=new JButton("FoodNutrition");
		healthCareButton=new JButton("HealthCare");
		
		JPanel relaxPanel=new JPanel();
		relaxPanel.setLayout(new GridLayout(0, 3, 10, 10));
		eatingButton=new JButton("Eating");
		yoloButton=new JButton("YOLO");
		doingNothingButton=new JButton("DoingNothing");
		
		//----------------- 행동 (오른쪽) -----------------//
		
		healthPTButton.addActionListener(new MyListener());
		sportsButton.addActionListener(new MyListener());
		militaryArtsButton.addActionListener(new MyListener());
		physicsButton.addActionListener(new MyListener());
		foodNutritionButton.addActionListener(new MyListener());
		healthCareButton.addActionListener(new MyListener());
		eatingButton.addActionListener(new MyListener());
		yoloButton.addActionListener(new MyListener());
		doingNothingButton.addActionListener(new MyListener());
		
		//----------------- 총 이벤트 처리 -----------------//

		add(leftPanel, BorderLayout.WEST);
		add(centerPanel, BorderLayout.CENTER);
		add(rightPanel, BorderLayout.EAST);
		
		leftPanel.add(statusPanel);
//		statusPanel.add(playerNameLabel);
		statusPanel.add(fatLabel);
		statusPanel.add(fatText);
		statusPanel.add(muscleLabel);
		statusPanel.add(muscleText);
		statusPanel.add(satietyLabel);
		statusPanel.add(satietyText);
		statusPanel.add(fatigueLabel);
		statusPanel.add(fatigueText);
		statusPanel.add(pleasureLabel);
		statusPanel.add(pleasureText);
		statusPanel.add(dayLabel);
		statusPanel.add(dayText);
		
		rightPanel.add(activityPanel);
		activityPanel.add(exercisePanel);
		exercisePanel.add(healthPTButton);
		exercisePanel.add(sportsButton);
		exercisePanel.add(militaryArtsButton);
		activityPanel.add(studyPanel);
		studyPanel.add(physicsButton);
		studyPanel.add(foodNutritionButton);
		studyPanel.add(healthCareButton);
		activityPanel.add(relaxPanel);
		relaxPanel.add(eatingButton);
		relaxPanel.add(yoloButton);
		relaxPanel.add(doingNothingButton);
		
		//------------------- 추가 창 ---------------------//
		
		Toolkit kit=Toolkit.getDefaultToolkit();	//도구 모음
		Dimension screenSize=kit.getScreenSize();	//화면 크기 추출 객체
		
		setFrameSize(700, 275);
		
		setSize(frameWidth, frameHeight);
		setLocation((screenSize.width-frameWidth)/2, (screenSize.height-frameHeight)/2);	//위치
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("일식이");
		setVisible(true);
		
		setLayout(new FlowLayout());	//배치 관리자 설정
		
		//---------------여기까지 프레임 설정-----------------//
		
	}
	
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			dayText.setText(--day+"");
			if(e.getSource()==healthPTButton) {
				
			}else if(e.getSource()==sportsButton) {
				
			}else if(e.getSource()==militaryArtsButton) {
				
			}else if(e.getSource()==physicsButton) {
				
			}else if(e.getSource()==foodNutritionButton) {
				
			}else if(e.getSource()==healthCareButton) {
				
			}else if(e.getSource()==eatingButton) {
				
			}else if(e.getSource()==yoloButton) {
				
			}else if(e.getSource()==doingNothingButton) {
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Status status=new Status();
		Player player=new Player();
		
		Activity activity=new Activity();
		
		Activity exercise=new Exercise();
		Exercise healthPT=new HealthPT();
		Exercise sports=new Sports();
		Exercise militaryArts=new MilitaryArts();
		
		Activity study=new Study();
		Study physics=new Physics();
		Study foodNutrition=new FoodNutrition();
		Study healthCare=new HealthCare();
		
		Activity relax=new Relax();
		Relax eating=new Eating();
		Relax yolo=new YOLO();	//이름 주의
		Relax doingNothing=new DoingNothing();
		
		
		//StartFrame startFrame=new StartFrame(player);
		
		//if(startFrame.ing==false) {
			MainFrame_event_X mainFrame=new MainFrame_event_X(status);
			
			if(mainFrame.day==0) {
				OutFrame outFrame=new OutFrame(player);
			}
		//}
		
	}

}
