import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateRunner {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        /*Transaction transaction =  session.beginTransaction();

        Elev unElev = session.find(Elev.class,3);
        Elev altElev = session.find(Elev.class,4);

        System.out.println(unElev.toString());
        System.out.println(altElev.toString());

        Elev elevaNoua = session.find(Elev.class,4);

        Nota notaMea = new Nota();
        notaMea.notaCareApartineDeElev = elevaNoua;
        notaMea.valoareNota = 4444;
        session.save(notaMea);


        Clasa clasaMea = session.find(Clasa.class,2);

        Elev elevNou = new Elev();
        elevNou.clasaDeCareApartineElevul = clasaMea;
        elevNou.numeElev = "Ghita de la portita";

        System.out.println("inainte de save "+ elevNou);
        session.save(elevNou);
        System.out.println("dupa save " + elevNou);
        //transaction.commit();

        Clasa oClasa = session.find(Clasa.class,2);
        System.out.println(oClasa.toString());

        Clasa clasaNoua = new Clasa();
       // clasaNoua.idClasa = 6; -> daca e primary key, nu mai este nevoie !
        clasaNoua.numeClasa = "12A";
        System.out.println("inainte "+ clasaNoua);
        session.save(clasaNoua);
        System.out.println("dupa save "+ clasaNoua);
        //transaction.commit();

        Materie oMaterie = session.find(Materie.class,7);
        System.out.println(oMaterie.toString());

        Materie materieNoua = new Materie();
        materieNoua.numeMaterie = "krunker";
        System.out.println(materieNoua);
        session.save(materieNoua);
        transaction.commit();*/

        Elev unElev = session.find(Elev.class,2);

        System.out.println(unElev);

        Profesor unProfesor = session.find(Profesor.class,2);
        System.out.println(unProfesor);



        HibernateUtil.shutdown();
    }
}