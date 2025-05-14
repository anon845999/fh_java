package at.fh.incrustwetrust.service;

import at.fh.incrustwetrust.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import at.fh.incrustwetrust.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setSalutation(updatedUser.getSalutation());
                    user.setSalutationDetail(updatedUser.getSalutationDetail());
                    user.setEmail(updatedUser.getEmail());
                    user.setUsername(updatedUser.getUsername());
                    user.setPassword(updatedUser.getPassword());
                    user.setCountry(updatedUser.getCountry());
                    user.setRole(updatedUser.getRole());
                    user.setProfileImagePath(updatedUser.getProfileImagePath());
                    return userRepository.save(user); // Speichern der aktualisierten Entität
                })
                .orElse(null); // Falls der Benutzer mit der ID nicht gefunden wurde, gebe null zurück
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}