package service;

import model.Order;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
    public OrderService(String filename){
        ArrayList<Order> orderBook = new ArrayList<>(); // orderbook.

            try {
                File file = new File(filename);
                Scanner inp = new Scanner(file); // creating file object
                while (inp.hasNextLine()) {
                    String ord = inp.nextLine();
                    String[] data = ord.split(" "); // tokenizing input on space
                    if (data.length == 6) {
                        String id = data[0];
                        String time = data[1];
                        String stock = data[2];
                        String buySell = data[3];
                        double price = Double.parseDouble(data[4]);
                        int qty = Integer.parseInt(data[5]);

                        for (int i = 0; i < orderBook.size(); i++) {
                            if (buySell.equalsIgnoreCase("Buy")) { // when incomming order is of buy type
                                if (orderBook.get(i).getBuySell().equalsIgnoreCase("Sell")) { // when array order is of sell type
                                    if (price >= orderBook.get(i).getPrice()) { // buy order price should be less than equal to sell order price
                                        if (qty != 0 && orderBook.get(i).getQuantity() != 0) { // qty of both sell and buy order should be non zero.
                                            if (qty <= orderBook.get(i).getQuantity()) {  // checking sell order has enough qty
                                                System.out.println(id + " " + orderBook.get(i).getPrice() + " " + orderBook.get(i).getQuantity() + " " + orderBook.get(i).getOrderID());
                                                orderBook.get(i).setQuantity(orderBook.get(i).getQuantity() - qty);
                                            } else if (orderBook.get(i).getQuantity() <= qty) { // if sell order has less qty to buy.
                                                System.out.println(id + " " + orderBook.get(i).getPrice() + " " + orderBook.get(i).getQuantity() + " " + orderBook.get(i).getOrderID());
                                                qty = qty - orderBook.get(i).getQuantity(); // updating sell order quantity
                                                orderBook.get(i).setQuantity(0); // updating buy order quantity

                                            }
                                        }
                                    }
                                }
                            } else { // when incomming order is of sell type
                                if (orderBook.get(i).getBuySell().equalsIgnoreCase("Buy")) {  // when array order is of buy type
                                    if (orderBook.get(i).getPrice() >= price) {  // buy order price should be less than equal to sell order price
                                        if (qty != 0 && orderBook.get(i).getQuantity() != 0) { // qty of both sell and buy order should be non zero.
                                            if (qty <= orderBook.get(i).getQuantity()) { // checking buy order has enough qty
                                                System.out.println(orderBook.get(i).getOrderID() + " " + price + " " + qty + " " + id);
                                                orderBook.get(i).setQuantity(orderBook.get(i).getQuantity() - qty);
                                            } else if (orderBook.get(i).getQuantity() <= qty) { // if buy order has less qty to sell.
                                                System.out.println(orderBook.get(i).getOrderID() + " " + price + " " + qty + " " + id);
                                                qty = qty - orderBook.get(i).getQuantity(); // updating buy order quantity
                                                orderBook.get(i).setQuantity(0); // updating sell order quantity
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        orderBook.add(new Order(id, stock, stock, buySell, price, qty));
                    } else {
                        System.out.println("Invalid input.");
                    }
                }
                inp.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");

            }


    }
}
