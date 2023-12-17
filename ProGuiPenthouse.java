package com.mycompany.imobiliareproiect;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ProGuiPenthouse extends javax.swing.JFrame {

    private Penthouse[] pent;
    public ProGuiPenthouse(Penthouse[] pent)
    {
        initComponents();
        this.pent=pent;
        afisarePenthouse();
    }
    
    private void afisarePenthouse()
    {
        for (Penthouse pt : pent) {
            if (pt!= null) {
                textAreaPenthouse.append(pt.toString()+"\n");
                textAreaPenthouse.append("\n");
                String caleImaginePredefinita = "C:\\Users\\User\\Desktop\\penthouse.jpg"; // Înlocuiți cu calea reală a imaginii predefinite
            afisareImagine(caleImaginePredefinita);
                
            }
        }
        
    }
    private void afisareImagine(String caleImagine) {
    try {
        File imagineFisier = new File(caleImagine);
        if (!imagineFisier.exists()) {
            System.out.println("Fișierul nu există: " + caleImagine);
            return;
        }

        Image img = ImageIO.read(imagineFisier);
        Image imagineRedimensionata = img.getScaledInstance(jLabel40.getWidth(), jLabel40.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagineIcon = new ImageIcon(imagineRedimensionata);

        jLabel40.setIcon(imagineIcon);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
    


        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaPenthouse = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textAreaPenthouse.setColumns(20);
        textAreaPenthouse.setRows(5);
        jScrollPane1.setViewportView(textAreaPenthouse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(241, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ProGuiPenthouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProGuiPenthouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProGuiPenthouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProGuiPenthouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Penthouse[] penthouse=new Penthouse[10];

                // Crearea și afișarea ferestrei ProGui2
                new ProGuiPenthouse(penthouse).setVisible(true);
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel40;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaPenthouse;
    // End of variables declaration//GEN-END:variables
}
