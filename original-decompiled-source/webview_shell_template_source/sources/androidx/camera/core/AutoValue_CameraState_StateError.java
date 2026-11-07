package androidx.camera.core;

import androidx.camera.core.CameraState;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_CameraState_StateError extends CameraState.StateError {
    private final Throwable cause;
    private final int code;

    public AutoValue_CameraState_StateError(int i6, Throwable th) {
        this.code = i6;
        this.cause = th;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState.StateError) {
            CameraState.StateError stateError = (CameraState.StateError) obj;
            if (this.code == stateError.getCode() && ((th = this.cause) != null ? th.equals(stateError.getCause()) : stateError.getCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public Throwable getCause() {
        return this.cause;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
        return this.code;
    }

    public int hashCode() {
        int i6 = (this.code ^ 1000003) * 1000003;
        Throwable th = this.cause;
        return i6 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.code + ", cause=" + this.cause + "}";
    }
}
