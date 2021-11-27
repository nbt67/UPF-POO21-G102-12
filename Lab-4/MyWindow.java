
public class MyWindow extends javax.swing.JFrame {

    public MyWindow() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
    }

    public static void main( String[] args ) {
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                MyWindow w = new MyWindow();
                EntityDrawer entityDrawer = new EntityDrawer();
                w.add( entityDrawer );
                w.setVisible( true );
                w.pack();        

            }
        } );
    }
}