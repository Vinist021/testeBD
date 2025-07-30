import DAO.UsuarioDAO;
import entity.Usuario;

public class Main {

    public static void main(String[] args) {
        Usuario u = new Usuario();

        u.setNome("teste");
        u.setLogin("da silva");
        u.setSenha("1234");
        u.setEmail("teste@gmail.com");

        new UsuarioDAO().cadastrarUsuario(u);

    }

}
