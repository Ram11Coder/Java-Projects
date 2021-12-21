

public class Users {

	private String yourName;
	private String partnerName;
	private String RelationStatus;

	public Users(String yourName, String partnerName) {

		this.yourName = yourName;
		this.partnerName = partnerName;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Users [yourName=" + yourName + ", partnerName=" + partnerName + "]";
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getRelationStatus() {
		return RelationStatus;
	}

	public void setRelationStatus(String RelationStatus) {
		this.RelationStatus = RelationStatus;
	}

}
