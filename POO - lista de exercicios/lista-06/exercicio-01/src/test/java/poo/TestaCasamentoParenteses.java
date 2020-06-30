package poo;

import org.junit.Test;
import poo.exercicio01.CasamentoParenteses;

import static org.junit.Assert.assertEquals;

public class TestaCasamentoParenteses {
    @Test
    public void testaCasamentos(){
        CasamentoParenteses obj = new CasamentoParenteses();
        //assertEquals("Lados devem ser != 0","Não é um triângulo",obj.tipoTriangulo(0,0,0));
        // abertura

        assertEquals("associacao incorreta", "( incorreto", obj.validaExpressaoMatematica("{(}"));
        assertEquals("associacao incorreta", "{ incorreto", obj.validaExpressaoMatematica("{()"));
        assertEquals("associacao incorreta", "[ incorreto", obj.validaExpressaoMatematica("{[()}"));
        //fechamento

        assertEquals("associacao incorreta", ") incorreto", obj.validaExpressaoMatematica("{)}"));
        assertEquals("associacao incorreta", "} incorreto", obj.validaExpressaoMatematica("()}"));
        assertEquals("associacao incorreta", "] incorreto", obj.validaExpressaoMatematica("{()]}"));

        //com números
        assertEquals("associacao correta", "expressao validada", obj.validaExpressaoMatematica("{[2*2-(4*1*1)]/(2*1)}"));
        assertEquals("associacao incorreta", "} incorreto", obj.validaExpressaoMatematica("{[2*2-(4*1*1)]/(2*1)"));
        assertEquals("associacao incorreta", ") incorreto", obj.validaExpressaoMatematica("{[2*2-(4*1*1)]/(2*1}"));

    }
}
