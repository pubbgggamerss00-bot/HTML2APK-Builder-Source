package e0;

import com.yalantis.ucrop.view.CropImageView;
import d0.v1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import v.e2;
import v.o1;

/* loaded from: classes.dex */
public final class i1 implements v.z {

    /* renamed from: a, reason: collision with root package name */
    public final e2 f8203a;

    /* renamed from: b, reason: collision with root package name */
    public final b f8204b;

    public i1(e2 e2Var, b bVar) {
        this.f8203a = e2Var;
        this.f8204b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // v.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o1.a aVar, float f10, tg.e eVar) {
        h1 h1Var;
        i1 i1Var;
        if (eVar instanceof h1) {
            h1Var = (h1) eVar;
            int i10 = h1Var.f8198d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                h1Var.f8198d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                h1Var = new h1(this, (vg.c) eVar);
            }
        }
        Object objB = h1Var.f8196b;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = h1Var.f8198d;
        if (i11 == 0) {
            pg.q.b(objB);
            v1 v1Var = new v1(1, this, aVar);
            h1Var.f8195a = this;
            h1Var.f8198d = 1;
            objB = this.f8203a.b(aVar, f10, v1Var, h1Var);
            if (objB == aVar2) {
                return aVar2;
            }
            i1Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1Var = h1Var.f8195a;
            pg.q.b(objB);
        }
        float fFloatValue = ((Number) objB).floatValue();
        b bVar = i1Var.f8204b;
        if (bVar.k() != CropImageView.DEFAULT_ASPECT_RATIO && Math.abs(bVar.k()) < 0.001d) {
            int iJ = bVar.j();
            if (bVar.f8153k.a()) {
                ph.h.c(((o0) bVar.f8158p.getValue()).f8269s, null, null, new y0(bVar, null), 3);
            }
            bVar.t(iJ, CropImageView.DEFAULT_ASPECT_RATIO, false);
        } else {
            bVar.k();
        }
        return new Float(fFloatValue);
    }
}
