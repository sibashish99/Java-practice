class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        int count,temp;
        int val=0;
        int i;
        for( i=0;i<n-1;i++){
            if(a[i]==0)
             continue;
            count=1;
            temp=a[i];
            a[i]=0;
            for(int j=i+1;j<n;j++){
                if(temp==a[j]){
                    a[j]=0;
                    count++;
                }
            }
            if(count==f) val++;
            
        }
        if(a[i]!=0 && f==1) val++;
        System.out.println(val);
    }
}