package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import qg.x;
import vg.i;

/* loaded from: classes2.dex */
final class zzer extends i implements p {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zztx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzesVar, zztx zztxVar, tg.e eVar) {
        super(2, eVar);
        this.zza = zzesVar;
        this.zzb = zztxVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzer(this.zza, this.zzb, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        zztx zztxVar = this.zzb;
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                if (zzesVar.zze != null) {
                    byte[] bArrZzd = zztxVar.zzd();
                    zzej zzejVar = new zzej(zzkh.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzei zzeiVar = zzesVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzejVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzejVar.zzb()));
                    zzeiVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzesVar.zze.zzb() - 500;
                    if (iZzb > 0) {
                        zzesVar.zze.zza(x.W(zzesVar.zze.zzd(), iZzb));
                    }
                    if (zzesVar.zze.zzb() >= 20) {
                        zzesVar.zzg();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f0.f21461a;
    }
}
