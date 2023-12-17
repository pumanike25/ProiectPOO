package com.mycompany.imobiliareproiect;

public class ProGuiTerenAgricol extends javax.swing.JFrame {

    private TerenAgricol[] terAg;
    public ProGuiTerenAgricol(TerenAgricol[] terAg) {
        initComponents();
        this.terAg=terAg;
        afisareTerenuriAg();
    }

    private void afisareTerenuriAg()
    {
        // Iterează prin vectorul de terenuri și adaugă informațiile în JTextArea
        for (TerenAgricol ta : terAg) {
            if (ta!= null) {
                textAreaTerenuriAg.append(ta.toString() + "\n");
                textAreaTerenuriAg.append("\n");
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaTerenuriAg = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textAreaTerenuriAg.setColumns(20);
        textAreaTerenuriAg.setRows(5);
        jScrollPane1.setViewportView(textAreaTerenuriAg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crearea unui vector de terenuri
                TerenAgricol[] terenuri = new TerenAgricol[10];
                // Inițializați vectorul aici cu obiecte TerenConstructii
                // ...

                // Crearea și afișarea ferestrei ProGui2
                new ProGuiTerenAgricol(terenuri).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaTerenuriAg;
    // End of variables declaration//GEN-END:variables
}
