package e2;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public final View f12821b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12820a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<f> f12822c = new ArrayList<>();

    @Deprecated
    public m() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f12821b == mVar.f12821b && this.f12820a.equals(mVar.f12820a);
    }

    public final int hashCode() {
        return this.f12820a.hashCode() + (this.f12821b.hashCode() * 31);
    }

    public final String toString() {
        String strB = androidx.camera.core.c.b(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f12821b + "\n", "    values:");
        HashMap map = this.f12820a;
        for (String str : map.keySet()) {
            strB = strB + "    " + str + ": " + map.get(str) + "\n";
        }
        return strB;
    }

    public m(View view) {
        this.f12821b = view;
    }
}
