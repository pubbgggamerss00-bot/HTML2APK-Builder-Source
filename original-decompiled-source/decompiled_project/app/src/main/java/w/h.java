package w;

import androidx.compose.foundation.gestures.i;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import s.l1;
import s.o2;
import s.p2;
import s.y;
import v.b1;
import v.e2;
import w.e;

/* loaded from: classes.dex */
public final class h implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public final c f31006a;

    /* renamed from: b, reason: collision with root package name */
    public final y<Float> f31007b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f31008c;

    /* renamed from: d, reason: collision with root package name */
    public final i.b f31009d = androidx.compose.foundation.gestures.i.f903c;

    public h(c cVar, y yVar, l1 l1Var) {
        this.f31006a = cVar;
        this.f31007b = yVar;
        this.f31008c = l1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(h hVar, b1 b1Var, float f10, float f11, e.b bVar, vg.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f31005c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f31005c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(hVar, cVar);
            }
        }
        g gVar2 = gVar;
        Object objA = gVar2.f31003a;
        ug.a aVar = ug.a.f29706a;
        int i11 = gVar2.f31005c;
        if (i11 == 0) {
            q.b(objA);
            if (Math.abs(f10) == CropImageView.DEFAULT_ASPECT_RATIO || Math.abs(f11) == CropImageView.DEFAULT_ASPECT_RATIO) {
                return o1.j.a(f10, f11, 28);
            }
            gVar2.f31005c = 1;
            y<Float> yVar = hVar.f31007b;
            o2 o2Var = p2.f23868a;
            b hVar2 = Math.abs(((s.o) yVar.a().b(new s.o(CropImageView.DEFAULT_ASPECT_RATIO), new s.o(f11))).f23852a) >= Math.abs(f10) ? new q6.h(yVar) : new o(hVar.f31008c);
            float f12 = m.f31029a;
            objA = hVar2.a(b1Var, new Float(f10), new Float(f11), bVar, gVar2);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(objA);
        }
        return ((a) objA).f30983b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // v.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(b1 b1Var, float f10, eh.l lVar, vg.c cVar) throws Throwable {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f31002c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f31002c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(this, cVar);
            }
        }
        Object objD = fVar.f31000a;
        Object obj = ug.a.f29706a;
        int i11 = fVar.f31002c;
        if (i11 == 0) {
            q.b(objD);
            fVar.f31002c = 1;
            objD = d(b1Var, f10, lVar, fVar);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(objD);
        }
        a aVar = (a) objD;
        float fFloatValue = aVar.f30982a.floatValue();
        s.n<T, V> nVar = aVar.f30983b;
        float fFloatValue2 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (fFloatValue != CropImageView.DEFAULT_ASPECT_RATIO) {
            fFloatValue2 = ((Number) nVar.c()).floatValue();
        }
        return new Float(fFloatValue2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(b1 b1Var, float f10, eh.l lVar, vg.c cVar) throws Throwable {
        d dVar;
        eh.l lVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f30989d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f30989d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(this, cVar);
            }
        }
        Object objE = dVar.f30987b;
        ug.a aVar = ug.a.f29706a;
        int i11 = dVar.f30989d;
        if (i11 == 0) {
            q.b(objE);
            e eVar = new e(this, f10, lVar, b1Var, null);
            dVar.f30986a = lVar;
            dVar.f30989d = 1;
            objE = ph.h.e(this.f31009d, eVar, dVar);
            if (objE == aVar) {
                return aVar;
            }
            lVar2 = lVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar2 = dVar.f30986a;
            q.b(objE);
        }
        a aVar2 = (a) objE;
        lVar2.invoke(new Float(CropImageView.DEFAULT_ASPECT_RATIO));
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f31008c.equals(this.f31008c) && r.a(hVar.f31007b, this.f31007b) && hVar.f31006a.equals(this.f31006a);
    }

    public final int hashCode() {
        return this.f31006a.hashCode() + ((this.f31007b.hashCode() + (this.f31008c.hashCode() * 31)) * 31);
    }
}
