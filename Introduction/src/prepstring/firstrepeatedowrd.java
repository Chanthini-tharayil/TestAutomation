package prepstring;

import java.util.HashSet;

public class firstrepeatedowrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ravi had been saying that he had been there";
		String[] k=s.split(" ");
		HashSet<String> m =new HashSet<String>();
		for(int i=0;i<k.length;i++)
		{
			if(!m.contains(k[i]))
				m.add(k[i]);
			else
			{
				System.out.println(k[i]);
				break;
			}
				
		}

	}

}
