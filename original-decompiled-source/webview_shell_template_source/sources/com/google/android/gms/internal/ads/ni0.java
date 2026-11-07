package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import android.util.SparseArray;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ni0 implements v9, MediationAdLoadCallback, rn1, zr1, om0, td1, ud1, bb1 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f7447t;

    /* renamed from: u, reason: collision with root package name */
    public Object f7448u;

    public /* synthetic */ ni0(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f7447t = obj;
        this.f7448u = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        switch (this.s) {
            case 7:
                cg0 cg0Var = (cg0) this.f7448u;
                cg0Var.f3569z.a(cg0Var.f3568y.b(cg0Var.f3566w, cg0Var.f3567x, false, (String) this.f7447t, (String) obj, cg0Var.a()));
                break;
            case 9:
                List<c5.a> list = ((yi0) obj).f10996a;
                final r41 r41Var = (r41) this.f7447t;
                final bj0 bj0Var = (bj0) this.f7448u;
                Executor executor = bj0Var.f3203a;
                if (list != null && !list.isEmpty()) {
                    c5.a aVarP = ds1.f4001t;
                    for (final c5.a aVar : list) {
                        aVarP = bs1.p(bs1.k(aVarP, Throwable.class, new zi0(0, r41Var), executor), new pr1() { // from class: com.google.android.gms.internal.ads.aj0
                            @Override // com.google.android.gms.internal.ads.pr1
                            public final c5.a zza(Object obj2) {
                                ti0 ti0Var = (ti0) obj2;
                                if (ti0Var != null) {
                                    r41Var.mo2a(ti0Var);
                                }
                                long jLongValue = ((Long) dq.f3988a.c()).longValue();
                                ScheduledExecutorService scheduledExecutorService = bj0Var.f3204b;
                                return bs1.q(aVar, jLongValue, TimeUnit.MILLISECONDS, scheduledExecutorService);
                            }
                        }, executor);
                    }
                    aVarP.addListener(new as1(0, aVarP, new lo(bj0Var, r41Var, 2, false)), executor);
                    break;
                } else {
                    executor.execute(new yh(7, r41Var));
                    break;
                }
            case 11:
                ((xa0) obj).Z((String) this.f7447t, (yt) this.f7448u);
                break;
            case 12:
                ((kv0) obj).E = true;
                ((dw0) this.f7448u).f4050v.b((String) this.f7447t);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public void c(ex0 ex0Var) {
        ca caVar = (ca) this.f7448u;
        SparseArray sparseArray = caVar.f3486f;
        l42 l42Var = (l42) this.f7447t;
        if (ex0Var.v() == 0 && (ex0Var.v() & 128) != 0) {
            ex0Var.k(6);
            int iO = ex0Var.o() / 4;
            for (int i6 = 0; i6 < iO; i6++) {
                ex0Var.f(0, 4, (byte[]) l42Var.f6576d);
                l42Var.B(0);
                int iW = l42Var.w(16);
                l42Var.D(3);
                if (iW == 0) {
                    l42Var.D(13);
                } else {
                    int iW2 = l42Var.w(13);
                    if (sparseArray.get(iW2) == null) {
                        sparseArray.put(iW2, new w9(new ba(caVar, iW2)));
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    public ArrayList e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7447t;
        v1.i iVarA = v1.i.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            iVarA.e(1);
        } else {
            iVarA.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            iVarA.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.bb1
    public /* bridge */ /* synthetic */ c5.a f(com.google.android.gms.ads.mediation.customevent.a aVar, ab1 ab1Var) {
        return k(aVar, ab1Var, null);
    }

    public ArrayList g(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7447t;
        v1.i iVarA = v1.i.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            iVarA.e(1);
        } else {
            iVarA.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            iVarA.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        switch (this.s) {
            case 7:
                cg0 cg0Var = (cg0) this.f7448u;
                cg0Var.f3569z.a(cg0Var.f3568y.b(cg0Var.f3566w, cg0Var.f3567x, false, (String) this.f7447t, null, cg0Var.a()));
                break;
            case 8:
            case 10:
            default:
                de1 de1Var = (de1) this.f7448u;
                de1Var.g(th);
                de1Var.s(false);
                ((he1) this.f7447t).a(de1Var);
                break;
            case 9:
                ((r41) this.f7447t).j(th);
                i70.f5591f.execute(new x(9, (bj0) this.f7448u));
                break;
            case 11:
            case 12:
                break;
        }
    }

    public synchronized c5.a k(com.google.android.gms.ads.mediation.customevent.a aVar, ab1 ab1Var, gk0 gk0Var) {
        r30 r30Var;
        this.f7448u = gk0Var;
        if (gk0Var == null || (r30Var = (r30) aVar.f2372t) == null) {
            return ((ej0) this.f7447t).l(aVar, ab1Var, gk0Var);
        }
        fj0 fj0VarZzb = gk0Var.zzb();
        return fj0VarZzb.a(fj0VarZzb.c(bs1.m(r30Var)));
    }

    public void m(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", (String) this.f7448u);
            xa0 xa0Var = (xa0) this.f7447t;
            if (xa0Var != null) {
                xa0Var.j("onError", jSONObjectPut);
            }
        } catch (JSONException e6) {
            zzo.zzh("Error occurred while dispatching error event.", e6);
        }
    }

    public void n(int i6, int i7, int i8, int i9, float f6, int i10) throws JSONException {
        try {
            ((xa0) this.f7447t).j("onScreenInfoChanged", new JSONObject().put("width", i6).put("height", i7).put("maxSizeWidth", i8).put("maxSizeHeight", i9).put("density", f6).put("rotation", i10));
        } catch (JSONException e6) {
            zzo.zzh("Error occurred while obtaining screen information.", e6);
        }
    }

    public void o(int i6, int i7, int i8, int i9) throws JSONException {
        try {
            ((xa0) this.f7447t).j("onSizeChanged", new JSONObject().put("x", i6).put("y", i7).put("width", i8).put("height", i9));
        } catch (JSONException e6) {
            zzo.zzh("Error occurred while dispatching size change.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((xz) this.f7447t).zzf(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        xz xzVar = (xz) this.f7447t;
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        if (unifiedNativeAdMapper != null) {
            try {
                xzVar.q0(new lz(unifiedNativeAdMapper));
            } catch (RemoteException e6) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            }
            return new m00((my) this.f7448u);
        }
        zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            xzVar.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
            return null;
        }
    }

    public void p(String str) throws JSONException {
        try {
            ((xa0) this.f7447t).j("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e6) {
            zzo.zzh("Error occurred while dispatching state change.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.rn1
    public lo1 zza() {
        ja0 ja0Var = (ja0) this.f7447t;
        lo1 lo1VarZza = ((rn1) this.f7448u).zza();
        dh0 dh0Var = new dh0(10, ja0Var);
        return new da0(ja0Var.f5988u, lo1VarZza, ja0Var.H, ja0Var.I, ja0Var, dh0Var);
    }

    @Override // com.google.android.gms.internal.ads.bb1
    public Object zzd() {
        gk0 gk0Var;
        synchronized (this) {
            gk0Var = (gk0) this.f7448u;
        }
        return gk0Var;
    }

    public ni0(ca caVar) {
        this.s = 2;
        this.f7448u = caVar;
        this.f7447t = new l42(4, new byte[4]);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object zza(Object obj) {
        dz0 dz0Var = (dz0) this.f7447t;
        fz0 fz0Var = (fz0) this.f7448u;
        dz0Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(fz0Var.f4826a));
        contentValues.put("gws_query_id", fz0Var.f4827b);
        contentValues.put("url", fz0Var.f4828c);
        contentValues.put("event_state", Integer.valueOf(fz0Var.f4829d - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        zzv.zzq();
        Context context = dz0Var.s;
        zzbr zzbrVarZzA = zzs.zzA(context);
        if (zzbrVarZzA != null) {
            try {
                zzbrVarZzA.zze(new k3.b(context));
            } catch (RemoteException e6) {
                zze.zzb("Failed to schedule offline ping sender.", e6);
            }
        }
        return null;
    }

    public ni0(ej0 ej0Var) {
        this.s = 15;
        this.f7447t = ej0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    public /* synthetic */ ni0(Object obj, Object obj2, int i6, boolean z6) {
        this.s = i6;
        this.f7447t = obj2;
        this.f7448u = obj;
    }

    public ni0(cp1 cp1Var, int[] iArr) {
        this.s = 16;
        this.f7447t = bo1.l(cp1Var);
        this.f7448u = iArr;
    }

    public ni0(WorkDatabase_Impl workDatabase_Impl, int i6) {
        this.s = i6;
        switch (i6) {
            case 19:
                this.f7447t = workDatabase_Impl;
                this.f7448u = new r2.b(workDatabase_Impl, 1);
                break;
            case 20:
                this.f7447t = workDatabase_Impl;
                this.f7448u = new r2.b(workDatabase_Impl, 2);
                break;
            default:
                this.f7447t = workDatabase_Impl;
                this.f7448u = new r2.b(workDatabase_Impl, 0);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ud1
    /* renamed from: zza */
    public void mo5zza() {
        s31 s31Var = (s31) this.f7447t;
        s31Var.f8781c.F((po) this.f7448u);
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        ((bn0) obj).a((String) this.f7447t, (String) this.f7448u);
    }

    private final void h(Throwable th) {
    }

    private final void i(Throwable th) {
    }

    private final void l(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.v9
    public void b(m11 m11Var, z0 z0Var, ea eaVar) {
    }
}
