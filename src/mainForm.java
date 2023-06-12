import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textIngresoNombre;
    private JButton ingresarPlatoButton;
    private JTextArea textAIngresoPlatos;
    private JButton QuemarDatosButton;
    private JTextField textIngresoPrecio;
    private JTextField textIngresoCalorias;
    private JTextField textIngresoPreparacion;
    private JButton buscarModifButton;
    private JButton modificarModifButton;
    private JTextField textoModifNombre;
    private JTextField textoModifPrecio;
    private JTextField textoModifCalorias;
    private JTextField textoModifPreparacion;
    private JTextArea textAModif;
    private JButton ButtonBuscarEliminar;
    private JTextField textNombreEliminar;
    private JTextArea textAEliminar;
    private JButton eliminarButton;
    private JComboBox comboBoxOrder;
    private JButton mostrarButton;
    private JTextArea textAMostrar;
    private JButton buscarButton;
    private JTextField textBuscarPlatoOrden;

    public mainForm() {

        ingresarPlatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {AgregarPlato();}
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {QuemarDatos();}
        });
        buscarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {BuscarPlatoModificar();}
        });
        modificarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {ModificarPlato();}
        });
        ButtonBuscarEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {BuscarEliminarPlato();}
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {EliminarPaltp();}
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {MostrarPlatos();}
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {MostrarPlatos();
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {BuscarPlatoOrden();}
        });
    }



    //Get mainPanel
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
