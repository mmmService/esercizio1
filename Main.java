import java.util.Scanner; // importazione classe Scanner per input tastiera

public class Main {
    public static void main(String[] args){

        /* Si supponga di dover definire un programma per determinare i costi di servizio legati alla
riscossione di assegni. Il costo del servizio dipende dall’ammontare dell’assegno. Se è
minore o uguale a 10 Euro, il costo di servizio è di 1 Euro. Se è maggiore di 10 ma minore o
uguale a 100 Euro il costo del servizio è pari al 10% dell’importo.
Se l’importo è maggiore di 100 Euro ma minore o uguale a 1000 Euro, il costo del servizio è
pari a 5 Euro più il 5% dell’importo. Se il valore dell’importo è superiore a 1000 Euro, il costo
del servizio è pari a 40 Euro più l’1% dell’importo.
Scrivere un codice che permetta di computare questa cifra tramite un’istruzione if-else
multi-ramo.

         */
        Scanner inputOperatore = new Scanner(System.in); 
        System.out.println("Inserisci il valore dell asegno :");//messaggio interativo
        float valAsgn; //definizione variabile
        valAsgn = inputOperatore.nextFloat(); // prilievo dati dalla tastiera e definire tipo variabile

        float costoServizio; //definizione variabile

        if (valAsgn<=10) {
            costoServizio = 1;
            System.out.println("Per il tuo asegno da " +valAsgn + " euro, devi pagare " + costoServizio + " euro");
        }else if (valAsgn>10 && valAsgn<=100) {
            costoServizio = valAsgn * 0.1f; // 10%
            System.out.println("Per il tuo asegno da " + valAsgn + " euro, devi pagare " + costoServizio + " euro");
        }else if (valAsgn>100 && valAsgn<=1000){
            costoServizio = valAsgn * 0.05f + 5;// 5% + 5
            System.out.println("Per il tuo asegno da " + valAsgn + " euro, devi pagare " + costoServizio + " euro");
        }else if (valAsgn > 1000){
            costoServizio = valAsgn * 0.01f + 40;// 1% + 40
            System.out.println("Per il tuo asegno da " + valAsgn + " euro, devi pagare " + costoServizio + " euro");
        }
    }
}
