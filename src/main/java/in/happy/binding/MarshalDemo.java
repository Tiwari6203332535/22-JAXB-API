package in.happy.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshalDemo {
	public static void main(String[] args) throws Exception {
		Customer c = new Customer();
		c.setId(101);
		c.setName("happy");
		c.setEmail("tiwari95874@gmail.com");
		c.setPhon(06203332535);
		
		    JAXBContext context = JAXBContext.newInstance(Customer.class);
		    
		    Marshaller marshaller = context.createMarshaller();
		    marshaller.marshal(c,new File("customer.xml"));
		    System.out.println("xml file created");
		    
		    
		   
		    
		    
	}

}
