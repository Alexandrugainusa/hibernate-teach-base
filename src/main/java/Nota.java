import javax.persistence.*;

@Entity
@Table(name = "note")

public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNota")
    public int idNota;

    @Column(name = "valoareNota")
    public int valoareNota;

    @ManyToOne
    @JoinColumn(name = "idElev")
    public Elev notaCareApartineDeElev;

    @ManyToOne
    @JoinColumn(name = "idPredare")
    public ProfesorMaterie notaCareApartineDeMaterie;



    @Override
    public String toString() {
        return "Nota{" +
                "idNota=" + idNota +
                ", valoareNota='" + valoareNota + '\'' +
                ", notaCareApartineDeElev=" + notaCareApartineDeElev.idElev +
                ", notaCareApartineDeElev=" + notaCareApartineDeElev.numeElev +
                ", notaCareApartineDeMaterie=" + notaCareApartineDeMaterie.idPredare +
                '}';
    }
}

