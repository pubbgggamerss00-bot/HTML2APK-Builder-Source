package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.SparseBooleanArray;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class vy0 implements td1 {
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f9962t;

    public /* synthetic */ vy0(wy0 wy0Var, boolean z6) {
        this.f9962t = wy0Var;
        this.s = z6;
    }

    public void a(int i6) {
        y5.r(!this.s);
        ((SparseBooleanArray) this.f9962t).append(i6, true);
    }

    public dj2 b() {
        y5.r(!this.s);
        this.s = true;
        return new dj2((SparseBooleanArray) this.f9962t);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object zza(Object obj) {
        long j6;
        wy0 wy0Var = (wy0) this.f9962t;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.s) {
            wy0Var.f10314b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(wk.S(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (u52 e6) {
                zzo.zzg("Unable to deserialize proto from offline signals database:");
                zzo.zzg(e6.getMessage());
            }
        }
        cursorQuery.close();
        Context context = wy0Var.f10314b;
        yk ykVarJ = bl.J();
        String packageName = context.getPackageName();
        ykVarJ.i();
        bl.C((bl) ykVarJ.f4126t, packageName);
        String str = Build.MODEL;
        ykVarJ.i();
        bl.E((bl) ykVarJ.f4126t);
        int iA = ty0.a(sQLiteDatabase, 0);
        ykVarJ.i();
        bl.F((bl) ykVarJ.f4126t, iA);
        ykVarJ.i();
        bl.B((bl) ykVarJ.f4126t, arrayList);
        int iA2 = ty0.a(sQLiteDatabase, 1);
        ykVarJ.i();
        bl.H((bl) ykVarJ.f4126t, iA2);
        int iA3 = ty0.a(sQLiteDatabase, 3);
        ykVarJ.i();
        bl.D((bl) ykVarJ.f4126t, iA3);
        long jA = zzv.zzC().a();
        ykVarJ.i();
        bl.I((bl) ykVarJ.f4126t, jA);
        Cursor cursorC = ty0.c(sQLiteDatabase, 2);
        if (cursorC.getCount() > 0) {
            cursorC.moveToNext();
            j6 = cursorC.getLong(cursorC.getColumnIndexOrThrow("value"));
        } else {
            j6 = 0;
        }
        cursorC.close();
        ykVarJ.i();
        bl.G((bl) ykVarJ.f4126t, j6);
        bl blVarG = ykVarJ.g();
        int size = arrayList.size();
        long jO = 0;
        for (int i6 = 0; i6 < size; i6++) {
            wk wkVar = (wk) arrayList.get(i6);
            if (wkVar.P() == bn.ENUM_TRUE && wkVar.O() > jO) {
                jO = wkVar.O();
            }
        }
        if (jO != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jO));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        kk kkVar = wy0Var.f10313a;
        synchronized (kkVar) {
            if (kkVar.f6441c) {
                try {
                    cn cnVar = kkVar.f6440b;
                    cnVar.i();
                    dn.G((dn) cnVar.f4126t, blVarG);
                } catch (NullPointerException e7) {
                    zzv.zzp().h("AdMobClearcutLogger.modify", e7);
                }
            }
        }
        VersionInfoParcel versionInfoParcel = wy0Var.f10315c;
        kl klVarE = ll.E();
        int i7 = versionInfoParcel.buddyApkVersion;
        klVarE.i();
        ll.B((ll) klVarE.f4126t, i7);
        int i8 = wy0Var.f10315c.clientJarVersion;
        klVarE.i();
        ll.D((ll) klVarE.f4126t, i8);
        int i9 = true != wy0Var.f10315c.isClientJar ? 2 : 0;
        klVarE.i();
        ll.C((ll) klVarE.f4126t, i9);
        ll llVarG = klVarE.g();
        kk kkVar2 = wy0Var.f10313a;
        synchronized (kkVar2) {
            if (kkVar2.f6441c) {
                try {
                    cn cnVar2 = kkVar2.f6440b;
                    xm xmVarR = ((dn) cnVar2.f4126t).L().r();
                    xmVarR.i();
                    ym.C((ym) xmVarR.f4126t, llVarG);
                    cnVar2.i();
                    dn.F((dn) cnVar2.f4126t, xmVarR.g());
                } catch (NullPointerException e8) {
                    zzv.zzp().h("AdMobClearcutLogger.modify", e8);
                }
            }
        }
        wy0Var.f10313a.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ty0.e(sQLiteDatabase, "failed_requests");
        ty0.e(sQLiteDatabase, "total_requests");
        ty0.e(sQLiteDatabase, "completed_requests");
        return null;
    }

    public vy0() {
        this.f9962t = new SparseBooleanArray();
    }
}
