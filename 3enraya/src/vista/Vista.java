package vista;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        componentes();
    }

    private void componentes() {

        jPanel1 = new javax.swing.JPanel();
        casilla1 = new javax.swing.JButton();
        casilla2 = new javax.swing.JButton();
        casilla3 = new javax.swing.JButton();
        casilla4 = new javax.swing.JButton();
        casilla5 = new javax.swing.JButton();
        casilla6 = new javax.swing.JButton();
        casilla7 = new javax.swing.JButton();
        casilla8 = new javax.swing.JButton();
        casilla9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        casilla1.setFont(new java.awt.Font("Tahoma", 1, 36));
        casilla1.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla1);

        casilla2.setFont(new java.awt.Font("Tahoma", 1, 36));
        casilla2.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla2);

        casilla3.setFont(new java.awt.Font("Tahoma", 1, 36));
        casilla3.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla3);

        casilla4.setFont(new java.awt.Font("Tahoma", 1, 36));
        casilla4.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla4);

        casilla5.setFont(new java.awt.Font("Tahoma", 1, 36));
        casilla5.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla5);

        casilla6.setFont(new java.awt.Font("Tahoma", 1, 36));
        casilla6.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla6);

        casilla7.setFont(new java.awt.Font("Tahoma", 1, 36));
        casilla7.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla7);

        casilla8.setFont(new java.awt.Font("Tahoma", 1, 36));
        casilla8.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla8);

        casilla9.setFont(new java.awt.Font("Tahoma", 1, 36));
        casilla9.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(16, Short.MAX_VALUE)));

        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    public javax.swing.JButton casilla1;
    public javax.swing.JButton casilla2;
    public javax.swing.JButton casilla3;
    public javax.swing.JButton casilla4;
    public javax.swing.JButton casilla5;
    public javax.swing.JButton casilla6;
    public javax.swing.JButton casilla7;
    public javax.swing.JButton casilla8;
    public javax.swing.JButton casilla9;
    private javax.swing.JPanel jPanel1;
}
