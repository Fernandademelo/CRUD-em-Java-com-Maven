
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Fernanda Melo
 */
public class Principal extends javax.swing.JFrame {

    public Connection conn = null;
    public Statement stmt;
    public ResultSet rs;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        Abas.setEnabledAt(1, false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Abas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSigla = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(216, 237, 237));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);
        jPanel3.add(txtSenha);
        txtSenha.setBounds(130, 140, 150, 30);

        jButton1.setText("Entre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(170, 180, 59, 23);
        jPanel3.add(txtLogin);
        txtLogin.setBounds(130, 70, 150, 30);

        jLabel1.setText("SENHA");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(130, 110, 60, 20);

        jLabel2.setText("LOGIN");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(130, 40, 60, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 20, 410, 250);

        Abas.addTab("Login", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));
        jPanel2.setLayout(null);
        jPanel2.add(txtSigla);
        txtSigla.setBounds(100, 30, 270, 20);
        jPanel2.add(txtNome);
        txtNome.setBounds(100, 70, 270, 20);

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(100, 110, 270, 110);

        jLabel3.setText("Sigla");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 30, 34, 14);

        jLabel4.setText("Nome");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 70, 34, 14);

        jLabel5.setText("Descrição");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 110, 50, 14);

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeletar);
        btnDeletar.setBounds(190, 240, 80, 23);

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jPanel2.add(btnInserir);
        btnInserir.setBounds(100, 240, 70, 23);

        btnAtualizar.setText("Atualizar");
        jPanel2.add(btnAtualizar);
        btnAtualizar.setBounds(290, 240, 80, 23);

        Abas.addTab("Cadastro", jPanel2);

        getContentPane().add(Abas);
        Abas.setBounds(10, 10, 470, 310);

        setBounds(0, 0, 503, 365);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String senha = new String(txtSenha.getPassword());

        if (txtLogin.getText().equals("adm") && senha.equals("123")) {
            Abas.setEnabledAt(1, true);
            Abas.setSelectedIndex(1);

        } else {
            JOptionPane.showMessageDialog(null, "Dados de Login Incorretos",
                    "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbaula4",
                    "root", "123");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "INSERT INTO curso VALUES(‘"
                    + txtSigla.getText() + "','"
                    + txtNome.getText() + "','"
                    + txtDesc.getText() + "')";
            JOptionPane.showMessageDialog(null, sql);
            int i = 0;
            i = stmt.executeUpdate(sql);//executando o comando sql    
            stmt.close();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
                //abreTabela();
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnInserirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Abas;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
