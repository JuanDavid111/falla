package vista;



import java.io.IOException;
import java.net.URISyntaxException;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.*;
import javax.swing.JOptionPane;

public class RegistroProponente extends javax.swing.JFrame {
    
    private UI_Login login;
    
    public RegistroProponente() {
        initComponents();
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(86,81,81));
        mercantilField.setVisible(false);
        jLabel10.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mercantilField = new javax.swing.JTextField();
        userField = new javax.swing.JTextField();
        ciField = new javax.swing.JTextField();
        islrField = new javax.swing.JTextField();
        rifField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmField = new javax.swing.JPasswordField();
        resumenField = new javax.swing.JTextField();
        tituloField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        enviarButton = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        juridicoButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CURSEATE");
        setBackground(new java.awt.Color(86, 81, 81));
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 100));

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel12.setText("Login | Register");

        jLabel14.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconooo.jpg"))); // NOI18N
        jLabel14.setText("Curseate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 692, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("Registro");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("User");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setText("Confirm Password");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setText("Cedula de Identidad");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel6.setText("RIF");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setText("ISLR");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel8.setText("Resumen Curricular");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setText("Titulo Universitario");

        mercantilField.setBackground(new java.awt.Color(86, 81, 81));
        mercantilField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        mercantilField.setForeground(new java.awt.Color(255, 255, 255));
        mercantilField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userField.setBackground(new java.awt.Color(86, 81, 81));
        userField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        userField.setForeground(new java.awt.Color(255, 255, 255));
        userField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        ciField.setBackground(new java.awt.Color(86, 81, 81));
        ciField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        ciField.setForeground(new java.awt.Color(255, 255, 255));
        ciField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        islrField.setBackground(new java.awt.Color(86, 81, 81));
        islrField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        islrField.setForeground(new java.awt.Color(255, 255, 255));
        islrField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rifField.setBackground(new java.awt.Color(86, 81, 81));
        rifField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        rifField.setForeground(new java.awt.Color(255, 255, 255));
        rifField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        passwordField.setBackground(new java.awt.Color(86, 81, 81));
        passwordField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        confirmField.setBackground(new java.awt.Color(86, 81, 81));
        confirmField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        confirmField.setForeground(new java.awt.Color(255, 255, 255));
        confirmField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resumenField.setBackground(new java.awt.Color(86, 81, 81));
        resumenField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        resumenField.setForeground(new java.awt.Color(255, 255, 255));
        resumenField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tituloField.setBackground(new java.awt.Color(86, 81, 81));
        tituloField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tituloField.setForeground(new java.awt.Color(255, 255, 255));
        tituloField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel10.setText("Registro Mercantil");

        enviarButton.setBackground(new java.awt.Color(86, 81, 81));
        enviarButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        enviarButton.setForeground(new java.awt.Color(255, 255, 255));
        enviarButton.setText("Enviar");
        enviarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarButton.setFocusable(false);
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });

        atrasButton.setBackground(new java.awt.Color(86, 81, 81));
        atrasButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        atrasButton.setForeground(new java.awt.Color(255, 255, 255));
        atrasButton.setText("Atras");
        atrasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atrasButton.setFocusable(false);
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Sube tus archivos :");

        jButton1.setBackground(new java.awt.Color(86, 81, 81));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aqui");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });

        juridicoButton.setBackground(new java.awt.Color(86, 81, 81));
        juridicoButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        juridicoButton.setForeground(new java.awt.Color(255, 255, 255));
        juridicoButton.setText("Natural");
        juridicoButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        juridicoButton.setBorderPainted(false);
        juridicoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        juridicoButton.setFocusPainted(false);
        juridicoButton.setFocusable(false);
        juridicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juridicoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(userField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(islrField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(rifField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(ciField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(confirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(enviarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mercantilField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(resumenField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tituloField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(29, 29, 29)))
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(juridicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jButton1))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(confirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ciField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rifField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(islrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(resumenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(juridicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(mercantilField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    link();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    public void setlogin(UI_Login login){
    this.login = login;
    }
    
    
    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
    
    if(evt.getSource() == atrasButton){
        
    login.setVisible(true);
    this.setVisible(false);
    userField.setText("");
    passwordField.setText("");
    confirmField.setText("");
    rifField.setText("");
    islrField.setText("");
    ciField.setText("");
    resumenField.setText("");
    tituloField.setText("");
    mercantilField.setText("");
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void juridicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juridicoButtonActionPerformed
        if(juridicoButton.isSelected()){
            juridicoButton.setBackground(new Color(86,81,81));
            juridicoButton.setText("Juridico");
            mercantilField.setVisible(true);
            jLabel10.setVisible(true);
        }
        else{
            juridicoButton.setText("Natural");
            juridicoButton.setBackground(new Color(86,81,81));
            mercantilField.setVisible(false);
            jLabel10.setVisible(false);
            mercantilField.setText("");
        }
    }//GEN-LAST:event_juridicoButtonActionPerformed

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
    if(evt.getSource() == enviarButton){
    String password1 = passwordField.getText();
    String password2 = confirmField.getText();
    
    if(password1.equals(password2)){
        if(!"".equals(userField.getText()) && !"".equals(rifField.getText()) && !"".equals(islrField.getText()) && !"".equals(ciField.getText()) && !"".equals(tituloField.getText()) && !"".equals(resumenField.getText())){
            if(juridicoButton.isSelected() && !"".equals(mercantilField.getText())){
        JOptionPane.showMessageDialog(this,"Registro exitoso");
        this.setVisible(false);
        UI_Login frame_a_pasar = new UI_Login();
        frame_a_pasar.setVisible(true);
        }
            else if(juridicoButton.isSelected() && "".equals(mercantilField.getText())){
            JOptionPane.showMessageDialog(this, "Datos Faltante");
            }
            
            else if(!juridicoButton.isSelected()){
            JOptionPane.showMessageDialog(this,"Registro exitoso");
            this.setVisible(false);
            UI_Login frame_a_pasar = new UI_Login();
            frame_a_pasar.setVisible(true);
            }
    } else{
        JOptionPane.showMessageDialog(this, "Datos Faltante");
        }
        
        
    }
    if(!password1.equals(password2)){
        JOptionPane.showMessageDialog(this, "Password incorrect");
    }
    
    }

    }//GEN-LAST:event_enviarButtonActionPerformed

    private void link(){

        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop computadora=java.awt.Desktop.getDesktop();
            if(computadora.isSupported(java.awt.Desktop.Action.BROWSE)){
                
               try{
                   java.net.URI link=new java.net.URI("https://drive.google.com/drive/folders/1WXbVFNa22LiJjSN5ZXmyfkUkYf9qDjLM?usp=sharing");
                   computadora.browse(link);
               }catch(IOException | URISyntaxException e){
                   
                   e.printStackTrace();
                   
               }
            
            }
            
            else {
                System.out.println("No se puede");
                System.exit(0);
            }
                
                
        }
        
        
        
    }
    
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
            java.util.logging.Logger.getLogger(RegistroProponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProponente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JTextField ciField;
    private javax.swing.JPasswordField confirmField;
    private javax.swing.JButton enviarButton;
    private javax.swing.JTextField islrField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton juridicoButton;
    private javax.swing.JTextField mercantilField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField resumenField;
    private javax.swing.JTextField rifField;
    private javax.swing.JTextField tituloField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
