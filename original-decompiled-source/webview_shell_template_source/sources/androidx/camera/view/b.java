package androidx.camera.view;

import android.app.Application;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.ac1;
import com.google.android.gms.internal.ads.bx;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.de1;
import com.google.android.gms.internal.ads.ie1;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.om0;
import com.google.android.gms.internal.ads.pk0;
import com.google.android.gms.internal.ads.r70;
import com.google.android.gms.internal.ads.tb1;
import com.google.android.gms.internal.ads.vb1;
import com.google.android.gms.internal.ads.y30;
import com.google.android.gms.internal.consent_sdk.f0;
import com.google.android.gms.internal.consent_sdk.g0;
import com.google.android.gms.internal.consent_sdk.l0;
import com.google.android.gms.internal.consent_sdk.l2;
import com.google.android.gms.internal.consent_sdk.m0;
import com.google.android.gms.internal.consent_sdk.y8;
import com.google.android.gms.internal.consent_sdk.z8;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements FutureCallback, r70, om0, z8 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f674t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f675u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f676v;

    public b(ac1 ac1Var, tb1 tb1Var, String str) {
        this.s = 2;
        this.f674t = ac1Var;
        this.f675u = tb1Var;
        this.f676v = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public vb1 a() {
        return (vb1) ((ac1) this.f674t).f2648b.f1103u;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        ((d) this.f676v).f683e = null;
        ArrayList arrayList = (ArrayList) this.f674t;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((CameraInfoInternal) ((CameraInfo) this.f675u)).removeSessionCaptureCallback((CameraCaptureCallback) obj);
        }
        arrayList.clear();
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        ((d) this.f676v).f683e = null;
    }

    @Override // com.google.android.gms.internal.ads.r70, com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        ie1 ie1Var;
        switch (this.s) {
            case 1:
                zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
                synchronized (((cx) this.f676v).f3677a) {
                    try {
                        zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                        cx cxVar = (cx) this.f676v;
                        cxVar.h = 0;
                        bx bxVar = cxVar.f3683g;
                        if (bxVar != null && ((bx) this.f674t) != bxVar) {
                            zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                            ((cx) this.f676v).f3683g.f();
                        }
                        ((cx) this.f676v).f3683g = (bx) this.f674t;
                        if (((Boolean) mp.f7200d.c()).booleanValue() && (ie1Var = ((cx) this.f676v).f3681e) != null) {
                            de1 de1Var = (de1) this.f675u;
                            de1Var.s(true);
                            ie1Var.b(de1Var.zzm());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zze.zza("loadNewJavascriptEngine (success): Lock released");
                return;
            default:
                ((pk0) obj).v((y30) this.f674t, (String) this.f675u, (String) this.f676v);
                return;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public Object zzb() {
        Application application = (Application) ((com.google.android.gms.internal.consent_sdk.f) this.f675u).f11718t;
        l0 l0Var = m0.f11820b;
        l2.a(l0Var);
        return new g0(application, l0Var, (f0) ((y8) this.f676v).zzb(), false);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f676v = obj;
        this.f674t = obj2;
        this.f675u = obj3;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i6, boolean z6) {
        this.s = i6;
        this.f674t = obj;
        this.f675u = obj2;
        this.f676v = obj3;
    }
}
