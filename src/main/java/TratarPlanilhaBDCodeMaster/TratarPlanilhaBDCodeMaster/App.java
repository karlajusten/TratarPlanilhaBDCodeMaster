package TratarPlanilhaBDCodeMaster.TratarPlanilhaBDCodeMaster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.ListAutoNumber;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		
		try{
			
			// Cria novo .xlsx
			XSSFWorkbook workBookResultante = new XSSFWorkbook();
			XSSFSheet planilhaResultante = workBookResultante.createSheet("Banco de Dados");
		    
			
			//Based on: http://www.java67.com/2014/09/how-to-read-write-xlsx-file-in-java-apache-poi-example.html
			
			File xlsxOriginal = new File("/media/karla/Dados/Ciencia da Computação/Analise88k/BD_88k_Backup_Nome_ResultadoDesign_SeparadoPorPontoEVirgula.xlsx"); 
			FileInputStream fis = new FileInputStream(xlsxOriginal); // Finds the workbook instance for XLSX file  
			XSSFWorkbook workBookOriginal = new XSSFWorkbook (fis); // Return first sheet from the XLSX workbook  
			XSSFSheet planilhaOriginal = workBookOriginal.getSheetAt(0);

			XSSFRow linhaOriginal;
			XSSFRow linhaResultante;
			AppInventorGradeDesign gDesign = new AppInventorGradeDesign();
			Gson gson = new Gson();
			Object value;
			
			/**/
			XSSFRow titleRow = planilhaResultante.createRow(0);
		    titleRow.createCell(0).setCellValue("nome_arquivo");
		    
			List<String> nomesVariaveisDesign = new ArrayList<>();
			List<Method> metodosGetDesign = new ArrayList<>();
			
			Method[] todosMethods = gDesign.getClass().getDeclaredMethods();
			for(int m = 0; m<todosMethods.length; m++){
				if(todosMethods[m].getName().contains("get")){
					metodosGetDesign.add(todosMethods[m]);
					nomesVariaveisDesign.add(todosMethods[m].getName().substring(3));
					titleRow.createCell(nomesVariaveisDesign.size()).setCellValue(nomesVariaveisDesign.get(nomesVariaveisDesign.size()-1));
				}
			}		
			
			for (int contadorlinha = 1; contadorlinha<=planilhaOriginal.getPhysicalNumberOfRows(); contadorlinha++){//
				linhaOriginal = planilhaOriginal.getRow(contadorlinha);
				linhaResultante = planilhaResultante.createRow(contadorlinha);
				
				//Copia nome do arquivo da primeira coluna para a nova planilha;
				linhaResultante.createCell(0).setCellValue(linhaOriginal.getCell(0).getStringCellValue());
				
				//Subdivide celula da segunda coluna;
				gDesign = gson.fromJson(linhaOriginal.getCell(1).getStringCellValue(), AppInventorGradeDesign.class);
				for (int variavel = 0; variavel < metodosGetDesign.size(); variavel++){
					value = metodosGetDesign.get(variavel).invoke(gDesign, null);
					
					if (value instanceof String){
						linhaResultante.createCell((variavel+1)).setCellValue(value.toString()); 
					} else if (value instanceof Integer){
						linhaResultante.createCell((variavel+1)).setCellValue((Integer) value); 
					} else{
						linhaResultante.createCell((variavel+1)).setCellValue((Double) value); 
					}
				}
				
				System.out.println(contadorlinha);	
			}
		    
		    // Write to disk	
		    String filepath = "/media/karla/Dados/Ciencia da Computação/Analise88k/BD_88k_Backup_Nome_ResultadoDesign_Tratado.xlsx";
		    FileOutputStream out = new FileOutputStream(new File(filepath));
		    workBookResultante.write(out);
			out.close();
			
		    
			workBookResultante.close();
			workBookOriginal.close();
			
		    System.out.println("Finalizou com Sucesso!");
		    
		    
		}
		catch (Exception ex) {
			System.out.println("ERROR: \n" + ex);
		}
	
		

	}
	
	private static List<String> getNomeVariaveis(List<Method> methodsGet) {
		
		List<String> variaveis = new ArrayList<>();
		
		// TODO Auto-generated method stub
		return null;
	}


	
}
