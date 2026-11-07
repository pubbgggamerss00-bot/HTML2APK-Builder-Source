package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s52 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f8801a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f8802b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f8803c;

    static {
        Charset.forName("US-ASCII");
        f8801a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8802b = bArr;
        f8803c = ByteBuffer.wrap(bArr);
        k42.e(0, 0, bArr);
    }
}
