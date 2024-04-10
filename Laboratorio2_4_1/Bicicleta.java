public class Bicicleta {
    // Clase anidada 'Rueda'
    static class Rueda {
        private int diametro;
        private int n;

        public Rueda(int diametro, int n) {
            this.diametro = diametro;
            this.n = n;
        }

        public void girar() {
            if(n==1){
                System.out.println("La rueda Delantera Está girando y su diametro es: " + diametro);

            }else if(n==2){
                System.out.println("La rueda Trasera Está girando y su diametro es: " + diametro);
            }
            
        }
    }

    // Clase anidada 'Cuadro'
    static class Cuadro {
        private String material;

        public Cuadro(String material) {
            this.material = material;
        }

        public void mostrarMaterial() {
            System.out.println("El cuadro está hecho de " + material);
        }
    }

    public static void main(String[] args) {
        // Crear instancias de las clases anidadas
        Rueda ruedaDelantera = new Rueda(26,1);
        Rueda ruedaTrasera = new Rueda(26,2);
        Cuadro cuadro = new Cuadro("Aluminio");

        // Simular el funcionamiento de la bicicleta
        ruedaDelantera.girar();
        ruedaTrasera.girar();
        cuadro.mostrarMaterial();
    }
}
