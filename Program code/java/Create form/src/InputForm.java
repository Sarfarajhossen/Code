public class InputForm extends javax.swing.JFrame {
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JTextField tFirstName;
    private javax.swing.JTextField tLastName;

    public InputForm() {
        initComponents();
    }

    private void initComponents() {
        javax.swing.JLabel lbFirstName = new javax.swing.JLabel();
        tFirstName = new javax.swing.JTextField();
        javax.swing.JLabel lbLastName = new javax.swing.JLabel();
        tLastName = new javax.swing.JTextField();
        lbWelcome = new javax.swing.JLabel();
        javax.swing.JButton btOK = new javax.swing.JButton();
        javax.swing.JButton btClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");

        lbFirstName.setFont(new java.awt.Font("Segoe Print", 1, 14));
        lbFirstName.setText("First Name");

        tFirstName.setFont(new java.awt.Font("Segoe Print", 1, 14));

        lbLastName.setFont(new java.awt.Font("Segoe Print", 1, 14));
        lbLastName.setText("Last Name");

        tLastName.setFont(new java.awt.Font("Segoe Print", 1, 14));

        lbWelcome.setFont(new java.awt.Font("Segoe Print", 1, 14));

        btOK.setFont(new java.awt.Font("Segoe Print", 1, 14));
        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        btClear.setFont(new java.awt.Font("Segoe Print", 1, 14));
        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tFirstName)
                    .addComponent(tLastName)
                    .addComponent(lbWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btClear))
                            .addComponent(lbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 352, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLastName)
                .addGap(18, 18, 18)
                .addComponent(tLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOK)
                    .addComponent(btClear))
                .addContainerGap())
        );
        pack();
    }

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {
        String firstName = tFirstName.getText();
        String lastName = tLastName.getText();
        lbWelcome.setText("Hello " + firstName + " " + lastName);
    }

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {
        tFirstName.setText("");
        tLastName.setText("");
        lbWelcome.setText("");
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputForm().setVisible(true);
            }
        });
    }
}
