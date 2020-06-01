package Tarea5;

public class SumaParesfor {

    private int i;
    private int numero;
    private int sumaP;
    private int limite;
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSumaP() {
        return sumaP;
    }

    public void setSumaP(int sumaP) {
        this.sumaP = sumaP;
    }

    public void SumaT() {
       for (i=0;i <limite;i++) {

            if (numero % 2 == 0) {
                mensaje=("La suma se realizo corectamente");
                sumaP = sumaP+ numero;
              
            } else {
          
                mensaje=("___|Error|___");
                
            }

        }

    }

}
