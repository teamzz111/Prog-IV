
package Formularios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Frmempleados extends javax.swing.JFrame {
    Connection con = null;
    String Consulta="";
    Clases.Conex link= new Clases.Conex();
    ResultSet rs=null;
    Boolean nuereg=false;
    Boolean editar= false;
    Boolean buscar= false; 
    
    public Frmempleados() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nuevo = new javax.swing.JButton();
        Grabar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Primero = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Documento = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Celular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Dependencia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Estado = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Sin título.png"))); // NOI18N
        Nuevo.setToolTipText("");
        Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nuevo.setFocusCycleRoot(true);
        Nuevo.setFocusTraversalPolicy(null);
        Nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nuevo.setName(""); // NOI18N
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        Grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save-file-option.png"))); // NOI18N
        Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrabarActionPerformed(evt);
            }
        });
        getContentPane().add(Grabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 50, 50));

        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 50, 50));

        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, 50));

        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 50, 50));

        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 50, 50));

        Primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeroActionPerformed(evt);
            }
        });
        getContentPane().add(Primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 50, 50));

        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 50, 50));

        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 50, 50));

        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });
        getContentPane().add(Ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 50, 50));

        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Número Documento: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        jPanel1.add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, 190, -1));

        jLabel2.setText("Nombres");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, -1, -1));

        Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 190, -1));
        jPanel1.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, 190, -1));

        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, -1, -1));

        jLabel4.setText("Celular");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, -1, -1));
        jPanel1.add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 169, 190, -1));

        jLabel5.setText("Correo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));
        jPanel1.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 190, -1));
        jPanel1.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 190, -1));

        jLabel6.setText("Dirección");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel7.setText("Dependencia");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        Dependencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Dependencia.setName("Dependencia"); // NOI18N
        jPanel1.add(Dependencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 190, -1));
        Dependencia.getAccessibleContext().setAccessibleName("Dependencia");

        jLabel8.setText("Estado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));
        jPanel1.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30, -1));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 130, 130));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 130, 130));

        jButton12.setText("Tomar foto");
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 90, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Huella");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 710, 240));

        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentoActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        nuereg = true; 
        Documento.setText(""); 
        Nombres.setText(""); 
        Apellidos.setText(""); 
        Celular.setText(""); 
        Correo.setText(""); 
        Direccion.setText(""); 
        Dependencia.setSelectedItem("--Seleccione--");
        Estado.setSelected(true); 
        Documento.requestFocus(); 
        controles(false, true, false, false, true, false, false, false, false, false, false, false); 
    }//GEN-LAST:event_NuevoActionPerformed

    private void GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrabarActionPerformed
        con = link.Conectarse(); 
        String doc = Documento.getText(); 
        String nom = Nombres.getText(); 
        String ape = Apellidos.getText(); 
        String cel = Celular.getText(); 
        String cor = Correo.getText(); 
        String dir = Direccion.getText(); 
        String dep = Dependencia.getSelectedItem().toString(); 
        int est; 
        if (Estado.isSelected()){ est= 1; }
        else { est= 0; } 
        Consulta="";
        try {
            con.createStatement().execute(Consulta);
            Conectarse();
            JOptionPane.showMessageDialog(null, "Registro ingresado","Sistema",0); 
        } 
        catch(SQLException err)
        { 
            JOptionPane.showMessageDialog(null, err.getMessage(),"Sistema",0);
        } 
        controles(true, false, true, false, false, true, true, true, true, true, true, true); 
    }//GEN-LAST:event_GrabarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
    
        Documento.setEnabled(false);
        controles (false,false,false,true,true,false, false,false,false, false, false, false); 
        editar = true; 

    }//GEN-LAST:event_EditarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        con = link.Conectarse();
        String doc = Documento.getText();
        String nom = Nombres.getText();
        String ape = Apellidos.getText();
        String cel = Celular.getText();
        String cor = Correo.getText();
        String dir = Direccion.getText();
        String dep = Dependencia.getSelectedItem().toString();
        Consulta = "UPDATE tbempleados SET Nombres='" + nom + "'," + "Apellidos='" + ape + "'," 
                + "Celular=1" + cel + "Correa= " + cor + ", Direccion='" + dir 
                + "', Dependencia='" + dep + "' WHERE Documento="+ doc + ";"; 
        try {
            con.createStatement().execute(Consulta);
            Conectarse();
            JOptionPane.showMessageDialog(null, "Registro modificado correctamenH", "Sistema",1);
            editar = false; 
            Documento.setEnabled(true);
            controles (true,false,true,false,false,true, true,true,true,true,true,true);
        }
            catch(SQLException err)
                    {
                    JOptionPane.showMessageDialog(null, err.getMessage() ,"Sistema",0);
                    }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        String cad=""; 
        int opc=0; 
        if (nuereg = true)
        {
            cad="Insertando";
        } 
        if (editar ==true)
        { cad="Editando"; 
        } 
        if (buscar == true)
        {
            cad = "Buscando";
        } 
        opc = JOptionPane.showOptionDialog(null, "Actualmente esta " + cad + " desea cancelar",
                "Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[] {"Si", "No"}, "Si");
        if (opc==0){ 
            formComponentShown(null);
            nuereg = false;
            editar =false; 
            buscar=false; 
            }
    }//GEN-LAST:event_CancelarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
         int opc=0;
         opc = JOptionPane.showOptionDialog(null, "Seguro que desea eliminar el registro",
                 "Sistema", JOptionPane.YES_NO_OPTION,
                 JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No"}, "Si");
                 if (opc==0){
                    con = link.Conectarse();
                    Consulta = "DELETE tbempleados WHERE Documento=" + Documento.getText() + ";";
                    try {
                        con.createStatement().execute(Consulta);
                        JOptionPane.showMessageDialog(null, "Registro Eliminado correctament", "Sistema",1);
                        Documento.setEnabled(true);
                        formComponentShown(null);
                    } catch(SQLException err){
                        JOptionPane.showMessageDialog(null, err.getMessage() ,"Sistema",0);
                    }
                 } 
    }//GEN-LAST:event_EliminarActionPerformed

    private void PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeroActionPerformed
        try {
            rs.first();
            mostrarDatos();
            controles(true,false,true,false,false,true, true,true,true,true,true,true);
            }
        catch (SQLException ex) 
        { 
           
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Sistema",0); 
        } 
    }//GEN-LAST:event_PrimeroActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        try {
            rs.previous();
            mostrarDatos();
            controles(true, false, true, false, false, true, true,true,true,true,true,true); 
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"SI.H7era",0);
        } 
    }//GEN-LAST:event_AnteriorActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        try { 
            rs.next();
            mostrarDatos();
            controles(true,false,true,false,false,true,true, true, true, true, true, true);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Sistema",0);
        } 
    }//GEN-LAST:event_SiguienteActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        try 
        { 
            rs.last();
            mostrarDatos();
            controles(true, false, true, false, false, true, true, true, true, true, true, true) ;
        }catch (SQLException ex) 
        { 
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Sistema",0);
        } 
    }//GEN-LAST:event_UltimoActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        con = link.Conectarse();
        int DocEmp=0;
        DocEmp = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese documento a buscar"));
        Consulta = "Select * from tbempleados WHERE Documento=" + DocEmp + ";";
        try {
            rs = con.createStatement().executeQuery(Consulta);
            rs.last(); 
            int numreg = rs.getRow();
            if (numreg > 0) {
                PrimeroActionPerformed(null);
                controles(true,false,true,false,true,true, true,true,true,true,true,true);
                buscar = true; 
                }
            else 
            { 
                JOptionPane.showMessageDialog(null, "No ray coincidencias","Sistema",1);
                formComponentShown(null); 
            }
            } 
            catch(SQLException err)
                    {
                    JOptionPane.showMessageDialog(null, err.getMessage(),"Sistema",0);
                    } 
    }//GEN-LAST:event_BuscarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        
    }//GEN-LAST:event_CerrarActionPerformed

    private void controles (Boolean a, Boolean b, Boolean c, Boolean d, 
            Boolean e, Boolean f, Boolean g, Boolean h, Boolean i, Boolean j, Boolean k, 
            Boolean l)
    {
        Nuevo.setEnabled(a); 
        Grabar.setEnabled(b); 
        Editar.setEnabled(c); 
        Actualizar.setEnabled(d); 
        Cancelar.setEnabled(e); 
        Eliminar.setEnabled(f); 
        Primero.setEnabled(g); 
        Anterior.setEnabled(h); 
        Siguiente.setEnabled(i); 
        Ultimo.setEnabled(j); 
        Buscar.setEnabled(k); 
        Cerrar.setEnabled(l); 
    }
    
    private void mostrarDatos(){
        try { 
                Documento.setText(rs.getString(1) );
                Nombres.setText(rs.getString(3) );
                Apellidos.setText(rs.getString(4) );
                Celular.setText(rs.getString(5) );
                Correo.setText(rs.getString(6) ); 
                Direccion.setText(rs.getString(7) );
                Dependencia.setSelectedItem(rs.getString(8));
                Estado.setSelected( Boolean.parseBoolean(rs.getString(10)) );
                }
                catch(SQLException err){
                    JOptionPane.showMessageDialog(null, err.getMessage(),"SisterTa",0);
                        } 
} 

    private void formComponentShown(java.awt.event.ComponentEvent evt)
    {
        llenarDependencias();
        Conectarse();
    }
    private void llenarDependencias()
    {
        Dependencia.addItem("Seleccione");
        con= link.Conectarse();
        Consulta= "SELECT * FROM tbdependencias ORDER BY NombreDependencia";
        try
        {
            rs =con.createStatement().executeQuery(Consulta);
            while (rs.next())
            {
                Dependencia.addItem(rs.getString("NombreDependencia"));
            }               
        }
            catch(SQLException err)
            {
                    JOptionPane.showMessageDialog(null, err.getMessage(),"Sistema",0);                    
            }
    }
    
    private void Conectarse(){
        con=link.Conectarse();
        Consulta= "SELECT * FROM tbempleados";
        try
        {
            rs=con.createStatement().executeQuery(Consulta);
            rs.first();
            int numreg =rs.getRow();
            if(numreg>0)
            {
                PrimeroActionPerformed(null);
            }
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, err.getMessage(),"Sistema",0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Anterior;
    private javax.swing.JTextField Apellidos;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Celular;
    private javax.swing.JButton Cerrar;
    private javax.swing.JTextField Correo;
    private javax.swing.JComboBox<String> Dependencia;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Documento;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JCheckBox Estado;
    private javax.swing.JButton Grabar;
    private javax.swing.JTextField Nombres;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Primero;
    private javax.swing.JButton Siguiente;
    private javax.swing.JButton Ultimo;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
