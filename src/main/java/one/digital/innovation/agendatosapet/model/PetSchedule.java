package one.digital.innovation.agendatosapet.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "tb_schedule")
public class PetSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "petName", nullable = false)
    private String petName;

    @Column(name = "petOwner", nullable = false)
    private String petOwner;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Override
    public  String toString(){
        return "Schedule: Pet Name: "
                + petName + ", Pet Onwer: "
                + petOwner + ", Date: "
                + date + ".";
    }
}
