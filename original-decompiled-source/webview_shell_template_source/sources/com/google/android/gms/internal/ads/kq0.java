package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kq0 implements np0 {

    /* renamed from: a, reason: collision with root package name */
    public final ty f6472a;

    /* renamed from: b, reason: collision with root package name */
    public final yk0 f6473b;

    /* renamed from: c, reason: collision with root package name */
    public final nk0 f6474c;

    /* renamed from: d, reason: collision with root package name */
    public final nn0 f6475d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f6476e;

    /* renamed from: f, reason: collision with root package name */
    public final tb1 f6477f;

    /* renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f6478g;
    public final ec1 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6479i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6480j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6481k = true;

    /* renamed from: l, reason: collision with root package name */
    public final py f6482l;

    /* renamed from: m, reason: collision with root package name */
    public final qy f6483m;

    public kq0(py pyVar, qy qyVar, ty tyVar, yk0 yk0Var, nk0 nk0Var, nn0 nn0Var, Context context, tb1 tb1Var, VersionInfoParcel versionInfoParcel, ec1 ec1Var) {
        this.f6482l = pyVar;
        this.f6483m = qyVar;
        this.f6472a = tyVar;
        this.f6473b = yk0Var;
        this.f6474c = nk0Var;
        this.f6475d = nn0Var;
        this.f6476e = context;
        this.f6477f = tb1Var;
        this.f6478g = versionInfoParcel;
        this.h = ec1Var;
    }

    public static final HashMap t(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void a(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f6479i) {
                this.f6479i = zzv.zzt().zzn(this.f6476e, this.f6478g.afmaVersion, this.f6477f.C.toString(), this.h.f4211f);
            }
            if (this.f6481k) {
                ty tyVar = this.f6472a;
                yk0 yk0Var = this.f6473b;
                if (tyVar != null && !tyVar.zzB()) {
                    tyVar.zzx();
                    yk0Var.zza();
                    return;
                }
                py pyVar = this.f6482l;
                if (pyVar != null) {
                    Parcel parcelZzcZ = pyVar.zzcZ(13, pyVar.zza());
                    boolean zF = th.f(parcelZzcZ);
                    parcelZzcZ.recycle();
                    if (!zF) {
                        pyVar.zzda(10, pyVar.zza());
                        yk0Var.zza();
                        return;
                    }
                }
                qy qyVar = this.f6483m;
                if (qyVar != null) {
                    Parcel parcelZzcZ2 = qyVar.zzcZ(11, qyVar.zza());
                    boolean zF2 = th.f(parcelZzcZ2);
                    parcelZzcZ2.recycle();
                    if (zF2) {
                        return;
                    }
                    qyVar.zzda(8, qyVar.zza());
                    yk0Var.zza();
                }
            }
        } catch (RemoteException e6) {
            zzo.zzk("Failed to call recordImpression", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void c() {
        this.f6480j = true;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final boolean d(Bundle bundle) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[Catch: RemoteException -> 0x0036, JSONException -> 0x0054, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0054, blocks: (B:46:0x00bb, B:48:0x00d3), top: B:68:0x00bb }] */
    @Override // com.google.android.gms.internal.ads.np0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) throws SecurityException {
        Object obj;
        int size;
        int i6;
        k3.a aVarZzn;
        try {
            k3.b bVar = new k3.b(view);
            JSONObject jSONObject = this.f6477f.f9189j0;
            boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.F1)).booleanValue();
            ty tyVar = this.f6472a;
            qy qyVar = this.f6483m;
            py pyVar = this.f6482l;
            boolean z6 = true;
            if (zBooleanValue && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) zzbe.zzc().a(zn.G1)).booleanValue() && next.equals("3010")) {
                                Object objI1 = null;
                                if (tyVar != null) {
                                    try {
                                        aVarZzn = tyVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    aVarZzn = pyVar != null ? pyVar.n() : qyVar != null ? qyVar.n() : null;
                                }
                                if (aVarZzn != null) {
                                    objI1 = k3.b.i1(aVarZzn);
                                }
                                if (objI1 != null) {
                                    cls = objI1.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    zzbs.zzc(jSONArrayOptJSONArray, arrayList);
                                    zzv.zzq();
                                    ClassLoader classLoader = this.f6476e.getClassLoader();
                                    size = arrayList.size();
                                    i6 = 0;
                                    while (i6 < size) {
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    zzbs.zzc(jSONArrayOptJSONArray, arrayList2);
                                    zzv.zzq();
                                    ClassLoader classLoader2 = this.f6476e.getClassLoader();
                                    size = arrayList2.size();
                                    i6 = 0;
                                    while (i6 < size) {
                                        Object obj2 = arrayList2.get(i6);
                                        i6++;
                                        if (Class.forName((String) obj2, false, classLoader2).isAssignableFrom(cls)) {
                                            break;
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z6 = false;
                        break;
                    }
                }
            }
            this.f6481k = z6;
            HashMap mapT = t(map);
            HashMap mapT2 = t(map2);
            if (tyVar != null) {
                tyVar.T0(bVar, new k3.b(mapT), new k3.b(mapT2));
                return;
            }
            if (pyVar != null) {
                k3.b bVar2 = new k3.b(mapT);
                k3.b bVar3 = new k3.b(mapT2);
                Parcel parcelZza = pyVar.zza();
                th.e(parcelZza, bVar);
                th.e(parcelZza, bVar2);
                th.e(parcelZza, bVar3);
                pyVar.zzda(22, parcelZza);
                Parcel parcelZza2 = pyVar.zza();
                th.e(parcelZza2, bVar);
                pyVar.zzda(12, parcelZza2);
                return;
            }
            if (qyVar != null) {
                k3.b bVar4 = new k3.b(mapT);
                k3.b bVar5 = new k3.b(mapT2);
                Parcel parcelZza3 = qyVar.zza();
                th.e(parcelZza3, bVar);
                th.e(parcelZza3, bVar4);
                th.e(parcelZza3, bVar5);
                qyVar.zzda(22, parcelZza3);
                Parcel parcelZza4 = qyVar.zza();
                th.e(parcelZza4, bVar);
                qyVar.zzda(10, parcelZza4);
            }
        } catch (RemoteException e6) {
            zzo.zzk("Failed to call trackView", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void f(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType) {
        if (this.f6480j && this.f6477f.L) {
            return;
        }
        s(view);
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void h(View view) {
        try {
            k3.b bVar = new k3.b(view);
            ty tyVar = this.f6472a;
            if (tyVar != null) {
                tyVar.b0(bVar);
                return;
            }
            py pyVar = this.f6482l;
            if (pyVar != null) {
                Parcel parcelZza = pyVar.zza();
                th.e(parcelZza, bVar);
                pyVar.zzda(16, parcelZza);
            } else {
                qy qyVar = this.f6483m;
                if (qyVar != null) {
                    Parcel parcelZza2 = qyVar.zza();
                    th.e(parcelZza2, bVar);
                    qyVar.zzda(14, parcelZza2);
                }
            }
        } catch (RemoteException e6) {
            zzo.zzk("Failed to call untrackView", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void j(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType, int i6) {
        if (!this.f6480j) {
            zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f6477f.L) {
            s(view2);
        } else {
            zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void n(zzdd zzddVar) {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final boolean p() {
        return this.f6477f.L;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void q(zzdh zzdhVar) {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final JSONObject r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final void s(View view) {
        ty tyVar = this.f6472a;
        nn0 nn0Var = this.f6475d;
        nk0 nk0Var = this.f6474c;
        if (tyVar != null) {
            try {
                if (!tyVar.zzA()) {
                    tyVar.H1(new k3.b(view));
                    nk0Var.onAdClicked();
                    if (((Boolean) zzbe.zzc().a(zn.Ea)).booleanValue()) {
                        nn0Var.O();
                        return;
                    }
                    return;
                }
            } catch (RemoteException e6) {
                zzo.zzk("Failed to call handleClick", e6);
                return;
            }
        }
        py pyVar = this.f6482l;
        if (pyVar != null) {
            Parcel parcelZzcZ = pyVar.zzcZ(14, pyVar.zza());
            boolean zF = th.f(parcelZzcZ);
            parcelZzcZ.recycle();
            if (!zF) {
                k3.b bVar = new k3.b(view);
                Parcel parcelZza = pyVar.zza();
                th.e(parcelZza, bVar);
                pyVar.zzda(11, parcelZza);
                nk0Var.onAdClicked();
                if (((Boolean) zzbe.zzc().a(zn.Ea)).booleanValue()) {
                    nn0Var.O();
                    return;
                }
                return;
            }
        }
        qy qyVar = this.f6483m;
        if (qyVar != null) {
            Parcel parcelZzcZ2 = qyVar.zzcZ(12, qyVar.zza());
            boolean zF2 = th.f(parcelZzcZ2);
            parcelZzcZ2.recycle();
            if (zF2) {
                return;
            }
            k3.b bVar2 = new k3.b(view);
            Parcel parcelZza2 = qyVar.zza();
            th.e(parcelZza2, bVar2);
            qyVar.zzda(9, parcelZza2);
            nk0Var.onAdClicked();
            if (((Boolean) zzbe.zzc().a(zn.Ea)).booleanValue()) {
                nn0Var.O();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final boolean zzB() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void g(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void i(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void k(String str) {
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void l(ss ssVar) {
    }

    @Override // com.google.android.gms.internal.ads.np0
    public final void o(MotionEvent motionEvent, View view) {
    }
}
