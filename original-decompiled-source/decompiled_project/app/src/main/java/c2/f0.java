package c2;

import androidx.compose.ui.platform.AndroidComposeView;
import i2.e0;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final i2.e0 f4639a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4640b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f4641c = new c0();

    /* renamed from: d, reason: collision with root package name */
    public final i2.u f4642d = new i2.u();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4643e;

    public f0(i2.e0 e0Var) {
        this.f4639a = e0Var;
        this.f4640b = new f(e0Var.I.f13790b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(d0 d0Var, AndroidComposeView androidComposeView, boolean z10) {
        Object[] objArr;
        f fVar;
        int i10;
        i2.u uVar = this.f4642d;
        if (this.f4643e) {
            return 0;
        }
        try {
            this.f4643e = true;
            j jVarA = this.f4641c.a(d0Var, androidComposeView);
            p.q<b0> qVar = jVarA.f4651a;
            int iF = qVar.f();
            for (int i11 = 0; i11 < iF; i11++) {
                b0 b0VarG = qVar.g(i11);
                if (!b0VarG.f4596d && !b0VarG.f4600h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iF2 = qVar.f();
            int i12 = 0;
            while (true) {
                fVar = this.f4640b;
                if (i12 >= iF2) {
                    break;
                }
                b0 b0VarG2 = qVar.g(i12);
                if (objArr != false || s.a(b0VarG2)) {
                    i2.e0 e0Var = this.f4639a;
                    long j10 = b0VarG2.f4595c;
                    i2.u uVar2 = this.f4642d;
                    int i13 = b0VarG2.f4601i;
                    e0.c cVar = i2.e0.U;
                    e0Var.K(j10, uVar2, i13, true);
                    if (!uVar.f14021a.d()) {
                        fVar.a(b0VarG2.f4593a, uVar, s.a(b0VarG2));
                        uVar.clear();
                    }
                }
                i12++;
            }
            boolean zB = fVar.b(jVarA, z10);
            if (jVarA.f4653c) {
                i10 = 0;
            } else {
                int iF3 = qVar.f();
                for (int i14 = 0; i14 < iF3; i14++) {
                    b0 b0VarG3 = qVar.g(i14);
                    if (!p1.c.b(s.e(b0VarG3, true), 0L) && b0VarG3.b()) {
                        i10 = 1;
                        break;
                    }
                }
                i10 = 0;
            }
            int i15 = (zB ? 1 : 0) | (i10 << 1);
            this.f4643e = false;
            return i15;
        } catch (Throwable th2) {
            this.f4643e = false;
            throw th2;
        }
    }
}
