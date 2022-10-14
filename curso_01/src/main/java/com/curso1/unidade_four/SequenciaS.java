package com.curso1.unidade_four;

public class SequenciaS {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		
		int s[] = new int[5];
		s[0] = 1;		
		for(int i =2; i<=10000; i++) {
			s[0] = s[0] + 3;
            switch (i) {
                case 9 -> s[1] = s[0];
                case 10 -> s[2] = s[0];
                case 100 -> s[3] = s[0];
                case 1000 -> s[4] = s[0];
            }
		}
		System.out.println("S9="+s[1]);
		System.out.println("S10="+s[2]);
		System.out.println("S100="+s[3]);
		System.out.println("S10000="+s[4]);		
	}
}
