
package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task>{

	private LocalDate date;
	private String task;

	public Task(LocalDate date,String task) {
		this.date = date;
		this.task = task;
	}
	
//	public LocalDate getDate() {
//		return date;
//	}

//	public String getTask() {
//		return task;
//	}
	
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}

//	public void setTask(String task) {
//		this.task = task;
//	}
		
	// compareToメソッドをオーバーライドする
	// 日付で並び替えるため、LocalDateのcompareToを使う
	@Override
	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}

	@Override
	public String toString() {
	return this.date + ":" + this.task;
	}
}