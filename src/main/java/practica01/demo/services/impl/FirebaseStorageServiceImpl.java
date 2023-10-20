/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.demo.services.impl;

/**
 *
 * @author jorge
 */
import org.springframework.web.multipart.MultipartFile;
public interface FirebaseStorageServiceImpl {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "practica01-aecae.appspot.com";
    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "practica01";
    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "practica01-aecae-firebase-adminsdk-q3l2v-34ba0c988d.json";
}
