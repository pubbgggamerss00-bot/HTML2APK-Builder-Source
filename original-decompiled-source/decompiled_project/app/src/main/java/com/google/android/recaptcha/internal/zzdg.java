package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import ph.r2;
import ph.u2;
import vg.i;

/* loaded from: classes2.dex */
final class zzdg extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j10, zzsp zzspVar, tg.e eVar) {
        super(2, eVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j10;
        this.zzf = zzspVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        Exception e10;
        r2 e11;
        zzbd e12;
        ug.a aVar = ug.a.f29706a;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                q.b(obj);
            } catch (zzbd e13) {
                e12 = e13;
                zzbd zzbdVarZzs = this.zzc.zzs(e12, e12);
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (r2 e14) {
                e11 = e14;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e15) {
                e10 = e15;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzZ, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            q.b(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j10 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objB = u2.b(j10, zzdfVar, this);
                if (objB == aVar) {
                    return aVar;
                }
                zzenVar = zzenVarZzf;
                obj = objB;
            } catch (zzbd e16) {
                zzenVar = zzenVarZzf;
                e12 = e16;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e12, e12);
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (r2 e17) {
                zzenVar = zzenVarZzf;
                e11 = e17;
                zzbd zzbdVarZzs22 = this.zzc.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            } catch (Exception e18) {
                zzenVar = zzenVarZzf;
                e10 = e18;
                zzbd zzbdVarZzs32 = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzZ, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs32);
                throw zzbdVarZzs32;
            }
        }
        return (zzsr) obj;
    }
}
