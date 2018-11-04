
package Admin;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Usuario-pc
 */
import java.awt.Component;
import java.awt.Window;
public class GestionPeliculas extends javax.swing.JFrame {
       File Archivo=new File("Peliculas.txt");
       File Imagenes=new File("Imagenes.txt");
       Peliculas p=new Peliculas();
       DefaultListModel lista = new DefaultListModel(); 
       File fichero;
       public static String Registros[][] = new String [250][10];
    public GestionPeliculas() {
        initComponents();
        jList1.setModel(lista);
        setLocationRelativeTo(null);      
    }
      private void Limpiar(){
       NombreP.setText(null);
       Duración.setText(null);
       HoraI.setText(null);
       HoraF.setText(null);
       Peli.setIcon(null);
    }
//        public DefaultListModel Lista(File Archivo){
//           DefaultListModel Milista=new DefaultListModel();
//           try{
//               FileReader fr=new FileReader(Archivo);
//               BufferedReader br=new BufferedReader(fr);
//               String D;
//               while((D=br.readLine())!=null){
//                   StringTokenizer dato=new StringTokenizer(D,",");
//                   Vector X=new Vector();
//                   while(dato.hasMoreTokens()){
//                       X.addElement(dato.nextToken());
//                   }
//                   Milista.addElement(X);
//               }
//           }catch(Exception e){
//               JOptionPane.showMessageDialog(null, e);
//           }
//           return Milista;
//       } 
        
          public void SaveFile(Peliculas p,File Archivo){
               try {
                   FileWriter fw=new FileWriter(Archivo,true);
                   try (BufferedWriter bw = new BufferedWriter(fw)) {
                       bw.write(p.getNombre()+", "+"Tiempo:"+p.getDuración()+" min"+", "+"Hora:"+p.getIn()+"-"+p.getFin());
                       bw.newLine();
                   }
                   JOptionPane.showMessageDialog(null,"Pelicula Agregada");
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, e);
               }
         }
         public void SaveImagen(File fichero,File Archivo){
              try {
                   FileWriter fw=new FileWriter(Archivo,true);
                   try (BufferedWriter bw = new BufferedWriter(fw)) {
                       bw.write(" "+fichero);
                       bw.newLine();
                   }
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, e);
               }
         }
       public void ReadFile(File Archivo){
           jList1.removeAll();
           String Dato;
           Boolean Bandera = true;
//                String Datos []=new String[3];
                //File archivo = new File(NombreArchivo+".txt");
                try {
                    if(Archivo.exists()){
                        BufferedReader br;
                        br = new BufferedReader(new FileReader(Archivo));
                        int index=0;
                        lista.removeAllElements();
                        while(Bandera){
                            Dato=br.readLine();
                            System.out.println(Dato);
                            if((null==Dato)||Dato.equals("")){
                                Bandera=false;
                            }else{
                                    GestionPeliculas.Registros[index++]=(Dato.split(",", 20));
                                    String dato []=new String[3];
                                    dato[0]=GestionPeliculas.Registros[index-1][0];
                                    dato[1]=GestionPeliculas.Registros[index-1][1];
                                    dato[2]=GestionPeliculas.Registros[index-1][2];
//                                    Datos[3]=dato[0]+dato[1]+dato[2];
                                    lista.addElement(Dato);
                            }
                        }
                        System.out.println(index);
                        br.close();  
                        jList1.setModel(lista);
                    }
                } catch (IOException ex){
                        Logger.getLogger(Peliculas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NombreP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        BuscarImagen = new javax.swing.JButton();
        Peli = new javax.swing.JLabel();
        HoraF = new javax.swing.JFormattedTextField();
        HoraI = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        Duración = new javax.swing.JFormattedTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 88, -1, -1));

        NombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePActionPerformed(evt);
            }
        });
        NombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombrePKeyTyped(evt);
            }
        });
        getContentPane().add(NombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 85, 157, -1));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Duración:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 120, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Hora:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 37, -1));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("A");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 16, 20));

        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 383, 740, 286));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 90, 28));

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 107, -1));

        Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 344, -1, -1));

        BuscarImagen.setText("Agregar Imagen");
        BuscarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarImagenActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 344, -1, -1));

        Peli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Peli, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 11, 272, 327));

        try {
            HoraF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(HoraF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 80, -1));

        try {
            HoraI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(HoraI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 67, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        try {
            Duración.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Duración.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DuraciónKeyTyped(evt);
            }
        });
        getContentPane().add(Duración, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura-de-pantalla-2017-03-30-a-las-11.59.05.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        String nombre=NombreP.getText();
       int Duracion=Integer.parseInt(Duración.getText());
        p.setNombre(nombre);
        p.setDuración(Duracion);
        SaveFile(p, Archivo);
        SaveImagen(fichero, Imagenes);
//      jList1.setModel(Lista(Archivo));
        ReadFile(Archivo);
        p.guardar(p);
        Limpiar();
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
         ReadFile(Archivo);
//       jList1.setModel(Lista(Archivo));
    }//GEN-LAST:event_ConsultarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
           
              lista=(DefaultListModel) jList1.getModel();
               int index = jList1.getSelectedIndex();
               if (lista.getSize()>=0) {
                if (index>=0){
              if(JOptionPane.YES_OPTION==
              JOptionPane.showConfirmDialog(null, "Desea eliminar la pelicula? " )){
                lista.remove(index);  
//            
            //Recorrer el contenido del ArrayList

                  } 
               }else{
                JOptionPane.showMessageDialog(this, "Selecciona la fila a eliminar");
               }
            }
               
           
    }//GEN-LAST:event_EliminarActionPerformed

    private void BuscarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarImagenActionPerformed
          int resultado;
      
           AgregarImagen ventana = new AgregarImagen();
           FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
           ventana.CargarFoto.setFileFilter(filtro);
           resultado= ventana.CargarFoto.showOpenDialog(null);
                if (JFileChooser.APPROVE_OPTION == resultado){
                  fichero = ventana.CargarFoto.getSelectedFile();
             try{
               ImageIcon icon = new ImageIcon(fichero.toString());
               Icon icono = new ImageIcon(icon.getImage().getScaledInstance(Peli.getWidth(), Peli.getHeight(), Image.SCALE_DEFAULT));
               Peli.setText(null);
               Peli.setIcon(icono);
          }catch(Exception ex){
                 JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex); 
               }
            } 
    }//GEN-LAST:event_BuscarImagenActionPerformed
       
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
           lista=(DefaultListModel) jList1.getModel();
        if(lista.getSize()>0){
            int index = jList1.getSelectedIndex();
            if(JOptionPane.YES_OPTION==
            JOptionPane.showConfirmDialog(null, "Desea modificar la pelicula? " )){  
            DefaultListModel listModel = new DefaultListModel();
            //Recorrer el contenido del ArrayList
                NombreP.setText(lista.get(index).toString());
                Duración.setText(lista.get(index).toString());
            }
        }

    }//GEN-LAST:event_ModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          GestionPeliculas obj=new GestionPeliculas();
          obj.setVisible(false);
          this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombrePKeyTyped
            if(Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }   
    }//GEN-LAST:event_NombrePKeyTyped

    private void DuraciónKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DuraciónKeyTyped
              if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }   
    }//GEN-LAST:event_DuraciónKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton BuscarImagen;
    private javax.swing.JButton Consultar;
    private javax.swing.JFormattedTextField Duración;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JFormattedTextField HoraF;
    private javax.swing.JFormattedTextField HoraI;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField NombreP;
    private javax.swing.JLabel Peli;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
