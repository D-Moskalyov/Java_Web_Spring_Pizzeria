package web.pizzeria.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="users")
public class User implements Serializable, UserDetails {

    static GrantedAuthority auth = new GrantedAuthority() {
        //@Override
        public String getAuthority() {
            return "ROLE_USER";
        }
    };

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> list = new ArrayList();
        list.add(auth);
        return list;
    }

    //@Override
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return email;
    }

    //@Override
    public boolean isAccountNonExpired() {
        return false;
    }

    //@Override
    public boolean isAccountNonLocked() {
        return false;
    }

    //@Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    //@Override
    public boolean isEnabled() {
        return false;
    }
}
