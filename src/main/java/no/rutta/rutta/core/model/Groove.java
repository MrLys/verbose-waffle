package no.rutta.rutta.core.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="groove")
public class Groove {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long habitId;

    //@Column(name="date")
    //private Date date;
}
