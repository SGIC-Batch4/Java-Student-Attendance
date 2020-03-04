import java.util.Scanner;

class AttendanceM1{
	public static void main(String args[]){
		String student[]={"Ajith","Bala","Danniel","Jana","Kumar"};
		String date[]=new String[7];
		int dateConter=0;
		char register[][]=new char[student.length][7];
		Scanner scanObj=new Scanner(System.in);
		while(true){
			System.out.println("--------------- MENU --------------------");
			System.out.println("1. Mark Register");
			System.out.println("2. Print Register");
			System.out.println("3. Exit");
			int option=scanObj.nextInt();
			
			switch(option){
				case 1:

					System.out.print("please enter the date : ");
					String dateStr=scanObj.next();
					date[dateConter]=dateStr;
					System.out.println("please enter y or n : ");
					for(int i=0;i<student.length;i++){
						System.out.print(student[i]+"\t:");
						char status=scanObj.next().charAt(0);
						register[i][dateConter]=status;
					}
					dateConter++;
				break;
				case 2:
					System.out.print("\t");
					for(int i=0;i<dateConter;i++){
					System.out.print(date[i]+"|\t");
					}
					System.out.println();
					for(int i=0;i<student.length;i++){
						System.out.print(student[i]+"\t");
						for(int j=0;j<dateConter;j++){
							System.out.print("   "+register[i][j]+"    \t");
						}
					System.out.println();
					}
			

				break;
				case 3:
					System.exit(0);
				
			}
		}

		
	}
}
