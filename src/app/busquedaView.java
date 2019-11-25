/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import javax.swing.table.DefaultTableModel;
import controller.ctrlBusqueda;
import databaseConnection.dataQueries;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import surveyClasses.dataSurvey;
/**
 *
 * @author astri
 */
public class busquedaView extends javax.swing.JFrame {
    
    dataSurvey surveyQ = new dataSurvey();

    /** Creates new form busquedaView */
    public busquedaView() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.btn_buscar.setEnabled(false);
        //this.show();
        
        //DefaultTableModel model = new DefaultTableModel();
        
        //model.addColumn("FOLIO");
        //model.addColumn("FECHA");
        
        //table_datosEsc.setModel(model);
        
        DefaultTableModel model = new DefaultTableModel();
        ctrlBusqueda ctrlb = new ctrlBusqueda();

           
        ResultSet rs = ctrlb.getTable("SELECT folio, fecha, municipio, encuesta, nivel, archivo FROM datos_escuela ");
        model.addColumn("FOLIO");
        model.addColumn("FECHA");
        model.addColumn("MUNICIPIO");
        model.addColumn("ENCUESTA");
        model.addColumn("NIVEL");
        model.addColumn("ARCHIVO");
        
        
        try{
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("folio"), rs.getString("fecha"), rs.getString("municipio"), rs.getString("encuesta"), rs.getString("nivel"),
                //rs.getBlob("ARCHIVO")});
                rs.getString("archivo")});
            }
            table_datosEsc.setModel((model));
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        //show();*/
    }
    public ResultSet getFile(ResultSet rs){
        InputStream input =null;
        File survFile = new File("documento_guardado.pdf");
        try{
        FileOutputStream output= new FileOutputStream(survFile);
        
        }catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }
    
   /* public void show(){
        DefaultTableModel model = new DefaultTableModel();
        ctrlBusqueda ctrlb = new ctrlBusqueda();
        ResultSet rs = ctrlb.getTable("SELECT folio, fecha, municipio, encuesta, nivel FROM datos_escuela ");
        model.addColumn("FOLIO");
        model.addColumn("FECHA");
        model.addColumn("MUNICIPIO");
        model.addColumn("ENCUESTA");
        model.addColumn("NIVEL");
        try{
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("FOLIO"), rs.getString("FECHA"), rs.getString("MUNICIPIO"), rs.getString("ENCUESTA"), rs.getString("NIVEL")});
            }
            table_datosEsc.setModel((model));
        }catch(Exception e){
            System.out.println(e);
        }
    }*/
    /*
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_datosEsc = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_folio = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date_chooser = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbox_municipio = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbox_nivel = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbox_encuesta = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_PDFview = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_datosEsc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FOLIO", "FECHA", "MUNICIPIO", "ENCUESTA", "NIVEL"
            }
        ));
        table_datosEsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_datosEscMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_datosEsc);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("FOLIO:");

        txt_folio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_folio.setPreferredSize(new java.awt.Dimension(8, 23));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_folio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txt_folio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("FECHA:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MUNICIPIO:");

        cbox_municipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_municipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "1.-Abalá", "2.-Acancéh", "3.-Baca", "4.-Bokobá", "5.-Buctzotz", "6.-Cacalchén", "7.-Calotmul", "8.-Cansahcab", "9.-Cantamayec", "10.-Celestún", "11.-Cenotillo", "12.-Conkal", "13.-Cuncunul", "14.-Cuzamá", "15.-Chacsinkín", "16.-Chankom", "17.-Chapab", "18.-Chemax", "19.-Chicxulub Pueblo", "20.-Chichimilá", "21.-Chikindzonot", "22.-Chocholá", "23.-Chumayel", "24.-Dzan", "25.-Dzemul", "26.-Dzidzantún", "27.-Dzilam de Bravo", "28.-Dzlilam González", "29.-Dzitás", "30.-Dzoncauich", "31.-Espita", "32.-Halachó", "33.-Hocabá", "34.-Hoctún", "35.-Homún", "36.-Huhi", "37.-Hununcmá", "38.-Ixil", "39.-Izamal", "40.-Kanasín", "41.-Kantunil", "42.-Kaua", "43.-Kinchil", "44.-Kopomá", "45.-Mama", "46.-Maní", "47.-Maxcanú", "48.-Mayapán", "49.-Mérida", "50.-Mocochá", "51.-Motul", "52.-Muna", "53.-Muxupip", "54.-Opichén", "55.-Oxkutzcab", "56.-Panabá", "57.-Peto", "58.-Progreso", "59.-Quintana Roo", "60.-Río Lagartos", "61.-Sacalum", "62.-Samahil", "63.-Sanahcat", "64.-San Felipe", "65.-Santa Elena", "66.-Seyé", "67.-Sinanché", "68.-Sotuta", "69.-Sucilá", "70.-Sudzal", "71.-Suma de Hidalgo", "72.-Tahdziú", "73.-Tahmek", "74.-Teabo", "75.-Tecóh", "76.-Tekal de Venegas", "77.-Tekantó", "78.-Tekax", "79.-Tekit", "80.-Tekom", "81.-Telchac Pueblo", "82.-Telchac Puerto", "83.-Temax", "84.-Temozón", "85.-Tepakán", "86.-Tetiz", "87.-Teya", "88.-Ticul", "89.-Timucuy", "90.-Tinum", "91.-Tixcacalcupul", "92.-Tixkokob", "93.-Tixméhuac", "94.-Tixpéhual", "95.-Tizimín", "96.-Tunkás", "97.-Tzucacab", "98.-Uayma", "99.-Ucu", "100.-Umán", "101.-Valladolid", "102.-Xocchel", "103.-Yaxcabá", "104.-Yaxkukul", "105.-Yobain" }));
        cbox_municipio.setPreferredSize(new java.awt.Dimension(8, 23));
        cbox_municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_municipioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(cbox_municipio, 0, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbox_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("NiVEL");

        cbox_nivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Preescolar", "Primaria", "Secundaria", "CAM" }));
        cbox_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_nivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(cbox_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbox_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ENCUESTA: ");

        cbox_encuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_encuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "DESARROLLO", "VIOLENCIA" }));
        cbox_encuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_encuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addComponent(cbox_encuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbox_encuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_buscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btn_buscar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn_buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_regresar.setText("Regresar al menú principal");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        btn_PDFview.setBackground(new java.awt.Color(102, 255, 102));
        btn_PDFview.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_PDFview.setLabel("Ver archivo PDF");
        btn_PDFview.setName(""); // NOI18N
        btn_PDFview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PDFviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_PDFview, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_PDFview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        btn_PDFview.getAccessibleContext().setAccessibleName("button 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(btn_regresar)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_municipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_municipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_municipioActionPerformed

    private void cbox_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_nivelActionPerformed

    private void cbox_encuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_encuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_encuestaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        System.out.println(" boton pushed");
        String folio = txt_folio.getText();
        String municipio = cbox_municipio.getSelectedItem().toString();
        String fecha = date_chooser.getDate().toString();
        String nivel = cbox_nivel.getSelectedItem().toString();
        String encuesta = cbox_encuesta.getSelectedItem().toString();
        System.out.println("folio: "+folio);
        System.out.println("municipio: "+municipio);
        System.out.println("fecha: "+fecha);
        System.out.println("nivel: "+nivel);
        System.out.println("encuesta : "+encuesta);
        
        String query = "SELECT * FROM datos_escuela WHERE folio LIKE '%"+folio+"%' OR municipio LIKE '%"+municipio+"%' "
                + " OR fecha LIKE '%"+fecha+"%' OR nivel LIKE '%"+nivel+"%' OR  encuesta LIKE '%"+encuesta+"%'";
        //String query = "SELECT * FROM datos_escuela WHERE folio LIKE '%"+folio+"%' AND municipio LIKE '%"+municipio+"%' "
        //        + " AND fecha LIKE '%"+fecha+"%' AND nivel LIKE '%"+nivel+"%' AND  encuesta LIKE '%"+encuesta+"%'";

        
        DefaultTableModel model = new DefaultTableModel();
        ctrlBusqueda ctrlb = new ctrlBusqueda();
        
        System.out.println(query);
        
        ResultSet rs = ctrlb.getTable(query);
        model.addColumn("FOLIO");
        model.addColumn("FECHA");
        model.addColumn("MUNICIPIO");
        model.addColumn("ENCUESTA");
        model.addColumn("NIVEL");
        model.addColumn("ARCHIVO");
        
        
        try{
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("folio"), rs.getString("fecha"), rs.getString("municipio"), rs.getString("encuesta"), rs.getString("nivel"),
                //rs.getBlob("ARCHIVO")});
                rs.getString("archivo")});
            }
            table_datosEsc.setModel((model));
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        mainMenu main = new mainMenu();
        this.setVisible(false);
        main.setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void table_datosEscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_datosEscMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table_datosEsc.getModel();
        int selectedRowIndex = table_datosEsc.getSelectedRow();
        
        String folio = model.getValueAt(selectedRowIndex,0).toString();
        String archivo = model. getValueAt(selectedRowIndex,5).toString();
        File auxfile = new File(archivo);
        surveyQ.setFolio(folio);
        surveyQ.setArchivo(auxfile.getName());
        
        //System.out.println(folio);
        txt_folio.setText(surveyQ.getFolio());
    }//GEN-LAST:event_table_datosEscMouseClicked

    private void btn_PDFviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PDFviewActionPerformed
        // TODO add your handling code here:
        dataQueries dq = new dataQueries();
        try{
            dq.readFile(surveyQ.getArchivo(), surveyQ.getFolio());
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch( IOException e2){
            System.out.println(e2);
        } catch (InterruptedException ex) {
            Logger.getLogger(busquedaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_PDFviewActionPerformed

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
            java.util.logging.Logger.getLogger(busquedaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busquedaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busquedaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busquedaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busquedaView().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_PDFview;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_regresar;
    public javax.swing.JComboBox<String> cbox_encuesta;
    public javax.swing.JComboBox<String> cbox_municipio;
    public javax.swing.JComboBox<String> cbox_nivel;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_datosEsc;
    private javax.swing.JTextField txt_folio;
    // End of variables declaration//GEN-END:variables

}
