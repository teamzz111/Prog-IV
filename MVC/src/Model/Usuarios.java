package Model;
public class Usuarios {
    
    
    int Documento;
    String Nombres;
    String Login;
    String Password;
    
    public Usuarios(){
    
        int Documento=0;
        String Nombres = "";
        String Login ="";
        String Password="";
        
    }
    
    public int getDocumento(){
        return Documento;
    }
    
    public String getNombres(){
        return Nombres;
    }
    
    public String getLogin(){
        return Login;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setDocumento(int Documento){
        this.Documento = Documento;
    }
    
    public void setNombres (String Nombres){
        this.Nombres = Nombres;
    }
    
    public void setLogin (String Login){
        this.Login = Login;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
}
