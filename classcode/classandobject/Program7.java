class Project{
        int NoEmp = 20;
        String ProName = "Online Education";
        void ClientInfo(){
                String ClientName = "Core2web";
		System.out.println(ClientName);
		System.out.println(ProName);

        }
        public static void main(String [] args){
                Project obj = new Project();
		obj.ClientInfo();
        }
}
