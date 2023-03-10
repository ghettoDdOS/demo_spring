package stores;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Table("Stores_Order")
public class TacoOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private Date placedAt;
    @Column("customer_name")
    @NotBlank(message="Delivery name is required")
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Taco> tacos = new ArrayList<>();
    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
