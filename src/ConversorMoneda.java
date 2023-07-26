import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorMoneda {
    public static void main(String[] args) {
        boolean iniciar = true;

        while (iniciar) {

            // Menú para seleccion de conversión
            Object convertidor = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Conversor de Moneda",
                    JOptionPane.DEFAULT_OPTION, null,
                    new Object[]{"Conversor de moneda", "Conversor de temperatura", "Conversor de velocidad","Conversor de distancia"},
                    "Conversor de moneda");

            if (convertidor == null) {

                iniciar = false;
                JOptionPane.showMessageDialog(null, "Programa terminado");

            } else {

                // Input para ingresar el valor a convertir
                String valorConvertir = JOptionPane.showInputDialog(null,
                        "Ingresa el valor que deseas convertir en el " + convertidor
                                + "",
                        "Input", JOptionPane.QUESTION_MESSAGE);

                // While para controlar el ingreso de solo numeros
                while (!soloNumeros(valorConvertir)) {

                    JOptionPane.showMessageDialog(null, "Valor no válido");

                    valorConvertir = JOptionPane.showInputDialog(null,
                            "Por favor ingresa números para realizar la conversión",
                            "ERROR !", JOptionPane.ERROR_MESSAGE);

                }

                // Inicialización de variable double para convertir el valor ingresado por el
                // usuario
                double valor = Double.parseDouble(valorConvertir);

                // Inicializacion de variable double para realizar la operacion de conversion
                double conversion;

                // If para controlar la opcion de conversion elegida
                if (convertidor == "Conversor de moneda") {

                    Object moneda = JOptionPane.showInputDialog(null,
                            "Elije la moneda a la que deseas convertir tu dinero", "Moneda",
                            JOptionPane.DEFAULT_OPTION, null,
                            new Object[]{"De Pesos Mexicanos a Dólar", "De Pesos Mexicanos a Euros",
                                    "De Pesos Mexicanos a Libras Esterlinas", "De Pesos Mexicanos a Yen Japonés",
                                    "De Pesos Mexicanos a Won Surcoreano", "De Dólar a Pesos Mexicanos",
                                    "De Euros a Pesos Mexicanos", "De Libras Esterlinas a Pesos Mexicanos",
                                    "De Yen Japonés a Pesos Mexicanos", "De Won Surcoreano a Pesos Mexicanos"},
                            "De Pesos Mexicanos a Dólar");

                    // Se usa switch para controlar la opcion seleccionada por el usuario

                    switch (moneda.toString()) {

                        case "De Pesos Mexicanos a Dólar":

                            conversion = valor * 0.059;
                            JOptionPane.showMessageDialog(null,
                                    valor + " Peso(s) Mexicano(s) son: $" + redondear(conversion) + " Dólar(es)");

                            break;

                        case "De Pesos Mexicanos a Euros":

                            conversion = valor * 0.053;

                            JOptionPane.showMessageDialog(null,
                                    valor + " Peso(s) Mexicano(s) son: $" + redondear(conversion) + " Euro(s)");

                            break;

                        case "De Pesos Mexicanos a Libras Esterlinas":

                            conversion = valor * 0.046;

                            JOptionPane.showMessageDialog(null, valor + " Peso(s) Mexicano(s) son: $"
                                    + redondear(conversion) + " Libra(s) Esterlina(s)");

                            break;

                        case "De Pesos Mexicanos a Yen Japonés":

                            conversion = valor * 8.32;

                            JOptionPane.showMessageDialog(null, valor + " Peso(s) Mexicano(s) son: $"
                                    + redondear(conversion) + " Yen(es) Japonés(es)");

                            break;

                        case "De Pesos Mexicanos a Won Surcoreano":

                            conversion = valor * 75.59;

                            JOptionPane.showMessageDialog(null, valor + " Peso(s) Mexicano(s) son: $"
                                    + redondear(conversion) + " Won(es) Surcoreano(s)");

                            break;

                        case "De Dólar a Pesos Mexicanos":

                            conversion = valor * 16.94;

                            JOptionPane.showMessageDialog(null,
                                    valor + " Dólar(es) son: $" + redondear(conversion) + " Pesos Mexicanos ");

                            break;

                        case "De Euros a Pesos Mexicanos":

                            conversion = valor * 18.72;

                            JOptionPane.showMessageDialog(null,
                                    valor + " Euro(s) son: $" + redondear(conversion) + " Pesos Mexicanos");

                            break;

                        case "De Libras Esterlinas a Pesos Mexicanos":

                            conversion = valor * 21.84;

                            JOptionPane.showMessageDialog(null, valor + " Libra(s) Esterlina(s) son: $"
                                    + redondear(conversion) + " Pesos Mexicanos ");

                            break;

                        case "De Yen Japonés a Pesos Mexicanos":

                            conversion = valor * 0.12;

                            JOptionPane.showMessageDialog(null,
                                    valor + " Yen(es) Japonés(es) son: $" + redondear(conversion) + " Pesos Mexicanos ");

                            break;

                        case "De Won Surcoreano a Pesos Mexicanos":

                            conversion = valor * 0.013;

                            JOptionPane.showMessageDialog(null, valor + " Won(es) Surcoreano(s) son: $"
                                    + redondear(conversion) + " Pesos Mexicanos ");

                            break;

                    }

                } else if (convertidor == "Conversor de temperatura") {

                    Object temperatura = JOptionPane.showInputDialog(null,
                            "Elije la escala a la que deseas convertir tu temperatura", "Escala Temperatura",
                            JOptionPane.DEFAULT_OPTION, null,
                            new Object[]{"De Celsius (°C) a Fahrenheit (°F)", "De Celsius (°C) a Kelvin (K)",
                                    "De Fahrenheit (°F) a Kelvin (K)", "De Fahrenheit (°F) a Celsius (°C)",
                                    "De Kelvin (K) a  Celsius (°C)", "De Kelvin (K) a Fahrenheit (°F)"},
                            "De Celsius (°C) a Fahrenheit (°F)");


                    switch (temperatura.toString()) {

                        case "De Celsius (°C) a Fahrenheit (°F)":
                            // 1.8
                            //conversion = ((valor * 9) / 5) + 32;
                            conversion = valor * 9 / 5 + 32;
                            JOptionPane.showMessageDialog(null, valor + "°C equivalen a: " + redondear(conversion) + "°F");

                            break;

                        case "De Celsius (°C) a Kelvin (K)":

                            conversion = valor + 273.15;

                            JOptionPane.showMessageDialog(null, valor + "°C equivalen a: " + redondear(conversion) + " K");

                            break;

                        case "De Fahrenheit (°F) a Kelvin (K)":

                            conversion = (((valor - 32) * 5) / 9) + 273.15;

                            JOptionPane.showMessageDialog(null, valor + "°F equivalen a: " + redondear(conversion) + " K");

                            break;

                        case "De Fahrenheit (°F) a Celsius (°C)":

                            //conversion = (((valor - 32) * 5) / 9);
                            conversion = (valor - 32) * 5 /9;
                            JOptionPane.showMessageDialog(null, valor + "°F equivalen a: " + redondear(conversion) + "°C");

                            break;

                        case "De Kelvin (K) a  Celsius (°C)":

                            conversion = valor - 273.15;

                            JOptionPane.showMessageDialog(null, valor + " K equivalen a: " + redondear(conversion) + "°C");

                            break;

                        case "De Kelvin (K) a Fahrenheit (°F)":

                            conversion = (((valor - 273.15) * 9) / 5) + 32;

                            JOptionPane.showMessageDialog(null, valor + " K equivalen a: " + redondear(conversion) + "°F");

                            break;

                    }

                } else if(convertidor == "Conversor de velocidad") {

                    Object velocidad = JOptionPane.showInputDialog(null, "Elije la velocidad a la que deseas convertir",
                            "Velocidad", JOptionPane.DEFAULT_OPTION, null,
                            new Object[]{"Metro(s) por segundo a kilometro(s) por hora",
                                    "Metro(s) por segundo a Milla(s) por hora",
                                    "Kilometro(s) por hora a Metro(s) por segundo",
                                    "Kilometro(s) por hora a Milla(s) por hora",
                                    "Milla(s) por hora a Metro(s) por segundo",
                                    "Milla(s) por hora a Kilometro(s) por hora"},
                            "Metros por segundo a kilometros por hora");

                    // Se usa switch para controlar la opcion seleccionada por el usuario

                    switch (velocidad.toString()) {

                        case "Metro(s) por segundo a kilometro(s) por hora":

                            conversion = valor * 3.6;
                            JOptionPane.showMessageDialog(null,
                                    valor + " m/s equivalen a: " + redondear(conversion) + " km/h");

                            break;

                        case "Metro(s) por segundo a Milla(s) por hora":

                            conversion = valor * 2.237;

                            JOptionPane.showMessageDialog(null,
                                    valor + " m/s equivalen a: " + redondear(conversion) + " mph");

                            break;

                        case "Kilometro(s) por hora a Metro(s) por segundo":

                            conversion = valor / 3.6;

                            JOptionPane.showMessageDialog(null,
                                    valor + " km/h equivalen a: " + redondear(conversion) + " m/s");

                            break;

                        case "Kilometro(s) por hora a Milla(s) por hora:":

                            conversion = valor / 1.609;

                            JOptionPane.showMessageDialog(null,
                                    valor + " km/h equivalen a: " + redondear(conversion) + " mph");

                            break;

                        case "Milla(s) por hora a Metro(s) por segundo":

                            conversion = valor / 2.237;

                            JOptionPane.showMessageDialog(null,
                                    valor + " mph equivalen a: " + redondear(conversion) + " m/s");

                            break;

                        case "Milla(s) por hora a Kilometro(s) por hora":

                            conversion = valor * 1.609;

                            JOptionPane.showMessageDialog(null,
                                    valor + " mph equivalen a: " + redondear(conversion) + " km/h");

                            break;

                    }
                } // Fin del if que controla que convertidor elige el usuario
                else{
                    Object longitud = JOptionPane.showInputDialog(null,
                            "Elije la distancia a la que deseas convertir",
                            "Longitud",JOptionPane.DEFAULT_OPTION, null,
                            new Object[]{"De Metros (m) a Kilometros (km)","De metros (m) a millas (mi)","De metros (m) a centimetros (cm)","De metros (m) a pulgadas (in)",
                            "De metros (m) a pies (ft)","De metros (m) a yardas (yd)"},
                            "De Metros (m) a Kilometros (km)");

                    switch (longitud.toString()){
                        case "De Metros (m) a Kilometros (km)":
                            conversion = valor * 0.001;
                            JOptionPane.showMessageDialog(null, valor + " m equivalen a: " + redondear(conversion) + " km");
                            break;

                            case "De metros (m) a millas (mi)":
                            conversion = valor / 1609;
                            JOptionPane.showMessageDialog(null, valor + " m equivalen a: " + redondear(conversion) + " mi");
                            break;

                        case "De metros (m) a centimetros (cm)":
                            conversion = valor * 100;
                            JOptionPane.showMessageDialog(null, valor + " m equivalen a: " + redondear(conversion) + " cm");
                            break;
                        case "De metros (m) a pulgadas (in)":
                            conversion = valor * 39.37;
                            JOptionPane.showMessageDialog(null, valor + " m equivalen a: " + redondear(conversion) + " in");
                            break;

                        case "De metros (m) a pies (ft)":
                            conversion = valor * 3.2808;
                            JOptionPane.showMessageDialog(null, valor + " m equivalen a: " + redondear(conversion) + " ft");
                            break;

                        case "De metros (m) a yardas (yd)":
                            conversion = valor * 1.094;
                            JOptionPane.showMessageDialog(null, valor + " m equivalen a: " + redondear(conversion) + " yd");
                            break;
                    }
                }

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas otra conversión?");

                if (respuesta == 0) {

                    iniciar = true;

                } else {

                    iniciar = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }

            }
        }
    } // Fin main

    private static boolean soloNumeros(String valor) {

        try {

            Double.parseDouble(valor);
            return true;

        } catch (NumberFormatException e) {

            return false;
        }
    }

    private static String redondear(double valor) {

        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        return decimalFormat.format(valor);

    }
}
