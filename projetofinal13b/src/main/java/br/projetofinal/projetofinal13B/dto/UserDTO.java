package br.projetofinal.projetofinal13B.dto;

import br.projetofinal.projetofinal13B.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String name;
    private String email;

    public UserDTO(User user) {
        this.name = user.getNome();
        this.email = user.getEmail();
    }

}
