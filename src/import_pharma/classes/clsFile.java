/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package import_pharma.classes;

import import_pharma.Principale;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jonathan
 */
public class clsFile {

    public String choixFichier() {
        String monFichier = null;
        try {
            JFileChooser choix = new JFileChooser();
            choix.setCurrentDirectory(new File("/"));
            choix.changeToParentDirectory();
            String approve = new String("Importer");
            int resultatExtraire = choix.showDialog(choix, approve);
            if (resultatExtraire == choix.APPROVE_OPTION) {
                monFichier = choix.getSelectedFile().toString();
                try {
                    File source = new File(monFichier);
                    File dest = new File(".\\data.csv");
                    Files.copy(source.toPath(), dest.toPath(), REPLACE_EXISTING);
                    Principale.jLabel1.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception er) {
            System.out.print(er + "\n");
        }
        return monFichier;
    }

    public static Connection ConnectToDB() throws Exception {
        //Registering the Driver
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/bd_pharma_cerhis";
        java.sql.Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
        return (Connection) con;
    }

    public void loarddata() {
        try {
            Connection con = ConnectToDB();
            PreparedStatement pstmt = con.prepareStatement("LOAD DATA LOCAL INFILE 'data.csv' INTO TABLE tb_tempo FIELDS TERMINATED BY ';' ENCLOSED BY '\"' LINES TERMINATED BY '\\r\\n' ");
            pstmt.executeQuery();
            JOptionPane.showMessageDialog(null, "Fin importation");
        } catch (Exception ex) {
            Logger.getLogger(clsFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertdata() {
        try {
            Connection con = ConnectToDB();
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO tb_mvt (code,date_dis,produit,nom,postnom,prenom,genre,date_nais) SELECT cEVT_ID,cEVT_Date,cCHP_VAL_Memo, cPAT_Famille, cPAT_Nom, cPAT_Prenom, cPAT_Genre, cPAT_Ddn FROM tb_tempo WHERE cCHP_Code='PHR_MED' GROUP BY cEVT_ID ");
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insersion ok");
        } catch (Exception ex) {
            Logger.getLogger(clsFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePosologie(String val, String code) throws Exception {
        Connection conPos = ConnectToDB();
        PreparedStatement pstPos = null;
        try {
            pstPos = conPos.prepareStatement("UPDATE tb_mvt SET posologie=? WHERE code=? ");
            pstPos.setString(1, val);
            pstPos.setString(2, code);
            pstPos.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(clsFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conPos.close();
            pstPos.close();
        }
    }

    public void updateCommentaire(String val, String code) throws Exception {
        Connection conCom = ConnectToDB();
        PreparedStatement pstCom = null;
        try {
            pstCom = conCom.prepareStatement("UPDATE tb_mvt SET commentaire=? WHERE code=? ");
            pstCom.setString(1, val);
            pstCom.setString(2, code);
            pstCom.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(clsFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conCom.close();
            pstCom.close();
        }
    }

    public void updateQte(int val, String code) throws Exception {
        Connection conQte = ConnectToDB();
        PreparedStatement pstQte = null;
        try {
            pstQte = conQte.prepareStatement("UPDATE tb_mvt SET qte_pres=? WHERE code=? ");
            pstQte.setInt(1, val);
            pstQte.setString(2, code);
            pstQte.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(clsFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conQte.close();
            pstQte.close();
        }
    }

    public void updateQtePr(int val, String code) throws Exception {
        Connection conQtePr = ConnectToDB();
        PreparedStatement pstQtePr = null;
        try {
            pstQtePr = conQtePr.prepareStatement("UPDATE tb_mvt SET qte_disp=? WHERE code=? ");
            pstQtePr.setInt(1, val);
            pstQtePr.setString(2, code);
            pstQtePr.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(clsFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conQtePr.close();
            pstQtePr.close();
        }
    }

    public void parcourirtableQtePrs() throws Exception {
        Connection con20 = ConnectToDB();
        PreparedStatement stparc = null;
        try {
            stparc = con20.prepareStatement("SELECT * FROM tb_tempo ");
            ResultSet rs = stparc.executeQuery();
            while (rs.next()) {
                String cCHP_Code = rs.getString("cCHP_Code");
                if (cCHP_Code.equals("PHA_PR2")) {
                    int cCHP_VAL_Num = rs.getInt("cCHP_VAL_Num");
                    String cEVT_ID = rs.getString("cEVT_ID");
                    updateQte(cCHP_VAL_Num, cEVT_ID);
                }
                if (cCHP_Code.equals("PHA_PR4")) {
                    int cCHP_VAL_Num = rs.getInt("cCHP_VAL_Num");
                    String cEVT_ID = rs.getString("cEVT_ID");
                    updateQtePr(cCHP_VAL_Num, cEVT_ID);
                }
                if (cCHP_Code.equals("PHA_PR3")) {
                    String cCHP_VAL_Alpha = rs.getString("cCHP_VAL_Alpha");
                    String cEVT_ID = rs.getString("cEVT_ID");
                    updatePosologie(cCHP_VAL_Alpha, cEVT_ID);
                }
                if (cCHP_Code.equals("Commentaire")) {
                    String cCHP_VAL_Alpha = rs.getString("cCHP_VAL_Alpha");
                    String cEVT_ID = rs.getString("cEVT_ID");
                    updateCommentaire(cCHP_VAL_Alpha, cEVT_ID);
                }
            }
            System.out.println("Fin mise à jour Qte pres");
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        } catch (Exception ex) {
            Logger.getLogger(clsFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con20.close();
            stparc.close();
        }
    }

    public void suprimer(String table) throws SQLException, Exception {
        PreparedStatement pstSUP = null;
        Connection consUP = ConnectToDB();
        try {
            
            pstSUP = consUP.prepareStatement("DELETE FROM " + table);
            pstSUP.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "erreur de suppression" + e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(clsFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            consUP.close();
            pstSUP.close();
        }
    }
    
        public void EtatSortie(String querry, String nomEtAT) throws Exception {
            Connection conRAP = ConnectToDB();
        try {
            JasperDesign jd = JRXmlLoader.load("./rapports/" + nomEtAT + ".jrxml");
            String sql = querry;
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conRAP);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            conRAP.close();
        }
    }
}
