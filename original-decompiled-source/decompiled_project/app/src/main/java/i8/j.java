package i8;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import c0.g0;
import com.android.billingclient.api.Purchase;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.google.android.gms.internal.play_billing.zzbg;
import com.google.android.gms.internal.play_billing.zzbt;
import d8.c;
import d8.g;
import d8.k;
import d8.n;
import d8.p;
import eh.p;
import i8.a;
import i8.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import l9.r0;
import n8.m1;
import pg.f0;
import pg.q;
import ph.i0;
import ph.j0;
import ph.n2;
import qg.a0;
import qg.x;
import qg.z;
import sh.a1;
import sh.k0;
import sh.o0;
import sh.q0;
import sh.z0;
import tg.h;

/* loaded from: classes.dex */
public final class j implements d8.m {

    /* renamed from: r, reason: collision with root package name */
    public static final List<String> f14217r;

    /* renamed from: s, reason: collision with root package name */
    public static final List<String> f14218s;

    /* renamed from: t, reason: collision with root package name */
    public static final ArrayList f14219t;

    /* renamed from: u, reason: collision with root package name */
    public static final List<String> f14220u;

    /* renamed from: a, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f14221a;

    /* renamed from: b, reason: collision with root package name */
    public final m1 f14222b;

    /* renamed from: c, reason: collision with root package name */
    public uh.c f14223c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f14224d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f14225e;

    /* renamed from: f, reason: collision with root package name */
    public final k0 f14226f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f14227g;

    /* renamed from: h, reason: collision with root package name */
    public final z0 f14228h;

    /* renamed from: i, reason: collision with root package name */
    public final z0 f14229i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f14230j;

    /* renamed from: k, reason: collision with root package name */
    public final z0 f14231k;

    /* renamed from: l, reason: collision with root package name */
    public final z0 f14232l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f14233m;

    /* renamed from: n, reason: collision with root package name */
    public final z0 f14234n;

    /* renamed from: o, reason: collision with root package name */
    public final z0 f14235o;

    /* renamed from: p, reason: collision with root package name */
    public final z0 f14236p;

    /* renamed from: q, reason: collision with root package name */
    public final d8.e f14237q;

    @vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$onPurchasesUpdated$1$1$1", f = "BillingManager.kt", l = {334}, m = "invokeSuspend")
    public static final class a extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14238a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Purchase f14239b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f14240c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Purchase purchase, j jVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f14239b = purchase;
            this.f14240c = jVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f14239b, this.f14240c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f14238a;
            if (i10 == 0) {
                q.b(obj);
                ArrayList arrayListA = this.f14239b.a();
                int size = arrayListA.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayListA.get(i11);
                    i11++;
                    if (j.f14217r.contains((String) obj2)) {
                        break;
                    }
                }
                String str = (String) obj2;
                if (str == null) {
                    str = "";
                }
                o0 o0Var = this.f14240c.f14225e;
                this.f14238a = 1;
                if (o0Var.c(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$queryPurchases$1", f = "BillingManager.kt", l = {238, 252}, m = "invokeSuspend")
    public static final class b extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14241a;

        /* renamed from: b, reason: collision with root package name */
        public int f14242b;

        public static final class a implements d8.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ tg.j f14244a;

            public a(tg.j jVar) {
                this.f14244a = jVar;
            }

            @Override // d8.l
            public final void a(com.android.billingclient.api.a result, List<Purchase> purchases) {
                r.e(result, "result");
                r.e(purchases, "purchases");
                int i10 = result.f5606a;
                tg.j jVar = this.f14244a;
                if (i10 == 0) {
                    jVar.resumeWith(purchases);
                } else {
                    jVar.resumeWith(z.f22752a);
                }
            }
        }

        /* renamed from: i8.j$b$b, reason: collision with other inner class name */
        public static final class C0134b implements d8.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ tg.j f14245a;

            public C0134b(tg.j jVar) {
                this.f14245a = jVar;
            }

            @Override // d8.l
            public final void a(com.android.billingclient.api.a result, List<Purchase> purchases) {
                r.e(result, "result");
                r.e(purchases, "purchases");
                int i10 = result.f5606a;
                tg.j jVar = this.f14245a;
                if (i10 == 0) {
                    jVar.resumeWith(purchases);
                } else {
                    jVar.resumeWith(z.f22752a);
                }
            }
        }

        public b(tg.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return j.this.new b(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            ArrayList arrayList;
            int size;
            int i10;
            boolean z10;
            boolean z11;
            uh.c cVar;
            int size2;
            int i11;
            boolean z12;
            final j jVar = j.this;
            d8.e eVar = jVar.f14237q;
            ug.a aVar = ug.a.f29706a;
            int i12 = this.f14242b;
            if (i12 == 0) {
                q.b(obj);
                this.f14241a = jVar;
                this.f14242b = 1;
                tg.j jVar2 = new tg.j(ah.p.c(this));
                p.a aVar2 = new p.a();
                aVar2.f7540a = "inapp";
                eVar.e(aVar2.a(), new a(jVar2));
                obj = jVar2.a();
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f14241a;
                q.b(obj);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.addAll((List) obj);
                jVar.b(arrayList2, true);
                arrayList = new ArrayList();
                size = arrayList2.size();
                i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    Purchase purchase = (Purchase) obj2;
                    if (purchase.b() == 1 && r0.c(purchase)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    int size3 = arrayList.size();
                    int i13 = 0;
                    loop5: while (i13 < size3) {
                        Object obj3 = arrayList.get(i13);
                        i13++;
                        ArrayList arrayListA = ((Purchase) obj3).a();
                        if (!arrayListA.isEmpty()) {
                            int size4 = arrayListA.size();
                            int i14 = 0;
                            while (i14 < size4) {
                                Object obj4 = arrayListA.get(i14);
                                i14++;
                                if (r.a((String) obj4, "premium_upgrade")) {
                                    z10 = true;
                                    break loop5;
                                }
                            }
                        }
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (arrayList.isEmpty()) {
                    int size5 = arrayList.size();
                    int i15 = 0;
                    loop3: while (i15 < size5) {
                        Object obj5 = arrayList.get(i15);
                        i15++;
                        ArrayList arrayListA2 = ((Purchase) obj5).a();
                        if (!arrayListA2.isEmpty()) {
                            int size6 = arrayListA2.size();
                            int i16 = 0;
                            while (i16 < size6) {
                                Object obj6 = arrayListA2.get(i16);
                                i16++;
                                if (j.f14220u.contains((String) obj6)) {
                                    z11 = true;
                                    break loop3;
                                }
                            }
                        }
                    }
                    z11 = false;
                } else {
                    z11 = false;
                }
                boolean z13 = !z10 || z11;
                boolean z14 = (z11 || z10) ? false : true;
                cVar = jVar.f14223c;
                if (cVar != null) {
                    ph.h.c(cVar, null, null, new k(z13, jVar, z14, null), 3);
                }
                size2 = arrayList.size();
                i11 = 0;
                while (i11 < size2) {
                    Object obj7 = arrayList.get(i11);
                    i11++;
                    final Purchase purchase2 = (Purchase) obj7;
                    ArrayList arrayListA3 = purchase2.a();
                    if (arrayListA3.isEmpty()) {
                        z12 = false;
                    } else {
                        int size7 = arrayListA3.size();
                        int i17 = 0;
                        while (i17 < size7) {
                            Object obj8 = arrayListA3.get(i17);
                            i17++;
                            if (j.f14217r.contains((String) obj8)) {
                                z12 = true;
                                break;
                            }
                        }
                        z12 = false;
                    }
                    if (!j.d(purchase2)) {
                        if (z12) {
                            String strC = purchase2.c();
                            if (strC == null) {
                                throw new IllegalArgumentException("Purchase token must be set");
                            }
                            d8.h hVar = new d8.h();
                            hVar.f7493a = strC;
                            eVar.b(hVar, new d8.i() { // from class: i8.b
                                @Override // d8.i
                                public final void a(com.android.billingclient.api.a billingResult, String str) {
                                    j jVar3;
                                    uh.c cVar2;
                                    r.e(billingResult, "billingResult");
                                    r.e(str, "<unused var>");
                                    if (billingResult.f5606a != 0 || (cVar2 = (jVar3 = jVar).f14223c) == null) {
                                        return;
                                    }
                                    ph.h.c(cVar2, null, null, new l(purchase2, jVar3, null), 3);
                                }
                            });
                        } else if (purchase2.f5605c.optBoolean("acknowledged", true)) {
                            continue;
                        } else {
                            String strC2 = purchase2.c();
                            if (strC2 == null) {
                                throw new IllegalArgumentException("Purchase token must be set");
                            }
                            d8.a aVar3 = new d8.a();
                            aVar3.f7420a = strC2;
                            eVar.a(aVar3, new i8.c());
                        }
                    }
                }
                return f0.f21461a;
            }
            q.b(obj);
            List list2 = (List) obj;
            this.f14241a = list2;
            this.f14242b = 2;
            tg.j jVar3 = new tg.j(ah.p.c(this));
            p.a aVar4 = new p.a();
            aVar4.f7540a = "subs";
            eVar.e(aVar4.a(), new C0134b(jVar3));
            Object objA = jVar3.a();
            if (objA != aVar) {
                list = list2;
                obj = objA;
                ArrayList arrayList22 = new ArrayList();
                arrayList22.addAll(list);
                arrayList22.addAll((List) obj);
                jVar.b(arrayList22, true);
                arrayList = new ArrayList();
                size = arrayList22.size();
                i10 = 0;
                while (i10 < size) {
                }
                if (arrayList.isEmpty()) {
                }
                if (arrayList.isEmpty()) {
                }
                if (z10) {
                }
                if (z11) {
                }
                cVar = jVar.f14223c;
                if (cVar != null) {
                }
                size2 = arrayList.size();
                i11 = 0;
                while (i11 < size2) {
                }
                return f0.f21461a;
            }
            return aVar;
        }
    }

    public static final class c implements d8.f {
        public c() {
        }

        @Override // d8.f
        public final void a(com.android.billingclient.api.a result) {
            j jVar = j.this;
            z0 z0Var = jVar.f14227g;
            r.e(result, "result");
            int i10 = result.f5606a;
            if (i10 == 0) {
                z0Var.setValue(a.C0133a.f14198a);
                jVar.f("inapp", j.f14219t);
                jVar.f("subs", j.f14220u);
                jVar.g();
                return;
            }
            Log.w("BillingManager", "Billing setup failed: " + i10 + " " + result.f5608c);
            String str = result.f5608c;
            r.d(str, "getDebugMessage(...)");
            a.d dVar = new a.d(str);
            z0Var.getClass();
            z0Var.j(null, dVar);
        }

        @Override // d8.f
        public final void b() {
            j.this.f14227g.setValue(a.c.f14200a);
        }
    }

    static {
        List<String> listJ = qg.p.j("support_coffee", "support_meal", "support_sponsor");
        f14217r = listJ;
        List<String> listJ2 = qg.p.j("credits_500", "credits_1500", "credits_4000");
        f14218s = listJ2;
        f14219t = x.O(listJ2, x.O(listJ, g0.c("premium_upgrade")));
        f14220u = g0.c("pro_subscription_monthly");
    }

    public j(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, m1 settingsRepository) {
        d8.e q0Var;
        r.e(settingsRepository, "settingsRepository");
        this.f14221a = hilt_HtmlToApkApplication;
        this.f14222b = settingsRepository;
        this.f14224d = new k0(q0.b(5, 5, null));
        o0 o0VarB = q0.b(5, 5, null);
        this.f14225e = o0VarB;
        this.f14226f = new k0(o0VarB);
        z0 z0VarA = a1.a(a.c.f14200a);
        this.f14227g = z0VarA;
        this.f14228h = z0VarA;
        z0 z0VarA2 = a1.a(a0.f22708a);
        this.f14229i = z0VarA2;
        this.f14230j = z0VarA2;
        Boolean bool = Boolean.FALSE;
        z0 z0VarA3 = a1.a(bool);
        this.f14231k = z0VarA3;
        this.f14232l = z0VarA3;
        z0 z0VarA4 = a1.a(bool);
        this.f14233m = z0VarA4;
        this.f14234n = z0VarA4;
        z0 z0VarA5 = a1.a(z.f22752a);
        this.f14235o = z0VarA5;
        this.f14236p = z0VarA5;
        c.a aVar = new c.a(hilt_HtmlToApkApplication);
        aVar.f7437c = this;
        aVar.f7435a = new aa.c();
        if (aVar.f7437c == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (aVar.f7435a == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        aVar.f7435a.getClass();
        if (aVar.f7437c != null) {
            aa.c cVar = aVar.f7435a;
            j jVar = aVar.f7437c;
            q0Var = aVar.a() ? new d8.q0(cVar, hilt_HtmlToApkApplication, jVar, aVar) : new d8.e(cVar, hilt_HtmlToApkApplication, jVar, aVar);
        } else {
            aa.c cVar2 = aVar.f7435a;
            q0Var = aVar.a() ? new d8.q0(cVar2, hilt_HtmlToApkApplication, aVar) : new d8.e(cVar2, hilt_HtmlToApkApplication, aVar);
        }
        this.f14237q = q0Var;
        c();
        i();
        uh.c cVar3 = this.f14223c;
        if (cVar3 != null) {
            ph.h.c(cVar3, null, null, new h(this, null), 3);
        }
        uh.c cVar4 = this.f14223c;
        if (cVar4 != null) {
            ph.h.c(cVar4, null, null, new i(this, null), 3);
        }
    }

    public static boolean d(Purchase purchase) {
        ArrayList arrayListA = purchase.a();
        if (!arrayListA.isEmpty()) {
            int size = arrayListA.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListA.get(i10);
                i10++;
                if (f14218s.contains((String) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // d8.m
    public final void a(com.android.billingclient.api.a result, List<Purchase> list) {
        boolean z10;
        r.e(result, "result");
        if (result.f5606a == 0 && list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Purchase purchase = (Purchase) obj;
                if (purchase.b() == 1 && r0.c(purchase)) {
                    arrayList.add(obj);
                }
            }
            b(list, false);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                final Purchase purchase2 = (Purchase) obj2;
                ArrayList arrayListA = purchase2.a();
                if (arrayListA.isEmpty()) {
                    z10 = false;
                } else {
                    int size2 = arrayListA.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj3 = arrayListA.get(i11);
                        i11++;
                        if (f14217r.contains((String) obj3)) {
                            z10 = true;
                            break;
                        }
                    }
                    z10 = false;
                }
                if (!d(purchase2)) {
                    d8.e eVar = this.f14237q;
                    if (z10) {
                        String strC = purchase2.c();
                        if (strC == null) {
                            throw new IllegalArgumentException("Purchase token must be set");
                        }
                        d8.h hVar = new d8.h();
                        hVar.f7493a = strC;
                        eVar.b(hVar, new d8.i() { // from class: i8.d
                            @Override // d8.i
                            public final void a(com.android.billingclient.api.a billingResult, String str) {
                                j jVar;
                                uh.c cVar;
                                r.e(billingResult, "billingResult");
                                r.e(str, "<unused var>");
                                if (billingResult.f5606a != 0 || (cVar = (jVar = this.f14204a).f14223c) == null) {
                                    return;
                                }
                                ph.h.c(cVar, null, null, new j.a(purchase2, jVar, null), 3);
                            }
                        });
                    } else if (purchase2.f5605c.optBoolean("acknowledged", true)) {
                        continue;
                    } else {
                        String strC2 = purchase2.c();
                        if (strC2 == null) {
                            throw new IllegalArgumentException("Purchase token must be set");
                        }
                        d8.a aVar = new d8.a();
                        aVar.f7420a = strC2;
                        eVar.a(aVar, new e());
                    }
                }
            }
        }
        g();
    }

    public final void b(List<? extends Purchase> list, boolean z10) {
        int i10;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Purchase purchase = (Purchase) next;
            if (purchase.b() == 1) {
                if (!d(purchase)) {
                    ArrayList arrayListA = purchase.a();
                    if (!arrayListA.isEmpty()) {
                        int size = arrayListA.size();
                        while (i10 < size) {
                            Object obj = arrayListA.get(i10);
                            i10++;
                            String str = (String) obj;
                            if (r.a(str, "premium_upgrade") || f14220u.contains(str)) {
                            }
                        }
                    }
                }
                arrayList.add(next);
                break;
            }
        }
        z0 z0Var = this.f14235o;
        if (!z10) {
            ArrayList arrayListO = x.O(arrayList, (Collection) z0Var.getValue());
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayListO.size();
            while (i10 < size2) {
                Object obj2 = arrayListO.get(i10);
                i10++;
                if (hashSet.add(((Purchase) obj2).c())) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        z0Var.getClass();
        z0Var.j(null, arrayList);
    }

    public final void c() {
        uh.c cVar = this.f14223c;
        if (cVar == null || !j0.d(cVar)) {
            n2 n2VarA = ah.l.a();
            wh.c cVar2 = ph.z0.f21632a;
            this.f14223c = j0.a(h.a.C0291a.c(n2VarA, wh.b.f31563c));
        }
    }

    public final void e(Activity activity, String productId, String str) {
        ArrayList arrayList;
        k.d dVar;
        String str2;
        r.e(productId, "productId");
        d8.k kVar = (d8.k) ((Map) this.f14229i.getValue()).get(productId);
        if (kVar == null) {
            return;
        }
        g.a.C0080a c0080a = new g.a.C0080a();
        c0080a.f7490a = kVar;
        if (kVar.a() != null) {
            kVar.a().getClass();
            String str3 = kVar.a().f7512b;
            if (str3 != null) {
                c0080a.f7491b = str3;
            }
        }
        if (r.a(kVar.f7505d, "subs") && (arrayList = kVar.f7509h) != null && (dVar = (k.d) x.D(arrayList)) != null && (str2 = dVar.f7518a) != null) {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            c0080a.f7491b = str2;
        }
        zzbg.zzc(c0080a.f7490a, "ProductDetails is required for constructing ProductDetailsParams.");
        ArrayList arrayList2 = new ArrayList(g0.c(new g.a(c0080a)));
        if (str == null) {
            str = null;
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        if (zIsEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            if (((g.a) obj) == null) {
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
        }
        d8.g gVar = new d8.g();
        gVar.f7483a = (zIsEmpty || ((g.a) arrayList2.get(0)).f7488a.f7503b.optString("packageName").isEmpty()) ? false : true;
        gVar.f7484b = str;
        boolean z10 = (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        if (z10 && !zIsEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        gVar.f7485c = new g.b();
        gVar.f7487e = new ArrayList();
        gVar.f7486d = zzbt.zzj(arrayList2);
        this.f14237q.c(activity, gVar);
    }

    public final void f(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
        for (String str2 : list) {
            n.b.a aVar = new n.b.a();
            aVar.f7530a = str2;
            aVar.f7531b = str;
            if ("first_party".equals(str)) {
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }
            if (aVar.f7530a == null) {
                throw new IllegalArgumentException("Product id must be provided.");
            }
            arrayList.add(new n.b(aVar));
        }
        n.a aVar2 = new n.a();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            n.b bVar = (n.b) obj;
            if (!"play_pass_subs".equals(bVar.f7529b)) {
                hashSet.add(bVar.f7529b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        zzbt zzbtVarZzj = zzbt.zzj(arrayList);
        aVar2.f7527a = zzbtVarZzj;
        if (zzbtVarZzj == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        this.f14237q.d(new d8.n(aVar2), new g(str, this));
    }

    public final void g() {
        uh.c cVar;
        if (r.a(this.f14227g.getValue(), a.C0133a.f14198a) && (cVar = this.f14223c) != null) {
            ph.h.c(cVar, null, null, new b(null), 3);
        }
    }

    public final void h() {
        if (!r.a(this.f14227g.getValue(), a.C0133a.f14198a)) {
            i();
        } else {
            f("inapp", f14219t);
            f("subs", f14220u);
        }
    }

    public final void i() {
        c();
        z0 z0Var = this.f14227g;
        if (r.a(z0Var.getValue(), a.C0133a.f14198a)) {
            return;
        }
        z0Var.setValue(a.b.f14199a);
        this.f14237q.f(new c());
    }
}
