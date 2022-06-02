/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import model.Order;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrator
 */
public class OrderTest {
    
    public OrderTest() {

    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getOrderID method, of class Order.
     */
    @Test
    public void testGetOrderID() {
        System.out.println("getOrderID");
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        String expResult = "#1";
        String result = instance.getOrderID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrderID method, of class Order.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("setOrderID");
        String orderID = "#11";
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        instance.setOrderID(orderID);
        assertEquals(orderID, instance.getOrderID());
    }

    /**
     * Test of getStockTime method, of class Order.
     */
    @Test
    public void testGetStockTime() {
        System.out.println("getStockTime");
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        String expResult = "09:45";
        String result = instance.getStockTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStockTime method, of class Order.
     */
    @Test
    public void testSetStockTime() {
        System.out.println("setStockTime");
        String stockTime = "07:45";
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        instance.setStockTime(stockTime);
        assertEquals(stockTime, instance.getStockTime());
    }

    /**
     * Test of getStock method, of class Order.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        String expResult = "BAC";
        String result = instance.getStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStock method, of class Order.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        String stock = "BAC";
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        instance.setStock(stock);
        assertEquals(stock, instance.getStock());
    }

    /**
     * Test of getBuySell method, of class Order.
     */
    @Test
    public void testGetBuySell() {
        System.out.println("getBuySell");
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        String expResult = "sell";
        String result = instance.getBuySell();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBuySell method, of class Order.
     */
    @Test
    public void testSetBuySell() {
        System.out.println("setBuySell");
        String buySell = "buy";
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        instance.setBuySell(buySell);
        assertEquals(buySell, instance.getBuySell());
    }

    /**
     * Test of getPrice method, of class Order.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        double expResult = 240.12;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrice method, of class Order.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        instance.setPrice(price);
        assertEquals(0, instance.getPrice());
    }

    /**
     * Test of getQuantity method, of class Order.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        model.Order instance = new model.Order("#1","09:45", "BAC", "sell", 240.12, 100);
        int expResult = 100;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class Order.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 20;
        model.Order instance = new Order("#1","09:45", "BAC", "sell", 240.12, 100);
        instance.setQuantity(quantity);
        assertEquals(20, instance.getQuantity());
    }
    
}
