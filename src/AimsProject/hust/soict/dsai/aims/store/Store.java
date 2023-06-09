package AimsProject.hust.soict.dsai.aims.store;
import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[1000];
	public void addDVD(DigitalVideoDisc dvd) {
		for (int i = 0;i< itemsInStore.length;i++) {
			if (itemsInStore[i] == null) {
				itemsInStore[i] = dvd;
				System.out.println("Added disc!");
				break;
			}
		}
	}
	public void addDVD(DigitalVideoDisc...dvds){
		int k = 0;
		for (int i = 0;i< itemsInStore.length;i++) {
			if (itemsInStore[i] == null){
				itemsInStore[i] = dvds[k];
				System.out.println("Added disc!");
		
				if (k == (dvds.length-1)){
					
					break;
				}
				k++;
				}
			}
		}

	public void removeDVD(DigitalVideoDisc disc) {
		int numOfDvd = 0;
		boolean check = true;
		
		DigitalVideoDisc copy[] = new DigitalVideoDisc[100];
			
		for (int i = 0;i<itemsInStore.length;i++) {
			if (itemsInStore[i] != null) {
				numOfDvd+=1;
			}
		}
		if (numOfDvd == 0) {
			System.out.println("There is no disc!");
			return;
		}
		
		for (int i = 0; i<itemsInStore.length;i++) {
			if (itemsInStore[i] == disc) {
				check = false;
				itemsInStore[i] = null;
				numOfDvd -=1;
				for (int j = 0,k=0;j<copy.length;j++) {
					if (itemsInStore[j] != null) {
						copy[k++] = itemsInStore[j];
					}
				}
				itemsInStore = copy;
				System.out.println("The disc is removed!");
				break;
				}
			}
		if (check == true) {
			System.out.println("Cannot found this disc!");
		}
	}
}