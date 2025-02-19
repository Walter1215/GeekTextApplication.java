package group7.geektext.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "creditcards")
public class CreditCard {
    @Id
    private String id;
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    // Constructors, Getters, and Setters can be generated by Lombok's @Data annotation
}
