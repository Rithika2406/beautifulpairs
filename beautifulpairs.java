class Main {
    public static void main(String[] args) {
        int A[]={1,2,3,5};
        int B[]={1,8,3,7};
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==B[i])
            count++;
        }
        System.out.println(count);
    }
}