
package practice;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Chapter5 {

		public static void main(String[] args) {
			
			List<Task> list = new LinkedList<>() {
				{
					add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
					add(new Task(LocalDate.of(2021, 9, 15), "○○社面接"));
					add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
					add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
					add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));
				}
			};

			Collections.sort(list);

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}

		}
}