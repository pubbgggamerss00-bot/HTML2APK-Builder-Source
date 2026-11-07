package o7;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.m;

@vg.e(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
/* loaded from: classes.dex */
public final class e extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a f19016a;

    /* renamed from: b, reason: collision with root package name */
    public g7.f f19017b;

    /* renamed from: c, reason: collision with root package name */
    public w7.f f19018c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19019d;

    /* renamed from: e, reason: collision with root package name */
    public m f19020e;

    /* renamed from: f, reason: collision with root package name */
    public g7.h f19021f;

    /* renamed from: g, reason: collision with root package name */
    public l7.k f19022g;

    /* renamed from: h, reason: collision with root package name */
    public int f19023h;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f19024j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a f19025k;

    /* renamed from: l, reason: collision with root package name */
    public int f19026l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, vg.c cVar) {
        super(cVar);
        this.f19025k = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f19024j = obj;
        this.f19026l |= PKIFailureInfo.systemUnavail;
        return this.f19025k.d(null, null, null, null, null, this);
    }
}
