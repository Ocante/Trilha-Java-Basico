public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int NovoCanal) {
        canal = NovoCanal;
    }

    public void aumentarCanal() {
        canal++;

    }

    public void diminuirarCanal() {
        canal--;

    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = true;
    }

    public void aumentarVolume() {
        // volume = volume + 1;
        volume++;

    }

    public void diminuirVolume() {
        // volume = volume + 1;
        volume--;
        System.out.println("Aumentar volume para : " + volume);

    }

}
