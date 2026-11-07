package p5;

import f9.k4;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import lh.e;
import p5.k0;
import p5.x;

/* loaded from: classes.dex */
public abstract class b1<D extends k0> {

    /* renamed from: a, reason: collision with root package name */
    public x.a f21193a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21194b;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        String value();
    }

    public abstract D a();

    public final d1 b() {
        x.a aVar = this.f21193a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public k0 c(k0 k0Var) {
        return k0Var;
    }

    public void d(List list, u0 u0Var) {
        e.a aVar = new e.a(new lh.e(new lh.p(new qg.w(list), new k4(this, u0Var)), false, new lh.m(0)));
        while (aVar.hasNext()) {
            b().j((s) aVar.next());
        }
    }

    public void e(s sVar, boolean z10) {
        List list = (List) ((sh.l0) b().f21204e).f25021a.getValue();
        if (!list.contains(sVar)) {
            throw new IllegalStateException(("popBackStack was called with " + sVar + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        s sVar2 = null;
        while (f()) {
            sVar2 = (s) listIterator.previous();
            if (kotlin.jvm.internal.r.a(sVar2, sVar)) {
                break;
            }
        }
        if (sVar2 != null) {
            b().g(sVar2, z10);
        }
    }

    public boolean f() {
        return true;
    }
}
