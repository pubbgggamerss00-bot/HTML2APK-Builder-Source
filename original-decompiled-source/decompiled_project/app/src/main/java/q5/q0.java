package q5;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.l;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import f9.s2;
import j1.d;
import j2.h3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p.d1;
import p5.c1;
import p5.k0;
import p5.o0;
import p5.s0;
import p5.u0;
import p5.x;
import p5.x0;
import p5.y;
import q5.e;
import qg.l0;
import r.j2;
import r.k2;
import r.v1;
import r.w1;
import r.x1;
import s.c2;
import s.y1;
import s.z0;
import x0.h2;
import x0.j;
import x0.k1;
import x0.n1;
import x0.r3;
import x0.u1;

/* loaded from: classes.dex */
public final class q0 {
    public static final void a(final s0 s0Var, final String str, final androidx.compose.ui.d dVar, j1.d dVar2, final eh.l lVar, final eh.l lVar2, final eh.l lVar3, final eh.l lVar4, final eh.l lVar5, x0.j jVar, final int i10) {
        j1.d dVar3;
        final j1.d dVar4;
        x0.k kVarP = jVar.p(1840250294);
        int i11 = i10 | (kVarP.l(s0Var) ? 4 : 2) | (kVarP.K(str) ? 32 : 16) | (kVarP.K(dVar) ? 256 : 128) | 27648 | (kVarP.l(lVar) ? 131072 : 65536) | (kVarP.l(lVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.l(lVar3) ? 8388608 : 4194304) | (kVarP.l(lVar4) ? 67108864 : 33554432) | 805306368;
        char c10 = kVarP.l(lVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i11) == 306783378 && (c10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            dVar4 = dVar2;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                dVar3 = d.a.f14602a;
            } else {
                kVarP.v();
                dVar3 = dVar2;
            }
            kVarP.U();
            boolean z10 = ((i11 & 112) == 32) | ((c10 & 14) == 4);
            Object objG = kVarP.g();
            if (z10 || objG == j.a.f31715a) {
                p5.p0 p0Var = new p5.p0(s0Var.f21304b.f24497s, str);
                lVar5.invoke(p0Var);
                objG = p0Var.c();
                kVarP.C(objG);
            }
            int i12 = i11 & 8078;
            int i13 = i11 >> 3;
            int i14 = (i13 & 29360128) | i12 | (57344 & i13) | (458752 & i13) | (3670016 & i13) | 100663296;
            j1.d dVar5 = dVar3;
            b(s0Var, (p5.o0) objG, dVar, dVar5, lVar, lVar2, lVar3, lVar4, kVarP, i14);
            dVar4 = dVar5;
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, dVar, dVar4, lVar, lVar2, lVar3, lVar4, lVar5, i10) { // from class: q5.w

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f22041b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f22042c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ j1.d f22043d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.l f22044e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.l f22045f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.l f22046g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.l f22047h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ eh.l f22048j;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    q0.a(this.f22040a, this.f22041b, this.f22042c, this.f22043d, this.f22044e, this.f22045f, this.f22046g, this.f22047h, this.f22048j, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x068f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final s0 s0Var, final p5.o0 graph, final androidx.compose.ui.d dVar, final j1.d dVar2, final eh.l lVar, final eh.l lVar2, final eh.l lVar3, final eh.l lVar4, x0.j jVar, final int i10) throws Resources.NotFoundException {
        x0.k kVar;
        androidx.lifecycle.t tVar;
        int i11;
        c1 c1Var;
        boolean z10;
        final n1 n1Var;
        c1 c1Var2;
        int i12;
        o oVar;
        x0.k kVar2;
        final p.e0 e0Var;
        Object obj;
        x0.k kVar3;
        e eVar;
        boolean z11;
        int[] intArray;
        int[] iArr;
        int[] iArr2;
        ArrayList arrayList;
        String strA;
        p5.k0 k0VarA;
        p5.o0 o0Var;
        Bundle bundle;
        p5.k0 k0VarA2;
        p5.o0 o0Var2;
        x0.k kVar4;
        x0.k kVarP = jVar.p(-1964664536);
        int i13 = (i10 & 6) == 0 ? (kVarP.l(s0Var) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i13 |= kVarP.l(graph) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= kVarP.K(dVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= kVarP.l(lVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= kVarP.l(lVar2) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i13 |= kVarP.l(lVar3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i10 & 12582912) == 0) {
            i13 |= kVarP.l(lVar4) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i13 |= kVarP.l(null) ? 67108864 : 33554432;
        }
        int i14 = i13;
        if ((38347923 & i14) == 38347922 && kVarP.s()) {
            kVarP.v();
            kVar4 = kVarP;
        } else {
            kVarP.r0();
            if ((i10 & 1) != 0 && !kVarP.a0()) {
                kVarP.v();
            }
            kVarP.U();
            androidx.lifecycle.t tVar2 = (androidx.lifecycle.t) kVarP.f(h5.k.f12264a);
            b1 b1VarA = k5.b.a(kVarP);
            if (b1VarA == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            a1 viewModelStore = b1VarA.getViewModelStore();
            s0Var.getClass();
            s5.l lVar5 = s0Var.f21304b;
            kotlin.jvm.internal.r.e(viewModelStore, "viewModelStore");
            lVar5.getClass();
            c1 c1Var3 = lVar5.f24497s;
            if (!kotlin.jvm.internal.r.a(lVar5.f24493o, y.a.a(viewModelStore))) {
                if (!lVar5.f24484f.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                lVar5.f24493o = y.a.a(viewModelStore);
            }
            kotlin.jvm.internal.r.e(graph, "graph");
            lVar5.getClass();
            LinkedHashMap linkedHashMap = lVar5.f24498t;
            s5.q qVar = graph.f21253f;
            qg.l<p5.s> lVar6 = lVar5.f24484f;
            if (!lVar6.isEmpty() && lVar5.j() == l.b.f2319a) {
                throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            }
            if (kotlin.jvm.internal.r.a(lVar5.f24481c, graph)) {
                kVar = kVarP;
                tVar = tVar2;
                i11 = i14;
                c1Var = c1Var3;
                int iF = qVar.f24518b.f();
                for (int i15 = 0; i15 < iF; i15++) {
                    p5.k0 k0VarG = qVar.f24518b.g(i15);
                    p5.o0 o0Var3 = lVar5.f24481c;
                    kotlin.jvm.internal.r.b(o0Var3);
                    int iD = o0Var3.f21253f.f24518b.d(i15);
                    p5.o0 o0Var4 = lVar5.f24481c;
                    kotlin.jvm.internal.r.b(o0Var4);
                    p.c1<p5.k0> c1Var4 = o0Var4.f21253f.f24518b;
                    if (c1Var4.f20582a) {
                        d1.a(c1Var4);
                    }
                    int iA = q.a.a(c1Var4.f20585d, iD, c1Var4.f20583b);
                    if (iA >= 0) {
                        Object[] objArr = c1Var4.f20584c;
                        Object obj2 = objArr[iA];
                        objArr[iA] = k0VarG;
                    }
                }
                Iterator<p5.s> it = lVar6.iterator();
                while (it.hasNext()) {
                    p5.s next = it.next();
                    int i16 = p5.k0.f21233e;
                    qg.l0 l0Var = new qg.l0(lh.j.k(k0.a.b(next.f21269b)));
                    p5.k0 k0VarA3 = lVar5.f24481c;
                    kotlin.jvm.internal.r.b(k0VarA3);
                    Iterator it2 = l0Var.iterator();
                    while (true) {
                        ListIterator<T> listIterator = ((l0.a) it2).f22731a;
                        if (listIterator.hasPrevious()) {
                            p5.k0 k0Var = (p5.k0) listIterator.previous();
                            if (!kotlin.jvm.internal.r.a(k0Var, lVar5.f24481c) || !kotlin.jvm.internal.r.a(k0VarA3, graph)) {
                                if (k0VarA3 instanceof p5.o0) {
                                    k0VarA3 = ((p5.o0) k0VarA3).f21253f.a(k0Var.f21235b.f24511d);
                                    kotlin.jvm.internal.r.b(k0VarA3);
                                }
                            }
                        }
                    }
                    kotlin.jvm.internal.r.e(k0VarA3, "<set-?>");
                    next.f21269b = k0VarA3;
                }
            } else {
                p5.o0 o0Var5 = lVar5.f24481c;
                if (o0Var5 != null) {
                    ArrayList arrayList2 = new ArrayList(lVar5.f24490l.keySet());
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList2.get(i17);
                        int i18 = i17 + 1;
                        Integer num = (Integer) obj3;
                        kotlin.jvm.internal.r.b(num);
                        int i19 = size;
                        int iIntValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((x.a) it3.next()).f21200a = true;
                            i18 = i18;
                        }
                        int i20 = i18;
                        boolean zS = lVar5.s(iIntValue, null, x0.a(new s5.j(0)));
                        Iterator it4 = linkedHashMap.values().iterator();
                        while (it4.hasNext()) {
                            ((x.a) it4.next()).f21200a = false;
                            it4 = it4;
                            zS = zS;
                        }
                        if (zS) {
                            lVar5.o(iIntValue, true, false);
                        }
                        size = i19;
                        i17 = i20;
                    }
                    lVar5.o(o0Var5.f21235b.f24511d, true, false);
                }
                lVar5.f24481c = graph;
                c1 c1Var5 = lVar5.f24497s;
                final p5.x xVar = lVar5.f24479a;
                s5.e context = xVar.f21305c;
                Bundle bundle2 = lVar5.f24482d;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList arrayListH = c6.b.h(bundle2, "android-support-nav:controller:navigatorState:names");
                    int size2 = arrayListH.size();
                    int i21 = 0;
                    while (i21 < size2) {
                        Object obj4 = arrayListH.get(i21);
                        i21++;
                        int i22 = size2;
                        String str = (String) obj4;
                        c1Var5.b(str);
                        if (bundle2.containsKey(str)) {
                            c6.b.f(bundle2, str);
                        }
                        size2 = i22;
                    }
                }
                Bundle[] bundleArr = lVar5.f24483e;
                if (bundleArr != null) {
                    int length = bundleArr.length;
                    int i23 = 0;
                    while (i23 < length) {
                        Bundle[] bundleArr2 = bundleArr;
                        Bundle state = bundleArr2[i23];
                        int i24 = length;
                        kotlin.jvm.internal.r.e(state, "state");
                        state.setClassLoader(p5.t.class.getClassLoader());
                        String strG = c6.b.g(state, "nav-entry-state:id");
                        int iB = c6.b.b(state, "nav-entry-state:destination-id");
                        Bundle bundleF = c6.b.f(state, "nav-entry-state:args");
                        int i25 = i23;
                        Bundle bundleF2 = c6.b.f(state, "nav-entry-state:saved-state");
                        p5.k0 k0VarD = lVar5.d(iB, null);
                        if (k0VarD == null) {
                            int i26 = p5.k0.f21233e;
                            StringBuilder sbA = e.e.a("Restoring the Navigation back stack failed: destination ", k0.a.a(context, iB), " cannot be found from the current destination ");
                            sbA.append(lVar5.h());
                            throw new IllegalStateException(sbA.toString());
                        }
                        l.b hostLifecycleState = lVar5.j();
                        p5.y yVar = lVar5.f24493o;
                        kotlin.jvm.internal.r.e(context, "context");
                        kotlin.jvm.internal.r.e(hostLifecycleState, "hostLifecycleState");
                        Context context2 = context.f24461a;
                        bundleF.setClassLoader(context2 != null ? context2.getClassLoader() : null);
                        p5.s sVar = new p5.s(context, k0VarD, bundleF, hostLifecycleState, yVar, strG, bundleF2);
                        p5.b1 b1VarB = c1Var5.b(k0VarD.f21234a);
                        Object aVar = linkedHashMap.get(b1VarB);
                        if (aVar == null) {
                            aVar = new x.a(xVar, b1VarB);
                            linkedHashMap.put(b1VarB, aVar);
                        }
                        lVar6.addLast(sVar);
                        ((x.a) aVar).k(sVar);
                        p5.o0 o0Var6 = sVar.f21269b.f21236c;
                        if (o0Var6 != null) {
                            lVar5.l(sVar, lVar5.f(o0Var6.f21235b.f24511d));
                        }
                        i23 = i25 + 1;
                        bundleArr = bundleArr2;
                        length = i24;
                    }
                    lVar5.f24480b.invoke();
                    lVar5.f24483e = null;
                }
                Collection collectionValues = qg.k0.j(c1Var5.f21198a).values();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : collectionValues) {
                    if (!((p5.b1) obj5).f21194b) {
                        arrayList3.add(obj5);
                    }
                }
                int size3 = arrayList3.size();
                int i27 = 0;
                while (i27 < size3) {
                    Object obj6 = arrayList3.get(i27);
                    i27++;
                    p5.b1 navigator = (p5.b1) obj6;
                    Object aVar2 = linkedHashMap.get(navigator);
                    if (aVar2 == null) {
                        kotlin.jvm.internal.r.e(navigator, "navigator");
                        aVar2 = new x.a(xVar, navigator);
                        linkedHashMap.put(navigator, aVar2);
                    }
                    navigator.getClass();
                    navigator.f21193a = (x.a) aVar2;
                    navigator.f21194b = true;
                }
                if (lVar5.f24481c == null || !lVar6.isEmpty()) {
                    kVar = kVarP;
                    tVar = tVar2;
                    i11 = i14;
                    c1Var = c1Var3;
                    lVar5.b();
                } else {
                    Activity activity = xVar.f21306d;
                    if (xVar.f21307e || activity == null) {
                        kVar = kVarP;
                        tVar = tVar2;
                        i11 = i14;
                        c1Var = c1Var3;
                        p5.o0 o0Var7 = lVar5.f24481c;
                        kotlin.jvm.internal.r.b(o0Var7);
                        lVar5.n(o0Var7, null, null);
                    } else {
                        Intent intent = activity.getIntent();
                        s5.l lVar7 = xVar.f21304b;
                        if (intent != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e10) {
                                    i11 = i14;
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e10);
                                    intArray = null;
                                }
                            } else {
                                intArray = null;
                            }
                            i11 = i14;
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
                            Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle3 != null) {
                                bundleA.putAll(bundle3);
                            }
                            if (intArray == null || intArray.length == 0) {
                                p5.o0 o0VarK = lVar7.k();
                                iArr = intArray;
                                tVar = tVar2;
                                kVar = kVarP;
                                k0.b bVarG = o0VarK.g(new p5.i0(intent.getData(), intent.getAction(), intent.getType()), o0VarK);
                                if (bVarG != null) {
                                    p5.k0 k0Var2 = bVarG.f21238a;
                                    qg.l lVar8 = new qg.l();
                                    p5.k0 k0Var3 = k0Var2;
                                    while (true) {
                                        s5.o oVar2 = k0Var3.f21235b;
                                        c1Var = c1Var3;
                                        p5.o0 o0Var8 = k0Var3.f21236c;
                                        if (o0Var8 == null || o0Var8.f21253f.f24519c != oVar2.f24511d) {
                                            lVar8.addFirst(k0Var3);
                                        }
                                        if (kotlin.jvm.internal.r.a(o0Var8, null) || o0Var8 == null) {
                                            break;
                                        }
                                        k0Var3 = o0Var8;
                                        c1Var3 = c1Var;
                                    }
                                    List listC0 = qg.x.c0(lVar8);
                                    ArrayList arrayList4 = new ArrayList(qg.p.h(listC0, 10));
                                    Iterator it5 = listC0.iterator();
                                    while (it5.hasNext()) {
                                        arrayList4.add(Integer.valueOf(((p5.k0) it5.next()).f21235b.f24511d));
                                    }
                                    int[] iArrB0 = qg.x.b0(arrayList4);
                                    Bundle bundleC = k0Var2.c(bVarG.f21239b);
                                    if (bundleC != null) {
                                        bundleA.putAll(bundleC);
                                    }
                                    iArr2 = iArrB0;
                                    arrayList = null;
                                }
                                if (iArr2 == null && iArr2.length != 0) {
                                    lVar7.getClass();
                                    p5.o0 o0Var9 = lVar7.f24481c;
                                    int length2 = iArr2.length;
                                    int i28 = 0;
                                    while (true) {
                                        if (i28 >= length2) {
                                            strA = null;
                                            break;
                                        }
                                        int i29 = iArr2[i28];
                                        if (i28 == 0) {
                                            p5.o0 o0Var10 = lVar7.f24481c;
                                            kotlin.jvm.internal.r.b(o0Var10);
                                            k0VarA2 = o0Var10.f21235b.f24511d == i29 ? lVar7.f24481c : null;
                                        } else {
                                            kotlin.jvm.internal.r.b(o0Var9);
                                            k0VarA2 = o0Var9.f21253f.a(i29);
                                        }
                                        if (k0VarA2 == null) {
                                            int i30 = p5.k0.f21233e;
                                            strA = k0.a.a(lVar7.f24479a.f21305c, i29);
                                            break;
                                        }
                                        if (i28 != iArr2.length - 1 && (k0VarA2 instanceof p5.o0)) {
                                            while (true) {
                                                o0Var2 = (p5.o0) k0VarA2;
                                                kotlin.jvm.internal.r.b(o0Var2);
                                                s5.q qVar2 = o0Var2.f21253f;
                                                if (!(qVar2.a(qVar2.f24519c) instanceof p5.o0)) {
                                                    break;
                                                } else {
                                                    k0VarA2 = qVar2.a(qVar2.f24519c);
                                                }
                                            }
                                            o0Var9 = o0Var2;
                                        }
                                        i28++;
                                    }
                                    if (strA != null) {
                                        String message = "Could not find destination " + strA + " in the navigation graph, ignoring the deep link from " + intent;
                                        kotlin.jvm.internal.r.e(message, "message");
                                        Log.i("NavController", message);
                                    } else {
                                        bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        int length3 = iArr2.length;
                                        Bundle[] bundleArr3 = new Bundle[length3];
                                        for (int i31 = 0; i31 < length3; i31++) {
                                            Bundle bundleA2 = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
                                            bundleA2.putAll(bundleA);
                                            if (arrayList != null && (bundle = (Bundle) arrayList.get(i31)) != null) {
                                                bundleA2.putAll(bundle);
                                            }
                                            bundleArr3[i31] = bundleA2;
                                        }
                                        int flags = intent.getFlags();
                                        int i32 = flags & 268435456;
                                        if (i32 != 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            Context context3 = xVar.f21303a;
                                            ArrayList arrayList5 = new ArrayList();
                                            ComponentName component = intent.getComponent();
                                            if (component == null) {
                                                component = intent.resolveActivity(context3.getPackageManager());
                                            }
                                            if (component != null) {
                                                int size4 = arrayList5.size();
                                                try {
                                                    for (Intent intentA = o3.g.a(context3, component); intentA != null; intentA = o3.g.a(context3, intentA.getComponent())) {
                                                        arrayList5.add(size4, intentA);
                                                    }
                                                } catch (PackageManager.NameNotFoundException e11) {
                                                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                    throw new IllegalArgumentException(e11);
                                                }
                                            }
                                            arrayList5.add(intent);
                                            if (arrayList5.isEmpty()) {
                                                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                                            }
                                            Intent[] intentArr = (Intent[]) arrayList5.toArray(new Intent[0]);
                                            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                            if (!p3.b.startActivities(context3, intentArr, null)) {
                                                Intent intent2 = new Intent(intentArr[intentArr.length - 1]);
                                                intent2.addFlags(268435456);
                                                context3.startActivity(intent2);
                                            }
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else if (i32 != 0) {
                                            if (!lVar7.f24484f.isEmpty()) {
                                                p5.o0 o0Var11 = lVar7.f24481c;
                                                kotlin.jvm.internal.r.b(o0Var11);
                                                lVar7.o(o0Var11.f21235b.f24511d, true, false);
                                            }
                                            int i33 = 0;
                                            while (i33 < iArr2.length) {
                                                int i34 = iArr2[i33];
                                                int i35 = i33 + 1;
                                                Bundle bundle4 = bundleArr3[i33];
                                                final p5.k0 k0VarD2 = lVar7.d(i34, null);
                                                if (k0VarD2 == null) {
                                                    int i36 = p5.k0.f21233e;
                                                    StringBuilder sbA2 = e.e.a("Deep Linking failed: destination ", k0.a.a(context, i34), " cannot be found from the current destination ");
                                                    sbA2.append(lVar7.h());
                                                    throw new IllegalStateException(sbA2.toString());
                                                }
                                                lVar7.n(k0VarD2, bundle4, x0.a(new eh.l() { // from class: p5.w
                                                    @Override // eh.l
                                                    public final Object invoke(Object obj7) {
                                                        s5.l lVar9 = xVar.f21304b;
                                                        w0 navOptions = (w0) obj7;
                                                        kotlin.jvm.internal.r.e(navOptions, "$this$navOptions");
                                                        pg.f0 f0Var = pg.f0.f21461a;
                                                        u0.a aVar3 = navOptions.f21296a;
                                                        aVar3.f21291e = 0;
                                                        aVar3.f21292f = 0;
                                                        k0 k0Var4 = k0VarD2;
                                                        if (k0Var4 instanceof o0) {
                                                            int i37 = k0.f21233e;
                                                            Iterator it6 = k0.a.b(k0Var4).iterator();
                                                            while (true) {
                                                                if (!it6.hasNext()) {
                                                                    int i38 = o0.f21252g;
                                                                    navOptions.f21299d = o0.a.a(lVar9.i()).f21235b.f24511d;
                                                                    navOptions.f21301f = false;
                                                                    e1 e1Var = new e1();
                                                                    e1Var.f21208b = true;
                                                                    pg.f0 f0Var2 = pg.f0.f21461a;
                                                                    navOptions.f21301f = e1Var.f21207a;
                                                                    navOptions.f21302g = e1Var.f21208b;
                                                                    break;
                                                                }
                                                                k0 k0Var5 = (k0) it6.next();
                                                                k0 k0VarH = lVar9.h();
                                                                if (kotlin.jvm.internal.r.a(k0Var5, k0VarH != null ? k0VarH.f21236c : null)) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        return pg.f0.f21461a;
                                                    }
                                                }));
                                                i33 = i35;
                                            }
                                            xVar.f21307e = true;
                                        } else {
                                            p5.o0 o0Var12 = lVar7.f24481c;
                                            int length4 = iArr2.length;
                                            for (int i37 = 0; i37 < length4; i37++) {
                                                int i38 = iArr2[i37];
                                                Bundle bundle5 = bundleArr3[i37];
                                                if (i37 == 0) {
                                                    k0VarA = lVar7.f24481c;
                                                } else {
                                                    kotlin.jvm.internal.r.b(o0Var12);
                                                    k0VarA = o0Var12.f21253f.a(i38);
                                                }
                                                if (k0VarA == null) {
                                                    int i39 = p5.k0.f21233e;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + k0.a.a(context, i38) + " cannot be found in graph " + o0Var12);
                                                }
                                                if (i37 == iArr2.length - 1) {
                                                    p5.o0 o0Var13 = lVar7.f24481c;
                                                    kotlin.jvm.internal.r.b(o0Var13);
                                                    lVar7.n(k0VarA, bundle5, new u0(false, false, o0Var13.f21235b.f24511d, true, false, 0, 0));
                                                } else if (k0VarA instanceof p5.o0) {
                                                    while (true) {
                                                        o0Var = (p5.o0) k0VarA;
                                                        kotlin.jvm.internal.r.b(o0Var);
                                                        s5.q qVar3 = o0Var.f21253f;
                                                        if (!(qVar3.a(qVar3.f24519c) instanceof p5.o0)) {
                                                            break;
                                                        } else {
                                                            k0VarA = qVar3.a(qVar3.f24519c);
                                                        }
                                                    }
                                                    o0Var12 = o0Var;
                                                }
                                            }
                                            xVar.f21307e = true;
                                        }
                                    }
                                }
                            } else {
                                iArr = intArray;
                                kVar = kVarP;
                                tVar = tVar2;
                            }
                            c1Var = c1Var3;
                            arrayList = parcelableArrayList;
                            iArr2 = iArr;
                            if (iArr2 == null) {
                            }
                        }
                        p5.o0 o0Var72 = lVar5.f24481c;
                        kotlin.jvm.internal.r.b(o0Var72);
                        lVar5.n(o0Var72, null, null);
                    }
                }
            }
            c1 c1Var6 = c1Var;
            p5.b1 b1VarB2 = c1Var6.b("composable");
            final e eVar2 = b1VarB2 instanceof e ? (e) b1VarB2 : null;
            if (eVar2 == null) {
                h2 h2VarV = kVar.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new eh.p() { // from class: q5.c0
                        @Override // eh.p
                        public final Object invoke(Object obj7, Object obj8) throws Resources.NotFoundException {
                            ((Integer) obj8).getClass();
                            q0.b(s0Var, graph, dVar, dVar2, lVar, lVar2, lVar3, lVar4, (x0.j) obj7, f3.i.n(i10 | 1));
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            x0.k kVar5 = kVar;
            n1 n1VarB = bg.b.b((sh.l0) eVar2.b().f21204e, kVar5);
            Object objG = kVar5.g();
            Object obj7 = j.a.f31715a;
            if (objG == obj7) {
                objG = new u1(CropImageView.DEFAULT_ASPECT_RATIO);
                kVar5.C(objG);
            }
            k1 k1Var = (k1) objG;
            Object objG2 = kVar5.g();
            if (objG2 == obj7) {
                objG2 = bg.b.h(Boolean.FALSE);
                kVar5.C(objG2);
            }
            n1 n1Var2 = (n1) objG2;
            boolean z12 = ((List) n1VarB.getValue()).size() > 1;
            boolean zK = kVar5.K(n1VarB) | kVar5.l(eVar2);
            Object objG3 = kVar5.g();
            if (zK || objG3 == obj7) {
                z10 = true;
                n1Var = n1Var2;
                Object h0Var = new h0(eVar2, n1VarB, k1Var, n1Var, null);
                kVar5.C(h0Var);
                objG3 = h0Var;
            } else {
                z10 = true;
                n1Var = n1Var2;
            }
            h3.a(z12, (eh.p) objG3, kVar5, 0);
            final androidx.lifecycle.t tVar3 = tVar;
            boolean zL = kVar5.l(s0Var) | kVar5.l(tVar3);
            Object objG4 = kVar5.g();
            if (zL || objG4 == obj7) {
                objG4 = new eh.l() { // from class: q5.d0
                    @Override // eh.l
                    public final Object invoke(Object obj8) {
                        androidx.lifecycle.l lifecycle;
                        s0 s0Var2 = s0Var;
                        s0Var2.getClass();
                        androidx.lifecycle.t owner = tVar3;
                        kotlin.jvm.internal.r.e(owner, "owner");
                        s5.l lVar9 = s0Var2.f21304b;
                        s5.g gVar = lVar9.f24496r;
                        if (!owner.equals(lVar9.f24492n)) {
                            androidx.lifecycle.t tVar4 = lVar9.f24492n;
                            if (tVar4 != null && (lifecycle = tVar4.getLifecycle()) != null) {
                                lifecycle.c(gVar);
                            }
                            lVar9.f24492n = owner;
                            owner.getLifecycle().a(gVar);
                        }
                        return new o0();
                    }
                };
                kVar5.C(objG4);
            }
            x0.o0.a(tVar3, (eh.l) objG4, kVar5);
            g1.e eVarI = c2.n0.i(kVar5);
            n1 n1VarB2 = bg.b.b(lVar5.f24487i, kVar5);
            Object objG5 = kVar5.g();
            if (objG5 == obj7) {
                objG5 = bg.b.d(new e0(n1VarB2, 0));
                kVar5.C(objG5);
            }
            final r3 r3Var = (r3) objG5;
            p5.s sVar2 = (p5.s) qg.x.K((List) r3Var.getValue());
            Object objG6 = kVar5.g();
            if (objG6 == obj7) {
                int i40 = p.o0.f20699a;
                objG6 = new p.e0((Object) null);
                kVar5.C(objG6);
            }
            p.e0 e0Var2 = (p.e0) objG6;
            if (sVar2 != null) {
                kVar5.L(-1797897130);
                c1Var2 = c1Var6;
                boolean zL2 = kVar5.l(eVar2) | (((((i11 & 3670016) ^ 1572864) <= 1048576 || !kVar5.K(lVar3)) && (i11 & 1572864) != 1048576) ? false : z10) | ((i11 & 57344) == 16384 ? z10 : false);
                Object objG7 = kVar5.g();
                if (zL2 || objG7 == obj7) {
                    objG7 = new eh.l() { // from class: q5.f0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.l
                        public final Object invoke(Object obj8) {
                            s8.x xVar2;
                            eh.l<r.p<p5.s>, r.u1> lVar9;
                            r.p<p5.s> pVar = (r.p) obj8;
                            p5.k0 k0Var4 = pVar.e().f21269b;
                            kotlin.jvm.internal.r.c(k0Var4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                            e.a aVar3 = (e.a) k0Var4;
                            r.u1 u1Var = null;
                            if (((Boolean) eVar2.f21950c.getValue()).booleanValue() || ((Boolean) n1Var.getValue()).booleanValue()) {
                                int i41 = p5.k0.f21233e;
                                Iterator it6 = k0.a.b(aVar3).iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        break;
                                    }
                                    p5.k0 k0Var5 = (p5.k0) it6.next();
                                    r.u1 u1Var2 = (!(k0Var5 instanceof e.a) || (xVar2 = ((e.a) k0Var5).f21953h) == null) ? null : (r.u1) xVar2.invoke(pVar);
                                    if (u1Var2 != null) {
                                        u1Var = u1Var2;
                                        break;
                                    }
                                }
                                return u1Var == null ? (r.u1) lVar3.invoke(pVar) : u1Var;
                            }
                            int i42 = p5.k0.f21233e;
                            Iterator it7 = k0.a.b(aVar3).iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    break;
                                }
                                p5.k0 k0Var6 = (p5.k0) it7.next();
                                r.u1 u1VarInvoke = (!(k0Var6 instanceof e.a) || (lVar9 = ((e.a) k0Var6).f21952g) == null) ? null : lVar9.invoke(pVar);
                                if (u1VarInvoke != null) {
                                    u1Var = u1VarInvoke;
                                    break;
                                }
                            }
                            return u1Var == null ? (r.u1) lVar.invoke(pVar) : u1Var;
                        }
                    };
                    kVar5.C(objG7);
                }
                final eh.l lVar9 = (eh.l) objG7;
                boolean zL3 = kVar5.l(eVar2) | (((((i11 & 29360128) ^ 12582912) <= 8388608 || !kVar5.K(lVar4)) && (i11 & 12582912) != 8388608) ? false : z10) | ((i11 & 458752) == 131072 ? z10 : false);
                Object objG8 = kVar5.g();
                if (zL3 || objG8 == obj7) {
                    objG8 = new s2(eVar2, lVar4, lVar2, n1Var);
                    kVar5.C(objG8);
                }
                final eh.l lVar10 = (eh.l) objG8;
                final n1 n1Var3 = n1Var;
                if ((i11 & 234881024) != 67108864) {
                    z10 = false;
                }
                Object objG9 = kVar5.g();
                if (z10 || objG9 == obj7) {
                    objG9 = new g0();
                    kVar5.C(objG9);
                }
                final eh.l lVar11 = (eh.l) objG9;
                Boolean bool = Boolean.TRUE;
                boolean zL4 = kVar5.l(eVar2);
                Object objG10 = kVar5.g();
                if (zL4 || objG10 == obj7) {
                    objG10 = new eh.l() { // from class: q5.x
                        @Override // eh.l
                        public final Object invoke(Object obj8) {
                            return new p0(r3Var, eVar2);
                        }
                    };
                    kVar5.C(objG10);
                }
                x0.o0.a(bool, (eh.l) objG10, kVar5);
                Object objG11 = kVar5.g();
                if (objG11 == obj7) {
                    objG11 = new z0(sVar2);
                    kVar5.C(objG11);
                }
                z0 z0Var = (z0) objG11;
                s.o oVar3 = z0.f24046t;
                y1 y1VarD = c2.d(z0Var, "entry", kVar5, 56);
                if (((Boolean) n1Var3.getValue()).booleanValue()) {
                    kVar5.L(-1795663766);
                    Float fValueOf = Float.valueOf(k1Var.getFloatValue());
                    boolean zK2 = kVar5.K(n1VarB) | kVar5.l(z0Var);
                    Object objG12 = kVar5.g();
                    if (zK2 || objG12 == obj7) {
                        objG12 = new i0(z0Var, n1VarB, k1Var, null);
                        kVar5.C(objG12);
                    }
                    x0.o0.d((eh.p) objG12, fValueOf, kVar5);
                    kVar5.T(false);
                    oVar = null;
                } else {
                    kVar5.L(-1795408729);
                    boolean zL5 = kVar5.l(z0Var) | kVar5.l(sVar2) | kVar5.K(y1VarD);
                    Object objG13 = kVar5.g();
                    if (zL5 || objG13 == obj7) {
                        oVar = null;
                        objG13 = new k0(z0Var, sVar2, y1VarD, null);
                        kVar5.C(objG13);
                    } else {
                        oVar = null;
                    }
                    x0.o0.d((eh.p) objG13, sVar2, kVar5);
                    kVar5.T(false);
                }
                boolean zL6 = kVar5.l(e0Var2) | kVar5.l(eVar2) | kVar5.K(lVar9) | kVar5.K(lVar10) | kVar5.K(lVar11);
                Object objG14 = kVar5.g();
                if (zL6 || objG14 == obj7) {
                    final e eVar3 = eVar2;
                    e0Var = e0Var2;
                    obj = obj7;
                    kVar3 = kVar5;
                    Object obj8 = new eh.l() { // from class: q5.y
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            r.p pVar = (r.p) obj9;
                            boolean zContains = ((List) r3Var.getValue()).contains(pVar.c());
                            float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
                            if (!zContains) {
                                v1 v1Var = r.u1.f22959a;
                                x1 x1Var = w1.f22979a;
                                int i41 = androidx.compose.animation.b.f763b;
                                return new r.n0(v1Var, x1Var, CropImageView.DEFAULT_ASPECT_RATIO, new k2(r.m.f22883a));
                            }
                            String str2 = ((p5.s) pVar.c()).f21273f;
                            p.e0 e0Var3 = e0Var;
                            int iC = e0Var3.c(str2);
                            if (iC >= 0) {
                                f10 = e0Var3.f20606c[iC];
                            } else {
                                e0Var3.e(str2, CropImageView.DEFAULT_ASPECT_RATIO);
                            }
                            if (!kotlin.jvm.internal.r.a(((p5.s) pVar.e()).f21273f, ((p5.s) pVar.c()).f21273f)) {
                                f10 = (((Boolean) eVar3.f21950c.getValue()).booleanValue() || ((Boolean) n1Var3.getValue()).booleanValue()) ? f10 - 1.0f : f10 + 1.0f;
                            }
                            e0Var3.e(((p5.s) pVar.e()).f21273f, f10);
                            return new r.n0((r.u1) lVar9.invoke(pVar), (w1) lVar10.invoke(pVar), f10, (j2) lVar11.invoke(pVar));
                        }
                    };
                    eVar = eVar3;
                    kVar3.C(obj8);
                    objG14 = obj8;
                } else {
                    eVar = eVar2;
                    e0Var = e0Var2;
                    kVar3 = kVar5;
                    obj = obj7;
                }
                eh.l lVar12 = (eh.l) objG14;
                Object objG15 = kVar3.g();
                if (objG15 == obj) {
                    z11 = false;
                    objG15 = new z(0);
                    kVar3.C(objG15);
                } else {
                    z11 = false;
                }
                p.e0 e0Var3 = e0Var;
                boolean z13 = z11;
                x0.k kVar6 = kVar3;
                androidx.compose.animation.b.b(y1VarD, dVar, lVar12, dVar2, (eh.l) objG15, f1.c.b(820763100, new m0(z0Var, sVar2, eVarI, n1Var3, r3Var), kVar3), kVar6, ((i11 >> 3) & 112) | 221184 | (i11 & V4Signature.MAX_SIGNING_INFOS_SIZE));
                Object objV = y1VarD.f24001a.V();
                T value = y1VarD.f24004d.getValue();
                boolean zK3 = kVar6.K(y1VarD) | kVar6.l(s0Var) | kVar6.l(eVar) | kVar6.l(e0Var3);
                Object objG16 = kVar6.g();
                if (zK3 || objG16 == obj) {
                    Object n0Var = new n0(y1VarD, s0Var, e0Var3, r3Var, eVar, null);
                    kVar6.C(n0Var);
                    objG16 = n0Var;
                }
                x0.o0.e(objV, value, (eh.p) objG16, kVar6);
                kVar6.T(z13);
                kVar2 = kVar6;
                i12 = z13;
            } else {
                c1Var2 = c1Var6;
                i12 = 0;
                oVar = null;
                kVar5.L(-1790236038);
                kVar5.T(false);
                kVar2 = kVar5;
            }
            p5.b1 b1VarB3 = c1Var2.b("dialog");
            o oVar4 = b1VarB3 instanceof o ? (o) b1VarB3 : oVar;
            if (oVar4 == null) {
                h2 h2VarV2 = kVar2.V();
                if (h2VarV2 != null) {
                    h2VarV2.f31703d = new eh.p() { // from class: q5.a0
                        @Override // eh.p
                        public final Object invoke(Object obj9, Object obj10) throws Resources.NotFoundException {
                            ((Integer) obj10).getClass();
                            q0.b(s0Var, graph, dVar, dVar2, lVar, lVar2, lVar3, lVar4, (x0.j) obj9, f3.i.n(i10 | 1));
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            n.a(oVar4, kVar2, i12);
            kVar4 = kVar2;
        }
        h2 h2VarV3 = kVar4.V();
        if (h2VarV3 != null) {
            h2VarV3.f31703d = new eh.p() { // from class: q5.b0
                @Override // eh.p
                public final Object invoke(Object obj9, Object obj10) throws Resources.NotFoundException {
                    ((Integer) obj10).getClass();
                    q0.b(s0Var, graph, dVar, dVar2, lVar, lVar2, lVar3, lVar4, (x0.j) obj9, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
