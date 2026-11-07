package com.google.android.recaptcha.internal;

import a9.c2;
import eh.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import pg.f0;
import pg.p;
import pg.q;
import ph.h;
import ph.i0;
import ph.p0;
import vg.i;

/* loaded from: classes2.dex */
final class zzh extends i implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j10, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, eVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVarZzf;
        zzen zzenVar;
        ug.a aVar = ug.a.f29706a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            q.b(obj);
        } else {
            q.b(obj);
            i0 i0Var = (i0) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(h.a(i0Var, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3));
                }
            }
            p0[] p0VarArr = (p0[]) arrayList.toArray(new p0[0]);
            p0[] p0VarArr2 = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
            this.zze = zzenVarZzf;
            this.zza = 1;
            obj = c2.a(p0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar = zzenVarZzf;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((pg.p) it.next()).f21471a;
            if (!(obj2 instanceof p.a)) {
                zzshVarZzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
