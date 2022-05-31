import java.util.List;

public class Banco {
        private String Nome;
        private List<Cliente> cl;

        public String getNome() {
                return Nome;
        }

        public void setNome(String nome) {
                Nome = nome;
        }

        public List<Cliente> getCl() {
                return cl;
        }

        public void setCl(List<Cliente> cl) {
                this.cl = cl;
        }
}
