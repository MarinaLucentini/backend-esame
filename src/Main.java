import elementoMultimediale.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Audio audio = new Audio("Mal di testa", TipoElemento.AUDIO, 5, 2);
//        audio.setVolume(5);
//        audio.play();
//        Video video = new Video("Voglio morire", TipoElemento.VIDEO, 2, 5);
//        video.setLuminosità(4);
//        video.play();
//        Immagine immagine = new Immagine("Il muro del pianto", TipoElemento.IMMAGINE);
//        immagine.setLuminosità(4);
//        immagine.show();
        ElementoMultimediale[] arrayElementoMultimediale = new ElementoMultimediale[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayElementoMultimediale.length; i++) {
            System.out.println("Dimmi il tipo di file che vuoi inserire. Puoi scegliere tra immagine, video e audio");
            String tipo = scanner.nextLine();
            switch (tipo) {
                case "immagine": {

                    System.out.println("Dimmi il titolo dell'immagine che hai scelto");
                    String titolo = scanner.nextLine();
                    TipoElemento tipoElemento = TipoElemento.valueOf(tipo.toUpperCase());
                    Immagine immagine1 = new Immagine(titolo, tipoElemento);
                    arrayElementoMultimediale[i] = immagine1;
                    break;
                }
                case "video": {

                    System.out.println("Dimmi il titolo del video che hai scelto");
                    String titolo = scanner.nextLine();
                    TipoElemento tipoElemento = TipoElemento.valueOf(tipo.toUpperCase());

                    System.out.println("Inserisci la durata del file video");
                    int durata = Integer.parseInt(scanner.nextLine());

                    System.out.println("Inserisci il volume del file video");
                    int volume = Integer.parseInt(scanner.nextLine());
                    Video video1 = new Video(titolo, tipoElemento, durata, volume);
                    Scanner luminositàinserita = new Scanner(System.in);
                    System.out.println("Quanto deve essere luminoso?");
                    int luminosità = Integer.parseInt(scanner.nextLine());
                    video1.setLuminosità(luminosità);
                    arrayElementoMultimediale[i] = video1;
                    break;
                }
                case "audio": {

                    System.out.println("Dimmi il titolo del file audio che hai scelto");
                    String titolo = scanner.nextLine();
                    TipoElemento tipoElemento = TipoElemento.valueOf(tipo.toUpperCase());
                    System.out.println("Inserisci la durata del file audio");
                    int durata = Integer.parseInt(scanner.nextLine());

                    System.out.println("Inserisci il volume del file audio");
                    int volume = Integer.parseInt(scanner.nextLine());
                    Audio audio1 = new Audio(titolo, tipoElemento, durata, volume);
                    arrayElementoMultimediale[i] = audio1;
                    break;
                }
                default: {
                    System.out.println("errore devi scegliere un elemento");
                    break;
                }
            }


        }

        while (true) {
            System.out.println("Dimmi che tipo di file vuoi visualizzare, scegli un numero da 1 a 5 o 0 per uscire");
            int numeroselezionato2 = Integer.parseInt(scanner.nextLine());
            if (numeroselezionato2 == 0) {
                break;
            } else if (numeroselezionato2 >= 1 && numeroselezionato2 <= 5) {
                ElementoMultimediale elemento = arrayElementoMultimediale[numeroselezionato2 - 1];
                if (elemento instanceof Played) {
                    ((Played) elemento).play();
                } else {
                    ((Show) elemento).show();
                }
            }


        }
        scanner.close();
    }
}