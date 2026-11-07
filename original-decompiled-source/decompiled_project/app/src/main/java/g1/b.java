package g1;

import g1.i;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class b extends s implements eh.a<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c<Object> f11270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<Object, ? extends Object> f11271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f11272c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object[] f11275f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c<Object> cVar, l<Object, ? extends Object> lVar, i iVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f11270a = cVar;
        this.f11271b = lVar;
        this.f11272c = iVar;
        this.f11273d = str;
        this.f11274e = obj;
        this.f11275f = objArr;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
    @Override // eh.a
    public final f0 invoke() {
        boolean z10;
        c<Object> cVar = this.f11270a;
        i iVar = cVar.f11277b;
        i iVar2 = this.f11272c;
        boolean z11 = true;
        if (iVar != iVar2) {
            cVar.f11277b = iVar2;
            z10 = true;
        } else {
            z10 = false;
        }
        String str = cVar.f11278c;
        String str2 = this.f11273d;
        if (r.a(str, str2)) {
            z11 = z10;
        } else {
            cVar.f11278c = str2;
        }
        cVar.f11276a = this.f11271b;
        cVar.f11279d = this.f11274e;
        cVar.f11280e = this.f11275f;
        i.a aVar = cVar.f11281f;
        if (aVar != null && z11) {
            aVar.a();
            cVar.f11281f = null;
            cVar.e();
        }
        return f0.f21461a;
    }
}
