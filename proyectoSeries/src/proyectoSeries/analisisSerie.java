package proyectoSeries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class analisisSerie {

	public static void main(String[] args) {
		ArrayList<claseSerie> listadoVisualSeries = new ArrayList<claseSerie>();
		ArrayList<claseSerie> listadoSeriesValidas = new ArrayList<claseSerie>();
		ArrayList<claseSerie> listadoSeriesNoValidas = new ArrayList<claseSerie>();

		try {
			FileReader fr = new FileReader("series.csv");
			BufferedReader bf = new BufferedReader(fr);
			String lineas;
			while ((lineas = bf.readLine()) != null) {
				String[] matriz = lineas.split(":");
				int minutos = Integer.parseInt(matriz[0]);
				String titulo = matriz[1];

				boolean esta = false;
				for (claseSerie c : listadoVisualSeries) {
					if (c.getNombre().equals(titulo)) {
						c.sumarMinutos(minutos);
						esta = true;
						break;
					}
				}
				if (!esta) {
					claseSerie serie = new claseSerie(titulo, minutos);
					listadoVisualSeries.add(serie);
				}

				;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		for (claseSerie s : listadoVisualSeries) {
			System.out.println(s.getNombre() + "-" + s.getMinutos());
			if (s.getMinutos() > 30) {
				listadoSeriesValidas.add(s);
			} else {
				listadoSeriesNoValidas.add(s);
			}
		}

		
		listadoSeriesValidas.sort((a,b)->b.getMinutos() - a.getMinutos());

		System.out.println("\n*******LISTADO VALIDAS ORDENADOS*********\n");
		for (claseSerie s : listadoSeriesValidas) {
			System.out.println(s.getNombre() + ":" + s.getMinutos());
		}
		
		try {
			//Guarde en un fichero de texto llamado top_series.txt las tres series más  vistas
			//Guarde en un fichero de texto llamado series_menos_vistas.txt las tres series menos vistas
			//Guarde en un fichero de texto llamado series_descartadas.txt las series que no han superado los 30 minutos
			BufferedWriter bw = new BufferedWriter(new FileWriter("top_Series.txt"));
			for (int i = 0; i < 3; i++) {
				bw.write(listadoSeriesValidas.get(i).getMinutos()+":" + listadoSeriesValidas.get(i).getNombre()+"\n");
			}
			BufferedWriter bw2 = new BufferedWriter(new FileWriter("series_menos_vistas.txt"));
			for (int i = listadoSeriesValidas.size()-1; i > listadoSeriesValidas.size()-4; i--) {
				bw2.write(listadoSeriesNoValidas.get(i).getMinutos()+":" + listadoSeriesNoValidas.get(i).getNombre()+"\n");
			}
			BufferedWriter bw3 = new BufferedWriter(new FileWriter("series_descartadas.txt"));
			for (claseSerie x : listadoSeriesNoValidas) {
				bw3.write(x.getMinutos()+":" + x.getNombre()+"\n");
			}


			bw3.close();
			
			bw2.close();

			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
