import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {
//        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Venus", 225);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Earth", 365);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        solarSystem.get("Earth").addMoon(tempMoon);
//
//        temp = new HeavenlyBody("Mars", 687);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//        temp.addMoon(new HeavenlyBody("Phobos", 8.0 / 24));
//        temp.addMoon(new HeavenlyBody("Deimos", 1.25));
//
//        for (HeavenlyBody sat: temp.getSatellites()) {
//            solarSystem.put(sat.getName(), sat);
//        }
//
//        temp = new HeavenlyBody("Jupiter", 12 * 365);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//        temp.addMoon(new HeavenlyBody("Europa", 85/24.0));
//        temp.addMoon(new HeavenlyBody("Ganymede", 172/24.0));
//        temp.addMoon(new HeavenlyBody("Io", 42.0/24));
//        temp.addMoon(new HeavenlyBody("Callisto", 17));
//        temp.addMoon(new HeavenlyBody("Amalthea", 0.5));
//        temp.addMoon(new HeavenlyBody("Himalia", 248));
//        temp.addMoon(new HeavenlyBody("Adrastea", 7.0/24));
//        temp.addMoon(new HeavenlyBody("Valetudo", 526));
//        temp.addMoon(new HeavenlyBody("Thebe", 16.0/24));
//        temp.addMoon(new HeavenlyBody("Pasiphae", 708));
//        temp.addMoon(new HeavenlyBody("Carme", 702));
//        temp.addMoon(new HeavenlyBody("Ananke", 630));
//        temp.addMoon(new HeavenlyBody("Lysithea", 259));
//        temp.addMoon(new HeavenlyBody("Metis", 7.0/24));
//        temp.addMoon(new HeavenlyBody("Elara", 259));
//        temp.addMoon(new HeavenlyBody("Sinope", 730));
//        temp.addMoon(new HeavenlyBody("Callirrhoe", 759));
//        temp.addMoon(new HeavenlyBody("Themisto", 130));
//        temp.addMoon(new HeavenlyBody("Eirene", 130));
//        temp.addMoon(new HeavenlyBody("Eupheme", 584));
//        temp.addMoon(new HeavenlyBody("S/2003 J 2", 980));
//        temp.addMoon(new HeavenlyBody("Cyllene", 738));
//        temp.addMoon(new HeavenlyBody("Eukelade", 746));
//        temp.addMoon(new HeavenlyBody("S/2003 J 12", 533));
//        temp.addMoon(new HeavenlyBody("Philophrosy", 690));
//        temp.addMoon(new HeavenlyBody("Aoeda", 761));
//        temp.addMoon(new HeavenlyBody("Iocaste", 609));
//        temp.addMoon(new HeavenlyBody("Harpalyke", 625));
//        temp.addMoon(new HeavenlyBody("Hegemone", 746));
//        temp.addMoon(new HeavenlyBody("Herse", 715));
//        temp.addMoon(new HeavenlyBody("Kalyke", 721));
//        temp.addMoon(new HeavenlyBody("Erinome", 682.8));
//        temp.addMoon(new HeavenlyBody("Helike", 626));
//        temp.addMoon(new HeavenlyBody("Arche", 724));
//        temp.addMoon(new HeavenlyBody("Chaldene", 699));
//        temp.addMoon(new HeavenlyBody("Jupiter LXXII", 736));
//        temp.addMoon(new HeavenlyBody("Megaclite", 792));
//        temp.addMoon(new HeavenlyBody("Jupiter LXI", 701));
//        temp.addMoon(new HeavenlyBody("Hermippe", 632));
//        temp.addMoon(new HeavenlyBody("Euanthe", 621));
//        temp.addMoon(new HeavenlyBody("Isonoe", 750));
//        temp.addMoon(new HeavenlyBody("Autonoe", 763));
//        temp.addMoon(new HeavenlyBody("Euporie", 539));
//        temp.addMoon(new HeavenlyBody("Eurydome", 717));
//        temp.addMoon(new HeavenlyBody("Aitne", 680));
//        temp.addMoon(new HeavenlyBody("Jupiter LXIII", 723));
//        temp.addMoon(new HeavenlyBody("Jupiter LV", 598));
//        temp.addMoon(new HeavenlyBody("Thyone", 627));
//        temp.addMoon(new HeavenlyBody("Sponde", 748));
//        temp.addMoon(new HeavenlyBody("Thelxinoe", 628));
//        planets.add(temp);
//        for (HeavenlyBody sat: temp.getSatellites()) {
//            solarSystem.put(sat.getName(), sat);
//        }
//
//        temp = new HeavenlyBody("Saturn", 29 * 365);
//
//
//        temp = new HeavenlyBody("Uranus", 84 * 365);
//        planets.add(temp);
//        temp.addMoon(new HeavenlyBody("Umbriel", 99.0/24));
//        temp.addMoon(new HeavenlyBody("Titania", 209.0/24));
//        temp.addMoon(new HeavenlyBody("Oberon", 13));
//        temp.addMoon(new HeavenlyBody("Miranda", 34.0/24));
//        temp.addMoon(new HeavenlyBody("Ariel", 60.0/24));
//        temp.addMoon(new HeavenlyBody("Puck", 18/24.0));
//        temp.addMoon(new HeavenlyBody("Cressida", 11/24.0));
//        for (HeavenlyBody sat: temp.getSatellites()) {
//            solarSystem.put(sat.getName(), sat);
//        }
//
//
//        temp = new HeavenlyBody("Neptune", 165 * 365);
//        temp.addMoon(new HeavenlyBody("Triton", 141.0/24));
//        temp.addMoon(new HeavenlyBody("Thalassa", 7.0/24));
//        temp.addMoon(new HeavenlyBody("Hippocamp", 0.95));
//        temp.addMoon(new HeavenlyBody("Nereid", 360));
//        temp.addMoon(new HeavenlyBody("Proteus", 27.0/24));
//        temp.addMoon(new HeavenlyBody("Despina", 1.0/3));
//        temp.addMoon(new HeavenlyBody("Galatea", 10.0/24));
//        temp.addMoon(new HeavenlyBody("Neso", 9740.73));
//        temp.addMoon(new HeavenlyBody("Larissa", 13.0/24));
//        temp.addMoon(new HeavenlyBody("Halimede", 1879));
//        temp.addMoon(new HeavenlyBody("Naiad", 7.0/24));
//        temp.addMoon(new HeavenlyBody("Psamathe", 219089.8.0/24));
//        temp.addMoon(new HeavenlyBody("Laomedeia", 3171));
//        temp.addMoon(new HeavenlyBody("Sao", 2913));
//        for (HeavenlyBody sat: temp.getSatellites()) {
//            solarSystem.put(sat.getName(), sat);
//        }
        Set<Integer> cubes = new HashSet<>(), squares = new HashSet<>();
        for (int i = 1; i <= 100; ++i) {
            cubes.add((int)Math.pow(i, 3));
            squares.add((int)Math.pow(i, 2));
        }

        Set<Integer> union = new HashSet<>(cubes);
        union.addAll(squares);
//        System.out.println("Union => ");
//        for (Integer i: union) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("===============================================\n" +
                "Intersection =>");
        for (int i: intersection) {
            System.out.format("%d ", i);
        }
        System.out.println();








    }
}
