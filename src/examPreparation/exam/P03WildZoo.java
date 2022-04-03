package examPreparation.exam;

import java.util.*;

public class P03WildZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Animal> animalsFeed = new LinkedHashMap<>();
        Map<String, List<String>> animalsLivingArea = new LinkedHashMap<>();

        while (!command.equals("EndDay")) {
            String[] input = command.split(": ");
            String[] animalDescription = input[1].split("-");
            switch (input[0]) {
                case "Add":
                    String area = animalDescription[2];
                    String name = animalDescription[0];

                    if (animalsFeed.containsKey(name)) {
                        int additionalFood = Integer.parseInt(animalDescription[1]);
                        animalsFeed.get(name).setFood(additionalFood + animalsFeed.get(name).getFood());
                        if (animalsLivingArea.containsKey(area) && !((animalsLivingArea.get(area).contains(name)))) {
                            animalsLivingArea.get(area).add(name);
                        } else if (!animalsLivingArea.containsKey(area)) {
                            animalsLivingArea.putIfAbsent(area, animalsLivingArea.get(area));
                            animalsLivingArea.get(area).add(name);
                        }
                    } else {
                        animalsFeed.putIfAbsent(name, new Animal(Integer.parseInt(animalDescription[1]), animalDescription[2]));
                        animalsLivingArea.putIfAbsent(area, new ArrayList<>());
                        animalsLivingArea.get(animalDescription[2]).add(name);
                    }
                    break;

                case "Feed":
                    name = animalDescription[0];
                    if (animalsFeed.containsKey(name)) {
                        int eatenFood = Integer.parseInt(animalDescription[1]);
                        animalsFeed.get(name).setFood(animalsFeed.get(name).getFood() - eatenFood);
                        if (animalsFeed.get(name).getFood() <= 0) {
                            area = animalsFeed.get(name).getArea();
                            animalsFeed.remove(name);
                            if (animalsFeed.containsKey(name)) {
                                if (animalsLivingArea.get(area).contains(name)) {
                                    animalsLivingArea.get(area).remove(name);
                                    if (animalsLivingArea.get(name).size() == 0) {
                                        animalsLivingArea.remove(area);
                                    }
                                }
                            } else {
                                animalsLivingArea.get(area).remove(name);
                                if (animalsLivingArea.get(area).isEmpty()) {
                                    animalsLivingArea.remove(area);
                                }
                            }
                            System.out.printf("%s was successfully fed%n", name);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Animals:");

        for (Map.Entry<String, Animal> entry : animalsFeed.entrySet()) {
            System.out.println(" " + entry.getKey() + " -> " + entry.getValue().getFood() + "g");
        }

        System.out.println("Areas with hungry animals:");

        for (Map.Entry<String, List<String>> entry : animalsLivingArea.entrySet()) {
            System.out.println(" " + entry.getKey() + ": " + entry.getValue().size());
        }
    }

    static class Animal {
        int food;
        String area;

        public Animal(int neededFood, String area) {
            this.food = neededFood;
            this.area = area;

        }

        public int getFood() {

            return food;
        }

        public void setFood(int food) {

            this.food = food;
        }

        public String getArea() {
            return area;
        }
    }
}

