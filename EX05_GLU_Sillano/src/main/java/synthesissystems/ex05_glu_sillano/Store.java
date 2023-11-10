//Gl27 Sillano

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    earnings = 0;
    
    itemList = new ArrayList<>();
    storeList.add(this);
    
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if(itemList.size() >= index + 1) {
        Item item = itemList.get(index);
        earnings += item.getCost();
        System.out.println("Sale complete. " + item.getName() + " was sold.");
    }  else {
        System.out.println("There are only " + Integer.toString(itemList.size()) + " items in the store " + name + ".");
    }
      
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    for (Item item : itemList) {
        if(item.getName() == name) {
            earnings += item.getCost();
            System.out.println("Sale complete. " + item.getName() + " was sold.");
        }
    }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    if(itemList.contains(i)) {
        earnings += i.getCost();
        System.out.println("Sale complete. " + i.getName() + " was sold.");
    }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    itemList.add(i);
  }
  public void filterType(String type){
    for (Item item : itemList) {
        if(item.getType() == type) {
            System.out.println(item.getName());
        }
    }
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
    for (Item item : itemList) {
        if(item.getCost() <= maxCost) {
            System.out.println(item.getName());
        }
    }
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
    for (Item item : itemList) {
        if(item.getCost() >= minCost) {
            System.out.println(item.getName());
        }
    }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    for (Store store : storeList) {
        System.out.println(store.getName() + "'s earnings are: " + Double.toString(store.getEarnings()));
    }
    // loop over storeList and print the name and the earnings'Store.java'
  }
}
