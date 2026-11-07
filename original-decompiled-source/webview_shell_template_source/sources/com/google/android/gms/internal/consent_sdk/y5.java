package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.x5;
import com.google.android.gms.internal.consent_sdk.y5;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class y5<MessageType extends y5<MessageType, BuilderType>, BuilderType extends x5<MessageType, BuilderType>> implements v7 {
    protected int zza = 0;

    public final void b(OutputStream outputStream) throws IOException {
        z6 z6Var = (z6) this;
        int iZzn = z6Var.zzn();
        Logger logger = k6.f11798b;
        if (iZzn > 4096) {
            iZzn = 4096;
        }
        j6 j6Var = new j6(outputStream, iZzn);
        z6Var.a(j6Var);
        if (j6Var.f11790f > 0) {
            j6Var.x();
        }
    }

    public int c(e8 e8Var) {
        throw null;
    }
}
