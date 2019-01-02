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

public class MainFrame_thirdgame_X extends JFrame {
	
	int frameWidth;		//프레임 폭
	int frameHeight;	//프레임 높이
	int day=30;
/*	
	BufferedImage image;	//사람 이미지
	int width;
	int height;
*/	
	private JTextField nameField;
	private JPanel namePanel;
	private JLabel imageLabel;
	
	//---------------- 필수적인 필드 ----------------//
/*	
	private JLabel healthPTImg;
	private JLabel sportsImg;
	private JLabel militaryArtsImg;
	private JLabel physicsImg;
	private JLabel foodNutritionImg;
	private JLabel healthCareImg;
	private JLabel eatingImg;
	private JLabel yoloImg;
	private JLabel doingNothingImg;
*/	
	//---------------- 이미지 필드 -----------------//
	
	private JTextField fatText;
	private JTextField muscleText;
	private JTextField satietyText;
	private JTextField fatigueText;
	private JTextField pleasureText;
	private JTextField dayText;
	
	//---------------- 텍스트필드(좌) --------------//
	
	private JButton healthPTButton;
	private JButton sportsButton;
	private JButton militaryArtsButton;
	private JButton physicsButton;
	private JButton foodNutritionButton;
	private JButton healthCareButton;
	private JButton eatingButton;
	private JButton yoloButton;
	private JButton doingNothingButton;
	
	//---------------- 버튼(우) ------------------//
	
	Player player=new Player();
	
	Status status=new Status();
	Activity activity=new Activity();
	
	Exercise exercise=new Exercise();
	HealthPT healthPT=new HealthPT();
	Sports sports=new Sports();
	MilitaryArts militaryArts=new MilitaryArts();
	
	Study study=new Study();
	Physics physics=new Physics();
	FoodNutrition foodNutrition=new FoodNutrition();
	HealthCare healthCare=new HealthCare();
	
	Relax relax=new Relax();
	Eating eating=new Eating();
	YOLO yolo=new YOLO();	//이름 주의
	DoingNothing doingNothing=new DoingNothing();
	
	//---------------- 객체 생성 ------------------//
	
	public void setFrameSize(int frameWidth, int frameHeight) {
		this.frameWidth=frameWidth;
		this.frameHeight=frameHeight;
	}
	
	public void dayDown() {
		day--;
	}
	public void doMainFrame() {	//기존 MainFrame의 생성자 내용
		
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

		imageLabel = new JLabel(new ImageIcon("people-W.jpg"));
		//imageLabel.setHorizontalAlignment(JLabel.CENTER);
/*		
		healthPTImg=new JLabel(new ImageIcon("healthPT.jpg"));
		sportsImg=new JLabel(new ImageIcon("sports.jpg"));
		militaryArtsImg=new JLabel(new ImageIcon("militaryArts.jpg"));
		physicsImg=new JLabel(new ImageIcon("physics.jpg"));
		foodNutritionImg=new JLabel(new ImageIcon("foodNutrition.jpg"));
		healthCareImg=new JLabel(new ImageIcon("healthCare.jpg"));
		eatingImg=new JLabel(new ImageIcon("eating.jpg"));
		yoloImg=new JLabel(new ImageIcon("yolo.jpg"));
		doingNothingImg=new JLabel(new ImageIcon("doingNothing.jpg"));
*/		
		
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
		
		healthPTButton.addActionListener(new MainListener());
		sportsButton.addActionListener(new MainListener());
		militaryArtsButton.addActionListener(new MainListener());
		physicsButton.addActionListener(new MainListener());
		foodNutritionButton.addActionListener(new MainListener());
		healthCareButton.addActionListener(new MainListener());
		eatingButton.addActionListener(new MainListener());
		yoloButton.addActionListener(new MainListener());
		doingNothingButton.addActionListener(new MainListener());
		
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
		
		centerPanel.add(imageLabel);
		
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
		status.StatusToInt(status);
	}
	
	public MainFrame_thirdgame_X() {
		
		namePanel=new JPanel();
		add(namePanel);
		
		
		JLabel nameLabel=new JLabel("이름");
		nameField=new JTextField(15);
		JButton nameButton=new JButton("완료");
		
		//---------------여기까지 이름 입력 창----------------//
		
		nameButton.addActionListener(new StartListener());
		
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
	}
	
	private class StartListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			player.name=nameField.getText();
			remove(namePanel);
			setVisible(false);
			doMainFrame();
		}
	}
	
	private class MainListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			day--;
			fatText.setText(status.Integer(status.fat)+"");
			muscleText.setText(status.Integer(status.muscle)+"");
			satietyText.setText(status.Integer(status.satiety)+"");
			fatigueText.setText(status.Integer(status.fatigue)+"");
			pleasureText.setText(status.Integer(status.pleasure)+"");
			dayText.setText(day+"");
			
			//dayText.setText(--day+"");
			if(e.getSource()==healthPTButton) {
				RockPaperScissor rps=new RockPaperScissor();
				healthPT.DoHealthPT(status);
			}else if(e.getSource()==sportsButton) {
				RockPaperScissor rps=new RockPaperScissor();
				sports.DoSports(status);
			}else if(e.getSource()==militaryArtsButton) {
				RockPaperScissor rps=new RockPaperScissor();
				militaryArts.DoMilitaryArts(status);
			}else if(e.getSource()==physicsButton) {
				Puzzle puzzle=new Puzzle();
				physics.DoPhysics(status, healthPT, sports, militaryArts);
			}else if(e.getSource()==foodNutritionButton) {
				Puzzle puzzle=new Puzzle();
				foodNutrition.DoFoodNutrition(status);
			}else if(e.getSource()==healthCareButton) {
				Puzzle puzzle=new Puzzle();
				healthCare.DoHealthCare(status);
			}else if(e.getSource()==eatingButton) {
				eating.DoEating(status);
			}else if(e.getSource()==yoloButton) {
				yolo.DoYOLO(status);
			}else if(e.getSource()==doingNothingButton) {
				doingNothing.DoDoingNothing(status);
			}
			if(day==0) {
				dispose();	//창 자동 닫기
				status.StatusToInt(status);
				player.title(status);
				OutFrame outFrame=new OutFrame(player);		//OutFrame 실행				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainFrame_thirdgame_X mainFrame=new MainFrame_thirdgame_X();
		
	}

}
