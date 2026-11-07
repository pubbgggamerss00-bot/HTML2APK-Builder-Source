package i8;

import a9.z1;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.R;
import d8.p;
import eh.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import l9.d0;
import l9.r0;
import n8.m1;
import pg.f0;
import pg.q;
import ph.i0;
import ph.z0;
import qg.x;
import qg.z;

@vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$restorePurchases$3", f = "BillingManager.kt", l = {430, 444, 483, 484, 487, 491, 496}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f14256a;

    /* renamed from: b, reason: collision with root package name */
    public int f14257b;

    /* renamed from: c, reason: collision with root package name */
    public int f14258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f14259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f14260e;

    @vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$restorePurchases$3$2", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f14261a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f14262b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z1 z1Var, j jVar, tg.e eVar) {
            super(2, eVar);
            this.f14261a = z1Var;
            this.f14262b = jVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f14261a, this.f14262b, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            q.b(obj);
            Boolean bool = Boolean.TRUE;
            List<String> list = j.f14217r;
            j jVar = this.f14262b;
            jVar.getClass();
            d0 d0Var = d0.f16789a;
            Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = jVar.f14221a;
            d0Var.getClass();
            String string = d0.g(hilt_HtmlToApkApplication).getString(R.string.billing_restore_success);
            r.d(string, "getString(...)");
            this.f14261a.invoke(bool, string);
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$restorePurchases$3$3", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f14263a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f14264b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z1 z1Var, j jVar, tg.e eVar) {
            super(2, eVar);
            this.f14263a = z1Var;
            this.f14264b = jVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f14263a, this.f14264b, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            q.b(obj);
            Boolean bool = Boolean.FALSE;
            List<String> list = j.f14217r;
            j jVar = this.f14264b;
            jVar.getClass();
            d0 d0Var = d0.f16789a;
            Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = jVar.f14221a;
            d0Var.getClass();
            String string = d0.g(hilt_HtmlToApkApplication).getString(R.string.billing_restore_not_found);
            r.d(string, "getString(...)");
            this.f14263a.invoke(bool, string);
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$restorePurchases$3$4", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
    public static final class c extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f14265a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f14266b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Exception f14267c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z1 z1Var, j jVar, Exception exc, tg.e eVar) {
            super(2, eVar);
            this.f14265a = z1Var;
            this.f14266b = jVar;
            this.f14267c = exc;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f14265a, this.f14266b, this.f14267c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            q.b(obj);
            Boolean bool = Boolean.FALSE;
            List<String> list = j.f14217r;
            j jVar = this.f14266b;
            jVar.getClass();
            d0 d0Var = d0.f16789a;
            Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = jVar.f14221a;
            d0Var.getClass();
            Context contextG = d0.g(hilt_HtmlToApkApplication);
            String message = this.f14267c.getMessage();
            if (message == null) {
                message = "";
            }
            String string = contextG.getString(R.string.billing_restore_error, message);
            r.d(string, "getString(...)");
            this.f14265a.invoke(bool, string);
            return f0.f21461a;
        }
    }

    public static final class d implements d8.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tg.j f14268a;

        public d(tg.j jVar) {
            this.f14268a = jVar;
        }

        @Override // d8.l
        public final void a(com.android.billingclient.api.a result, List<Purchase> purchases) {
            r.e(result, "result");
            r.e(purchases, "purchases");
            int i10 = result.f5606a;
            tg.j jVar = this.f14268a;
            if (i10 == 0) {
                jVar.resumeWith(purchases);
            } else {
                jVar.resumeWith(z.f22752a);
            }
        }
    }

    public static final class e implements d8.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tg.j f14269a;

        public e(tg.j jVar) {
            this.f14269a = jVar;
        }

        @Override // d8.l
        public final void a(com.android.billingclient.api.a result, List<Purchase> purchases) {
            r.e(result, "result");
            r.e(purchases, "purchases");
            int i10 = result.f5606a;
            tg.j jVar = this.f14269a;
            if (i10 == 0) {
                jVar.resumeWith(purchases);
            } else {
                jVar.resumeWith(z.f22752a);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z1 z1Var, j jVar, tg.e eVar) {
        super(2, eVar);
        this.f14259d = jVar;
        this.f14260e = z1Var;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new o(this.f14260e, this.f14259d, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((o) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0217, code lost:
    
        if (r15 != r0) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ed A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:106:0x0202, B:10:0x0023, B:102:0x01ea, B:13:0x002a, B:96:0x01be, B:99:0x01cd, B:16:0x0031, B:89:0x01ab, B:93:0x01b2, B:19:0x003a, B:31:0x00a5, B:33:0x00b7, B:35:0x00c6, B:37:0x00cc, B:38:0x00d0, B:40:0x00dc, B:42:0x00ee, B:44:0x00f4, B:46:0x00fa, B:47:0x010c, B:48:0x0113, B:49:0x0114, B:62:0x014e, B:85:0x0199, B:103:0x01ed, B:65:0x0156, B:67:0x015d, B:70:0x0170, B:72:0x0177, B:52:0x011c, B:54:0x0123, B:57:0x0136, B:59:0x013d, B:22:0x0042, B:28:0x0075, B:25:0x0049), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5 A[Catch: Exception -> 0x0020, PHI: r1 r15
      0x00a5: PHI (r1v9 java.util.List) = (r1v6 java.util.List), (r1v20 java.util.List) binds: [B:29:0x00a1, B:19:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r15v13 java.lang.Object) = (r15v12 java.lang.Object), (r15v0 java.lang.Object) binds: [B:29:0x00a1, B:19:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:106:0x0202, B:10:0x0023, B:102:0x01ea, B:13:0x002a, B:96:0x01be, B:99:0x01cd, B:16:0x0031, B:89:0x01ab, B:93:0x01b2, B:19:0x003a, B:31:0x00a5, B:33:0x00b7, B:35:0x00c6, B:37:0x00cc, B:38:0x00d0, B:40:0x00dc, B:42:0x00ee, B:44:0x00f4, B:46:0x00fa, B:47:0x010c, B:48:0x0113, B:49:0x0114, B:62:0x014e, B:85:0x0199, B:103:0x01ed, B:65:0x0156, B:67:0x015d, B:70:0x0170, B:72:0x0177, B:52:0x011c, B:54:0x0123, B:57:0x0136, B:59:0x013d, B:22:0x0042, B:28:0x0075, B:25:0x0049), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:106:0x0202, B:10:0x0023, B:102:0x01ea, B:13:0x002a, B:96:0x01be, B:99:0x01cd, B:16:0x0031, B:89:0x01ab, B:93:0x01b2, B:19:0x003a, B:31:0x00a5, B:33:0x00b7, B:35:0x00c6, B:37:0x00cc, B:38:0x00d0, B:40:0x00dc, B:42:0x00ee, B:44:0x00f4, B:46:0x00fa, B:47:0x010c, B:48:0x0113, B:49:0x0114, B:62:0x014e, B:85:0x0199, B:103:0x01ed, B:65:0x0156, B:67:0x015d, B:70:0x0170, B:72:0x0177, B:52:0x011c, B:54:0x0123, B:57:0x0136, B:59:0x013d, B:22:0x0042, B:28:0x0075, B:25:0x0049), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:106:0x0202, B:10:0x0023, B:102:0x01ea, B:13:0x002a, B:96:0x01be, B:99:0x01cd, B:16:0x0031, B:89:0x01ab, B:93:0x01b2, B:19:0x003a, B:31:0x00a5, B:33:0x00b7, B:35:0x00c6, B:37:0x00cc, B:38:0x00d0, B:40:0x00dc, B:42:0x00ee, B:44:0x00f4, B:46:0x00fa, B:47:0x010c, B:48:0x0113, B:49:0x0114, B:62:0x014e, B:85:0x0199, B:103:0x01ed, B:65:0x0156, B:67:0x015d, B:70:0x0170, B:72:0x0177, B:52:0x011c, B:54:0x0123, B:57:0x0136, B:59:0x013d, B:22:0x0042, B:28:0x0075, B:25:0x0049), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:106:0x0202, B:10:0x0023, B:102:0x01ea, B:13:0x002a, B:96:0x01be, B:99:0x01cd, B:16:0x0031, B:89:0x01ab, B:93:0x01b2, B:19:0x003a, B:31:0x00a5, B:33:0x00b7, B:35:0x00c6, B:37:0x00cc, B:38:0x00d0, B:40:0x00dc, B:42:0x00ee, B:44:0x00f4, B:46:0x00fa, B:47:0x010c, B:48:0x0113, B:49:0x0114, B:62:0x014e, B:85:0x0199, B:103:0x01ed, B:65:0x0156, B:67:0x015d, B:70:0x0170, B:72:0x0177, B:52:0x011c, B:54:0x0123, B:57:0x0136, B:59:0x013d, B:22:0x0042, B:28:0x0075, B:25:0x0049), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:106:0x0202, B:10:0x0023, B:102:0x01ea, B:13:0x002a, B:96:0x01be, B:99:0x01cd, B:16:0x0031, B:89:0x01ab, B:93:0x01b2, B:19:0x003a, B:31:0x00a5, B:33:0x00b7, B:35:0x00c6, B:37:0x00cc, B:38:0x00d0, B:40:0x00dc, B:42:0x00ee, B:44:0x00f4, B:46:0x00fa, B:47:0x010c, B:48:0x0113, B:49:0x0114, B:62:0x014e, B:85:0x0199, B:103:0x01ed, B:65:0x0156, B:67:0x015d, B:70:0x0170, B:72:0x0177, B:52:0x011c, B:54:0x0123, B:57:0x0136, B:59:0x013d, B:22:0x0042, B:28:0x0075, B:25:0x0049), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:106:0x0202, B:10:0x0023, B:102:0x01ea, B:13:0x002a, B:96:0x01be, B:99:0x01cd, B:16:0x0031, B:89:0x01ab, B:93:0x01b2, B:19:0x003a, B:31:0x00a5, B:33:0x00b7, B:35:0x00c6, B:37:0x00cc, B:38:0x00d0, B:40:0x00dc, B:42:0x00ee, B:44:0x00f4, B:46:0x00fa, B:47:0x010c, B:48:0x0113, B:49:0x0114, B:62:0x014e, B:85:0x0199, B:103:0x01ed, B:65:0x0156, B:67:0x015d, B:70:0x0170, B:72:0x0177, B:52:0x011c, B:54:0x0123, B:57:0x0136, B:59:0x013d, B:22:0x0042, B:28:0x0075, B:25:0x0049), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01be A[Catch: Exception -> 0x0020, PHI: r1
      0x01be: PHI (r1v23 int) = (r1v21 int), (r1v26 int) binds: [B:94:0x01bb, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:106:0x0202, B:10:0x0023, B:102:0x01ea, B:13:0x002a, B:96:0x01be, B:99:0x01cd, B:16:0x0031, B:89:0x01ab, B:93:0x01b2, B:19:0x003a, B:31:0x00a5, B:33:0x00b7, B:35:0x00c6, B:37:0x00cc, B:38:0x00d0, B:40:0x00dc, B:42:0x00ee, B:44:0x00f4, B:46:0x00fa, B:47:0x010c, B:48:0x0113, B:49:0x0114, B:62:0x014e, B:85:0x0199, B:103:0x01ed, B:65:0x0156, B:67:0x015d, B:70:0x0170, B:72:0x0177, B:52:0x011c, B:54:0x0123, B:57:0x0136, B:59:0x013d, B:22:0x0042, B:28:0x0075, B:25:0x0049), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cc  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        ArrayList arrayList;
        int size;
        int i10;
        int size2;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        m1 m1Var;
        boolean z13;
        ug.a aVar = ug.a.f29706a;
        int i13 = this.f14258c;
        z1 z1Var = this.f14260e;
        j jVar = this.f14259d;
        try {
        } catch (Exception e10) {
            wh.c cVar = z0.f21632a;
            qh.g gVar = uh.o.f29764a;
            c cVar2 = new c(z1Var, jVar, e10, null);
            this.f14256a = null;
            this.f14258c = 7;
            obj = ph.h.e(gVar, cVar2, this);
        }
        switch (i13) {
            case 0:
                q.b(obj);
                this.f14256a = jVar;
                this.f14258c = 1;
                tg.j jVar2 = new tg.j(ah.p.c(this));
                d8.e eVar = jVar.f14237q;
                p.a aVar2 = new p.a();
                aVar2.f7540a = "inapp";
                eVar.e(aVar2.a(), new d(jVar2));
                obj = jVar2.a();
                if (obj != aVar) {
                    list = (List) obj;
                    this.f14256a = list;
                    this.f14258c = 2;
                    tg.j jVar3 = new tg.j(ah.p.c(this));
                    d8.e eVar2 = jVar.f14237q;
                    p.a aVar3 = new p.a();
                    aVar3.f7540a = "subs";
                    eVar2.e(aVar3.a(), new e(jVar3));
                    obj = jVar3.a();
                    if (obj == aVar) {
                        ArrayList arrayListO = x.O((List) obj, list);
                        arrayList = new ArrayList();
                        size = arrayListO.size();
                        i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayListO.get(i10);
                            i10++;
                            Purchase purchase = (Purchase) obj2;
                            if (purchase.b() == 1 && r0.c(purchase)) {
                                arrayList.add(obj2);
                            }
                        }
                        List<String> list2 = j.f14217r;
                        jVar.b(arrayListO, true);
                        size2 = arrayList.size();
                        i11 = 0;
                        while (i11 < size2) {
                            Object obj3 = arrayList.get(i11);
                            i11++;
                            Purchase purchase2 = (Purchase) obj3;
                            if (!purchase2.f5605c.optBoolean("acknowledged", true) && !j.d(purchase2)) {
                                String strC = purchase2.c();
                                if (strC == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.a aVar4 = new d8.a();
                                aVar4.f7420a = strC;
                                jVar.f14237q.a(aVar4, new n());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            int size3 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size3) {
                                Object obj4 = arrayList.get(i14);
                                i14++;
                                ArrayList arrayListA = ((Purchase) obj4).a();
                                if (!arrayListA.isEmpty()) {
                                    int size4 = arrayListA.size();
                                    int i15 = 0;
                                    while (i15 < size4) {
                                        Object obj5 = arrayListA.get(i15);
                                        i15++;
                                        if (r.a((String) obj5, "premium_upgrade")) {
                                            z10 = true;
                                            if (arrayList.isEmpty()) {
                                            }
                                        }
                                    }
                                }
                            }
                            z10 = false;
                            if (arrayList.isEmpty()) {
                            }
                        } else {
                            z10 = false;
                            if (arrayList.isEmpty()) {
                                z11 = false;
                                z12 = z10 || z11;
                                int i16 = (z11 || z10) ? 0 : 1;
                                if (z12) {
                                    wh.c cVar3 = z0.f21632a;
                                    qh.g gVar2 = uh.o.f29764a;
                                    b bVar = new b(z1Var, jVar, null);
                                    this.f14256a = null;
                                    this.f14258c = 6;
                                    obj = ph.h.e(gVar2, bVar, this);
                                    if (obj == aVar) {
                                    }
                                } else {
                                    m1 m1Var2 = jVar.f14222b;
                                    this.f14256a = null;
                                    this.f14257b = i16;
                                    this.f14258c = 3;
                                    if (m1Var2.d(true, this) != aVar) {
                                        i12 = i16;
                                        m1Var = jVar.f14222b;
                                        z13 = i12 == 0;
                                        this.f14257b = i12;
                                        this.f14258c = 4;
                                        if (m1Var.e(z13, this) == aVar) {
                                            sh.z0 z0Var = jVar.f14231k;
                                            Boolean bool = Boolean.TRUE;
                                            z0Var.getClass();
                                            z0Var.j(null, bool);
                                            sh.z0 z0Var2 = jVar.f14233m;
                                            Boolean boolValueOf = Boolean.valueOf(i12 != 0);
                                            z0Var2.getClass();
                                            z0Var2.j(null, boolValueOf);
                                            wh.c cVar4 = z0.f21632a;
                                            qh.g gVar3 = uh.o.f29764a;
                                            a aVar5 = new a(z1Var, jVar, null);
                                            this.f14258c = 5;
                                            obj = ph.h.e(gVar3, aVar5, this);
                                            if (obj == aVar) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                int size5 = arrayList.size();
                                int i17 = 0;
                                while (i17 < size5) {
                                    Object obj6 = arrayList.get(i17);
                                    i17++;
                                    ArrayList arrayListA2 = ((Purchase) obj6).a();
                                    if (!arrayListA2.isEmpty()) {
                                        int size6 = arrayListA2.size();
                                        int i18 = 0;
                                        while (i18 < size6) {
                                            Object obj7 = arrayListA2.get(i18);
                                            i18++;
                                            if (j.f14220u.contains((String) obj7)) {
                                                z11 = true;
                                                if (z10) {
                                                    if (z11) {
                                                        if (z12) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                z11 = false;
                                if (z10) {
                                }
                            }
                        }
                        return f0.f21461a;
                    }
                }
                return aVar;
            case 1:
                q.b(obj);
                list = (List) obj;
                this.f14256a = list;
                this.f14258c = 2;
                tg.j jVar32 = new tg.j(ah.p.c(this));
                d8.e eVar22 = jVar.f14237q;
                p.a aVar32 = new p.a();
                aVar32.f7540a = "subs";
                eVar22.e(aVar32.a(), new e(jVar32));
                obj = jVar32.a();
                if (obj == aVar) {
                }
                return aVar;
            case 2:
                list = (List) this.f14256a;
                q.b(obj);
                ArrayList arrayListO2 = x.O((List) obj, list);
                arrayList = new ArrayList();
                size = arrayListO2.size();
                i10 = 0;
                while (i10 < size) {
                }
                List<String> list22 = j.f14217r;
                jVar.b(arrayListO2, true);
                size2 = arrayList.size();
                i11 = 0;
                while (i11 < size2) {
                }
                if (arrayList.isEmpty()) {
                }
                return f0.f21461a;
            case 3:
                i12 = this.f14257b;
                q.b(obj);
                m1Var = jVar.f14222b;
                if (i12 == 0) {
                }
                this.f14257b = i12;
                this.f14258c = 4;
                if (m1Var.e(z13, this) == aVar) {
                }
                return aVar;
            case 4:
                i12 = this.f14257b;
                q.b(obj);
                sh.z0 z0Var3 = jVar.f14231k;
                Boolean bool2 = Boolean.TRUE;
                z0Var3.getClass();
                z0Var3.j(null, bool2);
                sh.z0 z0Var22 = jVar.f14233m;
                Boolean boolValueOf2 = Boolean.valueOf(i12 != 0);
                z0Var22.getClass();
                z0Var22.j(null, boolValueOf2);
                wh.c cVar42 = z0.f21632a;
                qh.g gVar32 = uh.o.f29764a;
                a aVar52 = new a(z1Var, jVar, null);
                this.f14258c = 5;
                obj = ph.h.e(gVar32, aVar52, this);
                if (obj == aVar) {
                }
                return f0.f21461a;
            case 5:
                q.b(obj);
                return f0.f21461a;
            case 6:
                q.b(obj);
                return f0.f21461a;
            case 7:
                q.b(obj);
                return f0.f21461a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
