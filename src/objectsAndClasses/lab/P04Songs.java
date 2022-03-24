package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("_");
            Song currentSong = new Song();
            currentSong.setTypeList(input[0]);
            currentSong.setName(input[1]);
            currentSong.setTime(input[2]);
            songs.add(currentSong);
        }

        String input = scanner.nextLine();

        if (input.equals("all")) {
            for (Song song:songs){
                System.out.println(song.getName());
            }
        } else {
            for (Song song:songs) {
                if (song.getTypeList().equals(input)) {
                    System.out.println(song.getName());
                }
            }
        }
    }

    static class Song {
        String typeList;
        String name;
        String time;

        public Song() {

        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

    }
}
