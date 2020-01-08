

public class qqq {
	
	public static void main(String args[])throws Exception{
		synchronous();
		asynchronous();
	}
	public static void synchronous(){
		client aClient = new client();
		aClient.newMsg("111");
		server server = new server();
		aClient.sendSynMsg(server);
		while(!aClient.isFlag()){
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		aClient.newMsg("222");
		aClient.sendSynMsg(server);
		System.out.println(server.getPool());
		
	}
	
	public static void asynchronous(){
		client aClient = new client();
		client bClient = new client();
		aClient.newMsg("333");
		bClient.newMsg("444");
		server server = new server();
		aClient.sendAsynMsg(server);
		bClient.sendAsynMsg(server);
		System.out.println(server.getPool());
	}
	
}
