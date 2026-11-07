package androidx.room;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {300}, m = "syncTriggers$room_runtime_release")
/* loaded from: classes.dex */
public final class h1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public w5.a f2979a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f2981c;

    /* renamed from: d, reason: collision with root package name */
    public int f2982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(a1 a1Var, vg.c cVar) {
        super(cVar);
        this.f2981c = a1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f2980b = obj;
        this.f2982d |= PKIFailureInfo.systemUnavail;
        return this.f2981c.f(this);
    }
}
