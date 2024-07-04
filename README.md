Projeto criado para avaliar os seguintes métodos de ordenação: Bubble Sort, Insertion Sort, Selection Sort, Heap Sort, Shell Sort, Merge Sort, Quick Sort.

[Tabelas com os resultados está aqui](https://docs.google.com/spreadsheets/d/1rmjle9B6_U_Md-3OMuLncgQ79M4A1l_kwWtWcWqS_HE/edit?usp=sharing)

Logs com o tempo de todas as execuções realizadas, separadas pelo tamanho do array:

### Sorting Algorithms Analysis ###
Array Size      Array Type           Sorting Algorithm Mean (ns)       Variance (ns^2)      Std Deviation (ns)  
--------------------------------------------------------------------------------------------------------------
128             Crescent             BubbleSort           48500,00        12468570000,00  111662,75           
128             Crescent             InsertionSort        33240,00        7042880400,00   83921,87            
128             Crescent             SelectionSort        286720,00       66954823600,00  258756,30           
128             Crescent             HeapSort             68150,00        8198904500,00   90547,80            
128             Crescent             ShellSort            47560,00        6397932400,00   79987,08            
128             Crescent             MergeSort            133080,00       69029383600,00  262734,44           
128             Crescent             QuickSort            633400,00       625180400000,00 790683,50           
128             Decrescent           BubbleSort           569320,00       68096435600,00  260952,94           
128             Decrescent           InsertionSort        503100,00       16566464000,00  128710,78           
128             Decrescent           SelectionSort        38490,00        15302900,00     3911,89             
128             Decrescent           HeapSort             52370,00        655692100,00    25606,49            
128             Decrescent           ShellSort            44970,00        1670100,00      1292,32             
128             Decrescent           MergeSort            56170,00        142556100,00    11939,69            
128             Decrescent           QuickSort            118860,00       8363248400,00   91450,80            
128             Random               BubbleSort           180420,00       61884181600,00  248765,31           
128             Random               InsertionSort        32550,00        10708500,00     3272,38             
128             Random               SelectionSort        54470,00        292832100,00    17112,34            
128             Random               HeapSort             16550,00        4564500,00      2136,47             
128             Random               ShellSort            49790,00        750900,00       866,54              
128             Random               MergeSort            63630,00        28266100,00     5316,59             
128             Random               QuickSort            24220,00        6405600,00      2530,93             
128             Random with Repeats  BubbleSort           216370,00       34339262100,00  185308,56           
128             Random with Repeats  InsertionSort        46390,00        14502900,00     3808,27             
128             Random with Repeats  SelectionSort        160640,00       388726400,00    19716,15            
128             Random with Repeats  HeapSort             58130,00        2378356100,00   48768,39            
128             Random with Repeats  ShellSort            50370,00        740100,00       860,29              
128             Random with Repeats  MergeSort            58940,00        2482400,00      1575,56             
128             Random with Repeats  QuickSort            24180,00        35187600,00     5931,91             
256             Crescent             BubbleSort           2230,00         6742100,00      2596,56             
256             Crescent             InsertionSort        2450,00         7202500,00      2683,75             
256             Crescent             SelectionSort        167080,00       17034831600,00  130517,55           
256             Crescent             HeapSort             38690,00        2172900,00      1474,08             
256             Crescent             ShellSort            41690,00        514900,00       717,57              
256             Crescent             MergeSort            112070,00       9448100,00      3073,78             
256             Crescent             QuickSort            588080,00       19255429600,00  138763,93           
256             Decrescent           BubbleSort           150790,00       4550900,00      2133,28             
256             Decrescent           InsertionSort        253440,00       1017430400,00   31897,18            
256             Decrescent           SelectionSort        63660,00        90748400,00     9526,20             
256             Decrescent           HeapSort             34090,00        6562900,00      2561,82             
256             Decrescent           ShellSort            87430,00        15284100,00     3909,49             
256             Decrescent           MergeSort            119550,00       20932500,00     4575,20             
256             Decrescent           QuickSort            611380,00       3184039600,00   56427,29            
256             Random               BubbleSort           130450,00       32108500,00     5666,44             
256             Random               InsertionSort        247360,00       2140368400,00   46264,12            
256             Random               SelectionSort        90130,00        722100,00       849,76              
256             Random               HeapSort             36860,00        10982400,00     3313,97             
256             Random               ShellSort            66160,00        3669434400,00   60575,86            
256             Random               MergeSort            189160,00       40591152400,00  201472,46           
256             Random               QuickSort            45780,00        799159600,00    28269,41            
256             Random with Repeats  BubbleSort           413580,00       32521099600,00  180336,07           
256             Random with Repeats  InsertionSort        60690,00        64600900,00     8037,47             
256             Random with Repeats  SelectionSort        89750,00        22500,00        150,00              
256             Random with Repeats  HeapSort             28870,00        12966100,00     3600,85             
256             Random with Repeats  ShellSort            40800,00        40788000,00     6386,55             
256             Random with Repeats  MergeSort            139670,00       188504100,00    13729,68            
256             Random with Repeats  QuickSort            33580,00        11509600,00     3392,58             
512             Crescent             BubbleSort           14420,00        43529600,00     6597,70             
512             Crescent             InsertionSort        1390,00         12900,00        113,58              
512             Crescent             SelectionSort        355920,00       3159600,00      1777,53             
512             Crescent             HeapSort             86560,00        22026400,00     4693,23             
512             Crescent             ShellSort            45830,00        1890120100,00   43475,51            
512             Crescent             MergeSort            311610,00       63012488900,00  251022,89           
512             Crescent             QuickSort            479760,00       23584400,00     4856,38             
512             Decrescent           BubbleSort           585500,00       8531822000,00   92367,86            
512             Decrescent           InsertionSort        459670,00       1589534100,00   39868,96            
512             Decrescent           SelectionSort        367480,00       143793600,00    11991,40            
512             Decrescent           HeapSort             84810,00        107344900,00    10360,74            
512             Decrescent           ShellSort            15970,00        43752100,00     6614,54             
512             Decrescent           MergeSort            271970,00       570256100,00    23880,04            
512             Decrescent           QuickSort            386360,00       2664816400,00   51621,86            
512             Random               BubbleSort           588660,00       43313126400,00  208118,06           
512             Random               InsertionSort        273820,00       1639853600,00   40495,11            
512             Random               SelectionSort        367910,00       116056900,00    10772,97            
512             Random               HeapSort             51920,00        672889600,00    25940,12            
512             Random               ShellSort            29460,00        42794400,00     6541,74             
512             Random               MergeSort            316170,00       7564498100,00   86974,12            
512             Random               QuickSort            43230,00        504072100,00    22451,55            
512             Random with Repeats  BubbleSort           528500,00       3641556000,00   60345,31            
512             Random with Repeats  InsertionSort        214350,00       36784500,00     6065,02             
512             Random with Repeats  SelectionSort        364580,00       110577600,00    10515,59            
512             Random with Repeats  HeapSort             52040,00        96136400,00     9804,92             
512             Random with Repeats  ShellSort            21630,00        23924100,00     4891,23             
512             Random with Repeats  MergeSort            305330,00       15463618100,00  124352,80           
512             Random with Repeats  QuickSort            32890,00        108122900,00    10398,22            
1024            Crescent             BubbleSort           2000,00         1782000,00      1334,92             
1024            Crescent             InsertionSort        2740,00         178400,00       422,37              
1024            Crescent             SelectionSort        1462340,00      536846400,00    23169,95            
1024            Crescent             HeapSort             90490,00        358230900,00    18926,99            
1024            Crescent             ShellSort            18210,00        4756900,00      2181,03             
1024            Crescent             MergeSort            514360,00       12836970400,00  113300,35           
1024            Crescent             QuickSort            1639810,00      2959818900,00   54404,22            
1024            Decrescent           BubbleSort           2338710,00      51260850900,00  226408,59           
1024            Decrescent           InsertionSort        2387150,00      312280504500,00 558820,64           
1024            Decrescent           SelectionSort        1437420,00      16069600,00     4008,69             
1024            Decrescent           HeapSort             73910,00        24372900,00     4936,89             
1024            Decrescent           ShellSort            28350,00        6580500,00      2565,25             
1024            Decrescent           MergeSort            581530,00       1097306100,00   33125,61            
1024            Decrescent           QuickSort            1211120,00      52921713600,00  230047,20           
1024            Random               BubbleSort           1974650,00      20353528500,00  142665,79           
1024            Random               InsertionSort        1460330,00      9592732100,00   97942,49            
1024            Random               SelectionSort        1478850,00      1569438500,00   39616,14            
1024            Random               HeapSort             144060,00       577684400,00    24035,07            
1024            Random               ShellSort            91690,00        206688900,00    14376,68            
1024            Random               MergeSort            642350,00       22782030500,00  150937,17           
1024            Random               QuickSort            62300,00        103114000,00    10154,51            
1024            Random with Repeats  BubbleSort           2096330,00      1638976100,00   40484,27            
1024            Random with Repeats  InsertionSort        937860,00       33649314400,00  183437,49           
1024            Random with Repeats  SelectionSort        1440740,00      274558400,00    16569,80            
1024            Random with Repeats  HeapSort             75610,00        380814900,00    19514,48            
1024            Random with Repeats  ShellSort            66290,00        79972900,00     8942,76             
1024            Random with Repeats  MergeSort            175770,00       50714288100,00  225198,33           
1024            Random with Repeats  QuickSort            60560,00        333974400,00    18274,97            
2048            Crescent             BubbleSort           2910,00         160900,00       401,12              
2048            Crescent             InsertionSort        5440,00         860400,00       927,58              
2048            Crescent             SelectionSort        5739470,00      6681360100,00   81739,59            
2048            Crescent             HeapSort             176080,00       1040279600,00   32253,37            
2048            Crescent             ShellSort            33530,00        4236100,00      2058,18             
2048            Crescent             MergeSort            109810,00       37618900,00     6133,42             
2048            Crescent             QuickSort            6897630,00      2308536966100,00 1519387,04          
2048            Decrescent           BubbleSort           8725660,00      257587482400,00 507530,77           
2048            Decrescent           InsertionSort        7053870,00      11417070100,00  106850,69           
2048            Decrescent           SelectionSort        5665950,00      815280500,00    28553,12            
2048            Decrescent           HeapSort             142550,00       125258500,00    11191,89            
2048            Decrescent           ShellSort            60250,00        44032500,00     6635,70             
2048            Decrescent           MergeSort            114810,00       1292900,00      1137,06             
2048            Decrescent           QuickSort            4364570,00      20852784100,00  144404,93           
2048            Random               BubbleSort           7822660,00      3487528400,00   59055,30            
2048            Random               InsertionSort        3547060,00      11024816400,00  104999,13           
2048            Random               SelectionSort        5822180,00      4854385600,00   69673,42            
2048            Random               HeapSort             184990,00       387430900,00    19683,26            
2048            Random               ShellSort            173250,00       40828500,00     6389,72             
2048            Random               MergeSort            196480,00       104087600,00    10202,33            
2048            Random               QuickSort            133770,00       218316100,00    14775,52            
2048            Random with Repeats  BubbleSort           9072450,00      194159630500,00 440635,48           
2048            Random with Repeats  InsertionSort        3775240,00      380587572400,00 616917,80           
2048            Random with Repeats  SelectionSort        5682890,00      1390758900,00   37292,88            
2048            Random with Repeats  HeapSort             197820,00       857099600,00    29276,26            
2048            Random with Repeats  ShellSort            170510,00       251394900,00    15855,44            
2048            Random with Repeats  MergeSort            221310,00       1260534900,00   35504,01            
2048            Random with Repeats  QuickSort            122380,00       149439600,00    12224,55            
4096            Crescent             BubbleSort           5520,00         279600,00       528,77              
4096            Crescent             InsertionSort        9960,00         564400,00       751,27              
4096            Crescent             SelectionSort        22656990,00     2769424900,00   52625,33            
4096            Crescent             HeapSort             319170,00       418802100,00    20464,65            
4096            Crescent             ShellSort            71600,00        1306000,00      1142,80             
4096            Crescent             MergeSort            239890,00       39884900,00     6315,45             
4096            Crescent             QuickSort            26537140,00     309534696400,00 556358,42           
4096            Decrescent           BubbleSort           35120870,00     59120978100,00  243148,06           
4096            Decrescent           InsertionSort        28090580,00     239098967600,00 488977,47           
4096            Decrescent           SelectionSort        22807230,00     113730760100,00 337239,91           
4096            Decrescent           HeapSort             305570,00       6334100,00      2516,76             
4096            Decrescent           ShellSort            119490,00       588900,00       767,40              
4096            Decrescent           MergeSort            251130,00       104614100,00    10228,10            
4096            Decrescent           QuickSort            16695660,00     140468942400,00 374791,87           
4096            Random               BubbleSort           31494680,00     220055093600,00 469100,30           
4096            Random               InsertionSort        14635560,00     1431756788400,00 1196560,40          
4096            Random               SelectionSort        22999840,00     689706400,00    26262,26            
4096            Random               HeapSort             419010,00       5635878900,00   75072,49            
4096            Random               ShellSort            407000,00       84384000,00     9186,08             
4096            Random               MergeSort            439260,00       340406400,00    18450,11            
4096            Random               QuickSort            297920,00       129831600,00    11394,37            
4096            Random with Repeats  BubbleSort           40027120,00     10973111741600,00 3312568,75          
4096            Random with Repeats  InsertionSort        14681810,00     899526092900,00 948433,49           
4096            Random with Repeats  SelectionSort        22649500,00     2526030000,00   50259,63            
4096            Random with Repeats  HeapSort             421770,00       4739482100,00   68843,90            
4096            Random with Repeats  ShellSort            420340,00       3517312400,00   59306,93            
4096            Random with Repeats  MergeSort            419820,00       42221600,00     6497,82             
4096            Random with Repeats  QuickSort            296730,00       148690100,00    12193,86            
8192            Crescent             BubbleSort           11210,00        1128900,00      1062,50             
8192            Crescent             InsertionSort        19210,00        42900,00        207,12              
8192            Crescent             SelectionSort        90910790,00     242019618900,00 491954,90           
8192            Crescent             HeapSort             663580,00       136313600,00    11675,34            
8192            Crescent             ShellSort            155270,00       1210100,00      1100,05             
8192            Crescent             MergeSort            512620,00       292607600,00    17105,78            
8192            Crescent             QuickSort            109296550,00    32133793444500,00 5668667,70          
8192            Decrescent           BubbleSort           142886710,00    11991318972900,00 3462848,39          
8192            Decrescent           InsertionSort        112159060,00    2721126872400,00 1649583,85          
8192            Decrescent           SelectionSort        90393270,00     14842536100,00  121829,95           
8192            Decrescent           HeapSort             650070,00       115568100,00    10750,26            
8192            Decrescent           ShellSort            252450,00       5944500,00      2438,13             
8192            Decrescent           MergeSort            559500,00       7753680000,00   88054,98            
8192            Decrescent           QuickSort            67355740,00     2209340538400,00 1486385,06          
8192            Random               BubbleSort           144971200,00    11035832228000,00 3322022,31          
8192            Random               InsertionSort        58689680,00     254806201600,00 504783,32           
8192            Random               SelectionSort        93428720,00     29340441600,00  171290,52           
8192            Random               HeapSort             916830,00       98724100,00     9936,00             
8192            Random               ShellSort            1021590,00      242022900,00    15557,09            
8192            Random               MergeSort            1328660,00      29428536400,00  171547,48           
8192            Random               QuickSort            902070,00       1302792100,00   36094,21            
8192            Random with Repeats  BubbleSort           168173630,00    80210190354100,00 8956014,20          
8192            Random with Repeats  InsertionSort        56605130,00     460337936100,00 678482,08           
8192            Random with Repeats  SelectionSort        90786250,00     49132846500,00  221659,30           
8192            Random with Repeats  HeapSort             891870,00       6197392100,00   78723,52            
8192            Random with Repeats  ShellSort            942590,00       47760900,00     6910,93             
8192            Random with Repeats  MergeSort            914840,00       40308400,00     6348,89             
8192            Random with Repeats  QuickSort            610910,00       121340900,00    11015,48            
16384           Crescent             BubbleSort           20910,00        166900,00       408,53              
16384           Crescent             InsertionSort        38220,00        19600,00        140,00              
16384           Crescent             SelectionSort        362153490,00    82244590900,00  286783,18           
16384           Crescent             HeapSort             1410290,00      428190900,00    20692,77            
16384           Crescent             ShellSort            352240,00       961888400,00    31014,33            
16384           Crescent             MergeSort            1139580,00      66155600,00     8133,61             
16384           Crescent             QuickSort            423690430,00    17592375086100,00 4194326,54          
16384           Decrescent           BubbleSort           565622780,00    5396761129600,00 2323093,01          
16384           Decrescent           InsertionSort        443645630,00    4025610706100,00 2006392,46          
16384           Decrescent           SelectionSort        361484440,00    207321106400,00 455325,28           
16384           Decrescent           HeapSort             1374040,00      301440400,00    17362,04            
16384           Decrescent           ShellSort            673720,00       1004195600,00   31689,05            
16384           Decrescent           MergeSort            1169520,00      290951600,00    17057,30            
16384           Decrescent           QuickSort            265649460,00    17034440486400,00 4127280,03          
16384           Random               BubbleSort           811469830,00    2439584149806100,00 49392146,64         
16384           Random               InsertionSort        290045210,00    680671154900,00 825027,97           
16384           Random               SelectionSort        388854570,00    364540456100,00 603771,86           
16384           Random               HeapSort             2310510,00      11482128900,00  107154,70           
16384           Random               ShellSort            2842260,00      7217400400,00   84955,28            
16384           Random               MergeSort            2369590,00      1992100900,00   44632,96            
16384           Random               QuickSort            1704810,00      393540802900,00 627328,31           
16384           Random with Repeats  BubbleSort           695103780,00    246971767971600,00 15715335,44         
16384           Random with Repeats  InsertionSort        225456250,00    1484684444500,00 1218476,28          
16384           Random with Repeats  SelectionSort        367474080,00    2376244733600,00 1541507,29          
16384           Random with Repeats  HeapSort             2570310,00      202016108900,00 449462,02           
16384           Random with Repeats  ShellSort            2283010,00      22636522900,00  150454,39           
16384           Random with Repeats  MergeSort            2026090,00      625196900,00    25003,94            
16384           Random with Repeats  QuickSort            1379040,00      5673210400,00   75320,72            
32768           Crescent             BubbleSort           43060,00        6092400,00      2468,28             
32768           Crescent             InsertionSort        104950,00       368156500,00    19187,40            
32768           Crescent             SelectionSort        1458146460,00   5376885362400,00 2318811,20          
32768           Crescent             HeapSort             3035350,00      81031840500,00  284660,92           
32768           Crescent             ShellSort            731290,00       9268900,00      3044,49             
32768           Crescent             MergeSort            2370250,00      5377988500,00   73334,77            
32768           Crescent             QuickSort            1734140940,00   1954445993108400,00 44209116,63         
32768           Decrescent           BubbleSort           2303193500,00   116566098128000,00 10796578,07         
32768           Decrescent           InsertionSort        1786583710,00   92646069936900,00 9625282,85          
32768           Decrescent           SelectionSort        1455477780,00   6585019055600,00 2566129,20          
32768           Decrescent           HeapSort             2958150,00      40230164500,00  200574,59           
32768           Decrescent           ShellSort            1349820,00      298225600,00    17269,21            
32768           Decrescent           MergeSort            2425800,00      1086412000,00   32960,76            
32768           Decrescent           QuickSort            1074623020,00   53571502867600,00 7319255,62          
32768           Random               BubbleSort           3531619800,00   16127453574317996,00 126993911,56        
32768           Random               InsertionSort        1330346480,00   154033805937600,00 12411035,65         
32768           Random               SelectionSort        1586539440,00   19330814730400,00 4396682,24          
32768           Random               HeapSort             5303120,00      8908239600,00   94383,47            
32768           Random               ShellSort            6444430,00      8799122100,00   93803,64            
32768           Random               MergeSort            5303530,00      18670034100,00  136638,33           
32768           Random               QuickSort            3586440,00      15797528400,00  125688,22           
32768           Random with Repeats  BubbleSort           3576402900,00   6122549536428000,00 78246722,21         
32768           Random with Repeats  InsertionSort        1027398160,00   123634723518400,00 11119115,23         
32768           Random with Repeats  SelectionSort        1479182910,00   23222662976900,00 4818989,83          
32768           Random with Repeats  HeapSort             4617340,00      5356102400,00   73185,40            
32768           Random with Repeats  ShellSort            5583080,00      638753600,00    25273,58            
32768           Random with Repeats  MergeSort            4869400,00      74833794000,00  273557,66           
32768           Random with Repeats  QuickSort            4521490,00      351550496900,00 592916,94           
65536           Crescent             BubbleSort           93700,00        89962000,00     9484,83             
65536           Crescent             InsertionSort        164310,00       218930900,00    14796,31            
65536           Crescent             SelectionSort        5840705610,00   55131831948900,00 7425081,28          
65536           Crescent             HeapSort             6147830,00      3534120100,00   59448,47            
65536           Crescent             ShellSort            1990750,00      41316286500,00  203264,08           
65536           Crescent             MergeSort            5154300,00      11394644000,00  106745,70           
65536           Crescent             QuickSort            7052332090,00   20855953594090900,00 144415904,92        
65536           Decrescent           BubbleSort           9406123580,00   26196044560935596,00 161851921,71        
65536           Decrescent           InsertionSort        7393529650,00   24221847001300496,00 155633694,94        
65536           Decrescent           SelectionSort        5847703960,00   194086925896400,00 13931508,39         
65536           Decrescent           HeapSort             6096100,00      2846984000,00   53357,14            
65536           Decrescent           ShellSort            2740350,00      820924500,00    28651,78            
65536           Decrescent           MergeSort            5731000,00      2497846214000,00 1580457,60 
