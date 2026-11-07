package androidx.room;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {323, 328}, m = "startTrackingTable")
/* loaded from: classes.dex */
public final class f1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a1 f2911a;

    /* renamed from: b, reason: collision with root package name */
    public w f2912b;

    /* renamed from: c, reason: collision with root package name */
    public String f2913c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f2914d;

    /* renamed from: e, reason: collision with root package name */
    public int f2915e;

    /* renamed from: f, reason: collision with root package name */
    public int f2916f;

    /* renamed from: g, reason: collision with root package name */
    public int f2917g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2918h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a1 f2919j;

    /* renamed from: k, reason: collision with root package name */
    public int f2920k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(a1 a1Var, vg.c cVar) {
        super(cVar);
        this.f2919j = a1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f2918h = obj;
        this.f2920k |= PKIFailureInfo.systemUnavail;
        return a1.c(this.f2919j, null, 0, this);
    }
}
