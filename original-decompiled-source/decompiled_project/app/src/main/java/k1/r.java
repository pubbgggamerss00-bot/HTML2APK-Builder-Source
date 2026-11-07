package k1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import j2.x4;
import java.util.List;
import k1.n;
import kotlin.jvm.internal.s;
import p.l0;
import pg.f0;
import q2.c0;
import q2.w;
import qg.x;
import t2.h0;
import x0.s1;

/* loaded from: classes.dex */
public final class r {

    public static final class a extends s implements eh.r<Integer, Integer, Integer, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewStructure f15939a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewStructure viewStructure) {
            super(4);
            this.f15939a = viewStructure;
        }

        @Override // eh.r
        public final f0 f(Integer num, Integer num2, Integer num3, Integer num4) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            int iIntValue3 = num3.intValue();
            int iIntValue4 = num4.intValue() - iIntValue2;
            this.f15939a.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
            return f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169 A[PHI: r7 r20 r21 r22 r23 r24 r25 r26 r27
      0x0169: PHI (r7v8 k1.m) = (r7v7 k1.m), (r7v9 k1.m) binds: [B:10:0x004b, B:62:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004b, B:62:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r21v13 s2.a) = (r21v12 s2.a), (r21v14 s2.a) binds: [B:10:0x004b, B:62:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r22v6 k1.n) = (r22v5 k1.n), (r22v7 k1.n) binds: [B:10:0x004b, B:62:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r23v6 java.lang.Boolean) = (r23v5 java.lang.Boolean), (r23v7 java.lang.Boolean) binds: [B:10:0x004b, B:62:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r24v11 q2.i) = (r24v10 q2.i), (r24v12 q2.i) binds: [B:10:0x004b, B:62:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r25v6 boolean) = (r25v5 boolean), (r25v7 boolean) binds: [B:10:0x004b, B:62:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r26v6 java.lang.Integer) = (r26v5 java.lang.Integer), (r26v7 java.lang.Integer) binds: [B:10:0x004b, B:62:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r27v12 t2.b) = (r27v11 t2.b), (r27v13 t2.b) binds: [B:10:0x004b, B:62:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ViewStructure viewStructure, q2.n nVar, AutofillId autofillId, String str, r2.c cVar) {
        int i10;
        long j10;
        long j11;
        char c10;
        long j12;
        s2.a aVar;
        q2.i iVar;
        t2.b bVar;
        m mVar;
        boolean z10;
        n nVar2;
        Boolean bool;
        boolean z11;
        Integer num;
        Integer num2;
        List list;
        Integer numValueOf;
        boolean z12;
        String strG;
        String[] strArrB;
        String[] strArrB2;
        l0<c0<?>, Object> l0Var;
        long[] jArr;
        Object[] objArr;
        Integer num3;
        long[] jArr2;
        Object[] objArr2;
        l0<c0<?>, Object> l0Var2;
        s2.a aVar2;
        q2.i iVar2;
        t2.b bVar2;
        int i11;
        Integer num4 = 1;
        c0<List<String>> c0Var = w.f21820a;
        c0<q2.a<eh.l<List<h0>, Boolean>>> c0Var2 = q2.k.f21773a;
        q2.l lVarE = nVar.e();
        int i12 = 8;
        if (lVarE == null || (l0Var2 = lVarE.f21799a) == null) {
            i10 = 2;
            j10 = 128;
            j11 = 255;
            c10 = 7;
            j12 = -9187201950435737472L;
            aVar = null;
            iVar = null;
            bVar = null;
            mVar = null;
            z10 = false;
            nVar2 = null;
            bool = null;
            z11 = false;
            num = null;
        } else {
            Object[] objArr3 = l0Var2.f20738b;
            j10 = 128;
            Object[] objArr4 = l0Var2.f20739c;
            long[] jArr3 = l0Var2.f20737a;
            int length = jArr3.length - 2;
            i10 = 2;
            if (length >= 0) {
                int i13 = 0;
                mVar = null;
                j11 = 255;
                z10 = false;
                aVar2 = null;
                nVar2 = null;
                bool = null;
                iVar2 = null;
                z11 = false;
                num = null;
                bVar2 = null;
                c10 = 7;
                while (true) {
                    long j13 = jArr3[i13];
                    j12 = -9187201950435737472L;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j13 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr3[i16];
                                Object obj2 = objArr4[i16];
                                c0 c0Var3 = (c0) obj;
                                i11 = i12;
                                if (kotlin.jvm.internal.r.a(c0Var3, w.f21836q)) {
                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    mVar = (m) obj2;
                                } else if (kotlin.jvm.internal.r.a(c0Var3, w.f21820a)) {
                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) x.D((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (kotlin.jvm.internal.r.a(c0Var3, w.f21835p)) {
                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    nVar2 = (n) obj2;
                                } else if (kotlin.jvm.internal.r.a(c0Var3, w.D)) {
                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    bVar2 = (t2.b) obj2;
                                } else if (kotlin.jvm.internal.r.a(c0Var3, w.f21830k)) {
                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (kotlin.jvm.internal.r.a(c0Var3, w.M)) {
                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (kotlin.jvm.internal.r.a(c0Var3, w.I)) {
                                    z11 = true;
                                } else if (kotlin.jvm.internal.r.a(c0Var3, w.f21842w)) {
                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    iVar2 = (q2.i) obj2;
                                } else if (kotlin.jvm.internal.r.a(c0Var3, w.G)) {
                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (kotlin.jvm.internal.r.a(c0Var3, w.H)) {
                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar2 = (s2.a) obj2;
                                } else if (kotlin.jvm.internal.r.a(c0Var3, q2.k.f21774b)) {
                                    viewStructure.setClickable(true);
                                } else if (kotlin.jvm.internal.r.a(c0Var3, q2.k.f21775c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (kotlin.jvm.internal.r.a(c0Var3, q2.k.f21794v)) {
                                    viewStructure.setFocusable(true);
                                } else if (kotlin.jvm.internal.r.a(c0Var3, q2.k.f21782j)) {
                                    z10 = true;
                                }
                            } else {
                                i11 = i12;
                            }
                            j13 >>= i11;
                            i15++;
                            i12 = i11;
                        }
                        if (i14 != i12) {
                            break;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        i12 = 8;
                    }
                }
            } else {
                j11 = 255;
                c10 = 7;
                j12 = -9187201950435737472L;
                mVar = null;
                z10 = false;
                aVar2 = null;
                nVar2 = null;
                bool = null;
                iVar2 = null;
                z11 = false;
                num = null;
                bVar2 = null;
            }
            aVar = aVar2;
            iVar = iVar2;
            bVar = bVar2;
        }
        q2.l lVarE2 = nVar.e();
        if (lVarE2 != null && lVarE2.f21801c && !lVarE2.f21802d) {
            lVarE2 = lVarE2.e();
            p.h0 h0Var = new p.h0(nVar.g().size());
            h0Var.h(nVar.g());
            while (h0Var.e()) {
                q2.n nVar3 = (q2.n) h0Var.k(h0Var.f20707b - 1);
                q2.l lVarE3 = nVar3.e();
                if (lVarE3 != null && !lVarE3.f21801c) {
                    lVarE2.i(lVarE3);
                    if (!lVarE3.f21802d) {
                        h0Var.h(nVar3.g());
                    }
                }
            }
        }
        if (lVarE2 == null || (l0Var = lVarE2.f21799a) == null) {
            num2 = num4;
            list = null;
        } else {
            Object[] objArr5 = l0Var.f20738b;
            Object[] objArr6 = l0Var.f20739c;
            long[] jArr4 = l0Var.f20737a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                list = null;
                while (true) {
                    long j14 = jArr4[i17];
                    if ((((~j14) << c10) & j14 & j12) != j12) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j14 & j11) < j10) {
                                int i20 = (i17 << 3) + i19;
                                Object obj3 = objArr5[i20];
                                num3 = num4;
                                Object obj4 = objArr6[i20];
                                jArr2 = jArr4;
                                c0 c0Var4 = (c0) obj3;
                                objArr2 = objArr5;
                                if (kotlin.jvm.internal.r.a(c0Var4, w.f21828i)) {
                                    viewStructure.setEnabled(false);
                                } else if (kotlin.jvm.internal.r.a(c0Var4, w.f21845z)) {
                                    kotlin.jvm.internal.r.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                num3 = num4;
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j14 >>= 8;
                            i19++;
                            jArr4 = jArr2;
                            objArr5 = objArr2;
                            num4 = num3;
                        }
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                        if (i18 != 8) {
                            break;
                        }
                    } else {
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    jArr4 = jArr;
                    objArr5 = objArr;
                    num4 = num2;
                }
            }
        }
        Integer numValueOf2 = Integer.valueOf(nVar.y());
        if (nVar.f() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (mVar == null) {
            if (!z10) {
                numValueOf = aVar != null ? Integer.valueOf(i10) : null;
            }
            if (numValueOf != null) {
                viewStructure.setAutofillType(numValueOf.intValue());
            }
            if (nVar2 != null && (strArrB2 = o.b(nVar2)) != null) {
                viewStructure.setAutofillHints(strArrB2);
            }
            cVar.f23146a.b(nVar.y(), new a(viewStructure));
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (aVar == null) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(aVar == s2.a.f24191a);
            } else if (bool != null && (iVar == null || iVar.f21770a != 4)) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            n.f15935a.getClass();
            z12 = !z11 || (nVar2 == null && (strArrB = o.b(nVar2)) != null && qg.o.r(strArrB, (String) qg.o.t(o.b(n.a.f15937b))));
            if (z12) {
                viewStructure.setDataIsSensitive(true);
            }
            viewStructure.setVisibility(nVar.k() ? 4 : 0);
            if (list != null) {
                int size = list.size();
                String strA = "";
                for (int i21 = 0; i21 < size; i21++) {
                    strA = s1.a(q.a(strA), ((t2.b) list.get(i21)).f27761b, '\n');
                }
                viewStructure.setText(strA);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (nVar.g().isEmpty() && iVar != null && (strG = x4.g(iVar.f21770a)) != null) {
                viewStructure.setClassName(strG);
            }
            if (z10) {
                return;
            }
            viewStructure.setClassName("android.widget.EditText");
            if (num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (bVar != null) {
                viewStructure.setAutofillValue(AutofillValue.forText(bVar.f27761b));
            }
            if (z12) {
                viewStructure.setInputType(129);
                return;
            }
            return;
        }
        numValueOf = num2;
        if (numValueOf != null) {
        }
        if (nVar2 != null) {
            viewStructure.setAutofillHints(strArrB2);
        }
        cVar.f23146a.b(nVar.y(), new a(viewStructure));
        if (bool != null) {
        }
        if (aVar == null) {
        }
        n.f15935a.getClass();
        if (z11) {
        }
        if (z12) {
        }
        viewStructure.setVisibility(nVar.k() ? 4 : 0);
        if (list != null) {
        }
        if (nVar.g().isEmpty()) {
            viewStructure.setClassName(strG);
        }
        if (z10) {
        }
    }
}
