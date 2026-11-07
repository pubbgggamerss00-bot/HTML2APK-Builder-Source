package androidx.camera.core.impl;

import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.Logger;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraValidator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@ExperimentalRetryPolicy
/* loaded from: classes.dex */
public final class CameraProviderInitRetryPolicy implements RetryPolicyInternal {
    private final RetryPolicy mDelegatePolicy;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Legacy implements RetryPolicyInternal {
        private final RetryPolicy mBasePolicy;

        public Legacy(long j6) {
            this.mBasePolicy = new CameraProviderInitRetryPolicy(j6);
        }

        @Override // androidx.camera.core.impl.RetryPolicyInternal
        public RetryPolicy copy(long j6) {
            return new Legacy(j6);
        }

        @Override // androidx.camera.core.RetryPolicy
        public long getTimeoutInMillis() {
            return this.mBasePolicy.getTimeoutInMillis();
        }

        @Override // androidx.camera.core.RetryPolicy
        public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
            if (this.mBasePolicy.onRetryDecisionRequested(executionState).shouldRetry()) {
                return RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }
            Throwable cause = executionState.getCause();
            if (cause instanceof CameraValidator.CameraIdListIncorrectException) {
                Logger.e("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((CameraValidator.CameraIdListIncorrectException) cause).getAvailableCameraCount() > 0) {
                    return RetryPolicy.RetryConfig.COMPLETE_WITHOUT_FAILURE;
                }
            }
            return RetryPolicy.RetryConfig.NOT_RETRY;
        }
    }

    public CameraProviderInitRetryPolicy(final long j6) {
        this.mDelegatePolicy = new TimeoutRetryPolicy(j6, new RetryPolicy() { // from class: androidx.camera.core.impl.CameraProviderInitRetryPolicy.1
            @Override // androidx.camera.core.RetryPolicy
            public long getTimeoutInMillis() {
                return j6;
            }

            @Override // androidx.camera.core.RetryPolicy
            public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
                return executionState.getStatus() == 1 ? RetryPolicy.RetryConfig.NOT_RETRY : RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }
        });
    }

    @Override // androidx.camera.core.impl.RetryPolicyInternal
    public RetryPolicy copy(long j6) {
        return new CameraProviderInitRetryPolicy(j6);
    }

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mDelegatePolicy.getTimeoutInMillis();
    }

    @Override // androidx.camera.core.RetryPolicy
    public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        return this.mDelegatePolicy.onRetryDecisionRequested(executionState);
    }
}
