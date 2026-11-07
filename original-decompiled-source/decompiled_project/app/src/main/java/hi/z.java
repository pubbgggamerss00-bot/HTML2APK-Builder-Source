package hi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class z extends qg.c<j> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final j[] f13120a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f13121b;

    public static final class a {
        public static void a(long j10, g gVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) throws IOException {
            int i13;
            int i14;
            ArrayList arrayList3;
            long j11;
            int i15;
            int i16 = i10;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((j) arrayList4.get(i17)).d() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            j jVar = (j) arrayList.get(i11);
            j jVar2 = (j) arrayList4.get(i12 - 1);
            if (i16 == jVar.d()) {
                int iIntValue = ((Number) arrayList5.get(i11)).intValue();
                int i18 = i11 + 1;
                j jVar3 = (j) arrayList4.get(i18);
                i13 = i18;
                i14 = iIntValue;
                jVar = jVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (jVar.i(i16) == jVar2.i(i16)) {
                int iMin = Math.min(jVar.d(), jVar2.d());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && jVar.i(i20) == jVar2.i(i20); i20++) {
                    i19++;
                }
                long j12 = 4;
                long j13 = (gVar.f13061b / j12) + j10 + 2 + i19 + 1;
                gVar.y0(-i19);
                gVar.y0(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    gVar.y0(jVar.i(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((j) arrayList4.get(i13)).d()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    gVar.y0(((Number) arrayList5.get(i13)).intValue());
                    return;
                } else {
                    g gVar2 = new g();
                    gVar.y0(((int) ((gVar2.f13061b / j12) + j13)) * (-1));
                    a(j13, gVar2, i21, arrayList4, i13, i12, arrayList5);
                    gVar.l0(gVar2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((j) arrayList4.get(i23 - 1)).i(i16) != ((j) arrayList4.get(i23)).i(i16)) {
                    i22++;
                }
            }
            long j14 = 4;
            long j15 = (gVar.f13061b / j14) + j10 + 2 + (i22 * 2);
            gVar.y0(i22);
            gVar.y0(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                int i25 = ((j) arrayList4.get(i24)).i(i16);
                if (i24 == i13 || i25 != ((j) arrayList4.get(i24 - 1)).i(i16)) {
                    gVar.y0(i25 & 255);
                }
            }
            g gVar3 = new g();
            int i26 = i13;
            while (i26 < i12) {
                byte bI = ((j) arrayList4.get(i26)).i(i16);
                int i27 = i26 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i28 = i12;
                        break;
                    } else if (bI != ((j) arrayList4.get(i28)).i(i16)) {
                        break;
                    } else {
                        i28++;
                    }
                }
                if (i27 == i28 && i16 + 1 == ((j) arrayList4.get(i26)).d()) {
                    gVar.y0(((Number) arrayList5.get(i26)).intValue());
                    arrayList3 = arrayList5;
                    j11 = j15;
                    i15 = i28;
                } else {
                    gVar.y0(((int) ((gVar3.f13061b / j14) + j15)) * (-1));
                    arrayList3 = arrayList5;
                    j11 = j15;
                    i15 = i28;
                    a(j11, gVar3, i16 + 1, arrayList, i26, i15, arrayList3);
                    arrayList4 = arrayList;
                }
                j15 = j11;
                i26 = i15;
                arrayList5 = arrayList3;
            }
            gVar.l0(gVar3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static z b(j... jVarArr) throws IOException {
            if (jVarArr.length == 0) {
                return new z(new j[0], new int[]{0, -1});
            }
            ArrayList arrayList = new ArrayList(new qg.k(jVarArr, false));
            qg.t.u(arrayList);
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(-1);
            }
            int length = jVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList2.set(qg.p.g(arrayList, jVarArr[i11]), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((j) arrayList.get(0)).d() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                j prefix = (j) arrayList.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < arrayList.size()) {
                    j jVar = (j) arrayList.get(i15);
                    jVar.getClass();
                    kotlin.jvm.internal.r.e(prefix, "prefix");
                    if (jVar.l(0, prefix, prefix.d())) {
                        if (jVar.d() == prefix.d()) {
                            throw new IllegalArgumentException(("duplicate option: " + jVar).toString());
                        }
                        if (((Number) arrayList2.get(i15)).intValue() > ((Number) arrayList2.get(i13)).intValue()) {
                            arrayList.remove(i15);
                            ((Number) arrayList2.remove(i15)).intValue();
                        } else {
                            i15++;
                        }
                    }
                }
                i13 = i14;
            }
            g gVar = new g();
            a(0L, gVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i16 = (int) (gVar.f13061b / 4);
            int[] iArr = new int[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                iArr[i17] = gVar.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(jVarArr, jVarArr.length);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            return new z((j[]) objArrCopyOf, iArr);
        }
    }

    public z(j[] jVarArr, int[] iArr) {
        this.f13120a = jVarArr;
        this.f13121b = iArr;
    }

    @Override // qg.a
    public final int c() {
        return this.f13120a.length;
    }

    @Override // qg.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f13120a[i10];
    }

    @Override // qg.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // qg.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
