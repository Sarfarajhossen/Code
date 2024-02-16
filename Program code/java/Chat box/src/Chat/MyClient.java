package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient extends javax.swing.JFrame {
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dos;
    /**
     * Creates new form MyClient
     */
    public MyClient() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        MsgArea = new javax.swing.JTextArea();
        MsgText = new javax.swing.JTextField();
        MsgSend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        MsgArea.setColumns(20);
        MsgArea.setRows(5);
        jScrollPane1.setViewportView(MsgArea);
        MsgText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MsgSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MsgSend.setText("Send");
        MsgSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MsgSendActionPerformed(evt);
            }
        });
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Client");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(MsgText, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MsgSend, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MsgText)
                    .addComponent(MsgSend, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>
    private void MsgSendActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try{
            String msg = "";
            msg = MsgText.getText();
            dos.writeUTF(msg);
            MsgText.setText("");
        }catch(Exception e)
        {
            // handles exception
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyClient().setVisible(true);
            }
        });
        try {
            String msgin = "";
            s = new Socket("127.0.0.1",1201);
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
            while (!msgin.equals("exit")) {
                msgin = dis.readUTF();
                MsgArea.setText(MsgArea.getText() + "\n Server : " + msgin);
            }
        } catch (Exception e) {
            // handle exception
        }
    }
    // Variables declaration - do not modify
    private static javax.swing.JTextArea MsgArea;
    private javax.swing.JButton MsgSend;
    private javax.swing.JTextField MsgText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
