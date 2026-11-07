package j3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import i3.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13494a;

    public c(Context context) {
        this.f13494a = context;
    }

    public final ApplicationInfo a(int i6, String str) {
        return this.f13494a.getPackageManager().getApplicationInfo(str, i6);
    }

    public final PackageInfo b(int i6, String str) {
        return this.f13494a.getPackageManager().getPackageInfo(str, i6);
    }

    public final boolean c() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f13494a;
        if (callingUid == iMyUid) {
            return b.b(context);
        }
        if (!g.a() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
