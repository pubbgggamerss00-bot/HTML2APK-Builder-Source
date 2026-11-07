package d0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", f = "LazyLayoutScrollScope.kt", l = {177, 264}, m = "animateScrollToItem")
/* loaded from: classes.dex */
public final class i1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public h1 f7140a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.b0 f7141b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f7142c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.e0 f7143d;

    /* renamed from: e, reason: collision with root package name */
    public int f7144e;

    /* renamed from: f, reason: collision with root package name */
    public int f7145f;

    /* renamed from: g, reason: collision with root package name */
    public int f7146g;

    /* renamed from: h, reason: collision with root package name */
    public int f7147h;

    /* renamed from: j, reason: collision with root package name */
    public float f7148j;

    /* renamed from: k, reason: collision with root package name */
    public float f7149k;

    /* renamed from: l, reason: collision with root package name */
    public float f7150l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7151m;

    /* renamed from: n, reason: collision with root package name */
    public int f7152n;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f7151m = obj;
        this.f7152n |= PKIFailureInfo.systemUnavail;
        return l1.b(null, 0, 0, 0, null, this);
    }
}
