import java.util.*;

public interface ContratoAnimal {
    
    public void cadastrarAnimal(Animal a);

    public void historicoAnimal(ArrayList<Animal> meusAnimais);

    public void atualizarAnimal(Animal a);

    public String toString();

    public void chamaHistorico();
    
}
