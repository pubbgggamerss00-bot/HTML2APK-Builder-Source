package qd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class u0 implements Parcelable.Creator<h0> {
    @Override // android.os.Parcelable.Creator
    public final h0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        boolean zK = false;
        String strF = null;
        String strF2 = null;
        boolean zK2 = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 3) {
                strF2 = qa.b.f(i10, parcel);
            } else if (c10 == 4) {
                zK = qa.b.k(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                zK2 = qa.b.k(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        h0 h0Var = new h0();
        h0Var.f22678a = strF;
        h0Var.f22679b = strF2;
        h0Var.f22680c = zK;
        h0Var.f22681d = zK2;
        h0Var.f22682e = TextUtils.isEmpty(strF2) ? null : Uri.parse(strF2);
        return h0Var;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h0[] newArray(int i10) {
        return new h0[i10];
    }
}
