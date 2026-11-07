package androidx.room;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {440, 448}, m = "checkInvalidatedTables")
/* loaded from: classes.dex */
public final class b1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f2853a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f2855c;

    /* renamed from: d, reason: collision with root package name */
    public int f2856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(a1 a1Var, vg.c cVar) {
        super(cVar);
        this.f2855c = a1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f2854b = obj;
        this.f2856d |= PKIFailureInfo.systemUnavail;
        return a1.a(this.f2855c, null, this);
    }
}
