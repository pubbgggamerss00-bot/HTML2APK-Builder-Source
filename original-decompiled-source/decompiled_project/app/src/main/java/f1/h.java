package f1;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p.m0;
import p.n0;
import p.x;
import p.x0;
import pg.f0;
import qg.p;
import x0.u2;
import x0.v2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Set<u2> f8792a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.b<v2> f8793b;

    /* renamed from: c, reason: collision with root package name */
    public z0.b<v2> f8794c;

    /* renamed from: d, reason: collision with root package name */
    public final z0.b<Object> f8795d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.b<eh.a<f0>> f8796e;

    /* renamed from: f, reason: collision with root package name */
    public m0<x0.h> f8797f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f8798g;

    /* renamed from: h, reason: collision with root package name */
    public final x f8799h;

    /* renamed from: i, reason: collision with root package name */
    public final x f8800i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f8801j;

    public h(n0 n0Var) {
        this.f8792a = n0Var;
        z0.b<v2> bVar = new z0.b<>(new v2[16]);
        this.f8793b = bVar;
        this.f8794c = bVar;
        this.f8795d = new z0.b<>(new Object[16]);
        this.f8796e = new z0.b<>(new eh.a[16]);
        this.f8798g = new ArrayList();
        this.f8799h = new x();
        this.f8800i = new x();
    }

    public final void a() {
        Set<u2> set = this.f8792a;
        if (set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator<u2> it = set.iterator();
            while (it.hasNext()) {
                u2 next = it.next();
                it.remove();
                next.b();
            }
            f0 f0Var = f0.f21461a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void b() {
        c(PKIFailureInfo.systemUnavail);
        z0.b<Object> bVar = this.f8795d;
        int i10 = bVar.f34702c;
        Set<u2> set = this.f8792a;
        if (i10 != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                x0 x0Var = this.f8797f;
                for (int i11 = bVar.f34702c - 1; -1 < i11; i11--) {
                    Object obj = bVar.f34700a[i11];
                    if (obj instanceof v2) {
                        u2 u2Var = ((v2) obj).f31949a;
                        set.remove(u2Var);
                        u2Var.c();
                    }
                    if (obj instanceof x0.h) {
                        if (x0Var == null || !x0Var.a(obj)) {
                            ((x0.h) obj).d();
                        } else {
                            ((x0.h) obj).a();
                        }
                    }
                }
                f0 f0Var = f0.f21461a;
            } finally {
            }
        }
        z0.b<v2> bVar2 = this.f8793b;
        if (bVar2.f34702c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                v2[] v2VarArr = bVar2.f34700a;
                int i12 = bVar2.f34702c;
                for (int i13 = 0; i13 < i12; i13++) {
                    u2 u2Var2 = v2VarArr[i13].f31949a;
                    set.remove(u2Var2);
                    u2Var2.d();
                }
                f0 f0Var2 = f0.f21461a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void c(int i10) {
        ArrayList arrayList = this.f8798g;
        if (arrayList.isEmpty()) {
            return;
        }
        int i11 = 0;
        ArrayList arrayListK = null;
        int i12 = 0;
        x xVar = null;
        x xVar2 = null;
        while (true) {
            x xVar3 = this.f8800i;
            if (i12 >= xVar3.f20751b) {
                break;
            }
            if (i10 <= xVar3.c(i12)) {
                Object objRemove = arrayList.remove(i12);
                int iF = xVar3.f(i12);
                int iF2 = this.f8799h.f(i12);
                if (arrayListK == null) {
                    arrayListK = p.k(objRemove);
                    xVar2 = new x();
                    xVar2.a(iF);
                    xVar = new x();
                    xVar.a(iF2);
                } else {
                    r.c(xVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    r.c(xVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayListK.add(objRemove);
                    xVar2.a(iF);
                    xVar.a(iF2);
                }
            } else {
                i12++;
            }
        }
        if (arrayListK != null) {
            r.c(xVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            r.c(xVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayListK.size() - 1;
            while (i11 < size) {
                int i13 = i11 + 1;
                int size2 = arrayListK.size();
                for (int i14 = i13; i14 < size2; i14++) {
                    int iC = xVar2.c(i11);
                    int iC2 = xVar2.c(i14);
                    if (iC < iC2 || (iC2 == iC && xVar.c(i11) < xVar.c(i14))) {
                        Object obj = arrayListK.get(i11);
                        arrayListK.set(i11, arrayListK.get(i14));
                        arrayListK.set(i14, obj);
                        int iC3 = xVar.c(i11);
                        xVar.g(i11, xVar.c(i14));
                        xVar.g(i14, iC3);
                        int iC4 = xVar2.c(i11);
                        xVar2.g(i11, xVar2.c(i14));
                        xVar2.g(i14, iC4);
                    }
                }
                i11 = i13;
            }
            z0.b<Object> bVar = this.f8795d;
            bVar.c(bVar.f34702c, arrayListK);
        }
    }

    public final void d(Object obj, int i10, int i11, int i12) {
        c(i10);
        if (i12 < 0 || i12 >= i10) {
            this.f8795d.b(obj);
            return;
        }
        this.f8798g.add(obj);
        this.f8799h.a(i11);
        this.f8800i.a(i12);
    }

    public final void e(v2 v2Var) {
        this.f8794c.b(v2Var);
    }
}
