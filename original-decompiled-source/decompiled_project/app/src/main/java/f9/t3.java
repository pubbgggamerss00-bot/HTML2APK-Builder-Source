package f9;

import android.content.Context;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class t3 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f10542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f10543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f10544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f10546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f10547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f10548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10549h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<Integer>> f10550j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10551k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f10552l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f10553m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.n1<j> f10554n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10555p;

    public t3(x0.n1<String> n1Var, x0.l1 l1Var, x0.n1<String> n1Var2, x0.n1<Boolean> n1Var3, long j10, ph.i0 i0Var, Context context, x0.n1<Boolean> n1Var4, x0.n1<List<Integer>> n1Var5, x0.n1<Boolean> n1Var6, x0.n1<y2.c0> n1Var7, x0.n1<String> n1Var8, x0.n1<j> n1Var9, x0.n1<Boolean> n1Var10) {
        this.f10542a = n1Var;
        this.f10543b = l1Var;
        this.f10544c = n1Var2;
        this.f10545d = n1Var3;
        this.f10546e = j10;
        this.f10547f = i0Var;
        this.f10548g = context;
        this.f10549h = n1Var4;
        this.f10550j = n1Var5;
        this.f10551k = n1Var6;
        this.f10552l = n1Var7;
        this.f10553m = n1Var8;
        this.f10554n = n1Var9;
        this.f10555p = n1Var10;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        String str;
        final x0.n1<Boolean> n1Var;
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        List<String> list = d1.f9265a;
        final x0.n1<String> n1Var2 = this.f10542a;
        String value = n1Var2.getValue();
        jVar2.L(976696706);
        boolean zK = jVar2.K(n1Var2);
        final x0.l1 l1Var = this.f10543b;
        boolean zK2 = zK | jVar2.K(l1Var);
        Object objG = jVar2.g();
        Object obj = j.a.f31715a;
        if (zK2 || objG == obj) {
            objG = new eh.l() { // from class: f9.m3
                @Override // eh.l
                public final Object invoke(Object obj2) {
                    String it = (String) obj2;
                    kotlin.jvm.internal.r.e(it, "it");
                    List<String> list2 = d1.f9265a;
                    n1Var2.setValue(it);
                    l1Var.f(0);
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG);
        }
        eh.l lVar = (eh.l) objG;
        jVar2.B();
        x0.n1<String> n1Var3 = this.f10544c;
        String value2 = n1Var3.getValue();
        jVar2.L(976704273);
        boolean zK3 = jVar2.K(n1Var3);
        Object objG2 = jVar2.g();
        if (zK3 || objG2 == obj) {
            objG2 = new n3(n1Var3, 0);
            jVar2.C(objG2);
        }
        eh.l lVar2 = (eh.l) objG2;
        jVar2.B();
        x0.n1<Boolean> n1Var4 = this.f10545d;
        boolean zBooleanValue = n1Var4.getValue().booleanValue();
        jVar2.L(976708485);
        boolean zK4 = jVar2.K(n1Var4);
        Object objG3 = jVar2.g();
        if (zK4 || objG3 == obj) {
            objG3 = new b9.t0(n1Var4, 1);
            jVar2.C(objG3);
        }
        eh.a aVar = (eh.a) objG3;
        jVar2.B();
        final x0.n1<List<Integer>> n1Var5 = this.f10550j;
        int size = n1Var5.getValue().size();
        int iG = n1Var5.getValue().isEmpty() ? 0 : l1Var.g() + 1;
        boolean zBooleanValue2 = this.f10551k.getValue().booleanValue();
        jVar2.L(976719618);
        boolean zK5 = jVar2.K(l1Var) | jVar2.K(n1Var2);
        Object objG4 = jVar2.g();
        final x0.n1<y2.c0> n1Var6 = this.f10552l;
        if (zK5 || objG4 == obj) {
            objG4 = new eh.a() { // from class: f9.o3
                @Override // eh.a
                public final Object invoke() {
                    List<String> list2 = d1.f9265a;
                    d1.m(n1Var5, l1Var, n1Var6, n1Var2, r0.g() - 1);
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG4);
        }
        eh.a aVar2 = (eh.a) objG4;
        jVar2.B();
        jVar2.L(976722050);
        boolean zK6 = jVar2.K(l1Var) | jVar2.K(n1Var2);
        Object objG5 = jVar2.g();
        if (zK6 || objG5 == obj) {
            objG5 = new eh.a() { // from class: f9.p3
                @Override // eh.a
                public final Object invoke() {
                    List<String> list2 = d1.f9265a;
                    x0.l1 l1Var2 = l1Var;
                    d1.m(n1Var5, l1Var2, n1Var6, n1Var2, l1Var2.g() + 1);
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG5);
        }
        eh.a aVar3 = (eh.a) objG5;
        boolean zK7 = jVar2.K(l1Var) | androidx.datastore.preferences.protobuf.e.b(jVar2, 976724561, n1Var3) | jVar2.K(n1Var2);
        Object objG6 = jVar2.g();
        if (zK7 || objG6 == obj) {
            final x0.n1<String> n1Var7 = this.f10553m;
            final x0.n1<List<Integer>> n1Var8 = this.f10550j;
            final x0.n1<String> n1Var9 = this.f10544c;
            final x0.n1<j> n1Var10 = this.f10554n;
            final x0.n1<Boolean> n1Var11 = this.f10555p;
            final x0.l1 l1Var2 = this.f10543b;
            str = value;
            n1Var = n1Var4;
            Object obj2 = new eh.a() { // from class: f9.q3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // eh.a
                public final Object invoke() {
                    List<String> list2 = d1.f9265a;
                    String str2 = (String) n1Var7.getValue();
                    if (str2.length() != 0) {
                        x0.n1 n1Var12 = n1Var8;
                        if (!((List) n1Var12.getValue()).isEmpty()) {
                            x0.n1 n1Var13 = n1Var6;
                            int iE = t2.j0.e(((y2.c0) n1Var13.getValue()).f33683b);
                            int iD = t2.j0.d(((y2.c0) n1Var13.getValue()).f33683b);
                            if (iD - iE == str2.length() && ((List) n1Var12.getValue()).contains(Integer.valueOf(iE))) {
                                String str3 = ((y2.c0) n1Var13.getValue()).f33682a.f27761b;
                                x0.n1 n1Var14 = n1Var9;
                                String string = mh.x.M(str3, iE, iD, (String) n1Var14.getValue()).toString();
                                int length = ((String) n1Var14.getValue()).length() + iE;
                                y2.c0 c0Var = new y2.c0(string, t2.k0.a(length, length), 4);
                                n1Var13.setValue(c0Var);
                                ((j) n1Var10.getValue()).a(c0Var, true);
                                n1Var11.setValue(Boolean.TRUE);
                            } else {
                                x0.l1 l1Var3 = l1Var2;
                                d1.m(n1Var12, l1Var3, n1Var13, n1Var2, l1Var3.g());
                            }
                        }
                    }
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(obj2);
            objG6 = obj2;
        } else {
            str = value;
            n1Var = n1Var4;
        }
        eh.a aVar4 = (eh.a) objG6;
        boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar2, 976726637, n1Var3) | jVar2.l(this.f10547f) | jVar2.l(this.f10548g);
        Object objG7 = jVar2.g();
        if (zB || objG7 == obj) {
            final ph.i0 i0Var = this.f10547f;
            final x0.n1<String> n1Var12 = this.f10553m;
            final x0.n1<Boolean> n1Var13 = this.f10551k;
            final x0.n1<String> n1Var14 = this.f10544c;
            final Context context = this.f10548g;
            final x0.n1<j> n1Var15 = this.f10554n;
            objG7 = new eh.a() { // from class: f9.r3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // eh.a
                public final Object invoke() {
                    List<String> list2 = d1.f9265a;
                    String str2 = (String) n1Var12.getValue();
                    if (str2.length() != 0) {
                        x0.n1 n1Var16 = n1Var13;
                        if (!((Boolean) n1Var16.getValue()).booleanValue()) {
                            x0.n1 n1Var17 = n1Var6;
                            String str3 = ((y2.c0) n1Var17.getValue()).f33682a.f27761b;
                            String str4 = (String) n1Var14.getValue();
                            n1Var16.setValue(Boolean.TRUE);
                            ph.h.c(i0Var, null, null, new y3(str3, context, str2, str4, n1Var17, n1Var15, n1Var16, null), 3);
                        }
                    }
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG7);
        }
        eh.a aVar5 = (eh.a) objG7;
        final x0.n1<Boolean> n1Var16 = this.f10549h;
        boolean zB2 = androidx.datastore.preferences.protobuf.e.b(jVar2, 976728606, n1Var16) | jVar2.K(n1Var) | jVar2.K(n1Var2);
        Object objG8 = jVar2.g();
        if (zB2 || objG8 == obj) {
            objG8 = new eh.a() { // from class: f9.s3
                @Override // eh.a
                public final Object invoke() {
                    List<String> list2 = d1.f9265a;
                    Boolean bool = Boolean.FALSE;
                    n1Var16.setValue(bool);
                    n1Var.setValue(bool);
                    n1Var2.setValue("");
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG8);
        }
        jVar2.B();
        d1.e(str, lVar, value2, lVar2, zBooleanValue, aVar, size, iG, this.f10546e, zBooleanValue2, aVar2, aVar3, aVar4, aVar5, (eh.a) objG8, jVar2, 0);
        return pg.f0.f21461a;
    }
}
