package q9;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f22592a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ t[] f22593b;

    static {
        t tVar = new t("DEFAULT", 0);
        f22592a = tVar;
        t tVar2 = new t("UNMETERED_ONLY", 1);
        t tVar3 = new t("UNMETERED_OR_DAILY", 2);
        t tVar4 = new t("FAST_IF_RADIO_AWAKE", 3);
        t tVar5 = new t("NEVER", 4);
        t tVar6 = new t("UNRECOGNIZED", 5);
        f22593b = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, tVar);
        sparseArray.put(1, tVar2);
        sparseArray.put(2, tVar3);
        sparseArray.put(3, tVar4);
        sparseArray.put(4, tVar5);
        sparseArray.put(-1, tVar6);
    }

    public t() {
        throw null;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f22593b.clone();
    }
}
