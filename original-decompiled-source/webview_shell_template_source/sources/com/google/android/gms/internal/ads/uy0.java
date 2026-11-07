package com.google.android.gms.internal.ads;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uy0 implements be1 {
    public final my0 s;

    /* renamed from: t, reason: collision with root package name */
    public final oy0 f9662t;

    public uy0(my0 my0Var, oy0 oy0Var) {
        this.s = my0Var;
        this.f9662t = oy0Var;
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void c(yd1 yd1Var, String str, Throwable th) {
        my0 my0Var = this.s;
        if (((Boolean) zzbe.zzc().a(zn.f11364b6)).booleanValue() && yd1.f10929w == yd1Var && my0Var.a() != 0) {
            long jB = zzv.zzC().b() - my0Var.a();
            synchronized (my0Var) {
                synchronized (my0Var.f7251j) {
                    my0Var.f7247e = jB;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void j(yd1 yd1Var, String str) {
        my0 my0Var = this.s;
        if (((Boolean) zzbe.zzc().a(zn.f11364b6)).booleanValue() && yd1.f10929w == yd1Var && my0Var.a() != 0) {
            long jB = zzv.zzC().b() - my0Var.a();
            synchronized (my0Var) {
                synchronized (my0Var.f7251j) {
                    my0Var.f7247e = jB;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void n(yd1 yd1Var, String str) {
        if (((Boolean) zzbe.zzc().a(zn.f11364b6)).booleanValue()) {
            if (yd1.f10929w == yd1Var) {
                my0 my0Var = this.s;
                long jB = zzv.zzC().b();
                synchronized (my0Var) {
                    synchronized (my0Var.f7250i) {
                        my0Var.f7246d = jB;
                    }
                }
                return;
            }
            if (yd1.P == yd1Var || yd1.f10928v == yd1Var) {
                my0 my0Var2 = this.s;
                long jB2 = zzv.zzC().b();
                synchronized (my0Var2) {
                    synchronized (my0Var2.f7248f) {
                        my0Var2.f7243a = jB2;
                    }
                }
                final oy0 oy0Var = this.f9662t;
                final long jB3 = this.s.b();
                ((jy0) oy0Var.f6799u).a(new td1() { // from class: com.google.android.gms.internal.ads.ny0
                    @Override // com.google.android.gms.internal.ads.td1
                    public final Object zza(Object obj) throws SQLException {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (((zzg) oy0Var.f6798t).zzN()) {
                            return null;
                        }
                        xk xkVarQ = wk.Q();
                        xkVarQ.i();
                        wk wkVar = (wk) xkVarQ.f4126t;
                        long j6 = jB3;
                        wk.M(wkVar, j6);
                        byte[] bArrI = xkVarQ.g().i();
                        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
                        ty0.b(sQLiteDatabase, j6, bArrI);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void f(String str) {
    }
}
