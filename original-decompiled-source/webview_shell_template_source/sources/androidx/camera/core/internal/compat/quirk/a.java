package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.Quirks;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements t0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f567a;

    public /* synthetic */ a(int i6) {
        this.f567a = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // t0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        boolean z6;
        QuirkSettings quirkSettings = (QuirkSettings) obj;
        switch (this.f567a) {
            case 0:
                DeviceQuirks.lambda$static$0(quirkSettings);
                break;
            default:
                ArrayList arrayList = new ArrayList();
                boolean z7 = false;
                if (Build.VERSION.SDK_INT < 33) {
                    String str = Build.MANUFACTURER;
                    if ("SAMSUNG".equalsIgnoreCase(str)) {
                        String str2 = Build.DEVICE;
                        if (!"F2Q".equalsIgnoreCase(str2) && !"Q2Q".equalsIgnoreCase(str2)) {
                            if ((!"OPPO".equalsIgnoreCase(str) || !"OP4E75L1".equalsIgnoreCase(Build.DEVICE)) && (!"LENOVO".equalsIgnoreCase(str) || !"Q706F".equalsIgnoreCase(Build.DEVICE))) {
                                z6 = false;
                            }
                        }
                        z6 = true;
                    }
                }
                if (quirkSettings.shouldEnableQuirk(SurfaceViewStretchedQuirk.class, z6)) {
                    arrayList.add(new SurfaceViewStretchedQuirk());
                }
                if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL)) {
                    z7 = true;
                }
                if (quirkSettings.shouldEnableQuirk(SurfaceViewNotCroppedByParentQuirk.class, z7)) {
                    arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                u.a.f14444a = new Quirks(arrayList);
                Logger.d("DeviceQuirks", "view DeviceQuirks = " + Quirks.toString(u.a.f14444a));
                break;
        }
    }
}
