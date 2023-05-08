package com.example.mobile3.login;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class UserData {
    @Id
    private String id;
    private String pw;
/*
    public UserData() {}

    public UserData(String userId, String password) {
        this.id = userId;
        this.pw = password;
    }

    public String getId() {
        return id;
    }
    public String getPassword() {
        return pw;
    }

    public String toString() {
        return String.format("User[UserId:%s, password: %s]", id, pw);
    }
*/
}
