package org.day13;

public class Day13Input {

    public static final String content = """
            Button A: X+27, Y+65
            Button B: X+58, Y+17
            Prize: X=2211, Y=4587
            
            Button A: X+87, Y+22
            Button B: X+25, Y+77
            Prize: X=7656, Y=8085
            
            Button A: X+99, Y+92
            Button B: X+15, Y+64
            Prize: X=9099, Y=8756
            
            Button A: X+50, Y+26
            Button B: X+34, Y+59
            Prize: X=11084, Y=7900
            
            Button A: X+24, Y+87
            Button B: X+90, Y+57
            Prize: X=6354, Y=5532
            
            Button A: X+14, Y+64
            Button B: X+78, Y+26
            Prize: X=16652, Y=3842
            
            Button A: X+69, Y+16
            Button B: X+24, Y+72
            Prize: X=16322, Y=12832
            
            Button A: X+20, Y+47
            Button B: X+64, Y+31
            Prize: X=12000, Y=9474
            
            Button A: X+50, Y+11
            Button B: X+25, Y+48
            Prize: X=5775, Y=6808
            
            Button A: X+99, Y+94
            Button B: X+58, Y+12
            Prize: X=12605, Y=9298
            
            Button A: X+63, Y+71
            Button B: X+82, Y+17
            Prize: X=3940, Y=2555
            
            Button A: X+27, Y+23
            Button B: X+18, Y+86
            Prize: X=1665, Y=4669
            
            Button A: X+85, Y+22
            Button B: X+28, Y+96
            Prize: X=2909, Y=3238
            
            Button A: X+41, Y+14
            Button B: X+18, Y+68
            Prize: X=4228, Y=12416
            
            Button A: X+12, Y+35
            Button B: X+66, Y+12
            Prize: X=12434, Y=2314
            
            Button A: X+37, Y+12
            Button B: X+15, Y+28
            Prize: X=2161, Y=1580
            
            Button A: X+11, Y+59
            Button B: X+83, Y+22
            Prize: X=18275, Y=2635
            
            Button A: X+29, Y+59
            Button B: X+68, Y+37
            Prize: X=8698, Y=8632
            
            Button A: X+96, Y+13
            Button B: X+58, Y+61
            Prize: X=9524, Y=3947
            
            Button A: X+38, Y+97
            Button B: X+80, Y+28
            Prize: X=3102, Y=6861
            
            Button A: X+54, Y+26
            Button B: X+42, Y+89
            Prize: X=6330, Y=7931
            
            Button A: X+12, Y+35
            Button B: X+58, Y+14
            Prize: X=10190, Y=10931
            
            Button A: X+76, Y+28
            Button B: X+23, Y+70
            Prize: X=19054, Y=7956
            
            Button A: X+23, Y+50
            Button B: X+46, Y+14
            Prize: X=353, Y=13712
            
            Button A: X+97, Y+22
            Button B: X+49, Y+91
            Prize: X=7826, Y=4571
            
            Button A: X+27, Y+57
            Button B: X+42, Y+18
            Prize: X=5241, Y=5835
            
            Button A: X+66, Y+20
            Button B: X+21, Y+51
            Prize: X=9767, Y=18953
            
            Button A: X+73, Y+39
            Button B: X+17, Y+55
            Prize: X=9040, Y=13328
            
            Button A: X+95, Y+34
            Button B: X+15, Y+18
            Prize: X=9150, Y=4500
            
            Button A: X+29, Y+53
            Button B: X+71, Y+14
            Prize: X=5737, Y=2266
            
            Button A: X+12, Y+44
            Button B: X+63, Y+13
            Prize: X=7307, Y=18161
            
            Button A: X+46, Y+15
            Button B: X+19, Y+33
            Prize: X=6646, Y=8327
            
            Button A: X+62, Y+26
            Button B: X+26, Y+56
            Prize: X=3774, Y=14802
            
            Button A: X+17, Y+63
            Button B: X+49, Y+42
            Prize: X=3801, Y=5292
            
            Button A: X+14, Y+64
            Button B: X+83, Y+26
            Prize: X=1869, Y=6070
            
            Button A: X+22, Y+69
            Button B: X+42, Y+11
            Prize: X=10104, Y=12772
            
            Button A: X+31, Y+47
            Button B: X+43, Y+16
            Prize: X=8826, Y=8112
            
            Button A: X+31, Y+58
            Button B: X+41, Y+13
            Prize: X=17723, Y=4139
            
            Button A: X+85, Y+14
            Button B: X+18, Y+28
            Prize: X=3152, Y=1120
            
            Button A: X+23, Y+45
            Button B: X+61, Y+25
            Prize: X=11409, Y=15365
            
            Button A: X+70, Y+33
            Button B: X+11, Y+46
            Prize: X=11210, Y=10845
            
            Button A: X+57, Y+38
            Button B: X+11, Y+36
            Prize: X=19514, Y=11248
            
            Button A: X+45, Y+14
            Button B: X+45, Y+82
            Prize: X=1925, Y=2062
            
            Button A: X+22, Y+49
            Button B: X+61, Y+29
            Prize: X=19547, Y=2416
            
            Button A: X+77, Y+44
            Button B: X+25, Y+80
            Prize: X=2360, Y=6540
            
            Button A: X+18, Y+87
            Button B: X+75, Y+19
            Prize: X=5721, Y=3263
            
            Button A: X+52, Y+28
            Button B: X+12, Y+41
            Prize: X=16460, Y=7575
            
            Button A: X+57, Y+20
            Button B: X+12, Y+63
            Prize: X=13184, Y=2170
            
            Button A: X+61, Y+17
            Button B: X+49, Y+63
            Prize: X=4704, Y=3038
            
            Button A: X+49, Y+11
            Button B: X+73, Y+89
            Prize: X=10054, Y=8066
            
            Button A: X+85, Y+86
            Button B: X+17, Y+74
            Prize: X=3961, Y=5314
            
            Button A: X+25, Y+48
            Button B: X+69, Y+41
            Prize: X=1850, Y=15717
            
            Button A: X+16, Y+68
            Button B: X+76, Y+12
            Prize: X=3608, Y=5084
            
            Button A: X+60, Y+80
            Button B: X+28, Y+11
            Prize: X=18676, Y=12367
            
            Button A: X+87, Y+18
            Button B: X+38, Y+54
            Prize: X=8670, Y=3870
            
            Button A: X+81, Y+12
            Button B: X+71, Y+85
            Prize: X=10212, Y=5088
            
            Button A: X+17, Y+27
            Button B: X+45, Y+19
            Prize: X=6991, Y=577
            
            Button A: X+52, Y+31
            Button B: X+14, Y+90
            Prize: X=5328, Y=9382
            
            Button A: X+40, Y+30
            Button B: X+32, Y+76
            Prize: X=4976, Y=5708
            
            Button A: X+29, Y+57
            Button B: X+80, Y+35
            Prize: X=2809, Y=3932
            
            Button A: X+38, Y+11
            Button B: X+25, Y+68
            Prize: X=18956, Y=1433
            
            Button A: X+26, Y+46
            Button B: X+47, Y+27
            Prize: X=13190, Y=9290
            
            Button A: X+97, Y+22
            Button B: X+60, Y+86
            Prize: X=7042, Y=4710
            
            Button A: X+55, Y+88
            Button B: X+95, Y+43
            Prize: X=9760, Y=8204
            
            Button A: X+16, Y+63
            Button B: X+64, Y+21
            Prize: X=18400, Y=18281
            
            Button A: X+40, Y+35
            Button B: X+25, Y+77
            Prize: X=2580, Y=4683
            
            Button A: X+71, Y+74
            Button B: X+82, Y+12
            Prize: X=8649, Y=5782
            
            Button A: X+77, Y+14
            Button B: X+27, Y+94
            Prize: X=4708, Y=6736
            
            Button A: X+66, Y+42
            Button B: X+20, Y+92
            Prize: X=7206, Y=11958
            
            Button A: X+24, Y+75
            Button B: X+55, Y+14
            Prize: X=3433, Y=5834
            
            Button A: X+34, Y+73
            Button B: X+88, Y+23
            Prize: X=6872, Y=5130
            
            Button A: X+23, Y+63
            Button B: X+37, Y+13
            Prize: X=4745, Y=10593
            
            Button A: X+40, Y+59
            Button B: X+73, Y+33
            Prize: X=10217, Y=8424
            
            Button A: X+14, Y+51
            Button B: X+47, Y+16
            Prize: X=12481, Y=8354
            
            Button A: X+48, Y+99
            Button B: X+95, Y+20
            Prize: X=4597, Y=7546
            
            Button A: X+13, Y+41
            Button B: X+29, Y+12
            Prize: X=263, Y=1388
            
            Button A: X+19, Y+50
            Button B: X+41, Y+24
            Prize: X=11548, Y=7664
            
            Button A: X+97, Y+43
            Button B: X+27, Y+73
            Prize: X=7998, Y=4522
            
            Button A: X+21, Y+43
            Button B: X+62, Y+12
            Prize: X=4390, Y=4276
            
            Button A: X+14, Y+44
            Button B: X+77, Y+48
            Prize: X=18113, Y=19392
            
            Button A: X+14, Y+43
            Button B: X+33, Y+18
            Prize: X=1207, Y=18546
            
            Button A: X+11, Y+39
            Button B: X+50, Y+25
            Prize: X=9397, Y=14203
            
            Button A: X+35, Y+60
            Button B: X+92, Y+27
            Prize: X=8135, Y=2835
            
            Button A: X+15, Y+47
            Button B: X+33, Y+17
            Prize: X=3491, Y=11363
            
            Button A: X+20, Y+78
            Button B: X+68, Y+31
            Prize: X=2560, Y=6471
            
            Button A: X+36, Y+16
            Button B: X+46, Y+79
            Prize: X=4098, Y=6213
            
            Button A: X+22, Y+73
            Button B: X+93, Y+13
            Prize: X=3155, Y=6035
            
            Button A: X+91, Y+80
            Button B: X+14, Y+87
            Prize: X=7973, Y=11192
            
            Button A: X+45, Y+17
            Button B: X+25, Y+71
            Prize: X=9440, Y=16002
            
            Button A: X+71, Y+21
            Button B: X+22, Y+68
            Prize: X=4637, Y=4017
            
            Button A: X+97, Y+29
            Button B: X+48, Y+97
            Prize: X=10461, Y=5607
            
            Button A: X+66, Y+25
            Button B: X+11, Y+31
            Prize: X=16809, Y=9722
            
            Button A: X+12, Y+30
            Button B: X+57, Y+28
            Prize: X=8939, Y=1420
            
            Button A: X+44, Y+12
            Button B: X+47, Y+74
            Prize: X=9821, Y=17594
            
            Button A: X+46, Y+31
            Button B: X+16, Y+34
            Prize: X=18700, Y=18424
            
            Button A: X+66, Y+86
            Button B: X+81, Y+30
            Prize: X=10791, Y=9906
            
            Button A: X+13, Y+65
            Button B: X+77, Y+76
            Prize: X=2910, Y=5898
            
            Button A: X+55, Y+20
            Button B: X+29, Y+68
            Prize: X=10013, Y=18356
            
            Button A: X+26, Y+13
            Button B: X+44, Y+68
            Prize: X=18626, Y=3889
            
            Button A: X+13, Y+74
            Button B: X+97, Y+18
            Prize: X=3977, Y=7682
            
            Button A: X+34, Y+11
            Button B: X+13, Y+67
            Prize: X=4243, Y=3537
            
            Button A: X+21, Y+67
            Button B: X+74, Y+21
            Prize: X=17831, Y=14155
            
            Button A: X+84, Y+13
            Button B: X+48, Y+45
            Prize: X=3924, Y=1246
            
            Button A: X+17, Y+42
            Button B: X+49, Y+21
            Prize: X=11445, Y=18029
            
            Button A: X+49, Y+74
            Button B: X+88, Y+22
            Prize: X=3289, Y=2860
            
            Button A: X+49, Y+13
            Button B: X+30, Y+66
            Prize: X=17781, Y=16557
            
            Button A: X+79, Y+86
            Button B: X+99, Y+13
            Prize: X=12460, Y=6930
            
            Button A: X+30, Y+67
            Button B: X+32, Y+14
            Prize: X=13872, Y=10152
            
            Button A: X+21, Y+47
            Button B: X+73, Y+31
            Prize: X=6722, Y=4454
            
            Button A: X+46, Y+65
            Button B: X+63, Y+20
            Prize: X=3443, Y=4520
            
            Button A: X+61, Y+11
            Button B: X+18, Y+79
            Prize: X=6665, Y=1404
            
            Button A: X+63, Y+11
            Button B: X+19, Y+78
            Prize: X=13512, Y=14869
            
            Button A: X+32, Y+67
            Button B: X+34, Y+15
            Prize: X=9010, Y=663
            
            Button A: X+24, Y+47
            Button B: X+46, Y+22
            Prize: X=17534, Y=15547
            
            Button A: X+19, Y+12
            Button B: X+11, Y+32
            Prize: X=354, Y=1516
            
            Button A: X+66, Y+26
            Button B: X+14, Y+94
            Prize: X=2244, Y=6724
            
            Button A: X+27, Y+99
            Button B: X+91, Y+24
            Prize: X=3358, Y=3642
            
            Button A: X+69, Y+53
            Button B: X+12, Y+78
            Prize: X=4548, Y=4250
            
            Button A: X+23, Y+26
            Button B: X+82, Y+24
            Prize: X=9646, Y=4172
            
            Button A: X+74, Y+41
            Button B: X+15, Y+39
            Prize: X=11784, Y=18519
            
            Button A: X+81, Y+14
            Button B: X+68, Y+95
            Prize: X=7383, Y=3274
            
            Button A: X+29, Y+58
            Button B: X+41, Y+11
            Prize: X=2365, Y=4058
            
            Button A: X+35, Y+22
            Button B: X+30, Y+60
            Prize: X=2025, Y=3618
            
            Button A: X+56, Y+14
            Button B: X+13, Y+76
            Prize: X=19427, Y=8192
            
            Button A: X+18, Y+38
            Button B: X+31, Y+11
            Prize: X=4677, Y=3017
            
            Button A: X+76, Y+25
            Button B: X+30, Y+43
            Prize: X=798, Y=892
            
            Button A: X+30, Y+53
            Button B: X+35, Y+12
            Prize: X=14085, Y=17167
            
            Button A: X+55, Y+65
            Button B: X+74, Y+25
            Prize: X=4732, Y=1970
            
            Button A: X+13, Y+87
            Button B: X+91, Y+24
            Prize: X=8138, Y=2982
            
            Button A: X+86, Y+63
            Button B: X+32, Y+93
            Prize: X=4654, Y=3618
            
            Button A: X+79, Y+34
            Button B: X+19, Y+73
            Prize: X=3384, Y=5994
            
            Button A: X+13, Y+60
            Button B: X+56, Y+22
            Prize: X=15079, Y=15910
            
            Button A: X+29, Y+91
            Button B: X+58, Y+16
            Prize: X=4031, Y=8167
            
            Button A: X+30, Y+58
            Button B: X+46, Y+25
            Prize: X=11614, Y=4607
            
            Button A: X+25, Y+40
            Button B: X+36, Y+12
            Prize: X=15112, Y=4864
            
            Button A: X+74, Y+70
            Button B: X+11, Y+62
            Prize: X=2977, Y=3590
            
            Button A: X+75, Y+73
            Button B: X+15, Y+90
            Prize: X=7170, Y=9844
            
            Button A: X+11, Y+45
            Button B: X+34, Y+16
            Prize: X=6530, Y=598
            
            Button A: X+84, Y+21
            Button B: X+57, Y+87
            Prize: X=9606, Y=6621
            
            Button A: X+97, Y+65
            Button B: X+22, Y+54
            Prize: X=2949, Y=2565
            
            Button A: X+34, Y+11
            Button B: X+36, Y+51
            Prize: X=5464, Y=4916
            
            Button A: X+53, Y+13
            Button B: X+30, Y+65
            Prize: X=12915, Y=7010
            
            Button A: X+55, Y+14
            Button B: X+13, Y+62
            Prize: X=13741, Y=18810
            
            Button A: X+73, Y+47
            Button B: X+12, Y+32
            Prize: X=7667, Y=6381
            
            Button A: X+79, Y+38
            Button B: X+15, Y+47
            Prize: X=1663, Y=17231
            
            Button A: X+16, Y+45
            Button B: X+82, Y+53
            Prize: X=9494, Y=11698
            
            Button A: X+26, Y+53
            Button B: X+21, Y+11
            Prize: X=2743, Y=2697
            
            Button A: X+76, Y+82
            Button B: X+62, Y+16
            Prize: X=6114, Y=4510
            
            Button A: X+52, Y+56
            Button B: X+17, Y+84
            Prize: X=939, Y=3836
            
            Button A: X+65, Y+15
            Button B: X+14, Y+36
            Prize: X=6941, Y=10169
            
            Button A: X+44, Y+84
            Button B: X+80, Y+12
            Prize: X=3120, Y=2016
            
            Button A: X+19, Y+48
            Button B: X+62, Y+21
            Prize: X=18113, Y=18134
            
            Button A: X+43, Y+17
            Button B: X+11, Y+35
            Prize: X=6850, Y=19080
            
            Button A: X+42, Y+13
            Button B: X+23, Y+60
            Prize: X=7937, Y=11818
            
            Button A: X+11, Y+29
            Button B: X+78, Y+62
            Prize: X=2096, Y=5944
            
            Button A: X+99, Y+78
            Button B: X+19, Y+58
            Prize: X=986, Y=992
            
            Button A: X+63, Y+89
            Button B: X+50, Y+14
            Prize: X=8427, Y=7997
            
            Button A: X+75, Y+21
            Button B: X+19, Y+65
            Prize: X=7070, Y=1658
            
            Button A: X+77, Y+16
            Button B: X+80, Y+77
            Prize: X=10226, Y=6472
            
            Button A: X+42, Y+26
            Button B: X+14, Y+37
            Prize: X=14396, Y=10963
            
            Button A: X+61, Y+38
            Button B: X+20, Y+44
            Prize: X=18781, Y=4678
            
            Button A: X+41, Y+23
            Button B: X+19, Y+36
            Prize: X=16818, Y=7290
            
            Button A: X+14, Y+75
            Button B: X+21, Y+13
            Prize: X=1673, Y=7072
            
            Button A: X+12, Y+28
            Button B: X+76, Y+19
            Prize: X=8220, Y=4455
            
            Button A: X+56, Y+13
            Button B: X+24, Y+76
            Prize: X=5416, Y=8768
            
            Button A: X+13, Y+54
            Button B: X+33, Y+13
            Prize: X=12445, Y=11874
            
            Button A: X+26, Y+82
            Button B: X+65, Y+57
            Prize: X=4641, Y=9161
            
            Button A: X+25, Y+58
            Button B: X+65, Y+23
            Prize: X=9410, Y=11930
            
            Button A: X+77, Y+93
            Button B: X+71, Y+20
            Prize: X=2645, Y=959
            
            Button A: X+29, Y+26
            Button B: X+89, Y+17
            Prize: X=3223, Y=943
            
            Button A: X+58, Y+18
            Button B: X+27, Y+65
            Prize: X=3127, Y=1933
            
            Button A: X+67, Y+48
            Button B: X+12, Y+36
            Prize: X=13551, Y=776
            
            Button A: X+26, Y+45
            Button B: X+56, Y+26
            Prize: X=15224, Y=2714
            
            Button A: X+42, Y+12
            Button B: X+14, Y+35
            Prize: X=9132, Y=6708
            
            Button A: X+68, Y+27
            Button B: X+23, Y+67
            Prize: X=3977, Y=7308
            
            Button A: X+18, Y+47
            Button B: X+52, Y+21
            Prize: X=9882, Y=13544
            
            Button A: X+16, Y+70
            Button B: X+58, Y+13
            Prize: X=13098, Y=6951
            
            Button A: X+49, Y+24
            Button B: X+18, Y+45
            Prize: X=19509, Y=13154
            
            Button A: X+53, Y+59
            Button B: X+86, Y+18
            Prize: X=7733, Y=5499
            
            Button A: X+81, Y+17
            Button B: X+27, Y+90
            Prize: X=1593, Y=4045
            
            Button A: X+69, Y+22
            Button B: X+22, Y+64
            Prize: X=2925, Y=1962
            
            Button A: X+25, Y+57
            Button B: X+92, Y+49
            Prize: X=3909, Y=4572
            
            Button A: X+52, Y+98
            Button B: X+78, Y+47
            Prize: X=8554, Y=6821
            
            Button A: X+11, Y+83
            Button B: X+63, Y+30
            Prize: X=3466, Y=3439
            
            Button A: X+16, Y+64
            Button B: X+58, Y+19
            Prize: X=18736, Y=4768
            
            Button A: X+93, Y+11
            Button B: X+69, Y+58
            Prize: X=14382, Y=5439
            
            Button A: X+57, Y+14
            Button B: X+15, Y+37
            Prize: X=269, Y=12944
            
            Button A: X+21, Y+29
            Button B: X+88, Y+34
            Prize: X=8709, Y=3887
            
            Button A: X+15, Y+41
            Button B: X+42, Y+22
            Prize: X=5837, Y=7547
            
            Button A: X+36, Y+70
            Button B: X+60, Y+24
            Prize: X=13640, Y=7416
            
            Button A: X+38, Y+90
            Button B: X+75, Y+16
            Prize: X=10317, Y=9080
            
            Button A: X+36, Y+53
            Button B: X+24, Y+11
            Prize: X=8924, Y=5732
            
            Button A: X+82, Y+11
            Button B: X+15, Y+82
            Prize: X=10504, Y=6178
            
            Button A: X+30, Y+73
            Button B: X+43, Y+14
            Prize: X=7059, Y=14604
            
            Button A: X+16, Y+92
            Button B: X+73, Y+58
            Prize: X=6760, Y=12824
            
            Button A: X+86, Y+31
            Button B: X+52, Y+98
            Prize: X=2618, Y=1657
            
            Button A: X+49, Y+13
            Button B: X+18, Y+45
            Prize: X=14508, Y=1215
            
            Button A: X+94, Y+34
            Button B: X+37, Y+83
            Prize: X=10087, Y=9009
            
            Button A: X+24, Y+58
            Button B: X+69, Y+38
            Prize: X=9839, Y=18698
            
            Button A: X+51, Y+18
            Button B: X+16, Y+29
            Prize: X=19247, Y=17528
            
            Button A: X+71, Y+42
            Button B: X+26, Y+51
            Prize: X=7232, Y=7377
            
            Button A: X+78, Y+69
            Button B: X+84, Y+13
            Prize: X=9156, Y=2214
            
            Button A: X+28, Y+11
            Button B: X+18, Y+44
            Prize: X=10000, Y=19768
            
            Button A: X+63, Y+17
            Button B: X+39, Y+64
            Prize: X=5511, Y=2824
            
            Button A: X+86, Y+30
            Button B: X+34, Y+79
            Prize: X=4208, Y=5362
            
            Button A: X+14, Y+87
            Button B: X+78, Y+73
            Prize: X=2820, Y=6408
            
            Button A: X+53, Y+26
            Button B: X+12, Y+25
            Prize: X=18982, Y=4199
            
            Button A: X+50, Y+20
            Button B: X+32, Y+66
            Prize: X=16348, Y=17274
            
            Button A: X+16, Y+53
            Button B: X+51, Y+17
            Prize: X=5062, Y=12215
            
            Button A: X+77, Y+45
            Button B: X+12, Y+48
            Prize: X=3828, Y=3908
            
            Button A: X+78, Y+19
            Button B: X+17, Y+76
            Prize: X=15074, Y=1032
            
            Button A: X+24, Y+61
            Button B: X+56, Y+18
            Prize: X=1528, Y=490
            
            Button A: X+46, Y+47
            Button B: X+14, Y+84
            Prize: X=3018, Y=9635
            
            Button A: X+84, Y+44
            Button B: X+34, Y+77
            Prize: X=7864, Y=6842
            
            Button A: X+56, Y+41
            Button B: X+16, Y+67
            Prize: X=5240, Y=8204
            
            Button A: X+11, Y+42
            Button B: X+49, Y+12
            Prize: X=19454, Y=782
            
            Button A: X+20, Y+60
            Button B: X+35, Y+16
            Prize: X=9760, Y=18208
            
            Button A: X+68, Y+15
            Button B: X+61, Y+60
            Prize: X=7245, Y=4065
            
            Button A: X+89, Y+22
            Button B: X+15, Y+88
            Prize: X=7530, Y=6666
            
            Button A: X+42, Y+17
            Button B: X+30, Y+47
            Prize: X=5618, Y=13205
            
            Button A: X+22, Y+57
            Button B: X+78, Y+13
            Prize: X=6576, Y=4936
            
            Button A: X+11, Y+48
            Button B: X+74, Y+59
            Prize: X=5060, Y=7565
            
            Button A: X+97, Y+11
            Button B: X+58, Y+66
            Prize: X=9112, Y=2816
            
            Button A: X+80, Y+25
            Button B: X+15, Y+61
            Prize: X=3950, Y=18621
            
            Button A: X+49, Y+33
            Button B: X+19, Y+39
            Prize: X=14357, Y=1721
            
            Button A: X+20, Y+51
            Button B: X+58, Y+35
            Prize: X=13354, Y=9640
            
            Button A: X+39, Y+37
            Button B: X+24, Y+98
            Prize: X=2613, Y=3457
            
            Button A: X+36, Y+50
            Button B: X+89, Y+35
            Prize: X=7991, Y=6225
            
            Button A: X+32, Y+97
            Button B: X+94, Y+81
            Prize: X=7664, Y=8548
            
            Button A: X+49, Y+11
            Button B: X+23, Y+82
            Prize: X=262, Y=9138
            
            Button A: X+47, Y+15
            Button B: X+22, Y+43
            Prize: X=8222, Y=10349
            
            Button A: X+96, Y+89
            Button B: X+12, Y+54
            Prize: X=7572, Y=7663
            
            Button A: X+62, Y+30
            Button B: X+32, Y+62
            Prize: X=1100, Y=10678
            
            Button A: X+29, Y+70
            Button B: X+97, Y+14
            Prize: X=8685, Y=5334
            
            Button A: X+64, Y+36
            Button B: X+12, Y+30
            Prize: X=7672, Y=17876
            
            Button A: X+64, Y+95
            Button B: X+56, Y+16
            Prize: X=9656, Y=7822
            
            Button A: X+41, Y+66
            Button B: X+47, Y+18
            Prize: X=19713, Y=3014
            
            Button A: X+77, Y+20
            Button B: X+12, Y+45
            Prize: X=10253, Y=10055
            
            Button A: X+20, Y+52
            Button B: X+71, Y+28
            Prize: X=3183, Y=17812
            
            Button A: X+38, Y+12
            Button B: X+11, Y+16
            Prize: X=14518, Y=17124
            
            Button A: X+71, Y+20
            Button B: X+76, Y+95
            Prize: X=9726, Y=8995
            
            Button A: X+82, Y+20
            Button B: X+31, Y+96
            Prize: X=7453, Y=2260
            
            Button A: X+85, Y+59
            Button B: X+29, Y+83
            Prize: X=7467, Y=6629
            
            Button A: X+17, Y+30
            Button B: X+35, Y+20
            Prize: X=11302, Y=14110
            
            Button A: X+39, Y+81
            Button B: X+54, Y+20
            Prize: X=3093, Y=2277
            
            Button A: X+76, Y+14
            Button B: X+45, Y+71
            Prize: X=3328, Y=3874
            
            Button A: X+19, Y+91
            Button B: X+68, Y+60
            Prize: X=4259, Y=4723
            
            Button A: X+15, Y+53
            Button B: X+78, Y+33
            Prize: X=6851, Y=8685
            
            Button A: X+20, Y+59
            Button B: X+36, Y+12
            Prize: X=1208, Y=18047
            
            Button A: X+52, Y+17
            Button B: X+31, Y+70
            Prize: X=758, Y=17044
            
            Button A: X+13, Y+26
            Button B: X+62, Y+26
            Prize: X=7073, Y=380
            
            Button A: X+33, Y+23
            Button B: X+11, Y+28
            Prize: X=13454, Y=7460
            
            Button A: X+51, Y+40
            Button B: X+20, Y+57
            Prize: X=4943, Y=6397
            
            Button A: X+90, Y+21
            Button B: X+18, Y+68
            Prize: X=4680, Y=1730
            
            Button A: X+55, Y+50
            Button B: X+19, Y+84
            Prize: X=2015, Y=7170
            
            Button A: X+19, Y+55
            Button B: X+69, Y+17
            Prize: X=19115, Y=15807
            
            Button A: X+42, Y+81
            Button B: X+49, Y+18
            Prize: X=7336, Y=6957
            
            Button A: X+37, Y+77
            Button B: X+82, Y+25
            Prize: X=3724, Y=7313
            
            Button A: X+41, Y+18
            Button B: X+42, Y+67
            Prize: X=18780, Y=12045
            
            Button A: X+13, Y+36
            Button B: X+70, Y+42
            Prize: X=15942, Y=5696
            
            Button A: X+45, Y+67
            Button B: X+33, Y+12
            Prize: X=14717, Y=15673
            
            Button A: X+31, Y+57
            Button B: X+68, Y+29
            Prize: X=8718, Y=7483
            
            Button A: X+16, Y+72
            Button B: X+50, Y+36
            Prize: X=4454, Y=5868
            
            Button A: X+97, Y+19
            Button B: X+58, Y+55
            Prize: X=7379, Y=4151
            
            Button A: X+53, Y+38
            Button B: X+19, Y+96
            Prize: X=4772, Y=10094
            
            Button A: X+54, Y+16
            Button B: X+12, Y+27
            Prize: X=13058, Y=7571
            
            Button A: X+18, Y+59
            Button B: X+73, Y+50
            Prize: X=5266, Y=5147
            
            Button A: X+73, Y+19
            Button B: X+18, Y+62
            Prize: X=1721, Y=3371
            
            Button A: X+13, Y+62
            Button B: X+75, Y+12
            Prize: X=16285, Y=10524
            
            Button A: X+44, Y+14
            Button B: X+25, Y+55
            Prize: X=10918, Y=12418
            
            Button A: X+54, Y+38
            Button B: X+17, Y+47
            Prize: X=2549, Y=2039
            
            Button A: X+47, Y+16
            Button B: X+70, Y+90
            Prize: X=4111, Y=1598
            
            Button A: X+40, Y+38
            Button B: X+93, Y+22
            Prize: X=10108, Y=4560
            
            Button A: X+70, Y+15
            Button B: X+16, Y+48
            Prize: X=730, Y=825
            
            Button A: X+43, Y+80
            Button B: X+53, Y+31
            Prize: X=3837, Y=4164
            
            Button A: X+49, Y+68
            Button B: X+36, Y+12
            Prize: X=1627, Y=11004
            
            Button A: X+70, Y+26
            Button B: X+15, Y+63
            Prize: X=5645, Y=1901
            
            Button A: X+76, Y+58
            Button B: X+27, Y+99
            Prize: X=6694, Y=7774
            
            Button A: X+20, Y+72
            Button B: X+66, Y+21
            Prize: X=17662, Y=10379
            
            Button A: X+41, Y+69
            Button B: X+50, Y+24
            Prize: X=17575, Y=4523
            
            Button A: X+70, Y+21
            Button B: X+56, Y+63
            Prize: X=9030, Y=6405
            
            Button A: X+96, Y+82
            Button B: X+26, Y+79
            Prize: X=6758, Y=7533
            
            Button A: X+72, Y+49
            Button B: X+16, Y+35
            Prize: X=17192, Y=14963
            
            Button A: X+18, Y+60
            Button B: X+75, Y+18
            Prize: X=6144, Y=6096
            
            Button A: X+77, Y+40
            Button B: X+12, Y+45
            Prize: X=7417, Y=13410
            
            Button A: X+31, Y+13
            Button B: X+26, Y+59
            Prize: X=19602, Y=4158
            
            Button A: X+72, Y+11
            Button B: X+92, Y+90
            Prize: X=7488, Y=3878
            
            Button A: X+51, Y+96
            Button B: X+66, Y+25
            Prize: X=3675, Y=2849
            
            Button A: X+29, Y+70
            Button B: X+47, Y+14
            Prize: X=12636, Y=15796
            
            Button A: X+13, Y+34
            Button B: X+91, Y+11
            Prize: X=8164, Y=1376
            
            Button A: X+35, Y+67
            Button B: X+56, Y+17
            Prize: X=10805, Y=4589
            
            Button A: X+39, Y+16
            Button B: X+19, Y+28
            Prize: X=6368, Y=16416
            
            Button A: X+24, Y+64
            Button B: X+79, Y+46
            Prize: X=5664, Y=7200
            
            Button A: X+62, Y+25
            Button B: X+16, Y+38
            Prize: X=4952, Y=2470
            
            Button A: X+51, Y+31
            Button B: X+37, Y+71
            Prize: X=1394, Y=1672
            
            Button A: X+13, Y+63
            Button B: X+37, Y+12
            Prize: X=1966, Y=3716
            
            Button A: X+17, Y+77
            Button B: X+62, Y+13
            Prize: X=12283, Y=15031
            
            Button A: X+17, Y+50
            Button B: X+39, Y+21
            Prize: X=4196, Y=15923
            
            Button A: X+58, Y+30
            Button B: X+33, Y+64
            Prize: X=5343, Y=3186
            
            Button A: X+46, Y+21
            Button B: X+49, Y+73
            Prize: X=13427, Y=10951
            
            Button A: X+21, Y+58
            Button B: X+66, Y+47
            Prize: X=7536, Y=9585
            
            Button A: X+88, Y+51
            Button B: X+26, Y+72
            Prize: X=7596, Y=5427
            
            Button A: X+55, Y+48
            Button B: X+94, Y+15
            Prize: X=10975, Y=5556
            
            Button A: X+12, Y+26
            Button B: X+60, Y+39
            Prize: X=924, Y=1092
            
            Button A: X+49, Y+23
            Button B: X+35, Y+60
            Prize: X=15285, Y=7315
            
            Button A: X+11, Y+82
            Button B: X+78, Y+15
            Prize: X=4905, Y=5989
            
            Button A: X+19, Y+61
            Button B: X+74, Y+56
            Prize: X=2004, Y=5526
            
            Button A: X+11, Y+12
            Button B: X+94, Y+23
            Prize: X=1709, Y=1228
            
            Button A: X+30, Y+63
            Button B: X+99, Y+56
            Prize: X=6276, Y=6496
            
            Button A: X+13, Y+51
            Button B: X+60, Y+29
            Prize: X=17520, Y=789
            
            Button A: X+72, Y+27
            Button B: X+16, Y+42
            Prize: X=1552, Y=2778
            
            Button A: X+68, Y+87
            Button B: X+61, Y+14
            Prize: X=5879, Y=6561
            
            Button A: X+34, Y+94
            Button B: X+67, Y+33
            Prize: X=8854, Y=11082
            
            Button A: X+14, Y+73
            Button B: X+89, Y+64
            Prize: X=4490, Y=5809
            
            Button A: X+74, Y+14
            Button B: X+26, Y+88
            Prize: X=4150, Y=2696
            
            Button A: X+53, Y+19
            Button B: X+18, Y+68
            Prize: X=15211, Y=12095
            
            Button A: X+13, Y+83
            Button B: X+57, Y+56
            Prize: X=895, Y=2635
            
            Button A: X+72, Y+76
            Button B: X+93, Y+24
            Prize: X=10377, Y=5836
            
            Button A: X+29, Y+86
            Button B: X+19, Y+16
            Prize: X=2240, Y=2810
            
            Button A: X+24, Y+14
            Button B: X+11, Y+47
            Prize: X=1676, Y=4062
            
            """;
}