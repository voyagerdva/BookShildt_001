0: iconst_0
1: istore_0
2: ldc2_w        #36                 // long 10000000000l
5: lstore_1
6: lconst_0
7: lstore_3
8: lload_3
9: lload_1
10: lcmp
11: ifge          25
14: iload_0
15: iconst_1
16: iadd
17: istore_0
18: lload_3
19: lconst_1
20: ladd
21: lstore_3
22: goto          8
25: getstatic     #18                 // Field java/lang/System.out:Ljava/io/PrintStream;
28: iload_0
29: i2d
30: lload_1
31: l2d
32: ddiv
33: invokevirtual #38                 // Method java/io/PrintStream.println:(D)V
36: return