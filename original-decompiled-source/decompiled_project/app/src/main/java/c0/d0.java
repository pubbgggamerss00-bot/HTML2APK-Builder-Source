package c0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import c0.v0;
import com.yalantis.ucrop.view.CropImageView;
import d0.j2;
import d0.q1;
import h1.h;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.k1;
import x0.n1;
import z.b;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.s implements eh.p<d0.q0, f3.b, l0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f4364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.g1 f4365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<p> f4366c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f4367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b.l f4368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f4369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k1 f4370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j2 f4371h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(w0 w0Var, z.g1 g1Var, kh.g gVar, t0 t0Var, b.l lVar, b.e eVar, ph.i0 i0Var, k1 k1Var, j2.a.C0077a c0077a) {
        super(2);
        this.f4364a = w0Var;
        this.f4365b = g1Var;
        this.f4366c = gVar;
        this.f4367d = t0Var;
        this.f4368e = lVar;
        this.f4369f = i0Var;
        this.f4370g = k1Var;
        this.f4371h = c0077a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0581 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05e7 A[LOOP:12: B:253:0x05e5->B:254:0x05e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x076c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0411 A[EDGE_INSN: B:337:0x0411->B:155:0x0411 BREAK  A[LOOP:4: B:145:0x03d1->B:154:0x040c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0316  */
    @Override // eh.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l0 invoke(d0.q0 q0Var, f3.b bVar) {
        d0.q0 q0Var2;
        eh.l<Object, pg.f0> lVarE;
        c0 c0Var;
        int iC;
        int iH;
        w0 w0Var;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int size;
        int i14;
        v0 v0Var;
        int i15;
        int i16;
        float f10;
        n1<pg.f0> n1Var;
        List arrayList;
        int size2;
        int i17;
        int iC2;
        int i18;
        n0 n0Var;
        int i19;
        boolean z11;
        boolean z12;
        int size3;
        int i20;
        d0.q0 q0Var3;
        float f11;
        int i21;
        l0 l0Var;
        d0.q0 q0Var4;
        int i22;
        int i23;
        m0 m0Var;
        d0.q0 q0Var5 = q0Var;
        long j10 = bVar.f8811a;
        w0 w0Var2 = this.f4364a;
        w0Var2.f4523s.getValue();
        boolean z13 = w0Var2.f4506b || q0Var5.I0();
        v.t0 t0Var = v.t0.f30083a;
        aa.b.c(j10, t0Var);
        f3.r layoutDirection = q0Var5.getLayoutDirection();
        z.g1 g1Var = this.f4365b;
        int iB1 = q0Var5.b1(g1Var.b(layoutDirection));
        int iB12 = q0Var5.b1(g1Var.d(q0Var5.getLayoutDirection()));
        int iB13 = q0Var5.b1(g1Var.f34519b);
        int iB14 = q0Var5.b1(g1Var.f34521d) + iB13;
        int i24 = iB12 + iB1;
        int i25 = iB14 - iB13;
        long jI = f3.c.i(-i24, -iB14, j10);
        p pVarInvoke = this.f4366c.invoke();
        v0 v0VarG = pVarInvoke.g();
        s0 s0VarA = this.f4367d.a(q0Var5, jI);
        int length = s0VarA.f4480a.length;
        if (length != v0VarG.f4495i) {
            v0VarG.f4495i = length;
            ArrayList<v0.a> arrayList2 = v0VarG.f4488b;
            arrayList2.clear();
            arrayList2.add(new v0.a(0, 0));
            v0VarG.f4489c = 0;
            v0VarG.f4490d = 0;
            v0VarG.f4491e = 0;
            v0VarG.f4492f = -1;
            v0VarG.f4493g.clear();
        }
        b.l lVar = this.f4368e;
        int iB15 = q0Var5.b1(lVar.a());
        int itemCount = pVarInvoke.getItemCount();
        int iH2 = f3.b.h(j10) - iB14;
        a0 a0Var = new a0(pVarInvoke, q0Var5, iB15, this.f4364a, iB13, i25, (iB13 & BodyPartID.bodyIdMax) | (iB1 << 32));
        b0 b0Var = new b0(s0VarA, itemCount, iB15, a0Var, v0VarG);
        c0 c0Var2 = new c0(v0VarG, b0Var);
        h1.h hVarA = h.a.a();
        List arrayList3 = null;
        if (hVarA != null) {
            q0Var2 = q0Var5;
            lVarE = hVarA.e();
        } else {
            q0Var2 = q0Var5;
            lVarE = null;
        }
        h1.h hVarB = h.a.b(hVarA);
        try {
            int iG = w0Var2.g();
            q0 q0Var6 = w0Var2.f4508d;
            int iA = d0.h0.a(iG, pVarInvoke, q0Var6.f4473d);
            if (iG != iA) {
                c0Var = c0Var2;
                q0Var6.f4470a.f(iA);
                q0Var6.f4474e.c(iG);
            } else {
                c0Var = c0Var2;
            }
            if (iA < itemCount || itemCount <= 0) {
                iC = v0VarG.c(iA);
                iH = w0Var2.h();
            } else {
                iC = v0VarG.c(itemCount - 1);
                iH = 0;
            }
            int i26 = iC;
            pg.f0 f0Var = pg.f0.f21461a;
            h.a.d(hVarA, hVarB, lVarE);
            List<Integer> listA = d0.n.a(pVarInvoke, w0Var2.f4521q, w0Var2.f4518n);
            float fFloatValue = (q0Var2.I0() || !z13) ? w0Var2.f4511g : ((Number) w0Var2.f4526v.f7122a.f23843b.getValue()).floatValue();
            LazyLayoutItemAnimator<m0> lazyLayoutItemAnimator = w0Var2.f4517m;
            boolean zI0 = q0Var2.I0();
            l0 l0Var2 = w0Var2.f4507c;
            n1<pg.f0> n1Var2 = w0Var2.f4522r;
            d0.q0 q0Var7 = q0Var2;
            int i27 = iH;
            z zVar = new z(q0Var7, j10, i24, iB14);
            if (iB13 < 0) {
                y.c.a("negative beforeContentPadding");
            }
            if (i25 < 0) {
                y.c.a("negative afterContentPadding");
            }
            ph.i0 i0Var = this.f4369f;
            k1 k1Var = this.f4370g;
            qg.z zVar2 = qg.z.f22752a;
            if (itemCount <= 0) {
                int iK = f3.b.k(jI);
                int iJ = f3.b.j(jI);
                lazyLayoutItemAnimator.d(0, iK, iJ, new ArrayList(), pVarInvoke.a(), a0Var, true, zI0, length, z13, 0, 0, i0Var, k1Var);
                if (!zI0) {
                    long jB = lazyLayoutItemAnimator.b();
                    if (!f3.p.b(jB, 0L)) {
                        iK = f3.c.g((int) (jB >> 32), jI);
                        iJ = f3.c.f((int) (jB & BodyPartID.bodyIdMax), jI);
                    }
                }
                q0Var4 = q0Var7;
                w0Var = w0Var2;
                l0Var = new l0(null, 0, false, CropImageView.DEFAULT_ASPECT_RATIO, (g2.m0) zVar.b(Integer.valueOf(iK), Integer.valueOf(iJ), h0.f4392a), CropImageView.DEFAULT_ASPECT_RATIO, false, i0Var, q0Var4, length, c0Var, zVar2, -iB13, iH2 + i25, 0, t0Var, i25, iB15);
            } else {
                int i28 = i26;
                int i29 = iB15;
                w0Var = w0Var2;
                c0 c0Var3 = c0Var;
                int iRound = Math.round(fFloatValue);
                int i30 = i27 - iRound;
                if (i28 == 0 && i30 < 0) {
                    iRound += i30;
                    i30 = 0;
                }
                qg.l lVar2 = new qg.l();
                int i31 = -iB13;
                int i32 = i31 + (i29 < 0 ? i29 : 0);
                int i33 = i30 + i32;
                while (i33 < 0 && i28 > 0) {
                    int i34 = i29;
                    int i35 = i28 - 1;
                    int i36 = i31;
                    n0 n0VarC = b0Var.c(i35);
                    lVar2.add(0, n0VarC);
                    i33 += n0VarC.f4462g;
                    i28 = i35;
                    i29 = i34;
                    i31 = i36;
                }
                int i37 = i29;
                int i38 = i31;
                if (i33 < i32) {
                    iRound -= i32 - i33;
                    i33 = i32;
                }
                int i39 = iRound;
                int i40 = i33 - i32;
                int i41 = iH2 + i25;
                if (i41 < 0) {
                    i41 = 0;
                }
                int i42 = -i40;
                int i43 = i40;
                int i44 = i28;
                int i45 = 0;
                boolean z14 = false;
                while (i45 < lVar2.f22729c) {
                    if (i42 >= i41) {
                        lVar2.e(i45);
                        z14 = true;
                    } else {
                        i44++;
                        i42 += ((n0) lVar2.get(i45)).f4462g;
                        i45++;
                    }
                }
                boolean z15 = z14;
                int i46 = i44;
                while (i46 < itemCount && (i42 < i41 || i42 <= 0 || lVar2.isEmpty())) {
                    z10 = z15;
                    n0 n0VarC2 = b0Var.c(i46);
                    int i47 = i46;
                    m0[] m0VarArr = n0VarC2.f4457b;
                    int i48 = i41;
                    int i49 = n0VarC2.f4462g;
                    if (m0VarArr.length == 0) {
                        break;
                    }
                    i42 += i49;
                    if (i42 > i32) {
                        lVar2.addLast(n0VarC2);
                        z15 = z10;
                    } else {
                        if (m0VarArr.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        if (m0VarArr[m0VarArr.length - 1].f4431a != itemCount - 1) {
                            i43 -= i49;
                            z15 = true;
                            i28 = i47 + 1;
                        }
                    }
                    i46 = i47 + 1;
                    i41 = i48;
                }
                z10 = z15;
                if (i42 < iH2) {
                    int i50 = iH2 - i42;
                    i42 += i50;
                    int i51 = i43 - i50;
                    while (i51 < iB13 && i28 > 0) {
                        int i52 = i28 - 1;
                        n0 n0VarC3 = b0Var.c(i52);
                        lVar2.add(0, n0VarC3);
                        i51 += n0VarC3.f4462g;
                        i28 = i52;
                    }
                    int i53 = i51;
                    i10 = i50 + i39;
                    if (i53 < 0) {
                        i10 += i53;
                        i42 += i53;
                        i11 = 0;
                    } else {
                        i11 = i53;
                    }
                } else {
                    i10 = i39;
                    i11 = i43;
                }
                float f12 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i10) || Math.abs(Math.round(fFloatValue)) < Math.abs(i10)) ? fFloatValue : i10;
                float f13 = fFloatValue - f12;
                float f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (zI0 && i10 > i39 && f13 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f14 = (i10 - i39) + f13;
                }
                float f15 = f14;
                if (i11 < 0) {
                    y.c.a("negative initial offset");
                }
                int i54 = -i11;
                n0 n0Var2 = (n0) lVar2.first();
                int i55 = i11;
                m0[] m0VarArr2 = n0Var2.f4457b;
                m0 m0Var2 = m0VarArr2.length == 0 ? null : m0VarArr2[0];
                int i56 = m0Var2 != null ? m0Var2.f4431a : 0;
                n0 n0Var3 = (n0) lVar2.k();
                if (n0Var3 != null) {
                    m0[] m0VarArr3 = n0Var3.f4457b;
                    i12 = i54;
                    m0 m0Var3 = m0VarArr3.length == 0 ? null : m0VarArr3[m0VarArr3.length - 1];
                    i13 = m0Var3 != null ? m0Var3.f4431a : 0;
                    size = listA.size();
                    ArrayList arrayList4 = null;
                    i14 = 0;
                    while (true) {
                        v0Var = b0Var.f4467e;
                        if (i14 < size) {
                            break;
                        }
                        int i57 = size;
                        int iIntValue = listA.get(i14).intValue();
                        if (iIntValue >= 0 && iIntValue < i56) {
                            int iE = v0Var.e(iIntValue);
                            m0 m0VarB = a0Var.b(iIntValue, 0, iE, a0Var.f4340c, b0Var.a(0, iE));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            ArrayList arrayList5 = arrayList4;
                            arrayList5.add(m0VarB);
                            arrayList4 = arrayList5;
                        }
                        i14++;
                        size = i57;
                    }
                    List list = arrayList4 != null ? zVar2 : arrayList4;
                    if (zI0 || l0Var2 == null || l0Var2.i().isEmpty()) {
                        i15 = i56;
                        i16 = i13;
                        f10 = f12;
                        n1Var = n1Var2;
                    } else {
                        List<m0> listI = l0Var2.i();
                        i15 = i56;
                        n1Var = n1Var2;
                        for (int size4 = listI.size() - 1; -1 < size4; size4--) {
                            if (listI.get(size4).getIndex() > i13 && (size4 == 0 || listI.get(size4 - 1).getIndex() <= i13)) {
                                m0Var = listI.get(size4);
                                break;
                            }
                        }
                        m0Var = null;
                        o oVar = (o) qg.x.J(l0Var2.i());
                        n0 n0Var4 = (n0) qg.x.K(lVar2);
                        int i58 = n0Var4 != null ? n0Var4.f4456a + 1 : 0;
                        if (m0Var != null) {
                            int index = m0Var.getIndex();
                            int i59 = i58;
                            int iMin = Math.min(oVar.getIndex(), itemCount - 1);
                            if (index <= iMin) {
                                i16 = i13;
                                int i60 = i59;
                                arrayList = null;
                                while (true) {
                                    if (arrayList != null) {
                                        int size5 = arrayList.size();
                                        f10 = f12;
                                        int i61 = 0;
                                        while (i61 < size5) {
                                            int i62 = size5;
                                            m0[] m0VarArr4 = ((n0) arrayList.get(i61)).f4457b;
                                            List list2 = arrayList;
                                            int length2 = m0VarArr4.length;
                                            int i63 = 0;
                                            while (i63 < length2) {
                                                int i64 = i63;
                                                if (m0VarArr4[i64].f4431a == index) {
                                                    arrayList = list2;
                                                    break;
                                                }
                                                i63 = i64 + 1;
                                            }
                                            i61++;
                                            arrayList = list2;
                                            size5 = i62;
                                        }
                                    } else {
                                        f10 = f12;
                                    }
                                    List list3 = arrayList;
                                    arrayList = list3 == null ? new ArrayList() : list3;
                                    n0 n0VarC4 = b0Var.c(i60);
                                    i60++;
                                    arrayList.add(n0VarC4);
                                    if (index == iMin) {
                                        break;
                                    }
                                    index++;
                                    f12 = f10;
                                }
                                if (arrayList == null) {
                                    arrayList = zVar2;
                                }
                                size2 = listA.size();
                                i17 = 0;
                                while (i17 < size2) {
                                    int iIntValue2 = listA.get(i17).intValue();
                                    if (i16 + 1 > iIntValue2 || iIntValue2 >= itemCount) {
                                        i22 = size2;
                                        i23 = i17;
                                    } else if (zI0) {
                                        int size6 = arrayList.size();
                                        int i65 = 0;
                                        while (i65 < size6) {
                                            i22 = size2;
                                            m0[] m0VarArr5 = ((n0) arrayList.get(i65)).f4457b;
                                            i23 = i17;
                                            int length3 = m0VarArr5.length;
                                            int i66 = 0;
                                            while (i66 < length3) {
                                                int i67 = i66;
                                                if (m0VarArr5[i67].f4431a == iIntValue2) {
                                                    break;
                                                }
                                                i66 = i67 + 1;
                                            }
                                            i65++;
                                            i17 = i23;
                                            size2 = i22;
                                        }
                                        i22 = size2;
                                        i23 = i17;
                                        int iE2 = v0Var.e(iIntValue2);
                                        m0 m0VarB2 = a0Var.b(iIntValue2, 0, iE2, a0Var.f4340c, b0Var.a(0, iE2));
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        List list4 = arrayList3;
                                        list4.add(m0VarB2);
                                        arrayList3 = list4;
                                    } else {
                                        i22 = size2;
                                        i23 = i17;
                                        int iE22 = v0Var.e(iIntValue2);
                                        m0 m0VarB22 = a0Var.b(iIntValue2, 0, iE22, a0Var.f4340c, b0Var.a(0, iE22));
                                        if (arrayList3 == null) {
                                        }
                                        List list42 = arrayList3;
                                        list42.add(m0VarB22);
                                        arrayList3 = list42;
                                    }
                                    i17 = i23 + 1;
                                    size2 = i22;
                                }
                                List list5 = arrayList3 == null ? zVar2 : arrayList3;
                                if (iB13 > 0 || i37 < 0) {
                                    iC2 = lVar2.c();
                                    i18 = i55;
                                    n0Var = n0Var2;
                                    i19 = 0;
                                    while (i19 < iC2) {
                                        int i68 = ((n0) lVar2.get(i19)).f4462g;
                                        if (i18 == 0 || i68 > i18 || i19 == qg.p.i(lVar2)) {
                                            break;
                                        }
                                        i18 -= i68;
                                        i19++;
                                        n0Var = (n0) lVar2.get(i19);
                                    }
                                } else {
                                    i18 = i55;
                                    n0Var = n0Var2;
                                }
                                int i69 = f3.b.i(jI);
                                int iF = f3.c.f(i42, jI);
                                List listO = lVar2;
                                if (!arrayList.isEmpty()) {
                                    listO = qg.x.O(arrayList, lVar2);
                                }
                                z11 = i42 >= Math.min(iF, iH2);
                                if (z11 && i12 != 0) {
                                    y.c.c("non-zero firstLineScrollOffset");
                                }
                                z12 = z11;
                                int i70 = i18;
                                n0 n0Var5 = n0Var;
                                i20 = 0;
                                int length4 = 0;
                                for (size3 = listO.size(); i20 < size3; size3 = size3) {
                                    length4 += ((n0) listO.get(i20)).f4457b.length;
                                    i20++;
                                }
                                ArrayList arrayList6 = new ArrayList(length4);
                                if (!z12) {
                                    if (!list.isEmpty() || !list5.isEmpty()) {
                                        y.c.a("no items");
                                    }
                                    int size7 = listO.size();
                                    int[] iArr = new int[size7];
                                    for (int i71 = 0; i71 < size7; i71++) {
                                        iArr[i71] = ((n0) listO.get(i71)).f4461f;
                                    }
                                    int[] iArr2 = new int[size7];
                                    lVar.c(q0Var7, iF, iArr, iArr2);
                                    jh.g gVarU = qg.o.u(iArr2);
                                    int i72 = gVarU.f15744a;
                                    int i73 = gVarU.f15745b;
                                    int i74 = gVarU.f15746c;
                                    if ((i74 > 0 && i72 <= i73) || (i74 < 0 && i73 <= i72)) {
                                        while (true) {
                                            q0Var3 = q0Var7;
                                            m0[] m0VarArrA = ((n0) listO.get(i72)).a(iArr2[i72], i69, iF);
                                            int length5 = m0VarArrA.length;
                                            int i75 = 0;
                                            while (i75 < length5) {
                                                int i76 = i75;
                                                arrayList6.add(m0VarArrA[i76]);
                                                i75 = i76 + 1;
                                            }
                                            if (i72 == i73) {
                                                break;
                                            }
                                            i72 += i74;
                                            q0Var7 = q0Var3;
                                        }
                                    } else {
                                        q0Var3 = q0Var7;
                                    }
                                } else {
                                    q0Var3 = q0Var7;
                                    int size8 = list.size() - 1;
                                    if (size8 >= 0) {
                                        int i77 = i12;
                                        while (true) {
                                            int i78 = size8 - 1;
                                            m0 m0Var4 = (m0) list.get(size8);
                                            i77 -= m0Var4.f4446p;
                                            List list6 = list;
                                            m0Var4.n(i77, 0, i69, iF);
                                            arrayList6.add(m0Var4);
                                            if (i78 < 0) {
                                                break;
                                            }
                                            size8 = i78;
                                            list = list6;
                                        }
                                    }
                                    int size9 = listO.size();
                                    int i79 = i12;
                                    int i80 = 0;
                                    while (i80 < size9) {
                                        n0 n0Var6 = (n0) listO.get(i80);
                                        int i81 = size9;
                                        m0[] m0VarArrA2 = n0Var6.a(i79, i69, iF);
                                        int i82 = i80;
                                        int length6 = m0VarArrA2.length;
                                        int i83 = 0;
                                        while (i83 < length6) {
                                            int i84 = i83;
                                            arrayList6.add(m0VarArrA2[i84]);
                                            i83 = i84 + 1;
                                        }
                                        i79 += n0Var6.f4462g;
                                        i80 = i82 + 1;
                                        size9 = i81;
                                    }
                                    int size10 = list5.size();
                                    for (int i85 = 0; i85 < size10; i85++) {
                                        m0 m0Var5 = (m0) list5.get(i85);
                                        m0Var5.n(i79, 0, i69, iF);
                                        arrayList6.add(m0Var5);
                                        i79 += m0Var5.f4446p;
                                    }
                                }
                                float f16 = f10;
                                lazyLayoutItemAnimator.d((int) f16, i69, iF, arrayList6, pVarInvoke.a(), a0Var, true, zI0, length, z13, i70, i42, i0Var, k1Var);
                                if (zI0) {
                                    long jB2 = lazyLayoutItemAnimator.b();
                                    f11 = f16;
                                    if (!f3.p.b(jB2, 0L)) {
                                        i69 = f3.c.g(Math.max(i69, (int) (jB2 >> 32)), jI);
                                        int iF2 = f3.c.f(Math.max(iF, (int) (jB2 & BodyPartID.bodyIdMax)), jI);
                                        if (iF2 != iF) {
                                            int size11 = arrayList6.size();
                                            for (int i86 = 0; i86 < size11; i86++) {
                                                m0 m0Var6 = (m0) arrayList6.get(i86);
                                                m0Var6.f4447q = iF2;
                                                m0Var6.f4449s = m0Var6.f4437g + iF2;
                                            }
                                        }
                                        i21 = iF2;
                                    }
                                    int i87 = i69;
                                    List listA2 = q1.a(this.f4371h, arrayList6, pVarInvoke.b(), iB13, i25, i87, i21, new k0(b0Var, a0Var));
                                    int i88 = i16;
                                    q0Var4 = q0Var3;
                                    l0Var = new l0(n0Var5, i70, i88 != itemCount + (-1) || i42 > iH2, f11, (g2.m0) zVar.b(Integer.valueOf(i87), Integer.valueOf(i21), new j0(n1Var, arrayList6, listA2, zI0)), f15, z10, i0Var, q0Var4, length, c0Var3, d0.u0.a(i15, i88, arrayList6, listA2), i38, i41, itemCount, v.t0.f30083a, i25, i37);
                                } else {
                                    f11 = f16;
                                }
                                i21 = iF;
                                int i872 = i69;
                                List listA22 = q1.a(this.f4371h, arrayList6, pVarInvoke.b(), iB13, i25, i872, i21, new k0(b0Var, a0Var));
                                int i882 = i16;
                                if (i882 != itemCount + (-1)) {
                                    q0Var4 = q0Var3;
                                    l0Var = new l0(n0Var5, i70, i882 != itemCount + (-1) || i42 > iH2, f11, (g2.m0) zVar.b(Integer.valueOf(i872), Integer.valueOf(i21), new j0(n1Var, arrayList6, listA22, zI0)), f15, z10, i0Var, q0Var4, length, c0Var3, d0.u0.a(i15, i882, arrayList6, listA22), i38, i41, itemCount, v.t0.f30083a, i25, i37);
                                }
                            }
                        }
                        i16 = i13;
                        f10 = f12;
                    }
                    arrayList = null;
                    if (arrayList == null) {
                    }
                    size2 = listA.size();
                    i17 = 0;
                    while (i17 < size2) {
                    }
                    if (arrayList3 == null) {
                    }
                    if (iB13 > 0) {
                        iC2 = lVar2.c();
                        i18 = i55;
                        n0Var = n0Var2;
                        i19 = 0;
                        while (i19 < iC2) {
                        }
                        int i692 = f3.b.i(jI);
                        int iF3 = f3.c.f(i42, jI);
                        List listO2 = lVar2;
                        if (!arrayList.isEmpty()) {
                        }
                        if (i42 >= Math.min(iF3, iH2)) {
                        }
                        if (z11) {
                            y.c.c("non-zero firstLineScrollOffset");
                        }
                        z12 = z11;
                        int i702 = i18;
                        n0 n0Var52 = n0Var;
                        i20 = 0;
                        int length42 = 0;
                        while (i20 < size3) {
                        }
                        ArrayList arrayList62 = new ArrayList(length42);
                        if (!z12) {
                        }
                        float f162 = f10;
                        lazyLayoutItemAnimator.d((int) f162, i692, iF3, arrayList62, pVarInvoke.a(), a0Var, true, zI0, length, z13, i702, i42, i0Var, k1Var);
                        if (zI0) {
                        }
                        i21 = iF3;
                        int i8722 = i692;
                        List listA222 = q1.a(this.f4371h, arrayList62, pVarInvoke.b(), iB13, i25, i8722, i21, new k0(b0Var, a0Var));
                        int i8822 = i16;
                    }
                } else {
                    i12 = i54;
                }
                size = listA.size();
                ArrayList arrayList42 = null;
                i14 = 0;
                while (true) {
                    v0Var = b0Var.f4467e;
                    if (i14 < size) {
                    }
                    i14++;
                    size = i57;
                }
                if (arrayList42 != null) {
                }
                if (zI0) {
                    i15 = i56;
                    i16 = i13;
                    f10 = f12;
                    n1Var = n1Var2;
                    arrayList = null;
                    if (arrayList == null) {
                    }
                    size2 = listA.size();
                    i17 = 0;
                    while (i17 < size2) {
                    }
                    if (arrayList3 == null) {
                    }
                    if (iB13 > 0) {
                    }
                }
            }
            w0Var.f(l0Var, q0Var4.I0(), false);
            return l0Var;
        } catch (Throwable th2) {
            h.a.d(hVarA, hVarB, lVarE);
            throw th2;
        }
    }
}
