/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.modelo;

import lombok.Data;

@Data
public class Estudiante {

    int código;
    String nombres;
    int ciclo;
    int grupo;
    String carrera;
    float promedio;
    String estatus;

    public Estudiante() {
        this.código = 0;
        this.nombres = null;
        this.ciclo = 0;
        this.grupo = 0;
        this.carrera = null;
        this.promedio = 0.0f;
        this.estatus = null;
        
    }

    public Estudiante(int código, String nombres, int ciclo, int grupo, String licenciatura, float promedio, String estatus) {
        this.código = código;
        this.nombres = nombres;
        this.ciclo = ciclo;
        this.grupo = grupo;
        this.carrera = licenciatura;
        this.promedio = promedio;
        this.estatus = estatus;
        
    }
    
    public void setCódigo(int código){
        this.código = código;
    }
    
    public void setNombres(String nombres){
         this.nombres = nombres;
    }
    
    public void setCiclo(int ciclo){
        this.ciclo = ciclo;
    }
    
    public void setGrupo(int grupo){
        this.grupo = grupo;
    }
    
    public void setCarrera(String carrera){
        this.carrera = carrera;
    
    }
   
    public void setPromdio(float promedio){
        this.promedio = promedio;
    }
    
    public void setEstatus(String estatus){
        this.estatus = estatus;
    }
    
    
    public int getCódigo(){
        return código;
    }
    public String getNombres(){
        return nombres;
    }
    public int getCiclo(){
        return ciclo;
    }
    public int getGrupo(){
        return grupo;
    }
    public String getCarrera(){
        return carrera;
    }
    public float getPromrdio(){
        return promedio;
    }
    public String getEstatus(){
        return estatus;
    }
    
    
    public String getDatos(){
        return  "\nCódigo: " + código +
                "\nNombres: " + nombres +
                "\nCiclo: " + ciclo +
                "\nGrupo: " + grupo +
                "\nCarrera: " + carrera +
                "\nPromedio: " + promedio + 
                "\nEstatus: " + estatus;
  }

}
    