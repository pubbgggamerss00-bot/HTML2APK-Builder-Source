package m0;

import java.util.List;
import java.util.NoSuchElementException;
import m0.z;

/* loaded from: classes.dex */
public final class t implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final p.a0 f17510a;

    /* renamed from: b, reason: collision with root package name */
    public final List<y> f17511b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17512c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17513d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17514e;

    /* renamed from: f, reason: collision with root package name */
    public final z f17515f;

    public t(p.a0 a0Var, List list, int i10, int i11, boolean z10, z zVar) {
        this.f17510a = a0Var;
        this.f17511b = list;
        this.f17512c = i10;
        this.f17513d = i11;
        this.f17514e = z10;
        this.f17515f = zVar;
        if (list.size() > 1) {
            return;
        }
        y.c.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void m(p.c0 c0Var, z zVar, y yVar, int i10, int i11) {
        z zVar2;
        if (zVar.f17595c) {
            zVar2 = new z(yVar.a(i11), yVar.a(i10), i11 > i10);
        } else {
            zVar2 = new z(yVar.a(i10), yVar.a(i11), i10 > i11);
        }
        if (i10 > i11) {
            y.c.c("minOffset should be less than or equal to maxOffset: " + zVar2);
        }
        long j10 = yVar.f17574a;
        int iD = c0Var.d(j10);
        Object[] objArr = c0Var.f20679c;
        Object obj = objArr[iD];
        c0Var.f20678b[iD] = j10;
        objArr[iD] = zVar2;
    }

    @Override // m0.i1
    public final boolean a() {
        return this.f17514e;
    }

    @Override // m0.i1
    public final y b() {
        return this.f17514e ? k() : h();
    }

    @Override // m0.i1
    public final z c() {
        return this.f17515f;
    }

    @Override // m0.i1
    public final void d(eh.l<? super y, pg.f0> lVar) {
        int iN = n(e().f17574a);
        int iN2 = n((i() == n.f17423a ? k() : h()).f17574a);
        int i10 = iN + 1;
        if (i10 >= iN2) {
            return;
        }
        while (i10 < iN2) {
            lVar.invoke(this.f17511b.get(i10));
            i10++;
        }
    }

    @Override // m0.i1
    public final y e() {
        return i() == n.f17423a ? h() : k();
    }

    @Override // m0.i1
    public final boolean f(i1 i1Var) {
        if (this.f17515f != null && i1Var != null && (i1Var instanceof t) && this.f17514e == i1Var.a() && this.f17512c == i1Var.l() && this.f17513d == i1Var.g()) {
            List<y> list = ((t) i1Var).f17511b;
            List<y> list2 = this.f17511b;
            if (list2.size() == list.size()) {
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    y yVar = list2.get(i10);
                    y yVar2 = list.get(i10);
                    if (yVar.f17574a != yVar2.f17574a || yVar.f17576c != yVar2.f17576c || yVar.f17577d != yVar2.f17577d) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // m0.i1
    public final int g() {
        return this.f17513d;
    }

    @Override // m0.i1
    public final int getSize() {
        return this.f17511b.size();
    }

    @Override // m0.i1
    public final y h() {
        return this.f17511b.get(o(this.f17513d, false));
    }

    @Override // m0.i1
    public final n i() {
        int i10 = this.f17512c;
        int i11 = this.f17513d;
        if (i10 < i11) {
            return n.f17424b;
        }
        if (i10 > i11) {
            return n.f17423a;
        }
        return this.f17511b.get(i10 / 2).b();
    }

    @Override // m0.i1
    public final p.c0 j(z zVar) {
        z.a aVar = zVar.f17593a;
        boolean z10 = zVar.f17595c;
        long j10 = aVar.f17598c;
        int i10 = aVar.f17597b;
        z.a aVar2 = zVar.f17594b;
        long j11 = aVar2.f17598c;
        int i11 = aVar2.f17597b;
        if (j10 != j11) {
            p.c0 c0Var = p.o.f20698a;
            p.c0 c0Var2 = new p.c0();
            m(c0Var2, zVar, e(), (z10 ? aVar2 : aVar).f17597b, e().f17579f.f27819a.f27809a.f27761b.length());
            d(new s(this, c0Var2, zVar));
            if (!z10) {
                aVar = aVar2;
            }
            m(c0Var2, zVar, i() == n.f17423a ? k() : h(), 0, aVar.f17597b);
            return c0Var2;
        }
        if ((!z10 || i10 < i11) && (z10 || i10 > i11)) {
            y.c.c("unexpectedly miss-crossed selection: " + zVar);
        }
        long j12 = aVar.f17598c;
        p.c0 c0Var3 = p.o.f20698a;
        p.c0 c0Var4 = new p.c0();
        c0Var4.h(zVar, j12);
        return c0Var4;
    }

    @Override // m0.i1
    public final y k() {
        return this.f17511b.get(o(this.f17512c, true));
    }

    @Override // m0.i1
    public final int l() {
        return this.f17512c;
    }

    public final int n(long j10) {
        try {
            return this.f17510a.c(j10);
        } catch (NoSuchElementException e10) {
            throw new IllegalStateException(r.a("Invalid selectableId: ", j10), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i10, boolean z10) {
        int iOrdinal = i().ordinal();
        int i11 = z10;
        if (iOrdinal == 0) {
            i11 = z10 == 0 ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new pg.l();
            }
        }
        return (i10 - (i11 ^ 1)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.f17514e);
        sb.append(", startPosition=");
        boolean z10 = true;
        float f10 = 2;
        sb.append((this.f17512c + 1) / f10);
        sb.append(", endPosition=");
        sb.append((this.f17513d + 1) / f10);
        sb.append(", crossed=");
        sb.append(i());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List<y> list = this.f17511b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            y yVar = list.get(i10);
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i10++;
            sb3.append(i10);
            sb3.append(" -> ");
            sb3.append(yVar);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String string = sb2.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }
}
