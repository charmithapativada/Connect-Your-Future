package com.campusmentor.backend.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

/**
 * A deliberately dependency-free endpoint. Its only job today is to prove
 * the application boots and responds -- nothing here touches the database
 * or any real feature yet. Once this returns 200 OK, Day 1's "does it run"
 * check is satisfied.
 */
@RestController
public class HealthController {

    @GetMapping("/api/health")
    public Map<String, Object> health() {
        return Map.of(
                "status", "UP",
                "service", "campusmentor-backend",
                "timestamp", Instant.now().toString()
        );
    }
}
