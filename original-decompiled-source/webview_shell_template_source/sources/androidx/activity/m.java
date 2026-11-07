package androidx.activity;

import android.os.Parcel;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.qs0;
import e2.f;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements f.e {
    public static int b(int i6, int i7, int i8, int i9, int i10) {
        return Math.max(((i6 * i7) / i8) + i9, i10);
    }

    public static String c(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.B());
        return sb.toString();
    }

    public static String d(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String e(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static k3.a f(Parcel parcel) {
        k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
        parcel.recycle();
        return aVarR;
    }

    public static void g(int i6, String str, String str2) {
        qs0.f(str2, str + i6);
    }

    @Override // e2.f.e
    public void a(f.d dVar, e2.f fVar) {
        dVar.b(fVar);
    }
}
