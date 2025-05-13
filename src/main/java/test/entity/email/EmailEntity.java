package test.entity.email;

import jakarta.persistence.*;

@Entity(name = "Email")
@Table(name = "email")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EmailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    // comment out to isolate error
    //@Version
    //protected Long version;

    @Column(name="subject")
    protected String subject;

    // comment out to isolate error
    //@Embedded
    //protected AuditMetaData baseAuditMetaData = new AuditMetaData();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
     */

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
    public AuditMetaData getBaseAuditMetaData() {
        return baseAuditMetaData;
    }

    public void setBaseAuditMetaData(AuditMetaData baseAuditMetaData) {
        this.baseAuditMetaData = baseAuditMetaData;
    }
     */
}
