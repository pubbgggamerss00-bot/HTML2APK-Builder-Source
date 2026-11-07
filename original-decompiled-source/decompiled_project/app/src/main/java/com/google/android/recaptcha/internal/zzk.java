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
final class zzk extends i implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j10, zzsc zzscVar, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j10;
        this.zze = zzscVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, eVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        Object objA;
        ug.a aVar = ug.a.f29706a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            q.b(obj);
        } else {
            q.b(obj);
            i0 i0Var = (i0) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(h.a(i0Var, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3));
            }
            p0[] p0VarArr = (p0[]) arrayList.toArray(new p0[0]);
            p0[] p0VarArr2 = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            obj = c2.a(p0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((pg.p) it2.next()).f21471a instanceof p.a)) {
                    zzenVar.zza();
                    objA = f0.f21461a;
                    break;
                }
            }
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            objA = q.a(zzbdVar);
        } else {
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            objA = q.a(zzbdVar2);
        }
        return new pg.p(objA);
    }
}
