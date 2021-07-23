/**
 * This class contains the RGB values of the legend of the 
 * Divergent Color Scheme.
 * Each field contains an array with several legends for a
 * different number of classes (classes in the statistical sense)
 * Each legend array contains the RGB values of the colors composing 
 * that class.
 * The methods to access the fields are inherited from the class
 * ColorSchemes
 */


 public strictfp class Divergent extends ColorSchemes {

	static final int 	PuOr	[][][] = {  									
		{	{	241	,	163	,	64	}	,
			{	247	,	247	,	247	}	,
			{	153	,	142	,	195	}	},
		{	{	230	,	97	,	1	}	,
			{	253	,	184	,	99	}	,
			{	178	,	171	,	210	}	,
			{	94	,	60	,	153	}	},
		{	{	230	,	97	,	1	}	,
			{	253	,	184	,	99	}	,
			{	247	,	247	,	247	}	,
			{	178	,	171	,	210	}	,
			{	94	,	60	,	153	}	},
		{	{	179	,	88	,	6	}	,
			{	241	,	163	,	64	}	,
			{	254	,	224	,	182	}	,
			{	216	,	218	,	235	}	,
			{	153	,	142	,	195	}	,
			{	84	,	39	,	136	}	},
		{	{	179	,	88	,	6	}	,
			{	241	,	163	,	64	}	,
			{	254	,	224	,	182	}	,
			{	247	,	247	,	247	}	,
			{	216	,	218	,	235	}	,
			{	153	,	142	,	195	}	,
			{	84	,	39	,	136	}	},
		{	{	179	,	88	,	6	}	,
			{	224	,	130	,	20	}	,
			{	253	,	184	,	99	}	,
			{	254	,	224	,	182	}	,
			{	216	,	218	,	235	}	,
			{	178	,	171	,	210	}	,
			{	128	,	115	,	172	}	,
			{	84	,	39	,	136	}	},
		{	{	179	,	88	,	6	}	,
			{	224	,	130	,	20	}	,
			{	253	,	184	,	99	}	,
			{	254	,	224	,	182	}	,
			{	247	,	247	,	247	}	,
			{	216	,	218	,	235	}	,
			{	178	,	171	,	210	}	,
			{	128	,	115	,	172	}	,
			{	84	,	39	,	136	}	},
		{	{	127	,	59	,	8	}	,
			{	179	,	88	,	6	}	,
			{	224	,	130	,	20	}	,
			{	253	,	184	,	99	}	,
			{	254	,	224	,	182	}	,
			{	216	,	218	,	235	}	,
			{	178	,	171	,	210	}	,
			{	128	,	115	,	172	}	,
			{	84	,	39	,	136	}	,
			{	45	,	0	,	75	}	},
		{	{	127	,	59	,	8	}	,
			{	179	,	88	,	6	}	,
			{	224	,	130	,	20	}	,
			{	253	,	184	,	99	}	,
			{	254	,	224	,	182	}	,
			{	247	,	247	,	247	}	,
			{	216	,	218	,	235	}	,
			{	178	,	171	,	210	}	,
			{	128	,	115	,	172	}	,
			{	84	,	39	,	136	}	,
			{	45	,	0	,	75	}	}};
	
	static final int 	Spectral	[][][] = {  									
		{	{	252	,	141	,	89	}	,
			{	255	,	255	,	191	}	,
			{	153	,	213	,	148	}	},
		{	{	215	,	25	,	28	}	,
			{	253	,	174	,	97	}	,
			{	171	,	221	,	164	}	,
			{	43	,	131	,	186	}	},
		{	{	215	,	25	,	28	}	,
			{	253	,	174	,	97	}	,
			{	255	,	255	,	191	}	,
			{	171	,	221	,	164	}	,
			{	43	,	131	,	186	}	},
		{	{	213	,	62	,	79	}	,
			{	252	,	141	,	89	}	,
			{	254	,	224	,	139	}	,
			{	230	,	245	,	152	}	,
			{	153	,	213	,	148	}	,
			{	50	,	136	,	189	}	},
		{	{	213	,	62	,	79	}	,
			{	252	,	141	,	89	}	,
			{	254	,	224	,	139	}	,
			{	255	,	255	,	191	}	,
			{	230	,	245	,	152	}	,
			{	153	,	213	,	148	}	,
			{	50	,	136	,	189	}	},
		{	{	213	,	62	,	79	}	,
	 		{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	139	}	,
			{	230	,	245	,	152	}	,
			{	171	,	221	,	164	}	,
			{	102	,	194	,	165	}	,
			{	50	,	136	,	189	}	},
		{	{	213	,	62	,	79	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	139	}	,
			{	255	,	255	,	191	}	,
			{	230	,	245	,	152	}	,
			{	171	,	221	,	164	}	,
			{	102	,	194	,	165	}	,
			{	50	,	136	,	189	}	},
		{	{	158	,	1	,	66	}	,
			{	213	,	62	,	79	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	139	}	,
			{	230	,	245	,	152	}	,
			{	171	,	221	,	164	}	,
			{	102	,	194	,	165	}	,
			{	50	,	136	,	189	}	,
			{	94	,	79	,	162	}	},
		{	{	158	,	1	,	66	}	,
			{	213	,	62	,	79	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	139	}	,
			{	255	,	255	,	191	}	,
			{	230	,	245	,	152	}	,
			{	171	,	221	,	164	}	,
			{	102	,	194	,	165	}	,
			{	50	,	136	,	189	}	,
			{	94	,	79	,	162	}	}};	

	static final int 	RdYlBu	[][][] = {  									
		{	{	252	,	141	,	89	}	,
			{	255	,	255	,	191	}	,
			{	145	,	191	,	219	}	},
		{	{	215	,	25	,	28	}	,
			{	253	,	174	,	97	}	,
			{	171	,	217	,	233	}	,
			{	44	,	123	,	182	}	},
		{	{	215	,	25	,	28	}	,
			{	253	,	174	,	97	}	,
			{	255	,	255	,	191	}	,
			{	171	,	217	,	233	}	,
			{	44	,	123	,	182	}	},
		{	{	215	,	48	,	39	}	,
			{	252	,	141	,	89	}	,
			{	254	,	224	,	144	}	,
			{	224	,	243	,	248	}	,
			{	145	,	191	,	219	}	,
			{	69	,	117	,	180	}	},
		{	{	215	,	48	,	39	}	,
			{	252	,	141	,	89	}	,
			{	254	,	224	,	144	}	,
			{	255	,	255	,	191	}	,
			{	224	,	243	,	248	}	,
			{	145	,	191	,	219	}	,
			{	69	,	117	,	180	}	},
		{	{	215	,	48	,	39	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	144	}	,
			{	224	,	243	,	248	}	,
			{	171	,	217	,	233	}	,
			{	116	,	173	,	209	}	,
			{	69	,	117	,	180	}	},
		{	{	215	,	48	,	39	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	144	}	,
			{	255	,	255	,	191	}	,
			{	224	,	243	,	248	}	,
			{	171	,	217	,	233	}	,
			{	116	,	173	,	209	}	,
			{	69	,	117	,	180	}	},
		{	{	165	,	0	,	38	}	,
			{	215	,	48	,	39	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	144	}	,
			{	224	,	243	,	248	}	,
			{	171	,	217	,	233	}	,
			{	116	,	173	,	209	}	,
			{	69	,	117	,	180	}	,
			{	49	,	54	,	149	}	},
		{	{	165	,	0	,	38	}	,
			{	215	,	48	,	39	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	144	}	,
			{	255	,	255	,	191	}	,
			{	224	,	243	,	248	}	,
			{	171	,	217	,	233	}	,
			{	116	,	173	,	209	}	,
			{	69	,	117	,	180	}	,
			{	49	,	54	,	149	}	}};
		
	static final int 	RdBu	[][][] = {  									
		{	{	239	,	138	,	98	}	,
			{	247	,	247	,	247	}	,
			{	103	,	169	,	207	}	},
		{	{	202	,	0	,	32	}	,
			{	244	,	165	,	130	}	,
			{	146	,	197	,	222	}	,
			{	5	,	113	,	176	}	},
		{	{	202	,	0	,	32	}	,
			{	244	,	165	,	130	}	,
			{	247	,	247	,	247	}	,
			{	146	,	197	,	222	}	,
			{	5	,	113	,	176	}	},
		{	{	178	,	24	,	43	}	,
			{	239	,	138	,	98	}	,
			{	253	,	219	,	199	}	,
			{	209	,	229	,	240	}	,
			{	103	,	169	,	207	}	,
			{	33	,	102	,	172	}	},
		{	{	178	,	24	,	43	}	,
			{	239	,	138	,	98	}	,
			{	253	,	219	,	199	}	,
			{	247	,	247	,	247	}	,
			{	209	,	229	,	240	}	,
			{	103	,	169	,	207	}	,
			{	33	,	102	,	172	}	},
		{	{	178	,	24	,	43	}	,
			{	214	,	96	,	77	}	,
			{	244	,	165	,	130	}	,
			{	253	,	219	,	199	}	,
			{	209	,	229	,	240	}	,
			{	146	,	197	,	222	}	,
			{	67	,	147	,	195	}	,
			{	33	,	102	,	172	}	},
		{	{	178	,	24	,	43	}	,
			{	214	,	96	,	77	}	,
			{	244	,	165	,	130	}	,
			{	253	,	219	,	199	}	,
			{	247	,	247	,	247	}	,
			{	209	,	229	,	240	}	,
			{	146	,	197	,	222	}	,
			{	67	,	147	,	195	}	,
			{	33	,	102	,	172	}	},
		{	{	103	,	0	,	31	}	,
			{	178	,	24	,	43	}	,
			{	214	,	96	,	77	}	,
			{	244	,	165	,	130	}	,
			{	253	,	219	,	199	}	,
			{	209	,	229	,	240	}	,
			{	146	,	197	,	222	}	,
			{	67	,	147	,	195	}	,
			{	33	,	102	,	172	}	,
			{	5	,	48	,	97	}	},
		{	{	103	,	0	,	31	}	,
			{	178	,	24	,	43	}	,
			{	214	,	96	,	77	}	,
			{	244	,	165	,	130	}	,
			{	253	,	219	,	199	}	,
			{	247	,	247	,	247	}	,
			{	209	,	229	,	240	}	,
			{	146	,	197	,	222	}	,
			{	67	,	147	,	195	}	,
			{	33	,	102	,	172	}	,
			{	5	,	48	,	97	}	}};
	
	static final int 	RdGy	[][][] = {  									
		{	{	239	,	138	,	98	}	,
			{	255	,	255	,	255	}	,
			{	153	,	153	,	153	}	},
		{	{	202	,	0	,	32	}	,
			{	244	,	165	,	130	}	,
			{	186	,	186	,	186	}	,
			{	64	,	64	,	64	}	},
		{	{	202	,	0	,	32	}	,
			{	244	,	165	,	130	}	,
			{	255	,	255	,	255	}	,
			{	186	,	186	,	186	}	,
			{	64	,	64	,	64	}	},
		{	{	178	,	24	,	43	}	,
			{	239	,	138	,	98	}	,
			{	253	,	219	,	199	}	,
			{	224	,	224	,	224	}	,
			{	153	,	153	,	153	}	,
			{	77	,	77	,	77	}	},
		{	{	178	,	24	,	43	}	,
			{	239	,	138	,	98	}	,
			{	253	,	219	,	199	}	,
			{	255	,	255	,	255	}	,
			{	224	,	224	,	224	}	,
			{	153	,	153	,	153	}	,
			{	77	,	77	,	77	}	},
		{	{	178	,	24	,	43	}	,
			{	214	,	96	,	77	}	,
			{	244	,	165	,	130	}	,
			{	253	,	219	,	199	}	,
			{	224	,	224	,	224	}	,
			{	186	,	186	,	186	}	,
			{	135	,	135	,	135	}	,
			{	77	,	77	,	77	}	},
		{	{	178	,	24	,	43	}	,
			{	214	,	96	,	77	}	,
			{	244	,	165	,	130	}	,
			{	253	,	219	,	199	}	,
			{	255	,	255	,	255	}	,
			{	224	,	224	,	224	}	,
			{	186	,	186	,	186	}	,
			{	135	,	135	,	135	}	,
			{	77	,	77	,	77	}	},
		{	{	103	,	0	,	31	}	,
			{	178	,	24	,	43	}	,
			{	214	,	96	,	77	}	,
			{	244	,	165	,	130	}	,
			{	253	,	219	,	199	}	,
			{	224	,	224	,	224	}	,
			{	186	,	186	,	186	}	,
			{	135	,	135	,	135	}	,
			{	77	,	77	,	77	}	,
			{	26	,	26	,	26	}	},
		{	{	103	,	0	,	31	}	,
			{	178	,	24	,	43	}	,
			{	214	,	96	,	77	}	,
			{	244	,	165	,	130	}	,
			{	253	,	219	,	199	}	,
			{	255	,	255	,	255	}	,
			{	224	,	224	,	224	}	,
			{	186	,	186	,	186	}	,
			{	135	,	135	,	135	}	,
			{	77	,	77	,	77	}	,
			{	26	,	26	,	26	}	}};
	
	static final int 	RdYlGn	[][][] = {  									
		{	{	252	,	141	,	89	}	,
			{	255	,	255	,	191	}	,
			{	145	,	207	,	96	}	},
		{	{	215	,	25	,	28	}	,
			{	253	,	174	,	97	}	,
			{	166	,	217	,	106	}	,
			{	26	,	150	,	65	}	},
		{	{	215	,	25	,	28	}	,
			{	253	,	174	,	97	}	,
			{	255	,	255	,	191	}	,
			{	166	,	217	,	106	}	,
			{	26	,	150	,	65	}	},
		{	{	215	,	48	,	39	}	,
			{	252	,	141	,	89	}	,
			{	254	,	224	,	139	}	,
			{	217	,	239	,	139	}	,
			{	145	,	207	,	96	}	,
			{	26	,	152	,	80	}	},
		{	{	215	,	48	,	39	}	,
			{	252	,	141	,	89	}	,
			{	254	,	224	,	139	}	,
			{	255	,	255	,	191	}	,
			{	217	,	239	,	139	}	,
			{	145	,	207	,	96	}	,
			{	26	,	152	,	80	}	},
		{	{	215	,	48	,	39	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	139	}	,
			{	217	,	239	,	139	}	,
			{	166	,	217	,	106	}	,
			{	102	,	189	,	99	}	,
			{	26	,	152	,	80	}	},
		{	{	215	,	48	,	39	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	139	}	,
			{	255	,	255	,	191	}	,
			{	217	,	239	,	139	}	,
			{	166	,	217	,	106	}	,
			{	102	,	189	,	99	}	,
			{	26	,	152	,	80	}	},
		{	{	165	,	0	,	38	}	,
			{	215	,	48	,	39	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	139	}	,
			{	217	,	239	,	139	}	,
			{	166	,	217	,	106	}	,
			{	102	,	189	,	99	}	,
			{	26	,	152	,	80	}	,
			{	0	,	104	,	55	}	},
		{	{	165	,	0	,	38	}	,
			{	215	,	48	,	39	}	,
			{	244	,	109	,	67	}	,
			{	253	,	174	,	97	}	,
			{	254	,	224	,	139	}	,
			{	255	,	255	,	191	}	,
			{	217	,	239	,	139	}	,
			{	166	,	217	,	106	}	,
			{	102	,	189	,	99	}	,
			{	26	,	152	,	80	}	,
			{	0	,	104	,	55	}	}};
	
	static final int 	PRGn	[][][] = {  									
		{	{	175	,	141	,	195	}	,
			{	247	,	247	,	247	}	,
			{	127	,	191	,	123	}	},
		{	{	123	,	50	,	148	}	,
			{	194	,	165	,	207	}	,
			{	166	,	219	,	160	}	,
			{	0	,	136	,	55	}	},
		{	{	123	,	50	,	148	}	,
			{	194	,	165	,	207	}	,
			{	247	,	247	,	247	}	,
			{	166	,	219	,	160	}	,
			{	0	,	136	,	55	}	},
		{	{	118	,	42	,	131	}	,
			{	175	,	141	,	195	}	,
			{	231	,	212	,	232	}	,
			{	217	,	240	,	211	}	,
			{	127	,	191	,	123	}	,
			{	27	,	120	,	55	}	},
		{	{	118	,	42	,	131	}	,
			{	175	,	141	,	195	}	,
			{	231	,	212	,	232	}	,
			{	247	,	247	,	247	}	,
			{	217	,	240	,	211	}	,
			{	127	,	191	,	123	}	,
			{	27	,	120	,	55	}	},
		{	{	118	,	42	,	131	}	,
			{	153	,	112	,	171	}	,
			{	194	,	165	,	207	}	,
			{	231	,	212	,	232	}	,
			{	217	,	240	,	211	}	,
			{	166	,	219	,	160	}	,
			{	90	,	174	,	97	}	,
			{	27	,	120	,	55	}	},
		{	{	118	,	42	,	131	}	,
			{	153	,	112	,	171	}	,
			{	194	,	165	,	207	}	,
			{	231	,	212	,	232	}	,
			{	247	,	247	,	247	}	,
			{	217	,	240	,	211	}	,
			{	166	,	219	,	160	}	,
			{	90	,	174	,	97	}	,
			{	27	,	120	,	55	}	},
		{	{	64	,	0	,	75	}	,
			{	118	,	42	,	131	}	,
			{	153	,	112	,	171	}	,
			{	194	,	165	,	207	}	,
			{	231	,	212	,	232	}	,
			{	217	,	240	,	211	}	,
			{	166	,	219	,	160	}	,
			{	90	,	174	,	97	}	,
			{	27	,	120	,	55	}	,
			{	0	,	68	,	27	}	},
		{	{	64	,	0	,	75	}	,
			{	118	,	42	,	131	}	,
			{	153	,	112	,	171	}	,
			{	194	,	165	,	207	}	,
			{	231	,	212	,	232	}	,
			{	247	,	247	,	247	}	,
			{	217	,	240	,	211	}	,
			{	166	,	219	,	160	}	,
			{	90	,	174	,	97	}	,
			{	27	,	120	,	55	}	,
			{	0	,	68	,	27	}	}};	
	
	static final int 	PiYG	[][][] = {  									
		{	{	233	,	163	,	201	}	,
			{	247	,	247	,	247	}	,
			{	161	,	215	,	106	}	},
		{	{	208	,	28	,	139	}	,
			{	241	,	182	,	218	}	,
			{	184	,	225	,	134	}	,
			{	77	,	172	,	38	}	},
		{	{	208	,	28	,	139	}	,
			{	241	,	182	,	218	}	,
			{	247	,	247	,	247	}	,
			{	184	,	225	,	134	}	,
			{	77	,	172	,	38	}	},
		{	{	197	,	27	,	125	}	,
			{	233	,	163	,	201	}	,
			{	253	,	224	,	239	}	,
			{	230	,	245	,	208	}	,
			{	161	,	215	,	106	}	,
			{	77	,	146	,	33	}	},
		{	{	197	,	27	,	125	}	,
			{	233	,	163	,	201	}	,
			{	253	,	224	,	239	}	,
			{	247	,	247	,	247	}	,
			{	230	,	245	,	208	}	,
			{	161	,	215	,	106	}	,
			{	77	,	146	,	33	}	},
		{	{	197	,	27	,	125	}	,
			{	222	,	119	,	174	}	,
			{	241	,	182	,	218	}	,
			{	253	,	224	,	239	}	,
			{	230	,	245	,	208	}	,
			{	184	,	225	,	134	}	,
			{	127	,	188	,	65	}	,
			{	77	,	146	,	33	}	},
		{	{	197	,	27	,	125	}	,
			{	222	,	119	,	174	}	,
			{	241	,	182	,	218	}	,
			{	253	,	224	,	239	}	,
			{	247	,	247	,	247	}	,
			{	230	,	245	,	208	}	,
			{	184	,	225	,	134	}	,
			{	127	,	188	,	65	}	,
			{	77	,	146	,	33	}	},
		{	{	142	,	1	,	82	}	,
			{	197	,	27	,	125	}	,
			{	222	,	119	,	174	}	,
			{	241	,	182	,	218	}	,
			{	253	,	224	,	239	}	,
			{	230	,	245	,	208	}	,
			{	184	,	225	,	134	}	,
			{	127	,	188	,	65	}	,
			{	77	,	146	,	33	}	,
			{	39	,	100	,	25	}	},
		{	{	142	,	1	,	82	}	,
			{	197	,	27	,	125	}	,
			{	222	,	119	,	174	}	,
			{	241	,	182	,	218	}	,
			{	253	,	224	,	239	}	,
			{	247	,	247	,	247	}	,
			{	230	,	245	,	208	}	,
			{	184	,	225	,	134	}	,
			{	127	,	188	,	65	}	,
			{	77	,	146	,	33	}	,
			{	39	,	100	,	25	}	}};	
	
	static final int 	BrBG	[][][] = {  									
		{	{	216	,	179	,	101	}	,
			{	245	,	245	,	245	}	,
			{	90	,	180	,	172	}	},
		{	{	166	,	97	,	26	}	,
			{	223	,	194	,	125	}	,
			{	128	,	205	,	193	}	,
			{	1	,	133	,	113	}	},
		{	{	166	,	97	,	26	}	,
			{	223	,	194	,	125	}	,
			{	245	,	245	,	245	}	,
			{	128	,	205	,	193	}	,
			{	1	,	133	,	113	}	},
		{	{	140	,	81	,	10	}	,
			{	216	,	179	,	101	}	,
			{	246	,	232	,	195	}	,
			{	199	,	234	,	229	}	,
			{	90	,	180	,	172	}	,
			{	1	,	102	,	94	}	},
		{	{	140	,	81	,	10	}	,
			{	216	,	179	,	101	}	,
			{	246	,	232	,	195	}	,
			{	245	,	245	,	245	}	,
			{	199	,	234	,	229	}	,
			{	90	,	180	,	172	}	,
			{	1	,	102	,	94	}	},
		{	{	140	,	81	,	10	}	,
			{	191	,	129	,	45	}	,
			{	223	,	194	,	125	}	,
			{	246	,	232	,	195	}	,
			{	199	,	234	,	229	}	,
			{	128	,	205	,	193	}	,
			{	53	,	151	,	143	}	,
			{	1	,	102	,	94	}	},
		{	{	140	,	81	,	10	}	,
			{	191	,	129	,	45	}	,
			{	223	,	194	,	125	}	,
			{	246	,	232	,	195	}	,
			{	245	,	245	,	245	}	,
			{	199	,	234	,	229	}	,
			{	128	,	205	,	193	}	,
			{	53	,	151	,	143	}	,
			{	1	,	102	,	94	}	},
		{	{	84	,	48	,	5	}	,
			{	140	,	81	,	10	}	,
			{	191	,	129	,	45	}	,
			{	223	,	194	,	125	}	,
			{	246	,	232	,	195	}	,
			{	199	,	234	,	229	}	,
			{	128	,	205	,	193	}	,
			{	53	,	151	,	143	}	,
			{	1	,	102	,	94	}	,
			{	0	,	60	,	48	}	},
		{	{	84	,	48	,	5	}	,
			{	140	,	81	,	10	}	,
			{	191	,	129	,	45	}	,
			{	223	,	194	,	125	}	,
			{	246	,	232	,	195	}	,
			{	245	,	245	,	245	}	,
			{	199	,	234	,	229	}	,
			{	128	,	205	,	193	}	,
			{	53	,	151	,	143	}	,
			{	1	,	102	,	94	}	,
			{	0	,	60	,	48	}	}};

}

//Apache-Style Software License for ColorBrewer software and ColorBrewer Color Schemes								
//Version 1.1								
//
//Copyright (c) 2002 Cynthia Brewer, Mark Harrower, and The Pennsylvania State University. All rights reserved.								
//Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:								
//1. Redistributions as source code must retain the above copyright notice, this list of conditions and the following disclaimer.
//2. The end-user documentation included with the redistribution, if any, must include the following acknowledgment:
//This product includes color specifications and designs developed by Cynthia Brewer (http://colorbrewer.org/).
//Alternately, this acknowledgment may appear in the software itself, if and wherever such third-party acknowledgments normally appear.
//4. The name "ColorBrewer" must not be used to endorse or promote products derived from this software without prior written permission. For written permission, please 
//contact Cynthia Brewer at cbrewer@psu.edu.
//5. Products derived from this software may not be called "ColorBrewer", nor may "ColorBrewer" appear in their name, without prior written permission of Cynthia Brewer.
//
//THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF 
//MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL CYNTHIA BREWER, MARK HARROWER, OR THE 
//PENNSYLVANIA STATE UNIVERSITY BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
//CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY 
//WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.