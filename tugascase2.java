import java.util.Scanner;

public class tugascase2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Weekend, Weekday, Holiday, Malam;

        System.out.println("");
        System.out.println("Silahkan pilih kamar yang mau dipesan");
        System.out.println("1. Duku: \nweekday: 915000 \nweekend: 1025000 \nholiday: 1225000");
        System.out.println("2. Jeruk: \nweekday: 915000 \nweekend: 1025000 \nholiday: 1225000");
        System.out.println("3. Alpukat: \nweekday: 575000 \nweekend: 695000 \nholiday: 895000");
        System.out.println("4. Jambu Air: \nweekday: 575000 \nweekend: 695000 \nholiday: 895000");
        System.out.println("5. Durian: \nweekday: 595000 \nweekend: 715000 \nholiday: 915000");
        System.out.println("6. Melon: \nweekday: 595000 \nweekend: 715000 \nholiday: 915000");
        System.out.println("7. Belimbing: \nweekday: 495000 \nweekend: 575000 \nholiday: 755000");
        System.out.println("8. Mangga: \nweekday: 495000 \nweekend: 575000 \nholiday:755000");
        System.out.println("9. Kedondong: \nweekday: 495000 \nweekend: 575000 \nholiday: 755000");
        System.out.println("10. cancel");
       
        int harga = 0;
        
        int opsi = input.nextInt();
        
        if (opsi == 1) {
            System.out.println("1. Weekday");
            System.out.println("2. Weekend");
            System.out.println("3. Holiday");
            System.out.println("pilih hari");
            String pilihhari = input.nextLine();

            String hari = input.nextLine();
            
            switch(hari) {
            case "1":
            System.out.println("harga = 915000");
            harga = 915000;
            System.out.println("mau menginap berapa malam: ?");
            int malam = input.nextInt();

            System.out.println("total: " + 915000*malam);
            break;
                
            case "2":
            System.out.println("harga = 1025000");
            harga = 1025000;
            System.out.println("mau menginap berapa malam: ?");
            int berapamalam = input.nextInt();

            System.out.println("Total: " + 1025000*berapamalam);
            break;

            case "3":
            System.out.println("1225000");
            harga = 1225000;
            System.out.println("mau menginap berapa malam: ?");
            int Berapamalam = input.nextInt();

            System.out.println("Total:" + 1225000*Berapamalam);
            break;}}
                
                

            else if(opsi==2) {
                System.out.println("1. Weekday");
                System.out.println("2. Weekend");
                System.out.println("3. Holiday");
                System.out.println("pilih hari: ");
                String pilihhari = input.nextLine();

                String hari = input.nextLine();

                switch(hari) {
                    case "1":
                    System.out.println("Harga = 915000");
                    harga = 915000;
                    System.out.println("mau menginap berapa malam: ?");
                    int malam = input.nextInt();

                    System.out.println("Total: " + 915000*malam);
                    break;

                    case "2":
                    System.out.println("Harga = 1025000");
                    harga = 1025000;
                    System.out.println("mau menginap berapa malam: ?");
                    int berapamalam = input.nextInt();

                    System.out.println("Total: " + 1025000*berapamalam);
                    break;

                    case "3":
                    System.out.println("Harga: 1225000");
                    harga = 1225000;
                    System.out.println("mau menginap berapa malam: ?");
                    int berapaMalam = input.nextInt();

                    System.out.println("Total: " + 1225000*berapaMalam);
                    break;}}

                        
                    else if(opsi==3) {
                        System.out.println("1. Weekday");
                        System.out.println("2. Weekend");
                        System.out.println("3. Holiday");
                        System.out.println("pilih hari");
                        String pilihhari = input.nextLine();

                        String hari = input.nextLine();

                        switch(hari) {
                            case "1":
                            System.out.println("harga = 575000");
                            harga = 575000;
                            System.out.println("mau menginap berapa malam: ?");
                            int malam = input.nextInt();

                            System.out.println("Total: " + 575000*malam);
                            break;

                            case "2":
                            System.out.println("harga = 695000");
                            harga = 695000;
                            System.out.println("mau menginap berapa malam: ?");
                            int MalaM = input.nextInt();

                            System.out.println("Total: " + 695000*MalaM);
                            break;

                            case "3":
                            System.out.println("harga = 895000");
                            harga = 895000;
                            System.out.println("mau menginap berapa malam: ?");
                            int malaM = input.nextInt();

                            System.out.println("Total: " + 895000*malaM);
                            break;}}
                               

                            else if(opsi==4) {
                                System.out.println("1. Weekday");
                                System.out.println("2. Weekend");
                                System.out.println("3. Holiday");
                                System.out.println("pilih hari");
                                String pilihhari = input.nextLine();

                                String hari = input.nextLine();

                                switch(hari) {
                                    case "1":
                                    System.out.println("harga = 575000");
                                    harga = 575000;
                                    System.out.println("mau menginap berapa malam: ?");
                                    int malam = input.nextInt();

                                    System.out.println("Total: " + 575000*malam);
                                    break;

                                    case "2":
                                    System.out.println("harga");
                                    harga = 695000;
                                    System.out.println("mau menginap berapa malam: ?");
                                    int berapamalam = input.nextInt();
                                        
                                    System.out.println("Total: " + 695000*berapamalam);
                                    break;

                                    case "3":
                                    System.out.println("harga = 895000");
                                    harga = 895000;
                                    System.out.println("mau menginap berapa malam: ?");
                                    int Berapamalam = input.nextInt();

                                    System.out.println("Total: " + 895000*Berapamalam);
                                    break;}}

                                    else if(opsi==5) {
                                        System.out.println("1. Weekday");
                                        System.out.println("2. Weekend");
                                        System.out.println("3. Holiday");
                                        System.out.println("pilih hari");
                                        String pilihhari = input.nextLine();

                                        String hari = input.nextLine();

                                        switch(hari) {
                                        case "1":
                                        System.out.println("harga = 595000");
                                        harga = 595000;
                                        System.out.println("mau menginap berapa malam: ?");
                                        int malam = input.nextInt();

                                        System.out.println("Total: " + 595000*malam);
                                        break;

                                        case "2":
                                        System.out.println("harga = 715000");
                                        harga = 715000;
                                        System.out.println("mau menginap berapa malam: ?");
                                        int malaM = input.nextInt();

                                        System.out.println("Total: " + 715000*malaM);
                                        break;

                                        case "3":
                                        System.out.println("harga = 915000");
                                        harga = 915000;
                                        System.out.println("mau menginap berapa malam: ");
                                        int berapamalam = input.nextInt();

                                        System.out.println("Total: " + 915000*berapamalam);
                                        break;}}

                                        else if(opsi==6) {
                                            System.out.println("1. Weekday");
                                            System.out.println("2. Weekend");
                                            System.out.println("3. Holiday");
                                            System.out.println("pilih hari");
                                            String pilihhari = input.nextLine();

                                            String hari = input.nextLine();

                                            switch(hari) {
                                            case "1":
                                            System.out.println("harga = 595000");
                                            harga = 595000;
                                            System.out.println("mau menginap berapa malam: ?");
                                            int malam = input.nextInt();

                                            System.out.println("Total: " + 595000*malam);
                                            break;

                                            case "2":
                                            System.out.println("harga = 715000");
                                            harga = 715000;
                                            System.out.println("mau menginap berapa malam: ");
                                            int MalaM = input.nextInt();

                                            System.out.println("Total: " + 715000*MalaM);
                                            break;

                                            case "3":
                                            System.out.println("harga = 915000");
                                            harga = 915000;
                                            System.out.println("mau menginap berapa malam: ");
                                            int berapamalam = input.nextInt();

                                            System.out.println("Total: " + 915000*berapamalam);
                                            break;}}

                                            else if(opsi==7) {
                                                System.out.println("1. Weekday");
                                                System.out.println("2. Weekend");
                                                System.out.println("3. Holiday");
                                                System.out.println("pilih hari");
                                                String pilihhari = input.nextLine();

                                                String hari = input.nextLine();

                                                switch(hari) {
                                                case "1":
                                                System.out.println("harga = 495000");
                                                harga = 595000;
                                                System.out.println("mau menginap berapa malam: ?");
                                                int malam = input.nextInt();

                                                System.out.println("Total: " + 495000*malam);
                                                break;

                                                case "2":
                                                System.out.println("harga = 575000");
                                                harga = 715000;
                                                System.out.println("mau menginap berapa malam: ");
                                                int MalaM = input.nextInt();

                                                System.out.println("Total: " + 575000*MalaM);
                                                break;

                                                case "3":
                                                System.out.println("harga = 755000");
                                                harga = 915000;
                                                System.out.println("mau menginap berapa malam: ");
                                                int berapamalam = input.nextInt();

                                                System.out.println("Total: " + 755000*berapamalam);
                                                break;}}

                                                else if(opsi==8) {
                                                    System.out.println("1. Weekday");
                                                    System.out.println("2. Weekend");
                                                    System.out.println("3. Holiday");
                                                    System.out.println("pilih hari");
                                                    String pilihhari = input.nextLine();

                                                    String hari = input.nextLine();

                                                    switch(hari) {
                                                    case "1":
                                                    System.out.println("harga = 495000");
                                                    harga = 595000;
                                                    System.out.println("mau menginap berapa malam: ?");
                                                    int malam = input.nextInt();

                                                    System.out.println("Total: " + 495000*malam);
                                                    break;

                                                    case "2":
                                                    System.out.println("harga = 575000");
                                                    harga = 715000;
                                                    System.out.println("mau menginap berapa malam: ");
                                                    int MalaM = input.nextInt();

                                                    System.out.println("Total: " + 575000*MalaM);
                                                    break;

                                                    case "3":
                                                    System.out.println("harga = 755000");
                                                    harga = 915000;
                                                    System.out.println("mau menginap berapa malam: ");
                                                    int berapamalam = input.nextInt();

                                                    System.out.println("Total: " + 755000*berapamalam);
                                                    break;}}

                                                    else if(opsi==9) {
                                                        System.out.println("1. Weekday");
                                                        System.out.println("2. Weekend");
                                                        System.out.println("3. Holiday");
                                                        System.out.println("pilih hari");
                                                        String pilihhari = input.nextLine();

                                                        String hari = input.nextLine();

                                                        switch(hari) {
                                                        case "1":
                                                        System.out.println("harga = 495000");
                                                        harga = 595000;
                                                        System.out.println("mau menginap berapa malam: ?");
                                                        int malam = input.nextInt();

                                                        System.out.println("Total: " + 495000*malam);
                                                        break;

                                                        case "2":
                                                        System.out.println("harga = 575000");
                                                        harga = 715000;
                                                        System.out.println("mau menginap berapa malam: ");
                                                        int MalaM = input.nextInt();

                                                        System.out.println("Total: " + 575000*MalaM);
                                                        break;

                                                        case "3":
                                                        System.out.println("harga = 755000");
                                                        harga = 915000;
                                                        System.out.println("mau menginap berapa malam: ");
                                                        int berapamalam = input.nextInt();

                                                        System.out.println("Total: " + 915000*berapamalam);
                                                        break;}}
                                                    }

                                                }
                                            

                                            
                                        
                                    

                                        


                                    
                                


                            
                    

                        
                    

                
                

                
                
                        
                    

                

    
            

            
                

        
        
        

