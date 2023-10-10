package modals;

import lombok.*;

@AllArgsConstructor //конструктор
@NoArgsConstructor
@Getter
@Setter
//@Builder //строитель обьект создает с разными данными
@ToString
@EqualsAndHashCode
public class Student {
    private String  firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String currentAddress;

}
