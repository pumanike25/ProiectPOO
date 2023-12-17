package com.mycompany.imobiliareproiect;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class ProGui2 extends javax.swing.JFrame {

    private TerenConstructii[] terenuri;
    public ProGui2(TerenConstructii[] terenuri) {
        initComponents();
        this.terenuri = terenuri;
        afisareTerenuri();
        
        
    }

    
    
    
    private void afisareTerenuri() {
        // Iterează prin vectorul de terenuri și adaugă informațiile în JTextArea
        for (TerenConstructii teren : terenuri) {
            if (teren != null) {
                textAreaTerenuri.append(teren.toString() + "\n");
                textAreaTerenuri.append("\n");
            }
        }
         // Calea către imaginea predefinită
        String defaultImagePath = "C:\\Users\\User\\Desktop\\terenc.jpg"; // Înlocuiți cu calea reală a imaginii
        
        // Afișează imaginea predefinită în jLabel4 folosind funcția loadImage
        File defaultImageFile = new File(defaultImagePath);
        loadImage(defaultImageFile);
    }
    
    private void loadImage(File file) {
    try {
        Image img = ImageIO.read(file);
        Image scaledImg = img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        jLabel1.setIcon(new ImageIcon(scaledImg));

       // vehicul = new Vehicul(jTextField1.getText(), jTextField2.getText(), jTextField3.getText());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaTerenuri = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textAreaTerenuri.setColumns(20);
        textAreaTerenuri.setRows(5);
        jScrollPane1.setViewportView(textAreaTerenuri);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 // Crearea unui vector de terenuri
                TerenConstructii[] terenuri = new TerenConstructii[10];
                // Inițializați vectorul aici cu obiecte TerenConstructii
                // ...

                // Crearea și afișarea ferestrei ProGui2
                new ProGui2(terenuri).setVisible(true);
                
                
                
                
                
               // new ProGui2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaTerenuri;
    // End of variables declaration//GEN-END:variables
}
