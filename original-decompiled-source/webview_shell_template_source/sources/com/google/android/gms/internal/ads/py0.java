package com.google.android.gms.internal.ads;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class py0 implements td1, jm0 {
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f8176t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f8177u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f8178v;

    /* renamed from: w, reason: collision with root package name */
    public final Serializable f8179w;

    public /* synthetic */ py0(qy0 qy0Var, boolean z6, ArrayList arrayList, tk tkVar, al alVar) {
        this.f8176t = qy0Var;
        this.s = z6;
        this.f8177u = arrayList;
        this.f8178v = tkVar;
        this.f8179w = alVar;
    }

    public static py0 a(gg1 gg1Var, ig1 ig1Var, mg1 mg1Var, mg1 mg1Var2, boolean z6) {
        if (mg1Var == mg1.f7152v) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        gg1 gg1Var2 = gg1.f5039t;
        mg1 mg1Var3 = mg1.f7150t;
        if (gg1Var == gg1Var2 && mg1Var == mg1Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (ig1Var == ig1.f5749t && mg1Var == mg1Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new py0(gg1Var, ig1Var, mg1Var, mg1Var2, z6);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object zza(Object obj) throws SQLException {
        long j6;
        long j7;
        int i6;
        qy0 qy0Var = (qy0) this.f8176t;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzg) qy0Var.f8480t.f6798t).zzN()) {
            return null;
        }
        al alVar = (al) this.f8179w;
        tk tkVar = (tk) this.f8178v;
        ArrayList arrayList = (ArrayList) this.f8177u;
        boolean z6 = this.s;
        ry0 ry0Var = qy0Var.f8480t;
        SparseArray sparseArray = ry0.A;
        xk xkVarQ = wk.Q();
        xkVarQ.i();
        wk.B((wk) xkVarQ.f4126t, arrayList);
        bn bnVar = Settings.Global.getInt(ry0Var.f8734v.getContentResolver(), "airplane_mode_on", 0) != 0 ? bn.ENUM_TRUE : bn.ENUM_FALSE;
        xkVarQ.i();
        wk.C((wk) xkVarQ.f4126t, bnVar);
        bn bnVarZzg = zzv.zzr().zzg(ry0Var.f8734v, ry0Var.f8736x);
        xkVarQ.i();
        wk.D((wk) xkVarQ.f4126t, bnVarZzg);
        my0 my0Var = ry0Var.f8737y;
        synchronized (my0Var.h) {
            j6 = my0Var.f7245c;
        }
        xkVarQ.i();
        wk.J((wk) xkVarQ.f4126t, j6);
        my0 my0Var2 = ry0Var.f8737y;
        synchronized (my0Var2) {
            synchronized (my0Var2.f7251j) {
                j7 = my0Var2.f7247e;
            }
        }
        xkVarQ.i();
        wk.I((wk) xkVarQ.f4126t, j7);
        my0 my0Var3 = ry0Var.f8737y;
        synchronized (my0Var3.f7249g) {
            i6 = my0Var3.f7244b;
        }
        xkVarQ.i();
        wk.E((wk) xkVarQ.f4126t, i6);
        xkVarQ.i();
        wk.F((wk) xkVarQ.f4126t, alVar);
        xkVarQ.i();
        wk.G((wk) xkVarQ.f4126t, tkVar);
        bn bnVar2 = ry0Var.f8738z;
        xkVarQ.i();
        wk.H((wk) xkVarQ.f4126t, bnVar2);
        bn bnVar3 = z6 ? bn.ENUM_TRUE : bn.ENUM_FALSE;
        xkVarQ.i();
        wk.K((wk) xkVarQ.f4126t, bnVar3);
        long jB = ry0Var.f8737y.b();
        xkVarQ.i();
        wk.M((wk) xkVarQ.f4126t, jB);
        long jA = zzv.zzC().a();
        xkVarQ.i();
        wk.L((wk) xkVarQ.f4126t, jA);
        bn bnVar4 = Settings.Global.getInt(ry0Var.f8734v.getContentResolver(), "wifi_on", 0) != 0 ? bn.ENUM_TRUE : bn.ENUM_FALSE;
        xkVarQ.i();
        wk.N((wk) xkVarQ.f4126t, bnVar4);
        byte[] bArrI = xkVarQ.g().i();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z6) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        ty0.b(sQLiteDatabase, qy0Var.f8480t.f8737y.b(), bArrI);
        return null;
    }

    public /* synthetic */ py0(sh2 sh2Var, fh2 fh2Var, lh2 lh2Var, IOException iOException, boolean z6) {
        this.f8176t = sh2Var;
        this.f8177u = fh2Var;
        this.f8178v = lh2Var;
        this.f8179w = iOException;
        this.s = z6;
    }

    public py0(gg1 gg1Var, ig1 ig1Var, mg1 mg1Var, mg1 mg1Var2, boolean z6) {
        this.f8178v = gg1Var;
        this.f8179w = ig1Var;
        this.f8176t = mg1Var;
        this.f8177u = mg1Var2;
        this.s = z6;
    }

    @Override // com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        ((th2) obj).h(0, ((sh2) this.f8176t).f8938a, (fh2) this.f8177u, (lh2) this.f8178v, (IOException) this.f8179w, this.s);
    }
}
