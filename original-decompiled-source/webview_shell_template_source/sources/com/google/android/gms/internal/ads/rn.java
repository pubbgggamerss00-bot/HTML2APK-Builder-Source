package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class rn extends IOException {
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8672t;

    public rn(String str, Throwable th, boolean z6, int i6) {
        super(str, th);
        this.s = z6;
        this.f8672t = i6;
    }

    public static rn a(RuntimeException runtimeException, String str) {
        return new rn(str, runtimeException, true, 1);
    }

    public static rn b(String str) {
        return new rn(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message);
        sb.append(" {contentIsMalformed=");
        sb.append(this.s);
        sb.append(", dataType=");
        return androidx.camera.camera2.internal.p0.a(sb, this.f8672t, "}");
    }
}
