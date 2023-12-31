/*
 * To change this license header, choose License Headeres in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyFormulaire;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nyClasses.client;
import nyGestionBd.gest_client;

/**
 *
 * @author TSIAHY DONILLY
 */
public class cude_client extends javax.swing.JInternalFrame {

    /**
     * Creates new form cude_client
     *
     */
    public cude_client() {
        initComponents();
        chargerListe();
        actualiser();

    }

    public void actualiser() {
        nbr_num.setText("");
        txt_nom.setText("");
        txt_prenom.setText("");
        txt_adresse.setText("");
        nbr_telephone.setText("");
    }

    public void chargerListe() {
        String titre[] = {"id_cli", "nom", "prenom", "adresse", "telephone"};
        Object save[][] = new Object[1][1];
        try {
            gest_client ga = new gest_client();
            int nbr = ga.countSave();
            save = new Object[nbr][titre.length];

            ResultSet res = ga.getALLCLI();

            int i = 0;
            while (res.next()) {
                save[i][0] = (Object) res.getString("id_client");
                save[i][1] = (Object) res.getString("nom_cli");
                save[i][2] = (Object) res.getString("prenom_cli");
                save[i][3] = (Object) res.getString("adress_cli");
                save[i][4] = (Object) res.getString("tel");

                i++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        tableau.setModel(new DefaultTableModel(save, titre));
        jScrollPane1.setViewportView(tableau);
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
        nbr_num = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_adresse = new javax.swing.JTextField();
        nbr_telephone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableau = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_recherche = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1059, 656));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nbr_num.setName(""); // NOI18N
        nbr_num.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nbr_numFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nbr_numFocusLost(evt);
            }
        });
        nbr_num.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nbr_numMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nbr_numMouseExited(evt);
            }
        });
        nbr_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbr_numActionPerformed(evt);
            }
        });
        nbr_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nbr_numKeyTyped(evt);
            }
        });
        jPanel1.add(nbr_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 240, -1));

        txt_nom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_nomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_nomMouseExited(evt);
            }
        });
        jPanel1.add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 240, -1));

        txt_prenom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_prenomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_prenomMouseExited(evt);
            }
        });
        jPanel1.add(txt_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 240, -1));

        txt_adresse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_adresseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_adresseMouseExited(evt);
            }
        });
        jPanel1.add(txt_adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 240, -1));
        jPanel1.add(nbr_telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 240, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nyFormulaire/add.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 120, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nyFormulaire/update_user_16px.png"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nyFormulaire/delete_16px.png"))); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, 30));

        tableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tableau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableauMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableau);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 560, 290));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Numero");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nom");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Prenom");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Adresse");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telephone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));
        jPanel1.add(txt_recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 200, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nyFormulaire/search_24px.png"))); // NOI18N
        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nyFormulaire/client_management_40px.png"))); // NOI18N
        jLabel6.setText("CLIENT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nbr_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbr_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbr_numActionPerformed

    private void nbr_numFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nbr_numFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_nbr_numFocusGained

    private void nbr_numFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nbr_numFocusLost
        // TODO add your handling code here:
        /*  if(jTextField1.getText().isEmpty()){
           jTextField1.setText("name");
        }*/
    }//GEN-LAST:event_nbr_numFocusLost

    private void nbr_numMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nbr_numMouseEntered
        // TODO add your handling code here:


    }//GEN-LAST:event_nbr_numMouseEntered

    private void nbr_numMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nbr_numMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_nbr_numMouseExited

    private void txt_nomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nomMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_nomMouseEntered

    private void txt_nomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nomMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_nomMouseExited

    private void txt_prenomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_prenomMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_prenomMouseExited

    private void txt_prenomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_prenomMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_prenomMouseEntered

    private void txt_adresseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_adresseMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_adresseMouseEntered

    private void txt_adresseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_adresseMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_adresseMouseExited

    private void nbr_numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nbr_numKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_nbr_numKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String nume=txt_recherche.getText();
        
        String titre[] = {"id_cli", "nom", "prenom", "adresse", "telephone"};
        Object save[][] = new Object[1][1];
        
        try {
            gest_client gc=new gest_client();
                 
            int nbr = gc.countSave();
            save = new Object[nbr][titre.length];

            ResultSet res=gc.getById(nume);
            int i=0;
            while(res.next()){
                save[i][0] = (Object) res.getString("id_client");
                save[i][1] = (Object) res.getString("nom_cli");
                save[i][2] = (Object) res.getString("prenom_cli");
                save[i][3] = (Object) res.getString("adress_cli");
                save[i][4] = (Object) res.getString("tel");

                i++;
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        tableau.setModel(new DefaultTableModel(save, titre));
        jScrollPane1.setViewportView(tableau);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String num = nbr_num.getText();
          int bb = Integer.parseInt(num);

        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String adresse = txt_adresse.getText();
        String telephone = nbr_telephone.getText();
     
        
        if (num.equals("") || nom.equals("") || prenom.equals("") || adresse.equals("") || telephone.equals("")) {
            JOptionPane.showMessageDialog(null, "veullez remplir tous le champ");

        }
        if (!num.isEmpty()) {
            try {
                gest_client gc = new gest_client();
                ResultSet res = gc.getALLCLI();
                boolean existe = false;
                while (res.next()) {
                    int b = res.getInt("id_client");
                    
                    if (b==bb) {
                        existe = true;
                        break;

                    }

                }
                if (existe) {
                    JOptionPane.showMessageDialog(null, "ce client est deja existe");

                }
                if (!existe) {
                    try {
                        gest_client go = new gest_client();
                           
                      
                            int a = Integer.parseInt(telephone);
                            client client1 = new client(bb, nom, prenom, adresse, a);
                        go.insert(client1);

                        JOptionPane.showMessageDialog(null, "ajout reeussiii!!");
                        chargerListe();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        /*     String num = nbr_num.getText();
int bb = Integer.pareseInt(num);
String nom = txt_nom.getText();
String prenom = txt_prenom.getText();
String adresse = txt_adresse.getText();
String telephone = nbr_telephone.getText();
int a = Integer.pareseInt(telephone);

client client1 = new client(bb, nom, prenom, adresse, a);

if (num.isEmpty() || nom.isEmpty() || prenom.isEmpty() || adresse.isEmpty() || telephone.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs.");
} else {
    try {
        gest_client gc = new gest_client();

        // Vérifier si le client existe déjà
        boolean existe = gc.clientExists(bb);

        if (existe) {
            JOptionPane.showMessageDialog(null, "Ce client existe déjà.");
        } else {
            // Insérer le nouveau client
            gc.insert(client1);
            JOptionPane.showMessageDialog(null, "Ajout réussi !");
            chargerListe();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
         */


    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableauMouseClicked
        // TODO add your handling code here:
        int nbrow = tableau.getSelectedRow();
        nbr_num.setText(String.valueOf(tableau.getValueAt(nbrow, 0)));
        txt_nom.setText(String.valueOf(tableau.getValueAt(nbrow, 1)));
        txt_prenom.setText(String.valueOf(tableau.getValueAt(nbrow, 2)));
        txt_adresse.setText(String.valueOf(tableau.getValueAt(nbrow, 3)));
        nbr_telephone.setText(String.valueOf(tableau.getValueAt(nbrow, 4)));
    }//GEN-LAST:event_tableauMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String txt_condi = nbr_num.getText();

        if (txt_condi.equals("")) {
            JOptionPane.showMessageDialog(null, "veullez selectioner l'element supprimer");
        } else {
            int p = JOptionPane.showConfirmDialog(null, "do you supprimer", "delete", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                try {

                    gest_client gc = new gest_client();
                    gc.delete(txt_condi);
                    JOptionPane.showMessageDialog(null, "suppresion reusii!!");
                    chargerListe();
                    actualiser();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String num = nbr_num.getText();

        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();

        String adresse = txt_adresse.getText();
        String telephone = nbr_telephone.getText();

        if (num.equals("")) {
            JOptionPane.showMessageDialog(null, "veullez selection l'element que vous voulez modifier");
        } else {
            try {
                int paresenum = Integer.parseInt(num);
                int paresphone = Integer.parseInt(telephone);
                client cli = new client(paresenum, nom, prenom, adresse, paresphone);
                gest_client gc = new gest_client();
                gc.update(num, cli);
                JOptionPane.showMessageDialog(null, "modification reussi!!");
                chargerListe();
                actualiser();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nbr_num;
    private javax.swing.JTextField nbr_telephone;
    private javax.swing.JTable tableau;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_recherche;
    // End of variables declaration//GEN-END:variables
}
