package t2;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    public static final class a extends kotlin.jvm.internal.s implements eh.l<o, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27862a = new a(1);

        @Override // eh.l
        public final CharSequence invoke(o oVar) {
            o oVar2 = oVar;
            StringBuilder sb = new StringBuilder("[");
            sb.append(oVar2.f27865b);
            sb.append(", ");
            return b.b.a(sb, oVar2.f27866c, ')');
        }
    }

    public static final int a(int i10, List list) {
        int i11;
        int i12 = ((o) qg.x.J(list)).f27866c;
        if (i10 > ((o) qg.x.J(list)).f27866c) {
            z2.a.a("Index " + i10 + " should be less or equal than last line's end " + i12);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + size) >>> 1;
            o oVar = (o) list.get(i11);
            char c10 = oVar.f27865b > i10 ? (char) 1 : oVar.f27866c <= i10 ? (char) 65535 : (char) 0;
            if (c10 >= 0) {
                if (c10 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            return i11;
        }
        StringBuilder sbB = p.i0.b(i11, "Found paragraph index ", " should be in range [0, ");
        sbB.append(list.size());
        sbB.append(").\nDebug info: index=");
        sbB.append(i10);
        sbB.append(", paragraphs=[");
        sbB.append(h3.a.a(list, null, a.f27862a, 31));
        sbB.append(']');
        z2.a.a(sbB.toString());
        return i11;
    }

    public static final int b(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            o oVar = (o) list.get(i12);
            char c10 = oVar.f27867d > i10 ? (char) 1 : oVar.f27868e <= i10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i11 = i12 + 1;
            } else {
                if (c10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int c(ArrayList arrayList, float f10) {
        if (f10 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0;
        }
        if (f10 >= ((o) qg.x.J(arrayList)).f27870g) {
            return qg.p.i(arrayList);
        }
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            o oVar = (o) arrayList.get(i11);
            char c10 = oVar.f27869f > f10 ? (char) 1 : oVar.f27870g <= f10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else {
                if (c10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void d(ArrayList arrayList, long j10, eh.l lVar) {
        int size = arrayList.size();
        for (int iA = a(j0.e(j10), arrayList); iA < size; iA++) {
            o oVar = (o) arrayList.get(iA);
            if (oVar.f27865b >= j0.d(j10)) {
                return;
            }
            if (oVar.f27865b != oVar.f27866c) {
                lVar.invoke(oVar);
            }
        }
    }
}
