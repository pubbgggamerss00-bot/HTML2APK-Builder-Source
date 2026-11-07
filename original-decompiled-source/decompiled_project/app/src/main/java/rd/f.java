package rd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final g createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListI = null;
        zzahn zzahnVar = null;
        d dVar = null;
        String strF = null;
        String strF2 = null;
        ArrayList arrayListI2 = null;
        ArrayList arrayListG = null;
        String strF3 = null;
        Boolean boolValueOf = null;
        i iVar = null;
        boolean zK = false;
        qd.w0 w0Var = null;
        b0 b0Var = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            ArrayList arrayList = arrayListI;
            switch ((char) i10) {
                case 1:
                    zzahnVar = (zzahn) qa.b.e(parcel, i10, zzahn.CREATOR);
                    break;
                case 2:
                    dVar = (d) qa.b.e(parcel, i10, d.CREATOR);
                    break;
                case 3:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 4:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 5:
                    arrayListI2 = qa.b.i(parcel, i10, d.CREATOR);
                    break;
                case 6:
                    arrayListG = qa.b.g(i10, parcel);
                    break;
                case 7:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case '\b':
                    int iR = qa.b.r(i10, parcel);
                    if (iR != 0) {
                        qa.b.u(parcel, iR, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        boolValueOf = null;
                        break;
                    }
                case '\t':
                    iVar = (i) qa.b.e(parcel, i10, i.CREATOR);
                    break;
                case '\n':
                    zK = qa.b.k(i10, parcel);
                    break;
                case 11:
                    w0Var = (qd.w0) qa.b.e(parcel, i10, qd.w0.CREATOR);
                    break;
                case '\f':
                    b0Var = (b0) qa.b.e(parcel, i10, b0.CREATOR);
                    break;
                case '\r':
                    arrayListI = qa.b.i(parcel, i10, qd.n0.CREATOR);
                    continue;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
            arrayListI = arrayList;
        }
        qa.b.j(iT, parcel);
        g gVar = new g();
        gVar.f23365a = zzahnVar;
        gVar.f23366b = dVar;
        gVar.f23367c = strF;
        gVar.f23368d = strF2;
        gVar.f23369e = arrayListI2;
        gVar.f23370f = arrayListG;
        gVar.f23371g = strF3;
        gVar.f23372h = boolValueOf;
        gVar.f23373j = iVar;
        gVar.f23374k = zK;
        gVar.f23375l = w0Var;
        gVar.f23376m = b0Var;
        gVar.f23377n = arrayListI;
        return gVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i10) {
        return new g[i10];
    }
}
