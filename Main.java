
public class Main {

    public static void main(String[] args) {
        // Crear un objeto 'libro1' utilizando el constructor sin parámetros
        Libro libro1 = new Libro();
        // Mostrar detalles del 'libro1'
        libro1.mostrarDetalles();

        // Crear un objeto 'libro2' utilizando el constructor con parámetros
        Libro libro2 = new Libro();
        // Mostrar detalles del 'libro2'
        libro2.mostrarDetalles();

        // Actualizar el precio del 'libro2'
        libro2.actualizarPrecio(120);
        // Mostrar detalles actualizados de 'libro2'
        libro2.mostrarDetalles();
}
}