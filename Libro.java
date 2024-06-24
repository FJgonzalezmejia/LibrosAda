public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private String editorial;
    private String categoria;
    private double precio;

    // Constructor sin parámetros
    public Libro() {
        // Inicializa los atributos con valores por defecto
        this.titulo = "El Quijote de la Mancha";
        this.autor = "Miguel de Cervantes";
        this.editorial = "Herrero Hermanos Saturnino Calleja";
        this.categoria = "Novela ";
        this.precio = 145.00;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String editorial, String categoria, double precio) {
        // Inicializa los atributos con los valores dados
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
        this.precio = precio;
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Categoria: " + categoria);
        System.out.println("Precio: " + precio);
    }

    // Método para actualizar el precio del libro
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // Getters y Setters para cada atributo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio =precio;
}
}
