package classes;

import java.util.ArrayList;

public class Compound {
    private int coId;
    private String type;
    private int habitat;
    private int maxResidents;
    private ArrayList<Integer> residents;
    private ArrayList<String> cares;

    public Compound(int coId, String type, int habitat, int maxResidents, ArrayList<String> cares) {
        this.coId = coId;
        this.type = type;
        this.habitat = habitat;
        this.maxResidents = maxResidents;
        this.residents = new ArrayList<>();
        this.cares = cares;
    }

    public String display() {
        System.out.println("Unterbringung: " +coId);
        System.out.println("Art der Unterbringung: " +type);
        System.out.println("Lebensraum: " + habitat);
        System.out.println("Bewohner:");
        if(!residents.isEmpty()){
            for (Integer resident : residents){
                System.out.println(" - " + resident);
            }
        }
        System.out.println("Pflegeart:");
        if(!residents.isEmpty()){
            for (String care : cares) {
                System.out.println(" - " + care);
            }
        }
        return null;
    }

    public boolean newResident(int anID) {
        if (residents.size() < maxResidents) {
            residents.add(anID);
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getResidents() {
        return residents;
    }

    public void newCares(String care) {
        cares.add(care);
    }

    public ArrayList<String> getCares() {
        return cares;
    }
}