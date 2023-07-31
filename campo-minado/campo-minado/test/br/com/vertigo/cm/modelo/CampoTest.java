package br.com.vertigo.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.vertigo.cm.excecao.ExplosaoException;

public class CampoTest {

    private Campo campo;
    
    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testAdicionarVizinhoEsquerda() {
        Campo vizinho= new Campo(3, 2);
        Boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado); 
    }
    
    @Test
    void testAdicionarVizinhoDireita() {
        Campo vizinho= new Campo(3, 4);
        Boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado); 
    }
    
    @Test
    void testAdicionarVizinhoEmCima() {
        Campo vizinho= new Campo(2, 3);
        Boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado); 
    }
    
    @Test
    void testAdicionarVizinhoEmBaixo() {
        Campo vizinho= new Campo(4, 3);
        Boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado); 
    }
    
    @Test
    void testAdicionarVizinhoDiagonal() {
        Campo vizinho= new Campo(2, 2);
        Boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado); 
    }
    
    @Test
    void testNaoAdicionarVizinho() {
        Campo vizinho= new Campo(1, 1);
        Boolean resultado = campo.adicionarVizinho(vizinho);
        assertFalse(resultado); 
    }

    @Test
    void testValorPadraoAtributoMarcado() {
        assertFalse(campo.isMarcado());
    }

    @Test
    void testAlternarMarcacao() {
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }
    
    @Test
    void testAlternarMarcacaoDuasChamadas() {
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }
    
    @Test
    void testAbrirNaoMinadoNaoMarcado() {
        assertTrue(campo.abrir());
    }
    
    @Test
    void testAbrirNaoMinadoMarcado() {
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }
    
    @Test
    void testAbrirMinadoMarcado() {
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }
    
    @Test
    void testAbrirMinadoNaoMarcado() {
        campo.minar();

        assertThrows(ExplosaoException.class, () ->{
            campo.abrir();
        });
    }

    @Test
    void testAbrirComVizinhos() {

        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 2);
        campo12.minar();

        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);

        campo.adicionarVizinho(campo22);

        campo.abrir();

        assertTrue(campo22.isAberto() && !campo11.isAberto());
    }
}