package e2;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.y50;
import e2.f;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class k extends f {
    public int U;
    public ArrayList<f> S = new ArrayList<>();
    public boolean T = true;
    public boolean V = false;
    public int W = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f12817a;

        public a(f fVar) {
            this.f12817a = fVar;
        }

        @Override // e2.f.d
        public final void d(f fVar) {
            this.f12817a.y();
            fVar.w(this);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public k f12818a;

        @Override // e2.f.d
        public final void d(f fVar) {
            k kVar = this.f12818a;
            int i6 = kVar.U - 1;
            kVar.U = i6;
            if (i6 == 0) {
                kVar.V = false;
                kVar.m();
            }
            fVar.w(this);
        }

        @Override // e2.i, e2.f.d
        public final void g(f fVar) {
            k kVar = this.f12818a;
            if (kVar.V) {
                return;
            }
            kVar.F();
            kVar.V = true;
        }
    }

    @Override // e2.f
    public final void A(f.c cVar) {
        this.W |= 8;
        int size = this.S.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.S.get(i6).A(cVar);
        }
    }

    @Override // e2.f
    public final void B(TimeInterpolator timeInterpolator) {
        this.W |= 1;
        ArrayList<f> arrayList = this.S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.S.get(i6).B(timeInterpolator);
            }
        }
        this.f12792v = timeInterpolator;
    }

    @Override // e2.f
    public final void C(androidx.fragment.app.p pVar) {
        super.C(pVar);
        this.W |= 4;
        if (this.S != null) {
            for (int i6 = 0; i6 < this.S.size(); i6++) {
                this.S.get(i6).C(pVar);
            }
        }
    }

    @Override // e2.f
    public final void D() {
        this.W |= 2;
        int size = this.S.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.S.get(i6).D();
        }
    }

    @Override // e2.f
    public final void E(long j6) {
        this.f12790t = j6;
    }

    @Override // e2.f
    public final String G(String str) {
        String strG = super.G(str);
        for (int i6 = 0; i6 < this.S.size(); i6++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strG);
            sb.append("\n");
            sb.append(this.S.get(i6).G(str + "  "));
            strG = sb.toString();
        }
        return strG;
    }

    public final void H(f fVar) {
        this.S.add(fVar);
        fVar.A = this;
        long j6 = this.f12791u;
        if (j6 >= 0) {
            fVar.z(j6);
        }
        if ((this.W & 1) != 0) {
            fVar.B(this.f12792v);
        }
        if ((this.W & 2) != 0) {
            fVar.D();
        }
        if ((this.W & 4) != 0) {
            fVar.C(this.N);
        }
        if ((this.W & 8) != 0) {
            fVar.A(null);
        }
    }

    @Override // e2.f
    public final void c() {
        super.c();
        int size = this.S.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.S.get(i6).c();
        }
    }

    @Override // e2.f
    public final void d(m mVar) {
        View view = mVar.f12821b;
        if (t(view)) {
            ArrayList<f> arrayList = this.S;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                f fVar = arrayList.get(i6);
                i6++;
                f fVar2 = fVar;
                if (fVar2.t(view)) {
                    fVar2.d(mVar);
                    mVar.f12822c.add(fVar2);
                }
            }
        }
    }

    @Override // e2.f
    public final void f(m mVar) {
        int size = this.S.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.S.get(i6).f(mVar);
        }
    }

    @Override // e2.f
    public final void g(m mVar) {
        View view = mVar.f12821b;
        if (t(view)) {
            ArrayList<f> arrayList = this.S;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                f fVar = arrayList.get(i6);
                i6++;
                f fVar2 = fVar;
                if (fVar2.t(view)) {
                    fVar2.g(mVar);
                    mVar.f12822c.add(fVar2);
                }
            }
        }
    }

    @Override // e2.f
    /* renamed from: j */
    public final f clone() {
        k kVar = (k) super.clone();
        kVar.S = new ArrayList<>();
        int size = this.S.size();
        for (int i6 = 0; i6 < size; i6++) {
            f fVarClone = this.S.get(i6).clone();
            kVar.S.add(fVarClone);
            fVarClone.A = kVar;
        }
        return kVar;
    }

    @Override // e2.f
    public final void l(ViewGroup viewGroup, y50 y50Var, y50 y50Var2, ArrayList<m> arrayList, ArrayList<m> arrayList2) {
        long j6 = this.f12790t;
        int size = this.S.size();
        for (int i6 = 0; i6 < size; i6++) {
            f fVar = this.S.get(i6);
            if (j6 > 0 && (this.T || i6 == 0)) {
                long j7 = fVar.f12790t;
                if (j7 > 0) {
                    fVar.E(j7 + j6);
                } else {
                    fVar.E(j6);
                }
            }
            fVar.l(viewGroup, y50Var, y50Var2, arrayList, arrayList2);
        }
    }

    @Override // e2.f
    public final void v(View view) {
        super.v(view);
        int size = this.S.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.S.get(i6).v(view);
        }
    }

    @Override // e2.f
    public final f w(f.d dVar) {
        super.w(dVar);
        return this;
    }

    @Override // e2.f
    public final void x(View view) {
        super.x(view);
        int size = this.S.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.S.get(i6).x(view);
        }
    }

    @Override // e2.f
    public final void y() {
        if (this.S.isEmpty()) {
            F();
            m();
            return;
        }
        b bVar = new b();
        bVar.f12818a = this;
        ArrayList<f> arrayList = this.S;
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            f fVar = arrayList.get(i7);
            i7++;
            fVar.a(bVar);
        }
        this.U = this.S.size();
        if (this.T) {
            ArrayList<f> arrayList2 = this.S;
            int size2 = arrayList2.size();
            while (i6 < size2) {
                f fVar2 = arrayList2.get(i6);
                i6++;
                fVar2.y();
            }
            return;
        }
        for (int i8 = 1; i8 < this.S.size(); i8++) {
            this.S.get(i8 - 1).a(new a(this.S.get(i8)));
        }
        f fVar3 = this.S.get(0);
        if (fVar3 != null) {
            fVar3.y();
        }
    }

    @Override // e2.f
    public final void z(long j6) {
        ArrayList<f> arrayList;
        this.f12791u = j6;
        if (j6 < 0 || (arrayList = this.S) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.S.get(i6).z(j6);
        }
    }
}
