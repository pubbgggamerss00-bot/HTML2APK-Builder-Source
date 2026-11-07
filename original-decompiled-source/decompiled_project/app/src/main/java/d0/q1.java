package d0;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class q1 {
    public static final List a(j2 j2Var, ArrayList arrayList, p.x xVar, int i10, int i11, int i12, int i13, eh.l lVar) {
        int i14;
        j2 j2Var2 = j2Var;
        if (j2Var2 == null || arrayList.isEmpty() || xVar.f20751b == 0) {
            return qg.z.f22752a;
        }
        p.x xVarA = j2Var2.a(((s0) qg.x.B(arrayList)).getIndex(), ((s0) qg.x.J(arrayList)).getIndex(), xVar);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = arrayList.get(i15);
            int index = ((s0) obj).getIndex();
            int[] iArr = xVar.f20750a;
            int i16 = xVar.f20751b;
            int i17 = 0;
            while (true) {
                if (i17 >= i16) {
                    break;
                }
                if (iArr[i17] == index) {
                    arrayList3.add(obj);
                    break;
                }
                i17++;
            }
        }
        int[] iArr2 = xVarA.f20750a;
        int i18 = xVarA.f20751b;
        int i19 = 0;
        while (i19 < i18) {
            int i20 = iArr2[i19];
            int size2 = arrayList.size();
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i22 >= size2) {
                    i21 = -1;
                    break;
                }
                Object obj2 = arrayList.get(i22);
                i22++;
                if (((s0) obj2).getIndex() == i20) {
                    break;
                }
                i21++;
            }
            s0 s0Var = i21 == -1 ? (s0) lVar.invoke(Integer.valueOf(i20)) : (s0) arrayList.remove(i21);
            ArrayList arrayList4 = arrayList3;
            int iD = s0Var.d();
            if (i21 == -1) {
                i14 = PKIFailureInfo.systemUnavail;
            } else {
                long j10 = s0Var.j(0);
                i14 = (int) (s0Var.h() ? j10 & BodyPartID.bodyIdMax : j10 >> 32);
            }
            int iB = j2Var2.b(arrayList4, i20, iD, i14, i10);
            s0Var.i();
            s0Var.n(iB, 0, i12, i13);
            arrayList2.add(s0Var);
            i19++;
            j2Var2 = j2Var;
            arrayList3 = arrayList4;
        }
        return arrayList2;
    }

    public static final Object b(uh.r rVar, uh.r rVar2, eh.p pVar) {
        Object yVar;
        Object objJ;
        try {
            kotlin.jvm.internal.m0.b(2, pVar);
            yVar = pVar.invoke(rVar2, rVar);
        } catch (Throwable th2) {
            yVar = new ph.y(false, th2);
        }
        ug.a aVar = ug.a.f29706a;
        if (yVar == aVar || (objJ = rVar.J(yVar)) == ph.b2.f21499b) {
            return aVar;
        }
        rVar.c0();
        if (objJ instanceof ph.y) {
            throw ((ph.y) objJ).f21609a;
        }
        return ph.b2.a(objJ);
    }

    public static final pg.x c(String str) {
        int i10;
        g8.w.h(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.r.f(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i10 = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i11, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i11, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i12 = i11 * 10;
            int i13 = iDigit + i12;
            if (Integer.compareUnsigned(i13, i12) < 0) {
                return null;
            }
            i10++;
            i11 = i13;
        }
        return new pg.x(i11);
    }

    public static final pg.z d(String str) {
        kotlin.jvm.internal.r.e(str, "<this>");
        g8.w.h(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.r.f(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j10 = 10;
        long j11 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j11, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j10);
                if (Long.compareUnsigned(j11, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j12 = j11 * j10;
            long j13 = (iDigit & BodyPartID.bodyIdMax) + j12;
            if (Long.compareUnsigned(j13, j12) < 0) {
                return null;
            }
            i10++;
            j11 = j13;
        }
        return new pg.z(j11);
    }
}
