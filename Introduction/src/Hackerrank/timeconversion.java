package Hackerrank;

public class timeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="07:05:45PM";
		String listTime[] = s.split(":");
        String hour = listTime[0];
        String minutes = listTime[1];
        String secounds = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);
        String m="";
        if(caser.equals("AM")){
            if(hour.equals("12"))
                   hour="00";

             m =hour+":"+minutes+":"+secounds;
        }else{
            if(!hour.equals("12")){
                int h = Integer.parseInt(hour); 
                h = h +12; 
                hour =""+h; 
            }
            m=hour+":"+minutes+":"+secounds;

   }
        System.out.println(m);

	}

}
