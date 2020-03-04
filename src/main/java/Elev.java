import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "elevi")

public class Elev {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idElev")
    public int idElev;

    @OneToMany(mappedBy = "notaCareApartineDeElev")
    public List<Nota> note;

    @Column(name = "numeElev")
    public String numeElev;

    @ManyToOne // mai multi elevi -> la o singura clasa;
    @JoinColumn(name = "idClasa")
    public Clasa clasaDeCareApartineElevul; // declararea fieldului de tip Clasa;

    @Override
    public String toString() {
        return "Elev{" +
                "idElev=" + idElev +
                ", numeElev='" + numeElev + '\'' +
                ", idClasa=" + clasaDeCareApartineElevul.idClasa +
                ", numeClasa=" + clasaDeCareApartineElevul.numeClasa +
                ", note=" + note +
                '}';
    }
}
