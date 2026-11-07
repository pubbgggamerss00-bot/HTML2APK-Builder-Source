package androidx.room;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {342}, m = "stopTrackingTable")
/* loaded from: classes.dex */
public final class g1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public w f2960a;

    /* renamed from: b, reason: collision with root package name */
    public String f2961b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f2962c;

    /* renamed from: d, reason: collision with root package name */
    public int f2963d;

    /* renamed from: e, reason: collision with root package name */
    public int f2964e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a1 f2966g;

    /* renamed from: h, reason: collision with root package name */
    public int f2967h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(a1 a1Var, vg.c cVar) {
        super(cVar);
        this.f2966g = a1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f2965f = obj;
        this.f2967h |= PKIFailureInfo.systemUnavail;
        return a1.d(this.f2966g, null, 0, this);
    }
}
