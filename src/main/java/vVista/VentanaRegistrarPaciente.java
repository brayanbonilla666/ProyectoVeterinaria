
package vVista;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import vVista.VentanaPrincipal;


public class VentanaRegistrarPaciente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaRegistrarPaciente.class.getName());
        
        private VentanaPrincipal vPrincipal;
        
    public VentanaRegistrarPaciente(VentanaPrincipal p) {
        
        this.vPrincipal = p;
        initComponents();
        
        pnlMascotaConvencional.setVisible(false);
        pnlMascotasExoticas.setVisible(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbTipoMascota = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        cmbPropietarios = new javax.swing.JComboBox<>();
        pnlDinamico = new javax.swing.JPanel();
        pnlMascotasExoticas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNumeroICA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbSedacion = new javax.swing.JComboBox<>();
        pnlMascotaConvencional = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        txtVacuna = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbEspecie = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Paciente");

        jLabel1.setText("Tipo de Mascota");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Peso");

        jLabel5.setText("Propietario");

        cmbTipoMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Convencional", "Exotica" }));
        cmbTipoMascota.addActionListener(this::cmbTipoMascotaActionPerformed);

        cmbPropietarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmbPropietarios.addActionListener(this::cmbPropietariosActionPerformed);

        jLabel8.setText("Numero ICA");

        jLabel9.setText("Sedacion Requerida");

        cmbSedacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "SI", "NO" }));

        javax.swing.GroupLayout pnlMascotasExoticasLayout = new javax.swing.GroupLayout(pnlMascotasExoticas);
        pnlMascotasExoticas.setLayout(pnlMascotasExoticasLayout);
        pnlMascotasExoticasLayout.setHorizontalGroup(
            pnlMascotasExoticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMascotasExoticasLayout.createSequentialGroup()
                .addGroup(pnlMascotasExoticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMascotasExoticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumeroICA)
                    .addComponent(cmbSedacion, 0, 120, Short.MAX_VALUE)))
        );
        pnlMascotasExoticasLayout.setVerticalGroup(
            pnlMascotasExoticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMascotasExoticasLayout.createSequentialGroup()
                .addGroup(pnlMascotasExoticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumeroICA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMascotasExoticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbSedacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel7.setText("Vacuna");

        jLabel6.setText("Raza");

        javax.swing.GroupLayout pnlMascotaConvencionalLayout = new javax.swing.GroupLayout(pnlMascotaConvencional);
        pnlMascotaConvencional.setLayout(pnlMascotaConvencionalLayout);
        pnlMascotaConvencionalLayout.setHorizontalGroup(
            pnlMascotaConvencionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMascotaConvencionalLayout.createSequentialGroup()
                .addGroup(pnlMascotaConvencionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMascotaConvencionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRaza)
                    .addComponent(txtVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
        );
        pnlMascotaConvencionalLayout.setVerticalGroup(
            pnlMascotaConvencionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMascotaConvencionalLayout.createSequentialGroup()
                .addGroup(pnlMascotaConvencionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMascotaConvencionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout pnlDinamicoLayout = new javax.swing.GroupLayout(pnlDinamico);
        pnlDinamico.setLayout(pnlDinamicoLayout);
        pnlDinamicoLayout.setHorizontalGroup(
            pnlDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMascotaConvencional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMascotasExoticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlDinamicoLayout.setVerticalGroup(
            pnlDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDinamicoLayout.createSequentialGroup()
                .addComponent(pnlMascotaConvencional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMascotasExoticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Propietario", "Tipo", "Especie", "Nombre", "Edad", "Peso", "Especificacion 1", "Especificacion 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMascotas);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        btnEliminar.setText("Eliminar");

        btnRegresar.setText("Regresar");

        jLabel10.setText("Especie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbEspecie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPeso)
                            .addComponent(txtFechaNacimiento)
                            .addComponent(txtNombre)
                            .addComponent(cmbTipoMascota, 0, 1, Short.MAX_VALUE)
                            .addComponent(cmbPropietarios, 0, 120, Short.MAX_VALUE))))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegresar)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pnlDinamico, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoMascotaActionPerformed
       
        String tipoSeleccionado = (String) cmbTipoMascota.getSelectedItem();
        DefaultComboBoxModel<String> modeloCmb = new DefaultComboBoxModel<>();
        
        pnlMascotaConvencional.setVisible(false);
        pnlMascotasExoticas.setVisible(false);
        
        if (tipoSeleccionado.equals("Convencional")) {
            
            modeloCmb.addElement("Perro");
            modeloCmb.addElement("Gato");
            pnlMascotaConvencional.setVisible(true);
        
        } else if (tipoSeleccionado.equals("Exotica")) {
            
            modeloCmb.addElement("Ave");
            modeloCmb.addElement("Lagarto");
            modeloCmb.addElement("P. Mamifero");
            pnlMascotasExoticas.setVisible(true);
        }
        
        cmbEspecie.setModel(modeloCmb);
        
    }//GEN-LAST:event_cmbTipoMascotaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cmbPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPropietariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPropietariosActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        String selecPropietarios = (String) cmbPropietarios.getSelectedItem();
        String selecTipoMascota = (String) cmbTipoMascota.getSelectedItem();
        String selecEspecie = (String) cmbEspecie.getSelectedItem();
        String selecSedacion = (String) cmbSedacion.getSelectedItem();
        DefaultComboBoxModel<String> modeloCmb = new DefaultComboBoxModel<>();
        
        
        Object itemPropietario = cmbPropietarios.getSelectedItem();
        Object itemTipoMascota = cmbTipoMascota.getSelectedItem();
        Object itemEspecie = cmbEspecie.getSelectedItem();
        Object itemSedacion = cmbSedacion.getSelectedItem();
        
        String sPropietario = (itemPropietario != null) ? itemPropietario.toString() : "";
        String sTipoMascota = (itemTipoMascota != null) ? itemTipoMascota.toString() : "";
        String sEspecie = (itemEspecie != null) ? itemEspecie.toString() : "";
        
        String sNombre = this.txtNombre.getText();
        String sFNacimiento = this.txtFechaNacimiento.getText();
        String sPeso = this.txtPeso.getText();
        
//        if (sPropietario.equals("Seleccionar") || sTipoMascota.equals("Seleccionar") || sEspecie.equals("Seleccionar")) {
//            JOptionPane.showMessageDialog(this, "Por favor, Selecciones todas las opcciones", "Campos vacios" ,JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        
        
        if (sNombre.isEmpty() || sFNacimiento.isEmpty() || sPeso.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos comunes", "Campos vacios" ,JOptionPane.WARNING_MESSAGE);
            return;
        } 
        
        
        if (selecTipoMascota.equals("Convencional")) {
            
            String sRaza = this.txtRaza.getText();
            String sVacuna = this.txtVacuna.getText();
            
            if (sRaza.isEmpty() || sVacuna.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, llene los campos especificos", "Campos vacios", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            javax.swing.table.DefaultTableModel modeloTbl = (javax.swing.table.DefaultTableModel) tblMascotas.getModel();
            modeloTbl.addRow(new Object[]{sPropietario, sTipoMascota, sEspecie, sNombre, sFNacimiento, sPeso, sRaza, sVacuna});
            
        }
        
        
        if (selecTipoMascota.equals("Exotica")) {
            
            String sNPermiso = this.txtNumeroICA.getText();
            String sSedacion = (itemSedacion != null) ? itemSedacion.toString() : "";
            
            if (sNPermiso.isEmpty() || sSedacion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, llene los campos especificos", "Campos vacios", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            javax.swing.table.DefaultTableModel modeloTbl = (javax.swing.table.DefaultTableModel) tblMascotas.getModel();
            modeloTbl.addRow(new Object[]{sPropietario, sTipoMascota, sEspecie, sNombre, sFNacimiento, sPeso, sNPermiso, sSedacion});
            
        }
        
        
        this.txtNombre.setText("");
        this.txtFechaNacimiento.setText("");
        this.txtPeso.setText("");
        this.txtRaza.setText("");
        this.txtVacuna.setText("");
        this.txtNumeroICA.setText("");
        
        
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbEspecie;
    private javax.swing.JComboBox<String> cmbPropietarios;
    private javax.swing.JComboBox<String> cmbSedacion;
    private javax.swing.JComboBox<String> cmbTipoMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDinamico;
    private javax.swing.JPanel pnlMascotaConvencional;
    private javax.swing.JPanel pnlMascotasExoticas;
    private javax.swing.JTable tblMascotas;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroICA;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtVacuna;
    // End of variables declaration//GEN-END:variables
}
