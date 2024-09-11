package entidades;

import enums.FaixaIrpf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    // Caso 1: Salário = 850,00, Faixa = PRIMEIRA
    @Test
    public void testSalarioPrimeiraFaixa850() {
        Funcionario funcionario = new Funcionario(850.00, "Teste");
        assertEquals(FaixaIrpf.FAIXA01, funcionario.indentificarFaixaIrpg());
        assertEquals(0.00, funcionario.calcularIrpf());
    }

    // Caso 2: Salário = 850,00, IR = 0
    @Test
    public void testImpostoPrimeiraFaixa850() {
        Funcionario funcionario = new Funcionario(850.00, "Teste");
        assertEquals(0.00, funcionario.calcularIrpf());
    }

    // Caso 3: Salário = 1903,98, Faixa = PRIMEIRA
    @Test
    public void testSalarioPrimeiraFaixa190398() {
        Funcionario funcionario = new Funcionario(1903.98, "Teste");
        assertEquals(FaixaIrpf.FAIXA01, funcionario.indentificarFaixaIrpg());
        assertEquals(0.00, funcionario.calcularIrpf());
    }

    // Caso 4: Salário = 1903,98, IR = 0
    @Test
    public void testImpostoPrimeiraFaixa190398() {
        Funcionario funcionario = new Funcionario(1903.98, "Teste");
        assertEquals(0.00, funcionario.calcularIrpf());
    }

    // Caso 5: Salário = 1903,99, Faixa = SEGUNDA
    @Test
    public void testSalarioSegundaFaixa190399() {
        Funcionario funcionario = new Funcionario(1903.99, "Teste");
        assertEquals(FaixaIrpf.FAIXA02, funcionario.indentificarFaixaIrpg());
    }

    // Caso 6: Salário = 1903,99, IR = 0
    @Test
    public void testImpostoSegundaFaixa190399() {
        Funcionario funcionario = new Funcionario(1903.99, "Teste");
        assertEquals(0.00, funcionario.calcularIrpf());
    }

    // Caso 7: Salário = 2000,00, Faixa = SEGUNDA
    @Test
    public void testSalarioSegundaFaixa2000() {
        Funcionario funcionario = new Funcionario(2000.00, "Teste");
        assertEquals(FaixaIrpf.FAIXA02, funcionario.indentificarFaixaIrpg());
    }

    // Caso 8: Salário = 2000,00, IR = 7,20
    @Test
    public void testImpostoSegundaFaixa2000() {
        Funcionario funcionario = new Funcionario(2000.00, "Teste");
        assertEquals(7.20, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 9: Salário = 2826,65, Faixa = SEGUNDA
    @Test
    public void testSalarioSegundaFaixa282665() {
        Funcionario funcionario = new Funcionario(2826.65, "Teste");
        assertEquals(FaixaIrpf.FAIXA02, funcionario.indentificarFaixaIrpg());
    }

    // Caso 10: Salário = 2826,65, IR = 69,20
    @Test
    public void testImpostoSegundaFaixa282665() {
        Funcionario funcionario = new Funcionario(2826.65, "Teste");
        assertEquals(69.20, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 11: Salário = 2826,66, Faixa = TERCEIRA
    @Test
    public void testSalarioTerceiraFaixa282666() {
        Funcionario funcionario = new Funcionario(2826.66, "Teste");
        assertEquals(FaixaIrpf.FAIXA03, funcionario.indentificarFaixaIrpg());
    }

    // Caso 12: Salário = 2826,66, IR = 69,20
    @Test
    public void testImpostoTerceiraFaixa282666() {
        Funcionario funcionario = new Funcionario(2826.66, "Teste");
        assertEquals(69.20, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 13: Salário = 3000,00, Faixa = TERCEIRA
    @Test
    public void testSalarioTerceiraFaixa3000() {
        Funcionario funcionario = new Funcionario(3000.00, "Teste");
        assertEquals(FaixaIrpf.FAIXA03, funcionario.indentificarFaixaIrpg());
    }

    // Caso 14: Salário = 3000,00, IR = 95,20
    @Test
    public void testImpostoTerceiraFaixa3000() {
        Funcionario funcionario = new Funcionario(3000.00, "Teste");
        assertEquals(95.20, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 15: Salário = 3751,05, Faixa = TERCEIRA
    @Test
    public void testSalarioTerceiraFaixa375105() {
        Funcionario funcionario = new Funcionario(3751.05, "Teste");
        assertEquals(FaixaIrpf.FAIXA03, funcionario.indentificarFaixaIrpg());
    }

    // Caso 16: Salário = 3751,05, IR = 207,86
    @Test
    public void testImpostoTerceiraFaixa375105() {
        Funcionario funcionario = new Funcionario(3751.05, "Teste");
        assertEquals(207.86, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 17: Salário = 3751,06, Faixa = QUARTA
    @Test
    public void testSalarioQuartaFaixa375106() {
        Funcionario funcionario = new Funcionario(3751.06, "Teste");
        assertEquals(FaixaIrpf.FAIXA04, funcionario.indentificarFaixaIrpg());
    }

    // Caso 18: Salário = 3751,06, IR = 207,86
    @Test
    public void testImpostoQuartaFaixa375106() {
        Funcionario funcionario = new Funcionario(3751.06, "Teste");
        assertEquals(207.86, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 19: Salário = 4000,00, Faixa = QUARTA
    @Test
    public void testSalarioQuartaFaixa4000() {
        Funcionario funcionario = new Funcionario(4000.00, "Teste");
        assertEquals(FaixaIrpf.FAIXA04, funcionario.indentificarFaixaIrpg());
    }

    // Caso 20: Salário = 4000,00, IR = 263,87
    @Test
    public void testImpostoQuartaFaixa4000() {
        Funcionario funcionario = new Funcionario(4000.00, "Teste");
        assertEquals(263.87, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 21: Salário = 4664,68, Faixa = QUARTA
    @Test
    public void testSalarioQuartaFaixa466468() {
        Funcionario funcionario = new Funcionario(4664.68, "Teste");
        assertEquals(FaixaIrpf.FAIXA04, funcionario.indentificarFaixaIrpg());
    }

    // Caso 22: Salário = 4664,68, IR = 413,42
    @Test
    public void testImpostoQuartaFaixa466468() {
        Funcionario funcionario = new Funcionario(4664.68, "Teste");
        assertEquals(413.42, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 23: Salário = 4664,69, Faixa = QUINTA
    @Test
    public void testSalarioQuintaFaixa466469() {
        Funcionario funcionario = new Funcionario(4664.69, "Teste");
        assertEquals(FaixaIrpf.FAIXA05, funcionario.indentificarFaixaIrpg());
    }

    // Caso 24: Salário = 4664,69, IR = 413,42
    @Test
    public void testImpostoQuintaFaixa466469() {
        Funcionario funcionario = new Funcionario(4664.69, "Teste");
        assertEquals(413.42, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 25: Salário = 5000,00, Faixa = QUINTA
    @Test
    public void testSalarioQuintaFaixa5000() {
        Funcionario funcionario = new Funcionario(5000.00, "Teste");
        assertEquals(FaixaIrpf.FAIXA05, funcionario.indentificarFaixaIrpg());
    }

    // Caso 26: Salário = 5000,00, IR = 505,64
    @Test
    public void testImpostoQuintaFaixa5000() {
        Funcionario funcionario = new Funcionario(5000.00, "Teste");
        assertEquals(505.64, funcionario.calcularIrpf(), 0.01);
    }

    // Caso 27: Teste para salário negativo (erro esperado)
    @Test
    public void testSalarioNegativo() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario(-100.00, "Teste");
        });
        assertEquals("O salário deve ser maior que zero", exception.getMessage());
    }
}