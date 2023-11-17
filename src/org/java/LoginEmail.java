package org.java;

public class LoginEmail {
	private void textbox() {
		System.out.println("Text");
        System.out.println("passed");
	}
    private void failed() {
 System.out.println("tested case : 5");
	}
    private void passed() {
 System.out.println("test case : 6");
	}
public static void main(String[] args) {
	LoginEmail d= new LoginEmail();
	d.textbox();
	d.failed();
	d.passed();
}
}
