package stores;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;


@Data
@Table("authors")
public class Author {
    @Id
    private Long id;
    private Date createdAt = new Date();

    @NotNull
    @Size(min=5, message="ФИО должно содержать не менее 5 символов")
    @Column("full_name")
    private String fullName;
    @NotNull
    @Email(message = "Неверный формат E-mail")
    @Column("email")
    private String email;
}