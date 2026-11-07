package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f6818a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f6819b;

    public interface a {
        int getNumber();
    }

    public interface b {
        boolean a();
    }

    public interface c<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        c<E> mutableCopyWithCapacity(int i10);
    }

    static {
        Charset.forName("US-ASCII");
        f6818a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6819b = bArr;
        ByteBuffer.wrap(bArr);
        i.f(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
