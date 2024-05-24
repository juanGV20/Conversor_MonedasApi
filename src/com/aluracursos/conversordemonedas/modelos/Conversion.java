package com.aluracursos.conversordemonedas.modelos;

public record Conversion(String base_code, String target_code, double conversion_rate,
                         double conversion_result) {


    @Override
    public String toString() {
        return  "[" + base_code + ']' +
                " corresponde al valor final de ====> " + conversion_result +
                "[" + target_code + "], conversion_rate="  + conversion_rate ;
    }


}
