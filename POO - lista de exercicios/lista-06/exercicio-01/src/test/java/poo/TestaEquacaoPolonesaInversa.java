package poo;

import org.junit.Test;
import poo.exercicio01.CasamentoParenteses;
import poo.exercicio02.EquacaoPolonesaInversa;

import static org.junit.Assert.assertEquals;

public class TestaEquacaoPolonesaInversa {    @Test
public void testaRPN(){
    EquacaoPolonesaInversa obj = new EquacaoPolonesaInversa();
    //assertEquals("Lados devem ser != 0","Não é um triângulo",obj.tipoTriangulo(0,0,0));
    // abertura

    assertEquals("expressão incorreta", "sem expressão", obj.RPN(""));
    assertEquals("expressão incorreta", "sem números na expressão", obj.RPN("*+-/"));
    assertEquals("expressão incorreta", "sem operadores na expressão", obj.RPN("123"));

    assertEquals("expressão incorreta", "ordem do operador incorreta", obj.RPN("" + "*ab"));
    assertEquals("expressão incorreta", "ordem do operador incorreta", obj.RPN("" + "+ab"));
    assertEquals("expressão incorreta", "ordem do operador incorreta", obj.RPN("" + "-ab"));
    assertEquals("expressão incorreta", "ordem do operador incorreta", obj.RPN("" + "/ab"));

}

}
