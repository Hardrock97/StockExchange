
import model.Order;
import service.OrderService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        if (args.length == 1) {
            OrderService os = new OrderService(args[0]);
        } else {
            System.out.println("Please provide file name.");
        }
    }
}

