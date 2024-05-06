public class Metodo {
    


    public double somar(int num1, int num2) {
           //LOGICA - FINALIDADE DO MÉTODO
           return ... ;
    }

    public void imprimir(String texto){
            //LOGICA - FINALIDADE DO MÉTODO
            //AQUI NÃO PRECISA DO RETURN
            //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO

    }

       
    // throws Exceptio : indica que o método ao ser utilizado poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Não é possível dividir por zer0!");
        }
        // Lógica para a divisão
        double resultado = (double) dividendo / divisor;
        return resultado;
     }   
    
   // Esse Método não pode ser visto por outras classes no projeto 
    
    public void metodoPrivado(){}

    
    // Alguns equívocos estruturais
    public void validar(){
            //Este método deveria retornar algum valor, no caso boolean (true ou false)
    }
            
    public void calcularEnviar(){
            // um método deve representar uma única resposta
    }

    public void gravarCliente(String nome, String cpf){
            // Este método tem a finalidade de gravar informações de um cliente
            // Por que não criar um objeto cliente e passar como parametro?
            // Veja abaixo:
    }


    public void gravarCliente(Cliente cliente){} 
    // ou
    public void gravar(Cliente cliente){}    
    
    
}

