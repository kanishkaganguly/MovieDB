
import java.awt.image.BufferedImage;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import sun.misc.IOUtils;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nightstalker
 */
public class main extends javax.swing.JFrame {

    File file;
    final JFileChooser fc = new JFileChooser();
    String nameClick;
    int count = 0;

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        database = new javax.swing.JFrame();
        heading1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        movie_names = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        title_text = new javax.swing.JLabel();
        year_text = new javax.swing.JLabel();
        rated_text = new javax.swing.JLabel();
        genre_text = new javax.swing.JLabel();
        director_text = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plot_text = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        downloading = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        disclaimer = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        heading = new javax.swing.JLabel();
        heading_separator = new javax.swing.JSeparator();
        folder_show = new javax.swing.JButton();
        database_show = new javax.swing.JButton();
        selected_folder = new javax.swing.JLabel();

        database.setTitle("My Movies");
        database.setMinimumSize(new java.awt.Dimension(700, 500));
        database.setResizable(false);
        database.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                databaseWindowActivated(evt);
            }
        });
        database.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        heading1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        heading1.setText("MY MOVIES");
        database.getContentPane().add(heading1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));
        database.getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 650, 10));

        movie_names.setAutoCreateRowSorter(true);
        movie_names.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "MOVIE NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(movie_names);

        database.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 350, 320));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MOVIE INFO");
        database.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("TITLE");

        jLabel3.setText("RELEASE YEAR");

        jLabel4.setText("imdb RATING");

        jLabel5.setText("GENRE");

        jLabel6.setText("DIRECTOR");

        jLabel8.setText("PLOT");

        title_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_text.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        year_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        year_text.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rated_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rated_text.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        genre_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genre_text.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        director_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        director_text.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        plot_text.setColumns(20);
        plot_text.setEditable(false);
        plot_text.setLineWrap(true);
        plot_text.setRows(5);
        plot_text.setWrapStyleWord(true);
        jScrollPane1.setViewportView(plot_text);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(year_text, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title_text, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rated_text, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(director_text, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genre_text, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {director_text, genre_text, rated_text, title_text, year_text});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title_text, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(year_text)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(rated_text))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genre_text))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(director_text)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {director_text, genre_text, rated_text, title_text, year_text});

        database.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 270, 280));

        jButton1.setText("FETCH DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        database.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        downloading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        downloading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        database.getContentPane().add(downloading, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 240, 20));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setText("IMAGE");
        image.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        database.getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 140, 90));

        disclaimer.setMinimumSize(new java.awt.Dimension(500, 500));
        disclaimer.setResizable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("DISCLAIMER & INFO");

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This is an experimental software that people with an organized movie collection can use to obtain information about that movie from the internet.\n\nAn organized movie folder should look like this:\n\nC:/Movies/Moneyball\nC:/Movies/American History X\n\nand NOT like:\n\nC:/Movies/American.History.X[with_subz]\n\nThere can be times when the API doesn't work or respond.\nPlease be patient and try some other movie.\n\nPLEASE DO NOT CLICK 'SHOW DATABASE' WITHOUT ACTUALLY CHOOSING A FOLDER.\n\n<<CLICK TO DISMISS>>");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout disclaimerLayout = new javax.swing.GroupLayout(disclaimer.getContentPane());
        disclaimer.getContentPane().setLayout(disclaimerLayout);
        disclaimerLayout.setHorizontalGroup(
            disclaimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, disclaimerLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(70, 70, 70))
            .addGroup(disclaimerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        disclaimerLayout.setVerticalGroup(
            disclaimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disclaimerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal MovieDB");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        heading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        heading.setText("PERSONAL MOVIE DATABASE");

        folder_show.setText("Choose Movies Folder");
        folder_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folder_showActionPerformed(evt);
            }
        });

        database_show.setText("Show Database");
        database_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                database_showMouseEntered(evt);
            }
        });
        database_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                database_showActionPerformed(evt);
            }
        });

        selected_folder.setText("Your Selected Folder : ");
        selected_folder.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heading_separator)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(selected_folder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(folder_show)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(database_show, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heading_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(folder_show)
                .addGap(11, 11, 11)
                .addComponent(selected_folder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(database_show)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void folder_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folder_showActionPerformed
        int returnVal = fc.showDialog(this, "Choose");
        selected_folder.setText("E:\\Movies\\");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            fc.setSelectedFile(file);

        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            fc.cancelSelection();
        }
    }//GEN-LAST:event_folder_showActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }//GEN-LAST:event_formWindowOpened

    private void database_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_database_showActionPerformed
        database.setVisible(true);
    }//GEN-LAST:event_database_showActionPerformed

    private void databaseWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_databaseWindowActivated
        DefaultTableModel model = (DefaultTableModel) movie_names.getModel();
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        File listDir[] = file.listFiles();
        for (int i = 0; i < listDir.length; i++) {
            if (listDir[i].isDirectory()) {
                model.addRow(new Object[]{listDir[i].getName()});
            }
        }
    }//GEN-LAST:event_databaseWindowActivated

    private void database_showMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_database_showMouseEntered
        if (count == 0) {
            disclaimer.setVisible(true);
        }
        count = 1;
    }//GEN-LAST:event_database_showMouseEntered

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        disclaimer.setVisible(false);
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int coord = movie_names.getSelectedRow();
        int coord2 = movie_names.getSelectedColumn();
        nameClick = (String) movie_names.getValueAt(coord, coord2);
        String nameClick2 = nameClick.replaceAll(" ", "%20");

        String urlString = "http://www.omdbapi.com/?t=" + nameClick2 + "&r=XML";
        System.out.println(urlString);

        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            int size = conn.getContentLength();
            downloading.setText("DOWNLOADED " + (float) (size) + " BYTES OF DATA");
            InputStream is = conn.getInputStream();
            new FileOutputStream(nameClick + "_XML.xml").write(IOUtils.readFully(is, -1, false));
            downloading.setText("DATA RETRIEVED");
            File fXmlFile = new File(nameClick + "_XML.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = (Document) dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("movie");
            Node nNode = nList.item(0);
            Element eElement = (Element) nNode;
            /*String image_URL = (eElement.getAttribute("poster"));
             URL img_url = new URL(image_URL);
             BufferedImage img = ImageIO.read(img_url);
             ImageIcon img_icon = new ImageIcon(img);
             image.setIcon(img_icon);*/
            title_text.setText(eElement.getAttribute("title"));
            year_text.setText(eElement.getAttribute("year"));
            rated_text.setText(eElement.getAttribute("imdbRating"));
            genre_text.setText(eElement.getAttribute("genre"));
            director_text.setText(eElement.getAttribute("director"));
            plot_text.setText(eElement.getAttribute("plot"));
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame database;
    private javax.swing.JButton database_show;
    private javax.swing.JLabel director_text;
    private javax.swing.JFrame disclaimer;
    private javax.swing.JLabel downloading;
    private javax.swing.JButton folder_show;
    private javax.swing.JLabel genre_text;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel heading1;
    private javax.swing.JSeparator heading_separator;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable movie_names;
    private javax.swing.JTextArea plot_text;
    private javax.swing.JLabel rated_text;
    private javax.swing.JLabel selected_folder;
    private javax.swing.JLabel title_text;
    private javax.swing.JLabel year_text;
    // End of variables declaration//GEN-END:variables
}
