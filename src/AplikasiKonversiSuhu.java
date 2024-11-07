import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class AplikasiKonversiSuhu extends javax.swing.JFrame {
   
    
    public AplikasiKonversiSuhu() {
        initComponents();
        setupDocumentListener();
    }
    
    // Metode setupDocumentListener() untuk menambahkan DocumentListener ke inputSuhuField
    private void setupDocumentListener(){
        Suhuu.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                btnKonversiActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                btnKonversiActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                btnKonversiActionPerformed();
            }        

            private void btnKonversiActionPerformed() {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });  
}
    
// Dari Celsius ke skala lain
private double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
}

private double celsiusToReamur(double celsius) {
    return celsius * 4/5;
}

private double celsiusToKelvin(double celsius) {
    return celsius + 273.15;
}
// Dari Fahrenheit ke skala lain
private double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5/9;
}

private double fahrenheitToReamur(double fahrenheit) {
    return (fahrenheit - 32) * 4/9;
}

private double fahrenheitToKelvin(double fahrenheit) {
    return (fahrenheit - 32) * 5/9 + 273.15;
} 

// Dari Kelvin
private double kelvinToCelsius(double kelvin) {
    return kelvin - 273.15;
}

private double kelvinToFahrenheit(double kelvin) {
    return (kelvin - 273.15) * 9/5 + 32;
}

private double kelvinToReamur(double kelvin) {
    return (kelvin - 273.15) * 4/5;
}
    
// Dari Reamur
private double reamurToCelsius(double reamur) {
    return reamur * 5/4;
}

private double reamurToFahrenheit(double reamur) {
    return reamur * 9/4 + 32;
}

private double reamurToKelvin(double reamur) {
    return reamur * 5/4 + 273.15;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelHasiltxt = new javax.swing.JLabel();
        Suhuu = new javax.swing.JTextField();
        comboSkala = new javax.swing.JComboBox<>();
        CelciusToSkalaLain = new javax.swing.JRadioButton();
        FahrenheitToSkalaLain = new javax.swing.JRadioButton();
        buttonKonversi = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        ReamurToSkalaLain = new javax.swing.JRadioButton();
        KelvinToSkalaLain = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Masukkan Suhu   :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Skala   :");

        labelHasiltxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Suhuu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Suhuu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SuhuuFocusGained(evt);
            }
        });
        Suhuu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SuhuuKeyTyped(evt);
            }
        });

        comboSkala.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboSkala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        buttonGroup1.add(CelciusToSkalaLain);
        CelciusToSkalaLain.setText("Celcius -> Skala Lain");
        CelciusToSkalaLain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CelciusToSkalaLainItemStateChanged(evt);
            }
        });

        buttonGroup1.add(FahrenheitToSkalaLain);
        FahrenheitToSkalaLain.setText("Fahrenheit -> Skala Lain");
        FahrenheitToSkalaLain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FahrenheitToSkalaLainItemStateChanged(evt);
            }
        });

        buttonKonversi.setBackground(new java.awt.Color(255, 204, 204));
        buttonKonversi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonKonversi.setText("Hitung");
        buttonKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKonversiActionPerformed(evt);
            }
        });

        buttonHapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonKeluar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        buttonGroup1.add(ReamurToSkalaLain);
        ReamurToSkalaLain.setText("Reamur -> Skala Lain");
        ReamurToSkalaLain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ReamurToSkalaLainItemStateChanged(evt);
            }
        });

        buttonGroup1.add(KelvinToSkalaLain);
        KelvinToSkalaLain.setText("Kelvin -> Skala Lain");
        KelvinToSkalaLain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                KelvinToSkalaLainItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(502, Short.MAX_VALUE)
                .addComponent(buttonHapus)
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addComponent(Suhuu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelHasiltxt)
                                    .addComponent(jLabel3))
                                .addGap(40, 40, 40)
                                .addComponent(comboSkala, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonKonversi)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ReamurToSkalaLain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CelciusToSkalaLain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FahrenheitToSkalaLain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KelvinToSkalaLain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Suhuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboSkala, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHasiltxt)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelciusToSkalaLain)
                    .addComponent(FahrenheitToSkalaLain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReamurToSkalaLain)
                    .addComponent(KelvinToSkalaLain))
                .addGap(32, 32, 32)
                .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("APLIKASI KONVERSI SUHU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKonversiActionPerformed
    try {
        
            double inputSuhu = Double.parseDouble(Suhuu.getText());
            String hasilKonversi = (String) comboSkala.getSelectedItem();
            double hasil = 0.0;

        // Periksa arah konversi berdasarkan pilihan JRadioButton
        if (CelciusToSkalaLain.isSelected()) {
            // Konversi dari Celsius ke skala yang dipilih
            switch (hasilKonversi) {
                case "Celsius ke Fahrenheit":
                    hasil = celsiusToFahrenheit(inputSuhu);
                    break;
                case "Celsius ke Kelvin":
                    hasil = celsiusToKelvin(inputSuhu);
                    break;
                case "Celsius ke Reamur":
                    hasil = celsiusToReamur(inputSuhu);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                    break;
                    
            }
        } else if (FahrenheitToSkalaLain.isSelected()) {
            // Konversi dari Fahrenheit ke skala yang dipilih
            switch (hasilKonversi) {
                case "Fahrenheit ke Celsius":
                    hasil = fahrenheitToCelsius(inputSuhu);
                    break;
                case "Fahrenheit ke Kelvin":
                    hasil = fahrenheitToKelvin(inputSuhu);
                    break;
                case "Fahrenheit ke Reamur":
                    hasil = fahrenheitToReamur(inputSuhu);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                    break;    
            }
        } else if (ReamurToSkalaLain.isSelected()) {
            switch (hasilKonversi) {
                case "Kelvin ke Celsius":
                    hasil = kelvinToCelsius(inputSuhu);
                    break;
                case "Kelvin ke Fahrenheit":
                    hasil = kelvinToFahrenheit(inputSuhu);
                    break;
                case "Kelvin ke Reamur":
                    hasil = kelvinToReamur(inputSuhu);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                    break;
            }
        } else if (KelvinToSkalaLain.isSelected()) {
            switch (hasilKonversi) {
                case "Reamur ke Celsius":
                    hasil = reamurToCelsius(inputSuhu);
                    break;
                case "Reamur ke Fahrenheit":
                    hasil = reamurToFahrenheit(inputSuhu);
                    break;
                case "Reamur ke Kelvin":
                    hasil = reamurToKelvin(inputSuhu);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                    break;
                }
            }

         labelHasiltxt.setText("" + hasil);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
        }
    
    }//GEN-LAST:event_buttonKonversiActionPerformed

    private void SuhuuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SuhuuKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_SuhuuKeyTyped

    private void CelciusToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CelciusToSkalaLainItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSkala.removeAllItems();
            comboSkala.addItem("Celsius ke Fahrenheit");
            comboSkala.addItem("Celsius ke Kelvin");
            comboSkala.addItem("Celsius ke Reamur");
        }
    }//GEN-LAST:event_CelciusToSkalaLainItemStateChanged

    private void FahrenheitToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FahrenheitToSkalaLainItemStateChanged
      if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSkala.removeAllItems();
            comboSkala.addItem("Fahrenheit ke Celsius");
            comboSkala.addItem("Fahrenheit ke Kelvin");
            comboSkala.addItem("Fahrenheit ke Reamur");
        }
    }//GEN-LAST:event_FahrenheitToSkalaLainItemStateChanged

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
      System.exit(0);
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
    buttonHapus.addActionListener((ActionEvent e) -> {
        // Mengosongkan JTextField untuk input suhu
        Suhuu.setText("");
        
        // Reset JComboBox ke item pertama (misalnya, Celsius)
        comboSkala.setSelectedIndex(0);
        
        // Kosongkan JLabel hasil
        labelHasiltxt.setText(" ");
        
        // Reset pilihan JRadioButton ke kondisi default (misalnya, Celsius ke Fahrenheit)
        CelciusToSkalaLain.setSelected(true); // Set ulang ke Celsius ke Fahrenheit
    });
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void ReamurToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ReamurToSkalaLainItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSkala.removeAllItems();
            comboSkala.addItem("Kelvin ke Celsius");
            comboSkala.addItem("Kelvin ke Fahrenheit");
            comboSkala.addItem("Kelvin ke Reamur");
        }
    }//GEN-LAST:event_ReamurToSkalaLainItemStateChanged

    private void KelvinToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_KelvinToSkalaLainItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSkala.removeAllItems();
            comboSkala.addItem("Reamur ke Celsius");
            comboSkala.addItem("Reamur ke Fahrenheit");
            comboSkala.addItem("Reamur ke Kelvin");
        }
    }//GEN-LAST:event_KelvinToSkalaLainItemStateChanged

    private void SuhuuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SuhuuFocusGained
    Suhuu.setText("");
    }//GEN-LAST:event_SuhuuFocusGained
    
    

            
    
    
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
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiKonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CelciusToSkalaLain;
    private javax.swing.JRadioButton FahrenheitToSkalaLain;
    private javax.swing.JRadioButton KelvinToSkalaLain;
    private javax.swing.JRadioButton ReamurToSkalaLain;
    private javax.swing.JTextField Suhuu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonKonversi;
    private javax.swing.JComboBox<String> comboSkala;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelHasiltxt;
    // End of variables declaration//GEN-END:variables

   
}