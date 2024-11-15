# Tugas2_KonversiSuhu
 Tugas2-Cahya Hayyuni-2210010118
 
# 1. Deskripsi Program
Program Konversi Suhu ini adalah aplikasi sederhana berbasis Java yang memungkinkan pengguna untuk memasukkan nilai suhu dalam skala Celcius dan mengonversinya ke skala suhu lain, yaitu Fahrenheit, Reamur, atau Kelvin. Program ini dibuat menggunakan JFrame sebagai antarmuka pengguna dan dijalankan melalui NetBeans IDE 8.2.

Aplikasi ini akan menerima input suhu dalam satu skala (Celsius, Fahrenheit, Kelvin, atau Reamur), lalu mengonversinya ke skala lain sesuai pilihan pengguna. Hasilnya akan ditampilkan setelah pengguna menekan tombol "Konversi".

# 2. Komponen GUI ke JFrame
- JPanel: Sebagai container utama.
- JLabel: Sebagai label untuk input suhu, hasil konversi, dan informasi tambahan.
- JTextField: Untuk pengguna memasukkan nilai suhu.
- JComboBox: Untuk memilih skala awal dan skala tujuan.
- JButton: Tombol untuk melakukan konversi suhu.
- JRadioButton (opsional): Jika Anda ingin memberikan opsi arah konversi.

Metode Konversi: 
• Kotak kombo untuk memilih skala suhu tujuan.
Program ini memiliki metode konversi dari masing-masing skala suhu ke skala lainnya:
- Celsius ke Fahrenheit, Celsius ke Kelvin, Celsius ke Reamur
- Fahrenheit ke Celsius, Fahrenheit ke Kelvin, Fahrenheit ke Reamur
- Kelvin ke Celsius, Kelvin ke Fahrenheit, Kelvin ke Reamur
- Reamur ke Celsius, Reamur ke Fahrenheit, Reamur ke Kelvin

• Tombol-tombol radio untuk memilih skala suhu awal.
Pilihan mode konversi suhu:
- Celsius -> skala lain
- Fahrenheit -> skala lain
- Kelvin -> skala lain
- Reamur -> skala lain
  
• Hasil konversi ditampilkan setelah tombol ditekan. Input suhu yang validasi otomatis untuk hanya menerima angka dan desimal.

# 3. Logika Program:
Rumus konversi, validasi input
   
# 4. Events

• ActionListener untuk tombol Konversi
~~~
    private void buttonKonversiActionPerformed(java.awt.event.ActionEvent evt) {                                               
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
    
    }
~~~   
• Tombol Konversi diklik akan menampilkan hasil konversi dari
~~~
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
~~~

5. Variasi:
• Tambahkan skala suhu lain seperti Reamur dan Kelvin
~~~
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
~~~
• Tambahkan ItemListener pada JRadioButton untuk memilih arah konversi
~~~
  private void CelciusToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {                                                    
    if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSkala.removeAllItems();
            comboSkala.addItem("Celsius ke Fahrenheit");
            comboSkala.addItem("Celsius ke Kelvin");
            comboSkala.addItem("Celsius ke Reamur");
        }
    }                                                   

    private void FahrenheitToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {                                                       
      if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSkala.removeAllItems();
            comboSkala.addItem("Fahrenheit ke Celsius");
            comboSkala.addItem("Fahrenheit ke Kelvin");
            comboSkala.addItem("Fahrenheit ke Reamur");
        }
    } 

    private void ReamurToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {                                                   
    if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSkala.removeAllItems();
            comboSkala.addItem("Kelvin ke Celsius");
            comboSkala.addItem("Kelvin ke Fahrenheit");
            comboSkala.addItem("Kelvin ke Reamur");
        }
    }                                                  

    private void KelvinToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {                                                   
    if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSkala.removeAllItems();
            comboSkala.addItem("Reamur ke Celsius");
            comboSkala.addItem("Reamur ke Fahrenheit");
            comboSkala.addItem("Reamur ke Kelvin");
        }
    } 

 ~~~
• Implementasikan konversi otomatis saat nilai input berubah
~~~
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
~~~
## Gambar
![](https://github.com/AyaComel/Tugas2_KonversiSuhu/blob/main/Tugas2.png)

## Indikator Penilaian:

| No  | Komponen         |  Persentase  |
| :-: | --------------   |   :-----:    |
|  1  | Komponen GUI     |    10    |
|  2  | Logika Program   |    20    |
|  3  | Kesesuaian UI    |    15    |
|  4  | Constructor      |    15    |
|  5  | Memenuhi Variasi |    40    |
|     | TOTAL        | 100 |

## Pembuat

Nama  : Cahya Hayyuni
NPM   : 2210010118
