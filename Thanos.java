import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));

        // TODO 3 : It's Thor birthday, now he's 1501
        for (Hero hero : heroes) {
            if (hero.getName().equals("Thor")) {
                hero.setAge(1501);
                String message = String.format("It's your birthday %s %d  %s", hero.getName(), hero.getAge(),
                        "years old");
                System.out.println(message);
                break;
            }
        }

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> heroes2 = heroes.subList(0, heroes.size() / 2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : heroes2) {
            System.out.println(hero.getName());

        }
        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        Comparator<Hero> comparator = new Comparator<Hero>() {

            @Override
            public int compare(Hero hero1, Hero hero2) {
                return hero1.getName().compareTo(hero2.getName());
            }
        };
        Collections.sort(heroes, comparator);

        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        Comparator<Hero> ageComparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero hero1, Hero hero2) {
                return hero2.getAge() - hero1.getAge();
            }
        };
        Collections.sort(heroes, ageComparator);
        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }

    }
}
