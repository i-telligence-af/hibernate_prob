package test.entity.email.foo;

import jakarta.persistence.*;
//import test.embeddable.AuditMetaData;
import test.entity.email.EmailRecipientEntity;

@Entity(name = "FooEmailRecipient")
@Table(name = "email_recipient__foo")
public class FooEmailRecipientEntity extends EmailRecipientEntity {

    // comment out to isolate error
    @Column(name = "user_id")
    protected Long userId;

    // comment out to isolate error
    //@ManyToOne(fetch = FetchType.LAZY, targetEntity= FooEmailEntity.class, optional=false)
    //protected FooEmailEntity email;

    // comment out to isolate error
    //@Embedded
    //protected AuditMetaData auditMetaData = new AuditMetaData();

    public FooEmailRecipientEntity() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
    public FooEmailEntity getEmail() {
        return email;
    }

    public void setEmail(FooEmailEntity email) {
        this.email = email;
    }
     */

    /**
    public AuditMetaData getAuditMetaData() {
        return auditMetaData;
    }

    public void setAuditMetaData(AuditMetaData auditMetaData) {
        this.auditMetaData = auditMetaData;
    }
     */
}
