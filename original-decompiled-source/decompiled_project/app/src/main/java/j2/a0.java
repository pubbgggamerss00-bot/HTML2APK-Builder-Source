package j2;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u4 f14641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.c f14642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(u4 u4Var, androidx.compose.ui.platform.c cVar) {
        super(0);
        this.f14641a = u4Var;
        this.f14642b = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r3v6, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r6v10, types: [eh.a, kotlin.jvm.internal.s] */
    @Override // eh.a
    public final pg.f0 invoke() {
        q2.t tVar;
        i2.e0 e0Var;
        u4 u4Var = this.f14641a;
        q2.j jVar = u4Var.f14918e;
        q2.j jVar2 = u4Var.f14919f;
        Float f10 = u4Var.f14916c;
        Float f11 = u4Var.f14917d;
        float fFloatValue = (jVar == null || f10 == null) ? 0.0f : ((Number) jVar.f21771a.invoke()).floatValue() - f10.floatValue();
        float fFloatValue2 = (jVar2 == null || f11 == null) ? 0.0f : ((Number) jVar2.f21771a.invoke()).floatValue() - f11.floatValue();
        if (fFloatValue != CropImageView.DEFAULT_ASPECT_RATIO || fFloatValue2 != CropImageView.DEFAULT_ASPECT_RATIO) {
            int i10 = u4Var.f14914a;
            androidx.compose.ui.platform.c cVar = this.f14642b;
            int iZ = cVar.z(i10);
            w4 w4VarB = cVar.s().b(cVar.f1311n);
            if (w4VarB != null) {
                try {
                    z3.j jVar3 = cVar.f1313p;
                    if (jVar3 != null) {
                        jVar3.f34725a.setBoundsInScreen(cVar.k(w4VarB));
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                } catch (IllegalStateException unused) {
                    pg.f0 f0Var2 = pg.f0.f21461a;
                }
            }
            w4 w4VarB2 = cVar.s().b(cVar.f1312o);
            if (w4VarB2 != null) {
                try {
                    z3.j jVar4 = cVar.f1314q;
                    if (jVar4 != null) {
                        jVar4.f34725a.setBoundsInScreen(cVar.k(w4VarB2));
                        pg.f0 f0Var3 = pg.f0.f21461a;
                    }
                } catch (IllegalStateException unused2) {
                    pg.f0 f0Var4 = pg.f0.f21461a;
                }
            }
            cVar.f1301d.invalidate();
            w4 w4VarB3 = cVar.s().b(iZ);
            if (w4VarB3 != null && (tVar = w4VarB3.f14962a) != null && (e0Var = tVar.f21810c) != null) {
                if (jVar != null) {
                    cVar.f1316s.h(iZ, jVar);
                }
                if (jVar2 != null) {
                    cVar.f1317t.h(iZ, jVar2);
                }
                cVar.v(e0Var);
            }
        }
        if (jVar != null) {
            u4Var.f14916c = (Float) jVar.f21771a.invoke();
        }
        if (jVar2 != null) {
            u4Var.f14917d = (Float) jVar2.f21771a.invoke();
        }
        return pg.f0.f21461a;
    }
}
