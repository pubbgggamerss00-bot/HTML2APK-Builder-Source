package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f6632a;

    /* renamed from: b, reason: collision with root package name */
    public static final b1 f6633b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b1[] f6634c;

    static {
        b1 b1Var = new b1("PROTO2", 0);
        f6632a = b1Var;
        b1 b1Var2 = new b1("PROTO3", 1);
        f6633b = b1Var2;
        f6634c = new b1[]{b1Var, b1Var2};
    }

    public b1() {
        throw null;
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f6634c.clone();
    }
}
