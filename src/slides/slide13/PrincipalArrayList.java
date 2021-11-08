package slides.slide13;

import java.util.ArrayList;

public class PrincipalArrayList {
    public static void main(String[] args) {
        ArrayList<String> motos = new ArrayList<String>();
        motos.add("Honda CB500");
        motos.add("BMW S-1000-rr");
        motos.add("kawasaki Ninja");
        motos.add("yamaha fazer 250");
        System.out.println(motos);

        for (String moto : motos) {
            System.out.println(moto);
        }
    }
}
