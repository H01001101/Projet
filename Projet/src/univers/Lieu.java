package univers;

public class Lieu {

    private Villes ville;
    private Lieux lieu;

    public Lieu() {
        this.ville = null;
        this.lieu = null;
    }

    public Lieu(Villes v, Lieux l) {
        this.ville = v;
        this.lieu = l;
    }

    public Villes getVille() {
        return ville;
    }

    public void setVille(Villes ville) {
        this.ville = ville;
    }

    public Lieux getLieu() {
        return lieu;
    }

    public void setLieu(Lieux lieu) {
        this.lieu = lieu;
    }

    @Override
    public String toString() {
        return "On est à " + this.ville + " dans " + this.lieu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lieu)) return false;
        Lieu l = (Lieu) o;
        return l.ville == this.ville && l.lieu == this.lieu;
    }
}
