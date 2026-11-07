package androidx.room;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", l = {602}, m = "collect")
/* loaded from: classes.dex */
public final class t extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3086b;

    /* renamed from: c, reason: collision with root package name */
    public int f3087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, vg.c cVar) {
        super(cVar);
        this.f3086b = uVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f3085a = obj;
        this.f3087c |= PKIFailureInfo.systemUnavail;
        this.f3086b.a(null, this);
        return ug.a.f29706a;
    }
}
