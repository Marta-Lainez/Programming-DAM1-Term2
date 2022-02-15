/*
Comprueba:
1o En la funci�n constructora de la clase Jefe, prueba a poner "super" y ver qu� es lo que te
deja usar de la clase Empleado.
2o En la funci�n constructora de la clase JefeEspecial, prueba a poner "super" y ver qu� es
lo que te deja usar de la clase EmpleadoEspecial.
3o A�ade a la clase Jefe un nuevo atributo de tipo "EmpleadoEspecial" (recuerda que hay
que importar dicha clase para poder usarla fuera de su paquete).
Instancia dicho objeto dentro de la funci�n constructora y pon
"nombre_Objeto_tipo_Empleado_Especial" y comprueba qu� es lo que te deja usar.
*/
package visibilidad1;
import visibilidad2.EmpleadoEspecial;
/**
 * Constructor de JefeEspecial. Al poner super() llama al constructor de EmpleadoEspecial, su superclase
 */
public class JefeEspecial extends EmpleadoEspecial{
	public JefeEspecial(){
		super();
	}
}