package lr5;
import java.util.Random;
public class Main {
	public static void main(String argc[]){

		
		IMatrix m1 = new UsualMatrix(5,5);
        IMatrix m2 = new UsualMatrix(5,5);
        
       
		
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
            	
                m1.setElement(i,j,i+j);
                m2.setElement(i,j,i+j);
            	
            }
        }
        
        IMatrix a1 = new SparseMatrix(5,5);
        IMatrix a2 = new SparseMatrix(5,5);
        
       
		
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
            	
                a1.setElement(i,j,i+j);
                a2.setElement(i,j,i+j);
            	
            }
        }
        
        m1 = m1.sum(m2);
        a1 = a1.sum(a2);
        System.out.println(m1);
        System.out.println(a1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
      int l = 0;
		IMatrix m1 = new UsualMatrix(1000,1000);
        IMatrix m2 = new SparseMatrix(1000,1000);
        Random objGenerator = new Random();
        for(int i = 0; i < 1000; i++){
            
            	if(l < 1000) {
            		int c = objGenerator.nextInt(1000);
            		int v = objGenerator.nextInt(1000);
            		int b = objGenerator.nextInt(1000);
            		int n = objGenerator.nextInt(1000);
            		int s = objGenerator.nextInt(1000);
            		int d = objGenerator.nextInt(1000);
            		m1.setElement(c,v,b);
                    m2.setElement(n,s,d);
                l++;
                //System.out.println(c);
            	}
            
        }
        System.out.println(m1);
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /* 
        IMatrix  a1 = new SparseMatrix(1000,1000);
        IMatrix  a2 = new SparseMatrix(1000,1000);

        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
            	if(i > 999) {
                a1.setElement(i,j,i+j*3);
                a2.setElement(i,j,i+j*3);
            	}
            }
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		long time2 = System.currentTimeMillis();
        IMatrix m1 = new SparseMatrix(1000,1000);
        IMatrix m2 = new SparseMatrix(1000,1000);

        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
            	if(i > 990) {
                m1.setElement(i,j,i+j*3);
                m2.setElement(i,j,i+j*3);
            	}
            }
        }

       // m1 = m1.product(m2);
       // System.out.println(m1);
        long t = System.currentTimeMillis();
        time2 = t - time2;
        System.out.println("______TIME TO PRODUCT SPARSEMATRIXES:_______" + time2 + "\n");

        long time1 = System.currentTimeMillis();
        IMatrix  a1 = new SparseMatrix2(1000,1000);
        IMatrix  a2 = new SparseMatrix2(1000,1000);

        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
            	if(i > 990) {
                a1.setElement(i,j,i+j*3);
                a2.setElement(i,j,i+j*3);
            	}
            }
        }
        //a1 = a1.product(a2);
        //System.out.println(a1);
        long s = System.currentTimeMillis();
        time1 = s - time1;
        System.out.println("______TIME TO PRODUCT SPARSEMATRIXES2:_______" + time1 + "\n");

       /* if(a1.equals(m1))
            System.out.println(1);
        else
            System.out.println(0);

*/
       


    }
}
   
