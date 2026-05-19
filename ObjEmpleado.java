public class ObjEmpleado {
    private String Nombre;
    private int Salario;
    private int HorasExtrasDiurnas;
    private int HorasExtrasNocturnas;
    private int HorasExtrasDiurnasFestivas;
    private int HorasExtrasNocturnasFestivas;

    public ObjEmpleado() {
    }

    public ObjEmpleado(String nombre, int salario, int horasExtrasDiurnas, int horasExtrasNocturnas,
            int horasExtrasDiurnasFestivas, int horasExtrasNocturnasFestivas) {
        Nombre = nombre;
        Salario = salario;
        HorasExtrasDiurnas = horasExtrasDiurnas;
        HorasExtrasNocturnas = horasExtrasNocturnas;
        HorasExtrasDiurnasFestivas = horasExtrasDiurnasFestivas;
        HorasExtrasNocturnasFestivas = horasExtrasNocturnasFestivas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    public int getHorasExtrasDiurnas() {
        return HorasExtrasDiurnas;
    }

    public void setHorasExtrasDiurnas(int horasExtrasDiurnas) {
        HorasExtrasDiurnas = horasExtrasDiurnas;
    }

    public int getHorasExtrasNocturnas() {
        return HorasExtrasNocturnas;
    }

    public void setHorasExtrasNocturnas(int horasExtrasNocturnas) {
        HorasExtrasNocturnas = horasExtrasNocturnas;
    }

    public int getHorasExtrasDiurnasFestivas() {
        return HorasExtrasDiurnasFestivas;
    }

    public void setHorasExtrasDiurnasFestivas(int horasExtrasDiurnasFestivas) {
        HorasExtrasDiurnasFestivas = horasExtrasDiurnasFestivas;
    }

    public int getHorasExtrasNocturnasFestivas() {
        return HorasExtrasNocturnasFestivas;
    }

    public void setHorasExtrasNocturnasFestivas(int horasExtrasNocturnasFestivas) {
        HorasExtrasNocturnasFestivas = horasExtrasNocturnasFestivas;
    }
    
    


    
}
