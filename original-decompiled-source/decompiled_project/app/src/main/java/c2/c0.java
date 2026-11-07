package c2;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final p.q<a> f4608a = new p.q<>((Object) null);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f4609a;

        /* renamed from: b, reason: collision with root package name */
        public final long f4610b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4611c;

        public a(long j10, long j11, boolean z10) {
            this.f4609a = j10;
            this.f4610b = j11;
            this.f4611c = z10;
        }
    }

    public final j a(d0 d0Var, AndroidComposeView androidComposeView) {
        int i10;
        long jY;
        long j10;
        boolean z10;
        List<e0> list = d0Var.f4613a;
        p.q qVar = new p.q(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            e0 e0Var = list.get(i11);
            long j11 = e0Var.f4618a;
            p.q<a> qVar2 = this.f4608a;
            a aVarB = qVar2.b(j11);
            if (aVarB == null) {
                i10 = i11;
                j10 = e0Var.f4619b;
                jY = e0Var.f4621d;
                z10 = false;
            } else {
                long j12 = aVarB.f4609a;
                boolean z11 = aVarB.f4611c;
                i10 = i11;
                jY = androidComposeView.y(aVarB.f4610b);
                j10 = j12;
                z10 = z11;
            }
            long j13 = e0Var.f4618a;
            List<e0> list2 = list;
            int i12 = size;
            qVar.d(new b0(j13, e0Var.f4619b, e0Var.f4621d, e0Var.f4622e, e0Var.f4623f, j10, jY, z10, e0Var.f4624g, e0Var.f4626i, e0Var.f4627j, e0Var.f4628k), j13);
            boolean z12 = e0Var.f4622e;
            if (z12) {
                qVar2.d(new a(e0Var.f4619b, e0Var.f4620c, z12), j11);
            } else {
                qVar2.e(j11);
            }
            i11 = i10 + 1;
            list = list2;
            size = i12;
        }
        return new j(qVar, d0Var);
    }
}
