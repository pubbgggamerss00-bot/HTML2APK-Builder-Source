package g8;

/* loaded from: classes.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f11559a;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i10, String str, String str2) {
        str2 = (i10 & 2) != 0 ? null : str2;
        super(str2 == null ? str : str2, null);
        this.f11559a = str;
    }

    public a(String str, String str2, Throwable th2) {
        super(str2 == null ? str : str2, th2);
        this.f11559a = str;
    }
}
