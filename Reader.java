import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Reader{
    public static String getRuta(){
        JFileChooser chooser = new JFileChooser();
	 	FileNameExtensionFilter fileExtensionFilter =new FileNameExtensionFilter("*.TXT", "txt");
	 	chooser.setFileFilter(fileExtensionFilter);
	 	File f = null;
	 	
		try {
			f = new File(new File(".").getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String ruta = "";
		
		try {
			chooser.setCurrentDirectory(f);
			chooser.setCurrentDirectory(null);
			chooser.showOpenDialog(null);
	    
			ruta = chooser.getSelectedFile().toString();
		}catch(Exception e) {
			
		}
        return ruta;
    }

    public static Object[] read(String ruta) {
		
		File file = new File(ruta);
		FileReader fr;
		BufferedReader br;
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		try {
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				String[] parametros = line.split(", "); 
				pacientes.add(new Paciente(parametros[0].trim(),parametros[1].trim(),parametros[2].trim()));		
			}
				
			br.close();
			fr.close();		
		} catch (Exception e) {
			
		}	
		return pacientes.toArray();
	}
}