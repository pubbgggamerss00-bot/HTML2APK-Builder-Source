package o7;

import l7.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.m;

@vg.e(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {203}, m = "decode")
/* loaded from: classes.dex */
public final class b extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a f18985a;

    /* renamed from: b, reason: collision with root package name */
    public p f18986b;

    /* renamed from: c, reason: collision with root package name */
    public g7.f f18987c;

    /* renamed from: d, reason: collision with root package name */
    public w7.f f18988d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18989e;

    /* renamed from: f, reason: collision with root package name */
    public m f18990f;

    /* renamed from: g, reason: collision with root package name */
    public g7.h f18991g;

    /* renamed from: h, reason: collision with root package name */
    public j7.i f18992h;

    /* renamed from: j, reason: collision with root package name */
    public int f18993j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f18994k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f18995l;

    /* renamed from: m, reason: collision with root package name */
    public int f18996m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, vg.c cVar) {
        super(cVar);
        this.f18995l = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f18994k = obj;
        this.f18996m |= PKIFailureInfo.systemUnavail;
        return a.b(this.f18995l, null, null, null, null, null, null, this);
    }
}
