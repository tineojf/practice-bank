package entregable.gui;

import entregable.logic.Persona;
import entregable.logic.Tools;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Display extends javax.swing.JFrame {
    
    private final Persona usuario;
    
    public Display(Persona _usuario) {
        this.usuario = _usuario;
        
        initComponents();

        // Load data name
        lbWelcome.setText("Bienvenido, " + this.usuario.getNombre().toUpperCase());
        
        this.desactivarModalInput();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitle = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        lbWelcome = new javax.swing.JLabel();
        panelOptions = new javax.swing.JPanel();
        containerOptions = new javax.swing.JScrollPane();
        listOptions = new javax.swing.JList<>();
        btnOption = new javax.swing.JButton();
        panelOperation = new javax.swing.JPanel();
        lbSaldoTitle = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        lbOperacion = new javax.swing.JLabel();
        fieldOperation = new javax.swing.JTextField();
        modalOperation = new javax.swing.JLabel();
        btnOperation = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lbNombreTitle = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelTitle.setBackground(new java.awt.Color(242, 220, 93));

        btnLogout.setBackground(new java.awt.Color(165, 1, 4));
        btnLogout.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorderPainted(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lbWelcome.setFont(new java.awt.Font("Nimbus Roman", 1, 36)); // NOI18N
        lbWelcome.setForeground(new java.awt.Color(43, 6, 30));
        lbWelcome.setText("Bienvenido, ");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        panelOptions.setBackground(new java.awt.Color(238, 252, 238));

        containerOptions.setBorder(null);

        listOptions.setBackground(new java.awt.Color(238, 252, 238));
        listOptions.setBorder(null);
        listOptions.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        listOptions.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. Consulta", "2. Retiro", "3. Deposito", "4. Salir" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listOptions.setFocusable(false);
        containerOptions.setViewportView(listOptions);

        btnOption.setBackground(new java.awt.Color(14, 64, 45));
        btnOption.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnOption.setForeground(new java.awt.Color(255, 255, 255));
        btnOption.setText("Seleccionar");
        btnOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOptionsLayout = new javax.swing.GroupLayout(panelOptions);
        panelOptions.setLayout(panelOptionsLayout);
        panelOptionsLayout.setHorizontalGroup(
            panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOptionsLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOption)
                    .addComponent(containerOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        panelOptionsLayout.setVerticalGroup(
            panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOptionsLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(containerOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOption, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOperation.setBackground(new java.awt.Color(250, 241, 240));

        lbSaldoTitle.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbSaldoTitle.setText("Saldo de la cuenta");

        lbSaldo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbSaldo.setText("Oculto");

        lbOperacion.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbOperacion.setText("Operacion");

        modalOperation.setText("Ingrese opcion valida");

        btnOperation.setBackground(new java.awt.Color(94, 228, 147));
        btnOperation.setText("Ejecutar operacion");
        btnOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Nimbus Roman", 1, 48)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(43, 6, 30));
        lbTitulo.setText("Cuenta Bancaria");

        lbNombreTitle.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbNombreTitle.setText("Propietario");

        lbNombre.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbNombre.setText("Nombre Apellido");

        javax.swing.GroupLayout panelOperationLayout = new javax.swing.GroupLayout(panelOperation);
        panelOperation.setLayout(panelOperationLayout);
        panelOperationLayout.setHorizontalGroup(
            panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperationLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modalOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperationLayout.createSequentialGroup()
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelOperationLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTitulo)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOperationLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombreTitle)
                            .addComponent(lbSaldoTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)))
                .addGap(78, 78, 78))
        );
        panelOperationLayout.setVerticalGroup(
            panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperationLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreTitle)
                    .addComponent(lbNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSaldoTitle)
                    .addComponent(lbSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(lbOperacion)
                .addGap(32, 32, 32)
                .addComponent(fieldOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(modalOperation)
                .addGap(29, 29, 29)
                .addComponent(btnOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Login inicio = new Login();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperationActionPerformed
        // TODO add your handling code here:
        String nameOperation = lbOperacion.getText();
        this.ejecutarOperacion(nameOperation);
    }//GEN-LAST:event_btnOperationActionPerformed

    private void btnOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionActionPerformed
        // TODO add your handling code here:
        this.mostrarOperaciones();
    }//GEN-LAST:event_btnOptionActionPerformed
    
    private void mostrarOperaciones() {
        boolean salir = false;
        do {
            String opcion = JOptionPane.showInputDialog(null, "1. Consulta\n2. Retiro\n3. Deposito\n4. Cerrar Sesión");
            
            switch (opcion) {
                case "1":
                    this.mostrarSaldo();
                    salir = true;
                    break;
                
                case "2":
                    this.mostrarSeccionOperacion("Retiro");
                    salir = true;
                    break;
                
                case "3":
                    this.mostrarSeccionOperacion("Deposito");
                    salir = true;
                    break;
                
                case "4":
                    System.out.println("Sesión cerrada");
                    this.terminarSesion();
                    salir = true;
                    break;
                
                default:
                    System.out.println("Ingrese opcion correcta");
            }
        } while (!salir);
    }
    
    private void mostrarSaldo() {
        double saldoInt = usuario.getSaldo();
        String saldo = String.valueOf(saldoInt);
        
        lbSaldo.setText("$ " + saldo);
    }
    
    private void mostrarSeccionOperacion(String _nameOperation) {
        lbOperacion.setText(_nameOperation.toUpperCase());
        lbOperacion.setVisible(true);
        fieldOperation.setVisible(true);
        modalOperation.setVisible(true);
        btnOperation.setVisible(true);
    }
    
    private void ejecutarOperacion(String tipo) {
        String ammountTxt = fieldOperation.getText();
        double ammount = Double.parseDouble(ammountTxt);
        fieldOperation.setText("");
        
        if (tipo.equals("RETIRO")) {
            if (this.usuario.retiro(ammount)) {
                mostrarResultadoOperacion("Retiro exitoso", new Color(0, 255, 0));
            } else {
                mostrarResultadoOperacion("El retiro falló", new Color(255, 0, 0));
            }
        } else {
            if (this.usuario.deposito(ammount)) {
                mostrarResultadoOperacion("Deposito exitoso", new Color(0, 255, 0));
            } else {
                mostrarResultadoOperacion("El Deposito falló", new Color(255, 0, 0));
            }
        }
    }
    
    private void mostrarResultadoOperacion(String mensaje, Color color) {
        modalOperation.setForeground(color);
        Tools.activarModal(modalOperation, mensaje);
        this.mostrarSaldo();
    }
    
    private void terminarSesion() {
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }
    
    private void desactivarModalInput() {
        // operation section hidden
        lbOperacion.setVisible(false);
        fieldOperation.setVisible(false);
        modalOperation.setVisible(false);
        modalOperation.setEnabled(false);
        btnOperation.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOperation;
    private javax.swing.JButton btnOption;
    private javax.swing.JScrollPane containerOptions;
    private javax.swing.JTextField fieldOperation;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombreTitle;
    private javax.swing.JLabel lbOperacion;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbSaldoTitle;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JList<String> listOptions;
    private javax.swing.JLabel modalOperation;
    private javax.swing.JPanel panelOperation;
    private javax.swing.JPanel panelOptions;
    private javax.swing.JPanel panelTitle;
    // End of variables declaration//GEN-END:variables
}
