package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class uz1 extends dp1 {

    /* renamed from: t, reason: collision with root package name */
    public final int f9673t;

    public uz1() {
        this.f9673t = 1;
    }

    public static uz1 a(IOException iOException, int i6) {
        String message = iOException.getMessage();
        int i7 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !rj1.g(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i7 == 2007 ? new dz1("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new uz1(iOException, i7, i6);
    }

    public uz1(IOException iOException, int i6, int i7) {
        super(i6 == 2000 ? i7 != 1 ? 2000 : 2001 : i6, iOException);
        this.f9673t = i7;
    }

    public uz1(String str, int i6, int i7) {
        super(str, i6 == 2000 ? i7 != 1 ? 2000 : 2001 : i6);
        this.f9673t = i7;
    }

    public uz1(String str, IOException iOException, int i6, int i7) {
        super(str, iOException, i6 == 2000 ? i7 != 1 ? 2000 : 2001 : i6);
        this.f9673t = i7;
    }
}
