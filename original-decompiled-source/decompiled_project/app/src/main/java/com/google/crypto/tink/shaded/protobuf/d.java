package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f6641a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f6642b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f6641a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f6642b = cls2 != null;
    }

    public static boolean a() {
        return (f6641a == null || f6642b) ? false : true;
    }
}
