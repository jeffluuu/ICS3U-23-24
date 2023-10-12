package lesson2;

import java.util.List;
import java.util.Arrays;

public class HuronWendatHeritage {
    public static void main(String[] args) {
        System.out.println("Presentation: Exploring Huron Wendat Heritage");
        System.out.println("Aspects of Huron-Wendat Culture:");
        List<String> aspects = Arrays.asList("Traditional Practices", "Art and Craftsmanship", "Language and Storytelling", "Community Traditions");
        for(int i = 0; i < aspects.size(); i++){
            System.out.println("- " + aspects.get(i));
        }
        System.out.println("Date: Wednesday, November 15, 2023");
        System.out.println("Duration: 60 minutes");
    }
}
