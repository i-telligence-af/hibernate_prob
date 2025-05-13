//package test.entity.email.foo;
//
//import jakarta.persistence.*;
//import org.hibernate.envers.Audited;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import test.embeddable.AuditMetaData;
//import test.entity.email.EmailEntity;
//
//import java.util.Set;
//
//@Entity(name = "FooEmail")
//@Table(name = "email__foo")
//@Audited
//@EntityListeners(AuditingEntityListener.class)
//public class FooEmailEntity extends EmailEntity {
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "email", targetEntity= FooEmailRecipientEntity.class)
//    protected Set<FooEmailRecipientEntity> recipients;
//
//    @Embedded
//    protected AuditMetaData auditMetaData = new AuditMetaData();
//
//    public FooEmailEntity() {
//        super();
//    }
//
//    public Set<FooEmailRecipientEntity> getRecipients() {
//        return recipients;
//    }
//
//    public void setRecipients(Set<FooEmailRecipientEntity> recipients) {
//        this.recipients = recipients;
//    }
//
//    public AuditMetaData getAuditMetaData() {
//        return auditMetaData;
//    }
//
//    public void setAuditMetaData(AuditMetaData auditMetaData) {
//        this.auditMetaData = auditMetaData;
//    }
//}
