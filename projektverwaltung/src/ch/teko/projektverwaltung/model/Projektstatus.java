/**
 * 
 */
package ch.teko.projektverwaltung.model;

/**
 * Helfer Klasse um Status zu setzen, wird als Dropdown dargestellt, in der DB sind die Werte 0-2 abgelegt
 * @author Fabian
 *
 */
public enum Projektstatus {
	OFFEN(0), BEWILLIGT(1), ABGELEHNT(2);
	private int status;
	private String statusAsString;

	private Projektstatus(int state) {
		this.status = state;
	}
	
	public int getStatus() {
		return status;
	}

	public String getStatusAsString() {
		switch (status) {
		case 0:
			this.statusAsString = "Offen";
			break;
		case 1:
			this.statusAsString = "Bewilligt";
			break;
		case 2:
			this.statusAsString = "Abgelehnt";
			break;

		default:
			break;
		}

		return this.statusAsString;
	}

	@Override
	public String toString() {
		switch (this) {
		case OFFEN:
			this.statusAsString = "Offen";
			break;
		case BEWILLIGT:
			this.statusAsString = "Bewilligt";
			break;
		case ABGELEHNT:
			this.statusAsString = "Abgelehnt";
			break;
		
		}
		return this.statusAsString;
	};

}
