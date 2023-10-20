// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import abstraktmodell.Lastbil;
import lastbilar.Van;
import lastbilar.LightTruck;
import lastbilar.HeavyTruck;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Lastbil> reggadeLastbilar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Lastbil lastbil = null;
        while (true) {
            System.out.println("- Avlastningsstationen dumpa mera -");
            System.out.print("1. Se Parkerade Lastbilar\n2. Registrera ny avlastande lastbil\n3. Avsluta\n");
            String option = scan.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Parkerade Lastbilar");
                    for (Lastbil bil : reggadeLastbilar) {
                        System.out.println(bil.getName()+" På KAJ: "+bil.getKaj());
                    }
                    System.out.println("\n");
                    break;

                case "2":
                    System.out.println("Registrera ny avlastande bil: ");
                    System.out.println("Typ av lastbil:\n1. Skåpbil\n2. Lätt lastbil\n3. Tung lastbil");
                    String val = scan.nextLine();



                    switch (val) {
                        case "1":
                            System.out.println("Vikt på skåpbil: ");
                            int vanVikt = Integer.parseInt(scan.nextLine());
                            System.out.println("Kaj A eller B: ");
                            String kajVan = scan.nextLine();
                            if (kajVan.equals("A") || kajVan.equals("B")) {
                                lastbil = new Van("Skåpbil",kajVan,vanVikt);
                                if (lastbil != null) {
                                    reggadeLastbilar.add(lastbil);
                                    System.out.println("Lastbil registrerad för kaj " + lastbil.getKaj());
                                }
                            }

                            break;
                        case "2":
                            System.out.println("Vikt på lätt lastbil: ");
                            int lightTruckVikt = Integer.parseInt(scan.nextLine());
                            System.out.println("Kaj C eller D: ");
                            String kajLight = scan.nextLine();
                            if (kajLight.equals("C") || (kajLight.equals("D") && lightTruckVikt < 5000)) {
                                lastbil = new LightTruck("Lättlastbil",kajLight, lightTruckVikt);
                                if (lastbil != null) {
                                    reggadeLastbilar.add(lastbil);
                                    System.out.println("Lastbil registrerad för kaj " + lastbil.getKaj());
                                }
                            } else {
                                System.out.println("Kan inte avlasta här.");
                            }
                            break;
                        case "3":
                            System.out.println("Vikt på tung lastbil:");
                            int heavyTruckVikt = Integer.parseInt(scan.nextLine());
                            System.out.println("Kaj (D eller E):");
                            String kajHeavy = scan.nextLine();
                            if (kajHeavy.equals("E") || (kajHeavy.equals("D") && heavyTruckVikt < 9000)) {
                                lastbil = new HeavyTruck("TungLastbil",kajHeavy, heavyTruckVikt);
                                if (lastbil != null) {
                                    reggadeLastbilar.add(lastbil);
                                    System.out.println("Lastbil registrerad för kaj " + lastbil.getKaj());
                                }
                            } else {
                                System.out.println("Kan inte avlasta här.");
                            }

                            break;
                        default:
                            System.out.println("Ogiltigt, prova igen...");
                    }


                    break;

                case "3":
                    System.out.println("Avslutar programmet.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ogiltigt, prova igen...");
                    break;
            }
        }
    }
}

