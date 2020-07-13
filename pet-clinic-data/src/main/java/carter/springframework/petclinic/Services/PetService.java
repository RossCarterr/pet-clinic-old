package carter.springframework.petclinic.Services;

import carter.springframework.petclinic.Model.Owner;
import carter.springframework.petclinic.Model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save();
    Set<Pet> finalAll();
}
