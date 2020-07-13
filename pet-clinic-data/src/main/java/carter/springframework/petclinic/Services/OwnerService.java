package carter.springframework.petclinic.Services;

import carter.springframework.petclinic.Model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByName(String lastName);
    Owner findById(Long id);
    Owner save();
    Set<Owner> finalAll();
}
