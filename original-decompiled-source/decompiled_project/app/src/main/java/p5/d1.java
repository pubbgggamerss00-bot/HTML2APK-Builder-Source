package p5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21200a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21201b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21202c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21203d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f21204e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f21205f;

    public d1() {
        this.f21201b = new s5.r();
        sh.z0 z0VarA = sh.a1.a(qg.z.f22752a);
        this.f21202c = z0VarA;
        sh.z0 z0VarA2 = sh.a1.a(qg.b0.f22711a);
        this.f21203d = z0VarA2;
        this.f21204e = gg.a.a(z0VarA);
        this.f21205f = gg.a.a(z0VarA2);
    }

    public void a(int i10, int i11) {
        if (!this.f21200a) {
            throw new IllegalStateException("Not a CIDFont");
        }
        ((HashMap) this.f21201b).put(Integer.valueOf(i11), Integer.valueOf(i10));
        ((HashMap) this.f21204e).put(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public void b(int i10, int i11, String str) {
        if (this.f21200a) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        ((HashMap) this.f21201b).put(Integer.valueOf(i11), Integer.valueOf(i10));
        ((HashMap) this.f21202c).put(Integer.valueOf(i10), Integer.valueOf(i11));
        ((HashMap) this.f21203d).put(str, Integer.valueOf(i11));
        ((HashMap) this.f21205f).put(Integer.valueOf(i10), str);
    }

    public abstract s c(k0 k0Var, Bundle bundle);

    public int d(int i10) {
        if (!this.f21200a) {
            throw new IllegalStateException("Not a CIDFont");
        }
        Integer num = (Integer) ((HashMap) this.f21201b).get(Integer.valueOf(i10));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int e(int i10) {
        if (this.f21200a) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        Integer num = (Integer) ((HashMap) this.f21202c).get(Integer.valueOf(i10));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void f(s entry) {
        kotlin.jvm.internal.r.e(entry, "entry");
        sh.z0 z0Var = (sh.z0) this.f21203d;
        LinkedHashSet linkedHashSetB = qg.n0.b((Set) z0Var.getValue(), entry);
        z0Var.getClass();
        z0Var.j(null, linkedHashSetB);
    }

    public void g(s sVar, boolean z10) {
        synchronized (((s5.r) this.f21201b)) {
            try {
                sh.z0 z0Var = (sh.z0) this.f21202c;
                Iterable iterable = (Iterable) z0Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (kotlin.jvm.internal.r.a((s) obj, sVar)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                z0Var.getClass();
                z0Var.j(null, arrayList);
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(s sVar, boolean z10) {
        Object objPrevious;
        sh.l0 l0Var = (sh.l0) this.f21204e;
        sh.z0 z0Var = (sh.z0) this.f21203d;
        Iterable iterable = (Iterable) z0Var.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((s) it.next()) == sVar) {
                    Iterable iterable2 = (Iterable) l0Var.f25021a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((s) it2.next()) == sVar) {
                        }
                    }
                    return;
                }
            }
        }
        LinkedHashSet linkedHashSetD = qg.n0.d((Set) z0Var.getValue(), sVar);
        z0Var.getClass();
        z0Var.j(null, linkedHashSetD);
        List list = (List) l0Var.f25021a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            s sVar2 = (s) objPrevious;
            if (!kotlin.jvm.internal.r.a(sVar2, sVar) && ((List) l0Var.f25021a.getValue()).lastIndexOf(sVar2) < ((List) l0Var.f25021a.getValue()).lastIndexOf(sVar)) {
                break;
            }
        }
        s sVar3 = (s) objPrevious;
        if (sVar3 != null) {
            LinkedHashSet linkedHashSetD2 = qg.n0.d((Set) z0Var.getValue(), sVar3);
            z0Var.getClass();
            z0Var.j(null, linkedHashSetD2);
        }
        g(sVar, z10);
    }

    public void i(s entry) {
        kotlin.jvm.internal.r.e(entry, "entry");
        sh.z0 z0Var = (sh.z0) this.f21203d;
        LinkedHashSet linkedHashSetD = qg.n0.d((Set) z0Var.getValue(), entry);
        z0Var.getClass();
        z0Var.j(null, linkedHashSetD);
    }

    public void j(s backStackEntry) {
        kotlin.jvm.internal.r.e(backStackEntry, "backStackEntry");
        synchronized (((s5.r) this.f21201b)) {
            sh.z0 z0Var = (sh.z0) this.f21202c;
            ArrayList arrayListP = qg.x.P(backStackEntry, (Collection) z0Var.getValue());
            z0Var.getClass();
            z0Var.j(null, arrayListP);
            pg.f0 f0Var = pg.f0.f21461a;
        }
    }

    public d1(boolean z10) {
        this.f21201b = new HashMap(250);
        this.f21202c = new HashMap(250);
        this.f21203d = new HashMap(250);
        this.f21204e = new HashMap();
        this.f21205f = new HashMap(250);
        this.f21200a = z10;
    }
}
