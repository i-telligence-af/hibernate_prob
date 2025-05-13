package test.entity.email;

//import test.embeddable.AuditMetaData;
import jakarta.persistence.*;
@Entity(name = "EmailRecipient")
@Table(name = "email_recipient")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EmailRecipientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(name="email_address")
    //@Transient
    protected String emailAddress;

    // comment out to isolate error
    //@Version
    //protected Long version;

    // comment out to isolate error
    //@Embedded
    //protected AuditMetaData baseAuditMetaData = new AuditMetaData();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
     */

    /**
    public AuditMetaData getBaseAuditMetaData() {
        return baseAuditMetaData;
    }

    public void setBaseAuditMetaData(AuditMetaData baseAuditMetaData) {
        this.baseAuditMetaData = baseAuditMetaData;
    }
     */

}
