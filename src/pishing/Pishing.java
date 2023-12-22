/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pishing;

import java.io.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Pishing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static Map<String, Integer> inicializarTexto() {
        Map<String, Integer> texto = new HashMap<>();
        texto.put("Enhora buena", 1);
        texto.put("Cuidado", 1);
        texto.put("usted a sido seleccionado", 3);
        texto.put("Gane dinero facil", 2);
        texto.put("por este mes", 1);
        texto.put("¡Importante! Su contraseña está a punto de expirar", 3);
        texto.put("Acción requerida", 2);
        texto.put("Se ha identificado una vulnerabilidad", 3);
        texto.put("Se requiere un cambio de contraseña inmediatamente", 3);
        texto.put("Verificación de cuenta", 2);
        texto.put("Contraseña expirada", 3);
        texto.put("Actividad sospechosa", 2);
        texto.put("Urgente: accione de inmediato", 3);
        texto.put("Actualice sus datos", 3);
        texto.put("phishing", 3);
        texto.put("contraseña", 2);
        texto.put("urgente", 2);
        texto.put("Google", 3);
        texto.put("Whatsapp", 3);
        texto.put("Netflix", 3);
        texto.put("Facebook", 3);
        texto.put("Gmail", 3);
        texto.put("Instagram", 3);
        texto.put("¡Necesito ayuda urgente!", 3);
        texto.put("Actividad sospechosa de Outlook", 1);
        texto.put("Inicie sesión para evitar el bloqueo", 3);
        texto.put("Su cuenta ha sido comprometida", 3);
        texto.put("Gane dinero rápido", 2);
        texto.put("Oferta exclusiva", 3);
        
        return texto;
    }

}
