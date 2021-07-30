
import javax.swing.*;
import java.awt.GridBagLayout; 
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



class Gui{
    private Brain brain;

    public Gui(Brain inputBrain)
    {
      brain= inputBrain;
    }
    public void start() 
    {
    	 JFrame frame = new JFrame("BACH, Brain Analysis for Cerebrovascular Health");
    	
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //frame.setPreferredSize(new Dimension(2000, 2000));
         frame.setLayout(new GridBagLayout());
        
          
         boolean shouldFill = true;
         boolean shouldWeightX = true;
         boolean RIGHT_TO_LEFT = false;
         
         GridBagConstraints c = new GridBagConstraints();
         if (shouldFill) {
         //natural height, maximum width
         c.fill = GridBagConstraints.HORIZONTAL;
         }
      
         JButton button1 = new JButton("View");
         if (shouldWeightX) {
         c.weightx = 0.5;
         }
         c.fill = GridBagConstraints.HORIZONTAL;
         c.gridx = 0;
         c.gridy = 0;
         frame.add(button1, c);
      
         JButton button2 = new JButton("Options");
         c.fill = GridBagConstraints.HORIZONTAL;
         c.weightx = 0.5;
         c.gridx = 1;
         c.gridy = 0;
         frame.add(button2, c);
      
         JButton helpButton = new JButton("...");
         c.fill = GridBagConstraints.HORIZONTAL;
         c.weightx = 0.5;
         c.gridx = 2;
         c.gridy = 0;
         frame.add(helpButton, c);

         JButton helpButton2 = new JButton("...");
         c.fill = GridBagConstraints.HORIZONTAL;
         c.weightx = 0.5;
         c.gridx = 3;
         c.gridy = 0;
         frame.add(helpButton2, c);

         JButton helpButton3 = new JButton("...");
         c.fill = GridBagConstraints.HORIZONTAL;
         c.weightx = 0.5;
         c.gridx = 4;
         c.gridy = 0;
         frame.add(helpButton3, c);
         

      
         JButton button5 = new JButton("start");
         c.fill = GridBagConstraints.HORIZONTAL;
         c.ipady = 0;       //reset to default
         c.weighty = 1.0;   //request any extra vertical space
         c.anchor = GridBagConstraints.PAGE_END; //bottom of space
         c.insets = new Insets(10,0,0,0);  //top padding
         c.gridx = 0;       //aligned with button 2
         c.gridwidth = 3;   //2 columns wide
         c.gridy = 3;       //third row
         frame.add(button5, c);
         
         
         //newAnalysisButton.addChangeListener(new ChangeListener() {
         //@Override
         //public void stateChanged(ChangeEvent ce) {
          //  //System.out.println(((JSlider) ce.getSource()).getValue());

          //  brain.startNewBrain();
           // mainRenderingSpace.repaint();
         //}
         //});





         //Coronal interactive area----------------------------------------------------------------
             InPlaneRenderingSpace coronalRenderingSpace = new InPlaneRenderingSpace(brain, "Coronal");
             c.fill = GridBagConstraints.BOTH;
             c.ipady = 0;      //make this component tall
             c.weightx = 100000;
             c.weighty= 100000;
             c.gridwidth = 1;
             c.gridx = 1;
             c.gridy = 1;
             frame.getContentPane().add(coronalRenderingSpace,c);
             JSlider coronalSlider = new JSlider(JSlider.VERTICAL, 0,brain.getResolution()[0],brain.getResolution()[0]/2);
             c.fill = GridBagConstraints.VERTICAL;
             c.ipady = 0;       //reset to default
             c.weightx = 0.1;   //request any extra vertical space
             c.weighty = 1.0;   //request any extra vertical space
             c.anchor = GridBagConstraints.PAGE_END; //bottom of space
             c.insets = new Insets(10,0,0,0);  //top padding
             c.gridx = 0;       //aligned with button 2
             c.gridwidth = 1;   //2 columns wide
             c.gridy = 1;       //third row
             coronalSlider.addChangeListener(new ChangeListener() {
             @Override
             public void stateChanged(ChangeEvent ce) {
                //System.out.println(((JSlider) ce.getSource()).getValue());

                coronalRenderingSpace.setSlice((int)((JSlider) ce.getSource()).getValue());
                coronalRenderingSpace.repaint();
             }
             });
             frame.add(coronalSlider, c);
         //----------------------------------------------------------------

             //Axial interactive area----------------------------------------------------------------
             InPlaneRenderingSpace axialRenderingSpace = new InPlaneRenderingSpace(brain, "Axial");
             c.fill = GridBagConstraints.BOTH;
             c.ipady = 0;      //make this component tall
             c.weightx = 100000;
             c.weighty= 100000;
             c.gridwidth = 1;
             c.gridx = 3;
             c.gridy = 1;
             frame.getContentPane().add(axialRenderingSpace,c);
             JSlider axialSlider = new JSlider(JSlider.VERTICAL, 0,brain.getResolution()[0],brain.getResolution()[0]/2);
             c.fill = GridBagConstraints.VERTICAL;
             c.ipady = 0;       //reset to default
             c.weightx = 0.1;   //request any extra vertical space
             c.weighty = 1.0;   //request any extra vertical space
             c.anchor = GridBagConstraints.PAGE_END; //bottom of space
             c.insets = new Insets(10,0,0,0);  //top padding
             c.gridx = 2;       //aligned with button 2
             c.gridwidth = 1;   //2 columns wide
             c.gridy = 1;       //third row
             axialSlider.addChangeListener(new ChangeListener() {
             @Override
             public void stateChanged(ChangeEvent ce) {
                //System.out.println(((JSlider) ce.getSource()).getValue());

                axialRenderingSpace.setSlice((int)((JSlider) ce.getSource()).getValue());
                axialRenderingSpace.repaint();
             }
             });
             frame.add(axialSlider, c);
         //----------------------------------------------------------------

              //Sagittal interactive area----------------------------------------------------------------
             InPlaneRenderingSpace sagittalRenderingSpace = new InPlaneRenderingSpace(brain, "Sagittal");
             c.fill = GridBagConstraints.BOTH;
             c.ipady = 0;      //make this component tall
             c.weightx = 100000;
             c.weighty= 100000;
             c.gridwidth = 1;
             c.gridx = 1;
             c.gridy = 2;
             frame.getContentPane().add(sagittalRenderingSpace,c);
             JSlider sagittalSlider = new JSlider(JSlider.VERTICAL, 0,brain.getResolution()[0],brain.getResolution()[0]/2);
             c.fill = GridBagConstraints.VERTICAL;
             c.ipady = 0;       //reset to default
             c.weightx = 0.1;   //request any extra vertical space
             c.weighty = 1.0;   //request any extra vertical space
             c.anchor = GridBagConstraints.PAGE_END; //bottom of space
             c.insets = new Insets(10,0,0,0);  //top padding
             c.gridx = 0;       //aligned with button 2
             c.gridwidth = 1;   //2 columns wide
             c.gridy = 2;       //third row
             sagittalSlider.addChangeListener(new ChangeListener() {
             @Override
             public void stateChanged(ChangeEvent ce) {
                //System.out.println(((JSlider) ce.getSource()).getValue());

                sagittalRenderingSpace.setSlice((int)((JSlider) ce.getSource()).getValue());
                sagittalRenderingSpace.repaint();
             }
             });
             frame.add(sagittalSlider, c);

         //----------------------------------------------------------------------------------

              //3D interactive area----------------------------------------------------------------
             InPlaneRenderingSpace threeDRenderingSpace = new InPlaneRenderingSpace(brain, "Axial");
             c.fill = GridBagConstraints.BOTH;
             c.ipady = 0;      //make this component tall
             c.weightx = 100000;
             c.weighty= 100000;
             c.gridwidth = 1;
             c.gridx = 3;
             c.gridy = 2;
             frame.getContentPane().add(threeDRenderingSpace,c);
             JSlider threeDSlider = new JSlider(JSlider.VERTICAL, 0,brain.getResolution()[0],brain.getResolution()[0]/2);
             c.fill = GridBagConstraints.VERTICAL;
             c.ipady = 0;       //reset to default
             c.weightx = 0.1;   //request any extra vertical space
             c.weighty = 1.0;   //request any extra vertical space
             c.anchor = GridBagConstraints.PAGE_END; //bottom of space
             c.insets = new Insets(10,0,0,0);  //top padding
             c.gridx = 2;       //aligned with button 2
             c.gridwidth = 1;   //2 columns wide
             c.gridy = 2;       //third row
             threeDSlider.addChangeListener(new ChangeListener() {
             @Override
             public void stateChanged(ChangeEvent ce) {
                //System.out.println(((JSlider) ce.getSource()).getValue());

                threeDRenderingSpace.setSlice((int)((JSlider) ce.getSource()).getValue());
                threeDRenderingSpace.repaint();
             }
             });
             frame.add(threeDSlider, c);
            //----------------------------------------------------------------






         //Display the window.
         frame.pack();
         frame.setVisible(true);
         frame.setSize(800,600);
         
    }     
}
    
    
    
    



















