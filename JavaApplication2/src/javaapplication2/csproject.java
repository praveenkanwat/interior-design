/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author intel
 */
public class csproject extends javax.swing.JFrame{
    
   

    /**
     * Creates new form csproject
     */
    public csproject() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpLen=jPanel1.getWidth();
        jpWid=jPanel1.getHeight();
        jpLen=Integer.parseInt(JOptionPane.showInputDialog("enter length"));
        jpWid=Integer.parseInt(JOptionPane.showInputDialog("enter width"));
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(400, 100));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1138, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(151, 11, 1140, 470);

        jScrollPane2.setBorder(null);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(100, 115));

        jPanel2.setMaximumSize(new java.awt.Dimension(495, 272));

        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jScrollPane2.setViewportView(jPanel2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 530, 600, 140);

        jLabel9.setText("welcome user123");
        jLabel9.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 81, 83, 74);

        jButton6.setText("clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(780, 580, 80, 40);

        jButton2.setText("chair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 590, 80, 25);

        jButton3.setText("sofa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 560, 80, 25);

        jButton4.setText("table");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 620, 80, 25);

        jButton5.setText("walls");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(30, 650, 80, 25);

        jButton1.setText("bed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 530, 80, 25);

        jButton7.setText("delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(870, 580, 80, 40);

        jButton8.setText("rotate");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(970, 580, 80, 40);

        jButton9.setText("scale");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(1070, 580, 80, 40);

        jButton10.setText("Save image");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(1180, 580, 100, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/background2.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, -26, 1360, 720);

        jMenu1.setText("File");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("save");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("print");
        jMenu1.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("save as");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("scale");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("2D");
        jMenu3.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("3D");
        jRadioButtonMenuItem2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonMenuItem2StateChanged(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Settings");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        Graphics2D gfx,g;
        int imageX,imageY,x=0,y=0,len=80,wid=80,k,w=0;
        int jpLen,jpWid;
        //k is for setting image value for each point on screen
        //m is for drawing image corresponding to previous click
        //w is for making walls
        
        ImageIcon jl[]=new ImageIcon[8];
        ImageIcon blueprint[]=new ImageIcon[5];
        
        int imgpos[][]=new int[1500][500];
        int imgsource[][]=new int[1500][500];
        int imgangle[][]=new int[1500][500];
        
        
        
    
    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
       
        
        
        
        
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jRadioButtonMenuItem2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem2StateChanged

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        x=1;
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        y=1;
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        y=1;
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       y=1;
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        y=1;
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if (k==4){
            w++;
            if(w==2){
                gfx=(Graphics2D) jPanel1.getGraphics();
                gfx.drawLine(imageX, imageY, evt.getX(), evt.getY());
                w=0;
            }
            
        }
        imageX=evt.getX();
        imageY=evt.getY();
        
        if(y==1&&k!=4){
            
            gfx= (Graphics2D) jPanel1.getGraphics();
            gfx.drawImage(blueprint[k].getImage(), imageX, imageY, rootPane);
            y=0;
            for(int i=1;i<len;i++){
                for(int j=1;j<wid;j++){
                    imgpos[imageX+i][imageY+j]=1;
                    imgsource[imageX+i][imageY+j]=k;
                    imgangle[imageX+i][imageY+j]=0;
                }
            }
            
            for (int i=0;i<len;i++){
                imgpos[imageX+i][imageY]=2;
            }
            for (int j=0;j<len;j++){
                imgpos[imageX][imageY+j]=2;
            }
            
        }
        
            
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
         if(x==1 && imgpos[imageX][imageY]==1){    
                gfx = (Graphics2D) jPanel1.getGraphics();
                int ix=0,iy=0;
                
                for(int i=0;i<len;i++){
                    if(imgpos[imageX-i][imageY]==2){ix=imageX-i;break;}
                }
                for(int j=0;j<wid;j++){
                    if(imgpos[imageX][imageY-j]==2){iy=imageY-j;break;}
                }
                
             
                int m=imgsource[imageX][imageY];
                for(int i=0;i<len;i++){
                    for(int j=0;j<wid;j++){
                    imgpos[ix+i][iy+j]=0;
                    imgsource[ix+i][iy+j]=0;
                    }
                }
                
                imageX=evt.getX();
                imageY=evt.getY();
                
                
                BufferedImage bi=new BufferedImage(len,wid,BufferedImage.TYPE_INT_ARGB);
                g=(Graphics2D) bi.getGraphics();
                AffineTransform atin= new AffineTransform();
                atin.rotate(imgangle[ix][iy]*3.14/180, len/2, wid/2);
                g.drawImage(blueprint[m].getImage(),atin , this);
        
                gfx.clearRect(ix, iy, len, wid);
                gfx.drawImage(bi, null, imageX, imageY);
                
                
                
                x=0;
                for(int i=0;i<len;i++){
                    for(int j=0;j<wid;j++){
                    imgpos[imageX+i][imageY+j]=1;
                    imgsource[imageX+i][imageY+j]=m;
                    imgangle[imageX+i][imageY+j]=imgangle[ix][iy];
                    }
                }
            
                for (int i=0;i<len;i++){
                imgpos[imageX+i][imageY]=2;
                }
                for (int j=0;j<len;j++){
                imgpos[imageX][imageY+j]=2;
                }
                
                
                
              
           
         }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       
        
        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        
    }//GEN-LAST:event_jPanel1MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        y=1;
        
    }//GEN-LAST:event_jLabel5MouseClicked
 
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        y=1;
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        y=1;
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        y=1;
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        imageX=evt.getX();
        imageY=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        gfx=(Graphics2D) jPanel1.getGraphics();
        gfx.clearRect(0, 0, 1500, 500);
        for(int i=0;i<1500;i++){
            for(int j=0;j<500;j++){
                imgpos[i][j]=0;
                imgsource[i][j]=0;
                imgangle[i][j]=0;
            }
        }
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int ix=0,iy=0;
                
        for(int i=0;i<len;i++){
            if(imgpos[imageX-i][imageY]==2){ix=imageX-i;break;}
        }
        for(int j=0;j<wid;j++){
            if(imgpos[imageX][imageY-j]==2){iy=imageY-j;break;}
        }
        gfx=(Graphics2D)jPanel1.getGraphics();
        gfx.clearRect(ix, iy, len, wid);
        for(int i=0;i<len;i++){
            for(int j=0;j<wid;j++){
                imgpos[ix+i][iy+j]=0;
                imgsource[ix+i][iy+j]=0;
            }
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
        String filename;
        filename=JOptionPane.showInputDialog("create file");
        
        Point p[]=new Point[50];
        
        int k=0;
        for(int j=0;j<500;j++){
            for(int i=0;i<1500;i++){
                if(imgpos[i][j]==2 && imgpos[i-1][j]!=2){
                    p[k].x=i;
                    p[k].y=j;
                    k++;
                    i=i+len-1;
                }
            
            }
        }
        
        try { 
            File f=new File("imgdata50.txt");
            BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
            
            for(int i=0;i<=k;i++){
                bw.write(Integer.toString(imgsource[p[i].x][p[i].y]));
                bw.write(Integer.toString(imgangle[p[i].x][p[i].y]));
                bw.write(Integer.toString(p[i].x));
                bw.write(Integer.toString(p[i].y));
                bw.newLine();
            }
            
            bw.close();
            
        } catch (IOException ex) {
            System.out.println("error");
        }
        BufferedImage bi=new BufferedImage(jPanel1.getHeight(),jPanel1.getWidth(),BufferedImage.TYPE_INT_ARGB);
        Graphics gfinal = bi.createGraphics();
        jPanel1.paint(gfinal);
        
        try {
            ImageIO.write(bi, "jpg", new File(filename));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String angle=JOptionPane.showInputDialog("by how many degrees");
        Integer.parseInt(angle);
        int ix=0,iy=0;
                
        for(int i=0;i<len;i++){
            if(imgpos[imageX-i][imageY]==2){ix=imageX-i;break;}
        }
        for(int j=0;j<wid;j++){
            if(imgpos[imageX][imageY-j]==2){iy=imageY-j;break;}
        }
        
        gfx=(Graphics2D)jPanel1.getGraphics();
        BufferedImage bi=new BufferedImage(len,wid,BufferedImage.TYPE_INT_ARGB);
        g=(Graphics2D) bi.getGraphics();
        AffineTransform atin= new AffineTransform();
        atin.rotate(imgangle[imageX][imageY]*3.14/180, len/2, wid/2);
        g.drawImage(blueprint[imgsource[imageX][imageY]].getImage(),atin , this);
        
        
        AffineTransform at= new AffineTransform();
        at.rotate(Integer.parseInt(angle)*3.14/180, len/2, wid/2);
        AffineTransformOp op = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
        
        gfx.clearRect(ix, iy, len, wid);
        gfx.drawImage(bi, op, ix, iy);
        
        for(int i=0;i<len;i++){
            for(int j=0;j<wid;j++){
                imgangle[ix+i][iy+j]+=Integer.parseInt(angle);
            }
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String scale=JOptionPane.showInputDialog("by what factor");
        Integer.parseInt(scale);
        int ix=0,iy=0;
                
        for(int i=0;i<len;i++){
            if(imgpos[imageX-i][imageY]==2){ix=imageX-i;break;}
        }
        for(int j=0;j<wid;j++){
            if(imgpos[imageX][imageY-j]==2){iy=imageY-j;break;}
        }
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jl[0]=new ImageIcon(getClass().getResource("bed/bed1.jpg"));
        jl[1]=new ImageIcon(getClass().getResource("bed/bed2.png"));
        jl[2]=new ImageIcon(getClass().getResource("bed/bed3.jpg"));
        jl[3]=new ImageIcon(getClass().getResource("bed/bed4.jpg"));
        jl[4]=new ImageIcon(getClass().getResource("bed/bed5.jpg"));
        jl[5]=new ImageIcon(getClass().getResource("bed/bed6.jpg"));
        jl[6]=new ImageIcon(getClass().getResource("bed/bed7.jpg"));

        jLabel1.setIcon(jl[0]);
        jLabel2.setIcon(jl[1]);
        jLabel3.setIcon(jl[2]);
        jLabel4.setIcon(jl[3]);
        jLabel5.setIcon(jl[4]);
        jLabel6.setIcon(jl[5]);
        jLabel7.setIcon(jl[6]);

        k=0;
        blueprint[0]=new ImageIcon(getClass().getResource("bed/bedskt.jpg"));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jl[0]=new ImageIcon(getClass().getResource("walls/line1.jpg"));
        jl[1]=new ImageIcon(getClass().getResource("walls/line2.jpg"));
        jl[2]=new ImageIcon(getClass().getResource("walls/line3.jpg"));
        jLabel1.setIcon(jl[0]);
        jLabel2.setIcon(jl[1]);
        jLabel3.setIcon(jl[2]);
        jLabel4.setIcon(null);
        jLabel5.setIcon(null);
        jLabel6.setIcon(null);
        jLabel7.setIcon(null);
        jLabel8.setIcon(null);

        k=4;w=0;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jl[0]=new ImageIcon(getClass().getResource("table/table1.jpg"));
        jl[1]=new ImageIcon(getClass().getResource("table/table2.jpg"));
        jl[2]=new ImageIcon(getClass().getResource("table/table3.jpg"));
        jl[3]=new ImageIcon(getClass().getResource("table/table4.jpg"));
        jl[4]=new ImageIcon(getClass().getResource("table/table5.jpg"));

        jLabel1.setIcon(jl[0]);
        jLabel2.setIcon(jl[1]);
        jLabel3.setIcon(jl[2]);
        jLabel4.setIcon(jl[3]);
        jLabel5.setIcon(jl[4]);
        jLabel6.setIcon(null);
        jLabel7.setIcon(null);
        jLabel8.setIcon(null);

        k=3;
        blueprint[3]=new ImageIcon(getClass().getResource("table/tableskt.jpg"));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jl[0]=new ImageIcon(getClass().getResource("sofa/sofa1.jpg"));
        jl[1]=new ImageIcon(getClass().getResource("sofa/sofa2.jpg"));
        jl[2]=new ImageIcon(getClass().getResource("sofa/sofa3.jpg"));
        jl[3]=new ImageIcon(getClass().getResource("sofa/sofa4.jpg"));
        jl[4]=new ImageIcon(getClass().getResource("sofa/sofa5.jpg"));
        jl[5]=new ImageIcon(getClass().getResource("sofa/sofa6.jpg"));
        jl[6]=new ImageIcon(getClass().getResource("sofa/sofa7.jpg"));
        jl[7]=new ImageIcon(getClass().getResource("sofa/sofa8.jpg"));

        jLabel1.setIcon(jl[0]);
        jLabel2.setIcon(jl[1]);
        jLabel3.setIcon(jl[2]);
        jLabel4.setIcon(jl[3]);
        jLabel5.setIcon(jl[4]);
        jLabel6.setIcon(jl[5]);
        jLabel7.setIcon(jl[6]);
        jLabel8.setIcon(jl[7]);

        k=2;
        blueprint[2]=new ImageIcon(getClass().getResource("sofa/sofaskt.jpg"));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jl[0]=new ImageIcon(getClass().getResource("chair/chair1.jpg"));
        jl[1]=new ImageIcon(getClass().getResource("chair/chair2.jpg"));
        jl[2]=new ImageIcon(getClass().getResource("chair/chair3.jpg"));
        jl[3]=new ImageIcon(getClass().getResource("chair/chair4.jpg"));
        jl[4]=new ImageIcon(getClass().getResource("chair/chair5.jpg"));
        jl[5]=new ImageIcon(getClass().getResource("chair/chair6.jpg"));
        jl[6]=new ImageIcon(getClass().getResource("chair/chair7.jpg"));
        jl[7]=new ImageIcon(getClass().getResource("chair/chair8.jpg"));

        jLabel1.setIcon(jl[0]);
        jLabel2.setIcon(jl[1]);
        jLabel3.setIcon(jl[2]);
        jLabel4.setIcon(jl[3]);
        jLabel5.setIcon(jl[4]);
        jLabel6.setIcon(jl[5]);
        jLabel7.setIcon(jl[6]);
        jLabel8.setIcon(jl[7]);

        k=1;
        blueprint[1]=new ImageIcon(getClass().getResource("chair/chairskt.jpg"));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      
          
      
    }//GEN-LAST:event_jButton10ActionPerformed
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(csproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(csproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(csproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(csproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new csproject().setVisible(true);
                
            }
        });

    }

   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    

}
