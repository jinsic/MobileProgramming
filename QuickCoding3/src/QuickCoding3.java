import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class QuickCoding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in1 = 0;
		int in2 = 0;

		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr);
			String str;
			
			str = in.readLine();			
			Integer.parseInt(str);
			in1 = Integer.parseInt(str);
			
			str = in.readLine();		
			Integer.parseInt(str);
			in2 = Integer.parseInt(str);
			
			if(in2/1000 >= 1 || in1/1000 >= 1)
			{
				throw new Exception();
			}
			
		}
			
		
		catch(ArithmeticException e){//0���� ������
			System.out.println("������ ���� 0�Դϴ�!");
		}
		
		catch(IOException i){//io ����
			System.out.println("io ����!");
		}
		
		catch(NumberFormatException l){//�Է¹��� ���ڿ��� ���ڰ��ƴѰ��
			System.out.println("���ڿ��� �ƴմϴ�!");
		}
		
		
		catch(Exception Ea){//�Էµ� ������ �ڸ����� 3�ڸ� �̻�
			System.out.println("�Էµ� ���ڰ� ���ڸ��̻��Դϴ�!");
		}


	}

}
