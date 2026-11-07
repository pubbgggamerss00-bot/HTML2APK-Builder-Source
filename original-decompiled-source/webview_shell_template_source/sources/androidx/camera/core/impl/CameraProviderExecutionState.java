package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.InitializationException;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraValidator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@ExperimentalRetryPolicy
/* loaded from: classes.dex */
public final class CameraProviderExecutionState implements RetryPolicy.ExecutionState {
    private final int mAttemptCount;
    private final Throwable mCause;
    private final int mStatus;
    private final long mTaskExecutedTimeInMillis;

    public CameraProviderExecutionState(long j6, int i6, Throwable th) {
        this.mTaskExecutedTimeInMillis = SystemClock.elapsedRealtime() - j6;
        this.mAttemptCount = i6;
        if (th instanceof CameraValidator.CameraIdListIncorrectException) {
            this.mStatus = 2;
            this.mCause = th;
            return;
        }
        if (!(th instanceof InitializationException)) {
            this.mStatus = 0;
            this.mCause = th;
            return;
        }
        Throwable cause = th.getCause();
        th = cause != null ? cause : th;
        this.mCause = th;
        if (th instanceof CameraUnavailableException) {
            this.mStatus = 2;
        } else if (th instanceof IllegalArgumentException) {
            this.mStatus = 1;
        } else {
            this.mStatus = 0;
        }
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public Throwable getCause() {
        return this.mCause;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public long getExecutedTimeInMillis() {
        return this.mTaskExecutedTimeInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public int getNumOfAttempts() {
        return this.mAttemptCount;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public int getStatus() {
        return this.mStatus;
    }
}
