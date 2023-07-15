abstract class LibraryItem {
 private String title;
 private String itemID;
 private boolean checkOut;


public LibraryItem(String title,String itemID){
	this.title = title;
	this.itemID = itemID;
}
public String getTitle(){
	return title;
}

public String getItemID(){
	return itemID;
}
public void setTitle(String title){
	this.title = title;
}	
public void setItemID(String itemID){
	this.itemID = itemID;
}

public void checkOut(){
	this.checkOut = false;
}
public void checkIn(){
		this. checkOut = true;
}		
 
public void displayItemDetails(){
	System.out.println("Book title: " +title);
	System.out.println("ItemID: " +itemID);
	System.out.println("CheckOut: " +checkOut);
}
}

