import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Dimension;

public class Windoow extends JFrame {

    private JPanel contentPane;
    private JTextField nazwiskoTextField;
    private JTextField zatrudnienieTextField;
    private JTextField stanowiskoTextField;
    private JTextField imieTextField;
    private JTextField miastoTextField;
    private JTextField ulicaTextField;
    private JLabel lblKodpocztowy;
    private JLabel lblWojewodztwo;
    private JLabel lblKraj;
    private JLabel lblNrTelefonu;
    private JLabel lblEmail;
    private JLabel lblStronaWww;
    private JLabel lblMiasto;
    private JLabel lblUlica;
    private JLabel lblImie;
    private JLabel lblNazwisko;
    private JLabel lblMiejsceZatrudnienia;
    private JLabel lblStanowisko;
    private JLabel lblgroode;
    private JTextField kodPocztowyTextField;
    private JTextField wojewodztwoTextField;
    private JTextField krajTextField;
    private JTextField numerTelefonuTextField;
    private JTextField emailTextField;
    private JTextField stronaTextField;
    private JLabel lblOgolne;
    private JLabel lblDaneAdresowe;
    private JLabel lblDaneKontaktowe;
    private JButton zapiszButton;
    private File imageFile;
    private JButton pickImageButton;
    private JLabel imageLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Windoow frame = new Windoow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Windoow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 559);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        lblOgolne = new JLabel("Ogolne");
        GridBagConstraints gbc_lblOgolne = new GridBagConstraints();
        gbc_lblOgolne.insets = new Insets(0, 0, 5, 5);
        gbc_lblOgolne.gridx = 0;
        gbc_lblOgolne.gridy = 0;
        contentPane.add(lblOgolne, gbc_lblOgolne);

        lblImie = new JLabel("Imie");
        GridBagConstraints gbc_lblImie = new GridBagConstraints();
        gbc_lblImie.insets = new Insets(0, 0, 5, 5);
        gbc_lblImie.gridx = 0;
        gbc_lblImie.gridy = 1;
        contentPane.add(lblImie, gbc_lblImie);

        imieTextField = new JTextField();
        imieTextField.setColumns(10);
        GridBagConstraints gbc_imieTextField = new GridBagConstraints();
        gbc_imieTextField.gridwidth = 9;
        gbc_imieTextField.insets = new Insets(0, 0, 5, 0);
        gbc_imieTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_imieTextField.gridx = 1;
        gbc_imieTextField.gridy = 1;
        contentPane.add(imieTextField, gbc_imieTextField);

        lblNazwisko = new JLabel("Nazwisko");
        GridBagConstraints gbc_lblNazwisko = new GridBagConstraints();
        gbc_lblNazwisko.insets = new Insets(0, 0, 5, 5);
        gbc_lblNazwisko.gridx = 0;
        gbc_lblNazwisko.gridy = 2;
        contentPane.add(lblNazwisko, gbc_lblNazwisko);

        nazwiskoTextField = new JTextField();
        GridBagConstraints gbc_nazwiskoTextField = new GridBagConstraints();
        gbc_nazwiskoTextField.gridwidth = 9;
        gbc_nazwiskoTextField.insets = new Insets(0, 0, 5, 0);
        gbc_nazwiskoTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_nazwiskoTextField.gridx = 1;
        gbc_nazwiskoTextField.gridy = 2;
        contentPane.add(nazwiskoTextField, gbc_nazwiskoTextField);
        nazwiskoTextField.setColumns(10);

        lblMiejsceZatrudnienia = new JLabel("Miejsce zatrudnienia");
        GridBagConstraints gbc_lblMiejsceZatrudnienia = new GridBagConstraints();
        gbc_lblMiejsceZatrudnienia.insets = new Insets(0, 0, 5, 5);
        gbc_lblMiejsceZatrudnienia.gridx = 0;
        gbc_lblMiejsceZatrudnienia.gridy = 3;
        contentPane.add(lblMiejsceZatrudnienia, gbc_lblMiejsceZatrudnienia);

        zatrudnienieTextField = new JTextField();
        GridBagConstraints gbc_zatrudnienieTextField = new GridBagConstraints();
        gbc_zatrudnienieTextField.insets = new Insets(0, 0, 5, 0);
        gbc_zatrudnienieTextField.gridwidth = 9;
        gbc_zatrudnienieTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_zatrudnienieTextField.gridx = 1;
        gbc_zatrudnienieTextField.gridy = 3;
        contentPane.add(zatrudnienieTextField, gbc_zatrudnienieTextField);
        zatrudnienieTextField.setColumns(10);

        lblStanowisko = new JLabel("Stanowisko");
        GridBagConstraints gbc_lblStanowisko = new GridBagConstraints();
        gbc_lblStanowisko.insets = new Insets(0, 0, 5, 5);
        gbc_lblStanowisko.gridx = 0;
        gbc_lblStanowisko.gridy = 4;
        contentPane.add(lblStanowisko, gbc_lblStanowisko);

        stanowiskoTextField = new JTextField();
        GridBagConstraints gbc_stanowiskoTextField = new GridBagConstraints();
        gbc_stanowiskoTextField.gridwidth = 9;
        gbc_stanowiskoTextField.insets = new Insets(0, 0, 5, 0);
        gbc_stanowiskoTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_stanowiskoTextField.gridx = 1;
        gbc_stanowiskoTextField.gridy = 4;
        contentPane.add(stanowiskoTextField, gbc_stanowiskoTextField);
        stanowiskoTextField.setColumns(10);

        lblDaneAdresowe = new JLabel("Dane adresowe");
        GridBagConstraints gbc_lblDaneAdresowe = new GridBagConstraints();
        gbc_lblDaneAdresowe.insets = new Insets(0, 0, 5, 5);
        gbc_lblDaneAdresowe.gridx = 0;
        gbc_lblDaneAdresowe.gridy = 5;
        contentPane.add(lblDaneAdresowe, gbc_lblDaneAdresowe);

        lblUlica = new JLabel("Ulica");
        GridBagConstraints gbc_lblUlica = new GridBagConstraints();
        gbc_lblUlica.insets = new Insets(0, 0, 5, 5);
        gbc_lblUlica.gridx = 0;
        gbc_lblUlica.gridy = 6;
        contentPane.add(lblUlica, gbc_lblUlica);

        ulicaTextField = new JTextField();
        ulicaTextField.setColumns(10);
        GridBagConstraints gbc_ulicaTextField = new GridBagConstraints();
        gbc_ulicaTextField.gridwidth = 9;
        gbc_ulicaTextField.insets = new Insets(0, 0, 5, 0);
        gbc_ulicaTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_ulicaTextField.gridx = 1;
        gbc_ulicaTextField.gridy = 6;
        contentPane.add(ulicaTextField, gbc_ulicaTextField);

        lblMiasto = new JLabel("Miasto");
        GridBagConstraints gbc_lblMiasto = new GridBagConstraints();
        gbc_lblMiasto.insets = new Insets(0, 0, 5, 5);
        gbc_lblMiasto.gridx = 0;
        gbc_lblMiasto.gridy = 7;
        contentPane.add(lblMiasto, gbc_lblMiasto);

        miastoTextField = new JTextField();
        miastoTextField.setColumns(10);
        GridBagConstraints gbc_miastoTextField = new GridBagConstraints();
        gbc_miastoTextField.gridwidth = 9;
        gbc_miastoTextField.insets = new Insets(0, 0, 5, 0);
        gbc_miastoTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_miastoTextField.gridx = 1;
        gbc_miastoTextField.gridy = 7;
        contentPane.add(miastoTextField, gbc_miastoTextField);

        lblKodpocztowy = new JLabel("Kod pocztowy");
        GridBagConstraints gbc_lblKodpocztowy = new GridBagConstraints();
        gbc_lblKodpocztowy.insets = new Insets(0, 0, 5, 5);
        gbc_lblKodpocztowy.gridx = 0;
        gbc_lblKodpocztowy.gridy = 8;
        contentPane.add(lblKodpocztowy, gbc_lblKodpocztowy);

        kodPocztowyTextField = new JTextField();
        kodPocztowyTextField.setColumns(10);
        GridBagConstraints gbc_kodPocztowyTextField = new GridBagConstraints();
        gbc_kodPocztowyTextField.gridwidth = 9;
        gbc_kodPocztowyTextField.insets = new Insets(0, 0, 5, 0);
        gbc_kodPocztowyTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_kodPocztowyTextField.gridx = 1;
        gbc_kodPocztowyTextField.gridy = 8;
        contentPane.add(kodPocztowyTextField, gbc_kodPocztowyTextField);

        lblWojewodztwo = new JLabel("Wojewodztwo");
        GridBagConstraints gbc_lblWojewodztwo = new GridBagConstraints();
        gbc_lblWojewodztwo.insets = new Insets(0, 0, 5, 5);
        gbc_lblWojewodztwo.gridx = 0;
        gbc_lblWojewodztwo.gridy = 9;
        contentPane.add(lblWojewodztwo, gbc_lblWojewodztwo);

        wojewodztwoTextField = new JTextField();
        wojewodztwoTextField.setColumns(10);
        GridBagConstraints gbc_wojewodztwoTextField = new GridBagConstraints();
        gbc_wojewodztwoTextField.gridwidth = 9;
        gbc_wojewodztwoTextField.insets = new Insets(0, 0, 5, 0);
        gbc_wojewodztwoTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_wojewodztwoTextField.gridx = 1;
        gbc_wojewodztwoTextField.gridy = 9;
        contentPane.add(wojewodztwoTextField, gbc_wojewodztwoTextField);

        lblKraj = new JLabel("Kraj");
        GridBagConstraints gbc_lblKraj = new GridBagConstraints();
        gbc_lblKraj.insets = new Insets(0, 0, 5, 5);
        gbc_lblKraj.gridx = 0;
        gbc_lblKraj.gridy = 10;
        contentPane.add(lblKraj, gbc_lblKraj);

        krajTextField = new JTextField();
        krajTextField.setColumns(10);
        GridBagConstraints gbc_krajTextField = new GridBagConstraints();
        gbc_krajTextField.gridwidth = 9;
        gbc_krajTextField.insets = new Insets(0, 0, 5, 0);
        gbc_krajTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_krajTextField.gridx = 1;
        gbc_krajTextField.gridy = 10;
        contentPane.add(krajTextField, gbc_krajTextField);

        lblDaneKontaktowe = new JLabel("Dane Kontaktowe");
        GridBagConstraints gbc_lblDaneKontaktowe = new GridBagConstraints();
        gbc_lblDaneKontaktowe.insets = new Insets(0, 0, 5, 5);
        gbc_lblDaneKontaktowe.gridx = 0;
        gbc_lblDaneKontaktowe.gridy = 11;
        contentPane.add(lblDaneKontaktowe, gbc_lblDaneKontaktowe);

        lblNrTelefonu = new JLabel("Nr. telefonu");
        GridBagConstraints gbc_lblNrTelefonu = new GridBagConstraints();
        gbc_lblNrTelefonu.insets = new Insets(0, 0, 5, 5);
        gbc_lblNrTelefonu.gridx = 0;
        gbc_lblNrTelefonu.gridy = 12;
        contentPane.add(lblNrTelefonu, gbc_lblNrTelefonu);

        numerTelefonuTextField = new JTextField();
        numerTelefonuTextField.setColumns(10);
        GridBagConstraints gbc_numerTelefonuTextField = new GridBagConstraints();
        gbc_numerTelefonuTextField.gridwidth = 9;
        gbc_numerTelefonuTextField.insets = new Insets(0, 0, 5, 0);
        gbc_numerTelefonuTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_numerTelefonuTextField.gridx = 1;
        gbc_numerTelefonuTextField.gridy = 12;
        contentPane.add(numerTelefonuTextField, gbc_numerTelefonuTextField);

        lblEmail = new JLabel("Email");
        GridBagConstraints gbc_lblEmail = new GridBagConstraints();
        gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
        gbc_lblEmail.gridx = 0;
        gbc_lblEmail.gridy = 13;
        contentPane.add(lblEmail, gbc_lblEmail);

        emailTextField = new JTextField();
        emailTextField.setColumns(10);
        GridBagConstraints gbc_emailTextField = new GridBagConstraints();
        gbc_emailTextField.gridwidth = 9;
        gbc_emailTextField.insets = new Insets(0, 0, 5, 0);
        gbc_emailTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_emailTextField.gridx = 1;
        gbc_emailTextField.gridy = 13;
        contentPane.add(emailTextField, gbc_emailTextField);

        lblStronaWww = new JLabel("Strona www");
        GridBagConstraints gbc_lblStronaWww = new GridBagConstraints();
        gbc_lblStronaWww.insets = new Insets(0, 0, 5, 5);
        gbc_lblStronaWww.gridx = 0;
        gbc_lblStronaWww.gridy = 14;
        contentPane.add(lblStronaWww, gbc_lblStronaWww);

        stronaTextField = new JTextField();
        stronaTextField.setColumns(10);
        GridBagConstraints gbc_stronaTextField = new GridBagConstraints();
        gbc_stronaTextField.gridwidth = 9;
        gbc_stronaTextField.insets = new Insets(0, 0, 5, 0);
        gbc_stronaTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_stronaTextField.gridx = 1;
        gbc_stronaTextField.gridy = 14;
        contentPane.add(stronaTextField, gbc_stronaTextField);

        zapiszButton = new JButton("Zapisz");
        GridBagConstraints gbc_zapiszButton = new GridBagConstraints();
        gbc_zapiszButton.insets = new Insets(0, 0, 5, 0);
        gbc_zapiszButton.gridx = 9;
        gbc_zapiszButton.gridy = 16;
        contentPane.add(zapiszButton, gbc_zapiszButton);

        imageLabel = new JLabel("");
        imageLabel.setMinimumSize(new Dimension(150, 150));
        imageLabel.setMaximumSize(new Dimension(150, 150));
        GridBagConstraints gbc_imageLabel = new GridBagConstraints();
        gbc_imageLabel.gridheight = 5;
        gbc_imageLabel.gridwidth = 3;
        gbc_imageLabel.insets = new Insets(0, 0, 5, 5);
        gbc_imageLabel.gridx = 0;
        gbc_imageLabel.gridy = 16;
        imageLabel.setBounds(30,30,30,30);

        contentPane.add(imageLabel, gbc_imageLabel);

        pickImageButton = new JButton("Wybierz obrazek");
        GridBagConstraints gbc_pickImageButton = new GridBagConstraints();
        gbc_pickImageButton.gridx = 9;
        gbc_pickImageButton.gridy = 20;
        contentPane.add(pickImageButton, gbc_pickImageButton);






        zapiszButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile();
            }
        });

        pickImageButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //setImage();
                setImage2();
            }



        });
    }
    private void setImage2() {
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","*gif","png");
        jfc.addChoosableFileFilter(filter);
        int result = jfc.showSaveDialog(null);

        if(result==JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            String path =selectedFile.getAbsolutePath();
            Image image;
            try {
                image = ImageIO.read(new File(path));
                ImageIcon image1 = new ImageIcon(image);
                Image i = image1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
                imageLabel.setIcon(new ImageIcon(i));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }else if(result==JFileChooser.CANCEL_OPTION) {
            System.out.println("nie wybrano pliku");
        }

    }


    protected void saveToFile() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(new File("dane.txt")));


            writeln(bw,"Ogolne");

            writeln(bw,"Imie: "+imieTextField.getText().toString());
            writeln(bw,"Nazwisko: "+nazwiskoTextField.getText().toString());
            writeln(bw,"Miejsce Zatrudnienia: "+zatrudnienieTextField.getText().toString());
            writeln(bw,"Stanowisko: "+stanowiskoTextField.getText().toString());

            writeln(bw,"Dane Adresowe");
            writeln(bw,"Ulica: "+ulicaTextField.getText().toString());
            writeln(bw,"Miasto: "+miastoTextField.getText().toString());
            writeln(bw,"Kod pocztowy: "+kodPocztowyTextField.getText().toString());
            writeln(bw,"Wojewodztwo: "+wojewodztwoTextField.getText().toString());
            writeln(bw,"Kraj: "+krajTextField.getText().toString());

            writeln(bw,"Dane Kontaktowe");
            writeln(bw,"Nr telefonu: " + numerTelefonuTextField.getText().toString());
            writeln(bw,"Email: "+emailTextField.getText().toString());
            writeln(bw,"Strona www: "+stronaTextField.getText().toString());


            bw.flush();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private void writeln(BufferedWriter bw, String string) throws IOException {
        bw.write(string);
        bw.write(System.getProperty("line.separator").toString());

    }





}
