package c2;

import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final p.q<b0> f4651a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f4652b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4653c;

    public j(p.q<b0> qVar, d0 d0Var) {
        this.f4651a = qVar;
        this.f4652b = d0Var;
    }

    public final boolean a(long j10) {
        e0 e0Var;
        List<e0> list = this.f4652b.f4613a;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                e0Var = null;
                break;
            }
            e0Var = list.get(i10);
            if (b0.a0.b(e0Var.f4618a, j10)) {
                break;
            }
            i10++;
        }
        e0 e0Var2 = e0Var;
        if (e0Var2 != null) {
            return e0Var2.f4625h;
        }
        return false;
    }
}
