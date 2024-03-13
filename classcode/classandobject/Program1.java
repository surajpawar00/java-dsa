class ConsDemo{
	int x = 10;
}
// See Bytecode 
// use command javap -cConsDemo.class
// Compiled from "Program1.java"
/*class ConsDemo {
  int x;

  ConsDemo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #2                  // Field x:I
      10: return
}*/
// COnstructor is add By the Compiler
