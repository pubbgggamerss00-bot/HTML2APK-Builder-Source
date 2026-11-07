package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class p1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        r rVar = null;
        e2 e2Var = null;
        e0 e0Var = null;
        k2 k2Var = null;
        k0 k0Var = null;
        m0 m0Var = null;
        g2 g2Var = null;
        p0 p0Var = null;
        s sVar = null;
        t0 t0Var = null;
        e1 e1Var = null;
        r0 r0Var = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    rVar = (r) qa.b.e(parcel, i10, r.CREATOR);
                    break;
                case 3:
                    e2Var = (e2) qa.b.e(parcel, i10, e2.CREATOR);
                    break;
                case 4:
                    e0Var = (e0) qa.b.e(parcel, i10, e0.CREATOR);
                    break;
                case 5:
                    k2Var = (k2) qa.b.e(parcel, i10, k2.CREATOR);
                    break;
                case 6:
                    k0Var = (k0) qa.b.e(parcel, i10, k0.CREATOR);
                    break;
                case 7:
                    m0Var = (m0) qa.b.e(parcel, i10, m0.CREATOR);
                    break;
                case '\b':
                    g2Var = (g2) qa.b.e(parcel, i10, g2.CREATOR);
                    break;
                case '\t':
                    p0Var = (p0) qa.b.e(parcel, i10, p0.CREATOR);
                    break;
                case '\n':
                    sVar = (s) qa.b.e(parcel, i10, s.CREATOR);
                    break;
                case 11:
                    t0Var = (t0) qa.b.e(parcel, i10, t0.CREATOR);
                    break;
                case '\f':
                    e1Var = (e1) qa.b.e(parcel, i10, e1.CREATOR);
                    break;
                case '\r':
                    r0Var = (r0) qa.b.e(parcel, i10, r0.CREATOR);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new d(rVar, e2Var, e0Var, k2Var, k0Var, m0Var, g2Var, p0Var, sVar, t0Var, e1Var, r0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
