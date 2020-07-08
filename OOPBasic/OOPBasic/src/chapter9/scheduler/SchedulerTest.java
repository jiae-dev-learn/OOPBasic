package chapter9.scheduler;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException{
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���.");
		System.out.println("R: �Ѹ� ���ʴ��");
		System.out.println("L: ��Ⱑ ���� ���� �켱");
		System.out.println("P: �켱 ������ ���� ���켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		switch (ch) {
		case 'R': 
		case 'r':
			scheduler = new RoundRobin();
			break;
		case 'L':
		case 'l':
			scheduler = new LeastJob();
			break;
		case 'P':
		case 'p':
			scheduler = new PriorityAllocation();
			break;
		default:
			System.out.println("�������� �ʴ� ����Դϴ�.");
			break;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
