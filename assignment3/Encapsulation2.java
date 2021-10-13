//assignment 3 - encapsulation example 2

class Television{
	private int channelNo;
	private String channelName;
	private int volume;
	
	//getters
	public int getChannelNo(){
		return channelNo;
	}
	
	public String getChannelName(){
		return channelName;
	}
	
	public int getVolume(){
		return volume;
	}
	
	//setters
	public void setChannelNo(int channelNo){
		this.channelNo=channelNo;
	}
	
	public void setChannelName(String channelName){
		this.channelName=channelName;
	}
	
	public void setVolume(int volume){
		this.volume=volume;
	}
	
	
}

public class Encapsulation2{
	public static void main(String[] args){
		Television c1=new Television();
		c1.setChannelNo(5);
		c1.setChannelName("ITN");
		c1.setVolume(12);
		
		System.out.println("Channel number: "+c1.getChannelNo());
		System.out.println("Channel name: "+c1.getChannelName());
		System.out.println("Volume: "+c1.getVolume());
		
		
		System.out.println();
		Television c2=new Television();
		c2.setChannelNo(4);
		c2.setChannelName("Hiru TV");
		c2.setVolume(10);
		
		System.out.println("Channel number: "+c2.getChannelNo());
		System.out.println("Channel name: "+c2.getChannelName());
		System.out.println("Volume: "+c2.getVolume());
		
		
	} 
	
}