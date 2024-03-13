class Core2web2{
        int NoCourse = 10;
        private String FouCourse = "cpp";
        void display(){
                System.out.println(NoCourse);
                System.out.println(FouCourse);

                }
}
class Student{
        public static void main(String [] args){
                Core2web obj = new Core2web();
                obj.display();
		System.out.println(obj.NoCourse);
                System.out.println(obj.FouCourse);
        }
}

