//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ControlVelocidad control = new ControlVelocidad(120);

    System.out.println("Velocidad inicial: " + control.getVelocidadActual() + " km/h");

    control.acelerar(50);
    System.out.println("Velocidad actual: " + control.getVelocidadActual() + " km/h");

    control.acelerar(100);
    System.out.println("Velocidad actual: " + control.getVelocidadActual() + " km/h");

    control.frenar(30);
    System.out.println("Velocidad actual: " + control.getVelocidadActual() + " km/h");

    control.frenar(200);
    System.out.println("Velocidad actual: " + control.getVelocidadActual() + " km/h");

    control.acelerar(-10);
    System.out.println("Velocidad final: " + control.getVelocidadActual() + " km/h");
}
