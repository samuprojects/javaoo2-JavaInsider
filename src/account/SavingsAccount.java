package account;

@SuppressWarnings("ALL")
public class SavingsAccount extends Account {
    private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void setBalance(double balance) { // sobrescrita de setBalance da superclasse na subclasse
        this.balance = balance * rate; // com isso ao retornar o saldo vai aplicar a taxa de rendimento da pupoança
    }

    // apesar da annotation override ser opcional como a base para a sobrescrita é o método ter a mesma assinatura
    // se mudar na superclasse o compilador vai avisar e não permitirá a execução do código
    // por exemplo se mudar de double para int na superclasse
    // se remover a annotation, enquanto o método possuir a mesma assinatura a sobrescrita ok
    // porém se mudar a assinatura da superclasse (int) e manter double na subclasse será um novo método
    // e o comportamento esperado no sistema será diferente
    // efetuado teste em aula e com valor 500 de SavingAccount o balance usou método da superclasse mantendo o número
    // ao digitar 500.0 fazendo referencia a um double aí passou a executar o método da subclasse
    // por isso é extremamente importante o uso da override
    @Override
    public void print() {
        super.print(); // o super sempre referencia o que está em um nível acima e chama o print de Account
        System.out.println("Rate: " + rate); // após mostra a linha exclusiva correspondente a poupança
        // sem alterar a aplicação principal que apenas chama o print
    }
}
