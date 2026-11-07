package o1;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import i2.a1;
import i2.d1;
import java.util.ArrayList;
import org.bouncycastle.asn1.eac.CertificateBody;
import p.w0;

/* loaded from: classes.dex */
public final class u implements q {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView.i f18889a;

    /* renamed from: b, reason: collision with root package name */
    public final AndroidComposeView.j f18890b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidComposeView.k f18891c;

    /* renamed from: d, reason: collision with root package name */
    public final AndroidComposeView.l f18892d;

    /* renamed from: e, reason: collision with root package name */
    public final AndroidComposeView.m f18893e;

    /* renamed from: f, reason: collision with root package name */
    public final FocusTargetNode f18894f = new FocusTargetNode(2, null, 6);

    /* renamed from: g, reason: collision with root package name */
    public final l f18895g;

    /* renamed from: h, reason: collision with root package name */
    public final f1.m f18896h;

    /* renamed from: i, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f18897i;

    /* renamed from: j, reason: collision with root package name */
    public p.d0 f18898j;

    /* renamed from: k, reason: collision with root package name */
    public final p.h0<m> f18899k;

    /* renamed from: l, reason: collision with root package name */
    public FocusTargetNode f18900l;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<FocusTargetNode, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f18901a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f18902b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.s f18903c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FocusTargetNode focusTargetNode, u uVar, eh.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f18901a = focusTargetNode;
            this.f18902b = uVar;
            this.f18903c = (kotlin.jvm.internal.s) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [eh.l, kotlin.jvm.internal.s] */
        @Override // eh.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            FocusTargetNode focusTargetNode2 = focusTargetNode;
            if (kotlin.jvm.internal.r.a(focusTargetNode2, this.f18901a)) {
                zBooleanValue = false;
            } else {
                if (kotlin.jvm.internal.r.a(focusTargetNode2, this.f18902b.f18894f)) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = ((Boolean) this.f18903c.invoke(focusTargetNode2)).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<FocusTargetNode, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<Boolean> f18904a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f18905b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.g0<Boolean> g0Var, int i10) {
            super(1);
            this.f18904a = g0Var;
            this.f18905b = i10;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Boolean] */
        @Override // eh.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zH = focusTargetNode.H(this.f18905b);
            this.f18904a.f16327a = Boolean.valueOf(zH);
            return Boolean.valueOf(zH);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public u(AndroidComposeView.h hVar, AndroidComposeView.i iVar, AndroidComposeView.j jVar, AndroidComposeView.k kVar, AndroidComposeView.l lVar, AndroidComposeView.m mVar) {
        this.f18889a = iVar;
        this.f18890b = jVar;
        this.f18891c = kVar;
        this.f18892d = lVar;
        this.f18893e = mVar;
        this.f18895g = new l(hVar, new r(0, this, u.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0), new s(this, u.class, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;", 0), new t(this, u.class, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;", 0));
        f1.m mVar2 = new f1.m();
        w0.b();
        this.f18896h = mVar2;
        this.f18897i = new a1<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // i2.a1
            public final d.c a() {
                return this.f1177b.f18894f;
            }

            @Override // i2.a1
            public final /* bridge */ /* synthetic */ void b(d.c cVar) {
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f1177b.f18894f.hashCode();
            }
        };
        this.f18899k = new p.h0<>(1);
    }

    @Override // o1.q
    public final void a(FocusTargetNode focusTargetNode) {
        l lVar = this.f18895g;
        if (!lVar.f18872d.d(focusTargetNode) || lVar.f18874f) {
            return;
        }
        lVar.f18869a.invoke(new k(0, lVar, l.class, "invalidateNodes", "invalidateNodes()V", 0));
        lVar.f18874f = true;
    }

    @Override // o1.q
    public final void b() {
        l lVar = this.f18895g;
        if (lVar.f18874f) {
            return;
        }
        lVar.f18869a.invoke(new k(0, lVar, l.class, "invalidateNodes", "invalidateNodes()V", 0));
        lVar.f18874f = true;
    }

    @Override // o1.q
    public final FocusOwnerImpl$modifier$1 c() {
        return this.f18897i;
    }

    @Override // o1.q
    public final void d(h hVar) {
        l lVar = this.f18895g;
        if (!lVar.f18873e.d(hVar) || lVar.f18874f) {
            return;
        }
        lVar.f18869a.invoke(new k(0, lVar, l.class, "invalidateNodes", "invalidateNodes()V", 0));
        lVar.f18874f = true;
    }

    @Override // o1.q
    public final boolean e() {
        return false;
    }

    @Override // o1.n
    public final void f() {
        l(8, true, true);
    }

    @Override // o1.q
    public final i0 g() {
        return this.f18894f.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r15v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // o1.q
    public final boolean h(e2.c cVar, j2.r rVar) {
        e2.a aVar;
        int size;
        d1 d1Var;
        i2.m mVarB;
        d1 d1Var2;
        if (this.f18895g.f18874f) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = m0.a(this.f18894f);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.f1144a.f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            d.c cVar2 = focusTargetNodeA.f1144a;
            i2.e0 e0VarF = i2.k.f(focusTargetNodeA);
            loop0: while (true) {
                if (e0VarF == null) {
                    mVarB = 0;
                    break;
                }
                if ((e0VarF.I.f13793e.f1147d & 16384) != 0) {
                    while (cVar2 != null) {
                        if ((cVar2.f1146c & 16384) != 0) {
                            ?? bVar = 0;
                            mVarB = cVar2;
                            while (mVarB != 0) {
                                if (mVarB instanceof e2.a) {
                                    break loop0;
                                }
                                if ((mVarB.f1146c & 16384) != 0 && (mVarB instanceof i2.m)) {
                                    d.c cVar3 = mVarB.f13947r;
                                    int i10 = 0;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                    while (cVar3 != null) {
                                        if ((cVar3.f1146c & 16384) != 0) {
                                            i10++;
                                            bVar = bVar;
                                            if (i10 == 1) {
                                                mVarB = cVar3;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new z0.b(new d.c[16]);
                                                }
                                                if (mVarB != 0) {
                                                    bVar.b(mVarB);
                                                    mVarB = 0;
                                                }
                                                bVar.b(cVar3);
                                            }
                                        }
                                        cVar3 = cVar3.f1149f;
                                        mVarB = mVarB;
                                        bVar = bVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                mVarB = i2.k.b(bVar);
                            }
                        }
                        cVar2 = cVar2.f1148e;
                    }
                }
                e0VarF = e0VarF.G();
                cVar2 = (e0VarF == null || (d1Var2 = e0VarF.I) == null) ? null : d1Var2.f13792d;
            }
            aVar = (e2.a) mVarB;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            if (!aVar.B().f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            d.c cVar4 = aVar.B().f1148e;
            i2.e0 e0VarF2 = i2.k.f(aVar);
            ArrayList arrayList = null;
            while (e0VarF2 != null) {
                if ((e0VarF2.I.f13793e.f1147d & 16384) != 0) {
                    while (cVar4 != null) {
                        if ((cVar4.f1146c & 16384) != 0) {
                            d.c cVarB = cVar4;
                            z0.b bVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof e2.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                } else if ((cVarB.f1146c & 16384) != 0 && (cVarB instanceof i2.m)) {
                                    int i11 = 0;
                                    for (d.c cVar5 = ((i2.m) cVarB).f13947r; cVar5 != null; cVar5 = cVar5.f1149f) {
                                        if ((cVar5.f1146c & 16384) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarB = cVar5;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new z0.b(new d.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    bVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                bVar2.b(cVar5);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarB = i2.k.b(bVar2);
                            }
                        }
                        cVar4 = cVar4.f1148e;
                    }
                }
                e0VarF2 = e0VarF2.G();
                cVar4 = (e0VarF2 == null || (d1Var = e0VarF2.I) == null) ? null : d1Var.f13792d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((e2.a) arrayList.get(size)).M0(cVar)) {
                        break;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            i2.m mVarB2 = aVar.B();
            ?? bVar3 = 0;
            while (true) {
                if (mVarB2 != 0) {
                    if (mVarB2 instanceof e2.a) {
                        if (((e2.a) mVarB2).M0(cVar)) {
                            break;
                        }
                    } else if ((mVarB2.f1146c & 16384) != 0 && (mVarB2 instanceof i2.m)) {
                        d.c cVar6 = mVarB2.f13947r;
                        int i13 = 0;
                        mVarB2 = mVarB2;
                        bVar3 = bVar3;
                        while (cVar6 != null) {
                            if ((cVar6.f1146c & 16384) != 0) {
                                i13++;
                                bVar3 = bVar3;
                                if (i13 == 1) {
                                    mVarB2 = cVar6;
                                } else {
                                    if (bVar3 == 0) {
                                        bVar3 = new z0.b(new d.c[16]);
                                    }
                                    if (mVarB2 != 0) {
                                        bVar3.b(mVarB2);
                                        mVarB2 = 0;
                                    }
                                    bVar3.b(cVar6);
                                }
                            }
                            cVar6 = cVar6.f1149f;
                            mVarB2 = mVarB2;
                            bVar3 = bVar3;
                        }
                        if (i13 == 1) {
                        }
                    }
                    mVarB2 = i2.k.b(bVar3);
                } else if (!((Boolean) rVar.invoke()).booleanValue()) {
                    i2.m mVarB3 = aVar.B();
                    ?? bVar4 = 0;
                    while (true) {
                        if (mVarB3 != 0) {
                            if (mVarB3 instanceof e2.a) {
                                if (((e2.a) mVarB3).Z0(cVar)) {
                                    break;
                                }
                            } else if ((mVarB3.f1146c & 16384) != 0 && (mVarB3 instanceof i2.m)) {
                                d.c cVar7 = mVarB3.f13947r;
                                int i14 = 0;
                                bVar4 = bVar4;
                                mVarB3 = mVarB3;
                                while (cVar7 != null) {
                                    if ((cVar7.f1146c & 16384) != 0) {
                                        i14++;
                                        bVar4 = bVar4;
                                        if (i14 == 1) {
                                            mVarB3 = cVar7;
                                        } else {
                                            if (bVar4 == 0) {
                                                bVar4 = new z0.b(new d.c[16]);
                                            }
                                            if (mVarB3 != 0) {
                                                bVar4.b(mVarB3);
                                                mVarB3 = 0;
                                            }
                                            bVar4.b(cVar7);
                                        }
                                    }
                                    cVar7 = cVar7.f1149f;
                                    bVar4 = bVar4;
                                    mVarB3 = mVarB3;
                                }
                                if (i14 == 1) {
                                }
                            }
                            mVarB3 = i2.k.b(bVar4);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                if (!((e2.a) arrayList.get(i15)).Z0(cVar)) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:183:0x0213, B:184:0x0221, B:186:0x0225, B:188:0x0229, B:215:0x027f, B:192:0x0235, B:194:0x023e, B:196:0x0242, B:198:0x0249, B:200:0x024f, B:202:0x0253, B:203:0x0256, B:205:0x025c, B:206:0x0263, B:208:0x026b, B:209:0x0270, B:211:0x0276, B:212:0x0279, B:216:0x028a, B:220:0x029a, B:221:0x02a8, B:223:0x02ac, B:225:0x02b0, B:252:0x0306, B:229:0x02bc, B:231:0x02c5, B:233:0x02c9, B:235:0x02d0, B:237:0x02d6, B:239:0x02da, B:240:0x02dd, B:242:0x02e3, B:243:0x02ea, B:245:0x02f2, B:246:0x02f7, B:248:0x02fd, B:249:0x0300, B:254:0x0313, B:256:0x031a, B:261:0x032d, B:262:0x032f, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:267:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, androidx.compose.ui.d$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r10v17, types: [T, z0.b] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r15v11, types: [T, androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r15v14, types: [T, androidx.compose.ui.d$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [T, androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v34, types: [T, z0.b] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    @Override // o1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(KeyEvent keyEvent, eh.a<Boolean> aVar) {
        Object obj;
        d.c cVarB;
        d1 d1Var;
        Object obj2;
        d1 d1Var2;
        d1 d1Var3;
        FocusTargetNode focusTargetNode = this.f18894f;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f18895g.f18874f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!v(keyEvent)) {
                return false;
            }
            FocusTargetNode focusTargetNodeA = m0.a(focusTargetNode);
            if (focusTargetNodeA != null) {
                if (!focusTargetNodeA.f1144a.f1157p) {
                    f2.a.b("visitLocalDescendants called on an unattached node");
                }
                d.c cVar = focusTargetNodeA.f1144a;
                if ((cVar.f1147d & 9216) != 0) {
                    cVarB = null;
                    for (d.c cVar2 = cVar.f1149f; cVar2 != null; cVar2 = cVar2.f1149f) {
                        int i10 = cVar2.f1146c;
                        if ((i10 & 9216) != 0) {
                            if ((i10 & 1024) != 0) {
                                break;
                            }
                            cVarB = cVar2;
                        }
                    }
                } else {
                    cVarB = null;
                }
                if (cVarB == null) {
                }
            } else if (focusTargetNodeA == null) {
                if (!focusTargetNode.f1144a.f1157p) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                d.c cVar3 = focusTargetNode.f1144a.f1148e;
                i2.e0 e0VarF = i2.k.f(focusTargetNode);
                loop15: while (true) {
                    if (e0VarF == null) {
                        obj = null;
                        break;
                    }
                    if ((e0VarF.I.f13793e.f1147d & 8192) != 0) {
                        while (cVar3 != null) {
                            if ((cVar3.f1146c & 8192) != 0) {
                                d.c cVarB2 = cVar3;
                                z0.b bVar = null;
                                while (cVarB2 != null) {
                                    if (cVarB2 instanceof a2.e) {
                                        obj = cVarB2;
                                        break loop15;
                                    }
                                    if ((cVarB2.f1146c & 8192) != 0 && (cVarB2 instanceof i2.m)) {
                                        d.c cVar4 = ((i2.m) cVarB2).f13947r;
                                        int i11 = 0;
                                        cVarB2 = cVarB2;
                                        bVar = bVar;
                                        while (cVar4 != null) {
                                            if ((cVar4.f1146c & 8192) != 0) {
                                                i11++;
                                                bVar = bVar;
                                                if (i11 == 1) {
                                                    cVarB2 = cVar4;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new z0.b(new d.c[16]);
                                                    }
                                                    if (cVarB2 != null) {
                                                        bVar.b(cVarB2);
                                                        cVarB2 = null;
                                                    }
                                                    bVar.b(cVar4);
                                                }
                                            }
                                            cVar4 = cVar4.f1149f;
                                            cVarB2 = cVarB2;
                                            bVar = bVar;
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    cVarB2 = i2.k.b(bVar);
                                }
                            }
                            cVar3 = cVar3.f1148e;
                        }
                    }
                    e0VarF = e0VarF.G();
                    cVar3 = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
                }
                a2.e eVar = (a2.e) obj;
                cVarB = eVar != null ? eVar.B() : null;
            } else {
                if (!focusTargetNodeA.f1144a.f1157p) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                d.c cVar5 = focusTargetNodeA.f1144a;
                i2.e0 e0VarF2 = i2.k.f(focusTargetNodeA);
                loop11: while (true) {
                    if (e0VarF2 == null) {
                        obj2 = null;
                        break;
                    }
                    if ((e0VarF2.I.f13793e.f1147d & 8192) != 0) {
                        while (cVar5 != null) {
                            if ((cVar5.f1146c & 8192) != 0) {
                                z0.b bVar2 = null;
                                d.c cVarB3 = cVar5;
                                while (cVarB3 != null) {
                                    if (cVarB3 instanceof a2.e) {
                                        obj2 = cVarB3;
                                        break loop11;
                                    }
                                    if ((cVarB3.f1146c & 8192) != 0 && (cVarB3 instanceof i2.m)) {
                                        d.c cVar6 = ((i2.m) cVarB3).f13947r;
                                        int i12 = 0;
                                        cVarB3 = cVarB3;
                                        bVar2 = bVar2;
                                        while (cVar6 != null) {
                                            if ((cVar6.f1146c & 8192) != 0) {
                                                i12++;
                                                bVar2 = bVar2;
                                                if (i12 == 1) {
                                                    cVarB3 = cVar6;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new z0.b(new d.c[16]);
                                                    }
                                                    if (cVarB3 != null) {
                                                        bVar2.b(cVarB3);
                                                        cVarB3 = null;
                                                    }
                                                    bVar2.b(cVar6);
                                                }
                                            }
                                            cVar6 = cVar6.f1149f;
                                            cVarB3 = cVarB3;
                                            bVar2 = bVar2;
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    cVarB3 = i2.k.b(bVar2);
                                }
                            }
                            cVar5 = cVar5.f1148e;
                        }
                    }
                    e0VarF2 = e0VarF2.G();
                    cVar5 = (e0VarF2 == null || (d1Var2 = e0VarF2.I) == null) ? null : d1Var2.f13792d;
                }
                a2.e eVar2 = (a2.e) obj2;
                if (eVar2 != null) {
                    cVarB = eVar2.B();
                }
            }
            if (cVarB != null) {
                if (!cVarB.f1144a.f1157p) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                d.c cVar7 = cVarB.f1144a.f1148e;
                i2.e0 e0VarF3 = i2.k.f(cVarB);
                ArrayList arrayList = null;
                while (e0VarF3 != null) {
                    if ((e0VarF3.I.f13793e.f1147d & 8192) != 0) {
                        while (cVar7 != null) {
                            if ((cVar7.f1146c & 8192) != 0) {
                                d.c cVarB4 = cVar7;
                                z0.b bVar3 = null;
                                while (cVarB4 != null) {
                                    if (cVarB4 instanceof a2.e) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cVarB4);
                                    } else if ((cVarB4.f1146c & 8192) != 0 && (cVarB4 instanceof i2.m)) {
                                        int i13 = 0;
                                        for (d.c cVar8 = ((i2.m) cVarB4).f13947r; cVar8 != null; cVar8 = cVar8.f1149f) {
                                            if ((cVar8.f1146c & 8192) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    cVarB4 = cVar8;
                                                } else {
                                                    if (bVar3 == null) {
                                                        bVar3 = new z0.b(new d.c[16]);
                                                    }
                                                    if (cVarB4 != null) {
                                                        bVar3.b(cVarB4);
                                                        cVarB4 = null;
                                                    }
                                                    bVar3.b(cVar8);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    cVarB4 = i2.k.b(bVar3);
                                }
                            }
                            cVar7 = cVar7.f1148e;
                        }
                    }
                    e0VarF3 = e0VarF3.G();
                    cVar7 = (e0VarF3 == null || (d1Var3 = e0VarF3.I) == null) ? null : d1Var3.f13792d;
                }
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i14 = size - 1;
                            if (((a2.e) arrayList.get(size)).I(keyEvent)) {
                                return true;
                            }
                            if (i14 < 0) {
                                break;
                            }
                            size = i14;
                        }
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                }
                ?? r02 = cVarB.f1144a;
                kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
                g0Var2.f16327a = r02;
                while (true) {
                    T t3 = g0Var2.f16327a;
                    if (t3 != 0) {
                        if (t3 instanceof a2.e) {
                            if (((a2.e) t3).I(keyEvent)) {
                                return true;
                            }
                        } else if ((((d.c) t3).f1146c & 8192) != 0 && (t3 instanceof i2.m)) {
                            int i15 = 0;
                            for (?? r03 = ((i2.m) t3).f13947r; r03 != 0; r03 = r03.f1149f) {
                                if ((r03.f1146c & 8192) != 0) {
                                    i15++;
                                    if (i15 == 1) {
                                        g0Var2.f16327a = r03;
                                    } else {
                                        z0.b bVar4 = (z0.b) g0Var.f16327a;
                                        ?? bVar5 = bVar4;
                                        if (bVar4 == null) {
                                            bVar5 = new z0.b(new d.c[16]);
                                        }
                                        g0Var.f16327a = bVar5;
                                        d.c cVar9 = (d.c) g0Var2.f16327a;
                                        if (cVar9 != null) {
                                            bVar5.b(cVar9);
                                            g0Var2.f16327a = null;
                                        }
                                        z0.b bVar6 = (z0.b) g0Var.f16327a;
                                        if (bVar6 != 0) {
                                            bVar6.b(r03);
                                        }
                                    }
                                }
                            }
                            if (i15 == 1) {
                            }
                        }
                        g0Var2.f16327a = i2.k.b((z0.b) g0Var.f16327a);
                    } else {
                        if (aVar.invoke().booleanValue()) {
                            return true;
                        }
                        ?? r15 = cVarB.f1144a;
                        kotlin.jvm.internal.g0 g0Var3 = new kotlin.jvm.internal.g0();
                        kotlin.jvm.internal.g0 g0Var4 = new kotlin.jvm.internal.g0();
                        g0Var4.f16327a = r15;
                        while (true) {
                            T t10 = g0Var4.f16327a;
                            if (t10 != 0) {
                                if (t10 instanceof a2.e) {
                                    if (((a2.e) t10).j0(keyEvent)) {
                                        return true;
                                    }
                                } else if ((((d.c) t10).f1146c & 8192) != 0 && (t10 instanceof i2.m)) {
                                    int i16 = 0;
                                    for (?? r152 = ((i2.m) t10).f13947r; r152 != 0; r152 = r152.f1149f) {
                                        if ((r152.f1146c & 8192) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                g0Var4.f16327a = r152;
                                            } else {
                                                z0.b bVar7 = (z0.b) g0Var3.f16327a;
                                                ?? bVar8 = bVar7;
                                                if (bVar7 == null) {
                                                    bVar8 = new z0.b(new d.c[16]);
                                                }
                                                g0Var3.f16327a = bVar8;
                                                d.c cVar10 = (d.c) g0Var4.f16327a;
                                                if (cVar10 != null) {
                                                    bVar8.b(cVar10);
                                                    g0Var4.f16327a = null;
                                                }
                                                z0.b bVar9 = (z0.b) g0Var3.f16327a;
                                                if (bVar9 != 0) {
                                                    bVar9.b(r152);
                                                }
                                            }
                                        }
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                g0Var4.f16327a = i2.k.b((z0.b) g0Var3.f16327a);
                            } else {
                                if (arrayList != null) {
                                    int size2 = arrayList.size();
                                    for (int i17 = 0; i17 < size2; i17++) {
                                        if (((a2.e) arrayList.get(i17)).j0(keyEvent)) {
                                            return true;
                                        }
                                    }
                                    pg.f0 f0Var2 = pg.f0.f21461a;
                                }
                                pg.f0 f0Var3 = pg.f0.f21461a;
                            }
                        }
                    }
                }
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    @Override // o1.q
    public final f1.m j() {
        return this.f18896h;
    }

    @Override // o1.q
    public final p1.e k() {
        FocusTargetNode focusTargetNodeA = m0.a(this.f18894f);
        if (focusTargetNodeA != null) {
            return m0.b(focusTargetNodeA);
        }
        return null;
    }

    @Override // o1.q
    public final boolean l(int i10, boolean z10, boolean z11) {
        int iOrdinal;
        boolean z12 = true;
        if (z10 || (iOrdinal = f3.a.d(this.f18894f, i10).ordinal()) == 0) {
            u(z10);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new pg.l();
            }
            z12 = false;
        }
        if (z12 && z11) {
            this.f18891c.invoke();
        }
        return z12;
    }

    @Override // o1.q
    public final void m(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.f18900l;
        this.f18900l = focusTargetNode;
        p.h0<m> h0Var = this.f18899k;
        Object[] objArr = h0Var.f20706a;
        int i10 = h0Var.f20707b;
        for (int i11 = 0; i11 < i10; i11++) {
            ((m) objArr[i11]).a(focusTargetNode2, focusTargetNode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    @Override // o1.n
    public final boolean n(int i10) {
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f16327a = Boolean.FALSE;
        this.f18896h.getClass();
        FocusTargetNode focusTargetNode = this.f18900l;
        Boolean boolP = p(i10, (p1.e) this.f18892d.invoke(), new b(g0Var, i10));
        Boolean bool = Boolean.TRUE;
        if (!kotlin.jvm.internal.r.a(boolP, bool) || focusTargetNode == this.f18900l) {
            if (boolP != null && g0Var.f16327a != 0) {
                if (!boolP.equals(bool) || !kotlin.jvm.internal.r.a(g0Var.f16327a, bool)) {
                    if (i10 != 1 && i10 != 2) {
                        if (((Boolean) this.f18890b.invoke(new e(i10))).booleanValue()) {
                        }
                    } else if (l(i10, false, false)) {
                        Boolean boolP2 = p(i10, null, new v(i10));
                        if (boolP2 != null ? boolP2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v11, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v13, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    @Override // o1.q
    public final boolean o(KeyEvent keyEvent) {
        a2.h hVar;
        int size;
        d1 d1Var;
        i2.m mVarB;
        d1 d1Var2;
        if (this.f18895g.f18874f) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = m0.a(this.f18894f);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.f1144a.f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNodeA.f1144a;
            i2.e0 e0VarF = i2.k.f(focusTargetNodeA);
            loop0: while (true) {
                if (e0VarF == null) {
                    mVarB = 0;
                    break;
                }
                if ((e0VarF.I.f13793e.f1147d & 131072) != 0) {
                    while (cVar != null) {
                        if ((cVar.f1146c & 131072) != 0) {
                            ?? bVar = 0;
                            mVarB = cVar;
                            while (mVarB != 0) {
                                if (mVarB instanceof a2.h) {
                                    break loop0;
                                }
                                if ((mVarB.f1146c & 131072) != 0 && (mVarB instanceof i2.m)) {
                                    d.c cVar2 = mVarB.f13947r;
                                    int i10 = 0;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.f1146c & 131072) != 0) {
                                            i10++;
                                            bVar = bVar;
                                            if (i10 == 1) {
                                                mVarB = cVar2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new z0.b(new d.c[16]);
                                                }
                                                if (mVarB != 0) {
                                                    bVar.b(mVarB);
                                                    mVarB = 0;
                                                }
                                                bVar.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.f1149f;
                                        mVarB = mVarB;
                                        bVar = bVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                mVarB = i2.k.b(bVar);
                            }
                        }
                        cVar = cVar.f1148e;
                    }
                }
                e0VarF = e0VarF.G();
                cVar = (e0VarF == null || (d1Var2 = e0VarF.I) == null) ? null : d1Var2.f13792d;
            }
            hVar = (a2.h) mVarB;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            if (!hVar.B().f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            d.c cVar3 = hVar.B().f1148e;
            i2.e0 e0VarF2 = i2.k.f(hVar);
            ArrayList arrayList = null;
            while (e0VarF2 != null) {
                if ((e0VarF2.I.f13793e.f1147d & 131072) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.f1146c & 131072) != 0) {
                            d.c cVarB = cVar3;
                            z0.b bVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof a2.h) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                } else if ((cVarB.f1146c & 131072) != 0 && (cVarB instanceof i2.m)) {
                                    int i11 = 0;
                                    for (d.c cVar4 = ((i2.m) cVarB).f13947r; cVar4 != null; cVar4 = cVar4.f1149f) {
                                        if ((cVar4.f1146c & 131072) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarB = cVar4;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new z0.b(new d.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    bVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                bVar2.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarB = i2.k.b(bVar2);
                            }
                        }
                        cVar3 = cVar3.f1148e;
                    }
                }
                e0VarF2 = e0VarF2.G();
                cVar3 = (e0VarF2 == null || (d1Var = e0VarF2.I) == null) ? null : d1Var.f13792d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((a2.h) arrayList.get(size)).R()) {
                        break;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            i2.m mVarB2 = hVar.B();
            ?? bVar3 = 0;
            while (true) {
                if (mVarB2 != 0) {
                    if (mVarB2 instanceof a2.h) {
                        if (((a2.h) mVarB2).R()) {
                            break;
                        }
                    } else if ((mVarB2.f1146c & 131072) != 0 && (mVarB2 instanceof i2.m)) {
                        d.c cVar5 = mVarB2.f13947r;
                        int i13 = 0;
                        bVar3 = bVar3;
                        mVarB2 = mVarB2;
                        while (cVar5 != null) {
                            if ((cVar5.f1146c & 131072) != 0) {
                                i13++;
                                bVar3 = bVar3;
                                if (i13 == 1) {
                                    mVarB2 = cVar5;
                                } else {
                                    if (bVar3 == 0) {
                                        bVar3 = new z0.b(new d.c[16]);
                                    }
                                    if (mVarB2 != 0) {
                                        bVar3.b(mVarB2);
                                        mVarB2 = 0;
                                    }
                                    bVar3.b(cVar5);
                                }
                            }
                            cVar5 = cVar5.f1149f;
                            bVar3 = bVar3;
                            mVarB2 = mVarB2;
                        }
                        if (i13 == 1) {
                        }
                    }
                    mVarB2 = i2.k.b(bVar3);
                } else {
                    i2.m mVarB3 = hVar.B();
                    ?? bVar4 = 0;
                    while (true) {
                        if (mVarB3 != 0) {
                            if (mVarB3 instanceof a2.h) {
                                if (((a2.h) mVarB3).g1()) {
                                    break;
                                }
                            } else if ((mVarB3.f1146c & 131072) != 0 && (mVarB3 instanceof i2.m)) {
                                d.c cVar6 = mVarB3.f13947r;
                                int i14 = 0;
                                bVar4 = bVar4;
                                mVarB3 = mVarB3;
                                while (cVar6 != null) {
                                    if ((cVar6.f1146c & 131072) != 0) {
                                        i14++;
                                        bVar4 = bVar4;
                                        if (i14 == 1) {
                                            mVarB3 = cVar6;
                                        } else {
                                            if (bVar4 == 0) {
                                                bVar4 = new z0.b(new d.c[16]);
                                            }
                                            if (mVarB3 != 0) {
                                                bVar4.b(mVarB3);
                                                mVarB3 = 0;
                                            }
                                            bVar4.b(cVar6);
                                        }
                                    }
                                    cVar6 = cVar6.f1149f;
                                    bVar4 = bVar4;
                                    mVarB3 = mVarB3;
                                }
                                if (i14 == 1) {
                                }
                            }
                            mVarB3 = i2.k.b(bVar4);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                if (!((a2.h) arrayList.get(i15)).g1()) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13, types: [i2.l2] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.ui.focus.FocusTargetNode] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [z0.b] */
    @Override // o1.q
    public final Boolean p(int i10, p1.e eVar, eh.l<? super FocusTargetNode, Boolean> lVar) {
        Boolean bool;
        boolean zB;
        Boolean bool2;
        d1 d1Var;
        FocusTargetNode focusTargetNode = this.f18894f;
        FocusTargetNode focusTargetNodeA = m0.a(focusTargetNode);
        int i11 = 4;
        AndroidComposeView.m mVar = this.f18893e;
        if (focusTargetNodeA != null) {
            f3.r rVar = (f3.r) mVar.get();
            bool = null;
            z zVarU1 = focusTargetNodeA.U1();
            c0 c0Var = zVarU1.f18916h;
            c0 c0Var2 = zVarU1.f18917i;
            if (i10 == 1) {
                c0Var = zVarU1.f18910b;
            } else if (i10 == 2) {
                c0Var = zVarU1.f18911c;
            } else if (i10 == 5) {
                c0Var = zVarU1.f18912d;
            } else if (i10 == 6) {
                c0Var = zVarU1.f18913e;
            } else if (i10 == 3) {
                int iOrdinal = rVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new pg.l();
                    }
                    c0Var = c0Var2;
                }
                if (c0Var == c0.f18854b) {
                    c0Var = null;
                }
                if (c0Var == null) {
                    c0Var = zVarU1.f18914f;
                }
            } else if (i10 == 4) {
                int iOrdinal2 = rVar.ordinal();
                if (iOrdinal2 == 0) {
                    c0Var = c0Var2;
                } else if (iOrdinal2 != 1) {
                    throw new pg.l();
                }
                if (c0Var == c0.f18854b) {
                    c0Var = null;
                }
                if (c0Var == null) {
                    c0Var = zVarU1.f18915g;
                }
            } else {
                if (i10 != 7 && i10 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                o1.b bVar = new o1.b(i10);
                k0.a(focusTargetNodeA);
                q focusOwner = i2.k.g(focusTargetNodeA).getFocusOwner();
                FocusTargetNode focusTargetNodeR = focusOwner.r();
                if (i10 == 7) {
                    zVarU1.f18918j.invoke(bVar);
                } else {
                    zVarU1.f18919k.invoke(bVar);
                }
                c0Var = bVar.f18849b ? c0.f18855c : focusTargetNodeR != focusOwner.r() ? c0.f18856d : c0.f18854b;
            }
            if (!kotlin.jvm.internal.r.a(c0Var, c0.f18855c)) {
                if (kotlin.jvm.internal.r.a(c0Var, c0.f18856d)) {
                    FocusTargetNode focusTargetNodeA2 = m0.a(focusTargetNode);
                    if (focusTargetNodeA2 != null) {
                        return lVar.invoke(focusTargetNodeA2);
                    }
                } else if (!kotlin.jvm.internal.r.a(c0Var, c0.f18854b)) {
                    return Boolean.valueOf(c0Var.a(lVar));
                }
            }
            return bool;
        }
        bool = null;
        focusTargetNodeA = null;
        f3.r rVar2 = (f3.r) mVar.get();
        a aVar = new a(focusTargetNodeA, this, lVar);
        if (i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                zB = f3.f.c(focusTargetNode, aVar);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zB = f3.f.b(focusTargetNode, aVar);
            }
            return Boolean.valueOf(zB);
        }
        if (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            return f3.i.m(i10, focusTargetNode, aVar, eVar);
        }
        if (i10 == 7) {
            int iOrdinal3 = rVar2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new pg.l();
                }
                i11 = 3;
            }
            FocusTargetNode focusTargetNodeA3 = m0.a(focusTargetNode);
            if (focusTargetNodeA3 != null) {
                return f3.i.m(i11, focusTargetNodeA3, aVar, eVar);
            }
            return bool;
        }
        if (i10 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) e.a(i10))).toString());
        }
        FocusTargetNode focusTargetNodeA4 = m0.a(focusTargetNode);
        boolean zBooleanValue = false;
        if (focusTargetNodeA4 == null) {
            bool2 = bool;
        } else {
            if (!focusTargetNodeA4.f1144a.f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            ?? r32 = focusTargetNodeA4.f1144a.f1148e;
            i2.e0 e0VarF = i2.k.f(focusTargetNodeA4);
            loop0: while (e0VarF != null) {
                if ((e0VarF.I.f13793e.f1147d & 1024) != 0) {
                    for (d.c cVar = r32; cVar != null; cVar = cVar.f1148e) {
                        if ((cVar.f1146c & 1024) != 0) {
                            i2.m mVarB = cVar;
                            ?? bVar2 = bool;
                            while (mVarB != 0) {
                                if (mVarB instanceof FocusTargetNode) {
                                    ?? r52 = (FocusTargetNode) mVarB;
                                    if (r52.U1().f18909a) {
                                        bool2 = r52;
                                        break loop0;
                                    }
                                } else if ((mVarB.f1146c & 1024) != 0 && (mVarB instanceof i2.m)) {
                                    d.c cVar2 = mVarB.f13947r;
                                    int i12 = 0;
                                    mVarB = mVarB;
                                    bVar2 = bVar2;
                                    while (cVar2 != null) {
                                        if ((cVar2.f1146c & 1024) != 0) {
                                            i12++;
                                            bVar2 = bVar2;
                                            if (i12 == 1) {
                                                mVarB = cVar2;
                                            } else {
                                                if (bVar2 == 0) {
                                                    bVar2 = new z0.b(new d.c[16]);
                                                }
                                                if (mVarB != 0) {
                                                    bVar2.b(mVarB);
                                                    mVarB = bool;
                                                }
                                                bVar2.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.f1149f;
                                        mVarB = mVarB;
                                        bVar2 = bVar2;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                mVarB = i2.k.b(bVar2);
                            }
                        }
                    }
                }
                e0VarF = e0VarF.G();
                r32 = (e0VarF == null || (d1Var = e0VarF.I) == null) ? bool : d1Var.f13792d;
            }
            bool2 = bool;
        }
        if (bool2 != null && !bool2.equals(focusTargetNode)) {
            zBooleanValue = ((Boolean) aVar.invoke(bool2)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // o1.q
    public final void q() {
        f3.a.c(this.f18894f, true);
    }

    @Override // o1.q
    public final FocusTargetNode r() {
        return this.f18900l;
    }

    @Override // o1.q
    public final p.h0<m> s() {
        return this.f18899k;
    }

    @Override // o1.q
    public final boolean t() {
        return ((Boolean) this.f18889a.invoke(null, null)).booleanValue();
    }

    public final boolean u(boolean z10) {
        d1 d1Var;
        FocusTargetNode focusTargetNode = this.f18900l;
        if (focusTargetNode != null) {
            m(null);
            focusTargetNode.T1(i0.f18864a, i0.f18867d);
            if (!focusTargetNode.f1144a.f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNode.f1144a.f1148e;
            i2.e0 e0VarF = i2.k.f(focusTargetNode);
            while (e0VarF != null) {
                if ((e0VarF.I.f13793e.f1147d & 1024) != 0) {
                    while (cVar != null) {
                        if ((cVar.f1146c & 1024) != 0) {
                            z0.b bVar = null;
                            d.c cVarB = cVar;
                            while (cVarB != null) {
                                if (cVarB instanceof FocusTargetNode) {
                                    ((FocusTargetNode) cVarB).T1(i0.f18865b, i0.f18867d);
                                } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof i2.m)) {
                                    int i10 = 0;
                                    for (d.c cVar2 = ((i2.m) cVarB).f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
                                        if ((cVar2.f1146c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarB = cVar2;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new z0.b(new d.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    bVar.b(cVarB);
                                                    cVarB = null;
                                                }
                                                bVar.b(cVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarB = i2.k.b(bVar);
                            }
                        }
                        cVar = cVar.f1148e;
                    }
                }
                e0VarF = e0VarF.G();
                cVar = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r4.f20601e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (((r4.f20597a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        r33 = true;
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r3 = r4.f20599c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (java.lang.Long.compareUnsigned(r4.f20600d * 32, r3 * 25) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        r3 = r4.f20597a;
        r8 = r4.f20599c;
        r9 = r4.f20598b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
    
        r32 = r6;
        r17 = r15;
        r5 = qg.o.v(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012c, code lost:
    
        if (r5 == r8) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012e, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013b, code lost:
    
        if (r13 != r17) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0142, code lost:
    
        if (r13 == 254) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0145, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0166, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0168, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0186, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0189, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        if (((r34 >> r6) & 255) != r17) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019c, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r17 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c0, code lost:
    
        r3[r5] = ((r13 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01db, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e9, code lost:
    
        r33 = r7;
        r4.f20601e = p.w0.a(r4.f20599c) - r4.f20600d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fa, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fc, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0201, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0204, code lost:
    
        r3 = p.w0.c(r4.f20599c);
        r5 = r4.f20597a;
        r6 = r4.f20598b;
        r7 = r4.f20599c;
        r4.c(r3);
        r3 = r4.f20597a;
        r8 = r4.f20598b;
        r9 = r4.f20599c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021b, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022a, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022c, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r19 = r5;
        r20 = r6;
        r5 = r15 & org.bouncycastle.asn1.eac.CertificateBody.profileType;
        r15 = r3 >> 3;
        r22 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r22))) | (r5 << r22);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026a, code lost:
    
        r16 = r3;
        r19 = r5;
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0270, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r19;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0279, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027d, code lost:
    
        r32 = r3;
        r4.f20600d++;
        r3 = r4.f20601e;
        r5 = r4.f20597a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0297, code lost:
    
        if (((r7 >> r9) & 255) != r17) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0299, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029b, code lost:
    
        r4.f20601e = r3 - r21;
        r3 = r4.f20599c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0344, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0346, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j10;
        boolean z10;
        int iNumberOfTrailingZeros2;
        long jA = a2.d.a(keyEvent);
        int iB = a2.d.b(keyEvent);
        int i10 = -862048943;
        long j11 = 0;
        int i11 = 8;
        int i12 = 0;
        boolean z11 = true;
        if (iB == 2) {
            p.d0 d0Var = this.f18898j;
            if (d0Var == null) {
                d0Var = new p.d0(3);
                this.f18898j = d0Var;
            }
            p.d0 d0Var2 = d0Var;
            int iHashCode = Long.hashCode(jA) * (-862048943);
            int i13 = iHashCode ^ (iHashCode << 16);
            int i14 = i13 >>> 7;
            int i15 = i13 & CertificateBody.profileType;
            int i16 = d0Var2.f20599c;
            int i17 = i14 & i16;
            int i18 = 0;
            loop0: while (true) {
                long[] jArr = d0Var2.f20597a;
                int i19 = i17 >> 3;
                int i20 = i10;
                int i21 = (i17 & 7) << 3;
                long j12 = (jArr[i19] >>> i21) | ((jArr[i19 + 1] << (64 - i21)) & ((-i21) >> 63));
                long j13 = i15;
                long j14 = j12 ^ (j13 * 72340172838076673L);
                long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
                while (true) {
                    if (j15 == j11) {
                        break;
                    }
                    iNumberOfTrailingZeros2 = (i17 + (Long.numberOfTrailingZeros(j15) >> 3)) & i16;
                    long j16 = j11;
                    if (d0Var2.f20598b[iNumberOfTrailingZeros2] == jA) {
                        z10 = true;
                        break loop0;
                    }
                    j15 &= j15 - 1;
                    j11 = j16;
                }
                i18 += 8;
                i17 = (i17 + i18) & i16;
                i11 = i11;
                i10 = i20;
                j11 = j10;
            }
            d0Var2.f20598b[iNumberOfTrailingZeros2] = jA;
            return z10;
        }
        if (iB != 1) {
            return true;
        }
        p.d0 d0Var3 = this.f18898j;
        if (d0Var3 == null || !d0Var3.a(jA)) {
            return false;
        }
        p.d0 d0Var4 = this.f18898j;
        if (d0Var4 != null) {
            int iHashCode2 = Long.hashCode(jA) * (-862048943);
            int i22 = iHashCode2 ^ (iHashCode2 << 16);
            int i23 = i22 & CertificateBody.profileType;
            int i24 = d0Var4.f20599c;
            int i25 = i22 >>> 7;
            loop5: while (true) {
                int i26 = i25 & i24;
                long[] jArr2 = d0Var4.f20597a;
                int i27 = i26 >> 3;
                int i28 = (i26 & 7) << 3;
                long j17 = ((jArr2[i27 + 1] << (64 - i28)) & ((-i28) >> 63)) | (jArr2[i27] >>> i28);
                long j18 = (i23 * 72340172838076673L) ^ j17;
                long j19 = (~j18) & (j18 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j19 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j19) >> 3) + i26) & i24;
                    if (d0Var4.f20598b[iNumberOfTrailingZeros] == jA) {
                        break loop5;
                    }
                    j19 &= j19 - 1;
                }
                i12 += 8;
                i25 = i26 + i12;
            }
            if (iNumberOfTrailingZeros >= 0) {
                d0Var4.f20600d--;
                long[] jArr3 = d0Var4.f20597a;
                int i29 = d0Var4.f20599c;
                int i30 = iNumberOfTrailingZeros >> 3;
                int i31 = (iNumberOfTrailingZeros & 7) << 3;
                long j20 = (jArr3[i30] & (~(255 << i31))) | (254 << i31);
                jArr3[i30] = j20;
                jArr3[(((iNumberOfTrailingZeros - 7) & i29) + (i29 & 7)) >> 3] = j20;
                return true;
            }
        }
        return true;
    }
}
