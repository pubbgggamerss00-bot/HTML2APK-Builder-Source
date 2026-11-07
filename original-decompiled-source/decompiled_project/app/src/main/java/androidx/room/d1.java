package androidx.room;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {412}, m = "notifyInvalidation")
/* loaded from: classes.dex */
public final class d1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a1 f2898a;

    /* renamed from: b, reason: collision with root package name */
    public w5.a f2899b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2900c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f2901d;

    /* renamed from: e, reason: collision with root package name */
    public int f2902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(a1 a1Var, vg.c cVar) {
        super(cVar);
        this.f2901d = a1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f2900c = obj;
        this.f2902e |= PKIFailureInfo.systemUnavail;
        return a1.b(this.f2901d, this);
    }
}
