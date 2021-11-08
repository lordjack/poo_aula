package slides.slide13;

import java.util.ArrayList;

public class PricipalMotocicleta {
    public static void main(String[] args) {
        ArrayList<Motocicleta> motos = new ArrayList<Motocicleta>();

        Motocicleta moto1 = new Motocicleta();
        Motocicleta moto2 = new Motocicleta();

        moto1.setMarca("Honda");
        moto1.setModelo("Twister 300");

        moto2.setMarca("Yamaha");
        moto2.setModelo("Fazer 250");

        motos.add(moto1);
        motos.add(moto2);

        System.out.println("A coleção de motos possui " + motos.size() + " elementos");

    }
}
