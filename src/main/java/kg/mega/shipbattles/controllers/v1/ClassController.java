package kg.mega.shipbattles.controllers.v1;

import kg.mega.shipbattles.repositories.ClassRepo;
import kg.mega.shipbattles.services.ClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ClassController {
    private final ClassRepo classRepo;

    public ClassController(ClassRepo classRepo) {
        this.classRepo = classRepo;
    }
    @GetMapping("/class_names")
    public Map<String, List<String>> getClassNamesByBattleResult(@RequestParam("battle_result") String battleResult) {
        List<String> classNames = classRepo.findClassNamesByBattleResult();
        Map<String, List<String>> response = new HashMap<>();
        response.put("class_names", classNames);
        return response;
    }
}
