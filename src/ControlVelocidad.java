public class ControlVelocidad {
    private double velocidadActual;
    private double velocidadMaximaPermitida;

    public ControlVelocidad(double velocidadMaximaPermitida) {
        this.velocidadActual = 0;
        this.velocidadMaximaPermitida = velocidadMaximaPermitida;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadActual = velocidadActual + incremento;

            if (velocidadActual > velocidadMaximaPermitida) {
                velocidadActual = velocidadMaximaPermitida;
            }
        } else {
            System.out.println("Incremento no valido");
        }
    }

    public void frenar(double decremento) {
        if (decremento > 0) {
            velocidadActual = velocidadActual - decremento;

            if (velocidadActual < 0) {
                velocidadActual = 0;
            }
        } else {
            System.out.println("Decremento no valido");
        }
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }
}
