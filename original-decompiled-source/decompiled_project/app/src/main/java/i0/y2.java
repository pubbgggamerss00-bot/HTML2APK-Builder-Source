package i0;

import android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: b, reason: collision with root package name */
    public static final y2 f13698b;

    /* renamed from: c, reason: collision with root package name */
    public static final y2 f13699c;

    /* renamed from: d, reason: collision with root package name */
    public static final y2 f13700d;

    /* renamed from: e, reason: collision with root package name */
    public static final y2 f13701e;

    /* renamed from: f, reason: collision with root package name */
    public static final y2 f13702f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y2[] f13703g;

    /* renamed from: a, reason: collision with root package name */
    public final int f13704a;

    static {
        y2 y2Var = new y2("Cut", 0, R.string.cut);
        f13698b = y2Var;
        y2 y2Var2 = new y2("Copy", 1, R.string.copy);
        f13699c = y2Var2;
        y2 y2Var3 = new y2("Paste", 2, R.string.paste);
        f13700d = y2Var3;
        y2 y2Var4 = new y2("SelectAll", 3, R.string.selectAll);
        f13701e = y2Var4;
        y2 y2Var5 = new y2("Autofill", 4, R.string.autofill);
        f13702f = y2Var5;
        y2[] y2VarArr = {y2Var, y2Var2, y2Var3, y2Var4, y2Var5};
        f13703g = y2VarArr;
        u2.e(y2VarArr);
    }

    public y2(String str, int i10, int i11) {
        this.f13704a = i11;
    }

    public static y2 valueOf(String str) {
        return (y2) Enum.valueOf(y2.class, str);
    }

    public static y2[] values() {
        return (y2[]) f13703g.clone();
    }
}
