
public class client {
	private String msg;
	private boolean flag;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public void sendSynMsg(server server){
		while(!(server.setPool(server.getPool()+msg))){}
		this.flag = true;
	}
	public void sendAsynMsg(server server){
		server.setPool(server.getPool()+msg);
		this.flag = true;
	}
	public void newMsg(String msg){
		this.msg = msg;
		this.flag = false;
	}
}
