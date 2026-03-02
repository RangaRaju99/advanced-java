package com.lpu.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.entity.Categories;
import com.lpu.entity.Customer;
import com.lpu.entity.Delivery;
import com.lpu.entity.Orders;
import com.lpu.entity.Products;
import com.lpu.service.CategoryService;
import com.lpu.service.CustomerService;
import com.lpu.service.DeliveryService;
import com.lpu.service.OrderService;
import com.lpu.service.ProductService;



public class MainController {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        CustomerService customerService = ctx.getBean(CustomerService.class);
        ProductService productService = ctx.getBean(ProductService.class);
        CategoryService categoryService = ctx.getBean(CategoryService.class);
        OrderService orderService = ctx.getBean(OrderService.class);
        DeliveryService deliveryService = ctx.getBean(DeliveryService.class);

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n==== E-COMMERCE MENU ====");
            System.out.println("1. Add Category");
            System.out.println("2. Add Product");
            System.out.println("3. Add Customer");
            System.out.println("4. Place Order");
            System.out.println("5. View Customers");
            System.out.println("6. View Orders");
            System.out.println("7. Delete Customer");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                // ======================
                // ADD CATEGORY
                // ======================
                case 1:
                    System.out.println("Category ID:");
                    int cid=sc.nextInt(); sc.nextLine();

                    System.out.println("Category Name:");
                    String cname=sc.nextLine();

                    System.out.println("Category Type:");
                    String ctype=sc.nextLine();

                    Categories cat = new Categories(cid,cname,ctype);
                    categoryService.saveCategory(cat);

                    System.out.println("Category saved!");
                    break;

                // ======================
                // ADD PRODUCT
                // ======================
                case 2:
                    System.out.println("Product ID:");
                    int pid=sc.nextInt(); sc.nextLine();

                    System.out.println("Product Name:");
                    String pname=sc.nextLine();

                    System.out.println("Enter Category ID:");
                    int pcid=sc.nextInt();

                    Categories pcat = categoryService.getCategory(pcid);

                    Products p=new Products(pid,pname);
                    p.setCategory(pcat);

                    productService.saveProduct(p);
                    System.out.println("Product saved!");
                    break;

                // ======================
                // ADD CUSTOMER
                // ======================
                case 3:
                    System.out.println("Customer ID:");
                    int custId=sc.nextInt(); sc.nextLine();

                    System.out.println("Name:");
                    String nm=sc.nextLine();

                    System.out.println("Email:");
                    String em=sc.nextLine();

                    System.out.println("Address:");
                    String addr=sc.nextLine();

                    Customer cust=new Customer(custId,nm,em,addr);
                    customerService.saveCustomer(cust);

                    System.out.println("Customer saved!");
                    break;

                // ======================
                // PLACE ORDER
                // ======================
                case 4:

                    System.out.println("Order ID:");
                    int oid=sc.nextInt();

                    System.out.println("Customer ID:");
                    int ocid=sc.nextInt();

                    Customer ocust = customerService.getCustomer(ocid);

                    System.out.println("Delivery ID:");
                    int did=sc.nextInt(); sc.nextLine();

                    System.out.println("Delivery Type:");
                    String dtype=sc.nextLine();

                    System.out.println("Delivery Status:");
                    String dstatus=sc.nextLine();

                    Delivery del=new Delivery(did,dtype,dstatus);
                    deliveryService.saveDelivery(del);

                    Orders order=new Orders(oid,LocalDate.now());
                    order.setCustomer(ocust);
                    order.setDelivery(del);

                    List<Products> prods=new ArrayList<>();

                    System.out.println("How many products?");
                    int count=sc.nextInt();

                    for(int i=0;i<count;i++){
                        System.out.println("Enter Product ID:");
                        int prid=sc.nextInt();
                        prods.add(productService.getProduct(prid));
                    }

                    order.setProductList(prods);
                    orderService.saveOrder(order);

                    System.out.println("Order placed!");
                    break;

                // ======================
                // VIEW CUSTOMERS
                // ======================
                case 5:
                    customerService.getAllCustomers()
                            .forEach(System.out::println);
                    break;

                // ======================
                // VIEW ORDERS
                // ======================
                case 6:
                    orderService.getOrdersWithProducts()
                            .forEach(System.out::println);
                    break;

                // ======================
                // DELETE CUSTOMER
                // ======================
                case 7:
                    System.out.println("Enter customer id:");
                    int delId=sc.nextInt();
                    customerService.deleteCustomer(delId);
                    System.out.println("Customer deleted");
                    break;

                case 0:
                    System.out.println("Bye Hacker 👋");
                    System.exit(0);
            }
        }
    }
}