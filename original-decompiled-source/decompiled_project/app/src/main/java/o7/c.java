package o7;

import kotlin.jvm.internal.g0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {126, 130, 148}, m = "execute")
/* loaded from: classes.dex */
public final class c extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a f18997a;

    /* renamed from: b, reason: collision with root package name */
    public w7.f f18998b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18999c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19000d;

    /* renamed from: e, reason: collision with root package name */
    public g0 f19001e;

    /* renamed from: f, reason: collision with root package name */
    public g0 f19002f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f19003g;

    /* renamed from: h, reason: collision with root package name */
    public g0 f19004h;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f19005j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a f19006k;

    /* renamed from: l, reason: collision with root package name */
    public int f19007l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, vg.c cVar) {
        super(cVar);
        this.f19006k = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f19005j = obj;
        this.f19007l |= PKIFailureInfo.systemUnavail;
        return a.c(this.f19006k, null, null, null, null, this);
    }
}
