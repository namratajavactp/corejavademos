class StringBufferDemo {
   public static void main(String args[])  {

      // StringBuffer length vs. capacity.
      StringBuffer sb = new StringBuffer("Hello");
      System.out.println("buffer = " + sb);
      System.out.println("length = " + sb.length());
      System.out.println("capacity = " + sb.capacity());

      // appending and inserting into StringBuffer.
      String s;
      int a = 42;
      sb = new StringBuffer(40);
      s = sb.append("a = ").append(a).append("!").toString();
      System.out.println(s);

      sb = new StringBuffer("I Java!");
      sb.insert(2, "like ");
      System.out.println(sb);
   }
}
