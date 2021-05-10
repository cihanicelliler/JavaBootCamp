package core.concretes;

import java.util.Scanner;

import core.abstracts.UserVerifyService;

public class UserVerifyCode implements UserVerifyService{

	@Override
	public boolean userVerify() {
		int realCode = (int)(100*Math.random()*329);
		System.out.println("Your system verification code: "+realCode);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the verification code: ");
		int inputCode = input.nextInt();
		
		if(realCode==inputCode) {
			return true;
		}
		
		return false;
	}

}

