package s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f23769a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f23770b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f23771c;

    static {
        i iVar = new i("BoundReached", 0);
        f23769a = iVar;
        i iVar2 = new i("Finished", 1);
        f23770b = iVar2;
        i[] iVarArr = {iVar, iVar2};
        f23771c = iVarArr;
        i0.u2.e(iVarArr);
    }

    public i() {
        throw null;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f23771c.clone();
    }
}
