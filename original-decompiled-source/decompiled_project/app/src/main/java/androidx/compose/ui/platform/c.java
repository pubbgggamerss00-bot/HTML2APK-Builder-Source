package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.l;
import b3.n;
import c0.g0;
import c2.n0;
import com.basitce.htmltoapk.R;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import e3.l;
import f3.q;
import i2.e0;
import i2.g1;
import j2.a0;
import j2.u4;
import j2.v;
import j2.v4;
import j2.w4;
import j2.x4;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import k2.a;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p.c1;
import p.d1;
import p.f0;
import p.l0;
import p.p0;
import p.w;
import p.w0;
import p.x;
import p.y;
import p.z;
import q1.b1;
import q1.x1;
import q2.c0;
import q2.l;
import q2.m;
import q2.t;
import rh.c;
import t2.b;
import t2.b0;
import t2.h0;
import t2.i;
import t2.j0;
import t2.m0;
import t2.o0;
import x2.p;
import z3.j;
import z3.k;

/* loaded from: classes.dex */
public final class c extends y3.a {
    public static final x P;
    public boolean A;
    public d B;
    public y C;
    public final z D;
    public final w E;
    public final w F;
    public final String G;
    public final String H;
    public final n I;
    public final y<v4> J;
    public v4 K;
    public boolean L;
    public final j2.x M;
    public final ArrayList N;
    public final f O;

    /* renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f1301d;

    /* renamed from: e, reason: collision with root package name */
    public int f1302e = PKIFailureInfo.systemUnavail;

    /* renamed from: f, reason: collision with root package name */
    public final e f1303f = new e();

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f1304g;

    /* renamed from: h, reason: collision with root package name */
    public long f1305h;

    /* renamed from: i, reason: collision with root package name */
    public final v f1306i;

    /* renamed from: j, reason: collision with root package name */
    public final j2.w f1307j;

    /* renamed from: k, reason: collision with root package name */
    public List<AccessibilityServiceInfo> f1308k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f1309l;

    /* renamed from: m, reason: collision with root package name */
    public final C0018c f1310m;

    /* renamed from: n, reason: collision with root package name */
    public int f1311n;

    /* renamed from: o, reason: collision with root package name */
    public int f1312o;

    /* renamed from: p, reason: collision with root package name */
    public j f1313p;

    /* renamed from: q, reason: collision with root package name */
    public j f1314q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1315r;

    /* renamed from: s, reason: collision with root package name */
    public final y<q2.j> f1316s;

    /* renamed from: t, reason: collision with root package name */
    public final y<q2.j> f1317t;

    /* renamed from: u, reason: collision with root package name */
    public final c1<c1<CharSequence>> f1318u;

    /* renamed from: v, reason: collision with root package name */
    public final c1<f0<CharSequence>> f1319v;

    /* renamed from: w, reason: collision with root package name */
    public int f1320w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f1321x;

    /* renamed from: y, reason: collision with root package name */
    public final p.b<e0> f1322y;

    /* renamed from: z, reason: collision with root package name */
    public final rh.c f1323z;

    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            c cVar = c.this;
            AccessibilityManager accessibilityManager = cVar.f1304g;
            accessibilityManager.addAccessibilityStateChangeListener(cVar.f1306i);
            accessibilityManager.addTouchExplorationStateChangeListener(cVar.f1307j);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            c cVar = c.this;
            cVar.f1309l.removeCallbacks(cVar.M);
            AccessibilityManager accessibilityManager = cVar.f1304g;
            accessibilityManager.removeAccessibilityStateChangeListener(cVar.f1306i);
            accessibilityManager.removeTouchExplorationStateChangeListener(cVar.f1307j);
        }
    }

    public static final class b {
    }

    /* renamed from: androidx.compose.ui.platform.c$c, reason: collision with other inner class name */
    public final class C0018c extends k {
        public C0018c() {
        }

        @Override // z3.k
        public final void a(int i10, j jVar, String str, Bundle bundle) {
            c.this.j(i10, jVar, str, bundle);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x0599  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x05ac  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x05d3  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x05dd  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x060b  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x062d  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x0641  */
        /* JADX WARN: Removed duplicated region for block: B:311:0x06ce  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x06d1  */
        /* JADX WARN: Removed duplicated region for block: B:339:0x0758  */
        /* JADX WARN: Removed duplicated region for block: B:342:0x075d  */
        /* JADX WARN: Removed duplicated region for block: B:349:0x0781  */
        /* JADX WARN: Removed duplicated region for block: B:351:0x0784  */
        /* JADX WARN: Removed duplicated region for block: B:356:0x079d  */
        /* JADX WARN: Removed duplicated region for block: B:359:0x07af  */
        /* JADX WARN: Removed duplicated region for block: B:383:0x083d  */
        /* JADX WARN: Removed duplicated region for block: B:391:0x0869  */
        /* JADX WARN: Removed duplicated region for block: B:392:0x0876  */
        /* JADX WARN: Removed duplicated region for block: B:413:0x08de  */
        /* JADX WARN: Removed duplicated region for block: B:429:0x093d  */
        /* JADX WARN: Removed duplicated region for block: B:456:0x09e5  */
        /* JADX WARN: Removed duplicated region for block: B:458:0x09e8  */
        /* JADX WARN: Removed duplicated region for block: B:461:0x09ff  */
        /* JADX WARN: Removed duplicated region for block: B:464:0x0a08  */
        /* JADX WARN: Removed duplicated region for block: B:487:0x0a65  */
        /* JADX WARN: Removed duplicated region for block: B:489:0x0a68  */
        /* JADX WARN: Removed duplicated region for block: B:492:0x0a7f  */
        /* JADX WARN: Removed duplicated region for block: B:495:0x0a88  */
        /* JADX WARN: Removed duplicated region for block: B:503:0x0aac  */
        /* JADX WARN: Removed duplicated region for block: B:524:0x0b37  */
        /* JADX WARN: Removed duplicated region for block: B:569:0x0cd4  */
        /* JADX WARN: Removed duplicated region for block: B:574:0x0cf0  */
        /* JADX WARN: Type inference failed for: r10v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v148, types: [qg.z] */
        /* JADX WARN: Type inference failed for: r3v149, types: [java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r3v153, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v42 */
        /* JADX WARN: Type inference failed for: r5v43 */
        /* JADX WARN: Type inference failed for: r5v7, types: [android.view.accessibility.AccessibilityNodeInfo] */
        @Override // z3.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final j b(int i10) {
            int i11;
            c cVar;
            j jVar;
            c cVar2;
            AndroidComposeView androidComposeView;
            AccessibilityNodeInfo accessibilityNodeInfo;
            j jVar2;
            x xVar;
            c1<f0<CharSequence>> c1Var;
            Resources resources;
            l lVar;
            l lVar2;
            l0<c0<?>, Object> l0Var;
            q2.i iVar;
            t tVar;
            SpannableString spannableString;
            l lVar3;
            ?? r52;
            q2.i iVar2;
            int i12;
            j jVar3;
            int i13;
            q2.a aVar;
            l lVar4;
            q2.a aVar2;
            q2.a aVar3;
            String strT;
            int i14;
            CharSequence charSequenceF;
            q2.h hVar;
            int i15;
            q2.b bVar;
            t tVarJ;
            q2.j jVar4;
            q2.j jVar5;
            int iD;
            AndroidComposeView androidComposeView2;
            Bundle bundle;
            int iD2;
            i3.b bVarF;
            f0<CharSequence> f0Var;
            q2.b bVar2;
            q2.a aVar4;
            boolean z10;
            boolean z11;
            boolean zBooleanValue;
            ArrayList arrayList;
            int i16;
            androidx.lifecycle.l lifecycle;
            c cVar3 = c.this;
            AndroidComposeView androidComposeView3 = cVar3.f1301d;
            AndroidComposeView.b viewTreeOwners = androidComposeView3.getViewTreeOwners();
            if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.f1262a.getLifecycle()) == null) ? null : lifecycle.b()) == l.b.f2319a) {
                i11 = i10;
                cVar = cVar3;
                jVar = null;
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                j jVar6 = new j(accessibilityNodeInfoObtain);
                w4 w4VarB = cVar3.s().b(i10);
                if (w4VarB != null) {
                    t tVar2 = w4VarB.f14962a;
                    if (i10 == -1) {
                        Object parentForAccessibility = androidComposeView3.getParentForAccessibility();
                        View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                        jVar6.f34726b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        t tVarJ2 = tVar2.j();
                        Integer numValueOf = tVarJ2 != null ? Integer.valueOf(tVarJ2.f21814g) : null;
                        if (numValueOf == null) {
                            f2.a.c("semanticsNode " + i10 + " has null parent");
                            throw new pg.g();
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == androidComposeView3.getSemanticsOwner().a().f21814g) {
                            iIntValue = -1;
                        }
                        jVar6.f34726b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(androidComposeView3, iIntValue);
                    }
                    jVar6.f34727c = i10;
                    accessibilityNodeInfoObtain.setSource(androidComposeView3, i10);
                    accessibilityNodeInfoObtain.setBoundsInScreen(cVar3.k(w4VarB));
                    x xVar2 = c.P;
                    c1<f0<CharSequence>> c1Var2 = cVar3.f1319v;
                    Resources resources2 = androidComposeView3.getContext().getResources();
                    jVar6.g("android.view.View");
                    q2.l lVar5 = tVar2.f21811d;
                    q2.l lVar6 = tVar2.f21811d;
                    l0<c0<?>, Object> l0Var2 = lVar5.f21799a;
                    if (l0Var2.b(q2.w.D)) {
                        jVar6.g("android.widget.EditText");
                    }
                    if (l0Var2.b(q2.w.f21845z)) {
                        jVar6.g("android.widget.TextView");
                    }
                    q2.i iVar3 = (q2.i) m.a(lVar5, q2.w.f21842w);
                    if (iVar3 != null) {
                        int i17 = iVar3.f21770a;
                        if (tVar2.f21812e || t.h(4, tVar2).isEmpty()) {
                            if (i17 == 4) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                            } else if (i17 == 2) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                            } else {
                                String strG = x4.g(i17);
                                if (i17 != 5 || tVar2.m() || lVar5.f21801c) {
                                    jVar6.g(strG);
                                }
                            }
                        }
                        pg.f0 f0Var2 = pg.f0.f21461a;
                    }
                    accessibilityNodeInfoObtain.setPackageName(androidComposeView3.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(x4.e(tVar2));
                    List listH = t.h(4, tVar2);
                    int size = listH.size();
                    int i18 = 0;
                    while (i18 < size) {
                        int i19 = size;
                        t tVar3 = (t) listH.get(i18);
                        List list = listH;
                        int i20 = i18;
                        if (cVar3.s().a(tVar3.f21814g)) {
                            i3.b bVar3 = androidComposeView3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(tVar3.f21810c);
                            int i21 = tVar3.f21814g;
                            if (i21 != -1) {
                                if (bVar3 != null) {
                                    accessibilityNodeInfoObtain.addChild(bVar3);
                                } else {
                                    accessibilityNodeInfoObtain.addChild(androidComposeView3, i21);
                                }
                            }
                        }
                        i18 = i20 + 1;
                        listH = list;
                        size = i19;
                    }
                    int i22 = cVar3.f1311n;
                    AccessibilityNodeInfo accessibilityNodeInfo2 = jVar6.f34725a;
                    if (i10 == i22) {
                        accessibilityNodeInfo2.setAccessibilityFocused(true);
                        jVar6.b(j.a.f34729f);
                    } else {
                        accessibilityNodeInfo2.setAccessibilityFocused(false);
                        jVar6.b(j.a.f34728e);
                    }
                    t2.b bVarF2 = j2.e0.f(tVar2);
                    if (bVarF2 != null) {
                        androidComposeView3.getFontFamilyResolver();
                        f3.d density = androidComposeView3.getDensity();
                        n nVar = cVar3.I;
                        androidComposeView = androidComposeView3;
                        c1Var = c1Var2;
                        String str = bVarF2.f27761b;
                        xVar = xVar2;
                        List<b.c<? extends b.a>> list2 = bVarF2.f27760a;
                        SpannableString spannableString2 = new SpannableString(str);
                        ArrayList arrayList2 = bVarF2.f27762c;
                        lVar2 = lVar6;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                int i24 = i23;
                                b.c cVar4 = (b.c) arrayList2.get(i23);
                                ArrayList arrayList3 = arrayList2;
                                b0 b0Var = (b0) cVar4.f27771a;
                                int i25 = size2;
                                int i26 = cVar4.f27772b;
                                int i27 = cVar4.f27773c;
                                c cVar5 = cVar3;
                                AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo2;
                                j jVar7 = jVar6;
                                long j10 = b0Var.f27775a.j();
                                Resources resources3 = resources2;
                                q2.l lVar7 = lVar5;
                                long j11 = b0Var.f27776b;
                                p pVar = b0Var.f27777c;
                                x2.n nVar2 = b0Var.f27778d;
                                e3.m mVar = b0Var.f27784j;
                                a3.c cVar6 = b0Var.f27785k;
                                l0<c0<?>, Object> l0Var3 = l0Var2;
                                q2.i iVar4 = iVar3;
                                long j12 = b0Var.f27786l;
                                e3.i iVar5 = b0Var.f27787m;
                                e3.l cVar7 = b0Var.f27775a;
                                t tVar4 = tVar2;
                                n nVar3 = nVar;
                                if (!b1.d(j10, cVar7.j())) {
                                    cVar7 = j10 != 16 ? new e3.c(j10) : l.a.f8369a;
                                }
                                c3.b.c(spannableString2, cVar7.j(), i26, i27);
                                SpannableString spannableString3 = spannableString2;
                                c3.b.d(spannableString3, j11, density, i26, i27);
                                if (pVar == null && nVar2 == null) {
                                    i16 = 33;
                                } else {
                                    p pVar2 = pVar == null ? p.f32030c : pVar;
                                    int i28 = nVar2 != null ? nVar2.f32027a : 0;
                                    boolean z12 = r.f(pVar2.f32037a, p.f32029b.f32037a) >= 0;
                                    boolean z13 = i28 == 1;
                                    int i29 = (z13 && z12) ? 3 : z12 ? 1 : z13 ? 2 : 0;
                                    i16 = 33;
                                    spannableString3.setSpan(new StyleSpan(i29), i26, i27, 33);
                                }
                                if (iVar5 != null) {
                                    int i30 = iVar5.f8367a;
                                    if ((i30 | 1) == i30) {
                                        spannableString3.setSpan(new UnderlineSpan(), i26, i27, i16);
                                    }
                                    if ((i30 | 2) == i30) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i26, i27, i16);
                                    }
                                }
                                if (mVar != null) {
                                    spannableString3.setSpan(new ScaleXSpan(mVar.f8373a), i26, i27, i16);
                                }
                                c3.b.e(spannableString3, cVar6, i26, i27);
                                if (j12 != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(n0.j(j12)), i26, i27, i16);
                                }
                                spannableString2 = spannableString3;
                                i23 = i24 + 1;
                                tVar2 = tVar4;
                                arrayList2 = arrayList3;
                                size2 = i25;
                                cVar3 = cVar5;
                                jVar6 = jVar7;
                                accessibilityNodeInfo2 = accessibilityNodeInfo3;
                                lVar5 = lVar7;
                                resources2 = resources3;
                                l0Var2 = l0Var3;
                                iVar3 = iVar4;
                                nVar = nVar3;
                            }
                        }
                        cVar2 = cVar3;
                        SpannableString spannableString4 = spannableString2;
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        jVar2 = jVar6;
                        n nVar4 = nVar;
                        resources = resources2;
                        lVar = lVar5;
                        l0Var = l0Var2;
                        iVar = iVar3;
                        tVar = tVar2;
                        int length = str.length();
                        ?? arrayList4 = qg.z.f22752a;
                        if (list2 != null) {
                            arrayList = new ArrayList(list2.size());
                            int size3 = list2.size();
                            for (int i31 = 0; i31 < size3; i31++) {
                                b.c<? extends b.a> cVar8 = list2.get(i31);
                                b.c<? extends b.a> cVar9 = cVar8;
                                if ((cVar9.f27771a instanceof m0) && t2.e.b(0, length, cVar9.f27772b, cVar9.f27773c)) {
                                    arrayList.add(cVar8);
                                }
                            }
                        } else {
                            arrayList = arrayList4;
                        }
                        int size4 = arrayList.size();
                        for (int i32 = 0; i32 < size4; i32++) {
                            b.c cVar10 = (b.c) arrayList.get(i32);
                            m0 m0Var = (m0) cVar10.f27771a;
                            int i33 = cVar10.f27772b;
                            int i34 = cVar10.f27773c;
                            if (!(m0Var instanceof o0)) {
                                throw new pg.l();
                            }
                            spannableString4.setSpan(new TtsSpan.VerbatimBuilder(((o0) m0Var).f27871a).build(), i33, i34, 33);
                        }
                        int length2 = str.length();
                        if (list2 != null) {
                            arrayList4 = new ArrayList(list2.size());
                            int size5 = list2.size();
                            for (int i35 = 0; i35 < size5; i35++) {
                                b.c<? extends b.a> cVar11 = list2.get(i35);
                                b.c<? extends b.a> cVar12 = cVar11;
                                if ((cVar12.f27771a instanceof t2.n0) && t2.e.b(0, length2, cVar12.f27772b, cVar12.f27773c)) {
                                    arrayList4.add(cVar11);
                                }
                            }
                        }
                        int size6 = arrayList4.size();
                        int i36 = 0;
                        while (i36 < size6) {
                            b.c cVar13 = (b.c) arrayList4.get(i36);
                            t2.n0 n0Var = (t2.n0) cVar13.f27771a;
                            int i37 = cVar13.f27772b;
                            int i38 = cVar13.f27773c;
                            n nVar5 = nVar4;
                            WeakHashMap<t2.n0, URLSpan> weakHashMap = nVar5.f3571a;
                            URLSpan uRLSpan = weakHashMap.get(n0Var);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(n0Var.f27863a);
                                weakHashMap.put(n0Var, uRLSpan);
                            }
                            spannableString4.setSpan(uRLSpan, i37, i38, 33);
                            i36++;
                            nVar4 = nVar5;
                        }
                        n nVar6 = nVar4;
                        List listA = bVarF2.a(str.length());
                        int size7 = listA.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            b.c<t2.i> cVar14 = (b.c) listA.get(i39);
                            int i40 = cVar14.f27772b;
                            t2.i iVar6 = cVar14.f27771a;
                            int i41 = cVar14.f27773c;
                            if (i40 != i41) {
                                t2.i iVar7 = iVar6;
                                if (iVar7 instanceof i.b) {
                                    r.c(iVar6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    i.b bVar4 = (i.b) iVar6;
                                    b.c<i.b> cVar15 = new b.c<>(bVar4, i40, i41);
                                    WeakHashMap<b.c<i.b>, URLSpan> weakHashMap2 = nVar6.f3572b;
                                    URLSpan uRLSpan2 = weakHashMap2.get(cVar15);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(bVar4.f27827a);
                                        weakHashMap2.put(cVar15, uRLSpan2);
                                    }
                                    spannableString4.setSpan(uRLSpan2, i40, i41, 33);
                                } else {
                                    WeakHashMap<b.c<t2.i>, b3.f> weakHashMap3 = nVar6.f3573c;
                                    b3.f fVar = weakHashMap3.get(cVar14);
                                    if (fVar == null) {
                                        fVar = new b3.f(iVar7);
                                        weakHashMap3.put(cVar14, fVar);
                                    }
                                    spannableString4.setSpan(fVar, i40, i41, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) c.K(spannableString4);
                    } else {
                        cVar2 = cVar3;
                        androidComposeView = androidComposeView3;
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        jVar2 = jVar6;
                        xVar = xVar2;
                        c1Var = c1Var2;
                        resources = resources2;
                        lVar = lVar5;
                        lVar2 = lVar6;
                        l0Var = l0Var2;
                        iVar = iVar3;
                        tVar = tVar2;
                        spannableString = null;
                    }
                    accessibilityNodeInfoObtain.setText(spannableString);
                    c0<String> c0Var = q2.w.J;
                    l0<c0<?>, Object> l0Var4 = l0Var;
                    if (l0Var4.b(c0Var)) {
                        accessibilityNodeInfoObtain.setContentInvalid(true);
                        lVar3 = lVar;
                        accessibilityNodeInfoObtain.setError((CharSequence) m.a(lVar3, c0Var));
                    } else {
                        lVar3 = lVar;
                    }
                    Resources resources4 = resources;
                    String strE = j2.e0.e(tVar, resources4);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo;
                        j.b.b(accessibilityNodeInfo4, strE);
                        r52 = accessibilityNodeInfo4;
                    } else {
                        AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfo;
                        accessibilityNodeInfo5.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strE);
                        r52 = accessibilityNodeInfo5;
                    }
                    accessibilityNodeInfoObtain.setCheckable(j2.e0.d(tVar));
                    s2.a aVar5 = (s2.a) m.a(lVar3, q2.w.H);
                    if (aVar5 != null) {
                        if (aVar5 == s2.a.f24191a) {
                            r52.setChecked(true);
                        } else if (aVar5 == s2.a.f24192b) {
                            r52.setChecked(false);
                        }
                        pg.f0 f0Var3 = pg.f0.f21461a;
                    }
                    Boolean bool = (Boolean) m.a(lVar3, q2.w.G);
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (iVar == null) {
                            iVar2 = iVar;
                            i12 = 4;
                        } else {
                            iVar2 = iVar;
                            i12 = 4;
                            if (iVar2.f21770a == 4) {
                                accessibilityNodeInfoObtain.setSelected(zBooleanValue2);
                            }
                            pg.f0 f0Var4 = pg.f0.f21461a;
                        }
                        r52.setChecked(zBooleanValue2);
                        pg.f0 f0Var42 = pg.f0.f21461a;
                    } else {
                        iVar2 = iVar;
                        i12 = 4;
                    }
                    if (!lVar3.f21801c || t.h(i12, tVar).isEmpty()) {
                        List list3 = (List) m.a(lVar3, q2.w.f21820a);
                        accessibilityNodeInfoObtain.setContentDescription(list3 != null ? (String) qg.x.D(list3) : null);
                    }
                    String str2 = (String) m.a(lVar3, q2.w.f21843x);
                    if (str2 != null) {
                        t tVarJ3 = tVar;
                        while (true) {
                            if (tVarJ3 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            q2.l lVar8 = tVarJ3.f21811d;
                            c0<Boolean> c0Var2 = q2.x.f21859a;
                            if (lVar8.f21799a.b(c0Var2)) {
                                zBooleanValue = ((Boolean) lVar8.f(c0Var2)).booleanValue();
                                break;
                            }
                            tVarJ3 = tVarJ3.j();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfoObtain.setViewIdResourceName(str2);
                        }
                    }
                    c0<List<String>> c0Var3 = q2.w.f21820a;
                    if (((pg.f0) m.a(lVar3, q2.w.f21827h)) != null) {
                        r52.setHeading(true);
                        pg.f0 f0Var5 = pg.f0.f21461a;
                    }
                    accessibilityNodeInfoObtain.setPassword(l0Var4.b(q2.w.I));
                    accessibilityNodeInfoObtain.setEditable(l0Var4.b(q2.w.L));
                    Integer num = (Integer) m.a(lVar3, q2.w.M);
                    accessibilityNodeInfoObtain.setMaxTextLength(num != null ? num.intValue() : -1);
                    accessibilityNodeInfoObtain.setEnabled(j2.e0.a(tVar));
                    c0<Boolean> c0Var4 = q2.w.f21830k;
                    accessibilityNodeInfoObtain.setFocusable(l0Var4.b(c0Var4));
                    if (accessibilityNodeInfoObtain.isFocusable()) {
                        accessibilityNodeInfoObtain.setFocused(((Boolean) lVar3.f(c0Var4)).booleanValue());
                        if (accessibilityNodeInfoObtain.isFocused()) {
                            jVar3 = jVar2;
                            jVar3.a(2);
                            i11 = i10;
                            cVar = cVar2;
                            cVar.f1312o = i11;
                        } else {
                            i11 = i10;
                            cVar = cVar2;
                            jVar3 = jVar2;
                            i13 = 1;
                            jVar3.a(1);
                            r52.setVisibleToUser((x4.d(tVar) ? 1 : 0) ^ i13);
                            if (((q2.g) m.a(lVar3, q2.w.f21829j)) != null) {
                                accessibilityNodeInfoObtain.setLiveRegion(i13);
                                pg.f0 f0Var6 = pg.f0.f21461a;
                            }
                            r52.setClickable(false);
                            aVar = (q2.a) m.a(lVar3, q2.k.f21774b);
                            if (aVar != null) {
                                boolean zA = r.a(m.a(lVar3, q2.w.G), Boolean.TRUE);
                                if (iVar2 != null && iVar2.f21770a == 4) {
                                    z11 = true;
                                    r52.setClickable(z11 || (z11 && !zA));
                                    if (j2.e0.a(tVar) && r52.isClickable()) {
                                        jVar3.b(new j.a(16, aVar.f21752a));
                                    }
                                    pg.f0 f0Var7 = pg.f0.f21461a;
                                } else {
                                    if (!(iVar2 != null && iVar2.f21770a == 3)) {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        r52.setClickable(z11 || (z11 && !zA));
                                        if (j2.e0.a(tVar)) {
                                            jVar3.b(new j.a(16, aVar.f21752a));
                                        }
                                        pg.f0 f0Var72 = pg.f0.f21461a;
                                    }
                                }
                            }
                            r52.setLongClickable(false);
                            lVar4 = lVar2;
                            aVar2 = (q2.a) m.a(lVar4, q2.k.f21775c);
                            if (aVar2 != null) {
                                r52.setLongClickable(true);
                                if (j2.e0.a(tVar)) {
                                    jVar3.b(new j.a(32, aVar2.f21752a));
                                }
                                pg.f0 f0Var8 = pg.f0.f21461a;
                            }
                            aVar3 = (q2.a) m.a(lVar4, q2.k.f21788p);
                            if (aVar3 != null) {
                                jVar3.b(new j.a(16384, aVar3.f21752a));
                                pg.f0 f0Var9 = pg.f0.f21461a;
                            }
                            if (j2.e0.a(tVar)) {
                                q2.a aVar6 = (q2.a) m.a(lVar4, q2.k.f21782j);
                                if (aVar6 != null) {
                                    jVar3.b(new j.a(PKIFailureInfo.badSenderNonce, aVar6.f21752a));
                                    pg.f0 f0Var10 = pg.f0.f21461a;
                                }
                                q2.a aVar7 = (q2.a) m.a(lVar4, q2.k.f21787o);
                                if (aVar7 != null) {
                                    jVar3.b(new j.a(android.R.id.accessibilityActionImeEnter, aVar7.f21752a));
                                    pg.f0 f0Var11 = pg.f0.f21461a;
                                }
                                q2.a aVar8 = (q2.a) m.a(lVar4, q2.k.f21789q);
                                if (aVar8 != null) {
                                    jVar3.b(new j.a(65536, aVar8.f21752a));
                                    pg.f0 f0Var12 = pg.f0.f21461a;
                                }
                                q2.a aVar9 = (q2.a) m.a(lVar4, q2.k.f21790r);
                                if (aVar9 != null) {
                                    if (r52.isFocused()) {
                                        ClipDescription primaryClipDescription = androidComposeView.getClipboardManager().f14822a.getPrimaryClipDescription();
                                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                            jVar3.b(new j.a(32768, aVar9.f21752a));
                                        }
                                    }
                                    pg.f0 f0Var13 = pg.f0.f21461a;
                                }
                            }
                            strT = c.t(tVar);
                            if (!(strT != null || strT.length() == 0)) {
                                r52.setTextSelection(cVar.r(tVar), cVar.q(tVar));
                                q2.a aVar10 = (q2.a) m.a(lVar4, q2.k.f21781i);
                                jVar3.b(new j.a(131072, aVar10 != null ? aVar10.f21752a : null));
                                jVar3.a(256);
                                jVar3.a(512);
                                r52.setMovementGranularities(11);
                                List list4 = (List) m.a(lVar4, q2.w.f21820a);
                                if (list4 == null || list4.isEmpty()) {
                                    if (lVar4.f21799a.b(q2.k.f21773a)) {
                                        if (!lVar4.f21799a.b(q2.w.D) || r.a(m.a(lVar4, c0Var4), Boolean.TRUE)) {
                                            e0 e0VarB = j2.e0.b(tVar.f21810c, j2.f0.f14718a);
                                            if (e0VarB != null) {
                                                q2.l lVarE = e0VarB.e();
                                                z10 = lVarE != null ? r.a(m.a(lVarE, c0Var4), Boolean.TRUE) : false ? false : true;
                                                if (!z10) {
                                                    r52.setMovementGranularities(r52.getMovementGranularities() | 20);
                                                }
                                            }
                                            if (!z10) {
                                            }
                                        }
                                    }
                                }
                            }
                            i14 = Build.VERSION.SDK_INT;
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add("androidx.compose.ui.semantics.id");
                            charSequenceF = jVar3.f();
                            if (!(charSequenceF != null || charSequenceF.length() == 0)) {
                                if (lVar4.f21799a.b(q2.k.f21773a)) {
                                    arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                            }
                            if (lVar4.f21799a.b(q2.w.f21843x)) {
                                arrayList5.add("androidx.compose.ui.semantics.testTag");
                            }
                            r52.setAvailableExtraData(arrayList5);
                            hVar = (q2.h) m.a(lVar4, q2.w.f21822c);
                            if (hVar == null) {
                                float f10 = hVar.f21767a;
                                jh.d dVar = hVar.f21768b;
                                c0<q2.a<eh.l<Float, Boolean>>> c0Var5 = q2.k.f21780h;
                                if (lVar4.f21799a.b(c0Var5)) {
                                    jVar3.g("android.widget.SeekBar");
                                } else {
                                    jVar3.g("android.widget.ProgressBar");
                                }
                                if (hVar != q2.h.f21766d) {
                                    i15 = 1;
                                    r52.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(dVar.f15742a).floatValue(), Float.valueOf(dVar.f15743b).floatValue(), f10));
                                } else {
                                    i15 = 1;
                                }
                                if (lVar4.f21799a.b(c0Var5) && j2.e0.a(tVar)) {
                                    float fFloatValue = Float.valueOf(dVar.f15743b).floatValue();
                                    float fFloatValue2 = Float.valueOf(dVar.f15742a).floatValue();
                                    if (fFloatValue < fFloatValue2) {
                                        fFloatValue = fFloatValue2;
                                    }
                                    if (f10 < fFloatValue) {
                                        jVar3.b(j.a.f34730g);
                                    }
                                    float fFloatValue3 = Float.valueOf(dVar.f15742a).floatValue();
                                    float fFloatValue4 = Float.valueOf(dVar.f15743b).floatValue();
                                    if (fFloatValue3 > fFloatValue4) {
                                        fFloatValue3 = fFloatValue4;
                                    }
                                    if (f10 > fFloatValue3) {
                                        jVar3.b(j.a.f34731h);
                                    }
                                }
                            } else {
                                i15 = 1;
                            }
                            if (j2.e0.a(tVar) && (aVar4 = (q2.a) m.a(lVar4, q2.k.f21780h)) != null) {
                                jVar3.b(new j.a(android.R.id.accessibilityActionSetProgress, aVar4.f21752a));
                            }
                            bVar = (q2.b) m.a(tVar.i(), q2.w.f21825f);
                            if (bVar == null) {
                                r52.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f21755a, bVar.f21756b, false, 0));
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                if (m.a(tVar.i(), q2.w.f21824e) != null) {
                                    List listH2 = t.h(4, tVar);
                                    int size8 = listH2.size();
                                    for (int i42 = 0; i42 < size8; i42++) {
                                        t tVar5 = (t) listH2.get(i42);
                                        if (tVar5.i().f21799a.b(q2.w.G)) {
                                            arrayList6.add(tVar5);
                                        }
                                    }
                                }
                                if (!arrayList6.isEmpty()) {
                                    boolean zA2 = k2.a.a(arrayList6);
                                    r52.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zA2 ? i15 : arrayList6.size(), zA2 ? arrayList6.size() : i15, false, 0));
                                }
                            }
                            if (((q2.c) m.a(tVar.i(), q2.w.f21826g)) != null) {
                                r52.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 0, 0, 0, false, ((Boolean) tVar.i().g(q2.w.G, k2.b.f15941a)).booleanValue()));
                            }
                            tVarJ = tVar.j();
                            if (tVarJ != null && m.a(tVarJ.i(), q2.w.f21824e) != null && ((bVar2 = (q2.b) m.a(tVarJ.i(), q2.w.f21825f)) == null || (bVar2.f21755a >= 0 && bVar2.f21756b >= 0))) {
                                if (tVar.i().f21799a.b(q2.w.G)) {
                                    ArrayList arrayList7 = new ArrayList();
                                    List listH3 = t.h(4, tVarJ);
                                    int size9 = listH3.size();
                                    int i43 = 0;
                                    for (int i44 = 0; i44 < size9; i44++) {
                                        t tVar6 = (t) listH3.get(i44);
                                        if (tVar6.i().f21799a.b(q2.w.G)) {
                                            arrayList7.add(tVar6);
                                            if (tVar6.f21810c.H() < tVar.f21810c.H()) {
                                                i43++;
                                            }
                                        }
                                    }
                                    if (!arrayList7.isEmpty()) {
                                        boolean zA3 = k2.a.a(arrayList7);
                                        r52.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(zA3 ? 0 : i43, 1, zA3 ? i43 : 0, 1, false, ((Boolean) tVar.i().g(q2.w.G, a.C0159a.f15940a)).booleanValue()));
                                    }
                                }
                            }
                            jVar4 = (q2.j) m.a(lVar4, q2.w.f21838s);
                            q2.a aVar11 = (q2.a) m.a(tVar.k(), q2.k.f21776d);
                            if (jVar4 != null && aVar11 != null) {
                                if (!(m.a(tVar.i(), q2.w.f21825f) == null || m.a(tVar.i(), q2.w.f21824e) != null)) {
                                    jVar3.g("android.widget.HorizontalScrollView");
                                }
                                if (jVar4.a().invoke().floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                    jVar3.h();
                                }
                                if (j2.e0.a(tVar)) {
                                    if (c.y(jVar4)) {
                                        jVar3.b(j.a.f34730g);
                                        jVar3.b(!j2.e0.g(tVar) ? j.a.f34737n : j.a.f34735l);
                                    }
                                    if (c.x(jVar4)) {
                                        jVar3.b(j.a.f34731h);
                                        jVar3.b(!j2.e0.g(tVar) ? j.a.f34735l : j.a.f34737n);
                                    }
                                }
                            }
                            jVar5 = (q2.j) m.a(tVar.k(), q2.w.f21839t);
                            if (jVar5 != null && aVar11 != null) {
                                if (!(m.a(tVar.i(), q2.w.f21825f) == null || m.a(tVar.i(), q2.w.f21824e) != null)) {
                                    jVar3.g("android.widget.ScrollView");
                                }
                                if (jVar5.a().invoke().floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                    jVar3.h();
                                }
                                if (j2.e0.a(tVar)) {
                                    if (c.y(jVar5)) {
                                        jVar3.b(j.a.f34730g);
                                        jVar3.b(j.a.f34736m);
                                    }
                                    if (c.x(jVar5)) {
                                        jVar3.b(j.a.f34731h);
                                        jVar3.b(j.a.f34734k);
                                    }
                                }
                            }
                            if (i14 >= 29) {
                                q2.l lVar9 = tVar.f21811d;
                                q2.i iVar8 = (q2.i) m.a(lVar9, q2.w.f21842w);
                                if (j2.e0.a(tVar) && (iVar8 == null || iVar8.f21770a != 8)) {
                                    q2.a aVar12 = (q2.a) m.a(lVar9, q2.k.f21796x);
                                    if (aVar12 != null) {
                                        jVar3.b(new j.a(android.R.id.accessibilityActionPageUp, aVar12.f21752a));
                                    }
                                    q2.a aVar13 = (q2.a) m.a(lVar9, q2.k.f21798z);
                                    if (aVar13 != null) {
                                        jVar3.b(new j.a(android.R.id.accessibilityActionPageDown, aVar13.f21752a));
                                    }
                                    q2.a aVar14 = (q2.a) m.a(lVar9, q2.k.f21797y);
                                    if (aVar14 != null) {
                                        jVar3.b(new j.a(android.R.id.accessibilityActionPageLeft, aVar14.f21752a));
                                    }
                                    q2.a aVar15 = (q2.a) m.a(lVar9, q2.k.A);
                                    if (aVar15 != null) {
                                        jVar3.b(new j.a(android.R.id.accessibilityActionPageRight, aVar15.f21752a));
                                    }
                                }
                            }
                            r52.setPaneTitle((CharSequence) m.a(tVar.k(), q2.w.f21823d));
                            if (j2.e0.a(tVar)) {
                                q2.a aVar16 = (q2.a) m.a(tVar.k(), q2.k.f21791s);
                                if (aVar16 != null) {
                                    jVar3.b(new j.a(PKIFailureInfo.transactionIdInUse, aVar16.a()));
                                    pg.f0 f0Var14 = pg.f0.f21461a;
                                }
                                q2.a aVar17 = (q2.a) m.a(tVar.k(), q2.k.f21792t);
                                if (aVar17 != null) {
                                    jVar3.b(new j.a(PKIFailureInfo.signerNotTrusted, aVar17.a()));
                                    pg.f0 f0Var15 = pg.f0.f21461a;
                                }
                                q2.a aVar18 = (q2.a) m.a(tVar.k(), q2.k.f21793u);
                                if (aVar18 != null) {
                                    jVar3.b(new j.a(PKIFailureInfo.badCertTemplate, aVar18.a()));
                                    pg.f0 f0Var16 = pg.f0.f21461a;
                                }
                                q2.l lVarK = tVar.k();
                                c0<List<q2.e>> c0Var6 = q2.k.f21795w;
                                if (lVarK.f21799a.b(c0Var6)) {
                                    List list5 = (List) tVar.k().f(c0Var6);
                                    x xVar3 = xVar;
                                    if (list5.size() >= xVar3.f20751b) {
                                        throw new IllegalStateException(x0.a.a(new StringBuilder("Can't have more than "), xVar3.f20751b, " custom actions for one widget"));
                                    }
                                    c1<CharSequence> c1Var3 = new c1<>(0);
                                    f0<CharSequence> f0VarA = p0.a();
                                    c1<f0<CharSequence>> c1Var4 = c1Var;
                                    if (c1Var4.f20582a) {
                                        d1.a(c1Var4);
                                    }
                                    if (q.a.a(c1Var4.f20585d, i11, c1Var4.f20583b) >= 0) {
                                        f0<CharSequence> f0VarC = c1Var4.c(i11);
                                        x xVar4 = new x();
                                        int[] iArr = xVar3.f20750a;
                                        int i45 = xVar3.f20751b;
                                        for (int i46 = 0; i46 < i45; i46++) {
                                            xVar4.a(iArr[i46]);
                                        }
                                        ArrayList arrayList8 = new ArrayList();
                                        int size10 = list5.size();
                                        int i47 = 0;
                                        while (i47 < size10) {
                                            q2.e eVar = (q2.e) list5.get(i47);
                                            r.b(f0VarC);
                                            int i48 = size10;
                                            if (f0VarC.d(eVar.a()) >= 0) {
                                                int iE = f0VarC.e(eVar.a());
                                                f0Var = f0VarC;
                                                c1Var3.e(iE, eVar.a());
                                                f0VarA.h(iE, eVar.a());
                                                xVar4.e(iE);
                                                jVar3.b(new j.a(iE, eVar.a()));
                                            } else {
                                                f0Var = f0VarC;
                                                arrayList8.add(eVar);
                                            }
                                            i47++;
                                            size10 = i48;
                                            f0VarC = f0Var;
                                        }
                                        int size11 = arrayList8.size();
                                        for (int i49 = 0; i49 < size11; i49++) {
                                            q2.e eVar2 = (q2.e) arrayList8.get(i49);
                                            int iC = xVar4.c(i49);
                                            c1Var3.e(iC, eVar2.a());
                                            f0VarA.h(iC, eVar2.a());
                                            jVar3.b(new j.a(iC, eVar2.a()));
                                        }
                                    } else {
                                        int size12 = list5.size();
                                        for (int i50 = 0; i50 < size12; i50++) {
                                            q2.e eVar3 = (q2.e) list5.get(i50);
                                            int iC2 = xVar3.c(i50);
                                            c1Var3.e(iC2, eVar3.a());
                                            f0VarA.h(iC2, eVar3.a());
                                            jVar3.b(new j.a(iC2, eVar3.a()));
                                        }
                                    }
                                    cVar.f1318u.e(i11, c1Var3);
                                    c1Var4.e(i11, f0VarA);
                                }
                            }
                            r52.setScreenReaderFocusable(j2.e0.h(tVar, resources4));
                            iD = cVar.E.d(i11);
                            if (iD == -1) {
                                i3.b bVarF3 = x4.f(androidComposeView.getAndroidViewsHandler$ui_release(), iD);
                                if (bVarF3 != null) {
                                    r52.setTraversalBefore(bVarF3);
                                    androidComposeView2 = androidComposeView;
                                } else {
                                    androidComposeView2 = androidComposeView;
                                    r52.setTraversalBefore(androidComposeView2, iD);
                                }
                                bundle = null;
                                cVar.j(i11, jVar3, cVar.G, null);
                            } else {
                                androidComposeView2 = androidComposeView;
                                bundle = null;
                            }
                            iD2 = cVar.F.d(i11);
                            if (iD2 != -1 && (bVarF = x4.f(androidComposeView2.getAndroidViewsHandler$ui_release(), iD2)) != null) {
                                r52.setTraversalAfter(bVarF);
                                cVar.j(i11, jVar3, cVar.H, bundle);
                            }
                            jVar = jVar3;
                        }
                    } else {
                        i11 = i10;
                        cVar = cVar2;
                        jVar3 = jVar2;
                    }
                    i13 = 1;
                    r52.setVisibleToUser((x4.d(tVar) ? 1 : 0) ^ i13);
                    if (((q2.g) m.a(lVar3, q2.w.f21829j)) != null) {
                    }
                    r52.setClickable(false);
                    aVar = (q2.a) m.a(lVar3, q2.k.f21774b);
                    if (aVar != null) {
                    }
                    r52.setLongClickable(false);
                    lVar4 = lVar2;
                    aVar2 = (q2.a) m.a(lVar4, q2.k.f21775c);
                    if (aVar2 != null) {
                    }
                    aVar3 = (q2.a) m.a(lVar4, q2.k.f21788p);
                    if (aVar3 != null) {
                    }
                    if (j2.e0.a(tVar)) {
                    }
                    strT = c.t(tVar);
                    if (strT != null) {
                        if (!(strT != null || strT.length() == 0)) {
                        }
                        i14 = Build.VERSION.SDK_INT;
                        ArrayList arrayList52 = new ArrayList();
                        arrayList52.add("androidx.compose.ui.semantics.id");
                        charSequenceF = jVar3.f();
                        if (charSequenceF != null) {
                            if (!(charSequenceF != null || charSequenceF.length() == 0)) {
                            }
                            if (lVar4.f21799a.b(q2.w.f21843x)) {
                            }
                            r52.setAvailableExtraData(arrayList52);
                            hVar = (q2.h) m.a(lVar4, q2.w.f21822c);
                            if (hVar == null) {
                            }
                            if (j2.e0.a(tVar)) {
                                jVar3.b(new j.a(android.R.id.accessibilityActionSetProgress, aVar4.f21752a));
                            }
                            bVar = (q2.b) m.a(tVar.i(), q2.w.f21825f);
                            if (bVar == null) {
                            }
                            if (((q2.c) m.a(tVar.i(), q2.w.f21826g)) != null) {
                            }
                            tVarJ = tVar.j();
                            if (tVarJ != null) {
                                if (tVar.i().f21799a.b(q2.w.G)) {
                                }
                            }
                            jVar4 = (q2.j) m.a(lVar4, q2.w.f21838s);
                            q2.a aVar112 = (q2.a) m.a(tVar.k(), q2.k.f21776d);
                            if (jVar4 != null) {
                                if (m.a(tVar.i(), q2.w.f21825f) == null) {
                                    if (!(m.a(tVar.i(), q2.w.f21825f) == null || m.a(tVar.i(), q2.w.f21824e) != null)) {
                                    }
                                    if (jVar4.a().invoke().floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                    }
                                    if (j2.e0.a(tVar)) {
                                    }
                                }
                            }
                            jVar5 = (q2.j) m.a(tVar.k(), q2.w.f21839t);
                            if (jVar5 != null) {
                                if (m.a(tVar.i(), q2.w.f21825f) == null) {
                                    if (!(m.a(tVar.i(), q2.w.f21825f) == null || m.a(tVar.i(), q2.w.f21824e) != null)) {
                                    }
                                    if (jVar5.a().invoke().floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                    }
                                    if (j2.e0.a(tVar)) {
                                    }
                                }
                            }
                            if (i14 >= 29) {
                            }
                            r52.setPaneTitle((CharSequence) m.a(tVar.k(), q2.w.f21823d));
                            if (j2.e0.a(tVar)) {
                            }
                            r52.setScreenReaderFocusable(j2.e0.h(tVar, resources4));
                            iD = cVar.E.d(i11);
                            if (iD == -1) {
                            }
                            iD2 = cVar.F.d(i11);
                            if (iD2 != -1) {
                                r52.setTraversalAfter(bVarF);
                                cVar.j(i11, jVar3, cVar.H, bundle);
                            }
                            jVar = jVar3;
                        }
                    }
                }
            }
            if (cVar.f1315r) {
                if (i11 == cVar.f1311n) {
                    cVar.f1313p = jVar;
                }
                if (i11 == cVar.f1312o) {
                    cVar.f1314q = jVar;
                }
            }
            return jVar;
        }

        @Override // z3.k
        public final j c(int i10) {
            c cVar = c.this;
            if (i10 != 1) {
                if (i10 == 2) {
                    return b(cVar.f1311n);
                }
                throw new IllegalArgumentException(j2.y.a(i10, "Unknown focus type: "));
            }
            int i11 = cVar.f1312o;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:472:0x0167, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:105:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0302  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:379:0x0605  */
        /* JADX WARN: Removed duplicated region for block: B:384:0x061f  */
        /* JADX WARN: Removed duplicated region for block: B:417:0x06dd  */
        @Override // z3.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean d(int i10, int i11, Bundle bundle) {
            t tVar;
            int i12;
            int i13;
            Integer num;
            j2.b bVar;
            int iR;
            int i14;
            h0 h0VarC;
            eh.a aVar;
            eh.a aVar2;
            eh.a aVar3;
            eh.a aVar4;
            float f10;
            float f11;
            Object obj;
            boolean z10;
            eh.a aVar5;
            float fIntBitsToFloat;
            eh.a aVar6;
            eh.l lVar;
            eh.a aVar7;
            eh.a aVar8;
            eh.a aVar9;
            eh.a aVar10;
            eh.a aVar11;
            eh.l lVar2;
            q2.a aVar12;
            long jY;
            float f12;
            float f13;
            float f14;
            float f15;
            eh.p pVar;
            q2.a aVar13;
            eh.l lVar3;
            eh.a aVar14;
            eh.a aVar15;
            eh.a aVar16;
            eh.a aVar17;
            eh.a aVar18;
            CharSequence charSequenceC;
            List list;
            Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
            c cVar = c.this;
            AndroidComposeView androidComposeView = cVar.f1301d;
            w4 w4VarB = cVar.s().b(i10);
            if (w4VarB != null && (tVar = w4VarB.f14962a) != null) {
                int i15 = tVar.f21814g;
                q2.l lVar4 = tVar.f21811d;
                l0<c0<?>, Object> l0Var = lVar4.f21799a;
                if (i11 == 64) {
                    AccessibilityManager accessibilityManager = cVar.f1304g;
                    if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i12 = cVar.f1311n) == i10) {
                        return false;
                    }
                    if (i12 != Integer.MIN_VALUE) {
                        i13 = 12;
                        num = null;
                        c.D(cVar, i12, 65536, null, 12);
                    } else {
                        i13 = 12;
                        num = null;
                    }
                    cVar.f1311n = i10;
                    androidComposeView.invalidate();
                    c.D(cVar, i10, 32768, num, i13);
                    return true;
                }
                if (i11 == 128) {
                    if (cVar.f1311n != i10) {
                        return false;
                    }
                    cVar.f1311n = PKIFailureInfo.systemUnavail;
                    cVar.f1313p = null;
                    androidComposeView.invalidate();
                    c.D(cVar, i10, 65536, null, 12);
                    return true;
                }
                if (i11 == 256 || i11 == 512) {
                    if (bundle != null) {
                        int i16 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                        boolean z12 = i11 == 256;
                        Integer num2 = cVar.f1321x;
                        if (num2 == null || i15 != num2.intValue()) {
                            cVar.f1320w = -1;
                            cVar.f1321x = Integer.valueOf(i15);
                        }
                        String strT = c.t(tVar);
                        if (strT != null && strT.length() != 0) {
                            String strT2 = c.t(tVar);
                            if (strT2 == null || strT2.length() == 0) {
                                bVar = null;
                                if (bVar != null) {
                                    int iQ = cVar.q(tVar);
                                    if (iQ == -1) {
                                        iQ = z12 ? 0 : strT.length();
                                    }
                                    int[] iArrB = z12 ? bVar.b(iQ) : bVar.e(iQ);
                                    if (iArrB != null) {
                                        int i17 = iArrB[0];
                                        int i18 = iArrB[1];
                                        if (z11 && !l0Var.b(q2.w.f21820a) && l0Var.b(q2.w.D)) {
                                            iR = cVar.r(tVar);
                                            if (iR == -1) {
                                                iR = z12 ? i17 : i18;
                                            }
                                            i14 = z12 ? i18 : i17;
                                        } else {
                                            iR = z12 ? i18 : i17;
                                            i14 = iR;
                                        }
                                        cVar.B = new d(tVar, z12 ? 256 : 512, i16, i17, i18, SystemClock.uptimeMillis());
                                        cVar.J(tVar, iR, i14, true);
                                        return true;
                                    }
                                }
                            } else {
                                if (i16 == 1) {
                                    Locale locale = androidComposeView.getContext().getResources().getConfiguration().locale;
                                    if (j2.c.f14670d == null) {
                                        j2.c cVar2 = new j2.c(0);
                                        cVar2.f14671c = BreakIterator.getCharacterInstance(locale);
                                        j2.c.f14670d = cVar2;
                                    }
                                    j2.c cVar3 = j2.c.f14670d;
                                    r.c(cVar3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                    cVar3.f14647a = strT2;
                                    BreakIterator breakIterator = cVar3.f14671c;
                                    if (breakIterator == null) {
                                        r.h("impl");
                                        throw null;
                                    }
                                    breakIterator.setText(strT2);
                                    bVar = cVar3;
                                } else if (i16 == 2) {
                                    Locale locale2 = androidComposeView.getContext().getResources().getConfiguration().locale;
                                    if (j2.g.f14725d == null) {
                                        j2.g gVar = new j2.g(0);
                                        gVar.f14726c = BreakIterator.getWordInstance(locale2);
                                        j2.g.f14725d = gVar;
                                    }
                                    j2.g gVar2 = j2.g.f14725d;
                                    r.c(gVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                    gVar2.f14647a = strT2;
                                    BreakIterator breakIterator2 = gVar2.f14726c;
                                    if (breakIterator2 == null) {
                                        r.h("impl");
                                        throw null;
                                    }
                                    breakIterator2.setText(strT2);
                                    bVar = gVar2;
                                } else if (i16 == 4) {
                                    if (l0Var.b(q2.k.f21773a) && (h0VarC = x4.c(lVar4)) != null) {
                                        if (i16 == 4) {
                                            if (j2.d.f14689d == null) {
                                                j2.d.f14689d = new j2.d(0);
                                            }
                                            j2.d dVar = j2.d.f14689d;
                                            r.c(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                            dVar.f14647a = strT2;
                                            dVar.f14692c = h0VarC;
                                            bVar = dVar;
                                        } else {
                                            if (j2.e.f14700e == null) {
                                                j2.e eVar = new j2.e(0);
                                                new Rect();
                                                j2.e.f14700e = eVar;
                                            }
                                            j2.e eVar2 = j2.e.f14700e;
                                            r.c(eVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                            eVar2.f14647a = strT2;
                                            eVar2.f14703c = h0VarC;
                                            eVar2.f14704d = tVar;
                                            bVar = eVar2;
                                        }
                                    }
                                } else if (i16 == 8) {
                                    if (j2.f.f14717c == null) {
                                        j2.f.f14717c = new j2.f(0);
                                    }
                                    j2.f fVar = j2.f.f14717c;
                                    r.c(fVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                    fVar.f14647a = strT2;
                                    bVar = fVar;
                                } else if (i16 != 16) {
                                }
                                if (bVar != null) {
                                }
                            }
                        }
                    }
                } else if (i11 == 16384) {
                    q2.a aVar19 = (q2.a) m.a(lVar4, q2.k.f21788p);
                    if (aVar19 != null && (aVar = (eh.a) aVar19.f21753b) != null) {
                        return ((Boolean) aVar.invoke()).booleanValue();
                    }
                } else {
                    if (i11 == 131072) {
                        boolean zJ = cVar.J(tVar, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                        if (zJ) {
                            c.D(cVar, cVar.z(i15), 0, null, 12);
                        }
                        return zJ;
                    }
                    if (j2.e0.a(tVar)) {
                        if (i11 == 1) {
                            q2.a aVar20 = (q2.a) m.a(lVar4, q2.k.f21794v);
                            if (aVar20 != null && (aVar2 = (eh.a) aVar20.f21753b) != null) {
                                return ((Boolean) aVar2.invoke()).booleanValue();
                            }
                        } else if (i11 != 2) {
                            switch (i11) {
                                case 16:
                                    q2.a aVar21 = (q2.a) m.a(lVar4, q2.k.f21774b);
                                    Boolean bool = (aVar21 == null || (aVar3 = (eh.a) aVar21.f21753b) == null) ? null : (Boolean) aVar3.invoke();
                                    c.D(cVar, i10, 1, null, 12);
                                    if (bool != null) {
                                        return bool.booleanValue();
                                    }
                                    break;
                                case 32:
                                    q2.a aVar22 = (q2.a) m.a(lVar4, q2.k.f21775c);
                                    if (aVar22 != null && (aVar4 = (eh.a) aVar22.f21753b) != null) {
                                        return ((Boolean) aVar4.invoke()).booleanValue();
                                    }
                                    break;
                                case 4096:
                                case 8192:
                                    boolean z13 = i11 == 4096;
                                    boolean z14 = i11 == 8192;
                                    boolean z15 = i11 == 16908345;
                                    boolean z16 = i11 == 16908347;
                                    boolean z17 = i11 == 16908344;
                                    boolean z18 = i11 == 16908346;
                                    boolean z19 = z15 || z16 || z13 || z14;
                                    boolean z20 = z17 || z18 || z13 || z14;
                                    if (z13 || z14) {
                                        q2.h hVar = (q2.h) m.a(lVar4, q2.w.f21822c);
                                        q2.a aVar23 = (q2.a) m.a(lVar4, q2.k.f21780h);
                                        if (hVar != null) {
                                            jh.d dVar2 = hVar.f21768b;
                                            if (aVar23 != null) {
                                                float f16 = dVar2.f15743b;
                                                float f17 = dVar2.f15742a;
                                                float fFloatValue = Float.valueOf(f16).floatValue();
                                                float fFloatValue2 = Float.valueOf(f17).floatValue();
                                                if (fFloatValue < fFloatValue2) {
                                                    fFloatValue = fFloatValue2;
                                                }
                                                float fFloatValue3 = Float.valueOf(f17).floatValue();
                                                float fFloatValue4 = Float.valueOf(dVar2.f15743b).floatValue();
                                                if (fFloatValue3 > fFloatValue4) {
                                                    fFloatValue3 = fFloatValue4;
                                                }
                                                int i19 = hVar.f21769c;
                                                if (i19 > 0) {
                                                    f10 = fFloatValue - fFloatValue3;
                                                    f11 = i19 + 1;
                                                } else {
                                                    f10 = fFloatValue - fFloatValue3;
                                                    f11 = 20;
                                                }
                                                float f18 = f10 / f11;
                                                if (z14) {
                                                    f18 = -f18;
                                                }
                                                eh.l lVar5 = (eh.l) aVar23.f21753b;
                                                if (lVar5 != null) {
                                                    return ((Boolean) lVar5.invoke(Float.valueOf(hVar.f21767a + f18))).booleanValue();
                                                }
                                            } else {
                                                long jD = g2.w.a(tVar.f21810c.I.f13790b).d();
                                                ArrayList arrayList = new ArrayList();
                                                q2.a aVar24 = (q2.a) m.a(lVar4, q2.k.B);
                                                Float f19 = (aVar24 == null || (lVar = (eh.l) aVar24.f21753b) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                                q2.a aVar25 = (q2.a) m.a(lVar4, q2.k.f21776d);
                                                if (aVar25 != null) {
                                                    Object obj2 = aVar25.f21753b;
                                                    q2.j jVar = (q2.j) m.a(lVar4, q2.w.f21838s);
                                                    if (jVar == null || !z19) {
                                                        obj = obj2;
                                                        z10 = z20;
                                                    } else {
                                                        if (f19 != null) {
                                                            fIntBitsToFloat = f19.floatValue();
                                                            obj = obj2;
                                                            z10 = z20;
                                                        } else {
                                                            obj = obj2;
                                                            z10 = z20;
                                                            fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
                                                        }
                                                        if (z15 || z14) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (j2.e0.g(tVar) && (z15 || z16)) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (c.w(jVar, fIntBitsToFloat)) {
                                                            c0<q2.a<eh.a<Boolean>>> c0Var = q2.k.f21797y;
                                                            if (l0Var.b(c0Var) || l0Var.b(q2.k.A)) {
                                                                q2.a aVar26 = fIntBitsToFloat > CropImageView.DEFAULT_ASPECT_RATIO ? (q2.a) m.a(lVar4, q2.k.A) : (q2.a) m.a(lVar4, c0Var);
                                                                if (aVar26 != null && (aVar6 = (eh.a) aVar26.f21753b) != null) {
                                                                    return ((Boolean) aVar6.invoke()).booleanValue();
                                                                }
                                                            } else {
                                                                eh.p pVar2 = (eh.p) obj;
                                                                if (pVar2 != null) {
                                                                    return ((Boolean) pVar2.invoke(Float.valueOf(fIntBitsToFloat), fValueOf)).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                    q2.j jVar2 = (q2.j) m.a(lVar4, q2.w.f21839t);
                                                    if (jVar2 != null && z10) {
                                                        float fFloatValue5 = f19 != null ? f19.floatValue() : Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & jD));
                                                        if (z17 || z14) {
                                                            fFloatValue5 = -fFloatValue5;
                                                        }
                                                        if (c.w(jVar2, fFloatValue5)) {
                                                            c0<q2.a<eh.a<Boolean>>> c0Var2 = q2.k.f21796x;
                                                            if (l0Var.b(c0Var2) || l0Var.b(q2.k.f21798z)) {
                                                                q2.a aVar27 = fFloatValue5 > CropImageView.DEFAULT_ASPECT_RATIO ? (q2.a) m.a(lVar4, q2.k.f21798z) : (q2.a) m.a(lVar4, c0Var2);
                                                                if (aVar27 != null && (aVar5 = (eh.a) aVar27.f21753b) != null) {
                                                                    return ((Boolean) aVar5.invoke()).booleanValue();
                                                                }
                                                            } else {
                                                                eh.p pVar3 = (eh.p) obj;
                                                                if (pVar3 != null) {
                                                                    return ((Boolean) pVar3.invoke(fValueOf, Float.valueOf(fFloatValue5))).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    q2.a aVar28 = (q2.a) m.a(lVar4, q2.k.f21790r);
                                    if (aVar28 != null && (aVar7 = (eh.a) aVar28.f21753b) != null) {
                                        return ((Boolean) aVar7.invoke()).booleanValue();
                                    }
                                    break;
                                case 65536:
                                    q2.a aVar29 = (q2.a) m.a(lVar4, q2.k.f21789q);
                                    if (aVar29 != null && (aVar8 = (eh.a) aVar29.f21753b) != null) {
                                        return ((Boolean) aVar8.invoke()).booleanValue();
                                    }
                                    break;
                                case PKIFailureInfo.transactionIdInUse /* 262144 */:
                                    q2.a aVar30 = (q2.a) m.a(lVar4, q2.k.f21791s);
                                    if (aVar30 != null && (aVar9 = (eh.a) aVar30.f21753b) != null) {
                                        return ((Boolean) aVar9.invoke()).booleanValue();
                                    }
                                    break;
                                case PKIFailureInfo.signerNotTrusted /* 524288 */:
                                    q2.a aVar31 = (q2.a) m.a(lVar4, q2.k.f21792t);
                                    if (aVar31 != null && (aVar10 = (eh.a) aVar31.f21753b) != null) {
                                        return ((Boolean) aVar10.invoke()).booleanValue();
                                    }
                                    break;
                                case PKIFailureInfo.badCertTemplate /* 1048576 */:
                                    q2.a aVar32 = (q2.a) m.a(lVar4, q2.k.f21793u);
                                    if (aVar32 != null && (aVar11 = (eh.a) aVar32.f21753b) != null) {
                                        return ((Boolean) aVar11.invoke()).booleanValue();
                                    }
                                    break;
                                case PKIFailureInfo.badSenderNonce /* 2097152 */:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    q2.a aVar33 = (q2.a) m.a(lVar4, q2.k.f21782j);
                                    if (aVar33 != null && (lVar2 = (eh.l) aVar33.f21753b) != null) {
                                        if (string == null) {
                                            string = "";
                                        }
                                        return ((Boolean) lVar2.invoke(new t2.b(string))).booleanValue();
                                    }
                                    break;
                                case android.R.id.accessibilityActionShowOnScreen:
                                    t tVarJ = tVar.j();
                                    if (tVarJ != null) {
                                        aVar12 = (q2.a) m.a(tVarJ.f21811d, q2.k.f21776d);
                                        while (tVarJ != null && aVar12 == null) {
                                            tVarJ = tVarJ.j();
                                            if (tVarJ != null) {
                                                aVar12 = (q2.a) m.a(tVarJ.f21811d, q2.k.f21776d);
                                            }
                                        }
                                        if (tVarJ != null) {
                                            q2.l lVar6 = tVarJ.f21811d;
                                            e0 e0Var = tVarJ.f21810c;
                                            p1.e eVarA = g2.w.a(e0Var.I.f13790b);
                                            g2.v vVarS = e0Var.I.f13790b.S();
                                            p1.e eVarJ = eVarA.j(vVarS != null ? ((g1) vVarS).Y(0L) : 0L);
                                            g1 g1VarC = tVar.c();
                                            if (g1VarC == null) {
                                                jY = 0;
                                                g1 g1VarC2 = tVar.c();
                                                p1.e eVarA2 = p1.f.a(jY, q.e(g1VarC2 != null ? g1VarC2.f11384c : 0L));
                                                f12 = eVarA2.f21131a - eVarJ.f21131a;
                                                f13 = eVarA2.f21133c - eVarJ.f21133c;
                                                if (Math.signum(f12) == Math.signum(f13)) {
                                                    f12 = 0.0f;
                                                } else if (Math.abs(f12) >= Math.abs(f13)) {
                                                    f12 = f13;
                                                }
                                                if (j2.e0.g(tVar)) {
                                                    f12 = -f12;
                                                }
                                                f14 = eVarA2.f21132b - eVarJ.f21132b;
                                                f15 = eVarA2.f21134d - eVarJ.f21134d;
                                                if (Math.signum(f14) == Math.signum(f15)) {
                                                    f15 = 0.0f;
                                                } else if (Math.abs(f14) < Math.abs(f15)) {
                                                    f15 = f14;
                                                }
                                                if (aVar12 != null && (pVar = (eh.p) aVar12.f21753b) != null) {
                                                    return ((Boolean) pVar.invoke(Float.valueOf(f12), Float.valueOf(f15))).booleanValue();
                                                }
                                            } else {
                                                g1 g1Var = g1VarC.l1().f1157p ? g1VarC : null;
                                                if (g1Var != null) {
                                                    jY = g1Var.Y(0L);
                                                }
                                                g1 g1VarC22 = tVar.c();
                                                p1.e eVarA22 = p1.f.a(jY, q.e(g1VarC22 != null ? g1VarC22.f11384c : 0L));
                                                f12 = eVarA22.f21131a - eVarJ.f21131a;
                                                f13 = eVarA22.f21133c - eVarJ.f21133c;
                                                if (Math.signum(f12) == Math.signum(f13)) {
                                                }
                                                if (j2.e0.g(tVar)) {
                                                }
                                                f14 = eVarA22.f21132b - eVarJ.f21132b;
                                                f15 = eVarA22.f21134d - eVarJ.f21134d;
                                                if (Math.signum(f14) == Math.signum(f15)) {
                                                }
                                                if (aVar12 != null) {
                                                    return ((Boolean) pVar.invoke(Float.valueOf(f12), Float.valueOf(f15))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    aVar12 = null;
                                    break;
                                case android.R.id.accessibilityActionSetProgress:
                                    if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && (aVar13 = (q2.a) m.a(lVar4, q2.k.f21780h)) != null && (lVar3 = (eh.l) aVar13.f21753b) != null) {
                                        return ((Boolean) lVar3.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                    break;
                                case android.R.id.accessibilityActionImeEnter:
                                    q2.a aVar34 = (q2.a) m.a(lVar4, q2.k.f21787o);
                                    if (aVar34 != null && (aVar14 = (eh.a) aVar34.f21753b) != null) {
                                        return ((Boolean) aVar14.invoke()).booleanValue();
                                    }
                                    break;
                                default:
                                    switch (i11) {
                                        case android.R.id.accessibilityActionScrollUp:
                                        case android.R.id.accessibilityActionScrollLeft:
                                        case android.R.id.accessibilityActionScrollDown:
                                        case android.R.id.accessibilityActionScrollRight:
                                            break;
                                        default:
                                            switch (i11) {
                                                case android.R.id.accessibilityActionPageUp:
                                                    q2.a aVar35 = (q2.a) m.a(lVar4, q2.k.f21796x);
                                                    if (aVar35 != null && (aVar15 = (eh.a) aVar35.f21753b) != null) {
                                                        return ((Boolean) aVar15.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionPageDown:
                                                    q2.a aVar36 = (q2.a) m.a(lVar4, q2.k.f21798z);
                                                    if (aVar36 != null && (aVar16 = (eh.a) aVar36.f21753b) != null) {
                                                        return ((Boolean) aVar16.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionPageLeft:
                                                    q2.a aVar37 = (q2.a) m.a(lVar4, q2.k.f21797y);
                                                    if (aVar37 != null && (aVar17 = (eh.a) aVar37.f21753b) != null) {
                                                        return ((Boolean) aVar17.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionPageRight:
                                                    q2.a aVar38 = (q2.a) m.a(lVar4, q2.k.A);
                                                    if (aVar38 != null && (aVar18 = (eh.a) aVar38.f21753b) != null) {
                                                        return ((Boolean) aVar18.invoke()).booleanValue();
                                                    }
                                                    break;
                                                default:
                                                    c1<CharSequence> c1VarC = cVar.f1318u.c(i10);
                                                    if (c1VarC != null && (charSequenceC = c1VarC.c(i11)) != null && (list = (List) m.a(lVar4, q2.k.f21795w)) != null) {
                                                        int size = list.size();
                                                        for (int i20 = 0; i20 < size; i20++) {
                                                            q2.e eVar3 = (q2.e) list.get(i20);
                                                            if (r.a(eVar3.f21764a, charSequenceC)) {
                                                                return eVar3.f21765b.invoke().booleanValue();
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                            }
                                    }
                            }
                        } else if (r.a(m.a(lVar4, q2.w.f21830k), Boolean.TRUE)) {
                            androidComposeView.getFocusOwner().l(8, false, true);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final t f1326a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1327b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1328c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1329d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1330e;

        /* renamed from: f, reason: collision with root package name */
        public final long f1331f;

        public d(t tVar, int i10, int i11, int i12, int i13, long j10) {
            this.f1326a = tVar;
            this.f1327b = i10;
            this.f1328c = i11;
            this.f1329d = i12;
            this.f1330e = i13;
            this.f1331f = j10;
        }
    }

    public static final class e extends s implements eh.l<AccessibilityEvent, Boolean> {
        public e() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            c cVar = c.this;
            return Boolean.valueOf(cVar.f1301d.getParent().requestSendAccessibilityEvent(cVar.f1301d, accessibilityEvent));
        }
    }

    public static final class f extends s implements eh.l<u4, pg.f0> {
        public f() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(u4 u4Var) {
            u4 u4Var2 = u4Var;
            if (u4Var2.f14915b.contains(u4Var2)) {
                c cVar = c.this;
                cVar.f1301d.getSnapshotObserver().a(u4Var2, cVar.O, new a0(u4Var2, cVar));
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g extends s implements eh.l<e0, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f1334a = new g(1);

        @Override // eh.l
        public final Boolean invoke(e0 e0Var) {
            q2.l lVarE = e0Var.e();
            boolean z10 = false;
            if (lVarE != null && lVarE.f21801c) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class h extends s implements eh.l<e0, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f1335a = new h(1);

        @Override // eh.l
        public final Boolean invoke(e0 e0Var) {
            return Boolean.valueOf(e0Var.I.d(8));
        }
    }

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        x xVar = p.h.f20635a;
        x xVar2 = new x(32);
        int i10 = xVar2.f20751b;
        if (i10 < 0) {
            q.d.b("");
            throw null;
        }
        int i11 = i10 + 32;
        xVar2.b(i11);
        int[] iArr2 = xVar2.f20750a;
        int i12 = xVar2.f20751b;
        if (i10 != i12) {
            qg.m.d(i11, iArr2, i10, i12, iArr2);
        }
        qg.m.h(i10, iArr, 0, 12, iArr2);
        xVar2.f20751b += 32;
        P = xVar2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [j2.v] */
    /* JADX WARN: Type inference failed for: r2v4, types: [j2.w] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j2.x] */
    public c(AndroidComposeView androidComposeView) {
        this.f1301d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        r.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f1304g = accessibilityManager;
        this.f1305h = 100L;
        this.f1306i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: j2.v
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                androidx.compose.ui.platform.c cVar = this.f14923a;
                cVar.f1308k = z10 ? cVar.f1304g.getEnabledAccessibilityServiceList(-1) : qg.z.f22752a;
            }
        };
        this.f1307j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: j2.w
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                androidx.compose.ui.platform.c cVar = this.f14935a;
                cVar.f1308k = cVar.f1304g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f1308k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f1309l = new Handler(Looper.getMainLooper());
        this.f1310m = new C0018c();
        this.f1311n = PKIFailureInfo.systemUnavail;
        this.f1312o = PKIFailureInfo.systemUnavail;
        this.f1316s = new y<>();
        this.f1317t = new y<>();
        this.f1318u = new c1<>(0);
        this.f1319v = new c1<>(0);
        this.f1320w = -1;
        this.f1322y = new p.b<>(0);
        this.f1323z = rh.k.a(1, 6, null);
        this.A = true;
        y yVar = p.j.f20648a;
        r.c(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.C = yVar;
        this.D = new z((Object) null);
        this.E = new w();
        this.F = new w();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new n();
        this.J = new y<>();
        t tVarA = androidComposeView.getSemanticsOwner().a();
        r.c(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.K = new v4(tVarA, yVar);
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.M = new Runnable() { // from class: j2.x
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.platform.c cVar = this.f14966a;
                Trace.beginSection("measureAndLayout");
                try {
                    cVar.f1301d.a(true);
                    pg.f0 f0Var = pg.f0.f21461a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        cVar.n();
                        Trace.endSection();
                        cVar.L = false;
                    } finally {
                    }
                } finally {
                }
            }
        };
        this.N = new ArrayList();
        this.O = new f();
    }

    public static /* synthetic */ void D(c cVar, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        cVar.C(i10, i11, num, null);
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
                r.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(t tVar) {
        t2.b bVar;
        if (tVar != null) {
            q2.l lVar = tVar.f21811d;
            l0<c0<?>, Object> l0Var = lVar.f21799a;
            c0<List<String>> c0Var = q2.w.f21820a;
            if (l0Var.b(c0Var)) {
                return h3.a.a((List) lVar.f(c0Var), ",", null, 62);
            }
            c0<t2.b> c0Var2 = q2.w.D;
            if (l0Var.b(c0Var2)) {
                t2.b bVar2 = (t2.b) m.a(lVar, c0Var2);
                if (bVar2 != null) {
                    return bVar2.f27761b;
                }
            } else {
                List list = (List) m.a(lVar, q2.w.f21845z);
                if (list != null && (bVar = (t2.b) qg.x.D(list)) != null) {
                    return bVar.f27761b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r3v2, types: [eh.a, kotlin.jvm.internal.s] */
    public static final boolean w(q2.j jVar, float f10) {
        ?? r02 = jVar.f21771a;
        if (f10 >= CropImageView.DEFAULT_ASPECT_RATIO || ((Number) r02.invoke()).floatValue() <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return f10 > CropImageView.DEFAULT_ASPECT_RATIO && ((Number) r02.invoke()).floatValue() < ((Number) jVar.f21772b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eh.a, kotlin.jvm.internal.s] */
    public static final boolean x(q2.j jVar) {
        ?? r02 = jVar.f21771a;
        if (((Number) r02.invoke()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        ((Number) jVar.f21772b.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r2v1, types: [eh.a, kotlin.jvm.internal.s] */
    public static final boolean y(q2.j jVar) {
        ?? r02 = jVar.f21771a;
        if (((Number) r02.invoke()).floatValue() < ((Number) jVar.f21772b.invoke()).floatValue()) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(t tVar, v4 v4Var) {
        int[] iArr = p.k.f20650a;
        z zVar = new z((Object) null);
        List listH = t.h(4, tVar);
        e0 e0Var = tVar.f21810c;
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar2 = (t) listH.get(i10);
            p.i<w4> iVarS = s();
            int i11 = tVar2.f21814g;
            if (iVarS.a(i11)) {
                if (!v4Var.f14933b.b(i11)) {
                    v(e0Var);
                    return;
                }
                zVar.a(i11);
            }
        }
        z zVar2 = v4Var.f14933b;
        int[] iArr2 = zVar2.f20760b;
        long[] jArr = zVar2.f20759a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128 && !zVar.b(iArr2[(i12 << 3) + i14])) {
                            v(e0Var);
                            return;
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 == length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        List listH2 = t.h(4, tVar);
        int size2 = listH2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            t tVar3 = (t) listH2.get(i15);
            if (s().a(tVar3.f21814g)) {
                v4 v4VarB = this.J.b(tVar3.f21814g);
                r.b(v4VarB);
                A(tVar3, v4VarB);
            }
        }
    }

    public final boolean B(AccessibilityEvent accessibilityEvent) {
        if (!u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f1315r = true;
        }
        try {
            return ((Boolean) this.f1303f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f1315r = false;
        }
    }

    public final boolean C(int i10, int i11, Integer num, List<String> list) {
        if (i10 == Integer.MIN_VALUE || !u()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i10, i11);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(h3.a.a(list, ",", null, 62));
        }
        return B(accessibilityEventO);
    }

    public final void E(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventO = o(z(i10), 32);
        accessibilityEventO.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        B(accessibilityEventO);
    }

    public final void F(int i10) {
        d dVar = this.B;
        if (dVar != null) {
            t tVar = dVar.f1326a;
            if (i10 != tVar.f21814g) {
                return;
            }
            if (SystemClock.uptimeMillis() - dVar.f1331f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(z(tVar.f21814g), 131072);
                accessibilityEventO.setFromIndex(dVar.f1329d);
                accessibilityEventO.setToIndex(dVar.f1330e);
                accessibilityEventO.setAction(dVar.f1327b);
                accessibilityEventO.setMovementGranularity(dVar.f1328c);
                accessibilityEventO.getText().add(t(tVar));
                B(accessibilityEventO);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0504 A[PHI: r39
      0x0504: PHI (r39v13 int) = (r39v11 int), (r39v15 int) binds: [B:222:0x0548, B:196:0x0501] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(p.i<w4> iVar) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i10;
        int i11;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i12;
        int i13;
        int i14;
        Integer num4;
        int i15;
        v4 v4VarB;
        int i16;
        t tVar;
        q2.l lVar;
        boolean z10;
        boolean z11;
        l0<c0<?>, Object> l0Var;
        int i17;
        l0<c0<?>, Object> l0Var2;
        e0 e0Var;
        int i18;
        int i19;
        l0<c0<?>, Object> l0Var3;
        Integer num5;
        ArrayList arrayList3;
        long j10;
        int i20;
        t tVar2;
        int i21;
        l0<c0<?>, Object> l0Var4;
        e0 e0Var2;
        Integer num6;
        int i22;
        q2.l lVar2;
        int i23;
        int i24;
        u4 u4Var;
        boolean z12;
        c0<String> c0Var;
        boolean z13;
        T t3;
        int i25;
        u4 u4Var2;
        String str;
        q2.l lVar3;
        int i26;
        int i27;
        int i28;
        AccessibilityEvent accessibilityEventP;
        p.i<w4> iVar2 = iVar;
        Integer num7 = 64;
        ArrayList arrayList4 = this.N;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = iVar2.f20644b;
        long[] jArr3 = iVar2.f20643a;
        int i29 = 2;
        int length = jArr3.length - 2;
        int i30 = 0;
        Integer num8 = 0;
        if (length < 0) {
            return;
        }
        int i31 = 0;
        while (true) {
            long j11 = jArr3[i31];
            int i32 = i29;
            int i33 = length;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i34 = 8;
                int i35 = 8 - ((~(i31 - i33)) >>> 31);
                long j12 = j11;
                int i36 = i30;
                while (i36 < i35) {
                    if ((j12 & 255) >= 128 || (v4VarB = this.J.b((i15 = iArr3[(i31 << 3) + i36]))) == null) {
                        i11 = i36;
                        num3 = num7;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i12 = i34;
                        i13 = i35;
                        i14 = i31;
                        num4 = num8;
                    } else {
                        q2.l lVar4 = v4VarB.f14932a;
                        l0<c0<?>, Object> l0Var5 = lVar4.f21799a;
                        w4 w4VarB = iVar2.b(i15);
                        int i37 = i34;
                        t tVar3 = w4VarB != null ? w4VarB.f14962a : null;
                        if (tVar3 == null) {
                            throw k1.a.a("no value for specified key");
                        }
                        e0 e0Var3 = tVar3.f21810c;
                        q2.l lVar5 = tVar3.f21811d;
                        iArr2 = iArr3;
                        int i38 = tVar3.f21814g;
                        jArr2 = jArr3;
                        l0<c0<?>, Object> l0Var6 = lVar5.f21799a;
                        i14 = i31;
                        Object[] objArr = l0Var6.f20738b;
                        Object[] objArr2 = l0Var6.f20739c;
                        long[] jArr4 = l0Var6.f20737a;
                        i11 = i36;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i39 = i38;
                            l0<c0<?>, Object> l0Var7 = l0Var6;
                            int i40 = 0;
                            z10 = false;
                            while (true) {
                                long j13 = jArr4[i40];
                                e0 e0Var4 = e0Var3;
                                i13 = i35;
                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i41 = 8 - ((~(i40 - length2)) >>> 31);
                                    int i42 = 0;
                                    while (i42 < i41) {
                                        if ((j13 & 255) < 128) {
                                            int i43 = (i40 << 3) + i42;
                                            Object obj = objArr[i43];
                                            int i44 = length2;
                                            Object obj2 = objArr2[i43];
                                            j10 = j13;
                                            c0 c0Var2 = (c0) obj;
                                            c0<q2.j> c0Var3 = q2.w.f21838s;
                                            if (r.a(c0Var2, c0Var3)) {
                                                i20 = i42;
                                            } else {
                                                i20 = i42;
                                                if (!r.a(c0Var2, q2.w.f21839t)) {
                                                    i21 = i40;
                                                    z12 = false;
                                                }
                                                if (z12 && r.a(obj2, m.a(lVar4, c0Var2))) {
                                                    i22 = i15;
                                                    num5 = num7;
                                                    arrayList3 = arrayList5;
                                                    tVar2 = tVar3;
                                                    l0Var4 = l0Var7;
                                                    e0Var2 = e0Var4;
                                                    i24 = i44;
                                                    num6 = num8;
                                                    lVar2 = lVar4;
                                                    l0Var3 = l0Var5;
                                                    i23 = i39;
                                                } else {
                                                    c0Var = q2.w.f21823d;
                                                    if (r.a(c0Var2, c0Var)) {
                                                        if ((r.a(c0Var2, q2.w.f21821b) ? true : r.a(c0Var2, q2.w.H)) || r.a(c0Var2, q2.w.f21822c)) {
                                                            D(this, z(i15), 2048, num7, 8);
                                                            D(this, z(i15), 2048, num8, 8);
                                                        } else {
                                                            c0<Boolean> c0Var4 = q2.w.G;
                                                            arrayList3 = arrayList5;
                                                            if (r.a(c0Var2, c0Var4)) {
                                                                q2.i iVar3 = (q2.i) m.a(lVar5, q2.w.f21842w);
                                                                if (!(iVar3 != null && iVar3.f21770a == 4)) {
                                                                    tVar2 = tVar3;
                                                                    e0Var2 = e0Var4;
                                                                    D(this, z(i15), 2048, num7, 8);
                                                                    D(this, z(i15), 2048, num8, 8);
                                                                } else if (r.a(m.a(lVar5, c0Var4), Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventO = o(z(i15), 4);
                                                                    e0Var2 = e0Var4;
                                                                    t tVar4 = new t(tVar3.f21808a, true, e0Var2, lVar5);
                                                                    List list = (List) m.a(tVar4.i(), q2.w.f21820a);
                                                                    String strA = list != null ? h3.a.a(list, ",", null, 62) : null;
                                                                    List list2 = (List) m.a(tVar4.i(), q2.w.f21845z);
                                                                    tVar2 = tVar3;
                                                                    String strA2 = list2 != null ? h3.a.a(list2, ",", null, 62) : null;
                                                                    if (strA != null) {
                                                                        accessibilityEventO.setContentDescription(strA);
                                                                        pg.f0 f0Var = pg.f0.f21461a;
                                                                    }
                                                                    if (strA2 != null) {
                                                                        accessibilityEventO.getText().add(strA2);
                                                                    }
                                                                    B(accessibilityEventO);
                                                                } else {
                                                                    tVar2 = tVar3;
                                                                    e0Var2 = e0Var4;
                                                                    D(this, z(i15), 2048, num8, 8);
                                                                }
                                                            } else {
                                                                tVar2 = tVar3;
                                                                e0Var2 = e0Var4;
                                                                if (r.a(c0Var2, q2.w.f21820a)) {
                                                                    int iZ = z(i15);
                                                                    r.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                    C(iZ, 2048, 4, (List) obj2);
                                                                } else {
                                                                    c0<t2.b> c0Var5 = q2.w.D;
                                                                    String str2 = "";
                                                                    if (r.a(c0Var2, c0Var5)) {
                                                                        l0Var4 = l0Var7;
                                                                        if (l0Var4.b(q2.k.f21782j)) {
                                                                            t2.b bVar = (t2.b) m.a(lVar4, c0Var5);
                                                                            if (bVar == null) {
                                                                                bVar = "";
                                                                            }
                                                                            CharSequence charSequence = (t2.b) m.a(lVar5, c0Var5);
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            CharSequence charSequenceK = K(charSequence);
                                                                            int length3 = bVar.length();
                                                                            int length4 = charSequence.length();
                                                                            Integer num9 = num8;
                                                                            int i45 = length3 > length4 ? length4 : length3;
                                                                            lVar3 = lVar4;
                                                                            int i46 = 0;
                                                                            while (true) {
                                                                                i27 = i45;
                                                                                if (i46 >= i45) {
                                                                                    num5 = num7;
                                                                                    break;
                                                                                }
                                                                                num5 = num7;
                                                                                if (bVar.charAt(i46) != charSequence.charAt(i46)) {
                                                                                    break;
                                                                                }
                                                                                i46++;
                                                                                i45 = i27;
                                                                                num7 = num5;
                                                                            }
                                                                            int i47 = 0;
                                                                            while (true) {
                                                                                if (i47 >= i27 - i46) {
                                                                                    i28 = i47;
                                                                                    break;
                                                                                }
                                                                                i28 = i47;
                                                                                if (bVar.charAt((length3 - 1) - i47) != charSequence.charAt((length4 - 1) - i28)) {
                                                                                    break;
                                                                                } else {
                                                                                    i47 = i28 + 1;
                                                                                }
                                                                            }
                                                                            int i48 = (length3 - i28) - i46;
                                                                            int i49 = (length4 - i28) - i46;
                                                                            c0<pg.f0> c0Var6 = q2.w.I;
                                                                            boolean zB = l0Var5.b(c0Var6);
                                                                            boolean zB2 = l0Var4.b(c0Var6);
                                                                            boolean zB3 = l0Var5.b(q2.w.D);
                                                                            boolean z14 = zB3 && !zB && zB2;
                                                                            boolean z15 = zB3 && zB && !zB2;
                                                                            if (z14 || z15) {
                                                                                int iZ2 = z(i15);
                                                                                Integer numValueOf = Integer.valueOf(length4);
                                                                                i22 = i15;
                                                                                i26 = i44;
                                                                                num8 = num9;
                                                                                l0Var3 = l0Var5;
                                                                                accessibilityEventP = p(iZ2, num8, num9, numValueOf, charSequenceK);
                                                                            } else {
                                                                                AccessibilityEvent accessibilityEventO2 = o(z(i15), 16);
                                                                                accessibilityEventO2.setFromIndex(i46);
                                                                                accessibilityEventO2.setRemovedCount(i48);
                                                                                accessibilityEventO2.setAddedCount(i49);
                                                                                accessibilityEventO2.setBeforeText(bVar);
                                                                                accessibilityEventO2.getText().add(charSequenceK);
                                                                                i22 = i15;
                                                                                accessibilityEventP = accessibilityEventO2;
                                                                                i26 = i44;
                                                                                num8 = num9;
                                                                                l0Var3 = l0Var5;
                                                                            }
                                                                            accessibilityEventP.setClassName("android.widget.EditText");
                                                                            B(accessibilityEventP);
                                                                            if (z14 || z15) {
                                                                                long j14 = ((j0) lVar5.f(q2.w.E)).f27839a;
                                                                                accessibilityEventP.setFromIndex((int) (j14 >> 32));
                                                                                accessibilityEventP.setToIndex((int) (j14 & BodyPartID.bodyIdMax));
                                                                                B(accessibilityEventP);
                                                                            }
                                                                        } else {
                                                                            i22 = i15;
                                                                            lVar3 = lVar4;
                                                                            num5 = num7;
                                                                            i26 = i44;
                                                                            l0Var3 = l0Var5;
                                                                            D(this, z(i22), 2048, Integer.valueOf(i32), 8);
                                                                        }
                                                                        i24 = i26;
                                                                        i23 = i39;
                                                                        lVar2 = lVar3;
                                                                        num6 = num8;
                                                                    } else {
                                                                        i22 = i15;
                                                                        num5 = num7;
                                                                        l0Var4 = l0Var7;
                                                                        i24 = i44;
                                                                        lVar2 = lVar4;
                                                                        l0Var3 = l0Var5;
                                                                        c0<j0> c0Var7 = q2.w.E;
                                                                        if (r.a(c0Var2, c0Var7)) {
                                                                            t2.b bVar2 = (t2.b) m.a(lVar5, c0Var5);
                                                                            if (bVar2 != null && (str = bVar2.f27761b) != null) {
                                                                                str2 = str;
                                                                            }
                                                                            long j15 = ((j0) lVar5.f(c0Var7)).f27839a;
                                                                            num6 = num8;
                                                                            B(p(z(i22), Integer.valueOf((int) (j15 >> 32)), Integer.valueOf((int) (j15 & BodyPartID.bodyIdMax)), Integer.valueOf(str2.length()), K(str2)));
                                                                            int i50 = i39;
                                                                            F(i50);
                                                                            i23 = i50;
                                                                            i24 = i24;
                                                                        } else {
                                                                            num6 = num8;
                                                                            int i51 = i39;
                                                                            if (r.a(c0Var2, c0Var3) ? true : r.a(c0Var2, q2.w.f21839t)) {
                                                                                v(e0Var2);
                                                                                int size = arrayList4.size();
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= size) {
                                                                                        u4Var2 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((u4) arrayList4.get(i52)).f14914a == i22) {
                                                                                            u4Var2 = (u4) arrayList4.get(i52);
                                                                                            break;
                                                                                        }
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                r.b(u4Var2);
                                                                                u4Var2.f14918e = (q2.j) m.a(lVar5, c0Var3);
                                                                                u4Var2.f14919f = (q2.j) m.a(lVar5, q2.w.f21839t);
                                                                                if (u4Var2.f14915b.contains(u4Var2)) {
                                                                                    this.f1301d.getSnapshotObserver().a(u4Var2, this.O, new a0(u4Var2, this));
                                                                                }
                                                                            } else if (r.a(c0Var2, q2.w.f21830k)) {
                                                                                r.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i25 = 8;
                                                                                    B(o(z(i51), 8));
                                                                                } else {
                                                                                    i25 = 8;
                                                                                }
                                                                                D(this, z(i51), 2048, num6, i25);
                                                                            } else {
                                                                                c0<List<q2.e>> c0Var8 = q2.k.f21795w;
                                                                                if (r.a(c0Var2, c0Var8)) {
                                                                                    List list3 = (List) lVar5.f(c0Var8);
                                                                                    List list4 = (List) m.a(lVar2, c0Var8);
                                                                                    if (list4 != null) {
                                                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                        int size2 = list3.size();
                                                                                        int i53 = 0;
                                                                                        while (i53 < size2) {
                                                                                            linkedHashSet.add(((q2.e) list3.get(i53)).f21764a);
                                                                                            i53++;
                                                                                            list3 = list3;
                                                                                        }
                                                                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                        int size3 = list4.size();
                                                                                        int i54 = 0;
                                                                                        while (i54 < size3) {
                                                                                            linkedHashSet2.add(((q2.e) list4.get(i54)).f21764a);
                                                                                            i54++;
                                                                                            i51 = i51;
                                                                                        }
                                                                                        i23 = i51;
                                                                                        if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                            z10 = false;
                                                                                        }
                                                                                    } else {
                                                                                        i23 = i51;
                                                                                        if (!list3.isEmpty()) {
                                                                                        }
                                                                                    }
                                                                                    z10 = true;
                                                                                } else {
                                                                                    i23 = i51;
                                                                                    if (obj2 instanceof q2.a) {
                                                                                        q2.a aVar = (q2.a) obj2;
                                                                                        Object objA = m.a(lVar2, c0Var2);
                                                                                        Comparator<t>[] comparatorArr = j2.e0.f14705a;
                                                                                        if (aVar != objA) {
                                                                                            if (objA instanceof q2.a) {
                                                                                                String str3 = aVar.f21752a;
                                                                                                q2.a aVar2 = (q2.a) objA;
                                                                                                T t10 = aVar2.f21753b;
                                                                                                z13 = r.a(str3, aVar2.f21752a) && ((t3 = aVar.f21753b) != 0 || t10 == 0) && (t3 == 0 || t10 != 0);
                                                                                                if (z13) {
                                                                                                }
                                                                                            }
                                                                                            if (z13) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z10 = true;
                                                                                }
                                                                            }
                                                                            i23 = i51;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            num6 = num8;
                                                            i22 = i15;
                                                            num5 = num7;
                                                            l0Var4 = l0Var7;
                                                            i24 = i44;
                                                            lVar2 = lVar4;
                                                            l0Var3 = l0Var5;
                                                            i23 = i39;
                                                        }
                                                    } else {
                                                        r.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                        String str4 = (String) obj2;
                                                        if (l0Var5.b(c0Var)) {
                                                            E(i15, i37, str4);
                                                        }
                                                    }
                                                    i22 = i15;
                                                    num5 = num7;
                                                    arrayList3 = arrayList5;
                                                    tVar2 = tVar3;
                                                    l0Var4 = l0Var7;
                                                    e0Var2 = e0Var4;
                                                    i24 = i44;
                                                    num6 = num8;
                                                    lVar2 = lVar4;
                                                    l0Var3 = l0Var5;
                                                    i23 = i39;
                                                }
                                            }
                                            int size4 = arrayList5.size();
                                            i21 = i40;
                                            int i55 = 0;
                                            while (true) {
                                                if (i55 >= size4) {
                                                    u4Var = null;
                                                    break;
                                                }
                                                int i56 = size4;
                                                if (((u4) arrayList5.get(i55)).f14914a == i15) {
                                                    u4Var = (u4) arrayList5.get(i55);
                                                    break;
                                                } else {
                                                    i55++;
                                                    size4 = i56;
                                                }
                                            }
                                            if (u4Var != null) {
                                                z12 = false;
                                            } else {
                                                u4Var = new u4(arrayList4, i15);
                                                z12 = true;
                                            }
                                            arrayList4.add(u4Var);
                                            if (z12) {
                                                c0Var = q2.w.f21823d;
                                                if (r.a(c0Var2, c0Var)) {
                                                }
                                                i22 = i15;
                                                num5 = num7;
                                                arrayList3 = arrayList5;
                                                tVar2 = tVar3;
                                                l0Var4 = l0Var7;
                                                e0Var2 = e0Var4;
                                                i24 = i44;
                                                num6 = num8;
                                                lVar2 = lVar4;
                                                l0Var3 = l0Var5;
                                                i23 = i39;
                                            }
                                        } else {
                                            l0Var3 = l0Var5;
                                            num5 = num7;
                                            arrayList3 = arrayList5;
                                            j10 = j13;
                                            i20 = i42;
                                            tVar2 = tVar3;
                                            i21 = i40;
                                            l0Var4 = l0Var7;
                                            e0Var2 = e0Var4;
                                            num6 = num8;
                                            i22 = i15;
                                            lVar2 = lVar4;
                                            i23 = i39;
                                            i24 = length2;
                                        }
                                        i37 = 8;
                                        e0Var4 = e0Var2;
                                        i39 = i23;
                                        l0Var5 = l0Var3;
                                        j13 = j10 >> 8;
                                        length2 = i24;
                                        i42 = i20 + 1;
                                        lVar4 = lVar2;
                                        num8 = num6;
                                        l0Var7 = l0Var4;
                                        i15 = i22;
                                        tVar3 = tVar2;
                                        i40 = i21;
                                        arrayList5 = arrayList3;
                                        num7 = num5;
                                    }
                                    l0Var = l0Var5;
                                    num3 = num7;
                                    arrayList2 = arrayList5;
                                    tVar = tVar3;
                                    i17 = i40;
                                    l0Var2 = l0Var7;
                                    e0Var = e0Var4;
                                    num4 = num8;
                                    i16 = i15;
                                    lVar = lVar4;
                                    i18 = i39;
                                    i19 = length2;
                                    if (i41 != i37) {
                                        break;
                                    }
                                } else {
                                    l0Var = l0Var5;
                                    num3 = num7;
                                    arrayList2 = arrayList5;
                                    tVar = tVar3;
                                    i17 = i40;
                                    l0Var2 = l0Var7;
                                    e0Var = e0Var4;
                                    num4 = num8;
                                    i16 = i15;
                                    lVar = lVar4;
                                    i18 = i39;
                                    i19 = length2;
                                }
                                int i57 = i17;
                                if (i57 == i19) {
                                    break;
                                }
                                int i58 = i16;
                                i40 = i57 + 1;
                                length2 = i19;
                                i15 = i58;
                                lVar4 = lVar;
                                num8 = num4;
                                e0Var3 = e0Var;
                                i39 = i18;
                                i35 = i13;
                                l0Var5 = l0Var;
                                arrayList5 = arrayList2;
                                num7 = num3;
                                i37 = 8;
                                l0Var7 = l0Var2;
                                tVar3 = tVar;
                            }
                        } else {
                            i16 = i15;
                            num3 = num7;
                            arrayList2 = arrayList5;
                            i13 = i35;
                            tVar = tVar3;
                            num4 = num8;
                            lVar = lVar4;
                            z10 = false;
                        }
                        if (!z10) {
                            Comparator<t>[] comparatorArr2 = j2.e0.f14705a;
                            Iterator<Map.Entry<? extends c0<?>, ? extends Object>> it = lVar.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z11 = false;
                                    break;
                                }
                                if (!tVar.i().f21799a.b(it.next().getKey())) {
                                    z11 = true;
                                    break;
                                }
                            }
                            z10 = z11;
                        }
                        if (z10) {
                            i12 = 8;
                            D(this, z(i16), 2048, num4, 8);
                        } else {
                            i12 = 8;
                        }
                    }
                    j12 >>= i12;
                    i36 = i11 + 1;
                    iVar2 = iVar;
                    num8 = num4;
                    i34 = i12;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i31 = i14;
                    i35 = i13;
                    arrayList5 = arrayList2;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i59 = i31;
                num2 = num8;
                if (i35 != i34) {
                    return;
                } else {
                    i10 = i59;
                }
            } else {
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num8;
                i10 = i31;
            }
            if (i10 == i33) {
                return;
            }
            i31 = i10 + 1;
            iVar2 = iVar;
            length = i33;
            num8 = num2;
            i29 = i32;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num7 = num;
            i30 = 0;
        }
    }

    public final void H(e0 e0Var, z zVar) {
        q2.l lVarE;
        e0 e0VarB;
        if (e0Var.m() && !this.f1301d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(e0Var)) {
            if (!e0Var.I.d(8)) {
                e0Var = j2.e0.b(e0Var, h.f1335a);
            }
            if (e0Var == null || (lVarE = e0Var.e()) == null) {
                return;
            }
            if (!lVarE.f21801c && (e0VarB = j2.e0.b(e0Var, g.f1334a)) != null) {
                e0Var = e0VarB;
            }
            int i10 = e0Var.f13810b;
            if (zVar.a(i10)) {
                D(this, z(i10), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r0v18, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r0v8, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r2v1, types: [eh.a, kotlin.jvm.internal.s] */
    public final void I(e0 e0Var) {
        if (e0Var.m() && !this.f1301d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(e0Var)) {
            int i10 = e0Var.f13810b;
            q2.j jVarB = this.f1316s.b(i10);
            q2.j jVarB2 = this.f1317t.b(i10);
            if (jVarB == null && jVarB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i10, 4096);
            if (jVarB != null) {
                accessibilityEventO.setScrollX((int) ((Number) jVarB.f21771a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) jVarB.f21772b.invoke()).floatValue());
            }
            if (jVarB2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) jVarB2.f21771a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) jVarB2.f21772b.invoke()).floatValue());
            }
            B(accessibilityEventO);
        }
    }

    public final boolean J(t tVar, int i10, int i11, boolean z10) {
        String strT;
        q2.l lVar = tVar.f21811d;
        int i12 = tVar.f21814g;
        c0<q2.a<eh.q<Integer, Integer, Boolean, Boolean>>> c0Var = q2.k.f21781i;
        if (lVar.f21799a.b(c0Var) && j2.e0.a(tVar)) {
            eh.q qVar = (eh.q) ((q2.a) tVar.f21811d.f(c0Var)).f21753b;
            if (qVar != null) {
                return ((Boolean) qVar.b(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i10 != i11 || i11 != this.f1320w) && (strT = t(tVar)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > strT.length()) {
                i10 = -1;
            }
            this.f1320w = i10;
            boolean z11 = strT.length() > 0;
            B(p(z(i12), z11 ? Integer.valueOf(this.f1320w) : null, z11 ? Integer.valueOf(this.f1320w) : null, z11 ? Integer.valueOf(strT.length()) : null, strT));
            F(i12);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
    
        if (((r1 & ((~r1) << 6)) & r24) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0152, code lost:
    
        r29 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        long j13;
        int i10;
        int[] iArr2;
        int iNumberOfTrailingZeros;
        char c11;
        long j14;
        z zVar = new z((Object) null);
        z zVar2 = this.D;
        int[] iArr3 = zVar2.f20760b;
        long[] jArr3 = zVar2.f20759a;
        int length = jArr3.length - 2;
        y<v4> yVar = this.J;
        char c12 = 7;
        long j15 = -9187201950435737472L;
        int i11 = 8;
        if (length >= 0) {
            int i12 = 0;
            j11 = 128;
            while (true) {
                long j16 = jArr3[i12];
                j12 = 255;
                if ((((~j16) << c12) & j16 & j15) != j15) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j16 & 255) < 128) {
                            c11 = c12;
                            int i15 = iArr3[(i12 << 3) + i14];
                            j14 = j15;
                            w4 w4VarB = s().b(i15);
                            t tVar = w4VarB != null ? w4VarB.f14962a : null;
                            if (tVar != null) {
                                if (!tVar.f21811d.f21799a.b(q2.w.f21823d)) {
                                    zVar.a(i15);
                                    v4 v4VarB = yVar.b(i15);
                                    E(i15, 32, v4VarB != null ? (String) m.a(v4VarB.f14932a, q2.w.f21823d) : null);
                                }
                            }
                        } else {
                            c11 = c12;
                            j14 = j15;
                        }
                        j16 >>= 8;
                        i14++;
                        c12 = c11;
                        j15 = j14;
                    }
                    c10 = c12;
                    j10 = j15;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    c10 = c12;
                    j10 = j15;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                c12 = c10;
                j15 = j10;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        int[] iArr4 = zVar.f20760b;
        long[] jArr4 = zVar.f20759a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j17 = jArr4[i16];
                if ((((~j17) << c10) & j17 & j10) != j10) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j17 & j12) < j11) {
                            int i19 = iArr4[(i16 << 3) + i18];
                            int iHashCode = Integer.hashCode(i19) * (-862048943);
                            int i20 = iHashCode ^ (iHashCode << 16);
                            int i21 = i20 & CertificateBody.profileType;
                            int i22 = zVar2.f20761c;
                            int i23 = (i20 >>> 7) & i22;
                            i10 = i11;
                            int i24 = 0;
                            while (true) {
                                long[] jArr5 = zVar2.f20759a;
                                int i25 = i23 >> 3;
                                jArr2 = jArr4;
                                int i26 = (i23 & 7) << 3;
                                long j18 = jArr5[i25] >>> i26;
                                long j19 = jArr5[i25 + 1] << (64 - i26);
                                iArr2 = iArr4;
                                long j20 = j18 | (j19 & ((-i26) >> 63));
                                j13 = j17;
                                long j21 = (i21 * 72340172838076673L) ^ j20;
                                long j22 = (j21 - 72340172838076673L) & (~j21) & j10;
                                while (true) {
                                    if (j22 == 0) {
                                        break;
                                    }
                                    iNumberOfTrailingZeros = (i23 + (Long.numberOfTrailingZeros(j22) >> 3)) & i22;
                                    long j23 = j22;
                                    if (zVar2.f20760b[iNumberOfTrailingZeros] == i19) {
                                        break;
                                    } else {
                                        j22 = j23 & (j23 - 1);
                                    }
                                }
                                i24 += 8;
                                i23 = (i23 + i24) & i22;
                                iArr4 = iArr2;
                                j17 = j13;
                                jArr4 = jArr2;
                            }
                            int i27 = iNumberOfTrailingZeros;
                            if (i27 >= 0) {
                                zVar2.f(i27);
                            }
                        } else {
                            jArr2 = jArr4;
                            j13 = j17;
                            i10 = i11;
                            iArr2 = iArr4;
                        }
                        j17 = j13 >> i10;
                        i18++;
                        iArr4 = iArr2;
                        i11 = i10;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    int i28 = i11;
                    iArr = iArr4;
                    if (i17 != i28) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                iArr4 = iArr;
                jArr4 = jArr;
                i11 = 8;
            }
        }
        yVar.c();
        p.i<w4> iVarS = s();
        int[] iArr5 = iVarS.f20644b;
        Object[] objArr = iVarS.f20645c;
        long[] jArr6 = iVarS.f20643a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i29 = 0;
            while (true) {
                long j24 = jArr6[i29];
                if ((((~j24) << c10) & j24 & j10) != j10) {
                    int i30 = 8 - ((~(i29 - length3)) >>> 31);
                    for (int i31 = 0; i31 < i30; i31++) {
                        if ((j24 & j12) < j11) {
                            int i32 = (i29 << 3) + i31;
                            int i33 = iArr5[i32];
                            t tVar2 = ((w4) objArr[i32]).f14962a;
                            q2.l lVar = tVar2.f21811d;
                            c0<String> c0Var = q2.w.f21823d;
                            if (lVar.f21799a.b(c0Var) && zVar2.a(i33)) {
                                E(i33, 16, (String) tVar2.f21811d.f(c0Var));
                            }
                            yVar.h(i33, new v4(tVar2, s()));
                        }
                        j24 >>= 8;
                    }
                    if (i30 != 8) {
                        break;
                    }
                }
                if (i29 == length3) {
                    break;
                } else {
                    i29++;
                }
            }
        }
        this.K = new v4(this.f1301d.getSemanticsOwner().a(), s());
    }

    @Override // y3.a
    public final k b(View view) {
        return this.f1310m;
    }

    public final void j(int i10, j jVar, String str, Bundle bundle) {
        t tVar;
        int i11;
        int i12;
        c cVar = this;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f34725a;
        w4 w4VarB = cVar.s().b(i10);
        if (w4VarB == null || (tVar = w4VarB.f14962a) == null) {
            return;
        }
        q2.l lVar = tVar.f21811d;
        l0<c0<?>, Object> l0Var = lVar.f21799a;
        String strT = t(tVar);
        if (r.a(str, cVar.G)) {
            int iD = cVar.E.d(i10);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (r.a(str, cVar.H)) {
            int iD2 = cVar.F.d(i10);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!l0Var.b(q2.k.f21773a) || bundle == null || !r.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            c0<String> c0Var = q2.w.f21843x;
            if (!l0Var.b(c0Var) || bundle == null || !r.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (r.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, tVar.f21814g);
                    return;
                }
                return;
            } else {
                String str2 = (String) m.a(lVar, c0Var);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i14 > 0 && i13 >= 0) {
            if (i13 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                h0 h0VarC = x4.c(lVar);
                if (h0VarC == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                while (i15 < i14) {
                    int i16 = i13 + i15;
                    RectF rectF = null;
                    if (i16 >= h0VarC.f27819a.f27809a.f27761b.length()) {
                        arrayList.add(null);
                        i11 = i13;
                        i12 = i15;
                    } else {
                        p1.e eVarB = h0VarC.b(i16);
                        g1 g1VarC = tVar.c();
                        long jY = 0;
                        if (g1VarC != null) {
                            if (!g1VarC.l1().f1157p) {
                                g1VarC = null;
                            }
                            if (g1VarC != null) {
                                jY = g1VarC.Y(0L);
                            }
                        }
                        p1.e eVarJ = eVarB.j(jY);
                        p1.e eVarE = tVar.e();
                        p1.e eVarF = eVarJ.h(eVarE) ? eVarJ.f(eVarE) : null;
                        if (eVarF != null) {
                            long jFloatToRawIntBits = (Float.floatToRawIntBits(eVarF.f21132b) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(eVarF.f21131a) << 32);
                            AndroidComposeView androidComposeView = cVar.f1301d;
                            long jA = androidComposeView.A(jFloatToRawIntBits);
                            float f10 = eVarF.f21133c;
                            float f11 = eVarF.f21134d;
                            i12 = i15;
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
                            i11 = i13;
                            long jA2 = androidComposeView.A((Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (jFloatToRawIntBits2 << 32));
                            rectF = new RectF(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (jA2 >> 32)), Float.intBitsToFloat((int) (jA2 & BodyPartID.bodyIdMax)));
                        } else {
                            i11 = i13;
                            i12 = i15;
                        }
                        arrayList.add(rectF);
                    }
                    i15 = i12 + 1;
                    cVar = this;
                    i13 = i11;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect k(w4 w4Var) {
        Rect rect = w4Var.f14963b;
        float f10 = rect.left;
        float f11 = rect.top;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
        AndroidComposeView androidComposeView = this.f1301d;
        long jA = androidComposeView.A(jFloatToRawIntBits);
        float f12 = rect.right;
        float f13 = rect.bottom;
        long jA2 = androidComposeView.A((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & BodyPartID.bodyIdMax));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (jA >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jA & BodyPartID.bodyIdMax))), (int) Math.ceil(Float.intBitsToFloat((int) (jA2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jA2 & BodyPartID.bodyIdMax))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (ph.t0.b(r5, r2) == r3) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:25:0x0060, B:29:0x0076, B:31:0x007e, B:34:0x0089, B:36:0x008f, B:37:0x009e, B:39:0x00a6, B:40:0x00c2, B:42:0x00d1, B:45:0x00df, B:20:0x0048), top: B:56:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v7, types: [rh.j] */
    /* JADX WARN: Type inference failed for: r4v8, types: [rh.j] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fb -> B:48:0x00fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(vg.c cVar) throws Throwable {
        j2.z zVar;
        c cVar2;
        z zVar2;
        c.a aVar;
        z zVar3;
        c.a aVar2;
        Object objA;
        if (cVar instanceof j2.z) {
            zVar = (j2.z) cVar;
            int i10 = zVar.f15005f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zVar.f15005f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zVar = new j2.z(this, cVar);
            }
        }
        Object obj = zVar.f15003d;
        ug.a aVar3 = ug.a.f29706a;
        int i11 = zVar.f15005f;
        int i12 = 1;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                try {
                    zVar2 = new z((Object) null);
                    rh.c cVar3 = this.f1323z;
                    cVar3.getClass();
                    aVar = new c.a();
                    cVar2 = this;
                    zVar.f15000a = cVar2;
                    zVar.f15001b = zVar2;
                    zVar.f15002c = aVar;
                    zVar.f15005f = i12;
                    objA = aVar.a(zVar);
                    if (objA != aVar3) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar2 = this;
                    cVar2.f1322y.clear();
                    throw th;
                }
            } else if (i11 == 1) {
                ?? r42 = zVar.f15002c;
                zVar3 = zVar.f15001b;
                cVar2 = zVar.f15000a;
                pg.q.b(obj);
                aVar2 = r42;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r43 = zVar.f15002c;
                zVar3 = zVar.f15001b;
                cVar2 = zVar.f15000a;
                pg.q.b(obj);
                char c10 = 2;
                int i13 = 1;
                c.a aVar4 = r43;
                zVar2 = zVar3;
                i12 = i13;
                aVar = aVar4;
                zVar.f15000a = cVar2;
                zVar.f15001b = zVar2;
                zVar.f15002c = aVar;
                zVar.f15005f = i12;
                objA = aVar.a(zVar);
                if (objA != aVar3) {
                    return aVar3;
                }
                c.a aVar5 = aVar;
                zVar3 = zVar2;
                obj = objA;
                aVar2 = aVar5;
                if (((Boolean) obj).booleanValue()) {
                    cVar2.f1322y.clear();
                    return pg.f0.f21461a;
                }
                aVar2.next();
                boolean zU = cVar2.u();
                p.b<e0> bVar = cVar2.f1322y;
                if (zU) {
                    int i14 = bVar.f20570c;
                    for (int i15 = 0; i15 < i14; i15++) {
                        e0 e0Var = (e0) bVar.f20569b[i15];
                        cVar2.H(e0Var, zVar3);
                        cVar2.I(e0Var);
                    }
                    zVar3.f20762d = 0;
                    long[] jArr = zVar3.f20759a;
                    if (jArr != w0.f20748a) {
                        qg.m.n(jArr, -9187201950435737472L);
                        long[] jArr2 = zVar3.f20759a;
                        int i16 = zVar3.f20761c;
                        int i17 = i16 >> 3;
                        long j10 = 255 << ((i16 & 7) << 3);
                        jArr2[i17] = ((~j10) & jArr2[i17]) | j10;
                    }
                    zVar3.f20763e = w0.a(zVar3.f20761c) - zVar3.f20762d;
                    if (cVar2.L) {
                        i13 = 1;
                    } else {
                        i13 = 1;
                        cVar2.L = true;
                        cVar2.f1309l.post(cVar2.M);
                    }
                } else {
                    i13 = i12;
                }
                bVar.clear();
                cVar2.f1316s.c();
                cVar2.f1317t.c();
                long j11 = cVar2.f1305h;
                zVar.f15000a = cVar2;
                zVar.f15001b = zVar3;
                zVar.f15002c = aVar2;
                c10 = 2;
                zVar.f15005f = 2;
                aVar4 = aVar2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Type inference failed for: r15v7, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r4v8, types: [eh.a, kotlin.jvm.internal.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i10, long j10, boolean z10) {
        c0<q2.j> c0Var;
        q2.j jVar;
        if (!r.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        p.i<w4> iVarS = s();
        if (p1.c.b(j10, 9205357640488583168L) || (((9223372034707292159L & j10) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z10) {
            c0Var = q2.w.f21839t;
        } else {
            if (z10) {
                throw new pg.l();
            }
            c0Var = q2.w.f21838s;
        }
        Object[] objArr = iVarS.f20645c;
        long[] jArr = iVarS.f20643a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        w4 w4Var = (w4) objArr[(i11 << 3) + i13];
                        if (x1.d(w4Var.f14963b).a(j10) && (jVar = (q2.j) m.a(w4Var.f14962a.f21811d, c0Var)) != null) {
                            ?? r15 = jVar.f21771a;
                            if (i10 < 0) {
                                if (((Number) r15.invoke()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                    z11 = true;
                                }
                            } else if (((Number) r15.invoke()).floatValue() < ((Number) jVar.f21772b.invoke()).floatValue()) {
                            }
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return z11;
                }
            }
            if (i11 == length) {
                return z11;
            }
            i11++;
        }
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (u()) {
                A(this.f1301d.getSemanticsOwner().a(), this.K);
            }
            pg.f0 f0Var = pg.f0.f21461a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                G(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i10, int i11) {
        w4 w4VarB;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f1301d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i10);
        if (u() && (w4VarB = s().b(i10)) != null) {
            accessibilityEventObtain.setPassword(w4VarB.f14962a.f21811d.f21799a.b(q2.w.I));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent p(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i10, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(t tVar) {
        q2.l lVar = tVar.f21811d;
        q2.l lVar2 = tVar.f21811d;
        c0<List<String>> c0Var = q2.w.f21820a;
        if (!lVar.f21799a.b(q2.w.f21820a)) {
            c0<j0> c0Var2 = q2.w.E;
            if (lVar2.f21799a.b(c0Var2)) {
                return (int) (((j0) lVar2.f(c0Var2)).f27839a & BodyPartID.bodyIdMax);
            }
        }
        return this.f1320w;
    }

    public final int r(t tVar) {
        q2.l lVar = tVar.f21811d;
        q2.l lVar2 = tVar.f21811d;
        c0<List<String>> c0Var = q2.w.f21820a;
        if (!lVar.f21799a.b(q2.w.f21820a)) {
            c0<j0> c0Var2 = q2.w.E;
            if (lVar2.f21799a.b(c0Var2)) {
                return (int) (((j0) lVar2.f(c0Var2)).f27839a >> 32);
            }
        }
        return this.f1320w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p.i<w4> s() {
        if (this.A) {
            this.A = false;
            AndroidComposeView androidComposeView = this.f1301d;
            this.C = x4.a(androidComposeView.getSemanticsOwner());
            if (u()) {
                y yVar = this.C;
                Resources resources = androidComposeView.getContext().getResources();
                Comparator<t>[] comparatorArr = j2.e0.f14705a;
                w wVar = this.E;
                wVar.a();
                w wVar2 = this.F;
                wVar2.a();
                w4 w4Var = (w4) yVar.b(-1);
                t tVar = w4Var != null ? w4Var.f14962a : null;
                r.b(tVar);
                ArrayList arrayListI = j2.e0.i(j2.e0.g(tVar), g0.c(tVar), yVar, resources);
                int i10 = qg.p.i(arrayListI);
                int i11 = 1;
                if (1 <= i10) {
                    while (true) {
                        int i12 = ((t) arrayListI.get(i11 - 1)).f21814g;
                        int i13 = ((t) arrayListI.get(i11)).f21814g;
                        wVar.f(i12, i13);
                        wVar2.f(i13, i12);
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean u() {
        return this.f1304g.isEnabled() && !this.f1308k.isEmpty();
    }

    public final void v(e0 e0Var) {
        if (this.f1322y.add(e0Var)) {
            this.f1323z.g(pg.f0.f21461a);
        }
    }

    public final int z(int i10) {
        if (i10 == this.f1301d.getSemanticsOwner().a().f21814g) {
            return -1;
        }
        return i10;
    }
}
