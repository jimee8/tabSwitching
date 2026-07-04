package com.example.tabswitching;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@CrossOrigin(origins = "*")
public class BubbleController {

    private final Random rand = new Random();

    @PostMapping("/api/sortBS")
    public Map<String, int[]> bubblesortNumbers(@RequestParam(defaultValue = "10") int size) {
        int[] originalBS = new int[size];
        int[] sortedBS = new int[size];

        for (int i = 0; i < originalBS.length; i++) {
            originalBS[i] = rand.nextInt(1000) + 1;
            sortedBS[i] = originalBS[i];
        }

        boolean swappedSomething = true;
        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < sortedBS.length - 1; i++) {
                if (sortedBS[i] > sortedBS[i + 1]) {
                    int temp = sortedBS[i];
                    sortedBS[i] = sortedBS[i + 1];
                    sortedBS[i + 1] = temp;
                    swappedSomething = true;
                }
            }
        }

        Map<String, int[]> response = new HashMap<>();
        response.put("originalArrayBS", originalBS);
        response.put("sortedArrayBS", sortedBS);

        return response;
    }
}
