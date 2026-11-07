package q2;

/* loaded from: classes.dex */
public final class c0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f21758a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.p<T, T, T> f21759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21760c;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(String str, eh.p<? super T, ? super T, ? extends T> pVar) {
        this.f21758a = str;
        this.f21759b = pVar;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f21758a;
    }

    public /* synthetic */ c0(String str) {
        this(str, b0.f21757a);
    }

    public c0(String str, boolean z10, eh.p<? super T, ? super T, ? extends T> pVar) {
        this(str, pVar);
        this.f21760c = z10;
    }
}
