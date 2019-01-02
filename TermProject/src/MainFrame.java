import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {
	
	int frameWidth;		//������ ��
	int frameHeight;	//������ ����
	int day=30;

	private BufferedImage image;	//��� �̹���
	int width;
	int height;
	
	private JTextField nameField;
	private JPanel namePanel;
	private JLabel imageLabel;
	
	//---------------- �ʼ����� �ʵ� ----------------//
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
	//---------------- �̹��� �ʵ� -----------------//
	
	private JTextField fatText;
	private JTextField muscleText;
	private JTextField satietyText;
	private JTextField fatigueText;
	private JTextField pleasureText;
	private JTextField dayText;
	
	//---------------- �ؽ�Ʈ�ʵ�(��) --------------//
	
	private JButton healthPTButton;
	private JButton sportsButton;
	private JButton militaryArtsButton;
	private JButton physicsButton;
	private JButton foodNutritionButton;
	private JButton healthCareButton;
	private JButton eatingButton;
	private JButton yoloButton;
	private JButton doingNothingButton;
	
	//---------------- ��ư(��) ------------------//
	
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
	YOLO yolo=new YOLO();	//�̸� ����
	DoingNothing doingNothing=new DoingNothing();
	
	//---------------- ��ü ���� ------------------//
	
	public void setFrameSize(int frameWidth, int frameHeight) {
		this.frameWidth=frameWidth;
		this.frameHeight=frameHeight;
	}
	
	public void dayDown() {
		day--;
	}
	public void doMainFrame() {	//���� MainFrame�� ������ ����
		
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
		
		//---------------- status (��) -----------------//
		
		JPanel centerPanel=new JPanel();
		
		try {
			image=ImageIO.read(new File("people-W.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		imageLabel=new JLabel(new ImageIcon(image));

		//imageLabel = new JLabel(new ImageIcon("people-W.jpg"));
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
		
		//---------------- �׸� (�߰�) --------------------//
		
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
		
		//----------------- �ൿ (������) -----------------//
		
		//��ư ����
		healthPTButton.setBackground(Color.red);
		sportsButton.setBackground(Color.red);
		militaryArtsButton.setBackground(Color.red);
		physicsButton.setBackground(Color.blue);
		foodNutritionButton.setBackground(Color.blue);
		healthCareButton.setBackground(Color.blue);
		eatingButton.setBackground(Color.YELLOW);
		yoloButton.setBackground(Color.YELLOW);
		doingNothingButton.setBackground(Color.YELLOW);
		
		//��ư �۾���
		healthPTButton.setForeground(Color.green);
		sportsButton.setForeground(Color.green);
		militaryArtsButton.setForeground(Color.green);
		physicsButton.setForeground(Color.orange);
		foodNutritionButton.setForeground(Color.orange);
		healthCareButton.setForeground(Color.orange);
		eatingButton.setForeground(Color.magenta);
		yoloButton.setForeground(Color.magenta);
		doingNothingButton.setForeground(Color.magenta);
		
		//��ư �۾�
		Font f=new Font("Serif", Font.BOLD, 16);
		
		healthPTButton.setFont(f);
		sportsButton.setFont(f);
		militaryArtsButton.setFont(f);
		physicsButton.setFont(f);
		foodNutritionButton.setFont(f);
		healthCareButton.setFont(f);
		eatingButton.setFont(f);
		yoloButton.setFont(f);
		doingNothingButton.setFont(f);
		
		//��ư �׵θ�
		healthPTButton.setBorderPainted(false);
		sportsButton.setBorderPainted(false);
		militaryArtsButton.setBorderPainted(false);
		physicsButton.setBorderPainted(false);
		foodNutritionButton.setBorderPainted(false);
		healthCareButton.setBorderPainted(false);
		eatingButton.setBorderPainted(false);
		yoloButton.setBorderPainted(false);
		doingNothingButton.setBorderPainted(false);
		
		/*
		healthPT
		sports
		militaryArts
		physics
		foodNutrition
		healthCare
		eating
		yolo
		doingNothing
		*/
		
		//healthPTButton.setBorder(null);
		
		//----------------- �ൿ (������) -----------------//
		
		healthPTButton.addActionListener(new MainListener());
		sportsButton.addActionListener(new MainListener());
		militaryArtsButton.addActionListener(new MainListener());
		physicsButton.addActionListener(new MainListener());
		foodNutritionButton.addActionListener(new MainListener());
		healthCareButton.addActionListener(new MainListener());
		eatingButton.addActionListener(new MainListener());
		yoloButton.addActionListener(new MainListener());
		doingNothingButton.addActionListener(new MainListener());
		
		//----------------- �� �̺�Ʈ ó�� -----------------//

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
		
		//------------------- �߰� â ---------------------//
		
		Toolkit kit=Toolkit.getDefaultToolkit();	//���� ����
		Dimension screenSize=kit.getScreenSize();	//ȭ�� ũ�� ���� ��ü
		
		setFrameSize(700, 275);
		
		setSize(frameWidth, frameHeight);
		setLocation((screenSize.width-frameWidth)/2, (screenSize.height-frameHeight)/2);	//��ġ
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("�Ͻ���");
		setVisible(true);
		
		setLayout(new FlowLayout());	//��ġ ������ ����
		
		//---------------������� ������ ����-----------------//
		status.StatusToInt(status);
	}
	
	public MainFrame() {
		
		namePanel=new JPanel();
		add(namePanel);
		
		
		JLabel nameLabel=new JLabel("�̸�");
		nameField=new JTextField(15);
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
		
		//getContentPane().setBackground(Color.YELLOW);	//����
		
		setFrameSize(350, 125);
		
		setSize(frameWidth, frameHeight);
		setLocation((screenSize.width-frameWidth)/2, (screenSize.height-frameHeight)/2);	//��ġ
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("�Ͻ���");
		setVisible(true);
		
		setLayout(new FlowLayout());	//��ġ ������ ����
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
				try {
					image=ImageIO.read(new File("healthPT.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				imageLabel.setIcon(new ImageIcon(image));
				
				RockPaperScissor rps=new RockPaperScissor();
				healthPT.DoHealthPT(status);
			}else if(e.getSource()==sportsButton) {
				try {
					image=ImageIO.read(new File("sports.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				imageLabel.setIcon(new ImageIcon(image));
				
				RockPaperScissor rps=new RockPaperScissor();
				sports.DoSports(status);
			}else if(e.getSource()==militaryArtsButton) {
				try {
					image=ImageIO.read(new File("militaryArts.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				imageLabel.setIcon(new ImageIcon(image));
				
				RockPaperScissor rps=new RockPaperScissor();
				militaryArts.DoMilitaryArts(status);
			}else if(e.getSource()==physicsButton) {
				try {
					image=ImageIO.read(new File("physics.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				imageLabel.setIcon(new ImageIcon(image));
				
				Puzzle puzzle=new Puzzle();
				physics.DoPhysics(status, healthPT, sports, militaryArts);
			}else if(e.getSource()==foodNutritionButton) {
				try {
					image=ImageIO.read(new File("foodNutrition.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				imageLabel.setIcon(new ImageIcon(image));
				
				Puzzle puzzle=new Puzzle();
				foodNutrition.DoFoodNutrition(status);
			}else if(e.getSource()==healthCareButton) {
				try {
					image=ImageIO.read(new File("healthCare.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				imageLabel.setIcon(new ImageIcon(image));
				
				Puzzle puzzle=new Puzzle();
				healthCare.DoHealthCare(status);
			}else if(e.getSource()==eatingButton) {
				try {
					image=ImageIO.read(new File("eating.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				imageLabel.setIcon(new ImageIcon(image));
				
				NumberGame numberGame=new NumberGame();
				eating.DoEating(status);
			}else if(e.getSource()==yoloButton) {
				try {
					image=ImageIO.read(new File("yolo.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				imageLabel.setIcon(new ImageIcon(image));
				
				NumberGame numberGame=new NumberGame();
				yolo.DoYOLO(status);
			}else if(e.getSource()==doingNothingButton) {
				try {
					image=ImageIO.read(new File("doingNothing.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				imageLabel.setIcon(new ImageIcon(image));
				
				NumberGame numberGame=new NumberGame();
				doingNothing.DoDoingNothing(status);
			}
			if(day==0) {
				dispose();	//â �ڵ� �ݱ�
				status.StatusToInt(status);
				player.title(status);
				OutFrame outFrame=new OutFrame(player);		//OutFrame ����				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainFrame mainFrame=new MainFrame();
		
	}

}