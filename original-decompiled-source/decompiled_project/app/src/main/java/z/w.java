package z;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f34654a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f34655b;

    /* renamed from: c, reason: collision with root package name */
    public static final w f34656c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w[] f34657d;

    static {
        w wVar = new w("Vertical", 0);
        f34654a = wVar;
        w wVar2 = new w("Horizontal", 1);
        f34655b = wVar2;
        w wVar3 = new w(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.h.f7006k, 2);
        f34656c = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3};
        f34657d = wVarArr;
        u2.e(wVarArr);
    }

    public w() {
        throw null;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f34657d.clone();
    }
}
