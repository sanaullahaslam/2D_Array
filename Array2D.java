import java.util.Scanner;
class Array2D{


public static void main(String args[]){
Scanner in=new Scanner(System.in);
do{

int array[][]={{1,2,3},
               {4,5,6},
               {7,8,9}};

for(int row=0;row<array.length;row++){
System.out.print("Rows:"+row);

for(int column=0;column<array[row].length;column++){

System.out.print("[ "+array[row][column]+" ]");


}

System.out.println();
}

System.out.print("Enter row:");
int rows=in.nextInt();
System.out.print("Enter column:");
int columns=in.nextInt();
System.out.print(" [ "+array[rows][columns]+" ] \n");


}while(true);
}

}