package carter.springframework.petclinic.Services;



import carter.springframework.petclinic.Model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save();
    Set<Vet> finalAll();
}
