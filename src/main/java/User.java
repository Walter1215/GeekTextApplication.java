package group7.geektext.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String name;
    private String emailAddress;
    private String homeAddress;
    private List<CreditCard> creditCards = new ArrayList<>();

    // Constructors, Getters, and Setters can be generated by Lombok's @Data annotation
}
