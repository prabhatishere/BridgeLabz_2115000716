// Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. 
// For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.



public class CompareStringBufferStringBuilder {
    public static long timeOfStringBuffer(String string){
        StringBuffer sBuffer = new StringBuffer();
        long startTime = System.nanoTime();
        for(int i=0;i<1000000;i++){
            sBuffer.append(string);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static long timeOfStringBuilder(String string){
        StringBuilder sBuilder = new StringBuilder();
        long startTime = System.nanoTime();
        for(int i=0;i<1000000;i++){
            sBuilder.append(string);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static void main(String[] args) {
        String string = "Prabhat";
        long StringBufferTime = timeOfStringBuffer(string);
        long StringBuilderTime = timeOfStringBuilder(string);
        System.out.println("To append 1 million strings:");
        System.out.println("Time taken by StringBuffer:  "+StringBufferTime);
        System.out.println("Time taken by StringBuilder: "+StringBuilderTime);
    }
}
  