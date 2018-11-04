
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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Usuario-pc
 */
public class GestionPeliculas extends javax.swing.JFrame {
       File Archivo=new File("Peliculas.txt");
       File Imagenes=new File("Imagenes.txt");
       Peliculas p=new Peliculas();
        DefaultListModel lista;
       File fichero;
//       public static String Registros[][] = new String [250][10];
    public GestionPeliculas() {
        initComponents();
        lista=new DefaultListModel();
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
        public DefaultListModel Lista(File Archivo){
           DefaultListModel Milista=new DefaultListModel();
           try{
               FileReader fr=new FileReader(Archivo);
               BufferedReader br=new BufferedReader(fr);
               String D;
               while((D=br.readLine())!=null){
                   StringTokenizer dato=new StringTokenizer(D,",");
                   Vector X=new Vector();
                   while(dato.hasMoreTokens()){
                       X.addElement(dato.nextToken());
                   }
                   Milista.addElement(X);
               }
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
           return Milista;
       } 
        
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
//       public void ReadFile(File Archivo){
//           String Dato;
//           Boolean Bandera = true;
////                String Datos []=new String[3];
//                //File archivo = new File(NombreArchivo+".txt");
//                try {
//                    if(Archivo.exists()){
//                        BufferedReader br;
//                        br = new BufferedReader(new FileReader(Archivo));
//                        int index=0;
//                        while(Bandera){
//                            Dato=br.readLine();
//                            System.out.println(Dato);
//                            if((null==Dato)||Dato.equals("")){
//                                Bandera=false;
//                            }else{
//                                    GestionPeliculas.Registros[index++]=(Dato.split(",", 20));
//                                    String dato []=new String[4];
//                                    dato[0]=GestionPeliculas.Registros[index-1][0];
//                                    dato[1]=GestionPeliculas.Registros[index-1][1];
//                                    dato[2]=GestionPeliculas.Registros[index-1][2];
//                                    dato[3]=GestionPeliculas.Registros[index-1][3];
////                                    Datos[3]=dato[0]+" "+dato[1]+" "+dato[2];
//                                    lista.addElement(dato);
//                            }
//                        }
//                        System.out.println(index);
//                        br.close();
//                        jList1.setModel(lista);
//                    }
//                } catch (IOException ex){
//                        Logger.getLogger(Peliculas.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NombreP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Duración = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        NombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePActionPerformed(evt);
            }
        });

        jLabel2.setText("Duración:");

        Duración.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DuraciónKeyTyped(evt);
            }
        });

        jLabel3.setText("Hora:");

        jLabel4.setText("A");

        jScrollPane1.setViewportView(jList1);

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        BuscarImagen.setText("Agregar Imagen");
        BuscarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarImagenActionPerformed(evt);
            }
        });

        Peli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        try {
            HoraF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## ??")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            HoraI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## ??")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        HoraI.setText("  :     ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(HoraI, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Duración, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Agregar)
                                .addGap(67, 67, 67)
                                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Modificar)
                                .addGap(129, 129, 129)))))
                .addComponent(Peli, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuscarImagen)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Peli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Duración, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Eliminar)
                            .addComponent(Agregar))
                        .addGap(69, 69, 69)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Consultar)
                    .addComponent(BuscarImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
        jList1.setModel(Lista(Archivo));
//         ReadFile(Archivo);
        p.guardar(p);
        Limpiar();
       
    }//GEN-LAST:event_AgregarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
//         ReadFile(Archivo);
       jList1.setModel(Lista(Archivo));
    }//GEN-LAST:event_ConsultarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
           
              lista=(DefaultListModel) jList1.getModel();
               int index = jList1.getSelectedIndex();
               if (lista.getSize()>=0) {
                if (index>=0){
              if(JOptionPane.YES_OPTION==
              JOptionPane.showConfirmDialog(null, "Desea eliminar la pelicula? " )){
                lista.remove(index);  
//            DefaultListModel listModel = new DefaultListModel();
            //Recorrer el contenido del ArrayList
//            for(int i=0; i<lista.size(); i++) {
//                //Añadir cada elemento del ArrayList en el modelo de la lista
//                listModel.add(i, (lista.get(i)+"-"+lista.get(i)));
//                }
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
       
    private void DuraciónKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DuraciónKeyTyped
            if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }    
    }//GEN-LAST:event_DuraciónKeyTyped

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
           lista=(DefaultListModel) jList1.getModel();
        if(lista.getSize()>0){
            int index = jList1.getSelectedIndex();
            if(JOptionPane.YES_OPTION==
            JOptionPane.showConfirmDialog(null, "Desea modificar la pelicula? " )){  
            DefaultListModel listModel = new DefaultListModel();
            //Recorrer el contenido del ArrayList
            for(int i=0; i<lista.size(); i++) {
                NombreP.setText(lista.get(i).toString());
                Duración.setText(lista.get(i).toString());
              }          
            }
        }
    }//GEN-LAST:event_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton BuscarImagen;
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField Duración;
    private javax.swing.JButton Eliminar;
    private javax.swing.JFormattedTextField HoraF;
    private javax.swing.JFormattedTextField HoraI;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField NombreP;
    private javax.swing.JLabel Peli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
