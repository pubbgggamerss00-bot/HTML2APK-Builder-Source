package o7;

import android.content.Context;
import java.util.List;
import o7.j;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;

/* loaded from: classes.dex */
public final class l implements j.a {

    /* renamed from: a, reason: collision with root package name */
    public final w7.f f19053a;

    /* renamed from: b, reason: collision with root package name */
    public final List<j> f19054b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19055c;

    /* renamed from: d, reason: collision with root package name */
    public final w7.f f19056d;

    /* renamed from: e, reason: collision with root package name */
    public final x7.h f19057e;

    /* renamed from: f, reason: collision with root package name */
    public final g7.h f19058f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19059g;

    /* JADX WARN: Multi-variable type inference failed */
    public l(w7.f fVar, List<? extends j> list, int i10, w7.f fVar2, x7.h hVar, g7.h hVar2, boolean z10) {
        this.f19053a = fVar;
        this.f19054b = list;
        this.f19055c = i10;
        this.f19056d = fVar2;
        this.f19057e = hVar;
        this.f19058f = hVar2;
        this.f19059g = z10;
    }

    @Override // o7.j.a
    public final w7.f a() {
        return this.f19056d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vg.c cVar) {
        k kVar;
        j jVar;
        l lVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f19052e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f19052e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(this, cVar);
            }
        }
        Object obj = kVar.f19050c;
        ug.a aVar = ug.a.f29706a;
        int i11 = kVar.f19052e;
        if (i11 == 0) {
            q.b(obj);
            List<j> list = this.f19054b;
            int i12 = this.f19055c;
            j jVar2 = list.get(i12);
            l lVar2 = new l(this.f19053a, this.f19054b, i12 + 1, this.f19056d, this.f19057e, this.f19058f, this.f19059g);
            kVar.f19048a = this;
            kVar.f19049b = jVar2;
            kVar.f19052e = 1;
            Object objA = jVar2.a(lVar2, kVar);
            if (objA == aVar) {
                return aVar;
            }
            jVar = jVar2;
            obj = objA;
            lVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = kVar.f19049b;
            lVar = kVar.f19048a;
            q.b(obj);
        }
        w7.i iVar = (w7.i) obj;
        w7.f fVarA = iVar.a();
        lVar.getClass();
        Context context = fVarA.f31328a;
        w7.f fVar = lVar.f19053a;
        if (context != fVar.f31328a) {
            throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's context.").toString());
        }
        if (fVarA.f31329b == w7.k.f31400a) {
            throw new IllegalStateException(("Interceptor '" + jVar + "' cannot set the request's data to null.").toString());
        }
        if (fVarA.f31330c != fVar.f31330c) {
            throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's target.").toString());
        }
        if (fVarA.f31342o == fVar.f31342o) {
            return iVar;
        }
        throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }
}
