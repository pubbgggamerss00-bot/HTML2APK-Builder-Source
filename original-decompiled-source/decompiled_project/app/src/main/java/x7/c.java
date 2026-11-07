package x7;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f32185a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f32186b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f32187c;

    static {
        c cVar = new c("EXACT", 0);
        f32185a = cVar;
        c cVar2 = new c("INEXACT", 1);
        f32186b = cVar2;
        c[] cVarArr = {cVar, cVar2};
        f32187c = cVarArr;
        u2.e(cVarArr);
    }

    public c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f32187c.clone();
    }
}
