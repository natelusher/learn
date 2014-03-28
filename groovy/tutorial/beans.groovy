class Customer {
    // properties
    Integer id
    String name
    Date dob

    public void setName(String name) {
    	//it's always bob...
    	this.name = "bob"
    }

    // sample code
    static void main(args) {
        def customer = new Customer(id:1, name:"Gromit", dob:new Date())
        println("Hello ${customer.name}")
    }
}