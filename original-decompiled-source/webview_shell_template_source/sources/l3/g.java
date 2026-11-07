package l3;

import android.os.Parcel;
import androidx.activity.m;
import p3.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends p3.a {
    public final k3.a e2(k3.b bVar, String str, int i6) {
        Parcel parcelR = r();
        j.b(parcelR, bVar);
        parcelR.writeString(str);
        parcelR.writeInt(i6);
        return m.f(n(4, parcelR));
    }

    public final k3.a f2(k3.b bVar, String str, int i6, k3.b bVar2) {
        Parcel parcelR = r();
        j.b(parcelR, bVar);
        parcelR.writeString(str);
        parcelR.writeInt(i6);
        j.b(parcelR, bVar2);
        return m.f(n(8, parcelR));
    }

    public final k3.a i1(k3.b bVar, String str, int i6) {
        Parcel parcelR = r();
        j.b(parcelR, bVar);
        parcelR.writeString(str);
        parcelR.writeInt(i6);
        return m.f(n(2, parcelR));
    }
}
