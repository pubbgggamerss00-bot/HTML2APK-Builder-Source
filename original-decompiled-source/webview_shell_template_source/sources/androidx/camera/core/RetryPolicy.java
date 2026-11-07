package androidx.camera.core;

import androidx.camera.core.impl.CameraProviderInitRetryPolicy;
import androidx.camera.core.impl.RetryPolicyInternal;
import androidx.camera.core.impl.TimeoutRetryPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@ExperimentalRetryPolicy
/* loaded from: classes.dex */
public interface RetryPolicy {
    public static final long DEFAULT_RETRY_TIMEOUT_IN_MILLIS = 6000;
    public static final RetryPolicy NEVER = new a0();
    public static final RetryPolicy DEFAULT = new CameraProviderInitRetryPolicy.Legacy(getDefaultRetryTimeoutInMillis());
    public static final RetryPolicy RETRY_UNAVAILABLE_CAMERA = new CameraProviderInitRetryPolicy(getDefaultRetryTimeoutInMillis());

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @ExperimentalRetryPolicy
    public static final class Builder {
        private final RetryPolicy mBasePolicy;
        private long mTimeoutInMillis;

        public Builder(RetryPolicy retryPolicy) {
            this.mBasePolicy = retryPolicy;
            this.mTimeoutInMillis = retryPolicy.getTimeoutInMillis();
        }

        public RetryPolicy build() {
            RetryPolicy retryPolicy = this.mBasePolicy;
            return retryPolicy instanceof RetryPolicyInternal ? ((RetryPolicyInternal) retryPolicy).copy(this.mTimeoutInMillis) : new TimeoutRetryPolicy(this.mTimeoutInMillis, this.mBasePolicy);
        }

        public Builder setTimeoutInMillis(long j6) {
            this.mTimeoutInMillis = j6;
            return this;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @ExperimentalRetryPolicy
    public interface ExecutionState {
        public static final int STATUS_CAMERA_UNAVAILABLE = 2;
        public static final int STATUS_CONFIGURATION_FAIL = 1;
        public static final int STATUS_UNKNOWN_ERROR = 0;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
        }

        Throwable getCause();

        long getExecutedTimeInMillis();

        int getNumOfAttempts();

        int getStatus();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @ExperimentalRetryPolicy
    public static final class RetryConfig {
        private static final long DEFAULT_DELAY_MILLIS = 500;
        private final boolean mCompleteWithoutFailure;
        private final long mDelayInMillis;
        private final boolean mShouldRetry;
        public static final RetryConfig NOT_RETRY = new RetryConfig(false, 0);
        public static final RetryConfig DEFAULT_DELAY_RETRY = new RetryConfig(true);
        private static final long MINI_DELAY_MILLIS = 100;
        public static final RetryConfig MINI_DELAY_RETRY = new RetryConfig(true, MINI_DELAY_MILLIS);
        public static RetryConfig COMPLETE_WITHOUT_FAILURE = new RetryConfig(false, 0L, true);

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        @ExperimentalRetryPolicy
        public static final class Builder {
            private boolean mShouldRetry = true;
            private long mTimeoutInMillis = RetryConfig.getDefaultRetryDelayInMillis();

            public RetryConfig build() {
                return new RetryConfig(this.mShouldRetry, this.mTimeoutInMillis);
            }

            public Builder setRetryDelayInMillis(long j6) {
                this.mTimeoutInMillis = j6;
                return this;
            }

            public Builder setShouldRetry(boolean z6) {
                this.mShouldRetry = z6;
                return this;
            }
        }

        public static long getDefaultRetryDelayInMillis() {
            return DEFAULT_DELAY_MILLIS;
        }

        public long getRetryDelayInMillis() {
            return this.mDelayInMillis;
        }

        public boolean shouldCompleteWithoutFailure() {
            return this.mCompleteWithoutFailure;
        }

        public boolean shouldRetry() {
            return this.mShouldRetry;
        }

        private RetryConfig(boolean z6) {
            this(z6, getDefaultRetryDelayInMillis());
        }

        private RetryConfig(boolean z6, long j6) {
            this(z6, j6, false);
        }

        private RetryConfig(boolean z6, long j6, boolean z7) {
            this.mShouldRetry = z6;
            this.mDelayInMillis = j6;
            if (z7) {
                androidx.work.j.a("shouldRetry must be false when completeWithoutFailure is set to true", !z6);
            }
            this.mCompleteWithoutFailure = z7;
        }
    }

    static long getDefaultRetryTimeoutInMillis() {
        return DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ RetryConfig lambda$static$0(ExecutionState executionState) {
        return RetryConfig.NOT_RETRY;
    }

    default long getTimeoutInMillis() {
        return 0L;
    }

    RetryConfig onRetryDecisionRequested(ExecutionState executionState);
}
