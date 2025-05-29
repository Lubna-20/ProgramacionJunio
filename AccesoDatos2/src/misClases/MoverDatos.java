package misClases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import misclses.Ciclos;



public class MoverDatos {
	
		ArrayList<Alturas> listadoAlturas = new ArrayList<Alturas>();
		public static void main(String[] args) {
			final String url = "jdbc:mysql://localhost:3306/augustobriga";
			final String usuario = "root";
			final String pws = "";

			// ESTABLECER CONEXION CON EL SERVIDOR DE BASE DE DATOS
			try (Connection conexion = DriverManager.getConnection(url, usuario, pws)) {
				cargarAlturas(conexion);
			} catch (SQLException ex) {
				System.out.println("Error de Driver o permiso");
			}

	}
		private static void cargarAlturas(Connection conexion) {
			
				String cadenaSql = "select * from alturas";
				if (conexion == null) {
					System.out.println("Error en la conexion de la BD");
				} else {
					try {
						PreparedStatement psStatement = conexion.prepareStatement(cadenaSql);
						ResultSet resultado = psStatement.executeQuery();
						// LA CONSULTA YA SE HA EJECUTADO
						// LOS DATOS YA ESTAN EN RESULTADO
						// NO ESTAN PROCESADOS
						while (resultado.next()) {
							String procincia = resultado.getString("provincia");
							String nombre = resultado.getString("nombre");
							String correo = resultado.getString("correo");
							String ciclo = resultado.getString("ciclo");
							String turno = resultado.getString("turno");
							String ies = resultado.getString("IES");
							Ciclos cc = new Ciclos(idAl, nombre, correo, ciclo, turno, ies);
							listadoCiclos.add(cc);

						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				mostrarContenidoLista();
				volcarBD_ficheroCSV();
				volcar_ficheroCSV_ficheroBinario();
				volcar_ficheroBIN_BD(conexion);

			
			
		}

}
