public class Config
{
        private String serverName;
        private int puerto;
        private String usuario;
        private String password;
        
        public String getServerName() {
            return serverName;
        }

        public void setServerName(String serverName) {
            this.serverName = serverName;
        }

        public int getPuerto() {
            return puerto;
        }

        public void setPuerto(int puerto) {
            this.puerto = puerto;
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
}
