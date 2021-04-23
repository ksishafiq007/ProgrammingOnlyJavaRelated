package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactApp {

	public static void main(String[] args) {

		List<Contact> contactList2 = Arrays.asList(new Contact("ksi shafiq", "ksi@gmail.com", 50, Contact.Gender.MALE),
				new Contact("dipa hasan", "dip", 60, Contact.Gender.FEMALE),
				new Contact("mahin riko", "mahin@gmail.com", 10, Contact.Gender.MALE),
				new Contact("nirmal shanto", "nirmol@gmail.com", 23, Contact.Gender.MALE),
				new Contact("Suma kanti", "nirmol@gmail.com", 25, Contact.Gender.FEMALE));

		Contact c1 = new Contact("ksi shafiq", "ksi@gmail.com", 50, Contact.Gender.MALE);
		Contact c2 = new Contact("dipa hasan", "dip", 60, Contact.Gender.FEMALE);
		Contact c3 = new Contact("mahin riko", "mahin@gmail.com", 10, Contact.Gender.MALE);
		Contact c4 = new Contact("nirmal shanto", "nirmol@gmail.com", 23, Contact.Gender.MALE);
		Contact c5 = new Contact("Suma kanti", "nirmol@gmail.com", 25, Contact.Gender.FEMALE);
		List<Contact> contactList = new ArrayList<Contact>();
		contactList.add(c1);
		contactList.add(c2);
		contactList.add(c3);
		contactList.add(c4);
		contactList.add(c5);

		ContactService contactService = new ContactService();
		List<Contact> contactAged18To25Female = contactService.findContacts(contactList, new FilterCriteria() {
			@Override
			public boolean match(Contact contact) {
				return 18 <= contact.getAge() && contact.getAge() <= 25 && contact.getGender() == Contact.Gender.FEMALE;
			}
		});
		System.out.println("################# check ############# " + contactAged18To25Female.size());

		List<Contact> contactAged18To25Female2 = contactService.findContacts(contactList2, new FilterCriteria() {
			@Override
			public boolean match(Contact contact) {
				return 18 <= contact.getAge() && contact.getAge() <= 25;
			}
		});
		System.out.println("################# check ############# " + contactAged18To25Female2.size());

	}

}
