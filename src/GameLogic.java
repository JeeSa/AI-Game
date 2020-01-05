import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit.CopyAction;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


public class GameLogic {
	
	int findWiner=0;
	int alert=0;
	int check,k=0;
	int firsthandscore=0,secondhandscore=0,draw=1;
	
	
	int[][] array = new int[3][3];
	int colorValue[][] = new int[3][3];
	
	public void gameLogicTest(){
		
		    for(int i=1; i<3; i++)
		    {
		        if( array[0][0]==i && array [0][1]==i && array[0][2] ==i)
		        {
		        	findWiner = i;
		        	colorValue[0][0] = 1;
		        	colorValue[0][1] = 1;
		        	colorValue[0][2] = 1;
		        }
		        else if( array[1][0]==i&& array[1][1]==i && array[1][2]==i)
		        {
		        	findWiner = i;
		        	colorValue[1][0] = 1;
		        	colorValue[1][1] = 1;
		        	colorValue[1][2] = 1;
		        }
		        else if( array[2][0]==i&& array[2][1]==i && array[2][2]==i)
		        {
		        	findWiner = i;
		        	colorValue[2][0] = 1;
		        	colorValue[2][1] = 1;
		        	colorValue[2][2] = 1;
		        }
		        else if( array[0][0]==i && array[1][0]==i && array[2][0]==i)
		        {
		        	findWiner = i;
		        	colorValue[0][0] = 1;
		        	colorValue[1][0] = 1;
		        	colorValue[2][0] = 1;
		        }
		        else if( array[0][1]==i && array[1][1]==i && array[2][1]==i)
		        {
		        	findWiner = i;
		        	colorValue[0][1] = 1;
		        	colorValue[1][1] = 1;
		        	colorValue[2][1] = 1;
		        }
		        else if( array[0][2]==i && array[1][2]==i && array[2][2]==i)
		        {
		        	findWiner = i;
		        	colorValue[0][2] = 1;
		        	colorValue[1][2] = 1;
		        	colorValue[2][2] = 1;
		        }
		        else if( array[0][0]==i && array[1][1]==i && array[2][2]==i)
		        {
		        	findWiner = i;
		        	colorValue[0][0] = 1;
		        	colorValue[1][1] = 1;
		        	colorValue[2][2] = 1;
		        }
		        else if( array[0][2]==i && array[1][1]==i && array[2][0]==i)
		        {
		        	findWiner = i;
		        	colorValue[0][2] = 1;
		        	colorValue[1][1] = 1;
		        	colorValue[2][0] = 1;
		        }
		        
		    }

		    if(findWiner ==1){
		    	
		    	k++;
		    	try {
					winningsoundplay();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		    }
	    		//JOptionPane.showMessageDialog(null, "First Hand Win");
	     
		    else if(findWiner == 2){
		    	
		    	k++;
		    	try {
					winningsoundplay();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		    }
	    	//JOptionPane.showMessageDialog(null, "Second Hand Win");
		    
		  
		
	}

	
	
	public void status(int i) {
		System.out.println("i = "+i);
		System.out.println("k = "+k);
		
		if (k<1) {
			
			if( i == 8) {
				
				try {
					drawsoundplay();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Game draw");
				draw++;
				//GameMain.count = 0;
			}
		}
		  

		
	}

	public void  soundplay() throws Exception {
	URL url = GameLogic.class.getResource("Click2.wav");
	
	AudioClip clip = Applet.newAudioClip(url);
	
	clip.play();
	
	//Thread.sleep(100);
	System.out.println("end");
	
	
}

	public void  winningsoundplay() throws Exception {
	URL url = GameLogic.class.getResource("Tadaaa.wav");
	
	AudioClip clip = Applet.newAudioClip(url);
	
	clip.play();
	
	//Thread.sleep(100);
	System.out.println("end");
	
	
}

	public void  drawsoundplay() throws Exception {
	URL url = GameLogic.class.getResource("Draw.wav");
	
	AudioClip clip = Applet.newAudioClip(url);
	
	clip.play();
	
	//Thread.sleep(100);
	System.out.println("end");
	
	
}



}
