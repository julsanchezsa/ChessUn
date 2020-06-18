package ChessUN;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Graphics;

public class ComoJugar extends javax.swing.JFrame {

    public ComoJugar() {
        Fondo p = new Fondo(false);
        
        setContentPane(p);
        initComponents();
        buttonGroup1.add(jR_desayuno);
        buttonGroup1.add(jR_almuerzo);
        buttonGroup1.add(jR_cena);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        list1 = new java.awt.List();
        jB_atras = new javax.swing.JButton();
        jR_desayuno = new javax.swing.JRadioButton();
        jR_almuerzo = new javax.swing.JRadioButton();
        jR_cena = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ganar peso");
        setPreferredSize(new java.awt.Dimension(810, 480));
        setResizable(false);

        jB_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/atras.png"))); // NOI18N
        jB_atras.setBorder(null);
        jB_atras.setBorderPainted(false);
        jB_atras.setContentAreaFilled(false);
        jB_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_atrasActionPerformed(evt);
            }
        });

        jR_desayuno.setText("Torre");
        jR_desayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_desayunoActionPerformed(evt);
            }
        });

        jR_almuerzo.setText("Peon");
        jR_almuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_almuerzoActionPerformed(evt);
            }
        });

        jR_cena.setText("Reina");
        jR_cena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_cenaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/flaca.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jB_atras))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(564, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jR_almuerzo)
                        .addComponent(jR_cena))
                    .addComponent(jR_desayuno, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jR_desayuno)
                        .addGap(18, 18, 18)
                        .addComponent(jR_almuerzo)
                        .addGap(18, 18, 18)
                        .addComponent(jR_cena))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jB_atras))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_atrasActionPerformed
        this.setVisible(false);
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_jB_atrasActionPerformed

    private void jR_desayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_desayunoActionPerformed
        
        try{
            desayuno1 d=new desayuno1();
            if(jR_desayuno.isSelected())
            {
                d.setVisible(true);
                this.setVisible(false);
            }
            
        
        }catch(Exception e){}
    }//GEN-LAST:event_jR_desayunoActionPerformed

    private void jR_almuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_almuerzoActionPerformed
      
        try
        {if(jR_almuerzo.isSelected())
        {
           almuerzo1 a=new almuerzo1();
           a.setVisible(true);
           this.setVisible(false);
        }}catch(Exception e){}
    }//GEN-LAST:event_jR_almuerzoActionPerformed

    private void jR_cenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_cenaActionPerformed
        
        try
        {if(jR_cena.isSelected()){
            cena1 c=new cena1();
            c.setVisible(true);
            this.setVisible(false);
        }
        }catch(Exception e){}
    }//GEN-LAST:event_jR_cenaActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComoJugar().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jB_atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JRadioButton jR_almuerzo;
    private javax.swing.JRadioButton jR_cena;
    private javax.swing.JRadioButton jR_desayuno;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables

}