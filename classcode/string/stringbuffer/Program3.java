class StringBuf3{
        public static void main(String [] args){
                //StringBuffer str1 = "shashi";
		StringBuffer str2 = new StringBuffer ("COre2web");
                System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		str2.append(" Class");
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));

        }
}
// Hence Prove StringBuffer is changeable
