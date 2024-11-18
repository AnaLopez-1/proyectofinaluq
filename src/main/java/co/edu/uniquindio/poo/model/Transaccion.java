package co.edu.uniquindio.poo.model;


public class Transaccion {
        private String tipo;
        private String vehiculo;
        private String cliente;

        public Transaccion(String tipo, String vehiculo, String cliente) {
            this.tipo = tipo;
            this.vehiculo = vehiculo;
            this.cliente = cliente;
        }

        public Transaccion(String string, Vehiculo vehiculo2, Object object, Empleado empleado2, Object object2,
                double monto) {
            //TODO Auto-generated constructor stub
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getVehiculo() {
            return vehiculo;
        }

        public void setVehiculo(String vehiculo) {
            this.vehiculo = vehiculo;
        }

        public String getCliente() {
            return cliente;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

    public static void main(String[] args) {
        launch(args);
            }
        
            private static void launch(String[] args) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'launch'");
            }
}

