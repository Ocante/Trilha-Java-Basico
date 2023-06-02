public class Comentarios {
    public void main(String[] args) {
        // One Line => Olá, eu sou um comentário em uma única linha

        /*
         * Multi-Line
         * Olá,
         * Eu sou um comentario
         * que posso ser mais detalhadod
         * quando necessário
         */

        /**
         * Documentação
         * Estas duas estrelinhas acima
         * é para identificar que você
         * pretende elaborar um comentário
         * a nível de documentação.
         * Que incrível !!!
         */

    }

    public void metodo() {

    }

    // Tomar cuidado com as nomenclaturas das variaveis.
    // Não se acostume a usar comentáio para abreviar informar o motivo da
    // abreviação dos
    // variaveis e explicar no comentário, iso não é boa prática.

    public int somaMultiplica(int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M") { // M= multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

    // Comando de documentação
    // javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java

}