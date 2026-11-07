package o7;

import java.util.List;
import o7.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.m;

@vg.e(c = "coil3.intercept.EngineInterceptorKt", f = "EngineInterceptor.kt", l = {259}, m = "transform")
/* loaded from: classes.dex */
public final class h extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a.C0215a f19039a;

    /* renamed from: b, reason: collision with root package name */
    public w7.f f19040b;

    /* renamed from: c, reason: collision with root package name */
    public m f19041c;

    /* renamed from: d, reason: collision with root package name */
    public g7.h f19042d;

    /* renamed from: e, reason: collision with root package name */
    public List f19043e;

    /* renamed from: f, reason: collision with root package name */
    public int f19044f;

    /* renamed from: g, reason: collision with root package name */
    public int f19045g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f19046h;

    /* renamed from: j, reason: collision with root package name */
    public int f19047j;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f19046h = obj;
        this.f19047j |= PKIFailureInfo.systemUnavail;
        return i.a(null, null, null, null, this);
    }
}
