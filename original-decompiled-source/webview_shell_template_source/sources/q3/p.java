package q3;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p extends a0 {
    public final /* synthetic */ Object A;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f14161w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14162x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e0 f14163y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f14164z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(e0 e0Var, String str, Object obj, Object obj2, int i6) {
        super(e0Var, true);
        this.f14161w = i6;
        this.f14163y = e0Var;
        this.f14162x = str;
        this.f14164z = obj;
        this.A = obj2;
    }

    @Override // q3.a0
    public final void a() throws Resources.NotFoundException, ClassNotFoundException {
        boolean z6;
        String str;
        String str2;
        String str3;
        String packageName;
        switch (this.f14161w) {
            case 0:
                try {
                    if (this.f14162x != null) {
                        try {
                            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                            z6 = false;
                        } catch (ClassNotFoundException unused) {
                            z6 = true;
                        }
                    } else {
                        z6 = false;
                    }
                    f dVar = null;
                    if (z6) {
                        str3 = this.f14162x;
                        str2 = "am";
                        str = this.f14163y.f14129a;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    com.google.android.gms.common.internal.l.f((Context) this.f14164z);
                    e0 e0Var = this.f14163y;
                    try {
                        IBinder iBinderB = DynamiteModule.c((Context) this.f14164z, DynamiteModule.f2510c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
                        int i6 = e.s;
                        if (iBinderB != null) {
                            IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                            dVar = iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new d(iBinderB);
                        }
                    } catch (DynamiteModule.a e6) {
                        e0Var.a(e6, true, false);
                    }
                    e0Var.h = dVar;
                    if (this.f14163y.h != null) {
                        int iA = DynamiteModule.a((Context) this.f14164z, "com.google.android.gms.measurement.dynamite");
                        int iD = DynamiteModule.d((Context) this.f14164z, "com.google.android.gms.measurement.dynamite", false);
                        int iMax = Math.max(iA, iD);
                        boolean z7 = iD < iA;
                        long j6 = iMax;
                        Bundle bundle = (Bundle) this.A;
                        Context context = (Context) this.f14164z;
                        try {
                            packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                        } catch (Resources.NotFoundException unused2) {
                            packageName = context.getPackageName();
                        }
                        i iVar = new i(61000L, j6, z7, str, str2, str3, bundle, packageName);
                        f fVar = this.f14163y.h;
                        com.google.android.gms.common.internal.l.f(fVar);
                        fVar.i0(new k3.b((Context) this.f14164z), iVar, this.s);
                        break;
                    } else {
                        Log.w(this.f14163y.f14129a, "Failed to connect to measurement client.");
                        break;
                    }
                } catch (Exception e7) {
                    this.f14163y.a(e7, true, false);
                    return;
                }
            default:
                f fVar2 = this.f14163y.h;
                com.google.android.gms.common.internal.l.f(fVar2);
                fVar2.n1(this.s, this.f14162x, (String) this.f14164z, new k3.b(this.A));
                break;
        }
    }
}
