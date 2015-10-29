/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessCenter;

/**
 *
 * @author alumno
 */
public class Inscripcion {
  private String nombre;
  private String apellido1;
  private String apellido2;
  private String fechaNac;
  private String telefono;
  private String dni;
  private String tipoCuota;
  private int cuota;
  
  public String getNombre() { return this.nombre; }
  public String getApellido1() { return this.apellido1; }
  public String getApellido2() { return this.apellido2; }
  public String getFechaNac() { return this.fechaNac; }
  
  public void setNombre(String nombre) { this.nombre = nombre; }
  public void setApellido1(String apellido1) { this.apellido1 = apellido1; }
  public void setApellido2(String apellido2) { this.apellido2 = apellido2; }
  public void setFechaNac(String fechaNac) { this.fechaNac = fechaNac; }
  public void setTelefono(String telefono) { this.telefono = telefono; }
  public void setDNI(String dni) { this.dni = dni; }
  public void setTipoCuota(String tipoCuota) { 
    this.tipoCuota = tipoCuota; 
    switch (this.tipoCuota) {
    case "F":
      this.cuota = 50;
      break;
    case "I":
      this.cuota = 40;
      break;
    case "M":
      this.cuota = 35;
      break;
    case "3":
      this.cuota = 25;
      break;
    }
  }
  
  public int getCuota() { return this.cuota; }
}
