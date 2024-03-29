import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] price={5,100,20,66,15};
        int discount=23;
        int offset=3;
        int readLength=3;
        System.out.print(Arrays.toString(decryptData(price, discount, offset, readLength)));
    }
    public static int[] decryptData(int[] price,
                                    int discount,
                                    int offset,
                                    int readLength)
    {
        if(price!=null && offset<price.length){
            int[] new_price;
            if(price.length>offset+readLength){
                new_price=new int[readLength];
            }
            else{
                new_price=new int[price.length-offset];
            }
            if(discount >= 1 && discount<=99 && offset >= 0 && readLength >= 1){
                int max=offset+readLength;
                int j=0;
                for(int i=offset;i<max;i++){
                    if(i<price.length){
                        double discount_price=price[i]-(double)price[i]*discount/100;
                        new_price[j]= (int) discount_price;
                        j+=1;
                    }

                }
                return new_price;
            }
        }
        return null;
    }
}