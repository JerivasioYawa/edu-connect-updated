package za.ac.cput.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {

    private Long paymentId;

    private Long sessionId;
    private BigDecimal amount;
    private BigDecimal tutorEarnings;

    private BigDecimal platformFee;
    private PaymentStatus status;

    private LocalDateTime paidAt;

    private String paymentMethod;

    private Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.sessionId = builder.sessionId;
        this.amount = builder.amount;
        this.tutorEarnings = builder.tutorEarnings;
        this.platformFee = builder.platformFee;
        this.status = builder.status;
        this.paidAt = builder.paidAt;
        this.paymentMethod = builder.paymentMethod;

    }

    public Long getPaymentId() {
        return paymentId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getTutorEarnings() {
        return tutorEarnings;
    }

    public BigDecimal getPlatformFee() {
        return platformFee;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public LocalDateTime getPaidAt() {
        return paidAt;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public enum  PaymentStatus {
        PENDING,
        PAID,
        REFUNDED,
        FAILED
    }
    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", sessionId=" + sessionId +
                ", amount=" + amount +
                ", tutorEarnings=" + tutorEarnings +
                ", platformFee=" + platformFee +
                ", status=" + status +
                ", paidAt=" + paidAt +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public static class Builder {
        private Long paymentId;
        private Long sessionId;
        private BigDecimal amount;
        private BigDecimal tutorEarnings;
        private BigDecimal platformFee;
        private PaymentStatus status;
        private LocalDateTime paidAt;
        private String paymentMethod;

        public Builder setPaymentId(Long paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public Builder setAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder setTutorEarnings(BigDecimal tutorEarnings) {
            this.tutorEarnings = tutorEarnings;
            return this;
        }

        public Builder setPlatformFee(BigDecimal platformFee) {
            this.platformFee = platformFee;
            return this;
        }

        public Builder setStatus(PaymentStatus status) {
            this.status = status;
            return this;
        }

        public Builder setPaidAt(LocalDateTime paidAt) {
            this.paidAt = paidAt;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder copy(Payment payment) {
            this.paymentId = payment.paymentId;
            this.sessionId = payment.sessionId;
            this.amount = payment.amount;
            this.tutorEarnings = payment.tutorEarnings;
            this.platformFee = payment.platformFee;
            this.status = payment.status;
            this.paidAt = payment.paidAt;
            this.paymentMethod = payment.paymentMethod;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
