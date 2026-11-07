package y2;

import java.util.List;
import u0.u1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public c0 f33734a;

    /* renamed from: b, reason: collision with root package name */
    public k f33735b;

    public final c0 a(List<? extends i> list) {
        i iVar;
        Exception e10;
        i iVar2;
        try {
            int size = list.size();
            int i10 = 0;
            iVar = null;
            while (i10 < size) {
                try {
                    iVar2 = list.get(i10);
                } catch (Exception e11) {
                    e10 = e11;
                }
                try {
                    iVar2.a(this.f33735b);
                    i10++;
                    iVar = iVar2;
                } catch (Exception e12) {
                    e10 = e12;
                    iVar = iVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(this.f33735b.f33737a.a());
                    sb2.append(", composition=");
                    sb2.append(this.f33735b.c());
                    sb2.append(", selection=");
                    k kVar = this.f33735b;
                    sb2.append((Object) t2.j0.g(t2.k0.a(kVar.f33738b, kVar.f33739c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    qg.x.H(list, sb, "\n", new u1(iVar, this), 60);
                    String string = sb.toString();
                    kotlin.jvm.internal.r.d(string, "toString(...)");
                    throw new RuntimeException(string, e10);
                }
            }
            k kVar2 = this.f33735b;
            kVar2.getClass();
            t2.b bVar = new t2.b(kVar2.f33737a.toString());
            k kVar3 = this.f33735b;
            long jA = t2.k0.a(kVar3.f33738b, kVar3.f33739c);
            t2.j0 j0Var = t2.j0.f(this.f33734a.f33683b) ? null : new t2.j0(jA);
            c0 c0Var = new c0(bVar, j0Var != null ? j0Var.f27839a : t2.k0.a(t2.j0.d(jA), t2.j0.e(jA)), this.f33735b.c());
            this.f33734a = c0Var;
            return c0Var;
        } catch (Exception e13) {
            iVar = null;
            e10 = e13;
        }
    }
}
