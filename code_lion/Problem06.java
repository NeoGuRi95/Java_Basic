package code_lion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Problem06 {

    static ArrayList<Post> postArrayList = new ArrayList<>();

    static void command() {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("명령어) ");
            String command = kb.nextLine();

            if (command.equals("등록")) {
                System.out.print("제목 : ");
                String title = kb.nextLine();
                System.out.print("내용 : ");
                String contents = kb.nextLine();
                addPost(title, contents);
            } else if (command.equals("목록")){
                System.out.println("번호 / 제목");
                System.out.println("-------------------");
                printPostTitle();
            } else if (command.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    static void addPost(String title, String contents) {
        Post newPost = new Post(title, contents);
        postArrayList.add(newPost);
        System.out.println("[알림] " + postArrayList.size() + "번글이 등록되었습니다.");
    }

    static void printPostTitle() {
        for (int i = 0; i < postArrayList.size(); i++) {
            System.out.println(postArrayList.size() - i + " / " + postArrayList.get(i).getTitle());
        }
    }

    public static void main(String[] args) {
        command();
    }
}

