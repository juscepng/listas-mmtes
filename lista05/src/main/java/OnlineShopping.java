public class OnlineShopping {
    public class Account {
        public String id;
        public String billing_address;
        public boolean is_closed;
        public String open;
        public String closed;
    }

    public class WebUser {
        public String login_id;
        public String password;
        public UserState state;
    }

    public class Customer {
        public String id;
        public String adress;
        public String phone;
        public String email;
    }


    public class ShoppingCart {
        public String created;
    }

    public class LineItem {
        public int quantity;
        public double price;
    }

    public class Product {
        public String id;
        public String name;
        public String supplier;
    }

    public class Order {
        public String id;
        public String ordered;
        public String shipped;
        public String ship_to;
        public OrderStatus status;
        public String total;
    }

    public class Payment {
        public String id;
        public String paid;
        public String total;
        public String details;
    }

    //Enum
    public enum UserState {
        New, Active, Blocked, Banned;
    }

    public enum OrderStatus {
        New, Hold, Shipped, Delivered, Closed;
    }
}
