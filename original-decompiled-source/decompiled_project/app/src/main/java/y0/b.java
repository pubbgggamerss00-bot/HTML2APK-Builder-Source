package y0;

import java.util.ArrayList;
import x0.k;
import x0.q;
import x0.t0;
import x0.z2;
import y0.d;
import y0.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final k f33613a;

    /* renamed from: b, reason: collision with root package name */
    public a f33614b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33615c;

    /* renamed from: f, reason: collision with root package name */
    public int f33618f;

    /* renamed from: g, reason: collision with root package name */
    public int f33619g;

    /* renamed from: l, reason: collision with root package name */
    public int f33624l;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f33616d = new t0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f33617e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f33620h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f33621i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f33622j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f33623k = -1;

    public b(k kVar, a aVar) {
        this.f33613a = kVar;
        this.f33614b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f33620h;
        if (arrayList.isEmpty()) {
            this.f33619g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i10 = this.f33619g;
        if (i10 > 0) {
            e eVar = this.f33614b.f33612a;
            eVar.M(d.h0.f33644c);
            eVar.f33666c[eVar.f33667d - eVar.f33664a[eVar.f33665b - 1].f33627a] = i10;
            this.f33619g = 0;
        }
        ArrayList arrayList = this.f33620h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f33614b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = arrayList.get(i11);
        }
        aVar.getClass();
        if (size != 0) {
            e eVar2 = aVar.f33612a;
            eVar2.M(d.h.f33643c);
            e.b.a(eVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i10 = this.f33624l;
        if (i10 > 0) {
            int i11 = this.f33621i;
            if (i11 >= 0) {
                b();
                e eVar = this.f33614b.f33612a;
                eVar.M(d.x.f33661c);
                int i12 = eVar.f33667d - eVar.f33664a[eVar.f33665b - 1].f33627a;
                int[] iArr = eVar.f33666c;
                iArr[i12] = i11;
                iArr[i12 + 1] = i10;
                this.f33621i = -1;
            } else {
                int i13 = this.f33623k;
                int i14 = this.f33622j;
                b();
                e eVar2 = this.f33614b.f33612a;
                eVar2.M(d.s.f33656c);
                int i15 = eVar2.f33667d - eVar2.f33664a[eVar2.f33665b - 1].f33627a;
                int[] iArr2 = eVar2.f33666c;
                iArr2[i15 + 1] = i13;
                iArr2[i15] = i14;
                iArr2[i15 + 2] = i10;
                this.f33622j = -1;
                this.f33623k = -1;
            }
            this.f33624l = 0;
        }
    }

    public final void d(boolean z10) {
        k kVar = this.f33613a;
        int i10 = z10 ? kVar.F.f31998i : kVar.F.f31996g;
        int i11 = i10 - this.f33618f;
        if (i11 < 0) {
            q.c("Tried to seek backward");
        }
        if (i11 > 0) {
            e eVar = this.f33614b.f33612a;
            eVar.M(d.a.f33629c);
            eVar.f33666c[eVar.f33667d - eVar.f33664a[eVar.f33665b - 1].f33627a] = i11;
            this.f33618f = i10;
        }
    }

    public final void e() {
        z2 z2Var = this.f33613a.F;
        if (z2Var.f31992c > 0) {
            int i10 = z2Var.f31998i;
            t0 t0Var = this.f33616d;
            if (t0Var.a(-2) != i10) {
                if (!this.f33615c && this.f33617e) {
                    d(false);
                    this.f33614b.f33612a.M(d.n.f33651c);
                    this.f33615c = true;
                }
                if (i10 > 0) {
                    x0.b bVarA = z2Var.a(i10);
                    t0Var.c(i10);
                    d(false);
                    e eVar = this.f33614b.f33612a;
                    eVar.M(d.m.f33650c);
                    e.b.a(eVar, 0, bVarA);
                    this.f33615c = true;
                }
            }
        }
    }

    public final void f(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                q.c("Invalid remove index " + i10);
            }
            if (this.f33621i == i10) {
                this.f33624l += i11;
                return;
            }
            c();
            this.f33621i = i10;
            this.f33624l = i11;
        }
    }
}
