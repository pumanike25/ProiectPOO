package com.mycompany.imobiliareproiect;

/**
 *
 * @author tusky
 */
public class ProGuiCaseDuplex extends javax.swing.JFrame {

     private CaseDuplex[] caseeduplex;
    public ProGuiCaseDuplex(CaseDuplex[] caseeduplex) {
        initComponents();
        this.caseeduplex=caseeduplex;
        afisareCase();
    }
    private void afisareCase()
    {
        // Iterează prin vectorul de terenuri și adaugă informațiile în JTextArea
        for (CaseDuplex cd : caseeduplex) {
            if (cd!= null) {
                textAreaCase.append(cd.toString2() + "\n");
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
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crearea unui vector de terenuri
                CaseDuplex[] caseduplex1 = new CaseDuplex[10];
                // Inițializați vectorul aici cu obiecte TerenConstructii
                // ...

                // Crearea și afișarea ferestrei ProGui2
                new ProGuiCaseDuplex(caseduplex1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaCase;
    // End of variables declaration//GEN-END:variables
}
