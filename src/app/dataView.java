/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import controller.ctrlData;
import static databaseConnection.connect.getConnection;
import databaseConnection.dataQueries;
import java.sql.Connection;
import surveyClasses.surveyData;

/**
 *
 * @author astridrou
 */
public class dataView extends javax.swing.JFrame {

    /**
     * Creates new form datosEscuelaView
     */
    public dataView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        L_municipio = new javax.swing.JLabel();
        L_nivel = new javax.swing.JLabel();
        cbox_nivel = new javax.swing.JComboBox<>();
        L_sistema = new javax.swing.JLabel();
        cbox_sistema = new javax.swing.JComboBox<>();
        L_turno = new javax.swing.JLabel();
        cbox_turno = new javax.swing.JComboBox<>();
        L_modalidad = new javax.swing.JLabel();
        cbox_modalidad = new javax.swing.JComboBox<>();
        L_antiguedad = new javax.swing.JLabel();
        cbox_antiguedad = new javax.swing.JComboBox<>();
        cbox_municipio = new javax.swing.JComboBox<>();
        L_datosEsc = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        L_edad = new javax.swing.JLabel();
        cbox_sexo = new javax.swing.JComboBox<>();
        L_sexo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbox_edad = new javax.swing.JComboBox<>();
        cbox_aniosServicio = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        L_Encuestador = new javax.swing.JLabel();
        txt_encuestador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        btn_next = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_SaveData = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        L_surveyType = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        L_municipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_municipio.setText("Municipio: ");

        L_nivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_nivel.setText("Nivel: ");

        cbox_nivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Preescolar", "Primaria", "Secundaria", "CAM" }));
        cbox_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_nivelActionPerformed(evt);
            }
        });

        L_sistema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_sistema.setText("Sistema: ");

        cbox_sistema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_sistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Federal", "Estatal" }));

        L_turno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_turno.setText("Turno: ");

        cbox_turno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Matutino", "Vespertino" }));

        L_modalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_modalidad.setText("Modalidad: ");

        cbox_modalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_modalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Regular", "Indígena", "CONAFE" }));

        L_antiguedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_antiguedad.setText("Antigüedad: ");

        cbox_antiguedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_antiguedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "De 0 a 5 años", "De 6 a 10 años", "De 11 a 15 años", "De 16 a 20 años", "Más de 20 años" }));
        cbox_antiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_antiguedadActionPerformed(evt);
            }
        });

        cbox_municipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_municipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "1.-Abalá", "2.-Acancéh", "3.-Baca", "4.-Bokobá", "5.-Buctzotz", "6.-Cacalchén", "7.-Calotmul", "8.-Cansahcab", "9.-Cantamayec", "10.-Celestún", "11.-Cenotillo", "12.-Conkal", "13.-Cuncunul", "14.-Cuzamá", "15.-Chacsinkín", "16.-Chankom", "17.-Chapab", "18.-Chemax", "19.-Chicxulub Pueblo", "20.-Chichimilá", "21.-Chikindzonot", "22.-Chocholá", "23.-Chumayel", "24.-Dzan", "25.-Dzemul", "26.-Dzidzantún", "27.-Dzilam de Bravo", "28.-Dzlilam González", "29.-Dzitás", "30.-Dzoncauich", "31.-Espita", "32.-Halachó", "33.-Hocabá", "34.-Hoctún", "35.-Homún", "36.-Huhi", "37.-Hununcmá", "38.-Ixil", "39.-Izamal", "40.-Kanasín", "41.-Kantunil", "42.-Kaua", "43.-Kinchil", "44.-Kopomá", "45.-Mama", "46.-Maní", "47.-Maxcanú", "48.-Mayapán", "49.-Mérida", "50.-Mocochá", "51.-Motul", "52.-Muna", "53.-Muxupip", "54.-Opichén", "55.-Oxkutzcab", "56.-Panabá", "57.-Peto", "58.-Progreso", "59.-Quintana Roo", "60.-Río Lagartos", "61.-Sacalum", "62.-Samahil", "63.-Sanahcat", "64.-San Felipe", "65.-Santa Elena", "66.-Seyé", "67.-Sinanché", "68.-Sotuta", "69.-Sucilá", "70.-Sudzal", "71.-Suma de Hidalgo", "72.-Tahdziú", "73.-Tahmek", "74.-Teabo", "75.-Tecóh", "76.-Tekal de Venegas", "77.-Tekantó", "78.-Tekax", "79.-Tekit", "80.-Tekom", "81.-Telchac Pueblo", "82.-Telchac Puerto", "83.-Temax", "84.-Temozón", "85.-Tepakán", "86.-Tetiz", "87.-Teya", "88.-Ticul", "89.-Timucuy", "90.-Tinum", "91.-Tixcacalcupul", "92.-Tixkokob", "93.-Tixméhuac", "94.-Tixpéhual", "95.-Tizimín", "96.-Tunkás", "97.-Tzucacab", "98.-Uayma", "99.-Ucu", "100.-Umán", "101.-Valladolid", "102.-Xocchel", "103.-Yaxcabá", "104.-Yaxkukul", "105.-Yobain" }));
        cbox_municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_municipioActionPerformed(evt);
            }
        });

        L_datosEsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_datosEsc.setText("Datos de la Escuela");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Datos del director o directora");

        L_edad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_edad.setText("Edad: ");

        cbox_sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Mujer", "Hombre" }));

        L_sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_sexo.setText("Sexo: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Años de servicio ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("como director (a):");

        cbox_edad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110" }));

        cbox_aniosServicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbox_aniosServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "De 0 a 5 años", "De 6 a 10 años", "De 11 a 15 años", "De 16 a 20 años", "Más de 20 años" }));
        cbox_aniosServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_aniosServicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(L_sexo)
                    .addComponent(L_edad))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_aniosServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_sexo)
                    .addComponent(cbox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_edad)
                    .addComponent(cbox_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbox_aniosServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(L_nivel)
                                .addComponent(L_municipio)
                                .addComponent(L_sistema)
                                .addComponent(L_turno))
                            .addComponent(L_modalidad, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbox_turno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_sistema, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_nivel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_datosEsc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbox_municipio, javax.swing.GroupLayout.Alignment.LEADING, 0, 213, Short.MAX_VALUE)
                            .addComponent(cbox_modalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(L_antiguedad)
                        .addGap(9, 9, 9)
                        .addComponent(cbox_antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(L_datosEsc)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_municipio)
                            .addComponent(cbox_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_nivel)
                            .addComponent(cbox_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbox_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_sistema))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_turno)
                            .addComponent(cbox_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_modalidad)
                            .addComponent(cbox_modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_antiguedad)
                            .addComponent(cbox_antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))))
        );

        L_Encuestador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_Encuestador.setText("Nombre del encuestador (a):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha : ");

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_Encuestador)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_encuestador)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Encuestador)
                    .addComponent(txt_encuestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_next.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_next.setText("Siguiente");

        btn_back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_back.setText("Regresar");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_SaveData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_SaveData.setText("Guardar");
        btn_SaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btn_back)
                .addGap(57, 57, 57)
                .addComponent(btn_SaveData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btn_next)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next)
                    .addComponent(btn_back)
                    .addComponent(btn_SaveData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        L_surveyType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_surveyType.setText("Encuesta: ");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(L_surveyType)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_surveyType)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_nivelActionPerformed

    private void cbox_antiguedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_antiguedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_antiguedadActionPerformed

    private void cbox_aniosServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_aniosServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_aniosServicioActionPerformed

    private void cbox_municipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_municipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_municipioActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        surveyTypes surv = new surveyTypes();
        surv.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_SaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveDataActionPerformed
        // TODO add your handling code here:
        
        try{
            //Connection con = null;
            //con = getConnection();
            surveyTypes  surveyTypeView = new surveyTypes();             
            System.out.println(surveyTypeView.sv.getEncuesta());
            dataQueries dq = new dataQueries();
            
            
            ctrlData controller = new ctrlData(surveyTypeView.sv,dq,this);
            controller.actionPerformed(evt);
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btn_SaveDataActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(dataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Encuestador;
    private javax.swing.JLabel L_antiguedad;
    private javax.swing.JLabel L_datosEsc;
    private javax.swing.JLabel L_edad;
    private javax.swing.JLabel L_modalidad;
    private javax.swing.JLabel L_municipio;
    private javax.swing.JLabel L_nivel;
    private javax.swing.JLabel L_sexo;
    private javax.swing.JLabel L_sistema;
    private javax.swing.JLabel L_surveyType;
    private javax.swing.JLabel L_turno;
    public javax.swing.JButton btn_SaveData;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_next;
    public javax.swing.JComboBox<String> cbox_aniosServicio;
    public javax.swing.JComboBox<String> cbox_antiguedad;
    public javax.swing.JComboBox<String> cbox_edad;
    public javax.swing.JComboBox<String> cbox_modalidad;
    public javax.swing.JComboBox<String> cbox_municipio;
    public javax.swing.JComboBox<String> cbox_nivel;
    public javax.swing.JComboBox<String> cbox_sexo;
    public javax.swing.JComboBox<String> cbox_sistema;
    public javax.swing.JComboBox<String> cbox_turno;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField txt_encuestador;
    // End of variables declaration//GEN-END:variables
}
