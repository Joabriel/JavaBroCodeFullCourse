import javax.swing.JOptionPane; //Librería para interfaces GUI.
class FullCourse{
    public static void main(String[]args){

        String name = JOptionPane.showInputDialog("Ingrese su nombre: ");
        JOptionPane.showMessageDialog(null, "Hola: "+name+"!"); //Es importante poner el "Null" aunque todavía no se por que.

    }
}