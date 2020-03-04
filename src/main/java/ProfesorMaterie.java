import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profesorimaterie")

public class ProfesorMaterie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPredare")
    public int idPredare;

    @OneToMany(mappedBy = "notaCareApartineDeMaterie")
    public List<Nota> note;

    @ManyToOne
    @JoinColumn(name = "idProfesor")
    public Profesor profesorCareApartineDeMaterie;

    @ManyToOne
    @JoinColumn(name = "idMaterie")
    public Materie materiaCareApartineDeProfesor;

    @Override
    public String toString() {
        return "ProfesorMaterie{" +
                "idPredare=" + idPredare +
                ", note=" + note +
                ", profesorCareApartineDeMaterie=" + profesorCareApartineDeMaterie.idProfesor +
                ", profesorCareApartineDeMaterie=" + profesorCareApartineDeMaterie.numeProfesor +
                ", materiaCareApartineDeProfesor=" + materiaCareApartineDeProfesor.idMaterie +
                '}';
    }
}
