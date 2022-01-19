package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used for ...
 * @autor Paola-J Rodriguez-C paola.rodriguez@correounivalle.edu.co
 * @version v.1.0.0 date:21/11/2021
 */
public class GUI extends JFrame {

    private Header headerProject;
    private JButton dadoini1, dadoini2, dadoini3, dadoini4, dadoini5, dadoini6, dadoini7, ayuda, salir;
    private JPanel panelDadosActivos, panelDadosInactivos, panelTarjetaPuntuacion, panelDadosUtilizados;
    private JTextArea ronda, puntosAcumulados;
    private ImageIcon imageDado;
    private Escucha escucha;
    private ModelGeek modelGeek;


    /**
     * Constructor of GUI class
     */
    public GUI(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Geek Out! Masters");
        //this.setSize(200,100);
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        //Create Listener Object and Control Object
        escucha = new Escucha();
        modelGeek = new ModelGeek();
        //Set up JComponents
        headerProject = new Header("Mesa Juego Geeks", Color.BLACK);
        //constraints.gridwidth=2;
        constraints.gridx=0;
        constraints.gridy=0;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        this.add(headerProject,constraints);
        //this.add(headerProject,BorderLayout.NORTH); //Change this line if you change JFrame Container's Layout

        imageDado = new ImageIcon(getClass().getResource("/resources/42.png"));
        dadoini1 = new JButton(imageDado);

        panelDadosActivos = new JPanel();
        panelDadosActivos.setPreferredSize(new Dimension(300, 200));
        panelDadosActivos.setBorder(BorderFactory.createTitledBorder("Dados Activos "));
        //panelDadosActivos.add(dadoini1);
        constraints.gridx=0;
        constraints.gridy=1;
        //constraints.gridwidth=0;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        add(panelDadosActivos,constraints);


        panelDadosInactivos = new JPanel();
        panelDadosInactivos.setPreferredSize(new Dimension(300, 200));
        panelDadosInactivos.setBorder(BorderFactory.createTitledBorder("Dados Inactivos "));
        //panelDadosInactivos.add(dadoini1);
        constraints.gridx=1;
        constraints.gridy=1;
        //constraints.gridwidth=0;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        add(panelDadosInactivos,constraints);


        panelTarjetaPuntuacion = new JPanel();
        panelTarjetaPuntuacion.setPreferredSize(new Dimension(300, 200));
        panelTarjetaPuntuacion.setBorder(BorderFactory.createTitledBorder("Tarjeta puntuación "));
        constraints.gridx=0;
        constraints.gridy=2;
        //constraints.gridwidth=0;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        add(panelTarjetaPuntuacion,constraints);

        panelDadosUtilizados = new JPanel();
        panelDadosUtilizados.setPreferredSize(new Dimension(300, 200));
        panelDadosUtilizados.setBorder(BorderFactory.createTitledBorder("Dados Utilizados "));
        constraints.gridx=1;
        constraints.gridy=2;
        //constraints.gridwidth=0;
        //constraints.fill=GridBagConstraints.BOTH;
        add(panelDadosUtilizados,constraints);

        ronda = new JTextArea(2, 16);
        ronda.setText("       1");
        ronda.setBorder(BorderFactory.createTitledBorder("Ronda actual "));
        ronda.setBackground(null);
        ronda.setEditable(false);
        constraints.gridx=3;
        constraints.gridy=1;
        add(ronda, constraints);

        puntosAcumulados = new JTextArea(4, 16);
        puntosAcumulados.setText("   130");
        puntosAcumulados.setBorder(BorderFactory.createTitledBorder("Puntos Acumulados "));
        puntosAcumulados.setBackground(null);
        puntosAcumulados.setEditable(false);
        constraints.gridx=3;
        constraints.gridy=2;
        add(puntosAcumulados, constraints);

        ayuda = new JButton("AYUDA");
        ayuda.addActionListener(escucha);
        constraints.gridx=0;
        constraints.gridy=4;
        constraints.gridwidth=2;
        this.add(ayuda,constraints);

        salir = new JButton("SALIR");
        salir.addActionListener(escucha);
        constraints.gridx=3;
        constraints.gridy=2;
        constraints.gridwidth=1;
        this.add(salir, constraints);


    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUI miProjectGUI = new GUI();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e){

        }

    }
}
