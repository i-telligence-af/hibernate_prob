//package test.embeddable;
//
//import jakarta.persistence.Embeddable;
//import org.springframework.data.annotation.*;
//
//import java.time.Instant;
//
//@AccessType(AccessType.Type.FIELD)
//@Embeddable
//public class AuditMetaData implements AuditMetaDataInterface {
//
//    @CreatedBy
//    private Long createdBy;
//
//    @LastModifiedBy
//    private Long lastModifiedBy;
//
//    @CreatedDate
//    private Instant createdDate;
//
//    @LastModifiedDate
//    private Instant lastModifiedDate;
//
//    @Override
//    public Long getCreatedBy() {
//        return createdBy;
//    }
//
//    @Override
//    public void setCreatedBy(Long createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    @Override
//    public Long getLastModifiedBy() {
//        return lastModifiedBy;
//    }
//
//    @Override
//    public void setLastModifiedBy(Long lastModifiedBy) {
//        this.lastModifiedBy = lastModifiedBy;
//    }
//
//    @Override
//    public Instant getCreatedDate() {
//        return createdDate;
//    }
//
//    @Override
//    public void setCreatedDate(Instant createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    @Override
//    public Instant getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    @Override
//    public void setLastModifiedDate(Instant lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }
//}
