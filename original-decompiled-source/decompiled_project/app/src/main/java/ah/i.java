package ah;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f583a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f584b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f585c;

    static {
        i iVar = new i("TOP_DOWN", 0);
        f583a = iVar;
        i iVar2 = new i("BOTTOM_UP", 1);
        f584b = iVar2;
        i[] iVarArr = {iVar, iVar2};
        f585c = iVarArr;
        u2.e(iVarArr);
    }

    public i() {
        throw null;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f585c.clone();
    }
}
