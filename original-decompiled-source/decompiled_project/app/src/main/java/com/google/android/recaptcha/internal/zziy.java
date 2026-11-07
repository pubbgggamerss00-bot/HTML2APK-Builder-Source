package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import ph.u;
import vg.i;

/* loaded from: classes2.dex */
final class zziy extends i implements p {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzja zzjaVar, zzen zzenVar, tg.e eVar) {
        super(2, eVar);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zziy(this.zzf, this.zzg, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (r9.zzc(r1, r8) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzja zzjaVar;
        zzsc zzscVar;
        zzcg zzcgVar;
        zzja zzjaVar2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zze;
        if (i10 == 0) {
            q.b(obj);
            zzjaVar = this.zzf;
            zzsc zzscVar2 = zzjaVar.zzf;
            if (zzscVar2 == null) {
                zzscVar2 = null;
            }
            zzsc zzscVar3 = this.zzf.zzf;
            if (zzscVar3 == null) {
                zzscVar3 = null;
            }
            zzcg zzcgVar2 = new zzcg(zzscVar3.zzf());
            zzja zzjaVar3 = this.zzf;
            this.zza = zzjaVar;
            this.zzb = zzjaVar;
            this.zzc = zzscVar2;
            this.zzd = zzcgVar2;
            this.zze = 1;
            Object objZzw = zzjaVar3.zzw(this);
            if (objZzw != aVar) {
                zzscVar = zzscVar2;
                obj = objZzw;
                zzcgVar = zzcgVar2;
                zzjaVar2 = zzjaVar;
            }
            return aVar;
        }
        if (i10 != 1) {
            q.b(obj);
            if (i10 != 2) {
                if (i10 == 3) {
                }
                this.zzg.zza();
                return f0.f21461a;
            }
            i.a.a(this.zzf.zzA().hashCode());
            u uVarZzA = this.zzf.zzA();
            this.zze = 3;
            if (uVarZzA.await(this) != aVar) {
            }
            return aVar;
            zzcb zzcbVarZzm = this.zzf.zzm();
            zzje zzjeVar = zzje.zzc;
            this.zze = 4;
        } else {
            zzcgVar = (zzcg) this.zzd;
            zzscVar = (zzsc) this.zzc;
            zzjaVar = (zzja) this.zzb;
            zzjaVar2 = (zzja) this.zza;
            q.b(obj);
        }
        zzjaVar2.zzb = zzjaVar.zzC(zzscVar, zzcgVar, (WebView) obj);
        i.a.a(this.zzf.zzA().hashCode());
        this.zzf.zzh.zzd();
        this.zzf.zzh.zze();
        zzja zzjaVar4 = this.zzf;
        zzsc zzscVar4 = zzjaVar4.zzf;
        if (zzscVar4 == null) {
            zzscVar4 = null;
        }
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        if (zzjaVar4.zzE(zzscVar4, this) != aVar) {
        }
        return aVar;
    }
}
