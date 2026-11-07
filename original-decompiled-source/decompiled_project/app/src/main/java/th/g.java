package th;

import java.util.ArrayList;
import pg.f0;
import ph.e0;
import ph.i0;
import ph.j0;
import ph.k0;
import x0.s1;

/* loaded from: classes2.dex */
public abstract class g<T> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final tg.h f28790a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28791b;

    /* renamed from: c, reason: collision with root package name */
    public final rh.a f28792c;

    public g(tg.h hVar, int i10, rh.a aVar) {
        this.f28790a = hVar;
        this.f28791b = i10;
        this.f28792c = aVar;
    }

    @Override // sh.f
    public Object b(sh.g<? super T> gVar, tg.e<? super f0> eVar) {
        Object objC = j0.c(new e(gVar, this, null), eVar);
        return objC == ug.a.f29706a ? objC : f0.f21461a;
    }

    public String c() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // th.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sh.f<T> d(tg.h hVar, int i10, rh.a aVar) {
        tg.h hVar2 = this.f28790a;
        tg.h hVarPlus = hVar.plus(hVar2);
        rh.a aVar2 = rh.a.f23576a;
        rh.a aVar3 = this.f28792c;
        int i11 = this.f28791b;
        if (aVar == aVar2) {
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 == -2) {
                            i10 = i11;
                        } else {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (kotlin.jvm.internal.r.a(hVarPlus, hVar2) && i10 == i11 && aVar == aVar3) ? this : f(hVarPlus, i10, aVar);
    }

    public abstract Object e(rh.u<? super T> uVar, tg.e<? super f0> eVar);

    public abstract g<T> f(tg.h hVar, int i10, rh.a aVar);

    public sh.f<T> g() {
        return null;
    }

    public rh.w<T> h(i0 i0Var) {
        int i10 = this.f28791b;
        if (i10 == -3) {
            i10 = -2;
        }
        k0 k0Var = k0.f21555c;
        eh.p fVar = new f(this, null);
        rh.t tVar = new rh.t(e0.b(i0Var, this.f28790a), rh.k.a(i10, 4, this.f28792c));
        tVar.b0(k0Var, tVar, fVar);
        return tVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        tg.i iVar = tg.i.f28768a;
        tg.h hVar = this.f28790a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i10 = this.f28791b;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        rh.a aVar = rh.a.f23576a;
        rh.a aVar2 = this.f28792c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return s1.a(sb, qg.x.I(arrayList, ", ", null, null, null, 62), ']');
    }
}
