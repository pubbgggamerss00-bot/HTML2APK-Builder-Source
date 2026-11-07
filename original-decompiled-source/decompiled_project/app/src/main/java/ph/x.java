package ph;

/* loaded from: classes2.dex */
public final class x<R> {

    /* renamed from: a, reason: collision with root package name */
    public final R f21600a;

    /* renamed from: b, reason: collision with root package name */
    public final j f21601b;

    /* renamed from: c, reason: collision with root package name */
    public final eh.q<Throwable, R, tg.h, pg.f0> f21602c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21603d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f21604e;

    /* JADX WARN: Multi-variable type inference failed */
    public x(R r10, j jVar, eh.q<? super Throwable, ? super R, ? super tg.h, pg.f0> qVar, Object obj, Throwable th2) {
        this.f21600a = r10;
        this.f21601b = jVar;
        this.f21602c = qVar;
        this.f21603d = obj;
        this.f21604e = th2;
    }

    public static x a(x xVar, j jVar, Throwable th2, int i10) {
        R r10 = xVar.f21600a;
        if ((i10 & 2) != 0) {
            jVar = xVar.f21601b;
        }
        j jVar2 = jVar;
        eh.q<Throwable, R, tg.h, pg.f0> qVar = xVar.f21602c;
        Object obj = xVar.f21603d;
        if ((i10 & 16) != 0) {
            th2 = xVar.f21604e;
        }
        return new x(r10, jVar2, qVar, obj, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.r.a(this.f21600a, xVar.f21600a) && kotlin.jvm.internal.r.a(this.f21601b, xVar.f21601b) && kotlin.jvm.internal.r.a(this.f21602c, xVar.f21602c) && kotlin.jvm.internal.r.a(this.f21603d, xVar.f21603d) && kotlin.jvm.internal.r.a(this.f21604e, xVar.f21604e);
    }

    public final int hashCode() {
        R r10 = this.f21600a;
        int iHashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
        j jVar = this.f21601b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        eh.q<Throwable, R, tg.h, pg.f0> qVar = this.f21602c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.f21603d;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.f21604e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f21600a + ", cancelHandler=" + this.f21601b + ", onCancellation=" + this.f21602c + ", idempotentResume=" + this.f21603d + ", cancelCause=" + this.f21604e + ')';
    }

    public /* synthetic */ x(Object obj, j jVar, eh.q qVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : jVar, (eh.q<? super Throwable, ? super Object, ? super tg.h, pg.f0>) ((i10 & 4) != 0 ? null : qVar), (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
