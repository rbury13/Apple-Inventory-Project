
public class Apple{
    
    public static int numberOfDays( int[] days){
        
        int numberOfDays = days.length;
        return days.length;
        
    }

    public static int[] totalSale( int[] mac, int[] iphone, int[] ipad, 
    int[] ipod ){
        int[] arrayTotalSale = new int[4];
        int macTotalSale=0, iphoneTotalSale=0, ipadTotalSale=0, 
        ipodTotalSale=0;
       
        for(int a : mac){
            macTotalSale += a;
        }
        arrayTotalSale[0]= macTotalSale;
        for(int b : iphone){
            iphoneTotalSale += b;
        }
        arrayTotalSale[1]= iphoneTotalSale;
        for(int c : ipad){
            ipadTotalSale += c;
        }
        arrayTotalSale[2]= ipadTotalSale;
        for(int d : ipod){
            ipodTotalSale += d;
        }
        arrayTotalSale[3]= ipodTotalSale;
        
        return arrayTotalSale;
    }

    public static int popularProduct( int[] totalSaleValues){
        int max = 0;
        int collectionPopProduct = 0 ;
        
        for(int m = 0 ; m < totalSaleValues.length; m++ ){
                if(totalSaleValues[m] > max){
                max = totalSaleValues[m];
                collectionPopProduct = m ;
            }
        }
        return collectionPopProduct;
    }

    public static int popularDay(int days[], int[] mac, int[] iphone, int[] ipad, int[] ipod ){
        
        int max = 0;
        int collectionPopDay = 0;
        for (int p = 0 ; p < days.length; p++) {
            int dailySale = mac[p] + iphone[p] + ipad[p] + ipod[p];
            if(dailySale > max) {
                max = dailySale;
                collectionPopDay = days[p];
            }
         
        }
        return days[collectionPopDay];
    }

    public static void main(String[] arguments) {
        int[] days = {1,2,3,4,5,6,7};
        int[] mac = {11500,9000,13000,15000,16000,10000,4000};
        int[] iphone = {1100,5000,3400,100000,120000,110000,6000};
        int[] ipad = {900,4300,1000,200000,6000,8000,2000};
        int[] ipod = {0,300,120,500, 700,800,100};
        System.out.println("Number of Days: "+ numberOfDays(days));
        int[]totalSales = totalSale(mac,iphone,ipad,ipod);
        String[] nameList = {"Mac total sales:" , "Iphone total sales:" 
            , "Ipad total sales:" , "Ipod total sales:"};
        String [] popProduct = { "Mac" , "Iphone" , "Ipad" , "Ipod" };
        for(int n=0; n<totalSales.length; n++){
            System.out.println(nameList[n] + " " + totalSales[n]);
        }
        int popProductIndex = popularProduct(totalSales);
        System.out.println("Popular Product: " + popProduct[popProductIndex]);
        System.out.println("Popular Day: " + popularDay(days,mac,iphone,ipad,ipod));
    }
}
