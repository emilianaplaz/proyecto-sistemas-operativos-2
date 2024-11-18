/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.*;
import Clases.Admin;
import Clases.Studio;
import Clases.IA;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;



/**
 *
 * @author emilianaplaz
 */
public class Interfaz extends javax.swing.JFrame {
    Studio starWars = new Studio("StarWars");
    Studio starTrek = new Studio("StarTrek");
    IA ia = new IA();
    Admin admin = new Admin(ia);
    boolean iniciado = false;
    
    

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();      
        Global.setStudioStarTrek(starTrek);
        Global.setStudioStarWars(starWars);
        this.setLocationRelativeTo(null); 
    }
    
//    Marcadores
    
    public static JLabel getMarcadorStarTrek() {
        return marcadorStarTrek;
    }

    public static void setMarcadorStarTrek(JLabel marcadorStarTrek) {
        Interfaz.marcadorStarTrek = marcadorStarTrek;
    }

    public static JLabel getMarcadorStarWars() {
        return marcadorStarWars;
    }

    public static void setMarcadorStarWars(JLabel marcadorStarWars) {
        Interfaz.marcadorStarWars = marcadorStarWars;
    }
    
    
    
//    Estado de la IA
    
    public static JLabel getIAState() {
        return IA_State;
    }

    public static void setIAState(JLabel IA_State) {
        Interfaz.IA_State = IA_State;
    }
    
//      Character Icons
    
    public static JLabel getCharacterIconStarTrek() {
        return Character_Icon_startrek;
    }

    public static void setCharacterIconStarTrek(JLabel Character_Icon_startrek) {
        Interfaz.Character_Icon_startrek = Character_Icon_startrek;
    }

    public static JLabel getCharacterIconStarWars() {
        return Character_Icon_starwars;
    }

    public static void setCharacterIconStarWars(JLabel Character_Icon_starwars) {
        Interfaz.Character_Icon_starwars = Character_Icon_starwars;
    }
    
    
    
//    Habilidad, agilidad, fuerza, HP y obejto
    
    public static void setHabilidad_StarTrek(JLabel Habilidad_StarTrek) {
        Interfaz.Habilidad_StarTrek = Habilidad_StarTrek;
    }
    
    public static JLabel getHabilidad_StarTrek() {
        return Habilidad_StarTrek;
    }

    public static JLabel getHabilidad_StarWars() {
        return Habilidad_StarWars;
    }

    public static void setHabilidad_StarWars(JLabel Habilidad_StarWars) {
        Interfaz.Habilidad_StarWars = Habilidad_StarWars;
    }

    public static JLabel getAgilidad_StarTrek() {
        return Agilidad_StarTrek;
    }

    public static void setAgilidad_StarTrek(JLabel Agilidad_StarTrek) {
        Interfaz.Agilidad_StarTrek = Agilidad_StarTrek;
    }

    public static JLabel getAgilidad_StarWars() {
        return Agilidad_StarWars;
    }

    public static void setAgilidad_StarWars(JLabel Agilidad_StarWars) {
        Interfaz.Agilidad_StarWars = Agilidad_StarWars;
    }

    public static JLabel getHP_StarTrek() {
        return HP_StarTrek;
    }

    public static void setHP_StarTrek(JLabel HP_StarTrek) {
        Interfaz.HP_StarTrek = HP_StarTrek;
    }

    public static JLabel getHP_StarWars() {
        return HP_StarWars;
    }

    public static void setHP_StarWars(JLabel HP_StarWars) {
        Interfaz.HP_StarWars = HP_StarWars;
    }

    public static JLabel getObjeto_StarTrek() {
        return Objeto_StarTrek;
    }

    public static void setObjeto_StarTrek(JLabel Objeto_StarTrek) {
        Interfaz.Objeto_StarTrek = Objeto_StarTrek;
    }

    public static JLabel getObjeto_StarWars() {
        return Objeto_StarWars;
    }

    public static void setObjeto_StarWars(JLabel Objeto_StarWars) {
        Interfaz.Objeto_StarWars = Objeto_StarWars;
    }
    
    public static JLabel getFuerza_StarTrek() {
        return Fuerza_StarTrek;
    }

    public static void setFuerza_StarTrek(JLabel Fuerza_StarTrek) {
        Interfaz.Fuerza_StarTrek = Fuerza_StarTrek;
    }

    public static JLabel getFuerza_StarWars() {
        return Fuerza_StarWars;
    }

    public static void setFuerza_StarWars(JLabel Fuerza_StarWars) {
        Interfaz.Fuerza_StarWars = Fuerza_StarWars;
    }
    
    
    
//    Prioridades
    
        public static JTextArea getPrioridad1StarTrek() {
        return Prioridad1StarTrek;
    }

    public static void setPrioridad1StarTrek(JTextArea Prioridad1StarTrek) {
        Interfaz.Prioridad1StarTrek = Prioridad1StarTrek;
    }

    public static JTextArea getPrioridad1StarWars() {
        return Prioridad1StarWars;
    }

    public static void setPrioridad1StarWars(JTextArea Prioridad1StarWars) {
        Interfaz.Prioridad1StarWars = Prioridad1StarWars;
    }

    public static JTextArea getPrioridad2StarTrek() {
        return Prioridad2StarTrek;
    }

    public static void setPrioridad2StarTrek(JTextArea Prioridad2StarTrek) {
        Interfaz.Prioridad2StarTrek = Prioridad2StarTrek;
    }

    public static JTextArea getPrioridad2StarWars() {
        return Prioridad2StarWars;
    }

    public static void setPrioridad2StarWars(JTextArea Prioridad2StarWars) {
        Interfaz.Prioridad2StarWars = Prioridad2StarWars;
    }

    public static JTextArea getPrioridad3StarTrek() {
        return Prioridad3StarTrek;
    }

    public static void setPrioridad3StarTrek(JTextArea Prioridad3StarTrek) {
        Interfaz.Prioridad3StarTrek = Prioridad3StarTrek;
    }

    public static JTextArea getPrioridad3StarWars() {
        return Prioridad3StarWars;
    }

    public static void setPrioridad3StarWars(JTextArea Prioridad3StarWars) {
        Interfaz.Prioridad3StarWars = Prioridad3StarWars;
    }
    
    
//    cola refuerzo
    
        public static JTextArea getRefuerzoStarTrek() {
        return RefuerzoStarTrek;
    }

    public static void setRefuerzoStarTrek(JTextArea RefuerzoStarTrek) {
        Interfaz.RefuerzoStarTrek = RefuerzoStarTrek;
    }

    public static JTextArea getRefuerzoStarWars() {
        return RefuerzoStarWars;
    }

    public static void setRefuerzoStarWars(JTextArea RefuerzoStarWars) {
        Interfaz.RefuerzoStarWars = RefuerzoStarWars;
    }
    
    
//      Resultado
    public static JLabel getResultadoCombate() {
        return Resultado_Combate;
    }

    public static void setResultadoCombate(JLabel Resultado_Combate) {
        Interfaz.Resultado_Combate = Resultado_Combate;
    }
    
    
//      Lista ganadores
    
    public static JTextArea getListaGanadores() {
        return ListaGanadores;
    }

    public static void setListaGanadores(JTextArea ListaGanadores) {
        Interfaz.ListaGanadores = ListaGanadores;
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        marcadorStarWars = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        marcadorStarTrek = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        IA_State = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Fuerza_StarWars = new javax.swing.JLabel();
        Habilidad_StarWars = new javax.swing.JLabel();
        HP_StarWars = new javax.swing.JLabel();
        Agilidad_StarWars = new javax.swing.JLabel();
        Objeto_StarWars = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Habilidad_StarTrek = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Agilidad_StarTrek = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        HP_StarTrek = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Objeto_StarTrek = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Fuerza_StarTrek = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Prioridad1StarWars = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prioridad1StarTrek = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Prioridad2StarTrek = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Prioridad3StarTrek = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Prioridad2StarWars = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        Prioridad3StarWars = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        RefuerzoStarWars = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        RefuerzoStarTrek = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Resultado_Combate = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ListaGanadores = new javax.swing.JTextArea();
        Character_Icon_starwars = new javax.swing.JLabel();
        Character_Icon_startrek = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        Velocidad = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reserva");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(40, 580, 230, 24);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reserva");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(1030, 580, 230, 24);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lista ganadores");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(420, 680, 230, 17);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cola prioridad 3");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(40, 420, 230, 24);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cola prioridad 1");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(40, 110, 230, 24);

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cola prioridad 1");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(1030, 110, 230, 24);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cola prioridad 2");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(1030, 260, 230, 24);

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cola prioridad 3");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(1030, 420, 230, 24);

        marcadorStarWars.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        marcadorStarWars.setForeground(new java.awt.Color(255, 255, 255));
        marcadorStarWars.setText("0");
        jPanel5.add(marcadorStarWars);
        marcadorStarWars.setBounds(250, 40, 90, 50);

        jLabel13.setFont(new java.awt.Font("Krungthep", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sw-logo.png"))); // NOI18N
        jPanel5.add(jLabel13);
        jLabel13.setBounds(60, 40, 150, 50);

        marcadorStarTrek.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        marcadorStarTrek.setForeground(new java.awt.Color(255, 255, 255));
        marcadorStarTrek.setText("0");
        jPanel5.add(marcadorStarTrek);
        marcadorStarTrek.setBounds(980, 40, 90, 50);

        jLabel7.setText("Estado IA: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IA_State, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IA_State, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1);
        jPanel1.setBounds(40, 750, 310, 40);

        jLabel14.setText("Fuerza:");

        jLabel15.setText("Habilidad:");

        jLabel16.setText("HP:");

        jLabel17.setText("Agilidad:");

        jLabel18.setText("Objeto:");

        Fuerza_StarWars.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        Habilidad_StarWars.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        HP_StarWars.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        Agilidad_StarWars.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        Objeto_StarWars.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HP_StarWars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habilidad_StarWars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Agilidad_StarWars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Objeto_StarWars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fuerza_StarWars, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Fuerza_StarWars, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Habilidad_StarWars, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HP_StarWars, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Agilidad_StarWars, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Objeto_StarWars, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Agilidad_StarWars, Fuerza_StarWars, HP_StarWars, Habilidad_StarWars, Objeto_StarWars, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18});

        jPanel5.add(jPanel6);
        jPanel6.setBounds(360, 460, 180, 170);

        jLabel19.setText("Habilidad:");

        Habilidad_StarTrek.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        jLabel20.setText("Agilidad:");

        Agilidad_StarTrek.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        jLabel21.setText("HP:");

        HP_StarTrek.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        jLabel22.setText("Objeto:");

        Objeto_StarTrek.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        jLabel23.setText("Fuerza:");

        Fuerza_StarTrek.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Objeto_StarTrek, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HP_StarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Habilidad_StarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agilidad_StarTrek)
                    .addComponent(Fuerza_StarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel19, jLabel20, jLabel21, jLabel22, jLabel23});

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Agilidad_StarTrek, Fuerza_StarTrek, HP_StarTrek, Habilidad_StarTrek, Objeto_StarTrek});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(Fuerza_StarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Habilidad_StarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HP_StarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Agilidad_StarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Objeto_StarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Agilidad_StarTrek, Fuerza_StarTrek, HP_StarTrek, Habilidad_StarTrek, Objeto_StarTrek, jLabel19, jLabel20, jLabel21, jLabel22, jLabel23});

        jPanel5.add(jPanel14);
        jPanel14.setBounds(800, 460, 180, 170);

        Prioridad1StarWars.setColumns(20);
        Prioridad1StarWars.setRows(5);
        jScrollPane1.setViewportView(Prioridad1StarWars);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(40, 130, 240, 120);

        Prioridad1StarTrek.setColumns(20);
        Prioridad1StarTrek.setRows(5);
        jScrollPane2.setViewportView(Prioridad1StarTrek);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(1028, 130, 240, 120);

        Prioridad2StarTrek.setColumns(20);
        Prioridad2StarTrek.setRows(5);
        jScrollPane3.setViewportView(Prioridad2StarTrek);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(1030, 280, 240, 120);

        Prioridad3StarTrek.setColumns(20);
        Prioridad3StarTrek.setRows(5);
        jScrollPane4.setViewportView(Prioridad3StarTrek);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(1030, 440, 240, 120);

        Prioridad2StarWars.setColumns(20);
        Prioridad2StarWars.setRows(5);
        jScrollPane5.setViewportView(Prioridad2StarWars);

        jPanel5.add(jScrollPane5);
        jScrollPane5.setBounds(40, 280, 240, 120);

        Prioridad3StarWars.setColumns(20);
        Prioridad3StarWars.setRows(5);
        jScrollPane6.setViewportView(Prioridad3StarWars);

        jPanel5.add(jScrollPane6);
        jScrollPane6.setBounds(40, 440, 240, 120);

        RefuerzoStarWars.setColumns(20);
        RefuerzoStarWars.setRows(5);
        jScrollPane7.setViewportView(RefuerzoStarWars);

        jPanel5.add(jScrollPane7);
        jScrollPane7.setBounds(40, 600, 240, 100);

        RefuerzoStarTrek.setColumns(20);
        RefuerzoStarTrek.setRows(5);
        jScrollPane8.setViewportView(RefuerzoStarTrek);

        jPanel5.add(jScrollPane8);
        jScrollPane8.setBounds(1030, 600, 240, 100);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel24.setText("Resultado");

        Resultado_Combate.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Resultado_Combate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Resultado_Combate.setText("-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Resultado_Combate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel24)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(Resultado_Combate))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4);
        jPanel4.setBounds(560, 500, 220, 99);

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Cola prioridad 2");
        jPanel5.add(jLabel26);
        jLabel26.setBounds(40, 260, 230, 24);

        ListaGanadores.setColumns(20);
        ListaGanadores.setRows(5);
        jScrollPane9.setViewportView(ListaGanadores);

        jPanel5.add(jScrollPane9);
        jScrollPane9.setBounds(420, 700, 238, 90);

        Character_Icon_starwars.setBackground(new java.awt.Color(255, 51, 51));
        Character_Icon_starwars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/placeholder.png"))); // NOI18N
        jPanel5.add(Character_Icon_starwars);
        Character_Icon_starwars.setBounds(350, 110, 250, 330);

        Character_Icon_startrek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/placeholder.png"))); // NOI18N
        jPanel5.add(Character_Icon_startrek);
        Character_Icon_startrek.setBounds(740, 110, 250, 330);

        Iniciar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Iniciar.setText("INICIAR SIMULACION");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        jPanel5.add(Iniciar);
        Iniciar.setBounds(1030, 720, 240, 60);

        Velocidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VelocidadStateChanged(evt);
            }
        });
        jPanel5.add(Velocidad);
        Velocidad.setBounds(880, 750, 120, 30);

        jLabel27.setFont(new java.awt.Font("Krungthep", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vs.png"))); // NOI18N
        jPanel5.add(jLabel27);
        jLabel27.setBounds(640, 230, 60, 60);

        jLabel8.setFont(new java.awt.Font("Krungthep", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/st-logo.png"))); // NOI18N
        jPanel5.add(jLabel8);
        jLabel8.setBounds(1070, 40, 190, 50);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("wins");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(980, 30, 30, 16);

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("wins");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(250, 30, 30, 16);

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Velocidad (seg)");
        jPanel5.add(jLabel30);
        jLabel30.setBounds(880, 730, 120, 17);

        jLabel6.setFont(new java.awt.Font("Krungthep", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg-space.png"))); // NOI18N
        jPanel5.add(jLabel6);
        jLabel6.setBounds(0, 0, 1300, 800);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
        if(iniciado == false){
            iniciado = true;
            
            for (int i = 0; i < 20; i++) {
            int random=(int)(Math.random()*9);
            Global.getStudioStarTrek().CreateCharacter(Global.getStarTrek()[i], Global.getObjetos()[random],admin.getIdCh());
            admin.setIdCh(admin.getIdCh()+1);
            random=(int)(Math.random()*9);
            Global.getStudioStarWars().CreateCharacter(Global.getStarWars()[i], Global.getObjetos()[random],admin.getIdCh());
            admin.setIdCh(admin.getIdCh()+1);
            }
            getPrioridad1StarTrek().setText(Global.getStudioStarTrek().getPrioridad1().imprimir());
            getPrioridad2StarTrek().setText(Global.getStudioStarTrek().getPrioridad2().imprimir());
            getPrioridad3StarTrek().setText(Global.getStudioStarTrek().getPrioridad3().imprimir());
            getRefuerzoStarTrek().setText(Global.getStudioStarTrek().getRefuerzo().imprimir());
            
            getPrioridad1StarWars().setText(Global.getStudioStarWars().getPrioridad1().imprimir());
            getPrioridad2StarWars().setText(Global.getStudioStarWars().getPrioridad2().imprimir());
            getPrioridad3StarWars().setText(Global.getStudioStarWars().getPrioridad3().imprimir());
            getRefuerzoStarWars().setText(Global.getStudioStarWars().getRefuerzo().imprimir());
            
            this.Velocidad.setValue(10);
            admin.ia.setWaitingTime(((int)this.Velocidad.getValue())*1000);
            admin.start();
            Iniciar.setText("SIMULANDO...");
        }else{
            JOptionPane.showMessageDialog(null, "Ya la simulación empezó!");
        }  
        
    }//GEN-LAST:event_IniciarActionPerformed

    private void VelocidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VelocidadStateChanged
        // TODO add your handling code here:
        if(iniciado == true){
            if((int)this.Velocidad.getValue() <= 0){
                this.Velocidad.setValue(1);
                this.repaint();
            }else{
                admin.ia.setWaitingTime(((int)this.Velocidad.getValue())*1000);
            }
        }else{
            this.Velocidad.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_VelocidadStateChanged
    
    
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JLabel Agilidad_StarTrek;
    protected static javax.swing.JLabel Agilidad_StarWars;
    private static javax.swing.JLabel Character_Icon_startrek;
    private static javax.swing.JLabel Character_Icon_starwars;
    protected static javax.swing.JLabel Fuerza_StarTrek;
    protected static javax.swing.JLabel Fuerza_StarWars;
    protected static javax.swing.JLabel HP_StarTrek;
    protected static javax.swing.JLabel HP_StarWars;
    protected static javax.swing.JLabel Habilidad_StarTrek;
    protected static javax.swing.JLabel Habilidad_StarWars;
    private static javax.swing.JLabel IA_State;
    private javax.swing.JButton Iniciar;
    private static javax.swing.JTextArea ListaGanadores;
    protected static javax.swing.JLabel Objeto_StarTrek;
    protected static javax.swing.JLabel Objeto_StarWars;
    private static javax.swing.JTextArea Prioridad1StarTrek;
    private static javax.swing.JTextArea Prioridad1StarWars;
    private static javax.swing.JTextArea Prioridad2StarTrek;
    private static javax.swing.JTextArea Prioridad2StarWars;
    private static javax.swing.JTextArea Prioridad3StarTrek;
    private static javax.swing.JTextArea Prioridad3StarWars;
    private static javax.swing.JTextArea RefuerzoStarTrek;
    private static javax.swing.JTextArea RefuerzoStarWars;
    private static javax.swing.JLabel Resultado_Combate;
    private javax.swing.JSpinner Velocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private static javax.swing.JLabel marcadorStarTrek;
    private static javax.swing.JLabel marcadorStarWars;
    // End of variables declaration//GEN-END:variables
}
