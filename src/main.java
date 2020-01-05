import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JTextField;


/* we can USe  Overfloawerror = 0 ,for new feature . >>
 * 		choose  Man Vs Man  
 * 					OR
 * 				Man Vs Logic 
 * 
 * 
 * 					STOP  BUTTON A  PROBLEM ! 
 * 					so, next a  i'll try  with constructor .
 * 
 * 						M V L8 ==	Majhkhaner (1,1) filled  1st auto  [Medium game]
 * 
 *  */
 










@SuppressWarnings("serial")
public class main extends JFrame {
	
	IO obio = new IO();
	String file1 = "backup game1 Records";
	String file2 = "game1 Records";
	
	String firstname;
	
	
	String color="0xffafaf";
	String buttoncolor="0xffafaf";
	String boxcolor="0xffafaf";
	
	Random Rnumber = new Random();
 	
	int buttonNumber;
	int random;
	int lvlbutton=4;
	
	int play_count=0,giving_number=5;
	
	GameLogic object = new GameLogic();

	private JPanel contentPane;
	int defaultValue=1,compBrainvalue=1,compBrainvalue2=1,antycompbrainvalue=2,antycompbrainvalue2=2;
	int hand = 1,strict=1,reset=1;
	
	JLabel first_score;
	JLabel second_score;
	
	int stackOverflowError = 1;
	
	int zeroOne  = 1;
	
	
	
	static int count;
	private JButton button0;
	private JButton button0_1;
	private JButton button0_2;
	private JButton button1;
	private JButton button1_1;
	private JButton button1_2;
	private JButton button2;
	private JButton button2_1;
	private JButton button2_2;
	private JButton btnX;
	private JButton btn0;
	private JButton btnBlue;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton buttonveasy;
	private JButton buttoneasy;
	private JButton buttonmedium;
	private JButton buttonhard;
	private JTextField FirstHandName;
	private JTextField SecondHandName;
	private JLabel lblName;
	private JLabel label;
	private JLabel lblCurrentWinner;
	private	JLabel labelwinner;
	private JLabel lblwinner5;
	private JButton ManVsManbutton;
	private JButton ManVsLogicbutton;
	private JButton button_23;
	

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					main frame = new main();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setTitle("Tic Tac Toe Man Vs Logic  ** Eid **  vrsn ");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public main() {
		
		
		
		obio.fileexistingcheck(file1);
		
		obio.fileexistingcheck(file2);
		
		JOptionPane.showMessageDialog(null, "Enter Your Name :");
		 firstname = JOptionPane.showInputDialog("Enter Your Name !", "");
		System.out.println(firstname);
		  
		
		
		//default  lvl check
		
		//lvlchecker();
		
	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		button0 = new JButton("");
		button0.setBounds(5, 6, 144, 78);
		button0.setBackground(Color.PINK);
		button0.setForeground(Color.WHITE);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(button0.getText().equals("") && object.array[0][0]==0){
					keyCheck(button0);			// x || 0 
					strict();					// man / computer
					
					if(button0.getText().equals("X") )
						object.array[0][0] = 1;
					
					else
						object.array[0][0] = 2;
			
				
				gameLogicTest();				// match 1==1==1 || 0==0==0
				object.status(count++);			// sound play of draw 
				callingSound();					// every Button Sound play
				
				
				
				// vEasy Vs Hard 
				
				if (lvlbutton==4) {
					
					CompBrainHard();
					
				}
				
				else if (lvlbutton==2 || lvlbutton==3) {
					CompBrain();			
					
				}												//  Random Vs Computer Logic 
				else {
					AutoPlay();
				}
				
				
			
				}
						
			}
		});
		contentPane.setLayout(null);
		button0.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(button0);
		
		button0_1 = new JButton("");
		button0_1.setBounds(149, 6, 144, 78);
		button0_1.setBackground(Color.PINK);
		button0_1.setForeground(Color.WHITE);
		button0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(button0_1.getText().equals("") && object.array[0][1]==0){
					keyCheck(button0_1);
					strict();
					
					if(button0_1.getText().equals("X") )
						object.array[0][1] = 1;
					
					else
						object.array[0][1] = 2;
					
				
				gameLogicTest();
				object.status(count++);	
				callingSound();
				
				// vEasy Vs Hard 
				
				if (lvlbutton==4) {				//  for  hard calling 
					
					CompBrainHard();
					
				}
				
				else if (lvlbutton==2 || lvlbutton==3) {			// for  medium &  easy  calling
					CompBrain();			
					
				}												//  Random Vs Computer Logic  v easy caling 
				else {
					AutoPlay();
				}
				
				
			
				
				}
			}
		});
		button0_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(button0_1);
		
		button0_2 = new JButton("");
		button0_2.setBounds(293, 6, 144, 78);
		button0_2.setBackground(Color.PINK);
		button0_2.setForeground(Color.WHITE);
		button0_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if( button0_2.getText().equals("") && object.array[0][2]==0){
					keyCheck(button0_2);
					strict();
					
					
					if(button0_2.getText().equals("X") ) 
						object.array[0][2] = 1;
					
					else  
						object.array[0][2] = 2;
					
			
				gameLogicTest();
				object.status(count++);	
				callingSound();
				
				
				
				// vEasy Vs Hard 
				
				if (lvlbutton==4) {				//  for  hard calling 
					
					CompBrainHard();
					
				}
				
				else if (lvlbutton==2 || lvlbutton==3) {			// for  medium &  easy  calling
					CompBrain();			
					
				}												//  Random Vs Computer Logic  v easy caling 
				else {
					AutoPlay();
				}
				
				
			
				}
			}
		});
		button0_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(button0_2);
		
		button1_2 = new JButton("");
		button1_2.setBounds(293, 84, 144, 78);
		button1_2.setBackground(Color.decode(color));
		button1_2.setForeground(Color.WHITE);
		button1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( button1_2.getText().equals("") && object.array[1][2]==0){
					keyCheck(button1_2);
					strict();
					
					
					
					if(button1_2.getText().equals("X") ) 
						object.array[1][2] = 1;
					
					else  
						object.array[1][2] = 2;
					
					
					gameLogicTest();
					object.status(count++);
					callingSound();
					
					
					
					// vEasy Vs Hard 
					
					if (lvlbutton==4) {				//  for  hard calling 
						
						CompBrainHard();
						
					}
					
					else if (lvlbutton==2 || lvlbutton==3) {			// for  medium &  easy  calling
						CompBrain();			
						
					}												//  Random Vs Computer Logic  v easy caling 
					else {
						AutoPlay();
					}
					
					
				
					}
			}
		});
		
		button1 = new JButton("");
		button1.setBounds(5, 84, 144, 78);
		button1.setBackground(Color.PINK);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( button1.getText().equals("") && object.array[1][0]==0){
					keyCheck(button1);
					strict();
					
					
					if(button1.getText().equals("X") ) 
						object.array[1][0] = 1;
					
					else  
						object.array[1][0] = 2;
					
					
					gameLogicTest();
					object.status(count++);
					callingSound();
					
					
					
					// vEasy Vs Hard 
					
					if (lvlbutton==4) {				//  for  hard calling 
						
						CompBrainHard();
						
					}
					
					else if (lvlbutton==2 || lvlbutton==3) {			// for  medium &  easy  calling
						CompBrain();			
						
					}												//  Random Vs Computer Logic  v easy caling 
					else {
						AutoPlay();
					}
					
					
				
					}
			}
		});
		button1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(button1);
		
		button1_1 = new JButton("");
		button1_1.setBounds(149, 84, 144, 78);
		button1_1.setBackground(Color.PINK);
		button1_1.setForeground(Color.WHITE);
		button1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( button1_1.getText().equals("") && object.array[1][1]==0){
					keyCheck(button1_1);
					strict();
					
						
					if(button1_1.getText().equals("X") ) 
						object.array[1][1] = 1;
					
					else  
						object.array[1][1] = 2;
					
					
					
					gameLogicTest();
					object.status(count++);
					callingSound();
					
					
					
					// vEasy Vs Hard 
					
					if (lvlbutton==4) {				//  for  hard calling 
						
						CompBrainHard();
						
					}
					
					else if (lvlbutton==2 || lvlbutton==3) {			// for  medium &  easy  calling
						CompBrain();			
						
					}												//  Random Vs Computer Logic  v easy caling 
					else {
						AutoPlay();
					}
					
					
				
					}
			}
		});
		button1_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(button1_1);
		button1_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(button1_2);
		
		button2 = new JButton("");
		button2.setBounds(5, 162, 144, 78);
		button2.setBackground(Color.PINK);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if( button2.getText().equals("") && object.array[2][0]==0){
					keyCheck(button2);
					strict(); // for fixed to strict RESET  & TOGOL Hand 
					

					if(button2.getText().equals("X") ) 
						object.array[2][0] = 1;
					
					else  
						object.array[2][0] = 2;
					
					
					gameLogicTest();	
					object.status(count++);
					callingSound();
					
					
					
					// vEasy Vs Hard 
					
					if (lvlbutton==4) {				//  for  hard calling 
						
						CompBrainHard();
						
					}
					
					else if (lvlbutton==2 || lvlbutton==3) {			// for  medium &  easy  calling
						CompBrain();			
						
					}												//  Random Vs Computer Logic  v easy caling 
					else {
						AutoPlay();
					}
					
					
				
					}
			}
		});
		button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(button2);
		
		button2_1 = new JButton("");
		button2_1.setBounds(149, 162, 144, 78);
		button2_1.setBackground(Color.PINK);
		button2_1.setForeground(Color.WHITE);
		button2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( button2_1.getText().equals("") && object.array[2][1]==0){
					keyCheck(button2_1);
					strict();
					
					
					
					if(button2_1.getText().equals("X") ) 
						object.array[2][1] = 1;
					
					else  
						object.array[2][1] = 2;
					
					
					gameLogicTest();
					object.status(count++);
					callingSound();
					
					
					
					// vEasy Vs Hard 
					
					if (lvlbutton==4) {				//  for  hard calling 
						
						CompBrainHard();
						
					}
					
					else if (lvlbutton==2 || lvlbutton==3) {			// for  medium &  easy  calling
						CompBrain();			
						
					}												//  Random Vs Computer Logic  v easy caling 
					else {
						AutoPlay();
					}
					
					
				
					}
			}
		});
		button2_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(button2_1);
		
		button2_2 = new JButton("");
		button2_2.setBounds(293, 162, 144, 78);
		button2_2.setBackground(Color.PINK);
		button2_2.setForeground(Color.WHITE);
		button2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( button2_2.getText().equals("") && object.array[2][2]==0){
					keyCheck(button2_2);
					strict();
					
					
					if(button2_2.getText().equals("X") ) 
						object.array[2][2] = 1;
					
					else  
						object.array[2][2] = 2;
					
					
					gameLogicTest();
					object.status(count++);
					callingSound();
					
					
					
					// vEasy Vs Hard 
					
					if (lvlbutton==4) {				//  for  hard calling 
						
						CompBrainHard();
						
					}
					
					else if (lvlbutton==2 || lvlbutton==3) {			// for  medium &  easy  calling
						CompBrain();			
						
					}												//  Random Vs Computer Logic  v easy caling 
					else {
						AutoPlay();
					}
					
					
				
					}
			}
		});
		button2_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(button2_2);
		
		JButton resetButton = new JButton("Reset");
		resetButton.setBounds(353, 240, 84, 44);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//reset = 1;   // only Rough later  have to  b   delete .
				stackOverflowError=zeroOne;
				
				
				if (reset==1) {
					button0.setText("");
					button0_1.setText("");
					button0_2.setText("");
					button1.setText("");
					button1_1.setText("");
					button1_2.setText("");
					button2.setText("");
					button2_1.setText("");
					button2_2.setText("");
					
				    for (int a = 0; a < 3; a++) {
						for (int h = 0; h < 3; h++) {
							object.array[a][h] = 0;
							object.colorValue[a][h]=0;
						}
					}
				    
				    recolor();
				    
				    
				    
					strict=1;
				    object.findWiner = 0;
				    object.k=0;
					count = 0;
					if (hand==1) {
						defaultValue=1;
					}
					else {
						defaultValue=2;
					}
					//hand = 1;
					//defaultValue=1;
					
				}

			}
		});
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBounds(353, 291, 84, 33);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			
				
				 obio.copyfile( file1,file2);
				 if (object.firsthandscore > object.secondhandscore) {
					 
					 obio.write(FirstHandName.getText()+" Vs "+SecondHandName.getText()+" : ", FirstHandName.getText()+" Win By ", first_score.getText());
					
				}
				 else if (object.secondhandscore > object.firsthandscore) {
					 
					 obio.write(FirstHandName.getText()+" Vs "+SecondHandName.getText()+" : ", SecondHandName.getText()+" Win By ", second_score.getText());
					
				}
				 
				 else {
					
					 obio.write(FirstHandName.getText()+" Vs "+SecondHandName.getText()+" : ", " Draw ", "0");
				}
				 
				// obio.close();
				 
				 obio.close();
				 
				 obio.copyfile( file2,file1);
				 obio.close();
				
				System.exit(0);

			}
		});
		contentPane.add(btnStop);
		contentPane.add(resetButton);
		
		btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (strict==1) {
					hand = 1;
					togolHand();
					
				}
				
				
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnX.setBounds(136, 251, 50, 23);
		contentPane.add(btnX);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strict==1) {
					hand = 0;
					togolHand();
					
				}
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(136, 285, 50, 23);
		contentPane.add(btn0);
		
		JLabel lblFirstHand = new JLabel("First Hand :");
		lblFirstHand.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstHand.setBounds(54, 251, 95, 23);
		contentPane.add(lblFirstHand);
		
		JLabel lblSecondHand = new JLabel("Second Hand :");
		lblSecondHand.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSecondHand.setBounds(33, 286, 110, 23);
		contentPane.add(lblSecondHand);
		
		 first_score = new JLabel("( 0 )");
		 first_score.setBackground(Color.ORANGE);
		 first_score.setFont(new Font("Tahoma", Font.BOLD, 11));
		 first_score.setForeground(new Color(255, 0, 0));
		first_score.setBounds(0, 255, 55, 14);
		contentPane.add(first_score);
		
		
		 second_score = new JLabel("( 0 )");
		 second_score.setBackground(Color.ORANGE);
		 second_score.setLabelFor(this);
		 second_score.setFont(new Font("Tahoma", Font.BOLD, 11));
		 second_score.setForeground(Color.BLUE);
		second_score.setBounds(0, 292, 43, 16);
		contentPane.add(second_score);
		
		btnBlue = new JButton("");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				recolor("0x2c2255");
				boxcolor="0x2c2255";
				
			}
		});
		btnBlue.setBounds(480, 6, 13, 23);
		contentPane.add(btnBlue);
		btnBlue.setBackground(Color.decode("0x2c2255"));
		
		
		
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0x05a659");
				boxcolor="0x05a659";
			}
		});
		button_1.setBounds(480, 32, 13, 23);
		contentPane.add(button_1);
		button_1.setBackground(Color.decode("0x05a659"));
		
		
		
		button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0x159df9");
				boxcolor="0x159df9";
			}
		});
		button_2.setBounds(480, 86, 13, 23);
		contentPane.add(button_2);
		button_2.setBackground(Color.decode("0x159df9"));
		
		
		
		
		button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0xaa418d");
				boxcolor="0xaa418d";
			}
		});
		button_3.setBounds(480, 60, 13, 23);
		contentPane.add(button_3);
		button_3.setBackground(Color.decode("0xaa418d"));
		
		button_4 = new JButton("");
		button_4.setBackground(Color.decode("0x7000ff"));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0x7000ff");
				boxcolor="0x7000ff";
			}
		});
		button_4.setBounds(480, 194, 13, 23);
		contentPane.add(button_4);
		
		
		button_5 = new JButton("");
		button_5.setBackground(Color.decode("0x000033"));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0x000033");
				boxcolor="0x000033";
			}
		});
		button_5.setBounds(480, 168, 13, 23);
		contentPane.add(button_5);
		
		
		button_6 = new JButton("");
		button_6.setBackground(Color.decode("0x660000"));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0x660000");
				boxcolor="0x660000";
			}
		});
		button_6.setBounds(480, 140, 13, 23);
		contentPane.add(button_6);
		
		button_7 = new JButton("");
		button_7.setBackground(Color.decode("0x783fcb"));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0x783fcb");
				boxcolor="0x783fcb";
			}
		});
		button_7.setBounds(480, 114, 13, 23);
		contentPane.add(button_7);
		
		button_8 = new JButton("");
		button_8.setBackground(Color.decode("0xd16c22"));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0xd16c22");
				boxcolor="0xd16c22";
			}
		});
		button_8.setBounds(480, 301, 13, 23);
		contentPane.add(button_8);
		
		
		button_9 = new JButton("");
		button_9.setBackground(Color.decode("0xffc000"));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0xffc000");
				boxcolor="0xffc000";
			}
		});
		button_9.setBounds(480, 275, 13, 23);
		contentPane.add(button_9);
		
		
		
		button_10 = new JButton("");
		button_10.setBackground(Color.decode("0x008080"));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0x008080");
				boxcolor="0x008080";
			}
		});
		button_10.setBounds(480, 247, 13, 23);
		contentPane.add(button_10);
		
		button_11 = new JButton("");
		button_11.setBackground(Color.decode("0xc00040"));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recolor("0xc00040");
				boxcolor="0xc00040";
			}
		});
		button_11.setBounds(480, 221, 13, 23);
		contentPane.add(button_11);
		
		FirstHandName = new JTextField();
		FirstHandName.setText(firstname);
		FirstHandName.setBounds(252, 251, 86, 20);
		contentPane.add(FirstHandName);
		FirstHandName.setColumns(10);
		
		SecondHandName = new JTextField();
		SecondHandName.setText("Second Hand");
		SecondHandName.setColumns(10);
		SecondHandName.setBounds(252, 286, 86, 20);
		contentPane.add(SecondHandName);
		
		lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(196, 286, 58, 23);
		contentPane.add(lblName);
		
		label = new JLabel("Name :");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(192, 251, 58, 23);
		contentPane.add(label);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(44, 34, 85));
			}
		});
		button.setBackground(new Color(44, 34, 85));
		button.setBounds(466, 48, 13, 23);
		contentPane.add(button);
		
		JButton button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(5, 166, 89));
				
			}
		});
		button_12.setBackground(new Color(5, 166, 89));
		button_12.setBounds(466, 74, 13, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(170, 65, 141));
			}
		});
		button_13.setBackground(new Color(170, 65, 141));
		button_13.setBounds(466, 102, 13, 23);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(21, 157, 249));
			}
		});
		button_14.setBackground(new Color(21, 157, 249));
		button_14.setBounds(466, 128, 13, 23);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.setBackground(new Color(120, 63, 203));
			}
		});
		button_15.setBackground(new Color(120, 63, 203));
		button_15.setBounds(466, 156, 13, 23);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(102, 0, 0));
			}
		});
		button_16.setBackground(new Color(102, 0, 0));
		button_16.setBounds(466, 182, 13, 23);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.setBackground(new Color(0, 0, 51));
			}
		});
		button_17.setBackground(new Color(0, 0, 51));
		button_17.setBounds(466, 210, 13, 23);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(112, 0, 255));
			}
		});
		button_18.setBackground(new Color(112, 0, 255));
		button_18.setBounds(466, 236, 13, 23);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(192, 0, 64));
			}
		});
		button_19.setBackground(new Color(192, 0, 64));
		button_19.setBounds(466, 263, 13, 23);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(0, 128, 128));
			}
		});
		button_20.setBackground(new Color(0, 128, 128));
		button_20.setBounds(466, 289, 13, 23);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(255, 192, 0));
			}
		});
		button_21.setBackground(new Color(255, 192, 0));
		button_21.setBounds(466, 317, 13, 23);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(209, 108, 34));
				
			}
		});
		button_22.setBackground(new Color(209, 108, 34));
		button_22.setBounds(466, 343, 13, 23);
		contentPane.add(button_22);
		
		ManVsManbutton = new JButton("");
		ManVsManbutton.setForeground(Color.WHITE);
		ManVsManbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SecondHandName.setText(JOptionPane.showInputDialog("Partner's Name", ""));
				
				zeroOne = 0;
				
				stackOverflowError = zeroOne;
				ManVsManbutton.setText("On");
				ManVsLogicbutton.setText("");
				
				ManVsManbutton.setBackground(Color.black);
				ManVsLogicbutton.setBackground(Color.WHITE);
				
			}
		});
		ManVsManbutton.setFont(new Font("Tahoma", Font.BOLD, 18));
		ManVsManbutton.setBounds(119, 331, 67, 23);
		contentPane.add(ManVsManbutton);
		
		ManVsLogicbutton = new JButton("");
		ManVsLogicbutton.setForeground(Color.WHITE);
		ManVsLogicbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				zeroOne = 1;
				stackOverflowError = zeroOne;
				ManVsLogicbutton.setText("On");
				ManVsManbutton.setText("");
				
				ManVsLogicbutton.setBackground(Color.black);
				ManVsManbutton.setBackground(Color.WHITE);
			}
		});
		ManVsLogicbutton.setFont(new Font("Tahoma", Font.BOLD, 18));
		ManVsLogicbutton.setBounds(119, 354, 67, 23);
		contentPane.add(ManVsLogicbutton);
		
		JLabel lblManVsMan = new JLabel("Man Vs Man :");
		lblManVsMan.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblManVsMan.setBounds(5, 331, 95, 23);
		contentPane.add(lblManVsMan);
		
		JLabel lblManVsComp = new JLabel("Man Vs Comp :");
		lblManVsComp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblManVsComp.setBounds(5, 354, 104, 23);
		contentPane.add(lblManVsComp);
		
		JButton Nullbackground = new JButton("");
		Nullbackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(null);
			}
		});
		
		Nullbackground.setBounds(466, 21, 13, 23);
		contentPane.add(Nullbackground);
		
		button_23 = new JButton("");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//recolor("null");
				//boxcolor="null";
				
				
			}
		});
		button_23.setBounds(480, 331, 13, 23);
		contentPane.add(button_23);
		
		JLabel lblHighScores = new JLabel("Winner  :");
		lblHighScores.setForeground(Color.BLUE);
		lblHighScores.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblHighScores.setBounds(503, 21, 123, 23);
		contentPane.add(lblHighScores);
		
		JLabel veryeasy = new JLabel("V Easy");
		veryeasy.setFont(new Font("Tahoma", Font.BOLD, 14));
		veryeasy.setBounds(196, 331, 58, 23);
		contentPane.add(veryeasy);
		
		JLabel easy = new JLabel("Easy");
		easy.setFont(new Font("Tahoma", Font.BOLD, 14));
		easy.setBounds(263, 331, 58, 23);
		contentPane.add(easy);
		
		JLabel medium = new JLabel("Medium");
		medium.setFont(new Font("Tahoma", Font.BOLD, 14));
		medium.setBounds(306, 331, 58, 23);
		contentPane.add(medium);
		
		JLabel hard = new JLabel("Hardd");
		hard.setFont(new Font("Tahoma", Font.BOLD, 14));
		hard.setBounds(374, 331, 58, 23);
		contentPane.add(hard);
		
		 buttonveasy = new JButton("");
		buttonveasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lvlbutton=1;
				lvlchecker();
				SecondHandName.setText("Second Hand");
			}
		});
		buttonveasy.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonveasy.setBounds(196, 354, 50, 23);
		contentPane.add(buttonveasy);
		
		 buttoneasy = new JButton("");
		 buttoneasy.setText("â—�");
		buttoneasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lvlbutton=2;
				lvlchecker();
				SecondHandName.setText("Second Hand");
			}
		});
		buttoneasy.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttoneasy.setBounds(252, 354, 50, 23);
		contentPane.add(buttoneasy);
		
		 buttonmedium = new JButton("");
		buttonmedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lvlbutton=3;
				lvlchecker();
				SecondHandName.setText("Second Hand");
			}
		});
		buttonmedium.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonmedium.setBounds(306, 354, 50, 23);
		contentPane.add(buttonmedium);
		
		buttonhard = new JButton("");
		buttonhard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lvlbutton=4;
				lvlchecker();
				SecondHandName.setText("Abhi");
			}
		});
		buttonhard.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonhard.setBounds(364, 354, 50, 23);
		contentPane.add(buttonhard);
		
		lblCurrentWinner = new JLabel("Current Winner  :");
		lblCurrentWinner.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentWinner.setBounds(503, 251, 123, 23);
		contentPane.add(lblCurrentWinner);
		
		labelwinner = new JLabel("");
		labelwinner.setForeground(Color.BLUE);
		labelwinner.setFont(new Font("Tahoma", Font.ITALIC, 14));
		labelwinner.setBounds(503, 292, 123, 60);
		contentPane.add(labelwinner);
		
		lblwinner5 = new JLabel("Winner Name ");
		lblwinner5.setForeground(Color.BLUE);
		lblwinner5.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblwinner5.setBounds(503, 60, 123, 84);
		contentPane.add(lblwinner5);
		
		
	}
	
	
			
	
	
	public void callingSound()  {
		
		
			try {
				object.soundplay();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public void strict() {
		strict=0;
		reset =0;
		compBrainvalue=compBrainvalue2;		//when compbrain() works with 1 "if" then compbrainvalue changed to = 3 ; thats why when reset then ...
		antycompbrainvalue=antycompbrainvalue2;   //   that  above
		
		
	}
	
	public void togolHand() {
		if (hand==1) {
			
			btnX.setText("X");
			btn0.setText("0");
			defaultValue=1;
			compBrainvalue=1;
			compBrainvalue2=1;
			
			antycompbrainvalue=2;
			antycompbrainvalue2=2;
			
			//hand=0;
			
		}
		else {
			btnX.setText("0");
			btn0.setText("X");
			defaultValue=2;
			compBrainvalue=2;
			compBrainvalue2=2;
			
			antycompbrainvalue=1;
			antycompbrainvalue2=1;
			
			
			//hand = 1;
			
		}
	}
	
	public void gameLogicTest()
	{
		//checking();
		
		object.gameLogicTest();
		
		checking();

		  if(object.findWiner ==1 || object.findWiner==2){
			  
		    		show_The_Winnner();
		    		stopPlaying();
		    		
		    		
		  }
		
		  
		  else if(count==8) {
			  
			  draw();
			
		}
		
	}
	
	public void scoreshow() {
		
			
		first_score.setText("( "+object.firsthandscore+" )");
		second_score.setText("( "+object.secondhandscore+" )");
		
		
	}
	
	public void show_The_Winnner() {
			
		play_count++;
		
		if(play_count>giving_number)
		{
			if(object.firsthandscore>object.secondhandscore)
			{
				lblwinner5.setText(""+FirstHandName.getText());
			}
			else {
				lblwinner5.setText(""+SecondHandName.getText());
			}
		}
		if (hand==1 && object.findWiner==1) {
			System.out.println("hand = "+hand);
			System.out.println("object.findwinnerr = "+object.findWiner);
			object.firsthandscore += 5;
			scoreshow();
			
			
			JOptionPane.showMessageDialog(null, FirstHandName.getText()+"  Win");
			
			labelwinner.setText(FirstHandName.getText()+"  Win");
			
			
			
			reset=1;
			stackOverflowError= 0;
			
		}
		
		else if (hand==0 && object.findWiner==2) {
			System.out.println("hand = "+hand);
			System.out.println("object.findwinnerr = "+object.findWiner);
			object.firsthandscore += 5;
			scoreshow();
			
			JOptionPane.showMessageDialog(null, FirstHandName.getText()+"  Win");
			
			labelwinner.setText(FirstHandName.getText()+"  Win");
			
			
			reset=1;
			stackOverflowError= 0;
		}
		else {
			System.out.println("hand = "+hand);
			System.out.println("object.findwinnerr = "+object.findWiner);
			object.secondhandscore += 5;
			scoreshow();
			
			
			JOptionPane.showMessageDialog(null, SecondHandName.getText()+"  Win");
			
			labelwinner.setText(SecondHandName.getText()+"  Win");
			
			
			reset=1;
			stackOverflowError= 0;
		}

		
	}
	
	public void stopPlaying() {
		  for (int a = 0; a < 3; a++) {
				for (int h = 0; h < 3; h++) {
					object.array[a][h] = 3;
					object.colorValue[a][h]=3;
				}
			}
		
	}
	

	
	public void checking()
	{
		
		if (object.colorValue[0][0]==1) {
			button0.setBackground(Color.BLUE);
			//button0.setForeground(Color.WHITE);	
			
		}
		if (object.colorValue[0][1]==1) {
			button0_1.setBackground(Color.BLUE);
			
		}
		if (object.colorValue[0][2]==1) {
			button0_2.setBackground(Color.BLUE);
			
		}
		if (object.colorValue[1][0]==1) {
			button1.setBackground(Color.BLUE);
			
		}
		if (object.colorValue[1][1]==1) {
			button1_1.setBackground(Color.BLUE);
			
		}
		if (object.colorValue[1][2]==1) {
			button1_2.setBackground(Color.BLUE);
			
		}
		if (object.colorValue[2][0]==1) {
			button2.setBackground(Color.BLUE);
			
		}
		if (object.colorValue[2][1]==1) {
			button2_1.setBackground(Color.BLUE);
			
		}
		if (object.colorValue[2][2]==1) {
			button2_2.setBackground(Color.BLUE);
			
		}
//		//else
//		{
//			button0.setBackground(Color.pink);
//			button0_1.setBackground(Color.pink);
//			button0_2.setBackground(Color.pink);
//			button1.setBackground(Color.pink);
//			button1_1.setBackground(Color.pink);
//			button1_2.setBackground(Color.pink);
//			button2.setBackground(Color.pink);
//			button2_1.setBackground(Color.pink);
//			button2_2.setBackground(Color.pink);
//			
//		}
	}
	

	public void keyCheck(JButton button){
		checking();
		
		if(defaultValue == 1){
			button.setText("X");
			defaultValue = 2;
		}
		else{
			button.setText("0");
			defaultValue = 1;
		}	
	}

	
	
//	public void AutoPlay_loop() {
//		for (int i = 0; i < 9; i++) {
//			if (rootPaneCheckingEnabled) {
//				
//			}
//			
//		}
//		
//	}
	
	
	
	
	
	public void lvlchecker() {
		if (lvlbutton==1) {
			buttonveasy.setText("â—�");
			buttoneasy.setText("");
			buttonmedium.setText("");
			buttonhard.setText("");
			
		}
		else if (lvlbutton==2) {
			buttonveasy.setText("");
			buttoneasy.setText("â—�");
			buttonmedium.setText("");
			buttonhard.setText("");
			
		}
		else if (lvlbutton==3) {
			buttonveasy.setText("");
			buttoneasy.setText("");
			buttonmedium.setText("â—�");
			buttonhard.setText("");

			
		}
		else if (lvlbutton==4) {
			buttonveasy.setText("");
			buttoneasy.setText("");
			buttonmedium.setText("");
			buttonhard.setText("â—�");

			
		}
		
	}
	
	
	
	
	
	
	
	public  void AutoPlay() {
		
		random = Rnumber.nextInt(9);
		buttonNumber = random;
		System.out.println("Box No : "+buttonNumber);
		
		
		if (buttonNumber==0) {
			System.out.println(buttonNumber+"Is In");
			Autochecking(button0);
			
		}
		else if (buttonNumber==1) {
			System.out.println(buttonNumber+"Is In");
			Autochecking(button0_1);
			
		}
		else if (buttonNumber==2) {
			System.out.println(buttonNumber+"Is In");
			Autochecking(button0_2);
			
		}
		else if (buttonNumber==3) {
			System.out.println(buttonNumber+"Is In");
			Autochecking(button1);
			
		}
		else if (buttonNumber==4) {
			System.out.println(buttonNumber+"Is In");
			Autochecking(button1_1);
			
		}
		else if (buttonNumber==5) {
			System.out.println(buttonNumber+"Is In");
			Autochecking(button1_2);
			
		}
		else if (buttonNumber==6) {
			System.out.println(buttonNumber+"Is In");
			Autochecking(button2);
			
		}
		else if (buttonNumber==7) {
			System.out.println(buttonNumber+"Is In");
			Autochecking(button2_1);
			
		}
		else if (buttonNumber==8) {
			System.out.println(buttonNumber+"Is In");
			Autochecking(button2_2);
			
		}
		
	}
	
	
public void Autochecking(JButton button) {
	
	if (stackOverflowError == 1) {
		
		
		if (button == button0) {
			//System.out.println("Yes i am 0");
			if( button.getText().equals("") && object.array[0][0]==0){
				keyCheck(button);
				strict();
				
				
				if(button.getText().equals("X") ) 
					object.array[0][0] = 1;
				
				else  
					object.array[0][0] = 2;
				
				
				gameLogicTest();
				object.status(count++);
				callingSound();
			}
			else {
				AutoPlay();
			}
			
		}
		else if (button == button0_1) {
			//System.out.println("Yes i am 0");
			if( button.getText().equals("") && object.array[0][1]==0){
				keyCheck(button);
				strict();
				
				
				if(button.getText().equals("X") ) 
					object.array[0][1] = 1;
				
				else  
					object.array[0][1] = 2;
				
				
				gameLogicTest();
				object.status(count++);
				callingSound();
			}
			else {
				AutoPlay();
			}
			
		}
		else if (button == button0_2) {
			//System.out.println("Yes i am 0");
			if( button.getText().equals("") && object.array[0][2]==0){
				keyCheck(button);
				strict();
				
				
				if(button.getText().equals("X") ) 
					object.array[0][2] = 1;
				
				else  
					object.array[0][2] = 2;
				
				
				gameLogicTest();
				object.status(count++);
				callingSound();
			}
			else {
				AutoPlay();
			}
			
		}
		else if (button == button1) {
			//System.out.println("Yes i am 0");
			if( button.getText().equals("") && object.array[1][0]==0){
				keyCheck(button);
				strict();
				
				
				if(button.getText().equals("X") ) 
					object.array[1][0] = 1;
				
				else  
					object.array[1][0] = 2;
				
				
				gameLogicTest();
				object.status(count++);
				callingSound();
			}
			else {
				AutoPlay();
			}
			
		}
		else if (button == button1_1) {
			//System.out.println("Yes i am 0");
			if( button.getText().equals("") && object.array[1][1]==0){
				keyCheck(button);
				strict();
				
				
				if(button.getText().equals("X") ) 
					object.array[1][1] = 1;
				
				else  
					object.array[1][1] = 2;
				
				
				gameLogicTest();
				object.status(count++);
				callingSound();
			}
			else {
				AutoPlay();
			}
			
		}
		else if (button == button1_2) {
			//System.out.println("Yes i am 0");
			if( button.getText().equals("") && object.array[1][2]==0){
				keyCheck(button);
				strict();
				
				
				if(button.getText().equals("X") ) 
					object.array[1][2] = 1;
				
				else  
					object.array[1][2] = 2;
				
				
				gameLogicTest();
				object.status(count++);
				callingSound();
			}
			else {
				AutoPlay();
			}
			
		}
		else if (button == button2) {
			//System.out.println("Yes i am 0");
			if( button.getText().equals("") && object.array[2][0]==0){
				keyCheck(button);
				strict();
				
				
				if(button.getText().equals("X") ) 
					object.array[2][0] = 1;
				
				else  
					object.array[2][0] = 2;
				
				
				gameLogicTest();
				object.status(count++);
				callingSound();
			}
			else {
				AutoPlay();
			}
			
		}
		else if (button == button2_1) {
			//System.out.println("Yes i am 0");
			if( button.getText().equals("") && object.array[2][1]==0){
				keyCheck(button);
				strict();
				
				
				if(button.getText().equals("X") ) 
					object.array[2][1] = 1;
				
				else  
					object.array[2][1] = 2;
				
				
				gameLogicTest();
				object.status(count++);
				callingSound();
			}
			else {
				AutoPlay();
			}
			
		}
		else if (button == button2_2) {
			//System.out.println("Yes i am 0");
			if( button.getText().equals("") && object.array[2][2]==0){
				keyCheck(button);
				strict();
				
				
				if(button.getText().equals("X") ) 
					object.array[2][2] = 1;
				
				else  
					object.array[2][2] = 2;
				
				
				gameLogicTest();
				object.status(count++);
				callingSound();
			}
			else {
				AutoPlay();
			}
			
		}
		
	}			

	}


 



public void CompBrain() {
	
		System.out.println("COMPBRAIN");
		System.out.println("default value is : "+defaultValue);
		System.out.println("Comp Brain value is : "+compBrainvalue);
		System.out.println("lvl button is :"+lvlbutton);
		int number = Rnumber.nextInt(6);
		//JOptionPane.showMessageDialog(null, number);

		if ((lvlbutton==3 || lvlbutton==4 ) && button1_1.getText().equals("") && number%2==0) {   //  || lvlbutton==4
			
			if (button1_1.getText().equals("")) {
				
				System.out.println("Extra Ordinary button1_1 Is In");
				Autochecking(button1_1);
				compBrainvalue=3;
				//lvlbutton=2;
					
					
				}
			
		}
	
	if (  ((object.array[0][1]==object.array[0][2]) || (object.array[1][0]==object.array[2][0]) ||(object.array[1][1]==object.array[2][2])) && button0.getText().equals("") ) {
		
			//System.out.println("[1][1] = "+object.array[1][1]);
			
		if ((object.array[0][1]==object.array[0][2]) &&   ( (object.array[0][1]==compBrainvalue || object.array[0][1]==compBrainvalue)&& (object.array[0][2]==compBrainvalue||object.array[0][2]==compBrainvalue))   ) {
			
			System.out.println("button0 Is In");
			Autochecking(button0);
			compBrainvalue=3;
			
			
		}
		else if ((object.array[1][0]==object.array[2][0]) &&   ( (object.array[1][0]==compBrainvalue || object.array[1][0]==compBrainvalue)&& (object.array[2][0]==compBrainvalue||object.array[2][0]==compBrainvalue))   ) {
			
			//System.out.println("button0 Is In");
			Autochecking(button0);
			compBrainvalue=3;
			
		}
		else if ((object.array[1][1]==object.array[2][2]) &&   ( (object.array[1][1]==compBrainvalue || object.array[1][1]==compBrainvalue)&& (object.array[2][2]==compBrainvalue||object.array[2][2]==compBrainvalue))   ) {
			
			System.out.println("button0 Is In");
			Autochecking(button0);
			compBrainvalue=3;
			
		}
		
		
		
	}
	
	if ((object.array[0][0]==object.array[0][2]) || (object.array[1][1]==object.array[2][1]) && button0_1.getText().equals("") ) {
		
		if ((object.array[0][0]==object.array[0][2]) &&   ( (object.array[0][0]==compBrainvalue || object.array[0][0]==compBrainvalue)&& (object.array[0][2]==compBrainvalue||object.array[0][2]==compBrainvalue))   ) {
			
			System.out.println("0,0");
			System.out.println("button0_1 Is In");
			Autochecking(button0_1);
			compBrainvalue=3;
			
		}
		else if ((object.array[1][1]==object.array[2][1]) &&   ( (object.array[1][1]==compBrainvalue || object.array[1][1]==compBrainvalue)&& (object.array[2][1]==compBrainvalue||object.array[2][1]==compBrainvalue))   ) {
			
			System.out.println("1,1");
			System.out.println("button0_1 Is In");
			Autochecking(button0_1);
			compBrainvalue=3;
			
		}
		

	}
	
	if ((object.array[0][0]==object.array[0][1]) || (object.array[1][2]==object.array[2][2]) ||(object.array[2][0]==object.array[1][1]) && button0_2.getText().equals("")) {
		
		if ((object.array[0][0]==object.array[0][1]) &&   ( (object.array[0][0]==compBrainvalue || object.array[0][0]==compBrainvalue)&& (object.array[0][1]==compBrainvalue||object.array[0][1]==compBrainvalue))   ) {
			
			System.out.println("button0_2 Is In");
			System.out.println("0,0");
			Autochecking(button0_2);
			compBrainvalue=3;
			
		}
		
		else if ((object.array[1][2]==object.array[2][2]) &&   ( (object.array[1][2]==compBrainvalue || object.array[1][2]==compBrainvalue)&& (object.array[2][2]==compBrainvalue||object.array[2][2]==compBrainvalue))  && button0_2.getText().equals("")  ) {
			
			System.out.println("button0_2 Is In");																																// eextra why this kolabhery
			System.out.println("1,2");
			Autochecking(button0_2);
			compBrainvalue=3;
			
		}
		else if ((object.array[2][0]==object.array[1][1]) &&   ( (object.array[2][0]==compBrainvalue || object.array[2][0]==compBrainvalue)&& (object.array[1][1]==compBrainvalue||object.array[1][1]==compBrainvalue))   ) {
			
			System.out.println("button0_2 Is In");
			System.out.println("2,0");
			Autochecking(button0_2);
			compBrainvalue=3;
			
		}
		

	}
	
	
	//2nd Row Start  ...... 
	if (((object.array[0][0]==object.array[2][0]) || (object.array[1][1]==object.array[1][2])) && button1.getText().equals("")) {
		
		if ((object.array[0][0]==object.array[2][0]) &&   ( (object.array[0][0]==compBrainvalue || object.array[0][0]==compBrainvalue)&& (object.array[2][0]==compBrainvalue||object.array[2][0]==compBrainvalue))   ) {
			
			System.out.println("button1 Is In");
			Autochecking(button1);
			compBrainvalue=3;
			
		}
		
		else if ((object.array[1][1]==object.array[1][2]) &&   ( (object.array[1][1]==compBrainvalue || object.array[1][1]==compBrainvalue)&& (object.array[1][2]==compBrainvalue||object.array[1][2]==compBrainvalue))   ) {
			
			System.out.println("button1 Is In");
			Autochecking(button1);
			compBrainvalue=3;
			
		}

	}
	
	if (  ((object.array[1][0]==object.array[1][2]) || (object.array[0][1]==object.array[2][1])||(object.array[2][0]==object.array[0][2])||(object.array[0][0]==object.array[2][2])) && button1_1.getText().equals("")) {
		
		
		if ((object.array[1][0]==object.array[1][2]) &&   ( (object.array[1][0]==compBrainvalue || object.array[1][0]==compBrainvalue)&& (object.array[1][2]==compBrainvalue||object.array[1][2]==compBrainvalue))   ) {
			
			System.out.println("button1_1 Is In");
			Autochecking(button1_1);
			compBrainvalue=3;
			
		}
		
		else if ((object.array[0][1]==object.array[2][1]) &&   ( (object.array[0][1]==compBrainvalue || object.array[0][1]==compBrainvalue)&& (object.array[2][1]==compBrainvalue||object.array[2][1]==compBrainvalue))   ) {
			
			System.out.println("button1_1 Is In");
			Autochecking(button1_1);
			compBrainvalue=3;
			
		}		
		
		else if ((object.array[2][0]==object.array[0][2]) &&   ( (object.array[2][0]==compBrainvalue || object.array[2][0]==compBrainvalue)&& (object.array[0][2]==compBrainvalue||object.array[0][2]==compBrainvalue))   ) {
			
			System.out.println("button1_1 Is In");
			Autochecking(button1_1);
			compBrainvalue=3;
			
		}
		else if ((object.array[0][0]==object.array[2][2]) &&   ( (object.array[0][0]==compBrainvalue || object.array[0][0]==compBrainvalue)&& (object.array[2][2]==compBrainvalue||object.array[2][2]==compBrainvalue))   ) {
			
			System.out.println("button1_1 Is In");
			Autochecking(button1_1);
			compBrainvalue=3;
			
		}
		
		

	}
	
	if (   ((object.array[0][2]==object.array[2][2]) || (object.array[1][0]==object.array[1][1])) && button1_2.getText().equals("") ) {
		
		if ((object.array[0][2]==object.array[2][2]) &&   ( (object.array[0][2]==compBrainvalue || object.array[0][2]==compBrainvalue)&& (object.array[2][2]==compBrainvalue||object.array[2][2]==compBrainvalue))   ) {
			
			System.out.println("button1_2 Is In");
			Autochecking(button1_2);
			compBrainvalue=3;
			
		}
		
		else if ((object.array[1][0]==object.array[1][1]) &&   ( (object.array[1][0]==compBrainvalue || object.array[1][0]==compBrainvalue)&& (object.array[1][1]==compBrainvalue||object.array[1][1]==compBrainvalue))   ) {
			
			System.out.println("button1_2 Is In");
			Autochecking(button1_2);
			compBrainvalue=3;
			
		}
		

	}
	
	// 3rd row  start .....
	
	if ((object.array[0][0]==object.array[1][0]) || (object.array[2][1]==object.array[2][2]) ||(object.array[0][2]==object.array[1][1]) && button2.getText().equals("")) {
		
		
		if ((object.array[0][0]==object.array[1][0]) &&   ( (object.array[0][0]==compBrainvalue || object.array[0][0]==compBrainvalue)&& (object.array[1][0]==compBrainvalue||object.array[1][0]==compBrainvalue))   ) {
			
			System.out.println("button2 Is In");
			Autochecking(button2);
			compBrainvalue=3;
			
		}
		
		else if ((object.array[2][1]==object.array[2][2]) &&   ( (object.array[2][1]==compBrainvalue || object.array[2][1]==compBrainvalue)&& (object.array[2][2]==compBrainvalue||object.array[2][2]==compBrainvalue))   ) {
			
			System.out.println("button2 Is In");
			Autochecking(button2);
			compBrainvalue=3;
			
		}
		else if ((object.array[0][2]==object.array[1][1]) &&   ( (object.array[0][2]==compBrainvalue || object.array[0][2]==compBrainvalue)&& (object.array[1][1]==compBrainvalue||object.array[1][1]==compBrainvalue))   ) {
			
			System.out.println("button2 Is In");
			Autochecking(button2);
			compBrainvalue=3;
			
		}

	}
	
	if ((object.array[0][1]==object.array[1][1]) || (object.array[2][0]==object.array[2][2]) && button2_1.getText().equals("") ) {
		
		if ((object.array[0][1]==object.array[1][1]) &&   ( (object.array[0][1]==compBrainvalue || object.array[0][1]==compBrainvalue)&& (object.array[1][1]==compBrainvalue||object.array[1][1]==compBrainvalue))   ) {
			
			System.out.println("button2_1 Is In");
			Autochecking(button2_1);
			compBrainvalue=3;
			
		}
		
		else if ((object.array[2][0]==object.array[2][2]) &&   ( (object.array[2][0]==compBrainvalue || object.array[2][0]==compBrainvalue)&& (object.array[2][2]==compBrainvalue||object.array[2][2]==compBrainvalue))   ) {
			
			System.out.println("button2_1 Is In");
			Autochecking(button2_1);
			compBrainvalue=3;
			
		}

	}
	
	
	if ((object.array[0][2]==object.array[1][2]) || (object.array[2][0]==object.array[2][1]) ||(object.array[0][0]==object.array[1][1]) && button2_2.getText().equals("") ) {
		
		if ((object.array[0][2]==object.array[1][2]) &&   ( (object.array[0][2]==compBrainvalue || object.array[0][2]==compBrainvalue)&& (object.array[1][2]==compBrainvalue||object.array[1][2]==compBrainvalue))   ) {
			
			System.out.println("button2_2 Is In");
			Autochecking(button2_2);
			compBrainvalue=3;
			
		}
		
		else if ((object.array[2][0]==object.array[2][1]) &&   ( (object.array[2][0]==compBrainvalue || object.array[2][0]==compBrainvalue)&& (object.array[2][1]==compBrainvalue||object.array[2][1]==compBrainvalue))   ) {
			
			System.out.println("button2_2 Is In");
			Autochecking(button2_2);
			compBrainvalue=3;
			
		}
		
		else if ((object.array[0][0]==object.array[1][1]) &&   ( (object.array[0][0]==compBrainvalue || object.array[0][0]==compBrainvalue)&& (object.array[1][1]==compBrainvalue||object.array[1][1]==compBrainvalue))   ) {
			
			System.out.println("button2_2 Is In");
			Autochecking(button2_2);
			compBrainvalue=3;
			
		}
		

	}
	
	if (compBrainvalue==1 ||compBrainvalue==2) {
		System.out.println("trying to connect autoplay");
		AutoPlay();
		
	}
	

	
	
	
	
	
	
	
}


public void CompBrainHard() {
	
	System.out.println("COMPBRAIN HARD");
	System.out.println("default value is : "+defaultValue);
	System.out.println("HARD Comp Brain value is : "+antycompbrainvalue);
	System.out.println("lvl button is :"+lvlbutton);

//	if (lvlbutton==3 && button1_1.getText().equals("") ) {
//		
//		if (button1_1.getText().equals("")) {
//			
//			System.out.println("Extra Ordinary button1_1 Is In");
//			Autochecking(button1_1);
//			compBrainvalue=3;
//			//lvlbutton=2;
//				
//				
//			}
//		
//	}
	
if((object.array[1][1]==1)&& ( (object.array[0][0]==0)&&(object.array[0][1]==0)&&(object.array[0][2]==0)&&(object.array[1][0]==0)&&(object.array[1][2]==0)&&(object.array[2][0]==0)&&(object.array[2][1]==0)&&(object.array[2][2]==0)))
{
	random = Rnumber.nextInt(4);
	buttonNumber = random;
	
	if (buttonNumber==0) {
		System.out.println("button0 Is In");
		Autochecking(button0);
		compBrainvalue=3;
	} 
	else if(buttonNumber==1) {
		System.out.println("button0 Is In");
		Autochecking(button0_2);
		compBrainvalue=3;
	}
	else if(buttonNumber==2) {
		System.out.println("button0 Is In");
		Autochecking(button2);
		compBrainvalue=3;
	}
	else if(buttonNumber==3) {
		System.out.println("button0 Is In");
		Autochecking(button2_2);
		compBrainvalue=3;
	}

}

if((object.array[1][1]==0)&& ( (object.array[0][0]==1)||(object.array[0][1]==1)||(object.array[0][2]==1)||(object.array[1][0]==1)||(object.array[1][2]==1)||(object.array[2][0]==1)||(object.array[2][1]==1)||(object.array[2][2]==1)))
{
	System.out.println("button0 Is In");
	Autochecking(button1_1);
	compBrainvalue=3;

}


if (  ((object.array[0][1]==object.array[0][2]) || (object.array[1][0]==object.array[2][0]) ||(object.array[1][1]==object.array[2][2])) && button0.getText().equals("") ) {
	
		System.out.println("[1][1] = "+object.array[1][1]);
		
	if ((object.array[0][1]==object.array[0][2]) &&   ( (object.array[0][1]==antycompbrainvalue || object.array[0][1]==antycompbrainvalue)&& (object.array[0][2]==antycompbrainvalue||object.array[0][2]==antycompbrainvalue))  && button0.getText().equals("")  ) {
		
		System.out.println("button0 Is In");
		Autochecking(button0);
		compBrainvalue=3;
		
		
	}
	else if ((object.array[1][0]==object.array[2][0]) &&   ( (object.array[1][0]==antycompbrainvalue || object.array[1][0]==antycompbrainvalue)&& (object.array[2][0]==antycompbrainvalue||object.array[2][0]==antycompbrainvalue))   && button0.getText().equals("") ) {
		
		System.out.println("button0 Is In");
		Autochecking(button0);
		compBrainvalue=3;
		
	}
	else if ((object.array[1][1]==object.array[2][2]) &&   ( (object.array[1][1]==antycompbrainvalue || object.array[1][1]==antycompbrainvalue)&& (object.array[2][2]==antycompbrainvalue||object.array[2][2]==antycompbrainvalue))  && button0.getText().equals("")  ) {
		
		System.out.println("button0 Is In");
		Autochecking(button0);
		compBrainvalue=3;
		
	}
	
	
	
}

if ((object.array[0][0]==object.array[0][2]) || (object.array[1][1]==object.array[2][1]) && button0_1.getText().equals("") ) {
	
	if ((object.array[0][0]==object.array[0][2]) &&   ( (object.array[0][0]==antycompbrainvalue || object.array[0][0]==antycompbrainvalue)&& (object.array[0][2]==antycompbrainvalue||object.array[0][2]==antycompbrainvalue))  && button0_1.getText().equals("")   ) {
		
		System.out.println("button0_1 Is In");
		Autochecking(button0_1);
		compBrainvalue=3;
		
	}
	else if ((object.array[1][1]==object.array[2][1]) &&   ( (object.array[1][1]==antycompbrainvalue || object.array[1][1]==antycompbrainvalue)&& (object.array[2][1]==antycompbrainvalue||object.array[2][1]==antycompbrainvalue))   && button0_1.getText().equals("")  ) {
		
		System.out.println("button0_1 Is In");
		Autochecking(button0_1);
		compBrainvalue=3;
		
	}
	

}

if ((object.array[0][0]==object.array[0][1]) || (object.array[1][2]==object.array[2][2]) ||(object.array[2][0]==object.array[1][1]) && button0_2.getText().equals("")) {
	
	System.out.println("wrong");
	if ((object.array[0][0]==object.array[0][1]) &&   ( (object.array[0][0]==antycompbrainvalue || object.array[0][0]==antycompbrainvalue)&& (object.array[0][1]==antycompbrainvalue||object.array[0][1]==antycompbrainvalue))   && button0_2.getText().equals("")  ) {
		
		System.out.println("button0_2 Is In");
		System.out.println("0,0");
		Autochecking(button0_2);
		compBrainvalue=3;
		
	}
	
	else if ((object.array[1][2]==object.array[2][2]) &&   ( (object.array[1][2]==antycompbrainvalue || object.array[1][2]==antycompbrainvalue)&& (object.array[2][2]==antycompbrainvalue||object.array[2][2]==antycompbrainvalue))  && button0_2.getText().equals("")   ) {
		
		System.out.println("button0_2 Is In");
		System.out.println("1,2");
		Autochecking(button0_2);
		compBrainvalue=3;
		
	}
	else if ((object.array[2][0]==object.array[1][1]) &&   ( (object.array[2][0]==antycompbrainvalue || object.array[2][0]==antycompbrainvalue)&& (object.array[1][1]==antycompbrainvalue||object.array[1][1]==antycompbrainvalue)) && button0_2.getText().equals("")  ) {
		
		System.out.println("button0_2 Is In");						// xtra part is  here ? why this kolabhery above :(
		System.out.println("2,0");
		Autochecking(button0_2);
		compBrainvalue=3;
		
	}
	

}


//2nd Row Start  ...... 
if (((object.array[0][0]==object.array[2][0]) || (object.array[1][1]==object.array[1][2])) && button1.getText().equals("")) {
	
	if ((object.array[0][0]==object.array[2][0]) &&   ( (object.array[0][0]==antycompbrainvalue || object.array[0][0]==antycompbrainvalue)&& (object.array[2][0]==antycompbrainvalue||object.array[2][0]==antycompbrainvalue))  && button1.getText().equals("")  ) {
		
		System.out.println("button1 Is In");
		Autochecking(button1);
		compBrainvalue=3;
		
	}
	
	else if ((object.array[1][1]==object.array[1][2]) &&   ( (object.array[1][1]==antycompbrainvalue || object.array[1][1]==antycompbrainvalue)&& (object.array[1][2]==antycompbrainvalue||object.array[1][2]==antycompbrainvalue))  && button1.getText().equals("")  ) {
		
		System.out.println("button1 Is In");
		Autochecking(button1);
		compBrainvalue=3;
		
	}

}

if (  ((object.array[1][0]==object.array[1][2]) || (object.array[0][1]==object.array[2][1])||(object.array[2][0]==object.array[0][2])||(object.array[0][0]==object.array[2][2])) && button1_1.getText().equals("")) {
	
	
	if ((object.array[1][0]==object.array[1][2]) &&   ( (object.array[1][0]==antycompbrainvalue || object.array[1][0]==antycompbrainvalue)&& (object.array[1][2]==antycompbrainvalue||object.array[1][2]==antycompbrainvalue))  && button1_1.getText().equals("")  ) {
		
		System.out.println("button1_1 Is In");
		Autochecking(button1_1);
		compBrainvalue=3;
		
	}
	
	else if ((object.array[0][1]==object.array[2][1]) &&   ( (object.array[0][1]==antycompbrainvalue || object.array[0][1]==antycompbrainvalue)&& (object.array[2][1]==antycompbrainvalue||object.array[2][1]==antycompbrainvalue))  && button1_1.getText().equals("")  ) {
		
		System.out.println("button1_1 Is In");
		Autochecking(button1_1);
		compBrainvalue=3;
		
	}		
	
	else if ((object.array[2][0]==object.array[0][2]) &&   ( (object.array[2][0]==antycompbrainvalue || object.array[2][0]==antycompbrainvalue)&& (object.array[0][2]==antycompbrainvalue||object.array[0][2]==antycompbrainvalue))   && button1_1.getText().equals("") ) {
		
		System.out.println("button1_1 Is In");
		Autochecking(button1_1);
		compBrainvalue=3;
		
	}
	else if ((object.array[0][0]==object.array[2][2]) &&   ( (object.array[0][0]==antycompbrainvalue || object.array[0][0]==antycompbrainvalue)&& (object.array[2][2]==antycompbrainvalue||object.array[2][2]==antycompbrainvalue))  && button1_1.getText().equals("")  ) {
		
		System.out.println("button1_1 Is In");
		Autochecking(button1_1);
		compBrainvalue=3;
		
	}
	
	

}

if (   ((object.array[0][2]==object.array[2][2]) || (object.array[1][0]==object.array[1][1])) && button1_2.getText().equals("") ) {
	
	if ((object.array[0][2]==object.array[2][2]) &&   ( (object.array[0][2]==antycompbrainvalue || object.array[0][2]==antycompbrainvalue)&& (object.array[2][2]==antycompbrainvalue||object.array[2][2]==antycompbrainvalue))  && button1_2.getText().equals("")  ) {
		
		System.out.println("button1_2 Is In");
		Autochecking(button1_2);
		compBrainvalue=3;
		
	}
	
	else if ((object.array[1][0]==object.array[1][1]) &&   ( (object.array[1][0]==antycompbrainvalue || object.array[1][0]==antycompbrainvalue)&& (object.array[1][1]==antycompbrainvalue||object.array[1][1]==antycompbrainvalue))  && button1_2.getText().equals("")  ) {
		
		System.out.println("button1_2 Is In");
		Autochecking(button1_2);
		compBrainvalue=3;
		
	}
	

}

// 3rd row  start .....

if ((object.array[0][0]==object.array[1][0]) || (object.array[2][1]==object.array[2][2]) ||(object.array[0][2]==object.array[1][1]) && button2.getText().equals("")) {
	
	
	if ((object.array[0][0]==object.array[1][0]) &&   ( (object.array[0][0]==antycompbrainvalue || object.array[0][0]==antycompbrainvalue)&& (object.array[1][0]==antycompbrainvalue||object.array[1][0]==antycompbrainvalue)) && button2.getText().equals("")   ) {
		
		System.out.println("button2 Is In");
		Autochecking(button2);
		compBrainvalue=3;
		
	}
	
	else if ((object.array[2][1]==object.array[2][2]) &&   ( (object.array[2][1]==antycompbrainvalue || object.array[2][1]==antycompbrainvalue)&& (object.array[2][2]==antycompbrainvalue||object.array[2][2]==antycompbrainvalue)) && button2.getText().equals("")  ) {
		
		System.out.println("button2 Is In");
		Autochecking(button2);
		compBrainvalue=3;
		
	}
	else if ((object.array[0][2]==object.array[1][1]) &&   ( (object.array[0][2]==antycompbrainvalue || object.array[0][2]==antycompbrainvalue)&& (object.array[1][1]==antycompbrainvalue||object.array[1][1]==antycompbrainvalue)) && button2.getText().equals("")  ) {
		
		System.out.println("button2 Is In");
		Autochecking(button2);
		compBrainvalue=3;
		
	}

}

if ((object.array[0][1]==object.array[1][1]) || (object.array[2][0]==object.array[2][2]) && button2_1.getText().equals("") ) {
	
	if ((object.array[0][1]==object.array[1][1]) &&   ( (object.array[0][1]==antycompbrainvalue || object.array[0][1]==antycompbrainvalue)&& (object.array[1][1]==antycompbrainvalue||object.array[1][1]==antycompbrainvalue))  && button2_1.getText().equals("")  ) {
		
		System.out.println("button2_1 Is In");
		Autochecking(button2_1);
		compBrainvalue=3;
		
	}
	
	else if ((object.array[2][0]==object.array[2][2]) &&   ( (object.array[2][0]==antycompbrainvalue || object.array[2][0]==antycompbrainvalue)&& (object.array[2][2]==antycompbrainvalue||object.array[2][2]==antycompbrainvalue))  && button2_1.getText().equals("")  ) {
		
		System.out.println("button2_1 Is In");
		Autochecking(button2_1);
		compBrainvalue=3;
		
	}

}


if ((object.array[0][2]==object.array[1][2]) || (object.array[2][0]==object.array[2][1]) ||(object.array[0][0]==object.array[1][1]) && button2_2.getText().equals("") ) {
	
	if ((object.array[0][2]==object.array[1][2]) &&   ( (object.array[0][2]==antycompbrainvalue || object.array[0][2]==antycompbrainvalue)&& (object.array[1][2]==antycompbrainvalue||object.array[1][2]==antycompbrainvalue))&& button2_2.getText().equals("")   ) {
		
		System.out.println("button2_2 Is In");
		Autochecking(button2_2);
		compBrainvalue=3;
		
	}
	
	else if ((object.array[2][0]==object.array[2][1]) &&   ( (object.array[2][0]==antycompbrainvalue || object.array[2][0]==antycompbrainvalue)&& (object.array[2][1]==antycompbrainvalue||object.array[2][1]==antycompbrainvalue))  && button2_2.getText().equals("") ) {
		
		System.out.println("button2_2 Is In");
		Autochecking(button2_2);
		compBrainvalue=3;
		
	}
	
	else if ((object.array[0][0]==object.array[1][1]) &&   ( (object.array[0][0]==antycompbrainvalue || object.array[0][0]==antycompbrainvalue)&& (object.array[1][1]==antycompbrainvalue||object.array[1][1]==antycompbrainvalue))  && button2_2.getText().equals("") ) {
		
		System.out.println("button2_2 Is In");
		Autochecking(button2_2);
		antycompbrainvalue=3;
		
	}
	

}

if (antycompbrainvalue==1 ||antycompbrainvalue==2) {
	System.out.println("trying to connect ComBrain");
	CompBrain();
	
}



}






	
	
	
	
	
	
	public void recolor()
	{
		button0.setBackground(Color.decode(boxcolor));
		button0_1.setBackground(Color.decode(boxcolor));
		button0_2.setBackground(Color.decode(boxcolor));
		button1.setBackground(Color.decode(boxcolor));
		button1_1.setBackground(Color.decode(boxcolor));
		button1_2.setBackground(Color.decode(boxcolor));
		button2.setBackground(Color.decode(boxcolor));
		button2_1.setBackground(Color.decode(boxcolor));
		button2_2.setBackground(Color.decode(boxcolor));
	}
	
	public void recolor(String buttoncolor)
	{
		button0.setBackground(Color.decode(buttoncolor));
		button0_1.setBackground(Color.decode(buttoncolor));
		button0_2.setBackground(Color.decode(buttoncolor));
		button1.setBackground(Color.decode(buttoncolor));
		button1_1.setBackground(Color.decode(buttoncolor));
		button1_2.setBackground(Color.decode(buttoncolor));
		button2.setBackground(Color.decode(buttoncolor));
		button2_1.setBackground(Color.decode(buttoncolor));
		button2_2.setBackground(Color.decode(buttoncolor));
	}
	
	
	public void draw()
	{
		play_count++;
		stackOverflowError = 0;
		
		object.firsthandscore-=1;
		object.secondhandscore-=1;
		scoreshow();
		reset=1;
		button0.setBackground(Color.gray);
		button0_1.setBackground(Color.gray);
		button0_2.setBackground(Color.gray);
		button1.setBackground(Color.gray);
		button1_1.setBackground(Color.gray);
		button1_2.setBackground(Color.gray);
		button2.setBackground(Color.gray);
		button2_1.setBackground(Color.gray);
		button2_2.setBackground(Color.gray);
	}
}





















