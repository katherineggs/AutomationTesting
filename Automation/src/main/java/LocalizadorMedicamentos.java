public class LocalizadorMedicamentos {
    public String localizar(String nombre){
        return "Localizado en el estante 5";
    }
    public String Lugar(){
        return localizar(Medicamentos.nombre());
    }
}

