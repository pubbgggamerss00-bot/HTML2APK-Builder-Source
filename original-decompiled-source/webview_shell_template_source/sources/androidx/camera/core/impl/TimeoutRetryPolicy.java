package androidx.camera.core.impl;

import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.RetryPolicy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@ExperimentalRetryPolicy
/* loaded from: classes.dex */
public final class TimeoutRetryPolicy implements RetryPolicy {
    private final RetryPolicy mDelegatePolicy;
    private final long mTimeoutInMillis;

    public TimeoutRetryPolicy(long j6, RetryPolicy retryPolicy) {
        androidx.work.j.a("Timeout must be non-negative.", j6 >= 0);
        this.mTimeoutInMillis = j6;
        this.mDelegatePolicy = retryPolicy;
    }

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mTimeoutInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy
    public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        RetryPolicy.RetryConfig retryConfigOnRetryDecisionRequested = this.mDelegatePolicy.onRetryDecisionRequested(executionState);
        return (getTimeoutInMillis() <= 0 || executionState.getExecutedTimeInMillis() < getTimeoutInMillis() - retryConfigOnRetryDecisionRequested.getRetryDelayInMillis()) ? retryConfigOnRetryDecisionRequested : RetryPolicy.RetryConfig.NOT_RETRY;
    }
}
