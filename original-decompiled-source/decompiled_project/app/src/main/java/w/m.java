package w;

import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.d0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import s.l1;
import s.w1;
import s.y;
import v.b1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final float f31029a = 400;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b1 b1Var, float f10, s.n nVar, y yVar, eh.l lVar, vg.c cVar) {
        i iVar;
        d0 d0Var;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f31014e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f31014e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(cVar);
            }
        }
        Object obj = iVar.f31013d;
        ug.a aVar = ug.a.f29706a;
        int i11 = iVar.f31014e;
        if (i11 == 0) {
            q.b(obj);
            d0 d0Var2 = new d0();
            boolean z10 = ((Number) nVar.c()).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO;
            j jVar = new j(f10, d0Var2, b1Var, lVar);
            iVar.f31011b = nVar;
            iVar.f31012c = d0Var2;
            iVar.f31010a = f10;
            iVar.f31014e = 1;
            if (w1.d(nVar, yVar, !z10, jVar, iVar) == aVar) {
                return aVar;
            }
            d0Var = d0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = iVar.f31010a;
            d0Var = iVar.f31012c;
            nVar = iVar.f31011b;
            q.b(obj);
        }
        return new a(new Float(f10 - d0Var.f16322a), nVar);
    }

    public static final void b(s.k kVar, b1 b1Var, eh.l lVar, float f10) {
        float fE;
        try {
            fE = b1Var.e(f10);
        } catch (CancellationException unused) {
            kVar.a();
            fE = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        lVar.invoke(Float.valueOf(fE));
        if (Math.abs(f10 - fE) > 0.5f) {
            kVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b1 b1Var, float f10, float f11, s.n nVar, l1 l1Var, eh.l lVar, vg.c cVar) {
        k kVar;
        d0 d0Var;
        s.n nVar2;
        float f12;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f31024f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f31024f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(cVar);
            }
        }
        k kVar2 = kVar;
        Object obj = kVar2.f31023e;
        ug.a aVar = ug.a.f29706a;
        int i11 = kVar2.f31024f;
        if (i11 == 0) {
            q.b(obj);
            d0 d0Var2 = new d0();
            float fFloatValue = ((Number) nVar.c()).floatValue();
            Float f13 = new Float(f10);
            boolean z10 = ((Number) nVar.c()).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO;
            l lVar2 = new l(f11, d0Var2, b1Var, lVar);
            kVar2.f31021c = nVar;
            kVar2.f31022d = d0Var2;
            kVar2.f31019a = f10;
            kVar2.f31020b = fFloatValue;
            kVar2.f31024f = 1;
            if (w1.e(nVar, f13, l1Var, !z10, lVar2, kVar2) == aVar) {
                return aVar;
            }
            d0Var = d0Var2;
            nVar2 = nVar;
            f12 = fFloatValue;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f12 = kVar2.f31020b;
            f10 = kVar2.f31019a;
            d0Var = kVar2.f31022d;
            nVar2 = kVar2.f31021c;
            q.b(obj);
        }
        return new a(new Float(f10 - d0Var.f16322a), o1.j.c(nVar2, CropImageView.DEFAULT_ASPECT_RATIO, d(((Number) nVar2.c()).floatValue(), f12), 29));
    }

    public static final float d(float f10, float f11) {
        return f11 == CropImageView.DEFAULT_ASPECT_RATIO ? CropImageView.DEFAULT_ASPECT_RATIO : (f11 <= CropImageView.DEFAULT_ASPECT_RATIO ? f10 >= f11 : f10 <= f11) ? f10 : f11;
    }
}
