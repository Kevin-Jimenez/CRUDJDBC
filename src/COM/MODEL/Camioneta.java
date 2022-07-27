
package COM.MODEL;

public class Camioneta {
    private int id;
    private String placa;
    private int cilindraje;
    private String pais;
    private int concesionarioIdentificacion;
    
    public Camioneta(int id,String placa, int cilindraje,String pais,int concesionarioIdentificacion){
        this.id = id;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.pais = pais;
        this.concesionarioIdentificacion = concesionarioIdentificacion;
    }

    public Camioneta(String placa, int cilindraje, String pais) {
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.pais = pais;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getConcesionarioIdentificacion() {
        return concesionarioIdentificacion;
    }

    public void setConcesionarioIdentificacion(int concesionarioIdentificacion) {
        this.concesionarioIdentificacion = concesionarioIdentificacion;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "id=" + id + ", placa=" + placa + ", cilindraje=" + cilindraje + ", pais=" + pais + ", concesionarioIdentificacion=" + concesionarioIdentificacion + '}';
    }
    
}
