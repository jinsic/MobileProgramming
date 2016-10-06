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
			
		
		catch(ArithmeticException e){//0으로 나눌때
			System.out.println("나누는 수가 0입니다!");
		}
		
		catch(IOException i){//io 에러
			System.out.println("io 에러!");
		}
		
		catch(NumberFormatException l){//입력받은 문자열이 숫자가아닌경우
			System.out.println("문자열이 아닙니다!");
		}
		
		
		catch(Exception Ea){//입력된 숫자의 자릿수가 3자리 이상
			System.out.println("입력된 숫자가 세자리이상입니다!");
		}


	}

}
