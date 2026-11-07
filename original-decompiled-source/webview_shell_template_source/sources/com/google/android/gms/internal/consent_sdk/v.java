package com.google.android.gms.internal.consent_sdk;

import android.database.Cursor;
import android.os.Handler;
import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v implements z8 {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f11913t;

    public v(y8 y8Var, z zVar) {
        this.s = y8Var;
        this.f11913t = zVar;
    }

    public Long a(String str) {
        v1.g gVar = (v1.g) this.s;
        v1.i iVarA = v1.i.a(1, "SELECT long_value FROM Preference where `key`=?");
        iVarA.f(1, str);
        gVar.b();
        Cursor cursorG = gVar.g(iVarA);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            iVarA.h();
        }
    }

    public void b(r2.c cVar) {
        v1.g gVar = (v1.g) this.s;
        gVar.b();
        gVar.c();
        try {
            ((r2.d) this.f11913t).e(cVar);
            gVar.h();
        } finally {
            gVar.f();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public Object zzb() {
        w wVar = (w) ((y8) this.s).zzb();
        Handler handler = m0.f11819a;
        l2.a(handler);
        return new u(wVar, handler, ((z) this.f11913t).zzb());
    }

    public v(WorkDatabase workDatabase) {
        this.s = workDatabase;
        this.f11913t = new r2.d(workDatabase, 0);
    }
}
