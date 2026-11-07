package s;

import i0.e4;
import s.s;
import x0.r3;

/* loaded from: classes.dex */
public final class n<T, V extends s> implements r3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final n2<T, V> f23842a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.x1 f23843b;

    /* renamed from: c, reason: collision with root package name */
    public V f23844c;

    /* renamed from: d, reason: collision with root package name */
    public long f23845d;

    /* renamed from: e, reason: collision with root package name */
    public long f23846e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23847f;

    public /* synthetic */ n(n2 n2Var, Object obj, s sVar, int i10) {
        this(n2Var, obj, (i10 & 4) != 0 ? null : sVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final T c() {
        return this.f23842a.b().invoke(this.f23844c);
    }

    @Override // x0.r3
    public final T getValue() {
        return this.f23843b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f23843b.getValue() + ", velocity=" + c() + ", isRunning=" + this.f23847f + ", lastFrameTimeNanos=" + this.f23845d + ", finishedTimeNanos=" + this.f23846e + ')';
    }

    public n(n2<T, V> n2Var, T t3, V v10, long j10, long j11, boolean z10) {
        V vInvoke;
        this.f23842a = n2Var;
        this.f23843b = bg.b.h(t3);
        if (v10 != null) {
            vInvoke = (V) e4.b(v10);
        } else {
            vInvoke = n2Var.a().invoke(t3);
            vInvoke.d();
        }
        this.f23844c = vInvoke;
        this.f23845d = j10;
        this.f23846e = j11;
        this.f23847f = z10;
    }
}
