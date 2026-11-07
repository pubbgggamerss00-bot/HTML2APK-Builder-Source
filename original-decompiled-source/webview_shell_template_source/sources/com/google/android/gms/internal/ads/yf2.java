package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class yf2 extends ba2 {
    public final int s;

    public yf2(IllegalStateException illegalStateException, zf2 zf2Var) {
        super("Decoder failed: ".concat(String.valueOf(zf2Var == null ? null : zf2Var.f11282a)), illegalStateException);
        boolean z6 = illegalStateException instanceof MediaCodec.CodecException;
        this.s = j31.f5914a >= 23 ? z6 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : j31.p(z6 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
