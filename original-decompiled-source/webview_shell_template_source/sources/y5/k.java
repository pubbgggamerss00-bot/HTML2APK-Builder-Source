package y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15352a;

    /* renamed from: b, reason: collision with root package name */
    public final d f15353b;

    /* renamed from: c, reason: collision with root package name */
    public final p5.l<Throwable, d5.j> f15354c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15355d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f15356e;

    public /* synthetic */ k(Object obj, d dVar, Throwable th, int i6) {
        this(obj, (i6 & 2) != 0 ? null : dVar, null, null, (i6 & 16) != 0 ? null : th);
    }

    public static k a(k kVar, d dVar, Throwable th, int i6) {
        Object obj = kVar.f15352a;
        if ((i6 & 2) != 0) {
            dVar = kVar.f15353b;
        }
        d dVar2 = dVar;
        p5.l<Throwable, d5.j> lVar = kVar.f15354c;
        Object obj2 = kVar.f15355d;
        if ((i6 & 16) != 0) {
            th = kVar.f15356e;
        }
        return new k(obj, dVar2, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.j.a(this.f15352a, kVar.f15352a) && kotlin.jvm.internal.j.a(this.f15353b, kVar.f15353b) && kotlin.jvm.internal.j.a(this.f15354c, kVar.f15354c) && kotlin.jvm.internal.j.a(this.f15355d, kVar.f15355d) && kotlin.jvm.internal.j.a(this.f15356e, kVar.f15356e);
    }

    public final int hashCode() {
        Object obj = this.f15352a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.f15353b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        p5.l<Throwable, d5.j> lVar = this.f15354c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f15355d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f15356e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f15352a + ", cancelHandler=" + this.f15353b + ", onCancellation=" + this.f15354c + ", idempotentResume=" + this.f15355d + ", cancelCause=" + this.f15356e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Object obj, d dVar, p5.l<? super Throwable, d5.j> lVar, Object obj2, Throwable th) {
        this.f15352a = obj;
        this.f15353b = dVar;
        this.f15354c = lVar;
        this.f15355d = obj2;
        this.f15356e = th;
    }
}
