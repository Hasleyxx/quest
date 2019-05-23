package qis.Cashier;

import javax.persistence.*;

@Entity @Table(name="qpd_trans")
public class Cashier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;

    @Column(name="PatientID")
    private String patientId;
    @Column(name="TransactionRef")
    private String transactionRef;
    @Column(name="TransactionType")
    private String transactionType;
   // private String itemId;
    private String biller;
    @Column(name="TransactionDate")
    private String transactionDate;
	@Column(name="LastName")
    private String lastName;
    @Column(name="FirstName")
    private String firstName;
    @Column(name="MiddleName")
    private String middleName;
    @Column(name="fullname")
    private String fullname;

    public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
    public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionRef() {
		return transactionRef;
	}

	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}

	public String getBiller() {
		return biller;
	}

	public void setBiller(String biller) {
		this.biller = biller;
	}

	public Cashier() {  }

    public Cashier(String patientId, String transactionRef, String transactionType, String biller, String transactionDate, String lastName, String firstName, String middleName, String fullName)
    {
    	this.setPatientId(patientId);
        this.setTransactionRef(transactionRef);
        this.setTransactionType(transactionType);
        this.setBiller(biller);
        this.setTransactionDate(transactionDate);
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setFullname(fullName);
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int id) {
        this.transactionId = id;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String title) {
        this.transactionType = title;
    }

//    public String getItemId() {
//        return itemId;
//    }
//
//    public void setItemId(String content) {
//        this.itemId = content;
//    }

    public String fullName()
    {
    	String fullname = lastName + ", " + firstName + " " + middleName;
    	return fullname;
    }
    
    @Override
    public String toString() {
    	String fullname = fullName();
        return "Cashier{" +
                "TransactionID=" + transactionId +
                "PatientID=" + patientId +
                ", PatientName='" + fullname + '\'' +
                ", TransactionRef='" + transactionRef + '\'' +
                ", TransactionType='" + transactionType + '\'' +
               // ", ItemID='" + itemId + '\'' +
                ", Biller='" + biller + '\'' +
                ", TransactionDate='" + transactionDate + '\'' +
                '}';
    }
}
