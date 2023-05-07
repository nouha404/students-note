package services;

import java.util.Arrays;

public class Notes {
    private int[] notes;
    private int nbNotes;

    // construteur
    public Notes(int nbNotes) {
        this.nbNotes = nbNotes;
        notes = new int[nbNotes];
    }
    // les getters
    public void listerNotesTableau(){
        for(int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }
    }
    public void minAndMaxNote(){
        //mdr aucun effort
        System.out.println("Min : " +Arrays.stream(notes).min().getAsInt());
        System.out.println("Max : " + Arrays.stream(notes).max().getAsInt());
    }
    public void trier(){
        int[] arrayTrier = new int[notes.length];

        for (int i =0; i<notes.length; i++) {
            int varMinIndex = i;
            int minNote = notes[i];

            for (int j = i+1; j<notes.length;j++){
                if(notes[j] < minNote){
                    minNote = notes[j];
                    varMinIndex = j;
                }
            }
            arrayTrier[i] = minNote;
            notes[varMinIndex] = notes[i];

        }
        // afficher
        notes = arrayTrier;
        System.out.println("Les notes ont bien été trier...\n");

    }
    public void supprimerValeur(int k){
        int[] newArrayNote = new int[notes.length-1];

        if(k <0 || k> notes.length){
            throw new IndexOutOfBoundsException("L'indice "+k+" est introuvable.");
        }

        int index = 0;
        for(int i = 0; i<notes.length; i++){
            if(i == k){
               continue;
            }
            newArrayNote[index] = notes[i];
            index++;
        }
        notes = newArrayNote;

    }
    public void ajouterNotes(int note){
        for (int i = 0; i< nbNotes; i++) {
            if (notes[i] == 0) {
                notes[i] = note;
                break;
            }
        }
    }

    /* public void transfererValeurSuperieurMoyenne(){
        int[] arrayValSup = new int[notes.length];
        int valMoyen = 0;
        for (int i =0;i<notes.length; i++){
            valMoyen += notes[i];
        }
        valMoyen /= notes.length;
        int varIndex = -1;
        for (int i =0; i<notes.length; i++){
            if (notes[i] > valMoyen){
                varIndex++;
                arrayValSup[varIndex] = notes[i];
            }
        }
        //afficher le nouveau tableau
        for(int i = 0; i<arrayValSup.length; i++){
            System.out.println("Le nouveau tableau : "+ arrayValSup[i]);
        }

    }*/


}

