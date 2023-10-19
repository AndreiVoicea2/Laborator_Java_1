
public class Main {
    public static void main(String args[]) {

        //System.out.println("Hello Java");
        //System.out.println(args);

        int month_days[] = {31 , 28 , 31 , 30 , 31 , 30 ,31 , 31 , 30 , 31 ,30 ,31};
        String months[] = {"Ianuarie" , "Februarie" , "Martie" , "Aprilie" , "Mai" , "Iunie" , "Iulie" , "August" , "Septembrie" , "Octombrie" , "Noiembrie" , "Decembrie"};
        int contor = 0;
        int numar_total_zile = 0;
        char buf[] = new char[3];

        for(int i = 0; i < 12; i++) {
            //System.out.println(month_days[i] + " " + months[i] );    //cerinta1
            months[i].getChars(0, 3 , buf, 0);
            System.out.print(buf);                                     //cerinta5
            System.out.println( " " + month_days[i]);
            //System.out.println(months[i] + " " + month_days[i]);     //cerinta1
            //if(month_days[i] == 31) System.out.println(months[i]);   //cerinta2
            if(month_days[i] < 31) {
                numar_total_zile+=month_days[i];
           //     System.out.println(months[i]);
           //    contor++;
            }
        }

        //System.out.println(contor);                                  //cerinta3
        //System.out.println(numar_total_zile);                        //cerinta4



    }
}