package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e6 extends g6 {
    @Override // com.google.android.gms.internal.consent_sdk.g6, com.google.android.gms.internal.consent_sdk.h6
    public final byte c(int i6) {
        if (((47 - (i6 + 1)) | i6) >= 0) {
            return this.f11757u[i6];
        }
        if (i6 < 0) {
            throw new ArrayIndexOutOfBoundsException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.camera.camera2.internal.s0.a(i6, "Index > length: ", ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.g6, com.google.android.gms.internal.consent_sdk.h6
    public final byte d(int i6) {
        return this.f11757u[i6];
    }

    @Override // com.google.android.gms.internal.consent_sdk.g6, com.google.android.gms.internal.consent_sdk.h6
    public final int e() {
        return 47;
    }
}
