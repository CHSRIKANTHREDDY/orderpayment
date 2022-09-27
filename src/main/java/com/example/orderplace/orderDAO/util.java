package com.example.orderplace.orderDAO;

import java.util.List;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderplace.entity.Account;
import com.example.orderplace.entity.Order1;
import com.example.orderplace.entity.User;
import com.example.orderplace.entity.product;
import com.example.orderplace.repository.AccountRepository;
import com.example.orderplace.repository.OrderRepository;
import com.example.orderplace.repository.UserRepository;
import com.example.orderplace.repository.productRepository;

@Service
public class util {
	
	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private productRepository prorepository;
	
	@Autowired
	private OrderRepository ordrepo;
	
	@Autowired
	private AccountRepository accrepo; 

	public orderDAO methods(Long userId, Long productId) {
		
		User user=userrepository.findById(userId).get();
		
		product pro=prorepository.findById(productId).get();
		
		System.out.println("product data"+pro);
		int f=0;
		double bill = pro.getAmount();
		List<Account> acc = user.getAcc();
		
//		List<Account> l2=acc.stream().filter(i->i.getAmount()).collect(Collector.toList());
//		System.out.println("stream data",+ l2);
		for(int i=0;i<acc.size();i++) {
			if (acc.get(i).getAmount()>=bill) {
				
				System.out.println("***********************************************************************************");
                
				System.out.println("      ACCOUNT_ID:-  "+acc.get(i).getAccountId());
				System.out.println("      BANKNAME:-  "+acc.get(i).getBankName());
				System.out.println("      AMOUNT:-  "+pro.getAmount());
				System.out.println("      Status:-  "+"success");
				
				Long aid=acc.get(i).getAccountId();
				double amt=pro.getAmount();
				Order1 ss= new Order1();
				ss.setAccId(acc.get(i).getAccountId());
				ss.setBankName(acc.get(i).getBankName());
				ss.setAmount(pro.getAmount());
				ss.setStatus("paid");
				ordrepo.save(ss);
				System.out.println("going into payment method");
				paymentupdate(aid,amt);
				
				break;
			}
			else
			{
			 f++;
			}
		}
		if(f==acc.size())
		{
			
			System.out.println("***********************************************************************************");

			System.out.println("insufficient amount");
		}
	
		return null;
		
	}
	
	
	
	
	
	public void paymentupdate(long AccountId,double amt) {
		
		Account ac=accrepo.findById(AccountId).get();
		double update=ac.getAmount()-amt;
		System.out.println("updated amount :-"+update);

		System.out.println("updated amount :-"+ac);
		
		
		
		ac.setAmount(update);
		accrepo.save(ac); 
		
		
		
	}
	
	

}
