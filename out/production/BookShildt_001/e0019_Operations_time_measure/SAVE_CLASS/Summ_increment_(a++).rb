0: iconst_0
1: istore_0
2: ldc2_w        #36                 // long 10000000000l
5: lstore_1
6: lconst_0
7: lstore_3
8: lload_3
9: lload_1
10: lcmp
11: ifge          24
14: iinc          0, 1
17: lload_3
18: lconst_1
19: ladd
20: lstore_3
21: goto          8
24: getstatic     #18                 // Field java/lang/System.out:Ljava/io/PrintStream;
27: iload_0
28: i2d
29: lload_1
30: l2d
31: ddiv
32: invokevirtual #38                 // Method java/io/PrintStream.println:(D)V
35: return