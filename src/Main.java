import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import javax.swing.table.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //Ventana
        JFrame ventana = new JFrame();
        ventana.setBounds(120, 70, 1600, 900);
        ventana.setTitle("Probando la librería Swing en Java");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Menú superior
        JMenuBar menuBar = new JMenuBar();
        //Se crean las distintas pestañas
        JMenu tab1 = new JMenu("Archivo");
        JMenu tab2 = new JMenu("Acciones");
        JMenu tab3 = new JMenu("Ayuda");

        //Se crean las opciones (item) que luego aparecerán como un desplegable en cada pestaña
      /*JMenuItem item1 = new JMenuItem("Opción 1");
        JMenuItem item2 = new JMenuItem("Opción 2");
        JMenuItem item3 = new JMenuItem("Opción 3");
        //Se añaden los items a cada pestaña
        menu1.add(item1);
        menu2.add(item2);
        menu3.add(item3);*/

        //Se añaden al menú las pestañas
        menuBar.add(tab1);
        menuBar.add(tab2);
        menuBar.add(tab3);
        ventana.setJMenuBar(menuBar); //Se establece menuBar como el menu de la ventana

        //Creacion, redimensión y ubicación de los botones
        JButton botonLiga = new JButton("Nueva liga");
        botonLiga.setBounds(60, 40, 350, 80);
        JButton botonJugar = new JButton("Jugar liga");
        botonJugar.setBounds(60, 170, 350, 80);
        JButton botonJornada = new JButton("Siguiente jornada");
        botonJornada.setBounds(60, 300, 350, 80);
        botonJornada.setEnabled(false);
        JButton botonSim = new JButton("Simulacion completa");
        botonSim.setBounds(60, 430, 350, 80);
        botonSim.setEnabled(false);
        JButton botonSalir = new JButton("Salir");
        botonSalir.setBounds(60, 650, 350, 80);

        //Añade los botones al panel
        ventana.add(botonLiga);
        ventana.add(botonJugar);
        ventana.add(botonJornada);
        ventana.add(botonSim);
        ventana.add(botonSalir);

        // Establecer el layout de la ventana
        ventana.setLayout(new BorderLayout());


        //Creación de la tabla

        //Creación de array para los nombres de las columnas
        String[] nombresColumnas = {
                "Nombre equipo",
                "Partidos",
                "Victorias",
                "Derrotas",
                "Empates",
                "Puntos"
        };

        //Creación de matriz para los datos de prueba
        Object[][] datos = {
                {"Celta", "6", "3", "3", "4", "9"},
                {"Getafe", "6", "2", "4", "7", "5"},
                {"Real Madrid", "6", "8", "9", "5", "9"},
                {"Celta", "6", "3", "3", "4", "9"},
                {"Getafe", "6", "2", "4", "7", "5"},
                {"Real Madrid", "6", "8", "9", "5", "9"},
                {"Real Madrid", "6", "8", "9", "5", "9"},
                {"Celta", "6", "3", "3", "4", "9"},
                {"Getafe", "6", "2", "4", "7", "5"},
                {"Real Madrid", "6", "8", "9", "5", "9"},
                {"Celta", "6", "3", "3", "4", "9"},
                {"Getafe", "6", "2", "4", "7", "5"},
                {"Real Madrid", "6", "8", "9", "5", "9"},
                {"Celta", "6", "3", "3", "4", "9"},
                {"Getafe", "6", "2", "4", "7", "5"},
        };

        //Creación de la tabla
        JTable tabla = new JTable();
        //Creacion del encabezado de la tabla
        JTableHeader header = tabla.getTableHeader();
        header.setBounds(600, 120, 800, 30);
        tabla.setTableHeader(header);
        DefaultTableModel modeloTabla= new DefaultTableModel(nombresColumnas,22);
        tabla.setModel(modeloTabla);
        tabla.setBounds(600, 150, 800, 350);
        ventana.add(tabla.getTableHeader());
        ventana.add(tabla);

        ventana.setLayout(null); //importante para la correcta visualización del encabezado de la tabla
        ventana.setVisible(true);
        ventana.setResizable(false); //se deshabilita la redimensión de la ventana

    }
}