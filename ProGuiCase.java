
package com.mycompany.imobiliareproiect;


public class ProGuiCase extends javax.swing.JFrame {

    private Case[] casee;
    
    public ProGuiCase( Case[] casee) {
        initComponents();
        this.casee=casee;
        afisareCase();
    }

    private void afisareCase()
    {
        // Iterează prin vectorul de terenuri și adaugă informațiile în JTextArea
        for (Case c : casee) {
            if (c!= null) {
                textAreaCase.append(c.toString() + "\n");
                textAreaCase.append("\n");
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaCase = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textAreaCase.setColumns(20);
        textAreaCase.setRows(5);
        jScrollPane1.setViewportView(textAreaCase);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crearea unui vector de terenuri
                Case[] case1 = new Case[10];
                // Inițializați vectorul aici cu obiecte TerenConstructii
                // ...

                // Crearea și afișarea ferestrei ProGui2
                new ProGuiCase(case1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaCase;
    // End of variables declaration//GEN-END:variables
}
